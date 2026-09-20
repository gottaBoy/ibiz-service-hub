package net.ibizsys.modeling.core.util;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import net.ibizsys.modeling.core.security.PSDevUser;
import org.junit.jupiter.api.Test;

class Base64HelperTest {

    @Test
    void bytesRoundTripWithAndWithoutLineBreaks() {
        byte[] source = new byte[120];
        for (int i = 0; i < source.length; i++) {
            source[i] = (byte) i;
        }

        String wrapped = Base64Helper.encodeBytes(source);
        String compact = Base64Helper.encodeBytes(source, Base64Helper.DONT_BREAK_LINES);

        assertTrue(wrapped.contains("\n"));
        assertTrue(!compact.contains("\n"));
        assertArrayEquals(source, Base64Helper.decode(wrapped));
        assertArrayEquals(source, Base64Helper.decode(compact));
    }

    @Test
    void gzipAndObjectRoundTrips() {
        byte[] source = "modeling-core".repeat(40).getBytes(StandardCharsets.UTF_8);
        String encoded = Base64Helper.encodeBytes(source, Base64Helper.GZIP);
        assertArrayEquals(source, Base64Helper.decode(encoded));

        PSDevUser user = new PSDevUser();
        user.setPSDevUserId("user-1");
        user.setPSDevUserName("Developer");
        String encodedObject = Base64Helper.encodeObject(user, Base64Helper.GZIP);
        Object decodedObject = Base64Helper.decodeToObject(encodedObject);
        assertTrue(decodedObject instanceof PSDevUser);
        assertEquals("user-1", ((PSDevUser) decodedObject).getPSDevUserId());
        assertEquals("Developer", ((PSDevUser) decodedObject).getPSDevUserName());
    }

    @Test
    void streamAdaptersEncodeAndDecodeOnClose() throws Exception {
        byte[] source = "streaming source".getBytes(StandardCharsets.UTF_8);
        ByteArrayOutputStream encodedBytes = new ByteArrayOutputStream();
        try (Base64Helper.OutputStream output =
                     new Base64Helper.OutputStream(encodedBytes, Base64Helper.ENCODE
                             | Base64Helper.DONT_BREAK_LINES)) {
            output.write(source);
        }

        ByteArrayOutputStream decodedBytes = new ByteArrayOutputStream();
        try (Base64Helper.InputStream input = new Base64Helper.InputStream(
                new ByteArrayInputStream(encodedBytes.toByteArray()), Base64Helper.DECODE)) {
            input.transferTo(decodedBytes);
        }

        assertArrayEquals(source, decodedBytes.toByteArray());
    }

    @Test
    void fileAdaptersRoundTripBinaryData() throws Exception {
        Path sourceFile = Files.createTempFile("modeling-core-source", ".bin");
        Path encodedFile = Files.createTempFile("modeling-core-encoded", ".txt");
        Path decodedFile = Files.createTempFile("modeling-core-decoded", ".bin");
        try {
            byte[] source = "file payload".getBytes(StandardCharsets.UTF_8);
            Files.write(sourceFile, source);

            String encoded = Base64Helper.encodeFromFile(sourceFile.toString());
            assertNotNull(encoded);
            Files.writeString(encodedFile, encoded, StandardCharsets.UTF_8);
            assertArrayEquals(source, Base64Helper.decodeFromFile(encodedFile.toString()));

            assertTrue(Base64Helper.encodeToFile(source, encodedFile.toString()));
            assertTrue(Base64Helper.decodeToFile(
                    Files.readString(encodedFile, StandardCharsets.UTF_8), decodedFile.toString()));
            assertArrayEquals(source, Files.readAllBytes(decodedFile));
        } finally {
            Files.deleteIfExists(sourceFile);
            Files.deleteIfExists(encodedFile);
            Files.deleteIfExists(decodedFile);
        }
    }
}