package net.ibizsys.central.cloud.core.sysutil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPublicKey;
import java.time.Instant;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.gen.RSAKeyGenerator;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import io.jsonwebtoken.Clock;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;

class JWTSysUAAUtilRuntimeTest {

	private static final long BASE_TIME = 1_800_000_000_000L;

	private final MutableClock clock = new MutableClock(BASE_TIME);

	@Test
	void publicKeyIsCachedBeforeTtlExpires() throws Throwable {
		TestableRuntime runtime = new TestableRuntime("key-1", "key-2");
		assertEquals("key-1", runtime.getPublicKeyString());
		assertEquals("key-1", runtime.getPublicKeyString());
		assertEquals(1, runtime.fetchCount.get());
	}

	@Test
	void publicKeyIsRefreshedAfterTtlExpires() throws Throwable {
		TestableRuntime runtime = new TestableRuntime("key-1", "key-2");
		assertEquals("key-1", runtime.getPublicKeyString());
		clock.millis += 5 * 60 * 1000L;
		assertEquals("key-2", runtime.getPublicKeyString());
		assertEquals(2, runtime.fetchCount.get());
	}

	@Test
	void rsaValidationRefreshesPublicKeyAndRetries() throws Throwable {
		RsaMaterial first = generateRsaMaterial();
		RsaMaterial second = generateRsaMaterial();
		TestableRuntime runtime = new TestableRuntime(first.publicJwk.toJSONString(), second.publicJwk.toJSONString());
		runtime.setEnableNewRTUAA(true);
		runtime.setSignature("RSA");

		assertEquals(first.publicJwk.toJSONString(), runtime.getPublicKeyString());

		String token = signToken(second.keyPair, "user", BASE_TIME + 60_000L);
		assertTrue(runtime.validateTokenByRSA(token, authenticationUser("user")));
		assertEquals(2, runtime.fetchCount.get());
	}

	@Test
	void successfulPublicKeyRefreshClearsThrottle() throws Throwable {
		TestableRuntime runtime = new TestableRuntime("key-1", "key-2");
		assertEquals("key-1", runtime.getPublicKeyString());
		runtime.failNextFetch = true;
		clock.millis += 5 * 60 * 1000L;
		assertThrows(Exception.class, () -> runtime.getPublicKeyString());
		runtime.failNextFetch = false;
		clock.millis += 5 * 1000L;
		assertEquals("key-2", runtime.getPublicKeyString());
		assertEquals(3, runtime.fetchCount.get());
	}

	@Test
	void publicKeyRefreshIsThrottledAfterFailure() throws Throwable {
		TestableRuntime runtime = new TestableRuntime("key-1");
		assertEquals("key-1", runtime.getPublicKeyString());
		runtime.failNextFetch = true;
		clock.millis += 5 * 60 * 1000L;
		assertThrows(Exception.class, () -> runtime.getPublicKeyString());
		runtime.failNextFetch = false;
		assertEquals(2, runtime.fetchCount.get());
		assertEquals("key-1", runtime.getPublicKeyString());
		assertEquals(2, runtime.fetchCount.get());
	}

	private static RsaMaterial generateRsaMaterial() throws Exception {
		RSAKey rsaKey = new RSAKeyGenerator(2048).keyID("test").generate();
		KeyPair keyPair = rsaKey.toKeyPair();
		RSAKey publicJwk = rsaKey.toPublicJWK();
		return new RsaMaterial(keyPair, publicJwk);
	}

	private static String signToken(KeyPair keyPair, String subject, long expirationMillis) throws Exception {
		JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
				.subject(subject)
				.expirationTime(new Date(expirationMillis))
				.build();
		SignedJWT signedJWT = new SignedJWT(
				new JWSHeader.Builder(JWSAlgorithm.RS256).keyID("test").build(),
				claimsSet);
		signedJWT.sign(new RSASSASigner(keyPair.getPrivate()));
		return signedJWT.serialize();
	}

	private static AuthenticationUser authenticationUser(String username) {
		AuthenticationUser user = new AuthenticationUser();
		user.setUsername(username);
		user.setAuthorities(Collections.emptyList());
		return user;
	}

	private class TestableRuntime extends JWTSysUAAUtilRuntime {
		private final String[] publicKeys;
		private final AtomicInteger fetchCount = new AtomicInteger();
		private boolean failNextFetch = false;

		private TestableRuntime(String... publicKeys) {
			this.publicKeys = publicKeys;
			this.setEnableNewRTUAA(true);
			this.setClock(clock);
		}

		@Override
		protected String fetchPublicKeyString() throws Throwable {
			if (failNextFetch) {
				fetchCount.getAndIncrement();
				throw new Exception("signature key endpoint unavailable");
			}
			return publicKeys[Math.min(fetchCount.getAndIncrement(), publicKeys.length - 1)];
		}
	}

	private static final class RsaMaterial {
		private final KeyPair keyPair;
		private final RSAKey publicJwk;

		private RsaMaterial(KeyPair keyPair, RSAKey publicJwk) {
			this.keyPair = keyPair;
			this.publicJwk = publicJwk;
		}
	}

	private static final class MutableClock implements Clock {
		private volatile long millis;

		private MutableClock(long millis) {
			this.millis = millis;
		}

		@Override
		public Date now() {
			return Date.from(Instant.ofEpochMilli(millis));
		}
	}
}
