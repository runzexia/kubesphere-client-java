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
import io.kubesphere.client.models.ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject;
import io.kubesphere.client.models.ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProjectList;
import io.kubesphere.client.models.V1APIResourceList;
import io.kubesphere.client.models.V1DeleteOptions;
import io.kubesphere.client.models.V1Status;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for DevopsKubesphereIoV1alpha2Api */
@Ignore
public class DevopsKubesphereIoV1alpha2ApiTest {

  private final DevopsKubesphereIoV1alpha2Api api = new DevopsKubesphereIoV1alpha2Api();

  /**
   * create a DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createDevOpsProjectTest() throws ApiException {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject body = null;
    Boolean includeUninitialized = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject response =
        api.createDevOpsProject(body, includeUninitialized, pretty, dryRun);

    // TODO: test validations
  }

  /**
   * delete collection of DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteCollectionDevOpsProjectTest() throws ApiException {
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
        api.deleteCollectionDevOpsProject(
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
   * delete a DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteDevOpsProjectTest() throws ApiException {
    String name = null;
    V1DeleteOptions body = null;
    String pretty = null;
    String dryRun = null;
    Integer gracePeriodSeconds = null;
    Boolean orphanDependents = null;
    String propagationPolicy = null;
    V1Status response =
        api.deleteDevOpsProject(
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
   * list or watch objects of kind DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listDevOpsProjectTest() throws ApiException {
    Boolean includeUninitialized = null;
    String pretty = null;
    String _continue = null;
    String fieldSelector = null;
    String labelSelector = null;
    Integer limit = null;
    String resourceVersion = null;
    Integer timeoutSeconds = null;
    Boolean watch = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProjectList response =
        api.listDevOpsProject(
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
   * partially update the specified DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void patchDevOpsProjectTest() throws ApiException {
    String name = null;
    Object body = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject response =
        api.patchDevOpsProject(name, body, pretty, dryRun);

    // TODO: test validations
  }

  /**
   * partially update status of the specified DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void patchDevOpsProjectStatusTest() throws ApiException {
    String name = null;
    Object body = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject response =
        api.patchDevOpsProjectStatus(name, body, pretty, dryRun);

    // TODO: test validations
  }

  /**
   * read the specified DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void readDevOpsProjectTest() throws ApiException {
    String name = null;
    String pretty = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject response =
        api.readDevOpsProject(name, pretty);

    // TODO: test validations
  }

  /**
   * read status of the specified DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void readDevOpsProjectStatusTest() throws ApiException {
    String name = null;
    String pretty = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject response =
        api.readDevOpsProjectStatus(name, pretty);

    // TODO: test validations
  }

  /**
   * replace the specified DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void replaceDevOpsProjectTest() throws ApiException {
    String name = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject body = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject response =
        api.replaceDevOpsProject(name, body, pretty, dryRun);

    // TODO: test validations
  }

  /**
   * replace status of the specified DevOpsProject
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void replaceDevOpsProjectStatusTest() throws ApiException {
    String name = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject body = null;
    String pretty = null;
    String dryRun = null;
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject response =
        api.replaceDevOpsProjectStatus(name, body, pretty, dryRun);

    // TODO: test validations
  }
}
