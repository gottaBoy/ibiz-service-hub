package net.ibizsys.modeling.core.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Compatibility helper for the modeling service's Base64 API.
 *
 * <p>The original implementation bundled a private Base64 codec. JDK 17
 * already provides a maintained codec, so this class keeps the public API and
 * delegates the encoding work to the standard library.</p>
 */
public final class Base64Helper {

    public static final int NO_OPTIONS = 0;
    public static final int ENCODE = 1;
    public static final int DECODE = 0;
    public static final int GZIP = 2;
    public static final int DONT_BREAK_LINES = 8;

    private static final byte[] GZIP_HEADER = {0x1f, (byte) 0x8b};

    private Base64Helper() {
    }

    public static String encodeObject(java.io.Serializable object) {
        return encodeObject(object, NO_OPTIONS);
    }

    public static String encodeObject(java.io.Serializable object, int options) {
        if (object == null) {
            return null;
        }
        try {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            try (ObjectOutputStream output = new ObjectOutputStream(bytes)) {
                output.writeObject(object);
            }
            return encodeBytes(bytes.toByteArray(), options);
        } catch (IOException ex) {
            return null;
        }
    }

    public static String encodeBytes(byte[] source) {
        return encodeBytes(source, NO_OPTIONS);
    }

    public static String encodeBytes(byte[] source, int options) {
        if (source == null) {
            return null;
        }
        return encodeBytes(source, 0, source.length, options);
    }

    public static String encodeBytes(byte[] source, int off, int len) {
        return encodeBytes(source, off, len, NO_OPTIONS);
    }

    public static String encodeBytes(byte[] source, int off, int len, int options) {
        if (source == null || off < 0 || len < 0 || off > source.length - len) {
            throw new IllegalArgumentException("Invalid source range");
        }
        byte[] input = Arrays.copyOfRange(source, off, off + len);
        if ((options & GZIP) != 0) {
            try {
                input = gzip(input);
            } catch (IOException ex) {
                return null;
            }
        }
        Base64.Encoder encoder = (options & DONT_BREAK_LINES) != 0
                ? Base64.getEncoder()
                : Base64.getMimeEncoder(76, new byte[] {'\n'});
        return encoder.encodeToString(input);
    }

    public static byte[] decode(byte[] source, int off, int len) {
        if (source == null || off < 0 || len < 0 || off > source.length - len) {
            throw new IllegalArgumentException("Invalid source range");
        }
        try {
            return Base64.getMimeDecoder().decode(Arrays.copyOfRange(source, off, off + len));
        } catch (IllegalArgumentException ex) {
            return null;
        }
    }

    public static byte[] decode(String encoded) {
        if (encoded == null) {
            return null;
        }
        byte[] decoded = decode(encoded.getBytes(StandardCharsets.UTF_8), 0,
                encoded.getBytes(StandardCharsets.UTF_8).length);
        if (isGzip(decoded)) {
            try {
                return gunzip(decoded);
            } catch (IOException ex) {
                return null;
            }
        }
        return decoded;
    }

