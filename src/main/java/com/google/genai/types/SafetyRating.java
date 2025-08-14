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

/** Safety rating corresponding to the generated content. */
@AutoValue
@JsonDeserialize(builder = SafetyRating.Builder.class)
public abstract class SafetyRating extends JsonSerializable {
  /** Output only. Indicates whether the content was filtered out because of this rating. */
  @JsonProperty("blocked")
  public abstract Optional<Boolean> blocked();

  /** Output only. Harm category. */
  @JsonProperty("category")
  public abstract Optional<HarmCategory> category();

  /**
   * Output only. The overwritten threshold for the safety category of Gemini 2.0 image out. If
   * minors are detected in the output image, the threshold of each safety category will be
   * overwritten if user sets a lower threshold.
   */
  @JsonProperty("overwrittenThreshold")
  public abstract Optional<HarmBlockThreshold> overwrittenThreshold();

  /** Output only. Harm probability levels in the content. */
  @JsonProperty("probability")
  public abstract Optional<HarmProbability> probability();

  /** Output only. Harm probability score. */
  @JsonProperty("probabilityScore")
  public abstract Optional<Float> probabilityScore();

  /** Output only. Harm severity levels in the content. */
  @JsonProperty("severity")
  public abstract Optional<HarmSeverity> severity();

  /** Output only. Harm severity score. */
  @JsonProperty("severityScore")
  public abstract Optional<Float> severityScore();

  /** Instantiates a builder for SafetyRating. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SafetyRating.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SafetyRating. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `SafetyRating.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SafetyRating.Builder();
    }

    /**
     * Setter for blocked.
     *
     * <p>blocked: Output only. Indicates whether the content was filtered out because of this
     * rating.
     */
    @JsonProperty("blocked")
    public abstract Builder blocked(boolean blocked);

    /**
     * Setter for category.
     *
     * <p>category: Output only. Harm category.
     */
    @JsonProperty("category")
    public abstract Builder category(HarmCategory category);

    /**
     * Setter for category given a known enum.
     *
     * <p>category: Output only. Harm category.
     */
    @CanIgnoreReturnValue
    public Builder category(HarmCategory.Known knownType) {
      return category(new HarmCategory(knownType));
    }

    /**
     * Setter for category given a string.
     *
     * <p>category: Output only. Harm category.
     */
    @CanIgnoreReturnValue
    public Builder category(String category) {
      return category(new HarmCategory(category));
    }

    /**
     * Setter for overwrittenThreshold.
     *
     * <p>overwrittenThreshold: Output only. The overwritten threshold for the safety category of
     * Gemini 2.0 image out. If minors are detected in the output image, the threshold of each
     * safety category will be overwritten if user sets a lower threshold.
     */
    @JsonProperty("overwrittenThreshold")
    public abstract Builder overwrittenThreshold(HarmBlockThreshold overwrittenThreshold);

    /**
     * Setter for overwrittenThreshold given a known enum.
     *
     * <p>overwrittenThreshold: Output only. The overwritten threshold for the safety category of
     * Gemini 2.0 image out. If minors are detected in the output image, the threshold of each
     * safety category will be overwritten if user sets a lower threshold.
     */
    @CanIgnoreReturnValue
    public Builder overwrittenThreshold(HarmBlockThreshold.Known knownType) {
      return overwrittenThreshold(new HarmBlockThreshold(knownType));
    }

    /**
     * Setter for overwrittenThreshold given a string.
     *
     * <p>overwrittenThreshold: Output only. The overwritten threshold for the safety category of
     * Gemini 2.0 image out. If minors are detected in the output image, the threshold of each
     * safety category will be overwritten if user sets a lower threshold.
     */
    @CanIgnoreReturnValue
    public Builder overwrittenThreshold(String overwrittenThreshold) {
      return overwrittenThreshold(new HarmBlockThreshold(overwrittenThreshold));
    }

    /**
     * Setter for probability.
     *
     * <p>probability: Output only. Harm probability levels in the content.
     */
    @JsonProperty("probability")
    public abstract Builder probability(HarmProbability probability);

    /**
     * Setter for probability given a known enum.
     *
     * <p>probability: Output only. Harm probability levels in the content.
     */
    @CanIgnoreReturnValue
    public Builder probability(HarmProbability.Known knownType) {
      return probability(new HarmProbability(knownType));
    }

    /**
     * Setter for probability given a string.
     *
     * <p>probability: Output only. Harm probability levels in the content.
     */
    @CanIgnoreReturnValue
    public Builder probability(String probability) {
      return probability(new HarmProbability(probability));
    }

    /**
     * Setter for probabilityScore.
     *
     * <p>probabilityScore: Output only. Harm probability score.
     */
    @JsonProperty("probabilityScore")
    public abstract Builder probabilityScore(Float probabilityScore);

    /**
     * Setter for severity.
     *
     * <p>severity: Output only. Harm severity levels in the content.
     */
    @JsonProperty("severity")
    public abstract Builder severity(HarmSeverity severity);

    /**
     * Setter for severity given a known enum.
     *
     * <p>severity: Output only. Harm severity levels in the content.
     */
    @CanIgnoreReturnValue
    public Builder severity(HarmSeverity.Known knownType) {
      return severity(new HarmSeverity(knownType));
    }

    /**
     * Setter for severity given a string.
     *
     * <p>severity: Output only. Harm severity levels in the content.
     */
    @CanIgnoreReturnValue
    public Builder severity(String severity) {
      return severity(new HarmSeverity(severity));
    }

    /**
     * Setter for severityScore.
     *
     * <p>severityScore: Output only. Harm severity score.
     */
    @JsonProperty("severityScore")
    public abstract Builder severityScore(Float severityScore);

    public abstract SafetyRating build();
  }

  /** Deserializes a JSON string to a SafetyRating object. */
  @ExcludeFromGeneratedCoverageReport
  public static SafetyRating fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, SafetyRating.class);
  }
}
