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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Tool details of a tool that the model may use to generate a response. */
@AutoValue
@JsonDeserialize(builder = Tool.Builder.class)
public abstract class Tool extends JsonSerializable {
  /** List of function declarations that the tool supports. */
  @JsonProperty("functionDeclarations")
  public abstract Optional<List<FunctionDeclaration>> functionDeclarations();

  /**
   * Optional. Retrieval tool type. System will always execute the provided retrieval tool(s) to get
   * external knowledge to answer the prompt. Retrieval results are presented to the model for
   * generation.
   */
  @JsonProperty("retrieval")
  public abstract Optional<Retrieval> retrieval();

  /**
   * Optional. Google Search tool type. Specialized retrieval tool that is powered by Google Search.
   */
  @JsonProperty("googleSearch")
  public abstract Optional<GoogleSearch> googleSearch();

  /**
   * Optional. GoogleSearchRetrieval tool type. Specialized retrieval tool that is powered by Google
   * search.
   */
  @JsonProperty("googleSearchRetrieval")
  public abstract Optional<GoogleSearchRetrieval> googleSearchRetrieval();

  /**
   * Optional. Enterprise web search tool type. Specialized retrieval tool that is powered by Vertex
   * AI Search and Sec4 compliance.
   */
  @JsonProperty("enterpriseWebSearch")
  public abstract Optional<EnterpriseWebSearch> enterpriseWebSearch();

  /** Optional. Google Maps tool type. Specialized retrieval tool that is powered by Google Maps. */
  @JsonProperty("googleMaps")
  public abstract Optional<GoogleMaps> googleMaps();

  /** Optional. Tool to support URL context retrieval. */
  @JsonProperty("urlContext")
  public abstract Optional<UrlContext> urlContext();

  /**
   * The java.lang.reflect.Method instance. If provided, it will to be parsed into a list of
   * FunctionDeclaration instances, and be assigned to the functionDeclarations field.
   */
  @JsonIgnore
  public abstract Optional<List<Method>> functions();

  /**
   * Optional. Tool to support the model interacting directly with the computer. If enabled, it
   * automatically populates computer-use specific Function Declarations.
   */
  @JsonProperty("computerUse")
  public abstract Optional<ComputerUse> computerUse();

  /** Optional. CodeExecution tool type. Enables the model to execute code as part of generation. */
  @JsonProperty("codeExecution")
  public abstract Optional<ToolCodeExecution> codeExecution();

  /** Instantiates a builder for Tool. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_Tool.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for Tool. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `Tool.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_Tool.Builder();
    }

    /**
     * Setter for functionDeclarations.
     *
     * <p>functionDeclarations: List of function declarations that the tool supports.
     */
    @JsonProperty("functionDeclarations")
    public abstract Builder functionDeclarations(List<FunctionDeclaration> functionDeclarations);

    /**
     * Setter for functionDeclarations.
     *
     * <p>functionDeclarations: List of function declarations that the tool supports.
     */
    public Builder functionDeclarations(FunctionDeclaration... functionDeclarations) {
      return functionDeclarations(Arrays.asList(functionDeclarations));
    }

    /**
     * Setter for functionDeclarations builder.
     *
     * <p>functionDeclarations: List of function declarations that the tool supports.
     */
    public Builder functionDeclarations(
        FunctionDeclaration.Builder... functionDeclarationsBuilders) {
      return functionDeclarations(
          Arrays.asList(functionDeclarationsBuilders).stream()
              .map(FunctionDeclaration.Builder::build)
              .collect(toImmutableList()));
    }

    /**
     * Setter for retrieval.
     *
     * <p>retrieval: Optional. Retrieval tool type. System will always execute the provided
     * retrieval tool(s) to get external knowledge to answer the prompt. Retrieval results are
     * presented to the model for generation.
     */
    @JsonProperty("retrieval")
    public abstract Builder retrieval(Retrieval retrieval);

    /**
     * Setter for retrieval builder.
     *
     * <p>retrieval: Optional. Retrieval tool type. System will always execute the provided
     * retrieval tool(s) to get external knowledge to answer the prompt. Retrieval results are
     * presented to the model for generation.
     */
    public Builder retrieval(Retrieval.Builder retrievalBuilder) {
      return retrieval(retrievalBuilder.build());
    }

    /**
     * Setter for googleSearch.
     *
     * <p>googleSearch: Optional. Google Search tool type. Specialized retrieval tool that is
     * powered by Google Search.
     */
    @JsonProperty("googleSearch")
    public abstract Builder googleSearch(GoogleSearch googleSearch);

    /**
     * Setter for googleSearch builder.
     *
     * <p>googleSearch: Optional. Google Search tool type. Specialized retrieval tool that is
     * powered by Google Search.
     */
    public Builder googleSearch(GoogleSearch.Builder googleSearchBuilder) {
      return googleSearch(googleSearchBuilder.build());
    }