    public static Object decodeToObject(String encodedObject) {
        byte[] bytes = decode(encodedObject);
        if (bytes == null) {
            return null;
        }
        try (ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(bytes))) {
            return input.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return null;
        }
    }

    public static boolean encodeToFile(byte[] dataToEncode, String filename) {
        try {
            Files.writeString(Path.of(filename), encodeBytes(dataToEncode), StandardCharsets.UTF_8);
            return true;
        } catch (IOException | RuntimeException ex) {
            return false;
        }
    }

    public static boolean decodeToFile(String dataToDecode, String filename) {
        try {
            byte[] decoded = decode(dataToDecode);
            if (decoded == null) {
                return false;
            }
            Files.write(Path.of(filename), decoded);
            return true;
        } catch (IOException | RuntimeException ex) {
            return false;
        }
    }

    public static byte[] decodeFromFile(String filename) {
        try {
            return decode(Files.readString(Path.of(filename), StandardCharsets.UTF_8));
        } catch (IOException | RuntimeException ex) {
            return null;
        }
    }

    public static String encodeFromFile(String filename) {
        try {
            return encodeBytes(Files.readAllBytes(Path.of(filename)));
        } catch (IOException | RuntimeException ex) {
            return null;
        }
    }

    private static byte[] gzip(byte[] source) throws IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (GZIPOutputStream output = new GZIPOutputStream(bytes)) {
            output.write(source);
        }
        return bytes.toByteArray();
    }

    private static byte[] gunzip(byte[] source) throws IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (GZIPInputStream input = new GZIPInputStream(new ByteArrayInputStream(source))) {
            input.transferTo(bytes);
        }
        return bytes.toByteArray();
    }

    private static boolean isGzip(byte[] bytes) {
        return bytes != null && bytes.length >= 2
                && bytes[0] == GZIP_HEADER[0] && bytes[1] == GZIP_HEADER[1];
    }

    /**
     * Buffered compatibility stream. Data is transformed when flushed or
     * closed, which keeps the legacy API while avoiding a second codec.
     */
    public static class OutputStream extends FilterOutputStream {

        private final boolean encode;
        private final boolean breakLines;
        private final ByteArrayOutputStream pending = new ByteArrayOutputStream();
        private boolean suspendEncoding;

        public OutputStream(java.io.OutputStream out) {
            this(out, ENCODE);
        }

        public OutputStream(java.io.OutputStream out, int options) {
            super(out);
            this.encode = (options & ENCODE) != 0;
            this.breakLines = (options & DONT_BREAK_LINES) == 0;
        }

        @Override
        public void write(int value) throws IOException {
            if (suspendEncoding) {
                out.write(value);
            } else {
                pending.write(value);
            }
        }

        @Override
        public void write(byte[] bytes, int off, int len) throws IOException {
            if (suspendEncoding) {
                out.write(bytes, off, len);
            } else {
                pending.write(bytes, off, len);
            }
        }

        public void flushBase64() throws IOException {
            if (pending.size() == 0) {
                return;
            }
            byte[] bytes = pending.toByteArray();
            if (encode) {
                Base64.Encoder encoder = breakLines
                        ? Base64.getMimeEncoder(76, new byte[] {'\n'})
                        : Base64.getEncoder();
                out.write(encoder.encode(bytes));
            } else {
                byte[] decoded = Base64.getMimeDecoder().decode(bytes);
                out.write(decoded);
            }
            pending.reset();
            out.flush();
        }

        @Override
        public void close() throws IOException {
            flushBase64();
            super.close();
        }

        public void suspendEncoding() throws IOException {
            flushBase64();
            suspendEncoding = true;
        }

        public void resumeEncoding() {
            suspendEncoding = false;
        }
    }

    /**
     * Buffered compatibility stream. The complete source is read on the
     * first read because Base64 groups data in blocks and the legacy API has
     * no explicit finalization method for input streams.
     */
    public static class InputStream extends FilterInputStream {

        private final boolean encode;
        private final boolean breakLines;
        private byte[] transformed;
        private int position;

        public InputStream(java.io.InputStream in) {
            this(in, DECODE);
        }

        public InputStream(java.io.InputStream in, int options) {
            super(in);
            this.encode = (options & ENCODE) != 0;
            this.breakLines = (options & DONT_BREAK_LINES) == 0;
        }

        private void ensureLoaded() throws IOException {
            if (transformed != null) {
                return;
            }
            byte[] source = in.readAllBytes();
            if (encode) {
                Base64.Encoder encoder = breakLines
                        ? Base64.getMimeEncoder(76, new byte[] {'\n'})
                        : Base64.getEncoder();
                transformed = encoder.encode(source);
            } else {
                try {
                    transformed = Base64.getMimeDecoder().decode(source);
                } catch (IllegalArgumentException ex) {
                    throw new IOException("Invalid Base64 input", ex);
                }
            }
        }

        @Override
        public int read() throws IOException {
            ensureLoaded();
            return position < transformed.length ? transformed[position++] & 0xff : -1;
        }

        @Override
        public int read(byte[] dest, int off, int len) throws IOException {
            if (dest == null) {
                throw new NullPointerException("dest");
            }
            if (off < 0 || len < 0 || off > dest.length - len) {
                throw new IndexOutOfBoundsException();
            }
            if (len == 0) {
                return 0;
            }
            ensureLoaded();
            if (position >= transformed.length) {
                return -1;
            }
            int count = Math.min(len, transformed.length - position);
            System.arraycopy(transformed, position, dest, off, count);
            position += count;
            return count;
        }
    }
}