package net.ibizsys.central.plugin.spring.service.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFunction;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.service.SubSysServiceAPIRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import reactor.core.publisher.Mono;

class WebFluxRefreshFailureTest {
	private static final String SECRET = "refresh-fixture-sensitive-value";
	private static final String PATH = "auths/{refresh_token}/refresh_token";
	private static final Map<String, String> PARAMETERS = Collections.singletonMap("refresh_token", SECRET);

	@Test
	void refreshClientDenialsKeepTrustedHttpStatusWithoutLoggingResponseOrCredential() throws Exception {
		for (int status : new int[] { 400, 401, 403 }) {
			TestClient client = response(status, "{\"error\":\"invalid_grant\",\"path\":\"/auths/" + SECRET + "/refresh_token\"}");
			SubSysServiceAPIRuntimeException failure = assertThrows(SubSysServiceAPIRuntimeException.class,
					() -> client.get(PATH, PARAMETERS, null, null, String.class, null));
			assertEquals(status, failure.getStatusCode());
			assertFalse(trace(failure).contains(SECRET));
			assertFalse(trace(failure).contains("invalid_grant"));
			assertFalse(client.audit.toString().contains(SECRET));
			assertFalse(client.audit.isEmpty());
		}
	}

	@Test
	void misleadingAuthenticationBodyOnUpstream503Remains503() throws Exception {
		TestClient client = response(503, "{\"error\":\"invalid_grant\",\"refresh_token\":\"" + SECRET + "\"}");
		SubSysServiceAPIRuntimeException failure = assertThrows(SubSysServiceAPIRuntimeException.class,
				() -> client.get(PATH, PARAMETERS, null, null, String.class, null));
		assertEquals(503, failure.getStatusCode());
		assertFalse(trace(failure).contains(SECRET));
		assertFalse(client.audit.toString().contains(SECRET));
	}

	@Test
	void refreshNetworkFailuresAreInternalErrorsAndDoNotRetainUrlBearingCauses() throws Exception {
		TestClient client = new TestClient(request -> Mono.error(
				new IllegalStateException("Connection failed at http://uaa.invalid/auths/" + SECRET + "/refresh_token")));
		SystemRuntimeException failure = assertThrows(SystemRuntimeException.class,
				() -> client.get(PATH, PARAMETERS, null, null, String.class, null));
		assertFalse(trace(failure).contains(SECRET));
		assertFalse(client.audit.toString().contains(SECRET));
		assertNotNull(failure.getMessage());
	}

	@Test
	void nonRefreshFailuresRetainTheirExistingBodyStatusAndCauseContract() throws Exception {
		for (int status : new int[] { 400, 401, 503 }) {
			String body = "{\"message\":\"legacy-upstream-detail\"}";
			TestClient client = response(status, body);
			SubSysServiceAPIRuntimeException failure = assertThrows(SubSysServiceAPIRuntimeException.class,
					() -> client.get("/ordinary/resource", null, null, null, String.class, null));
			assertEquals(status, failure.getStatusCode());
			assertTrue(failure.getCause() instanceof WebClientResponseException);
			WebClientResponseException upstream = (WebClientResponseException) failure.getCause();
			assertEquals(body, upstream.getResponseBodyAsString());
			assertEquals(500, new net.ibizsys.central.cloud.core.service.util.ResponseExceptionHandler()
					.getResponseEntity(failure).getStatusCodeValue());
		}
	}

	@Test
	void refreshAndOrdinarySuccessResponsesAreUnchanged() throws Throwable {
		String body = "{\"value\":\"positive-control\"}";
		TestClient client = response(200, body);
		assertEquals(body, client.get(PATH, PARAMETERS, null, null, String.class, null).getBody());
		assertEquals(body, client.get("/ordinary/resource", null, null, null, String.class, null).getBody());
	}

	@Test
	void existingDebugParameterMaskCoversTheRefreshUriVariable() throws Exception {
		assertEquals("******", response(200, "{}").debug(PARAMETERS));
	}

	private static TestClient response(int status, String body) throws Exception {
		return new TestClient(request -> Mono.just(ClientResponse.create(HttpStatus.valueOf(status))
				.header("Content-Type", "application/json").body(body).build()));
	}

	private static String trace(Throwable failure) {
		StringWriter output = new StringWriter();
		failure.printStackTrace(new PrintWriter(output));
		return output.toString();
	}

	private static class TestClient extends WebFluxClient {
		final List<String> audit = new ArrayList<>();
		private final WebClient client;

		TestClient(ExchangeFunction exchange) throws Exception {
			client = WebClient.builder().baseUrl("http://uaa.invalid/").exchangeFunction(exchange).build();
			ISystemRuntime runtime = (ISystemRuntime) Proxy.newProxyInstance(getClass().getClassLoader(),
					new Class<?>[] { ISystemRuntime.class }, (proxy, method, args) -> {
						if ("log".equals(method.getName())) {
							audit.add(String.valueOf(args[2]));
							return null;
						}
						throw new AssertionError("Unexpected system operation: " + method.getName());
					});
			init(runtime);
		}

		@Override
		protected WebClient getWebClient(String uri) {
			return client;
		}

		String debug(Object value) {
			return getDebugParamString(value);
		}
	}
}
