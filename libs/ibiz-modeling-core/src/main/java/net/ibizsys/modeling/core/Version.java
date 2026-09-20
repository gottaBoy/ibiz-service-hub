package net.ibizsys.modeling.core;

/**
 * Version of the modeling core source line.
 *
 * <p>The values mirror the modeling service artifact currently being
 * recovered. They stay in source so a rebuilt service does not depend on a
 * binary-only version class.</p>
 */
public class Version {

    public static final Integer MAJOR = 9;
    public static final Integer MINOR = 0;
    public static final Integer FUNC = 0;
    public static final Integer FIX = 62;
    public static final Integer DATE = 250815;

    @Override
    public String toString() {
        return getVersionString();
    }

    public static String getVersionString() {
        return String.format("%d.%d.%d-beta.%d", MAJOR, MINOR, FUNC, FIX);
    }
}