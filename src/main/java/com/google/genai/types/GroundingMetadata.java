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

/** Metadata returned to client when grounding is enabled. */
@AutoValue
@JsonDeserialize(builder = GroundingMetadata.Builder.class)
public abstract class GroundingMetadata extends JsonSerializable {
  /**
   * Optional. Output only. Resource name of the Google Maps widget context token to be used with
   * the PlacesContextElement widget to render contextual data. This is populated only for Google
   * Maps grounding.
   */
  @JsonProperty("googleMapsWidgetContextToken")
  public abstract Optional<String> googleMapsWidgetContextToken();

  /** List of supporting references retrieved from specified grounding source. */
  @JsonProperty("groundingChunks")
  public abstract Optional<List<GroundingChunk>> groundingChunks();

  /** Optional. List of grounding support. */
  @JsonProperty("groundingSupports")
  public abstract Optional<List<GroundingSupport>> groundingSupports();

  /** Optional. Output only. Retrieval metadata. */
  @JsonProperty("retrievalMetadata")
  public abstract Optional<RetrievalMetadata> retrievalMetadata();

  /** Optional. Queries executed by the retrieval tools. */
  @JsonProperty("retrievalQueries")
  public abstract Optional<List<String>> retrievalQueries();

  /** Optional. Google search entry for the following-up web searches. */
  @JsonProperty("searchEntryPoint")
  public abstract Optional<SearchEntryPoint> searchEntryPoint();

  /** Optional. Web search queries for the following-up web search. */
  @JsonProperty("webSearchQueries")
  public abstract Optional<List<String>> webSearchQueries();

  /** Instantiates a builder for GroundingMetadata. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_GroundingMetadata.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for GroundingMetadata. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `GroundingMetadata.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_GroundingMetadata.Builder();
    }

    /**
     * Setter for googleMapsWidgetContextToken.
     *
     * <p>googleMapsWidgetContextToken: Optional. Output only. Resource name of the Google Maps
     * widget context token to be used with the PlacesContextElement widget to render contextual
     * data. This is populated only for Google Maps grounding.
     */
    @JsonProperty("googleMapsWidgetContextToken")
    public abstract Builder googleMapsWidgetContextToken(String googleMapsWidgetContextToken);

    /**
     * Setter for groundingChunks.
     *
     * <p>groundingChunks: List of supporting references retrieved from specified grounding source.
     */
    @JsonProperty("groundingChunks")
    public abstract Builder groundingChunks(List<GroundingChunk> groundingChunks);

    /**
     * Setter for groundingChunks.
     *
     * <p>groundingChunks: List of supporting references retrieved from specified grounding source.
     */
    public Builder groundingChunks(GroundingChunk... groundingChunks) {
      return groundingChunks(Arrays.asList(groundingChunks));
    }

    /**
     * Setter for groundingChunks builder.
     *
     * <p>groundingChunks: List of supporting references retrieved from specified grounding source.
     */
    public Builder groundingChunks(GroundingChunk.Builder... groundingChunksBuilders) {
      return groundingChunks(
          Arrays.asList(groundingChunksBuilders).stream()
              .map(GroundingChunk.Builder::build)
              .collect(toImmutableList()));
    }

    /**
     * Setter for groundingSupports.
     *
     * <p>groundingSupports: Optional. List of grounding support.
     */
    @JsonProperty("groundingSupports")
    public abstract Builder groundingSupports(List<GroundingSupport> groundingSupports);

    /**
     * Setter for groundingSupports.
     *
     * <p>groundingSupports: Optional. List of grounding support.
     */
    public Builder groundingSupports(GroundingSupport... groundingSupports) {
      return groundingSupports(Arrays.asList(groundingSupports));
    }

    /**
     * Setter for groundingSupports builder.
     *
     * <p>groundingSupports: Optional. List of grounding support.
     */
    public Builder groundingSupports(GroundingSupport.Builder... groundingSupportsBuilders) {
      return groundingSupports(
          Arrays.asList(groundingSupportsBuilders).stream()
              .map(GroundingSupport.Builder::build)
              .collect(toImmutableList()));
    }

    /**
     * Setter for retrievalMetadata.
     *
     * <p>retrievalMetadata: Optional. Output only. Retrieval metadata.
     */
    @JsonProperty("retrievalMetadata")
    public abstract Builder retrievalMetadata(RetrievalMetadata retrievalMetadata);

    /**
     * Setter for retrievalMetadata builder.
     *
     * <p>retrievalMetadata: Optional. Output only. Retrieval metadata.
     */
    public Builder retrievalMetadata(RetrievalMetadata.Builder retrievalMetadataBuilder) {
      return retrievalMetadata(retrievalMetadataBuilder.build());
    }

    /**
     * Setter for retrievalQueries.
     *
     * <p>retrievalQueries: Optional. Queries executed by the retrieval tools.
     */
    @JsonProperty("retrievalQueries")
    public abstract Builder retrievalQueries(List<String> retrievalQueries);

    /**
     * Setter for retrievalQueries.
     *
     * <p>retrievalQueries: Optional. Queries executed by the retrieval tools.
     */
    public Builder retrievalQueries(String... retrievalQueries) {
      return retrievalQueries(Arrays.asList(retrievalQueries));
    }

    /**
     * Setter for searchEntryPoint.
     *
     * <p>searchEntryPoint: Optional. Google search entry for the following-up web searches.
     */
    @JsonProperty("searchEntryPoint")
    public abstract Builder searchEntryPoint(SearchEntryPoint searchEntryPoint);

    /**
     * Setter for searchEntryPoint builder.
     *
     * <p>searchEntryPoint: Optional. Google search entry for the following-up web searches.
     */
    public Builder searchEntryPoint(SearchEntryPoint.Builder searchEntryPointBuilder) {
      return searchEntryPoint(searchEntryPointBuilder.build());
    }

    /**
     * Setter for webSearchQueries.
     *
     * <p>webSearchQueries: Optional. Web search queries for the following-up web search.
     */
    @JsonProperty("webSearchQueries")
    public abstract Builder webSearchQueries(List<String> webSearchQueries);

    /**
     * Setter for webSearchQueries.
     *
     * <p>webSearchQueries: Optional. Web search queries for the following-up web search.
     */
    public Builder webSearchQueries(String... webSearchQueries) {
      return webSearchQueries(Arrays.asList(webSearchQueries));
    }

    public abstract GroundingMetadata build();
  }

  /** Deserializes a JSON string to a GroundingMetadata object. */
  @ExcludeFromGeneratedCoverageReport
  public static GroundingMetadata fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, GroundingMetadata.class);
  }
}
