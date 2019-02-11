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

import com.google.gson.reflect.TypeToken;
import io.kubesphere.client.ApiClient;
import io.kubesphere.client.ApiException;
import io.kubesphere.client.Configuration;
import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;
import io.kubesphere.client.models.ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject;
import io.kubesphere.client.util.Config;
import io.kubesphere.client.util.Watch;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/** A simple example of how to use Watch API to watch changes in Namespace list. */
public class WatchExample {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    client.getHttpClient().setReadTimeout(60, TimeUnit.SECONDS);
    Configuration.setDefaultApiClient(client);

    DevopsKubesphereIoV1alpha2Api api = new DevopsKubesphereIoV1alpha2Api();

    Watch<ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject> watch =
        Watch.createWatch(
            client,
            api.listDevOpsProjectCall(
                null, null, null, null, null, 5, null, null, Boolean.TRUE, null, null),
            new TypeToken<
                Watch.Response<
                    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject>>() {}.getType());

    try {
      for (Watch.Response<ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject>
          item : watch) {
        System.out.printf("%s : %s%n", item.type, item.object.getMetadata().getName());
      }
    } finally {
      watch.close();
    }
  }
}
