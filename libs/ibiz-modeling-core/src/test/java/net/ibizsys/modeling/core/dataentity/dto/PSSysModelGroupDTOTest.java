package net.ibizsys.modeling.core.dataentity.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;

class PSSysModelGroupDTOTest {

    @Test
    void fieldConstantsMatchJsonSetters() throws Exception {
        List<Field> fieldConstants = Arrays.stream(PSSysModelGroupDTO.class.getDeclaredFields())
                .filter(field -> Modifier.isPublic(field.getModifiers()))
                .filter(field -> Modifier.isStatic(field.getModifiers()))
                .filter(field -> Modifier.isFinal(field.getModifiers()))
                .filter(field -> field.getType() == String.class)
                .filter(field -> field.getName().startsWith("FIELD_"))
                .collect(Collectors.toList());

        Set<String> fieldNames = fieldConstants.stream()
                .map(field -> getString(field).toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());
        List<Method> jsonSetters = Arrays.stream(PSSysModelGroupDTO.class.getDeclaredMethods())
                .filter(method -> method.getAnnotation(JsonProperty.class) != null)
                .filter(method -> method.getName().startsWith("set"))
                .filter(method -> method.getReturnType() == void.class)
                .filter(method -> method.getParameterCount() == 1)
                .collect(Collectors.toList());
        Set<String> jsonNames = jsonSetters.stream()
                .map(method -> method.getAnnotation(JsonProperty.class).value())
                .collect(Collectors.toSet());

        assertEquals(30, fieldConstants.size());
        assertEquals(30, fieldNames.size());
        assertEquals(30, jsonSetters.size());
        assertEquals(30, jsonNames.size());
        assertEquals(fieldNames, jsonNames);

        for (Field field : fieldConstants) {
            String fieldValue = getString(field);
            Field dtoField = PSSysModelGroupDTO.class.getDeclaredField(
                    "DTOFIELD_" + field.getName().substring("FIELD_".length()));
            assertEquals(fieldValue.toLowerCase(Locale.ROOT), getString(dtoField));
        }
    }

    @Test
    void dirtyStateConvenienceMethodsAndAliasesMatchTheModelContract() {
        PSSysModelGroupDTO group = new PSSysModelGroupDTO();

        assertFalse(group.isPSSysModelGroupIdDirty());
        assertSame(group, group.id("group-1")
                .name("Core")
                .enablepql(true)
                .codenamemode(PSModelEnums.CodeNameMode.LOWER_CAMEL)
                .syncmode(PSModelEnums.ModelSyncMode.ALWAYS)
                .sysmodelfrom(PSModelEnums.ModelRepoFrom.DC)
                .usercat(PSModelEnums.ModelUserCat.CAT2));

        assertEquals("group-1", group.getId());
        assertEquals("Core", group.getName());
        assertEquals(1, group.getEnablePQL());
        assertEquals(PSModelEnums.CodeNameMode.LOWER_CAMEL.value, group.getCodeNameMode());
        assertEquals(PSModelEnums.ModelSyncMode.ALWAYS.value, group.getSyncMode());
        assertEquals(PSModelEnums.ModelRepoFrom.DC.value, group.getSysModelFrom());
        assertEquals(PSModelEnums.ModelUserCat.CAT2.value, group.getUserCat());
        assertTrue(group.isPSSysModelGroupIdDirty());

        group.enablepql(false);
        assertEquals(0, group.getEnablePQL());
        group.enablepql((Boolean) null);
        assertNull(group.getEnablePQL());

        group.resetPSSysModelGroupId();
        assertNull(group.getPSSysModelGroupId());
        assertFalse(group.isPSSysModelGroupIdDirty());
    }

    @Test
    void timestampsUseExpectedFormat() throws Exception {
        PSSysModelGroupDTO group = new PSSysModelGroupDTO();
        Timestamp timestamp = Timestamp.valueOf("2026-09-06 12:34:56");

        group.setCreateDate(timestamp);
        group.setUpdateDate(timestamp);
        assertEquals(timestamp, group.getCreateDate());
        assertEquals(timestamp, group.getUpdateDate());

        for (String methodName : Arrays.asList("setCreateDate", "setUpdateDate")) {
            JsonFormat format = PSSysModelGroupDTO.class.getMethod(methodName, Timestamp.class)
                    .getAnnotation(JsonFormat.class);
            assertNotNull(format);
            assertEquals("yyyy-MM-dd HH:mm:ss", format.pattern());
            assertEquals("zh", format.locale());
            assertEquals("GMT+8", format.timezone());
        }
    }

    @Test
    void moduleConvenienceMethodCopiesAndClearsModelGroupValues() {
        PSSysModelGroupDTO group = new PSSysModelGroupDTO()
                .id("group-1")
                .name("Core");
        PSModuleDTO module = new PSModuleDTO();

        assertSame(module, module.pssysmodelgroupid(group));
        assertEquals("group-1", module.getPSSysModelGroupId());
        assertEquals("Core", module.getPSSysModelGroupName());

        assertSame(module, module.pssysmodelgroupid((PSSysModelGroupDTO) null));
        assertNull(module.getPSSysModelGroupId());
        assertNull(module.getPSSysModelGroupName());
    }

    private static String getString(Field field) {
        try {
            return (String) field.get(null);
        } catch (IllegalAccessException ex) {
            throw new AssertionError(ex);
        }
    }
}