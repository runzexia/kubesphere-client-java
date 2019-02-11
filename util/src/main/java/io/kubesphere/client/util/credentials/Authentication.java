package io.kubesphere.client.util.credentials;

import io.kubesphere.client.ApiClient;
import io.kubesphere.client.util.ClientBuilder;

/**
 * Allows the implementation of different authentication mechanisms for the Kubernetes API.
 *
 * @see ClientBuilder#setAuthentication(Authentication)
 */
public interface Authentication {

  void provide(ApiClient client);
}