    /**
     * Setter for googleSearchRetrieval.
     *
     * <p>googleSearchRetrieval: Optional. GoogleSearchRetrieval tool type. Specialized retrieval
     * tool that is powered by Google search.
     */
    @JsonProperty("googleSearchRetrieval")
    public abstract Builder googleSearchRetrieval(GoogleSearchRetrieval googleSearchRetrieval);

    /**
     * Setter for googleSearchRetrieval builder.
     *
     * <p>googleSearchRetrieval: Optional. GoogleSearchRetrieval tool type. Specialized retrieval
     * tool that is powered by Google search.
     */
    public Builder googleSearchRetrieval(
        GoogleSearchRetrieval.Builder googleSearchRetrievalBuilder) {
      return googleSearchRetrieval(googleSearchRetrievalBuilder.build());
    }

    /**
     * Setter for enterpriseWebSearch.
     *
     * <p>enterpriseWebSearch: Optional. Enterprise web search tool type. Specialized retrieval tool
     * that is powered by Vertex AI Search and Sec4 compliance.
     */
    @JsonProperty("enterpriseWebSearch")
    public abstract Builder enterpriseWebSearch(EnterpriseWebSearch enterpriseWebSearch);

    /**
     * Setter for enterpriseWebSearch builder.
     *
     * <p>enterpriseWebSearch: Optional. Enterprise web search tool type. Specialized retrieval tool
     * that is powered by Vertex AI Search and Sec4 compliance.
     */
    public Builder enterpriseWebSearch(EnterpriseWebSearch.Builder enterpriseWebSearchBuilder) {
      return enterpriseWebSearch(enterpriseWebSearchBuilder.build());
    }

    /**
     * Setter for googleMaps.
     *
     * <p>googleMaps: Optional. Google Maps tool type. Specialized retrieval tool that is powered by
     * Google Maps.
     */
    @JsonProperty("googleMaps")
    public abstract Builder googleMaps(GoogleMaps googleMaps);

    /**
     * Setter for googleMaps builder.
     *
     * <p>googleMaps: Optional. Google Maps tool type. Specialized retrieval tool that is powered by
     * Google Maps.
     */
    public Builder googleMaps(GoogleMaps.Builder googleMapsBuilder) {
      return googleMaps(googleMapsBuilder.build());
    }

    /**
     * Setter for urlContext.
     *
     * <p>urlContext: Optional. Tool to support URL context retrieval.
     */
    @JsonProperty("urlContext")
    public abstract Builder urlContext(UrlContext urlContext);

    /**
     * Setter for urlContext builder.
     *
     * <p>urlContext: Optional. Tool to support URL context retrieval.
     */
    public Builder urlContext(UrlContext.Builder urlContextBuilder) {
      return urlContext(urlContextBuilder.build());
    }

    /**
     * Setter for functions.
     *
     * <p>functions: The java.lang.reflect.Method instance. If provided, it will to be parsed into a
     * list of FunctionDeclaration instances, and be assigned to the functionDeclarations field.
     */
    @JsonIgnore
    public abstract Builder functions(List<Method> functions);

    /**
     * Setter for functions.
     *
     * <p>functions: The java.lang.reflect.Method instance. If provided, it will to be parsed into a
     * list of FunctionDeclaration instances, and be assigned to the functionDeclarations field.
     */
    public Builder functions(Method... functions) {
      return functions(Arrays.asList(functions));
    }

    /**
     * Setter for computerUse.
     *
     * <p>computerUse: Optional. Tool to support the model interacting directly with the computer.
     * If enabled, it automatically populates computer-use specific Function Declarations.
     */
    @JsonProperty("computerUse")
    public abstract Builder computerUse(ComputerUse computerUse);

    /**
     * Setter for computerUse builder.
     *
     * <p>computerUse: Optional. Tool to support the model interacting directly with the computer.
     * If enabled, it automatically populates computer-use specific Function Declarations.
     */
    public Builder computerUse(ComputerUse.Builder computerUseBuilder) {
      return computerUse(computerUseBuilder.build());
    }

    /**
     * Setter for codeExecution.
     *
     * <p>codeExecution: Optional. CodeExecution tool type. Enables the model to execute code as
     * part of generation.
     */
    @JsonProperty("codeExecution")
    public abstract Builder codeExecution(ToolCodeExecution codeExecution);

    /**
     * Setter for codeExecution builder.
     *
     * <p>codeExecution: Optional. CodeExecution tool type. Enables the model to execute code as
     * part of generation.
     */
    public Builder codeExecution(ToolCodeExecution.Builder codeExecutionBuilder) {
      return codeExecution(codeExecutionBuilder.build());
    }

    public abstract Tool build();
  }

  /** Deserializes a JSON string to a Tool object. */
  @ExcludeFromGeneratedCoverageReport
  public static Tool fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, Tool.class);
  }
}
