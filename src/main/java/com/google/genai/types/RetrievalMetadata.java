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

/** Metadata related to retrieval in the grounding flow. */
@AutoValue
@JsonDeserialize(builder = RetrievalMetadata.Builder.class)
public abstract class RetrievalMetadata extends JsonSerializable {
  /**
   * Optional. Score indicating how likely information from Google Search could help answer the
   * prompt. The score is in the range `[0, 1]`, where 0 is the least likely and 1 is the most
   * likely. This score is only populated when Google Search grounding and dynamic retrieval is
   * enabled. It will be compared to the threshold to determine whether to trigger Google Search.
   */
  @JsonProperty("googleSearchDynamicRetrievalScore")
  public abstract Optional<Float> googleSearchDynamicRetrievalScore();

  /** Instantiates a builder for RetrievalMetadata. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_RetrievalMetadata.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for RetrievalMetadata. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `RetrievalMetadata.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_RetrievalMetadata.Builder();
    }

    /**
     * Setter for googleSearchDynamicRetrievalScore.
     *
     * <p>googleSearchDynamicRetrievalScore: Optional. Score indicating how likely information from
     * Google Search could help answer the prompt. The score is in the range `[0, 1]`, where 0 is
     * the least likely and 1 is the most likely. This score is only populated when Google Search
     * grounding and dynamic retrieval is enabled. It will be compared to the threshold to determine
     * whether to trigger Google Search.
     */
    @JsonProperty("googleSearchDynamicRetrievalScore")
    public abstract Builder googleSearchDynamicRetrievalScore(
        Float googleSearchDynamicRetrievalScore);

    public abstract RetrievalMetadata build();
  }

  /** Deserializes a JSON string to a RetrievalMetadata object. */
  @ExcludeFromGeneratedCoverageReport
  public static RetrievalMetadata fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, RetrievalMetadata.class);
  }
}
