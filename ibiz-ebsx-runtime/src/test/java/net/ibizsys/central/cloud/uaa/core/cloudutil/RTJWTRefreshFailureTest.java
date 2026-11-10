package net.ibizsys.central.cloud.uaa.core.cloudutil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Proxy;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.ibizsys.central.cloud.core.IServiceSystemRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationInfo;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthLoginResponse;
import net.ibizsys.central.cloud.uaa.core.spring.controller.UAARestController;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeException;
import net.ibizsys.central.service.SubSysServiceAPIRuntimeException;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.WebClientRep;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;

public class RTJWTRefreshFailureTest {
	private static final String SECRET = "refresh-fixture-sensitive-value";
	private static final ObjectMapper JSON = new ObjectMapper();

	@Test
	public void publicActionWrapperKeepsTrustedRefreshDenialsAndRemovesAllCredentialCauses() {
		for (int status : new int[] { 400, 401, 403 }) {
			TestRuntime runtime = new TestRuntime(upstream(status), null);
			RuntimeException failure = assertThrows(RuntimeException.class, () -> runtime.refreshToken2(SECRET));
			assertEquals(status, status(failure));
			assertSafe(failure, runtime);
		}
	}

	@Test
	public void upstream503WithInvalidGrantPayloadStaysAServerFailure() throws Exception {
		TestRuntime runtime = new TestRuntime(upstream(503), null);
		assertEquals(503, render(runtime).getResponse().getStatus());
		assertFalse(runtime.audit.toString().contains(SECRET));
	}

	@Test
	public void transportFailuresAre502RatherThanAuthenticationDenials() throws Exception {
		TestRuntime runtime = new TestRuntime(
				new IllegalStateException("Connection refused at /auths/" + SECRET + "/refresh_token"), null);
		RuntimeException failure = assertThrows(RuntimeException.class, () -> runtime.refreshToken2(SECRET));
		assertEquals(502, status(failure));
		assertSafe(failure, runtime);
		assertEquals(502, render(runtime).getResponse().getStatus());
	}

	@Test
	public void localCache403DoesNotBecomeARefreshAuthenticationDenial() throws Exception {
		TestRuntime runtime = new TestRuntime(null, valid());
		runtime.cacheFailure = upstream(403);
		RuntimeException failure = assertThrows(RuntimeException.class, () -> runtime.refreshToken2(SECRET));
		assertEquals(500, status(failure));
		assertSafe(failure, runtime);
		assertEquals(500, render(runtime).getResponse().getStatus());
	}

	@Test
	public void unexpectedUpstream4xxAre502EvenIfTheirBodyClaimsInvalidGrant() throws Exception {
		for (int status : new int[] { 404, 429 }) {
			TestRuntime runtime = new TestRuntime(upstream(status), null);
			assertEquals(502, render(runtime).getResponse().getStatus());
			assertFalse(runtime.audit.toString().contains(SECRET));
		}
	}

	@Test
	public void invalidSuccessfulResponsesRemain500AndNeverBecomeFakeAuthenticationSuccess() throws Exception {
		for (AuthLoginResponse response : new AuthLoginResponse[] { null, new AuthLoginResponse(), valid() }) {
			if (response != null && response.getToken() != null) response.setExpiresIn(0);
			TestRuntime runtime = new TestRuntime(null, response);
			assertEquals(500, render(runtime).getResponse().getStatus());
			assertFalse(runtime.audit.toString().contains(SECRET));
		}
	}

	@Test
	public void validRefreshKeepsNativeTokenExpiryAndResponseThroughActualRuntimeAndController() throws Exception {
		AuthLoginResponse response = valid();
		TestRuntime runtime = new TestRuntime(null, response);
		AuthenticationInfo result = runtime.refreshToken2(SECRET);
		assertEquals(response.getToken(), result.getToken());
		assertEquals(response.getRefreshToken(), result.getRefresh_token());
		assertEquals(response.getExpiresIn().intValue(), result.getExpirein());
		MvcResult rendered = render(runtime);
		assertEquals(200, rendered.getResponse().getStatus());
		assertTrue(MediaType.APPLICATION_JSON.isCompatibleWith(
				MediaType.parseMediaType(rendered.getResponse().getContentType())));
		JsonNode body = JSON.readTree(rendered.getResponse().getContentAsByteArray());
		assertEquals(response.getToken(), body.path("token").asText());
		assertEquals(response.getRefreshToken(), body.path("refresh_token").asText());
		assertEquals(response.getExpiresIn().intValue(), body.path("expirein").asInt());
		assertFalse(runtime.audit.toString().contains(SECRET));
	}

