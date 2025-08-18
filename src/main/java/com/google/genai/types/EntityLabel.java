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

/** An entity representing the segmented area. */
@AutoValue
@JsonDeserialize(builder = EntityLabel.Builder.class)
public abstract class EntityLabel extends JsonSerializable {
  /** The label of the segmented entity. */
  @JsonProperty("label")
  public abstract Optional<String> label();

  /** The confidence score of the detected label. */
  @JsonProperty("score")
  public abstract Optional<Float> score();

  /** Instantiates a builder for EntityLabel. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_EntityLabel.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for EntityLabel. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `EntityLabel.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_EntityLabel.Builder();
    }

    /**
     * Setter for label.
     *
     * <p>label: The label of the segmented entity.
     */
    @JsonProperty("label")
    public abstract Builder label(String label);

    /**
     * Setter for score.
     *
     * <p>score: The confidence score of the detected label.
     */
    @JsonProperty("score")
    public abstract Builder score(Float score);

    public abstract EntityLabel build();
  }

  /** Deserializes a JSON string to a EntityLabel object. */
  @ExcludeFromGeneratedCoverageReport
  public static EntityLabel fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, EntityLabel.class);
  }
}
