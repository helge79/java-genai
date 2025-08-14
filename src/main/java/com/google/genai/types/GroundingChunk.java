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

/** Grounding chunk. */
@AutoValue
@JsonDeserialize(builder = GroundingChunk.Builder.class)
public abstract class GroundingChunk extends JsonSerializable {
  /** Grounding chunk from Google Maps. */
  @JsonProperty("maps")
  public abstract Optional<GroundingChunkMaps> maps();

  /** Grounding chunk from context retrieved by the retrieval tools. */
  @JsonProperty("retrievedContext")
  public abstract Optional<GroundingChunkRetrievedContext> retrievedContext();

  /** Grounding chunk from the web. */
  @JsonProperty("web")
  public abstract Optional<GroundingChunkWeb> web();

  /** Instantiates a builder for GroundingChunk. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_GroundingChunk.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for GroundingChunk. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `GroundingChunk.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_GroundingChunk.Builder();
    }

    /**
     * Setter for maps.
     *
     * <p>maps: Grounding chunk from Google Maps.
     */
    @JsonProperty("maps")
    public abstract Builder maps(GroundingChunkMaps maps);

    /**
     * Setter for maps builder.
     *
     * <p>maps: Grounding chunk from Google Maps.
     */
    public Builder maps(GroundingChunkMaps.Builder mapsBuilder) {
      return maps(mapsBuilder.build());
    }

    /**
     * Setter for retrievedContext.
     *
     * <p>retrievedContext: Grounding chunk from context retrieved by the retrieval tools.
     */
    @JsonProperty("retrievedContext")
    public abstract Builder retrievedContext(GroundingChunkRetrievedContext retrievedContext);

    /**
     * Setter for retrievedContext builder.
     *
     * <p>retrievedContext: Grounding chunk from context retrieved by the retrieval tools.
     */
    public Builder retrievedContext(
        GroundingChunkRetrievedContext.Builder retrievedContextBuilder) {
      return retrievedContext(retrievedContextBuilder.build());
    }

    /**
     * Setter for web.
     *
     * <p>web: Grounding chunk from the web.
     */
    @JsonProperty("web")
    public abstract Builder web(GroundingChunkWeb web);

    /**
     * Setter for web builder.
     *
     * <p>web: Grounding chunk from the web.
     */
    public Builder web(GroundingChunkWeb.Builder webBuilder) {
      return web(webBuilder.build());
    }

    public abstract GroundingChunk build();
  }

  /** Deserializes a JSON string to a GroundingChunk object. */
  @ExcludeFromGeneratedCoverageReport
  public static GroundingChunk fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, GroundingChunk.class);
  }
}
