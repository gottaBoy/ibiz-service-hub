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

import net.ibizsys.model.PSModelEnums;

class PSModuleDTOTest {

    @Test
    void settersKeepJsonNamesAndDirtyState() throws Exception {
        PSModuleDTO module = new PSModuleDTO();

        Method setter = PSModuleDTO.class.getMethod("setPSModuleId", String.class);
        assertEquals("psmoduleid", setter.getAnnotation(JsonProperty.class).value());
        assertFalse(module.isPSModuleIdDirty());

        module.setPSModuleId("module-1");
        assertEquals("module-1", module.getPSModuleId());
        assertTrue(module.isPSModuleIdDirty());

        module.resetPSModuleId();
        assertEquals(null, module.getPSModuleId());
        assertFalse(module.isPSModuleIdDirty());
    }

    @Test
    void booleanAndEnumConvenienceMethodsUseModelValues() {
        PSModuleDTO module = new PSModuleDTO()
                .defaultflag(true)
                .enablepql(false)
                .noviewmode(true)
                .reqmodule(false)
                .subsysmodule(true)
                .dslink(PSModelEnums.DataSourceLink.DB2)
                .codenamemode(PSModelEnums.CodeNameMode.LOWER_CAMEL)
                .serviceapiflag(PSModelEnums.DEServiceAPIMode.SUPPORTED)
                .sysreftype(PSModelEnums.SysRefType.DEVSYS)
                .usercat(PSModelEnums.ModelUserCat.CAT1)
                .utiltype(PSModelEnums.ModuleUtilType.USER);

        assertEquals(1, module.getDefaultFlag());
        assertEquals(0, module.getEnablePQL());
        assertEquals(1, module.getNoViewMode());
        assertEquals(0, module.getReqModule());
        assertEquals(1, module.getSubSysModule());
        assertEquals("DB2", module.getDSLink());
        assertEquals("LOWER_CAMEL", module.getCodeNameMode());
        assertEquals(1, module.getServiceAPIFlag());
        assertEquals("DEVSYS", module.getSysRefType());
        assertEquals("CAT1", module.getUserCat());
        assertEquals("USER", module.getUtilType());
    }

    @Test
    void aliasesAndTimestampUseTheExpectedProperties() throws Exception {
        PSModuleDTO module = new PSModuleDTO();
        Timestamp timestamp = Timestamp.valueOf("2026-09-06 12:34:56");

        assertSame(module, module.id("module-1").name("Orders"));
        assertEquals("module-1", module.getId());
        assertEquals("Orders", module.getName());

        module.setCreateDate(timestamp);
        assertEquals(timestamp, module.getCreateDate());
        JsonFormat format = PSModuleDTO.class.getMethod("setCreateDate", Timestamp.class)
                .getAnnotation(JsonFormat.class);
        assertNotNull(format);
        assertEquals("yyyy-MM-dd HH:mm:ss", format.pattern());
        assertEquals("GMT+8", format.timezone());
    }
}