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

/** A generated video. */
@AutoValue
@JsonDeserialize(builder = GeneratedVideo.Builder.class)
public abstract class GeneratedVideo extends JsonSerializable {
  /** The output video */
  @JsonProperty("video")
  public abstract Optional<Video> video();

  /** Instantiates a builder for GeneratedVideo. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_GeneratedVideo.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for GeneratedVideo. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `GeneratedVideo.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_GeneratedVideo.Builder();
    }

    /**
     * Setter for video.
     *
     * <p>video: The output video
     */
    @JsonProperty("video")
    public abstract Builder video(Video video);

    /**
     * Setter for video builder.
     *
     * <p>video: The output video
     */
    public Builder video(Video.Builder videoBuilder) {
      return video(videoBuilder.build());
    }

    public abstract GeneratedVideo build();
  }

  /** Deserializes a JSON string to a GeneratedVideo object. */
  @ExcludeFromGeneratedCoverageReport
  public static GeneratedVideo fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, GeneratedVideo.class);
  }
}
