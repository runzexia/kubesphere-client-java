/*
Copyright 2017 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubesphere.client.examples;

import io.kubesphere.client.ApiClient;
import io.kubesphere.client.ApiException;
import io.kubesphere.client.Configuration;
import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;
import io.kubesphere.client.models.ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject;
import io.kubesphere.client.models.ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProjectList;
import io.kubesphere.client.util.Config;
import java.io.IOException;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java -Dexec.mainClass="Example"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class Example {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    DevopsKubesphereIoV1alpha2Api api = new DevopsKubesphereIoV1alpha2Api();
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProjectList list =
        api.listDevOpsProject(null, null, null, null, null, null, null, null, null);
    for (ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject item :
        list.getItems()) {
      System.out.println(item.getMetadata().getName());
    }
  }
}
