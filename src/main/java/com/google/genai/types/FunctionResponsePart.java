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
 * A datatype containing media that is part of a `FunctionResponse` message.
 *
 * <p>A `FunctionResponsePart` consists of data which has an associated datatype. A
 * `FunctionResponsePart` can only contain one of the accepted types in `FunctionResponsePart.data`.
 *
 * <p>A `FunctionResponsePart` must have a fixed IANA MIME type identifying the type and subtype of
 * the media if the `inline_data` field is filled with raw bytes.
 */
@AutoValue
@JsonDeserialize(builder = FunctionResponsePart.Builder.class)
public abstract class FunctionResponsePart extends JsonSerializable {
  /** Optional. Inline media bytes. */
  @JsonProperty("inlineData")
  public abstract Optional<FunctionResponseBlob> inlineData();

  /** Optional. URI based data. */
  @JsonProperty("fileData")
  public abstract Optional<FunctionResponseFileData> fileData();

  /** Instantiates a builder for FunctionResponsePart. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_FunctionResponsePart.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for FunctionResponsePart. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `FunctionResponsePart.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_FunctionResponsePart.Builder();
    }

    /**
     * Setter for inlineData.
     *
     * <p>inlineData: Optional. Inline media bytes.
     */
    @JsonProperty("inlineData")
    public abstract Builder inlineData(FunctionResponseBlob inlineData);

    /**
     * Setter for inlineData builder.
     *
     * <p>inlineData: Optional. Inline media bytes.
     */
    public Builder inlineData(FunctionResponseBlob.Builder inlineDataBuilder) {
      return inlineData(inlineDataBuilder.build());
    }

    /**
     * Setter for fileData.
     *
     * <p>fileData: Optional. URI based data.
     */
    @JsonProperty("fileData")
    public abstract Builder fileData(FunctionResponseFileData fileData);

    /**
     * Setter for fileData builder.
     *
     * <p>fileData: Optional. URI based data.
     */
    public Builder fileData(FunctionResponseFileData.Builder fileDataBuilder) {
      return fileData(fileDataBuilder.build());
    }

    public abstract FunctionResponsePart build();
  }

  /** Deserializes a JSON string to a FunctionResponsePart object. */
  @ExcludeFromGeneratedCoverageReport
  public static FunctionResponsePart fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, FunctionResponsePart.class);
  }
}