	private static AuthLoginResponse valid() {
		AuthLoginResponse response = new AuthLoginResponse();
		response.setToken("fixture-new-access-token");
		response.setRefreshToken("fixture-next-refresh-token");
		response.setExpiresIn(60);
		return response;
	}

	private static RuntimeException upstream(int status) {
		WebClientResponseException cause = WebClientResponseException.create(status,
				"GET http://uaa.invalid/auths/" + SECRET + "/refresh_token", new HttpHeaders(),
				"{\"error\":\"invalid_grant\"}".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
		return new SubSysServiceAPIRuntimeException(null, null, status,
				"Upstream failure for " + SECRET, cause);
	}

	private static int status(Throwable failure) {
		for (int depth = 0; failure != null && depth < 32; depth++, failure = failure.getCause()) {
			if (failure instanceof ISubSysServiceAPIRuntimeException) {
				return ((ISubSysServiceAPIRuntimeException) failure).getStatusCode();
			}
		}
		return 500;
	}

	private static void assertSafe(Throwable failure, TestRuntime runtime) {
		StringWriter text = new StringWriter();
		failure.printStackTrace(new PrintWriter(text));
		assertFalse(text.toString().contains(SECRET));
		assertFalse(runtime.audit.toString().contains(SECRET));
		assertNotNull(failure.getMessage());
	}

	private static MvcResult render(TestRuntime runtime) throws Exception {
		UAARestController controller = new UAARestController() {
			@Override
			protected ICloudUAAUtilRuntime getCloudUAAUtilRuntime() {
				return runtime;
			}
		};
		MvcResult result = MockMvcBuilders.standaloneSetup(controller).build()
				.perform(get("/uaa/refresh_token/" + SECRET).accept(MediaType.APPLICATION_JSON)).andReturn();
		assertFalse(result.getResponse().getContentAsString().contains(SECRET));
		return result;
	}

	private static class TestRuntime extends RTJWTCloudUAAUtilRuntime {
		final List<String> audit = new ArrayList<>();
		RuntimeException cacheFailure;
		private final IServiceSystemRuntimeBase system;

		TestRuntime(RuntimeException failure, AuthLoginResponse response) {
			system = (IServiceSystemRuntimeBase) Proxy.newProxyInstance(getClass().getClassLoader(),
					new Class<?>[] { IServiceSystemRuntimeBase.class }, (proxy, method, args) -> {
						if ("log".equals(method.getName()) || "logPO".equals(method.getName())) {
							audit.add(String.valueOf(args[2]));
							return null;
						}
						throw new AssertionError("Unexpected system operation: " + method.getName());
					});
			setWebClient((IWebClient) Proxy.newProxyInstance(getClass().getClassLoader(),
					new Class<?>[] { IWebClient.class }, (proxy, method, args) -> {
						assertEquals("get", method.getName());
						assertEquals("auths/{refresh_token}/refresh_token", args[0]);
						assertEquals(SECRET, ((Map<?, ?>) args[1]).get("refresh_token"));
						if (failure != null) throw failure;
						return new WebClientRep<AuthLoginResponse>(response, null);
					}));
		}

		@Override
		public IServiceSystemRuntimeBase getSystemRuntime() {
			return system;
		}

		@Override
		public String getName() {
			return "fixture-uaa";
		}

		@Override
		protected ISysCacheUtilRuntime getSysCacheUtilRuntime(boolean tryMode) {
			if (cacheFailure != null) throw cacheFailure;
			return null;
		}
	}
}
