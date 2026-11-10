package net.ibizsys.modeling.core.database;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnSysService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysModelInstService;

class ModelSysDBSchemeServiceInjectionTest {

    @Test
    void runtimeAutowiringUsesModelServiceInterfacesInsteadOfCollections() {
        List<Field> injected = Arrays.stream(ModelSysDBSchemeRuntimeBase.class.getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(Autowired.class))
                .collect(Collectors.toList());
        assertEquals(2, injected.size());
        assertTrue(injected.stream().anyMatch(field ->
                field.getType() == IPSDevSlnSysService.class));
        assertTrue(injected.stream().anyMatch(field ->
                field.getType() == IPSSysModelInstService.class));
        assertEquals("PSDEVSLNSYS",
                IPSDevSlnSysService.class.getAnnotation(Qualifier.class).value());
        assertEquals("PSSYSMODELINST",
                IPSSysModelInstService.class.getAnnotation(Qualifier.class).value());
    }

    @Test
    void repositoryLookupUsesInjectedTypedService() throws Exception {
        ModelSysDBSchemeRuntimeBase runtime = new ModelSysDBSchemeRuntimeBase() {};
        IPSDevSlnSysService service = (IPSDevSlnSysService) Proxy.newProxyInstance(
                getClass().getClassLoader(), new Class<?>[] { IPSDevSlnSysService.class },
                (proxy, method, args) -> {
                    if (method.getName().equals("get")) {
                        return null;
                    }
                    throw new AssertionError(method.getName());
                });
        Field field = ModelSysDBSchemeRuntimeBase.class.getDeclaredField("iPSDevSlnSysService");
        field.setAccessible(true);
        field.set(runtime, service);
        Method lookup = ModelSysDBSchemeRuntimeBase.class.getDeclaredMethod("getService",
                Object.class, String.class, String.class, Object[].class);
        lookup.setAccessible(true);
        assertEquals(null, lookup.invoke(runtime, null, "IPSDevSlnSysService", "get",
                new Object[] { "solution", true }));
    }

    public static class OverloadedService {
        public String get(List<String> keys, boolean tryMode) {
            throw new AssertionError("Collection overload must not receive a system id");
        }

        public String get(Object key, boolean tryMode) {
            return "object:" + key;
        }

        public String get(String key, boolean tryMode) {
            return key + ":" + tryMode;
        }
    }

    @Test
    void repositoryLookupMatchesArgumentTypesAndPrefersSpecificOverload() throws Exception {
        ModelSysDBSchemeRuntimeBase runtime = new ModelSysDBSchemeRuntimeBase() {};
        Method lookup = ModelSysDBSchemeRuntimeBase.class.getDeclaredMethod("getService",
                Object.class, String.class, String.class, Object[].class);
        lookup.setAccessible(true);
        assertEquals("solution:true", lookup.invoke(runtime, new OverloadedService(),
                "IPSDevSlnSysService", "get", new Object[] { "solution", true }));
        assertEquals("object:42", lookup.invoke(runtime, new OverloadedService(),
                "IPSDevSlnSysService", "get", new Object[] { 42, false }));
        InvocationTargetException error = assertThrows(InvocationTargetException.class,
                () -> lookup.invoke(runtime, new OverloadedService(), "IPSDevSlnSysService",
                        "get", new Object[] { "solution", "not-a-boolean" }));
        assertTrue(error.getCause().getMessage().contains("get"));
    }

    public static class InterfaceOverloads {
        public String get(CharSequence key, boolean tryMode) {
            return "sequence";
        }

        public String get(Serializable key, boolean tryMode) {
            return "serializable";
        }

        public String get(String key, boolean tryMode) {
            return "string:" + key;
        }
    }

    @Test
    void commonConcreteOverloadWinsRegardlessOfEnumerationOrder() throws Exception {
        Method sequence = InterfaceOverloads.class.getMethod("get", CharSequence.class, boolean.class);
        Method serializable = InterfaceOverloads.class.getMethod("get", Serializable.class, boolean.class);
        Method concrete = InterfaceOverloads.class.getMethod("get", String.class, boolean.class);
        Method select = ModelSysDBSchemeRuntimeBase.class.getDeclaredMethod(
                "selectMethod", List.class, String.class);
        select.setAccessible(true);
        for (List<Method> order : Arrays.asList(
                Arrays.asList(sequence, serializable, concrete),
                Arrays.asList(sequence, concrete, serializable),
                Arrays.asList(serializable, sequence, concrete),
                Arrays.asList(serializable, concrete, sequence),
                Arrays.asList(concrete, sequence, serializable),
                Arrays.asList(concrete, serializable, sequence))) {
            assertEquals(concrete, select.invoke(null, order, "get"));
        }
        Method lookup = ModelSysDBSchemeRuntimeBase.class.getDeclaredMethod("getService",
                Object.class, String.class, String.class, Object[].class);
        lookup.setAccessible(true);
        assertEquals("string:solution", lookup.invoke(new ModelSysDBSchemeRuntimeBase() {},
                new InterfaceOverloads(), "IPSDevSlnSysService", "get",
                new Object[] { "solution", true }));
    }

    @Test
    void trulyIncomparableOverloadsFailInsteadOfSelectingAnArbitraryMethod() throws Exception {
        Method sequence = InterfaceOverloads.class.getMethod("get", CharSequence.class, boolean.class);
        Method serializable = InterfaceOverloads.class.getMethod("get", Serializable.class, boolean.class);
        Method select = ModelSysDBSchemeRuntimeBase.class.getDeclaredMethod(
                "selectMethod", List.class, String.class);
        select.setAccessible(true);
        for (List<Method> order : Arrays.asList(
                Arrays.asList(sequence, serializable), Arrays.asList(serializable, sequence))) {
            InvocationTargetException error = assertThrows(InvocationTargetException.class,
                    () -> select.invoke(null, order, "get"));
            assertTrue(error.getCause() instanceof NoSuchMethodException);
            assertTrue(error.getCause().getMessage().contains("Ambiguous"));
        }
    }
}
