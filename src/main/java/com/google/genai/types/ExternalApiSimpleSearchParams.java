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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;

/** The search parameters to use for SIMPLE_SEARCH spec. */
@AutoValue
@JsonDeserialize(builder = ExternalApiSimpleSearchParams.Builder.class)
public abstract class ExternalApiSimpleSearchParams extends JsonSerializable {
  /** Instantiates a builder for ExternalApiSimpleSearchParams. */
  public static Builder builder() {
    return new AutoValue_ExternalApiSimpleSearchParams.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ExternalApiSimpleSearchParams. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ExternalApiSimpleSearchParams.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ExternalApiSimpleSearchParams.Builder();
    }

    public abstract ExternalApiSimpleSearchParams build();
  }

  /** Deserializes a JSON string to a ExternalApiSimpleSearchParams object. */
  public static ExternalApiSimpleSearchParams fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ExternalApiSimpleSearchParams.class);
  }
}
