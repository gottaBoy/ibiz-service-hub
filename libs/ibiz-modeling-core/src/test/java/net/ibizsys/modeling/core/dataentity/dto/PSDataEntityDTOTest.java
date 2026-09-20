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

class PSDataEntityDTOTest {

    @Test
    void fieldConstantsMatchJsonSetters() throws Exception {
        List<Field> fieldConstants = Arrays.stream(PSDataEntityDTO.class.getDeclaredFields())
                .filter(field -> Modifier.isPublic(field.getModifiers()))
                .filter(field -> Modifier.isStatic(field.getModifiers()))
                .filter(field -> Modifier.isFinal(field.getModifiers()))
                .filter(field -> field.getType() == String.class)
                .filter(field -> field.getName().startsWith("FIELD_"))
                .collect(Collectors.toList());

        Set<String> fieldNames = fieldConstants.stream()
                .map(field -> getString(field).toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());
        List<Method> jsonSetters = Arrays.stream(PSDataEntityDTO.class.getDeclaredMethods())
                .filter(method -> method.getAnnotation(JsonProperty.class) != null)
                .filter(method -> method.getName().startsWith("set"))
                .filter(method -> method.getReturnType() == void.class)
                .filter(method -> method.getParameterCount() == 1)
                .collect(Collectors.toList());
        Set<String> jsonNames = jsonSetters.stream()
                .map(method -> method.getAnnotation(JsonProperty.class).value())
                .collect(Collectors.toSet());

        assertEquals(98, fieldConstants.size());
        assertEquals(98, fieldNames.size());
        assertEquals(98, jsonSetters.size());
        assertEquals(98, jsonNames.size());
        assertEquals(fieldNames, jsonNames);

        for (Field field : fieldConstants) {
            String fieldValue = getString(field);
            Field dtoField = PSDataEntityDTO.class.getDeclaredField(
                    "DTOFIELD_" + field.getName().substring("FIELD_".length()));
            assertEquals(fieldValue.toLowerCase(Locale.ROOT), getString(dtoField));
        }
    }

    @Test
    void settersKeepDirtyState() {
        PSDataEntityDTO entity = new PSDataEntityDTO();

        assertFalse(entity.isPSDataEntityIdDirty());
        entity.setPSDataEntityId("entity-1");
        assertEquals("entity-1", entity.getPSDataEntityId());
        assertTrue(entity.isPSDataEntityIdDirty());

        entity.resetPSDataEntityId();
        assertNull(entity.getPSDataEntityId());
        assertFalse(entity.isPSDataEntityIdDirty());
    }

    @Test
    void convenienceMethodsUseModelValues() {
        PSDataEntityDTO entity = new PSDataEntityDTO();

        entity.enableaudit(true);
        assertEquals(1, entity.getEnableAudit());
        entity.enableaudit(false);
        assertEquals(0, entity.getEnableAudit());
        entity.enableaudit((Boolean) null);
        assertNull(entity.getEnableAudit());

        entity.detype(PSModelEnums.DEType.MAJOR)
                .usercat(PSModelEnums.ModelUserCat.CAT1)
                .useraction(new PSModelEnums.DEUserUIAbility[] {
                        PSModelEnums.DEUserUIAbility.NOCREATE,
                        null,
                        PSModelEnums.DEUserUIAbility.NOREMOVE
                });

        assertEquals(PSModelEnums.DEType.MAJOR.value, entity.getDEType());
        assertEquals(PSModelEnums.ModelUserCat.CAT1.value, entity.getUserCat());
        assertEquals(5, entity.getUserAction());

        entity.useraction(new PSModelEnums.DEUserUIAbility[0]);
        assertNull(entity.getUserAction());
        entity.useraction((PSModelEnums.DEUserUIAbility[]) null);
        assertNull(entity.getUserAction());
    }

    @Test
    void aliasesAndTimestampsUseExpectedProperties() throws Exception {
        PSDataEntityDTO entity = new PSDataEntityDTO();
        Timestamp timestamp = Timestamp.valueOf("2026-09-06 12:34:56");

        assertSame(entity, entity.id("entity-1").name("Orders"));
        assertEquals("entity-1", entity.getId());
        assertEquals("Orders", entity.getName());

        entity.setCreateDate(timestamp);
        entity.setUpdateDate(timestamp);
        assertEquals(timestamp, entity.getCreateDate());
        assertEquals(timestamp, entity.getUpdateDate());

        for (String methodName : Arrays.asList("setCreateDate", "setUpdateDate")) {
            JsonFormat format = PSDataEntityDTO.class.getMethod(methodName, Timestamp.class)
                    .getAnnotation(JsonFormat.class);
            assertNotNull(format);
            assertEquals("yyyy-MM-dd HH:mm:ss", format.pattern());
            assertEquals("zh", format.locale());
            assertEquals("GMT+8", format.timezone());
        }
    }

    @Test
    void moduleConvenienceMethodCopiesAndClearsRelatedValues() {
        PSModuleDTO module = new PSModuleDTO()
                .id("module-1")
                .name("Sales")
                .color("#336699")
                .subsysmodule(true);
        PSDataEntityDTO entity = new PSDataEntityDTO();

        assertSame(entity, entity.psmoduleid(module));
        assertEquals("module-1", entity.getPSModuleId());
        assertEquals("Sales", entity.getPSModuleName());
        assertEquals("#336699", entity.getModColor());
        assertEquals(1, entity.getSubSysModule());

        assertSame(entity, entity.psmoduleid((PSModuleDTO) null));
        assertNull(entity.getPSModuleId());
        assertNull(entity.getPSModuleName());
        assertNull(entity.getModColor());
        assertNull(entity.getSubSysModule());
    }

    private static String getString(Field field) {
        try {
            return (String) field.get(null);
        } catch (IllegalAccessException ex) {
            throw new AssertionError(ex);
        }
    }
}