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

package com.google.genai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.genai.errors.GenAiIOException;
import com.google.genai.types.BatchJob;
import com.google.genai.types.BatchJobDestination;
import com.google.genai.types.BatchJobSource;
import com.google.genai.types.Content;
import com.google.genai.types.CreateBatchJobConfig;
import com.google.genai.types.DeleteResourceJob;
import com.google.genai.types.InlinedRequest;
import com.google.genai.types.ListBatchJobsConfig;
import com.google.genai.types.Part;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@EnabledIfEnvironmentVariable(
    named = "GOOGLE_GENAI_REPLAYS_DIRECTORY",
    matches = ".*genai/replays.*")
@ExtendWith(EnvironmentVariablesMockingExtension.class)
public class AsyncBatchesTest {
  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testAsyncCancel(boolean vertexAI) throws ExecutionException, InterruptedException {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        TestUtils.createClient(
            vertexAI, "tests/batches/cancel/test_async_cancel." + suffix + ".json");

    String vertexJob = "2803006536245313536";
    String mldevJob = "batches/coqrz7leaeit8g83thvdrkzdulz1bxgi8s74";
    String name = vertexAI ? vertexJob : mldevJob;

    // Act
    client.async.batches.cancel(name, null).get();
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testAsyncCreateWithBigquery(boolean vertexAI)
      throws ExecutionException, InterruptedException {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        TestUtils.createClient(
            vertexAI, "tests/batches/create_with_bigquery/test_async_create." + suffix + ".json");

    BatchJobSource bqInput =
        BatchJobSource.builder()
            .bigqueryUri(
                "bq://vertex-sdk-dev.unified_genai_tests_batches.generate_content_requests")
            .format("bigquery")
            .build();

    CreateBatchJobConfig config =
        CreateBatchJobConfig.builder()
            .displayName("genai_batch_job_20240101000000_bd656")
            .dest(
                BatchJobDestination.builder()
                    .bigqueryUri(
                        "bq://vertex-sdk-dev.unified_genai_tests_batches."
                            + "generate_content_requests_dest_20240101000000_bd656")
                    .format("bigquery"))
            .build();

    // Act
    if (vertexAI) {
      BatchJob batchJob =
          client.async.batches.create("gemini-1.5-flash-002", bqInput, config).get();

      // Assert
      assertNotNull(batchJob);
      assertTrue(batchJob.name().get().startsWith("projects/"));
    } else {
      ExecutionException exception =
          assertThrows(
              ExecutionException.class,
              () -> client.async.batches.create("gemini-1.5-flash-002", bqInput, config).get());

      // Assert
      assertTrue(exception.getCause() instanceof GenAiIOException);
      assertEquals(
          exception.getCause().getMessage(), "One of fileName and InlinedRequests must be set.");
    }
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testAsyncCreateWithFile(boolean vertexAI)
      throws ExecutionException, InterruptedException {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        TestUtils.createClient(
            vertexAI, "tests/batches/create_with_file/test_async_create." + suffix + ".json");
    BatchJobSource src = BatchJobSource.builder().fileName("files/76eifkmq7uxd").build();
    CreateBatchJobConfig config = CreateBatchJobConfig.builder().displayName("test_batch").build();

    // Act
    if (vertexAI) {
      ExecutionException exception =
          assertThrows(
              ExecutionException.class,
              () -> client.async.batches.create("gemini-2.0-flash", src, config).get());

      // Assert
      assertTrue(exception.getCause() instanceof GenAiIOException);
      assertEquals(exception.getCause().getMessage(), "fileName is not supported for Vertex AI.");
    } else {
      BatchJob batchJob = client.async.batches.create("gemini-2.0-flash", src, config).get();

      // Assert
      assertNotNull(batchJob);
      assertTrue(batchJob.name().get().startsWith("batches/"));
    }
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testAsyncCreateWithGcs(boolean vertexAI)
      throws ExecutionException, InterruptedException {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        TestUtils.createClient(
            vertexAI, "tests/batches/create_with_gcs/test_async_create." + suffix + ".json");

    BatchJobSource src =
        BatchJobSource.builder()
            .gcsUri("gs://unified-genai-tests/batches/input/generate_content_requests.jsonl")
            .format("jsonl")
            .build();

    CreateBatchJobConfig config =
        CreateBatchJobConfig.builder()
            .displayName("genai_batch_job_20240101000000_bd656")
            .dest(
                BatchJobDestination.builder()
                    .gcsUri("gs://unified-genai-tests/batches/input/generate_content_requests/dest")
                    .format("jsonl"))
            .build();

    // Act
    if (vertexAI) {
      BatchJob batchJob = client.async.batches.create("gemini-1.5-flash-002", src, config).get();

      // Assert
      assertNotNull(batchJob);
      assertTrue(batchJob.name().get().startsWith("projects/"));
    } else {
      ExecutionException exception =
          assertThrows(
              ExecutionException.class,
              () -> client.async.batches.create("gemini-1.5-flash-002", src, config).get());

      // Assert
      assertTrue(exception.getCause() instanceof GenAiIOException);
      assertEquals(
          exception.getCause().getMessage(), "One of fileName and InlinedRequests must be set.");
    }
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testAsyncCreateWithInlinedRequests(boolean vertexAI)
      throws ExecutionException, InterruptedException {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        TestUtils.createClient(
            vertexAI,
            "tests/batches/create_with_inlined_requests/test_async_create." + suffix + ".json");

    BatchJobSource src =
        BatchJobSource.builder()
            .inlinedRequests(
                InlinedRequest.builder()
                    .contents(Content.builder().parts(Part.fromText("Hello!")).role("user")))
            .build();

    // Act
    if (vertexAI) {
      ExecutionException exception =
          assertThrows(
              ExecutionException.class,
              () -> client.async.batches.create("gemini-1.5-flash-002", src, null).get());

      // Assert
      assertTrue(exception.getCause() instanceof GenAiIOException);
      assertTrue(
          exception
              .getCause()
              .getMessage()
              .equals("inlinedRequests is not supported for Vertex AI."));
    } else {
      BatchJob batchJob = client.async.batches.create("gemini-1.5-flash-002", src, null).get();

      // Assert
      assertNotNull(batchJob);
      assertTrue(batchJob.name().get().startsWith("batches/"));
    }
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testAsyncDelete(boolean vertexAI) throws ExecutionException, InterruptedException {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        TestUtils.createClient(
            vertexAI, "tests/batches/delete/test_async_delete." + suffix + ".json");

    String vertexJob = "7085929781874655232";
    String mldevJob = "batches/70h2jo0ic2t1zejyl0p4jgi8mk1gj0wvjusv";
    String name = vertexAI ? vertexJob : mldevJob;

    // Act
    DeleteResourceJob job = client.async.batches.delete(name, null).get();
    assertNotNull(job);
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testAsyncGet(boolean vertexAI) throws ExecutionException, InterruptedException {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        TestUtils.createClient(vertexAI, "tests/batches/get/test_async_get." + suffix + ".json");

    String vertexJob = "5798522612028014592";
    String mldevJob = "batches/2uqn2xn58tohxdg0qnypy4dujme2mvs90gp1";
    String name = vertexAI ? vertexJob : mldevJob;

    // Act
    BatchJob batchJob = client.async.batches.get(name, null).get();

    // Assert
    assertNotNull(batchJob);
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testAsyncList(boolean vertexAI) throws ExecutionException, InterruptedException {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        TestUtils.createClient(vertexAI, "tests/batches/list/test_async_pager." + suffix + ".json");
    ListBatchJobsConfig config = ListBatchJobsConfig.builder().pageSize(10).build();

    // Act
    AsyncPager<BatchJob> pager = client.async.batches.list(config).get();

    // Assert
    assertNotNull(pager);
    assertEquals(pager.pageSize().get(), 10);
    pager.page().get().forEach(item -> assertNotNull(item));
    assertNotNull(pager.sdkHttpResponse().get().get().headers().get());
  }
}
