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

// Auto-generated code. Do not edit.

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/**
 * Configuration for upscaling an image.
 *
 * <p>For more information on this configuration, refer to the `Imagen API reference documentation
 * <https://cloud.google.com/vertex-ai/generative-ai/docs/model-reference/imagen-api>`_.
 */
@AutoValue
@JsonDeserialize(builder = UpscaleImageConfig.Builder.class)
public abstract class UpscaleImageConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** Whether to include a reason for filtered-out images in the response. */
  @JsonProperty("includeRaiReason")
  public abstract Optional<Boolean> includeRaiReason();

  /** The image format that the output should be saved as. */
  @JsonProperty("outputMimeType")
  public abstract Optional<String> outputMimeType();

  /** The level of compression if the ``output_mime_type`` is ``image/jpeg``. */
  @JsonProperty("outputCompressionQuality")
  public abstract Optional<Integer> outputCompressionQuality();

  /**
   * Whether to add an image enhancing step before upscaling. It is expected to suppress the noise
   * and JPEG compression artifacts from the input image.
   */
  @JsonProperty("enhanceInputImage")
  public abstract Optional<Boolean> enhanceInputImage();

  /**
   * With a higher image preservation factor, the original image pixels are more respected. With a
   * lower image preservation factor, the output image will have be more different from the input
   * image, but with finer details and less noise.
   */
  @JsonProperty("imagePreservationFactor")
  public abstract Optional<Float> imagePreservationFactor();

  /** Instantiates a builder for UpscaleImageConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_UpscaleImageConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for UpscaleImageConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `UpscaleImageConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_UpscaleImageConfig.Builder();
    }

    /**
     * Setter for httpOptions.
     *
     * <p>httpOptions: Used to override HTTP request options.
     */
    @JsonProperty("httpOptions")
    public abstract Builder httpOptions(HttpOptions httpOptions);

    /**
     * Setter for httpOptions builder.
     *
     * <p>httpOptions: Used to override HTTP request options.
     */
    public Builder httpOptions(HttpOptions.Builder httpOptionsBuilder) {
      return httpOptions(httpOptionsBuilder.build());
    }

    /**
     * Setter for includeRaiReason.
     *
     * <p>includeRaiReason: Whether to include a reason for filtered-out images in the response.
     */
    @JsonProperty("includeRaiReason")
    public abstract Builder includeRaiReason(boolean includeRaiReason);

    /**
     * Setter for outputMimeType.
     *
     * <p>outputMimeType: The image format that the output should be saved as.
     */
    @JsonProperty("outputMimeType")
    public abstract Builder outputMimeType(String outputMimeType);

    /**
     * Setter for outputCompressionQuality.
     *
     * <p>outputCompressionQuality: The level of compression if the ``output_mime_type`` is
     * ``image/jpeg``.
     */
    @JsonProperty("outputCompressionQuality")
    public abstract Builder outputCompressionQuality(Integer outputCompressionQuality);

    /**
     * Setter for enhanceInputImage.
     *
     * <p>enhanceInputImage: Whether to add an image enhancing step before upscaling. It is expected
     * to suppress the noise and JPEG compression artifacts from the input image.
     */
    @JsonProperty("enhanceInputImage")
    public abstract Builder enhanceInputImage(boolean enhanceInputImage);

    /**
     * Setter for imagePreservationFactor.
     *
     * <p>imagePreservationFactor: With a higher image preservation factor, the original image
     * pixels are more respected. With a lower image preservation factor, the output image will have
     * be more different from the input image, but with finer details and less noise.
     */
    @JsonProperty("imagePreservationFactor")
    public abstract Builder imagePreservationFactor(Float imagePreservationFactor);

    public abstract UpscaleImageConfig build();
  }

  /** Deserializes a JSON string to a UpscaleImageConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static UpscaleImageConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, UpscaleImageConfig.class);
  }
}
