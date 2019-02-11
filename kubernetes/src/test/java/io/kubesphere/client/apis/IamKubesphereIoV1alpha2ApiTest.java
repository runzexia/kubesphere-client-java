/*
 * KubeSphere Advanced
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2.0.0
 * Contact: kubesphere@yunify.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.kubesphere.client.apis;

import io.kubesphere.client.ApiException;
import io.kubesphere.client.models.ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace;
import io.kubesphere.client.models.ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList;
import io.kubesphere.client.models.V1APIResourceList;
import io.kubesphere.client.models.V1DeleteOptions;
import io.kubesphere.client.models.V1Status;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for IamKubesphereIoV1alpha2Api */
@Ignore
public class IamKubesphereIoV1alpha2ApiTest {

  private final IamKubesphereIoV1alpha2Api api = new IamKubesphereIoV1alpha2Api();

  /**
   * create a Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createWorkspaceTest() throws ApiException {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace body = null;
    Boolean includeUninitialized = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace response =
        api.createWorkspace(body, includeUninitialized, pretty, dryRun);

    // TODO: test validations
  }

  /**
   * delete collection of Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteCollectionWorkspaceTest() throws ApiException {
    Boolean includeUninitialized = null;
    String pretty = null;
    String _continue = null;
    String fieldSelector = null;
    String labelSelector = null;
    Integer limit = null;
    String resourceVersion = null;
    Integer timeoutSeconds = null;
    Boolean watch = null;
    V1Status response =
        api.deleteCollectionWorkspace(
            includeUninitialized,
            pretty,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            timeoutSeconds,
            watch);

    // TODO: test validations
  }

  /**
   * delete a Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteWorkspaceTest() throws ApiException {
    String name = null;
    V1DeleteOptions body = null;
    String pretty = null;
    String dryRun = null;
    Integer gracePeriodSeconds = null;
    Boolean orphanDependents = null;
    String propagationPolicy = null;
    V1Status response =
        api.deleteWorkspace(
            name, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

    // TODO: test validations
  }

  /**
   * get available resources
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getAPIResourcesTest() throws ApiException {
    V1APIResourceList response = api.getAPIResources();

    // TODO: test validations
  }

  /**
   * list or watch objects of kind Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listWorkspaceTest() throws ApiException {
    Boolean includeUninitialized = null;
    String pretty = null;
    String _continue = null;
    String fieldSelector = null;
    String labelSelector = null;
    Integer limit = null;
    String resourceVersion = null;
    Integer timeoutSeconds = null;
    Boolean watch = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList response =
        api.listWorkspace(
            includeUninitialized,
            pretty,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            timeoutSeconds,
            watch);

    // TODO: test validations
  }

  /**
   * partially update the specified Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void patchWorkspaceTest() throws ApiException {
    String name = null;
    Object body = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace response =
        api.patchWorkspace(name, body, pretty, dryRun);

    // TODO: test validations
  }

  /**
   * partially update status of the specified Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void patchWorkspaceStatusTest() throws ApiException {
    String name = null;
    Object body = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace response =
        api.patchWorkspaceStatus(name, body, pretty, dryRun);

    // TODO: test validations
  }

  /**
   * read the specified Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void readWorkspaceTest() throws ApiException {
    String name = null;
    String pretty = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace response =
        api.readWorkspace(name, pretty);

    // TODO: test validations
  }

  /**
   * read status of the specified Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void readWorkspaceStatusTest() throws ApiException {
    String name = null;
    String pretty = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace response =
        api.readWorkspaceStatus(name, pretty);

    // TODO: test validations
  }

  /**
   * replace the specified Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void replaceWorkspaceTest() throws ApiException {
    String name = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace body = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace response =
        api.replaceWorkspace(name, body, pretty, dryRun);

    // TODO: test validations
  }

  /**
   * replace status of the specified Workspace
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void replaceWorkspaceStatusTest() throws ApiException {
    String name = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace body = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace response =
        api.replaceWorkspaceStatus(name, body, pretty, dryRun);

    // TODO: test validations
  }
}
