package net.ibizsys.modeling.core.dataentity.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

class BasicModelDTOTest {

    @Test
    void systemModelLogSupportsCommonIdentityAndTimestamps() throws Exception {
        PSSysModelLogDTO dto = new PSSysModelLogDTO();
        Timestamp timestamp = Timestamp.valueOf("2026-09-06 12:34:56");

        assertEquals("pssysmodellogid",
                PSSysModelLogDTO.class.getMethod("setPSSysModelLogId", String.class)
                        .getAnnotation(JsonProperty.class).value());
        assertFalse(dto.isPSSysModelLogIdDirty());
        assertSame(dto, dto.id("log-1").name("Model log").createdate(timestamp));
        assertEquals("log-1", dto.getId());
        assertEquals("Model log", dto.getName());
        assertEquals(timestamp, dto.getCreateDate());
        JsonFormat format = PSSysModelLogDTO.class.getMethod("setCreateDate", Timestamp.class)
                .getAnnotation(JsonFormat.class);
        assertNotNull(format);
        assertEquals("yyyy-MM-dd HH:mm:ss", format.pattern());
        dto.resetCreateDate();
        assertFalse(dto.isCreateDateDirty());
    }

    @Test
    void simpleReferenceDtosConvertBooleanFlagsAndResetFields() {
        PSLanguageDTO language = new PSLanguageDTO().id("zh").name("Chinese").validflag(true);
        PSAppTypeDTO appType = new PSAppTypeDTO().id("web").name("Web").mobilemode(false);
        PSDEJoinTypeDTO joinType = new PSDEJoinTypeDTO().id("left").name("Left").mainflag(true).validflag(false);
        PSDBValueOPDTO operator = new PSDBValueOPDTO().id("eq").name("Equals").dbflag(true).dlflag(false)
                .validflag((Boolean) null);

        assertEquals("zh", language.getPSLanguageId());
        assertEquals(1, language.getValidFlag());
        assertEquals(0, appType.getMobileMode());
        assertEquals(1, joinType.getMainFlag());
        assertEquals(0, joinType.getValidFlag());
        assertEquals(1, operator.getDBFlag());
        assertEquals(0, operator.getDLFlag());
        assertTrue(operator.isValidFlagDirty());
        operator.resetValidFlag();
        assertFalse(operator.isValidFlagDirty());
    }

    @Test
    void fluentMethodsReturnTheConcreteDtoType() throws Exception {
        Method languageMethod = PSLanguageDTO.class.getMethod("name", String.class);
        Method appTypeMethod = PSAppTypeDTO.class.getMethod("mobilemode", Boolean.class);
        Method joinTypeMethod = PSDEJoinTypeDTO.class.getMethod("mainflag", Boolean.class);
        Method operatorMethod = PSDBValueOPDTO.class.getMethod("dbflag", Boolean.class);

        assertEquals(PSLanguageDTO.class, languageMethod.getReturnType());
        assertEquals(PSAppTypeDTO.class, appTypeMethod.getReturnType());
        assertEquals(PSDEJoinTypeDTO.class, joinTypeMethod.getReturnType());
        assertEquals(PSDBValueOPDTO.class, operatorMethod.getReturnType());
    }
}