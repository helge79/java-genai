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

/** Encapsulates a review snippet. */
@AutoValue
@JsonDeserialize(builder = GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder.class)
public abstract class GroundingChunkMapsPlaceAnswerSourcesReviewSnippet extends JsonSerializable {
  /** This review's author. */
  @JsonProperty("authorAttribution")
  public abstract Optional<GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution>
      authorAttribution();

  /** A link where users can flag a problem with the review. */
  @JsonProperty("flagContentUri")
  public abstract Optional<String> flagContentUri();

  /** A link to show the review on Google Maps. */
  @JsonProperty("googleMapsUri")
  public abstract Optional<String> googleMapsUri();

  /**
   * A string of formatted recent time, expressing the review time relative to the current time in a
   * form appropriate for the language and country.
   */
  @JsonProperty("relativePublishTimeDescription")
  public abstract Optional<String> relativePublishTimeDescription();

  /**
   * A reference representing this place review which may be used to look up this place review
   * again.
   */
  @JsonProperty("review")
  public abstract Optional<String> review();

  /** Instantiates a builder for GroundingChunkMapsPlaceAnswerSourcesReviewSnippet. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for GroundingChunkMapsPlaceAnswerSourcesReviewSnippet. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.builder()`
     * for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder();
    }

    /**
     * Setter for authorAttribution.
     *
     * <p>authorAttribution: This review's author.
     */
    @JsonProperty("authorAttribution")
    public abstract Builder authorAttribution(
        GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution authorAttribution);

    /**
     * Setter for authorAttribution builder.
     *
     * <p>authorAttribution: This review's author.
     */
    public Builder authorAttribution(
        GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution.Builder authorAttributionBuilder) {
      return authorAttribution(authorAttributionBuilder.build());
    }

    /**
     * Setter for flagContentUri.
     *
     * <p>flagContentUri: A link where users can flag a problem with the review.
     */
    @JsonProperty("flagContentUri")
    public abstract Builder flagContentUri(String flagContentUri);

    /**
     * Setter for googleMapsUri.
     *
     * <p>googleMapsUri: A link to show the review on Google Maps.
     */
    @JsonProperty("googleMapsUri")
    public abstract Builder googleMapsUri(String googleMapsUri);

    /**
     * Setter for relativePublishTimeDescription.
     *
     * <p>relativePublishTimeDescription: A string of formatted recent time, expressing the review
     * time relative to the current time in a form appropriate for the language and country.
     */
    @JsonProperty("relativePublishTimeDescription")
    public abstract Builder relativePublishTimeDescription(String relativePublishTimeDescription);

    /**
     * Setter for review.
     *
     * <p>review: A reference representing this place review which may be used to look up this place
     * review again.
     */
    @JsonProperty("review")
    public abstract Builder review(String review);

    public abstract GroundingChunkMapsPlaceAnswerSourcesReviewSnippet build();
  }

  /** Deserializes a JSON string to a GroundingChunkMapsPlaceAnswerSourcesReviewSnippet object. */
  @ExcludeFromGeneratedCoverageReport
  public static GroundingChunkMapsPlaceAnswerSourcesReviewSnippet fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.class);
  }
}
