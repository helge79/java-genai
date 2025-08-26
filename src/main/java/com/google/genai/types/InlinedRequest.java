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
import java.util.Map;
import java.util.Optional;

/** Config for inlined request. */
@AutoValue
@JsonDeserialize(builder = InlinedRequest.Builder.class)
public abstract class InlinedRequest extends JsonSerializable {
  /**
   * ID of the model to use. For a list of models, see `Google models
   * <https://cloud.google.com/vertex-ai/generative-ai/docs/learn/models>`_.
   */
  @JsonProperty("model")
  public abstract Optional<String> model();

  /** Content of the request. */
  @JsonProperty("contents")
  public abstract Optional<List<Content>> contents();

  /** Configuration that contains optional model parameters. */
  @JsonProperty("config")
  public abstract Optional<GenerateContentConfig> config();

  /** Developer set system instruction. */
  @JsonProperty("systemInstruction")
  public abstract Optional<Content> systemInstruction();

  /** A list of `Tools` the model may use to generate the next response. */
  @JsonProperty("tools")
  public abstract Optional<List<Tool>> tools();

  /** Configuration for the tools to use. This config is shared for all tools. */
  @JsonProperty("toolConfig")
  public abstract Optional<ToolConfig> toolConfig();

  /** Safety settings in the request to block unsafe content in the response. */
  @JsonProperty("safetySettings")
  public abstract Optional<List<SafetySetting>> safetySettings();

  /** Resource name of a context cache that can be used in subsequent requests. */
  @JsonProperty("cachedContent")
  public abstract Optional<String> cachedContent();

  /** Optional metadata associated with the request as key-value pairs. */
  @JsonProperty("metadata")
  public abstract Optional<Map<String, Object>> metadata();


  /** Instantiates a builder for InlinedRequest. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_InlinedRequest.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for InlinedRequest. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `InlinedRequest.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_InlinedRequest.Builder();
    }

    /**
     * Setter for model.
     *
     * <p>model: ID of the model to use. For a list of models, see `Google models
     * <https://cloud.google.com/vertex-ai/generative-ai/docs/learn/models>`_.
     */
    @JsonProperty("model")
    public abstract Builder model(String model);

    /**
     * Setter for contents.
     *
     * <p>contents: Content of the request.
     */
    @JsonProperty("contents")
    public abstract Builder contents(List<Content> contents);

    /**
     * Setter for contents.
     *
     * <p>contents: Content of the request.
     */
    public Builder contents(Content... contents) {
      return contents(Arrays.asList(contents));
    }

    /**
     * Setter for contents builder.
     *
     * <p>contents: Content of the request.
     */
    public Builder contents(Content.Builder... contentsBuilders) {
      return contents(
          Arrays.asList(contentsBuilders).stream()
              .map(Content.Builder::build)
              .collect(toImmutableList()));
    }

    /**
     * Setter for config.
     *
     * <p>config: Configuration that contains optional model parameters.
     */
    @JsonProperty("config")
    public abstract Builder config(GenerateContentConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config: Configuration that contains optional model parameters.
     */
    public Builder config(GenerateContentConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    /**
     * Setter for systemInstruction.
     *
     * <p>systemInstruction: Developer set system instruction.
     */
    @JsonProperty("systemInstruction")
    public abstract Builder systemInstruction(Content systemInstruction);

    /**
     * Setter for systemInstruction builder.
     *
     * <p>systemInstruction: Developer set system instruction.
     */
    public Builder systemInstruction(Content.Builder systemInstructionBuilder) {
      return systemInstruction(systemInstructionBuilder.build());
    }

    /**
     * Setter for tools.
     *
     * <p>tools: A list of `Tools` the model may use to generate the next response.
     */
    @JsonProperty("tools")
    public abstract Builder tools(List<Tool> tools);

    /**
     * Setter for tools.
     *
     * <p>tools: A list of `Tools` the model may use to generate the next response.
     */
    public Builder tools(Tool... tools) {
      return tools(Arrays.asList(tools));
    }

    /**
     * Setter for tools builder.
     *
     * <p>tools: A list of `Tools` the model may use to generate the next response.
     */
    public Builder tools(Tool.Builder... toolsBuilders) {
      return tools(
          Arrays.asList(toolsBuilders).stream()
              .map(Tool.Builder::build)
              .collect(toImmutableList()));
    }

    /**
     * Setter for toolConfig.
     *
     * <p>toolConfig: Configuration for the tools to use. This config is shared for all tools.
     */
    @JsonProperty("toolConfig")
    public abstract Builder toolConfig(ToolConfig toolConfig);

    /**
     * Setter for toolConfig builder.
     *
     * <p>toolConfig: Configuration for the tools to use. This config is shared for all tools.
     */
    public Builder toolConfig(ToolConfig.Builder toolConfigBuilder) {
      return toolConfig(toolConfigBuilder.build());
    }

    /**
     * Setter for safetySettings.
     *
     * <p>safetySettings: Safety settings in the request to block unsafe content in the response.
     */
    @JsonProperty("safetySettings")
    public abstract Builder safetySettings(List<SafetySetting> safetySettings);

    /**
     * Setter for safetySettings.
     *
     * <p>safetySettings: Safety settings in the request to block unsafe content in the response.
     */
    public Builder safetySettings(SafetySetting... safetySettings) {
      return safetySettings(Arrays.asList(safetySettings));
    }

    /**
     * Setter for safetySettings builder.
     *
     * <p>safetySettings: Safety settings in the request to block unsafe content in the response.
     */
    public Builder safetySettings(SafetySetting.Builder... safetySettingsBuilders) {
      return safetySettings(
          Arrays.asList(safetySettingsBuilders).stream()
              .map(SafetySetting.Builder::build)
              .collect(toImmutableList()));
    }
    
    /**
     * Setter for cachedContent.
     *
     * <p>cachedContent: Resource name of a context cache that can be used in subsequent requests.
     */
    @JsonProperty("cachedContent")
    public abstract Builder cachedContent(String cachedContent);

    /**
     * Setter for metadata.
     * <p>metadata: Optional metadata associated with the request as key-value pairs.
     */
    @JsonProperty("metadata")
    public abstract Builder metadata(Map<String, Object> metadata);

    public abstract InlinedRequest build();
  }

  /** Deserializes a JSON string to a InlinedRequest object. */
  @ExcludeFromGeneratedCoverageReport
  public static InlinedRequest fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, InlinedRequest.class);
  }
}
