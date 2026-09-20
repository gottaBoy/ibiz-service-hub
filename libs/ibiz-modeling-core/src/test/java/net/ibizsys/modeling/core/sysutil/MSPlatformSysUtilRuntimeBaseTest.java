package net.ibizsys.modeling.core.sysutil;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import net.ibizsys.modeling.core.addin.IPSDCMSPlatformProvider;

class MSPlatformSysUtilRuntimeBaseTest {

    @Test
    void uninstallClearsBuiltInAndRuntimeProviderMaps() throws Throwable {
        TestRuntime runtime = new TestRuntime();
        Map<String, IPSDCMSPlatformProvider> builtInProviders = new HashMap<>();
        Map<String, IPSDCMSPlatformProvider> runtimeProviders = new HashMap<>();
        builtInProviders.put("IBIZCLOUD", null);
        runtimeProviders.put("CUSTOM", null);
        setField(runtime, "psDCMSPlatformProviderMap", builtInProviders);
        setField(runtime, "psDCMSPlatformProviderMap2", runtimeProviders);

        runtime.uninstallForTest();

        assertTrue(builtInProviders.isEmpty());
        assertTrue(runtimeProviders.isEmpty());
    }

    private static void setField(Object target, String name, Object value) throws ReflectiveOperationException {
        Field field = MSPlatformSysUtilRuntimeBase.class.getDeclaredField(name);
        field.setAccessible(true);
        field.set(target, value);
    }

    private static class TestRuntime extends MSPlatformSysUtilRuntimeBase {
        void uninstallForTest() throws Throwable {
            onUninstall();
        }
    }
}