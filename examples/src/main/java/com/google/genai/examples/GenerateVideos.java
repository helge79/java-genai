/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Usage:
 *
 * <p>1a. If you are using Vertex AI, setup ADC to get credentials:
 * https://cloud.google.com/docs/authentication/provide-credentials-adc#google-idp
 *
 * <p>Then set Project, Location, and USE_VERTEXAI flag as environment variables:
 *
 * <p>export GOOGLE_CLOUD_PROJECT=YOUR_PROJECT
 *
 * <p>export GOOGLE_CLOUD_LOCATION=YOUR_LOCATION
 *
 * <p>export GOOGLE_GENAI_USE_VERTEXAI=true
 *
 * <p>1b. If you are using Gemini Developer API, set an API key environment variable. You can find a
 * list of available API keys here: https://aistudio.google.com/app/apikey
 *
 * <p>export GOOGLE_API_KEY=YOUR_API_KEY
 *
 * <p>2. Compile the java package and run the sample code.
 *
 * <p>mvn clean compile exec:java -Dexec.mainClass="com.google.genai.examples.GenerateVideos"
 * -Dexec.args="YOUR_MODEL_ID"
 */
package com.google.genai.examples;

import com.google.genai.Client;
import com.google.genai.errors.GenAiIOException;
import com.google.genai.types.GenerateVideosConfig;
import com.google.genai.types.GenerateVideosOperation;
import com.google.genai.types.GenerateVideosSource;
import com.google.genai.types.Video;

/** An example of using the Unified Gen AI Java SDK to generate videos. */
public final class GenerateVideos {
  public static void main(String[] args) {
    String modelId = "veo-2.0-generate-001";
    if (args.length != 0) {
      modelId = args[0];
    }

    // Instantiate the client. The client by default uses the Gemini Developer API. It gets the API
    // key from the environment variable `GOOGLE_API_KEY`. Vertex AI API can be used by setting the
    // environment variables `GOOGLE_CLOUD_LOCATION` and `GOOGLE_CLOUD_PROJECT`, as well as setting
    // `GOOGLE_GENAI_USE_VERTEXAI` to "true".
    //
    // Note: Some services are only available in a specific API backend (Gemini or Vertex), you will
    // get a `UnsupportedOperationException` if you try to use a service that is not available in
    // the backend you are using.
    Client client = new Client();

    if (client.vertexAI()) {
      System.out.println("Using Vertex AI");
    } else {
      System.out.println("Using Gemini Developer API");
    }

    GenerateVideosConfig.Builder generateVideosConfigBuilder =
        GenerateVideosConfig.builder().numberOfVideos(1);

    if (client.vertexAI()) {
      generateVideosConfigBuilder.outputGcsUri("gs://genai-sdk-tests/tmp/videos");
    }
    GenerateVideosConfig generateVideosConfig = generateVideosConfigBuilder.build();
    GenerateVideosSource generateVideosSource =
        GenerateVideosSource.builder()
            .prompt("A neon hologram of a cat driving at top speed")
            .build();

    GenerateVideosOperation generateVideosOperation =
        client.models.generateVideos(modelId, generateVideosSource, generateVideosConfig);

    // GenerateVideosOperation.done() is empty if the operation is not done.
    while (!generateVideosOperation.done().filter(Boolean::booleanValue).isPresent()) {
      try {
        Thread.sleep(10000); // Sleep for 10 seconds.
        generateVideosOperation =
            client.operations.getVideosOperation(generateVideosOperation, null);
        System.out.println("Waiting for operation to complete...");
      } catch (InterruptedException e) {
        System.out.println("Thread was interrupted while sleeping.");
        Thread.currentThread().interrupt();
      }
    }
    System.out.println(
        "Generated "
            + generateVideosOperation.response().get().generatedVideos().get().size()
            + " video(s).");

    Video generatedVideo =
        generateVideosOperation.response().get().generatedVideos().get().get(0).video().get();

    if (!client.vertexAI()) {
      try {
        client.files.download(generatedVideo, "video.mp4", null);
        System.out.println("Downloaded video to video.mp4");
      } catch (GenAiIOException e) {
        System.out.println("An error occurred while downloading the video: " + e.getMessage());
      }
    }
  }

  private GenerateVideos() {}
}
