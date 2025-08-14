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

/** Safety settings. */
@AutoValue
@JsonDeserialize(builder = SafetySetting.Builder.class)
public abstract class SafetySetting extends JsonSerializable {
  /** Determines if the harm block method uses probability or probability and severity scores. */
  @JsonProperty("method")
  public abstract Optional<HarmBlockMethod> method();

  /** Required. Harm category. */
  @JsonProperty("category")
  public abstract Optional<HarmCategory> category();

  /** Required. The harm block threshold. */
  @JsonProperty("threshold")
  public abstract Optional<HarmBlockThreshold> threshold();

  /** Instantiates a builder for SafetySetting. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SafetySetting.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SafetySetting. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `SafetySetting.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SafetySetting.Builder();
    }

    /**
     * Setter for method.
     *
     * <p>method: Determines if the harm block method uses probability or probability and severity
     * scores.
     */
    @JsonProperty("method")
    public abstract Builder method(HarmBlockMethod method);

    /**
     * Setter for method given a known enum.
     *
     * <p>method: Determines if the harm block method uses probability or probability and severity
     * scores.
     */
    @CanIgnoreReturnValue
    public Builder method(HarmBlockMethod.Known knownType) {
      return method(new HarmBlockMethod(knownType));
    }

    /**
     * Setter for method given a string.
     *
     * <p>method: Determines if the harm block method uses probability or probability and severity
     * scores.
     */
    @CanIgnoreReturnValue
    public Builder method(String method) {
      return method(new HarmBlockMethod(method));
    }

    /**
     * Setter for category.
     *
     * <p>category: Required. Harm category.
     */
    @JsonProperty("category")
    public abstract Builder category(HarmCategory category);

    /**
     * Setter for category given a known enum.
     *
     * <p>category: Required. Harm category.
     */
    @CanIgnoreReturnValue
    public Builder category(HarmCategory.Known knownType) {
      return category(new HarmCategory(knownType));
    }

    /**
     * Setter for category given a string.
     *
     * <p>category: Required. Harm category.
     */
    @CanIgnoreReturnValue
    public Builder category(String category) {
      return category(new HarmCategory(category));
    }

    /**
     * Setter for threshold.
     *
     * <p>threshold: Required. The harm block threshold.
     */
    @JsonProperty("threshold")
    public abstract Builder threshold(HarmBlockThreshold threshold);

    /**
     * Setter for threshold given a known enum.
     *
     * <p>threshold: Required. The harm block threshold.
     */
    @CanIgnoreReturnValue
    public Builder threshold(HarmBlockThreshold.Known knownType) {
      return threshold(new HarmBlockThreshold(knownType));
    }

    /**
     * Setter for threshold given a string.
     *
     * <p>threshold: Required. The harm block threshold.
     */
    @CanIgnoreReturnValue
    public Builder threshold(String threshold) {
      return threshold(new HarmBlockThreshold(threshold));
    }

    public abstract SafetySetting build();
  }

  /** Deserializes a JSON string to a SafetySetting object. */
  @ExcludeFromGeneratedCoverageReport
  public static SafetySetting fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, SafetySetting.class);
  }
}
