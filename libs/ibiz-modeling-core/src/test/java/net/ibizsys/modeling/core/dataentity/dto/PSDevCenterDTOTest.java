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

class PSDevCenterDTOTest {

    @Test
    void fieldConstantsMatchJsonSetters() throws Exception {
        List<Field> fieldConstants = Arrays.stream(PSDevCenterDTO.class.getDeclaredFields())
                .filter(field -> Modifier.isPublic(field.getModifiers()))
                .filter(field -> Modifier.isStatic(field.getModifiers()))
                .filter(field -> Modifier.isFinal(field.getModifiers()))
                .filter(field -> field.getType() == String.class)
                .filter(field -> field.getName().startsWith("FIELD_"))
                .collect(Collectors.toList());

        Set<String> fieldNames = fieldConstants.stream()
                .map(field -> getString(field).toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());
        List<Method> jsonSetters = Arrays.stream(PSDevCenterDTO.class.getDeclaredMethods())
                .filter(method -> method.getAnnotation(JsonProperty.class) != null)
                .filter(method -> method.getName().startsWith("set"))
                .filter(method -> method.getReturnType() == void.class)
                .filter(method -> method.getParameterCount() == 1)
                .collect(Collectors.toList());
        Set<String> jsonNames = jsonSetters.stream()
                .map(method -> method.getAnnotation(JsonProperty.class).value())
                .collect(Collectors.toSet());

        assertEquals(61, fieldConstants.size());
        assertEquals(61, fieldNames.size());
        assertEquals(61, jsonSetters.size());
        assertEquals(61, jsonNames.size());
        assertEquals(fieldNames, jsonNames);

        for (Field field : fieldConstants) {
            String fieldValue = getString(field);
            Field dtoField = PSDevCenterDTO.class.getDeclaredField(
                    "DTOFIELD_" + field.getName().substring("FIELD_".length()));
            assertEquals(fieldValue.toLowerCase(Locale.ROOT), getString(dtoField));
        }
    }

    @Test
    void settersKeepDirtyStateAndAliasesUseTheDevCenterIdAndName() {
        PSDevCenterDTO center = new PSDevCenterDTO();

        assertFalse(center.isPSDevCenterIdDirty());
        assertSame(center, center.id("center-1").name("Development Center"));
        assertEquals("center-1", center.getId());
        assertEquals("center-1", center.getPSDevCenterId());
        assertEquals("Development Center", center.getName());
        assertEquals("Development Center", center.getPSDevCenterName());
        assertTrue(center.isPSDevCenterIdDirty());

        center.resetPSDevCenterId();
        assertNull(center.getPSDevCenterId());
        assertFalse(center.isPSDevCenterIdDirty());
    }

    @Test
    void booleanAndEnumConvenienceMethodsUseModelValues() {
        PSDevCenterDTO center = new PSDevCenterDTO()
                .dcapiflag(true)
                .enabledeploycenter(false)
                .enableworkspace(true)
                .enablewsserver(false)
                .linkibiz5flag(true)
                .spflag(false)
                .sysapiflag(true)
                .validflag(false)
                .dclevel(PSModelEnums.DevCenterLevel.PROFESSIONAL)
                .dctype(PSModelEnums.DevCenterType.DEVCENTER);

        assertEquals(1, center.getDCAPIFlag());
        assertEquals(0, center.getEnableDeployCenter());
        assertEquals(1, center.getEnableWorkspace());
        assertEquals(0, center.getEnableWSServer());
        assertEquals(1, center.getLinkIBiz5Flag());
        assertEquals(0, center.getSPFlag());
        assertEquals(1, center.getSysAPIFlag());
        assertEquals(0, center.getValidFlag());
        assertEquals(PSModelEnums.DevCenterLevel.PROFESSIONAL.value, center.getDCLevel());
        assertEquals(PSModelEnums.DevCenterType.DEVCENTER.value, center.getDCType());

        center.dcapiflag((Boolean) null)
                .enabledeploycenter((Boolean) null)
                .enableworkspace((Boolean) null)
                .enablewsserver((Boolean) null)
                .linkibiz5flag((Boolean) null)
                .spflag((Boolean) null)
                .sysapiflag((Boolean) null)
                .validflag((Boolean) null)
                .dclevel((PSModelEnums.DevCenterLevel) null)
                .dctype((PSModelEnums.DevCenterType) null);

        assertNull(center.getDCAPIFlag());
        assertNull(center.getEnableDeployCenter());
        assertNull(center.getEnableWorkspace());
        assertNull(center.getEnableWSServer());
        assertNull(center.getLinkIBiz5Flag());
        assertNull(center.getSPFlag());
        assertNull(center.getSysAPIFlag());
        assertNull(center.getValidFlag());
        assertNull(center.getDCLevel());
        assertNull(center.getDCType());
    }

    @Test
    void timestampSettersUseTheExpectedJsonFormat() throws Exception {
        PSDevCenterDTO center = new PSDevCenterDTO();
        Timestamp timestamp = Timestamp.valueOf("2026-09-06 12:34:56");
        List<String> timestampSetters = Arrays.asList(
                "setCreateDate",
                "setExpiredTime",
                "setMobCertChgTime",
                "setMobTDChgTime",
                "setRobotChgTime",
                "setUpdateDate");

        for (String methodName : timestampSetters) {
            Method setter = PSDevCenterDTO.class.getMethod(methodName, Timestamp.class);
            setter.invoke(center, timestamp);
            JsonFormat format = setter.getAnnotation(JsonFormat.class);
            assertNotNull(format, methodName);
            assertEquals("yyyy-MM-dd HH:mm:ss", format.pattern(), methodName);
            assertEquals("zh", format.locale(), methodName);
            assertEquals("GMT+8", format.timezone(), methodName);
        }

        assertEquals(timestamp, center.getCreateDate());
        assertEquals(timestamp, center.getExpiredTime());
        assertEquals(timestamp, center.getMobCertChgTime());
        assertEquals(timestamp, center.getMobTDChgTime());
        assertEquals(timestamp, center.getRobotChgTime());
        assertEquals(timestamp, center.getUpdateDate());
    }

    private static String getString(Field field) {
        try {
            return (String) field.get(null);
        } catch (IllegalAccessException ex) {
            throw new AssertionError(ex);
        }
    }
}