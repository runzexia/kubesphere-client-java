package io.kubesphere.client.util.credentials;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import io.kubesphere.client.ApiClient;
import io.kubesphere.client.util.TestUtils;
import org.junit.Test;

public class AccessTokenAuthenticationTest {

  @Test
  public void testTokenProvided() {
    final ApiClient client = new ApiClient();
    new AccessTokenAuthentication("token").provide(client);
    assertThat(TestUtils.getApiKeyAuthFromClient(client).getApiKeyPrefix(), is("Bearer"));
    assertThat(TestUtils.getApiKeyAuthFromClient(client).getApiKey(), is("token"));
  }

  @Test(expected = NullPointerException.class)
  public void testTokenNonnull() {
    new AccessTokenAuthentication(null);
  }
}
