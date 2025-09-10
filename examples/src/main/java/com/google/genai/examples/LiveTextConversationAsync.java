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
 * <p>mvn clean compile
 *
 * <p>mvn exec:java -Dexec.mainClass="com.google.genai.examples.LiveTextConversationAsync"
 * -Dexec.args="YOUR_MODEL_ID"
 */
package com.google.genai.examples;

import com.google.genai.AsyncSession;
import com.google.genai.Client;
import com.google.genai.types.Content;
import com.google.genai.types.LiveConnectConfig;
import com.google.genai.types.LiveSendClientContentParameters;
import com.google.genai.types.LiveServerContent;
import com.google.genai.types.LiveServerMessage;
import com.google.genai.types.Modality;
import com.google.genai.types.Part;
import java.io.Console;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/** Example of using the live module to send and receive messages asynchronously. */
public final class LiveTextConversationAsync {

  public static void main(String[] args) {
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

    final String modelId;
    if (args.length != 0) {
      modelId = args[0];
    } else if (client.vertexAI()) {
      modelId = Constants.GEMINI_LIVE_MODEL_NAME;
    } else {
      modelId = Constants.GEMINI_LIVE_MODEL_NAME_PREVIEW;
    }

    LiveConnectConfig config =
        LiveConnectConfig.builder()
            .responseModalities(Modality.Known.TEXT)
            .topP(0.8f)
            .seed(1234)
            .build();

    CompletableFuture<Void> allDone = new CompletableFuture<>();

    AsyncSession session;

    try {
      session = client.async.live.connect(modelId, config).get();
      // Start receiving messages.
      CompletableFuture<Void> receiveFuture =
          session.receive(message -> printLiveServerMessage(message, allDone));

      // Send messages. Keep sending until user quits.
      System.out.print("Your Turn >> ");
      boolean keepSending = true;
      while (keepSending) {
        keepSending = send(session).get();
      }

      allDone.get();
      receiveFuture.get();
      session.close().get();
      System.out.println("Session closed.");

    } catch (InterruptedException | ExecutionException e) {
      System.err.println("An error occurred: " + e.getMessage());
      e.printStackTrace();
    }
  }

  /** Wraps client message text. */
  public static LiveSendClientContentParameters clientContentFromText(String text) {
    return LiveSendClientContentParameters.builder()
        .turnComplete(true)
        .turns(Content.fromParts(Part.fromText(text)))
        .build();
  }

  public static void printLiveServerMessage(
      LiveServerMessage message, CompletableFuture<Void> allDone) {
    // Extract and print text from the model.
    message
        .serverContent()
        .flatMap(LiveServerContent::modelTurn)
        .flatMap(Content::parts)
        .ifPresent(parts -> parts.forEach(part -> part.text().ifPresent(System.out::print)));

    if (message.serverContent().flatMap(LiveServerContent::turnComplete).orElse(false)) {
      System.out.print("\nYour Turn >> ");
      allDone.complete(null);
    }
  }

  private static CompletableFuture<Boolean> send(AsyncSession session) {
    Console console = System.console();
    if (console == null) {
      System.err.println("No console available.");
      return CompletableFuture.completedFuture(false);
    }
    try {
      String textInput = console.readLine();
      if (textInput == null || textInput.toLowerCase().matches("q|quit|exit")) {
        return CompletableFuture.completedFuture(false);
      }
      return session.sendClientContent(clientContentFromText(textInput)).thenApply(unused -> true);

    } catch (Exception e) {
      return CompletableFuture.completedFuture(false);
    }
  }

  private LiveTextConversationAsync() {}
}
