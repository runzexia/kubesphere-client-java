package io.kubesphere.client.util.credentials;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import com.google.common.base.Charsets;
import io.kubesphere.client.ApiClient;
import io.kubesphere.client.util.TestUtils;
import okio.ByteString;
import org.junit.Test;

public class UsernamePasswordAuthenticationTest {

  private static final String USERNAME = "username";
  private static final String PASSWORD = "password";
  public static final byte[] USERNAME_PASSWORD_BYTES =
      (USERNAME + ":" + PASSWORD).getBytes(Charsets.ISO_8859_1);

  @Test
  public void testUsernamePasswordProvided() {
    final ApiClient client = new ApiClient();
    new UsernamePasswordAuthentication(USERNAME, PASSWORD).provide(client);
    assertThat(TestUtils.getApiKeyAuthFromClient(client).getApiKeyPrefix(), is("Basic"));
    assertThat(
        TestUtils.getApiKeyAuthFromClient(client).getApiKey(),
        is(ByteString.of(USERNAME_PASSWORD_BYTES).base64()));
  }
}
