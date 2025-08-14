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
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/**
 * Retrieve from data source powered by external API for grounding. The external API is not owned by
 * Google, but need to follow the pre-defined API spec.
 */
@AutoValue
@JsonDeserialize(builder = ExternalApi.Builder.class)
public abstract class ExternalApi extends JsonSerializable {
  /** The authentication config to access the API. Deprecated. Please use auth_config instead. */
  @JsonProperty("apiAuth")
  public abstract Optional<ApiAuth> apiAuth();

  /** The API spec that the external API implements. */
  @JsonProperty("apiSpec")
  public abstract Optional<ApiSpec> apiSpec();

  /** The authentication config to access the API. */
  @JsonProperty("authConfig")
  public abstract Optional<AuthConfig> authConfig();

  /** Parameters for the elastic search API. */
  @JsonProperty("elasticSearchParams")
  public abstract Optional<ExternalApiElasticSearchParams> elasticSearchParams();

  /**
   * The endpoint of the external API. The system will call the API at this endpoint to retrieve the
   * data for grounding. Example: https://acme.com:443/search
   */
  @JsonProperty("endpoint")
  public abstract Optional<String> endpoint();

  /** Parameters for the simple search API. */
  @JsonProperty("simpleSearchParams")
  public abstract Optional<ExternalApiSimpleSearchParams> simpleSearchParams();

  /** Instantiates a builder for ExternalApi. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ExternalApi.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ExternalApi. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `ExternalApi.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ExternalApi.Builder();
    }

    /**
     * Setter for apiAuth.
     *
     * <p>apiAuth: The authentication config to access the API. Deprecated. Please use auth_config
     * instead.
     */
    @JsonProperty("apiAuth")
    public abstract Builder apiAuth(ApiAuth apiAuth);

    /**
     * Setter for apiAuth builder.
     *
     * <p>apiAuth: The authentication config to access the API. Deprecated. Please use auth_config
     * instead.
     */
    public Builder apiAuth(ApiAuth.Builder apiAuthBuilder) {
      return apiAuth(apiAuthBuilder.build());
    }

    /**
     * Setter for apiSpec.
     *
     * <p>apiSpec: The API spec that the external API implements.
     */
    @JsonProperty("apiSpec")
    public abstract Builder apiSpec(ApiSpec apiSpec);

    /**
     * Setter for apiSpec given a known enum.
     *
     * <p>apiSpec: The API spec that the external API implements.
     */
    @CanIgnoreReturnValue
    public Builder apiSpec(ApiSpec.Known knownType) {
      return apiSpec(new ApiSpec(knownType));
    }

    /**
     * Setter for apiSpec given a string.
     *
     * <p>apiSpec: The API spec that the external API implements.
     */
    @CanIgnoreReturnValue
    public Builder apiSpec(String apiSpec) {
      return apiSpec(new ApiSpec(apiSpec));
    }

    /**
     * Setter for authConfig.
     *
     * <p>authConfig: The authentication config to access the API.
     */
    @JsonProperty("authConfig")
    public abstract Builder authConfig(AuthConfig authConfig);

    /**
     * Setter for authConfig builder.
     *
     * <p>authConfig: The authentication config to access the API.
     */
    public Builder authConfig(AuthConfig.Builder authConfigBuilder) {
      return authConfig(authConfigBuilder.build());
    }

    /**
     * Setter for elasticSearchParams.
     *
     * <p>elasticSearchParams: Parameters for the elastic search API.
     */
    @JsonProperty("elasticSearchParams")
    public abstract Builder elasticSearchParams(ExternalApiElasticSearchParams elasticSearchParams);

    /**
     * Setter for elasticSearchParams builder.
     *
     * <p>elasticSearchParams: Parameters for the elastic search API.
     */
    public Builder elasticSearchParams(
        ExternalApiElasticSearchParams.Builder elasticSearchParamsBuilder) {
      return elasticSearchParams(elasticSearchParamsBuilder.build());
    }

    /**
     * Setter for endpoint.
     *
     * <p>endpoint: The endpoint of the external API. The system will call the API at this endpoint
     * to retrieve the data for grounding. Example: https://acme.com:443/search
     */
    @JsonProperty("endpoint")
    public abstract Builder endpoint(String endpoint);

    /**
     * Setter for simpleSearchParams.
     *
     * <p>simpleSearchParams: Parameters for the simple search API.
     */
    @JsonProperty("simpleSearchParams")
    public abstract Builder simpleSearchParams(ExternalApiSimpleSearchParams simpleSearchParams);

    /**
     * Setter for simpleSearchParams builder.
     *
     * <p>simpleSearchParams: Parameters for the simple search API.
     */
    public Builder simpleSearchParams(
        ExternalApiSimpleSearchParams.Builder simpleSearchParamsBuilder) {
      return simpleSearchParams(simpleSearchParamsBuilder.build());
    }

    public abstract ExternalApi build();
  }

  /** Deserializes a JSON string to a ExternalApi object. */
  @ExcludeFromGeneratedCoverageReport
  public static ExternalApi fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ExternalApi.class);
  }
}
