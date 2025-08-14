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

import static com.google.common.collect.ImmutableList.toImmutableList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Logprobs Result */
@AutoValue
@JsonDeserialize(builder = LogprobsResult.Builder.class)
public abstract class LogprobsResult extends JsonSerializable {
  /**
   * Length = total number of decoding steps. The chosen candidates may or may not be in
   * top_candidates.
   */
  @JsonProperty("chosenCandidates")
  public abstract Optional<List<LogprobsResultCandidate>> chosenCandidates();

  /** Length = total number of decoding steps. */
  @JsonProperty("topCandidates")
  public abstract Optional<List<LogprobsResultTopCandidates>> topCandidates();

  /** Instantiates a builder for LogprobsResult. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_LogprobsResult.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for LogprobsResult. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `LogprobsResult.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_LogprobsResult.Builder();
    }

    /**
     * Setter for chosenCandidates.
     *
     * <p>chosenCandidates: Length = total number of decoding steps. The chosen candidates may or
     * may not be in top_candidates.
     */
    @JsonProperty("chosenCandidates")
    public abstract Builder chosenCandidates(List<LogprobsResultCandidate> chosenCandidates);

    /**
     * Setter for chosenCandidates.
     *
     * <p>chosenCandidates: Length = total number of decoding steps. The chosen candidates may or
     * may not be in top_candidates.
     */
    public Builder chosenCandidates(LogprobsResultCandidate... chosenCandidates) {
      return chosenCandidates(Arrays.asList(chosenCandidates));
    }

    /**
     * Setter for chosenCandidates builder.
     *
     * <p>chosenCandidates: Length = total number of decoding steps. The chosen candidates may or
     * may not be in top_candidates.
     */
    public Builder chosenCandidates(LogprobsResultCandidate.Builder... chosenCandidatesBuilders) {
      return chosenCandidates(
          Arrays.asList(chosenCandidatesBuilders).stream()
              .map(LogprobsResultCandidate.Builder::build)
              .collect(toImmutableList()));
    }

    /**
     * Setter for topCandidates.
     *
     * <p>topCandidates: Length = total number of decoding steps.
     */
    @JsonProperty("topCandidates")
    public abstract Builder topCandidates(List<LogprobsResultTopCandidates> topCandidates);

    /**
     * Setter for topCandidates.
     *
     * <p>topCandidates: Length = total number of decoding steps.
     */
    public Builder topCandidates(LogprobsResultTopCandidates... topCandidates) {
      return topCandidates(Arrays.asList(topCandidates));
    }

    /**
     * Setter for topCandidates builder.
     *
     * <p>topCandidates: Length = total number of decoding steps.
     */
    public Builder topCandidates(LogprobsResultTopCandidates.Builder... topCandidatesBuilders) {
      return topCandidates(
          Arrays.asList(topCandidatesBuilders).stream()
              .map(LogprobsResultTopCandidates.Builder::build)
              .collect(toImmutableList()));
    }

    public abstract LogprobsResult build();
  }

  /** Deserializes a JSON string to a LogprobsResult object. */
  @ExcludeFromGeneratedCoverageReport
  public static LogprobsResult fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, LogprobsResult.class);
  }
}
