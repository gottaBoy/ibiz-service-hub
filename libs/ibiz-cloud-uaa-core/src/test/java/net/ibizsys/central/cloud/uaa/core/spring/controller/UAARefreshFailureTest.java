package net.ibizsys.central.cloud.uaa.core.spring.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.lang.reflect.Proxy;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationInfo;
import net.ibizsys.central.cloud.core.spring.rt.util.ResponseExceptionHandler;
import net.ibizsys.central.service.SubSysServiceAPIRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ErrorException;

public class UAARefreshFailureTest {
	private static final String SECRET = "refresh-fixture-sensitive-value";
	private static final ObjectMapper JSON = new ObjectMapper();

	@Test
	public void actualRuntimeWrappersPreserveTrusted400401403AtOnlyTheRefreshEndpoint() throws Exception {
		for (int status : new int[] { 400, 401, 403 }) {
			MvcResult result = mvc(wrapper(status, "{\"error\":\"invalid_grant\"}"), null)
					.perform(get("/uaa/refresh_token/" + SECRET)).andReturn();
			assertDenied(result, status);
		}
	}

	@Test
	public void misleadingAuthenticationPayloadDoesNotConvertUpstream5xxToClientDenial() throws Exception {
		for (int status : new int[] { 500, 502, 503 }) {
			MvcResult result = mvc(wrapper(status, "{\"error\":\"invalid_grant\",\"status\":401}"), null)
					.perform(get("/uaa/refresh_token/" + SECRET)).andReturn();
			assertDenied(result, status);
		}
	}

	@Test
	public void networkAndStorageFailuresRemain500WithoutEchoingCredentialMessages() throws Exception {
		for (RuntimeException failure : new RuntimeException[] {
				new SystemRuntimeException(null, "Connection failure at /auths/" + SECRET + "/refresh_token"),
				new IllegalStateException("Storage unavailable for " + SECRET) }) {
			assertDenied(mvc(failure, null).perform(get("/uaa/refresh_token/" + SECRET)).andReturn(), 500);
		}
	}

	@Test
	public void untrustedBusinessCodesAndUnexpectedUpstream4xxAreNotAuthenticationEvidence() throws Exception {
		for (RuntimeException failure : new RuntimeException[] {
				new ErrorException("Business failure " + SECRET, 401),
				wrapper(404, "{\"error\":\"invalid_grant\"}"), wrapper(429, "{\"error\":\"invalid_token\"}") }) {
			assertDenied(mvc(failure, null).perform(get("/uaa/refresh_token/" + SECRET)).andReturn(), 500);
		}
	}

	@Test
	public void normalRefreshSuccessRetainsTheNativeAuthenticationInfoResponse() throws Exception {
		AuthenticationInfo value = new AuthenticationInfo("fixture-access-token", 60, null, "fixture-refresh-token");
		MvcResult result = mvc(null, value).perform(get("/uaa/refresh_token/" + SECRET)).andReturn();
		assertEquals(200, result.getResponse().getStatus());
		assertTrue(MediaType.APPLICATION_JSON.isCompatibleWith(
				MediaType.parseMediaType(result.getResponse().getContentType())));
		JsonNode response = JSON.readTree(result.getResponse().getContentAsByteArray());
		assertEquals(value.getToken(), response.path("token").asText());
		assertEquals(value.getRefresh_token(), response.path("refresh_token").asText());
		assertEquals(value.getExpirein(), response.path("expirein").asInt());
	}

	@Test
	public void existingGlobalHandlerContractForNonRefreshFailuresRemainsUnchanged() throws Exception {
		MvcResult result = mvc(null, null).perform(get("/fixture/non-refresh-error")).andReturn();
		assertEquals(500, result.getResponse().getStatus());
		JsonNode response = JSON.readTree(result.getResponse().getContentAsByteArray());
		assertEquals("RuntimeException", response.path("type").asText());
		assertEquals("Unchanged non-refresh error detail", response.path("message").asText());
	}

	private static void assertDenied(MvcResult result, int status) throws Exception {
		assertEquals(status, result.getResponse().getStatus());
		assertEquals("no-store", result.getResponse().getHeader("Cache-Control"));
		assertEquals("no-cache", result.getResponse().getHeader("Pragma"));
		String body = result.getResponse().getContentAsString();
		assertFalse(body.contains(SECRET), "Refresh credentials must never be reflected");
		JsonNode response = JSON.readTree(body);
		assertEquals("RefreshTokenError", response.path("type").asText());
		assertTrue(response.path("message").isTextual());
		for (String field : new String[] { "token", "access_token", "refresh_token", "user", "id", "username", "dc" }) {
			assertFalse(response.hasNonNull(field));
		}
	}

	private static RuntimeException wrapper(int status, String body) {
		WebClientResponseException upstream = WebClientResponseException.create(status,
				"Refresh failed at /auths/" + SECRET + "/refresh_token", new HttpHeaders(),
				body.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
		SubSysServiceAPIRuntimeException transport = new SubSysServiceAPIRuntimeException(null, null, status,
				"Upstream URL /auths/" + SECRET + "/refresh_token", upstream);
		return new SystemRuntimeException(null, null, "Token renewal action failed", transport);
	}

	private static MockMvc mvc(RuntimeException failure, AuthenticationInfo result) {
		ICloudUAAUtilRuntime runtime = (ICloudUAAUtilRuntime) Proxy.newProxyInstance(
				UAARefreshFailureTest.class.getClassLoader(), new Class<?>[] { ICloudUAAUtilRuntime.class },
				(proxy, method, args) -> {
					if ("refreshToken2".equals(method.getName())) {
						assertEquals(SECRET, args[0]);
						if (failure != null) throw failure;
						return result;
					}
					throw new AssertionError("Unexpected UAA operation: " + method.getName());
				});
		UAARestController controller = new UAARestController() {
			@Override
			protected ICloudUAAUtilRuntime getCloudUAAUtilRuntime() {
				return runtime;
			}
		};
		return MockMvcBuilders.standaloneSetup(controller, new UnrelatedController())
				.defaultRequest(get("/").accept(MediaType.APPLICATION_JSON))
				.setControllerAdvice(new ResponseExceptionHandler()).build();
	}

	@RestController
	static class UnrelatedController {
		@GetMapping("/fixture/non-refresh-error")
		public Object fail() {
			throw new RuntimeException("Unchanged non-refresh error detail");
		}
	}
}
