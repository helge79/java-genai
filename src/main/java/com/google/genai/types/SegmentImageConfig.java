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
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** Configuration for segmenting an image. */
@AutoValue
@JsonDeserialize(builder = SegmentImageConfig.Builder.class)
public abstract class SegmentImageConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** The segmentation mode to use. */
  @JsonProperty("mode")
  public abstract Optional<SegmentMode> mode();

  /** The maximum number of predictions to return up to, by top confidence score. */
  @JsonProperty("maxPredictions")
  public abstract Optional<Integer> maxPredictions();

  /**
   * The confidence score threshold for the detections as a decimal value. Only predictions with a
   * confidence score higher than this threshold will be returned.
   */
  @JsonProperty("confidenceThreshold")
  public abstract Optional<Float> confidenceThreshold();

  /**
   * A decimal value representing how much dilation to apply to the masks. 0 for no dilation. 1.0
   * means the masked area covers the whole image.
   */
  @JsonProperty("maskDilation")
  public abstract Optional<Float> maskDilation();

  /**
   * The binary color threshold to apply to the masks. The threshold can be set to a decimal value
   * between 0 and 255 non-inclusive. Set to -1 for no binary color thresholding.
   */
  @JsonProperty("binaryColorThreshold")
  public abstract Optional<Float> binaryColorThreshold();

  /** Instantiates a builder for SegmentImageConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SegmentImageConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SegmentImageConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `SegmentImageConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SegmentImageConfig.Builder();
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
     * Setter for mode.
     *
     * <p>mode: The segmentation mode to use.
     */
    @JsonProperty("mode")
    public abstract Builder mode(SegmentMode mode);

    /**
     * Setter for mode given a known enum.
     *
     * <p>mode: The segmentation mode to use.
     */
    @CanIgnoreReturnValue
    public Builder mode(SegmentMode.Known knownType) {
      return mode(new SegmentMode(knownType));
    }

    /**
     * Setter for mode given a string.
     *
     * <p>mode: The segmentation mode to use.
     */
    @CanIgnoreReturnValue
    public Builder mode(String mode) {
      return mode(new SegmentMode(mode));
    }

    /**
     * Setter for maxPredictions.
     *
     * <p>maxPredictions: The maximum number of predictions to return up to, by top confidence
     * score.
     */
    @JsonProperty("maxPredictions")
    public abstract Builder maxPredictions(Integer maxPredictions);

    /**
     * Setter for confidenceThreshold.
     *
     * <p>confidenceThreshold: The confidence score threshold for the detections as a decimal value.
     * Only predictions with a confidence score higher than this threshold will be returned.
     */
    @JsonProperty("confidenceThreshold")
    public abstract Builder confidenceThreshold(Float confidenceThreshold);

    /**
     * Setter for maskDilation.
     *
     * <p>maskDilation: A decimal value representing how much dilation to apply to the masks. 0 for
     * no dilation. 1.0 means the masked area covers the whole image.
     */
    @JsonProperty("maskDilation")
    public abstract Builder maskDilation(Float maskDilation);

    /**
     * Setter for binaryColorThreshold.
     *
     * <p>binaryColorThreshold: The binary color threshold to apply to the masks. The threshold can
     * be set to a decimal value between 0 and 255 non-inclusive. Set to -1 for no binary color
     * thresholding.
     */
    @JsonProperty("binaryColorThreshold")
    public abstract Builder binaryColorThreshold(Float binaryColorThreshold);

    public abstract SegmentImageConfig build();
  }

  /** Deserializes a JSON string to a SegmentImageConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static SegmentImageConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, SegmentImageConfig.class);
  }
}
