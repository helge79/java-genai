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
import com.google.api.core.InternalApi;
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** Supervised fine-tuning job creation parameters - optional fields. */
@AutoValue
@InternalApi
@JsonDeserialize(builder = CreateTuningJobParameters.Builder.class)
public abstract class CreateTuningJobParameters extends JsonSerializable {
  /** The base model that is being tuned, e.g., "gemini-2.5-flash". */
  @JsonProperty("baseModel")
  public abstract Optional<String> baseModel();

  /**
   * Cloud Storage path to file containing training dataset for tuning. The dataset must be
   * formatted as a JSONL file.
   */
  @JsonProperty("trainingDataset")
  public abstract Optional<TuningDataset> trainingDataset();

  /** Configuration for the tuning job. */
  @JsonProperty("config")
  public abstract Optional<CreateTuningJobConfig> config();

  /** Instantiates a builder for CreateTuningJobParameters. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_CreateTuningJobParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for CreateTuningJobParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `CreateTuningJobParameters.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_CreateTuningJobParameters.Builder();
    }

    /**
     * Setter for baseModel.
     *
     * <p>baseModel: The base model that is being tuned, e.g., "gemini-2.5-flash".
     */
    @JsonProperty("baseModel")
    public abstract Builder baseModel(String baseModel);

    /**
     * Setter for trainingDataset.
     *
     * <p>trainingDataset: Cloud Storage path to file containing training dataset for tuning. The
     * dataset must be formatted as a JSONL file.
     */
    @JsonProperty("trainingDataset")
    public abstract Builder trainingDataset(TuningDataset trainingDataset);

    /**
     * Setter for trainingDataset builder.
     *
     * <p>trainingDataset: Cloud Storage path to file containing training dataset for tuning. The
     * dataset must be formatted as a JSONL file.
     */
    public Builder trainingDataset(TuningDataset.Builder trainingDatasetBuilder) {
      return trainingDataset(trainingDatasetBuilder.build());
    }

    /**
     * Setter for config.
     *
     * <p>config: Configuration for the tuning job.
     */
    @JsonProperty("config")
    public abstract Builder config(CreateTuningJobConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config: Configuration for the tuning job.
     */
    public Builder config(CreateTuningJobConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    public abstract CreateTuningJobParameters build();
  }

  /** Deserializes a JSON string to a CreateTuningJobParameters object. */
  @ExcludeFromGeneratedCoverageReport
  public static CreateTuningJobParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, CreateTuningJobParameters.class);
  }
}
