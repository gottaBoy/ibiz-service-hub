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
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;

class PSAppDataEntityDTOTest {

    @Test
    void fieldConstantsMatchJsonSetters() throws Exception {
        List<Field> fieldConstants = Arrays.stream(PSAppDataEntityDTO.class.getDeclaredFields())
                .filter(field -> Modifier.isPublic(field.getModifiers()))
                .filter(field -> Modifier.isStatic(field.getModifiers()))
                .filter(field -> Modifier.isFinal(field.getModifiers()))
                .filter(field -> field.getType() == String.class)
                .filter(field -> field.getName().startsWith("FIELD_"))
                .collect(Collectors.toList());

        Set<String> fieldNames = fieldConstants.stream()
                .map(field -> getString(field).toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());
        List<Method> jsonSetters = Arrays.stream(PSAppDataEntityDTO.class.getDeclaredMethods())
                .filter(method -> method.getAnnotation(JsonProperty.class) != null)
                .filter(method -> method.getName().startsWith("set"))
                .filter(method -> method.getReturnType() == void.class)
                .filter(method -> method.getParameterCount() == 1)
                .collect(Collectors.toList());
        Set<String> jsonNames = jsonSetters.stream()
                .map(method -> method.getAnnotation(JsonProperty.class).value())
                .collect(Collectors.toSet());

        assertEquals(60, fieldConstants.size());
        assertEquals(60, fieldNames.size());
        assertEquals(60, jsonSetters.size());
        assertEquals(60, jsonNames.size());

        Map<String, String> aliases = new HashMap<>();
        aliases.put("FIELD_STORAGEMODE", "storagemode");
        aliases.put("FIELD_PPSAPPDATAENTITYID", "ppsappdataentityid");
        aliases.put("FIELD_PPSAPPDATAENTITYNAME", "ppsappdataentityname");
        aliases.put("FIELD_PSAPPDATAENTITYID", "psappdataentityid");
        aliases.put("FIELD_PSAPPDATAENTITYNAME", "psappdataentityname");

        for (Field field : fieldConstants) {
            String expectedJsonName = aliases.getOrDefault(
                    field.getName(),
                    getString(field).toLowerCase(Locale.ROOT));
            assertTrue(jsonNames.contains(expectedJsonName), field.getName());

            Field dtoField = PSAppDataEntityDTO.class.getDeclaredField(
                    "DTOFIELD_" + field.getName().substring("FIELD_".length()));
            String dtoFieldName = getString(dtoField);
            assertEquals(
                    field.getName().equals("FIELD_STORAGEMODE")
                            ? "storagemode"
                            : field.getName().equals("FIELD_PPSAPPDATAENTITYID")
                                    ? "ppsappdataentityid"
                                    : field.getName().equals("FIELD_PPSAPPDATAENTITYNAME")
                                            ? "ppsappdataentityname"
                                            : field.getName().equals("FIELD_PSAPPDATAENTITYID")
                                                    ? "psappdataentityid"
                                                    : field.getName().equals("FIELD_PSAPPDATAENTITYNAME")
                                                            ? "psappdataentityname"
                                                            : getString(field).toLowerCase(Locale.ROOT),
                    dtoFieldName);
        }
    }

    @Test
    void booleanEnumsAndUserActionUseModelValues() {
        PSAppDataEntityDTO entity = new PSAppDataEntityDTO()
                .customuseraction(true)
                .defaultflag(false)
                .validflag(true)
                .accctrlarch(PSModelEnums.AccCtrlArch.SYSROLEANDDEROLE)
                .dataaccmode(PSModelEnums.DEDataAccCtrlMode.MASTER)
                .defgroupmode(PSModelEnums.SADEDEFGroupMode.EXCLUDE)
                .storagemode(PSModelEnums.AppDEStorageMode.LOCALANDREMOTE)
                .majorflag(PSModelEnums.AppDEMode.AUTO)
                .usercat(PSModelEnums.ModelUserCat.CAT3)
                .useraction(new PSModelEnums.DEUserUIAbility[] {
                        PSModelEnums.DEUserUIAbility.NOCREATE,
                        null,
                        PSModelEnums.DEUserUIAbility.NOREMOVE
                });

        assertEquals(1, entity.getCustomUserAction());
        assertEquals(0, entity.getDefaultFlag());
        assertEquals(1, entity.getValidFlag());
        assertEquals(PSModelEnums.AccCtrlArch.SYSROLEANDDEROLE.value, entity.getAccCtrlArch());
        assertEquals(PSModelEnums.DEDataAccCtrlMode.MASTER.value, entity.getDataAccMode());
        assertEquals(PSModelEnums.SADEDEFGroupMode.EXCLUDE.value, entity.getDEFGroupMode());
        assertEquals(PSModelEnums.AppDEStorageMode.LOCALANDREMOTE.value, entity.getStorageMode());
        assertEquals(PSModelEnums.AppDEMode.AUTO.value, entity.getMajorFlag());
        assertEquals(PSModelEnums.ModelUserCat.CAT3.value, entity.getUserCat());
        assertEquals(5, entity.getUserAction());

        entity.customuseraction((Boolean) null)
                .defaultflag((Boolean) null)
                .validflag((Boolean) null)
                .accctrlarch((PSModelEnums.AccCtrlArch) null)
                .dataaccmode((PSModelEnums.DEDataAccCtrlMode) null)
                .defgroupmode((PSModelEnums.SADEDEFGroupMode) null)
                .storagemode((PSModelEnums.AppDEStorageMode) null)
                .majorflag((PSModelEnums.AppDEMode) null)
                .usercat((PSModelEnums.ModelUserCat) null)
                .useraction(new PSModelEnums.DEUserUIAbility[0]);

        assertNull(entity.getCustomUserAction());
        assertNull(entity.getDefaultFlag());
        assertNull(entity.getValidFlag());
        assertNull(entity.getAccCtrlArch());
        assertNull(entity.getDataAccMode());
        assertNull(entity.getDEFGroupMode());
        assertNull(entity.getStorageMode());
        assertNull(entity.getMajorFlag());
        assertNull(entity.getUserCat());
        assertNull(entity.getUserAction());
    }

    @Test
    void aliasesStorageAndTimestampsUseExpectedProperties() throws Exception {
        PSAppDataEntityDTO entity = new PSAppDataEntityDTO();
        Timestamp timestamp = Timestamp.valueOf("2026-09-06 12:34:56");

        assertSame(entity, entity.id("app-de-1").name("Orders"));
        assertEquals("app-de-1", entity.getId());
        assertEquals("app-de-1", entity.getPSAppDataEntityId());
        assertEquals("Orders", entity.getName());
        assertEquals("Orders", entity.getPSAppDataEntityName());
        assertEquals("app-de-1", entity.getPSAppLocalDEId());
        assertEquals("Orders", entity.getPSAppLocalDEName());

        entity.setEnableStorage(1);
        assertEquals(1, entity.getStorageMode());
        assertTrue(entity.isStorageModeDirty());
        entity.resetEnableStorage();
        assertNull(entity.getStorageMode());
        assertFalse(entity.isStorageModeDirty());

        entity.setCreateDate(timestamp);
        entity.setUpdateDate(timestamp);
        assertEquals(timestamp, entity.getCreateDate());
        assertEquals(timestamp, entity.getUpdateDate());
        for (String methodName : Arrays.asList("setCreateDate", "setUpdateDate")) {
            JsonFormat format = PSAppDataEntityDTO.class.getMethod(methodName, Timestamp.class)
                    .getAnnotation(JsonFormat.class);
            assertNotNull(format);
            assertEquals("yyyy-MM-dd HH:mm:ss", format.pattern());
            assertEquals("zh", format.locale());
            assertEquals("GMT+8", format.timezone());
        }

        entity.resetPSAppDataEntityId();
        entity.resetPSAppDataEntityName();
        assertFalse(entity.isPSAppDataEntityIdDirty());
        assertFalse(entity.isPSAppDataEntityNameDirty());
    }

    @Test
    void relatedConvenienceMethodsCopyAndClearValues() {
        PSAppDataEntityDTO entity = new PSAppDataEntityDTO();

        PSAppModuleDTO appModule = named(new PSAppModuleDTO(), "module-1", "Sales");
        entity.psappmoduleid(appModule);
        assertEquals("module-1", entity.getPSAppModuleId());
        assertEquals("Sales", entity.getPSAppModuleName());
        entity.psappmoduleid((PSAppModuleDTO) null);
        assertNull(entity.getPSAppModuleId());
        assertNull(entity.getPSAppModuleName());

        PSDEFGroupDTO defGroup = named(new PSDEFGroupDTO(), "group-1", "Main");
        entity.psdefgroupid(defGroup);
        assertEquals("group-1", entity.getPSDEFGroupId());
        assertEquals("Main", entity.getPSDEFGroupName());
        entity.psdefgroupid((PSDEFGroupDTO) null);
        assertNull(entity.getPSDEFGroupId());
        assertNull(entity.getPSDEFGroupName());

        PSDataEntityDTO dataEntity = new PSDataEntityDTO()
                .id("de-1")
                .name("Order")
                .codename("ORDER")
                .logicname("Order")
                .psmoduleid("module-1");
        entity.psdeid(dataEntity);
        assertEquals("de-1", entity.getPSDEId());
        assertEquals("Order", entity.getPSDEName());
        assertEquals("ORDER", entity.getDECodeName());
        assertEquals("Order", entity.getDELogicName());
        assertEquals("module-1", entity.getPSModuleId());
        entity.psdeid((PSDataEntityDTO) null);
        assertNull(entity.getPSDEId());
        assertNull(entity.getPSDEName());
        assertNull(entity.getDECodeName());
        assertNull(entity.getDELogicName());
        assertNull(entity.getPSModuleId());

        PSDERDTO der = named(new PSDERDTO(), "der-1", "Order relation");
        entity.psderid(der);
        assertEquals("der-1", entity.getPSDERId());
        assertEquals("Order relation", entity.getPSDERName());
        entity.psderid((PSDERDTO) null);
        assertNull(entity.getPSDERId());
        assertNull(entity.getPSDERName());

        PSDEServiceAPIDTO deServiceApi = named(new PSDEServiceAPIDTO(), "de-api-1", "Order API");
        entity.psdeserviceapiid(deServiceApi);
        assertEquals("de-api-1", entity.getPSDEServiceAPIId());
        assertEquals("Order API", entity.getPSDEServiceAPIName());
        entity.psdeserviceapiid((PSDEServiceAPIDTO) null);
        assertNull(entity.getPSDEServiceAPIId());
        assertNull(entity.getPSDEServiceAPIName());

        PSSysAppDTO sysApp = named(new PSSysAppDTO(), "sys-app-1", "Main app");
        entity.pssysappid(sysApp);
        assertEquals("sys-app-1", entity.getPSSysAppId());
        assertEquals("Main app", entity.getPSSysAppName());
        entity.pssysappid((PSSysAppDTO) null);
        assertNull(entity.getPSSysAppId());
        assertNull(entity.getPSSysAppName());

        PSSysDynaModelDTO dynaModel = named(new PSSysDynaModelDTO(), "dyna-1", "Runtime model");
        entity.pssysdynamodelid(dynaModel);
        assertEquals("dyna-1", entity.getPSSysDynaModelId());
        assertEquals("Runtime model", entity.getPSSysDynaModelName());
        entity.pssysdynamodelid((PSSysDynaModelDTO) null);
        assertNull(entity.getPSSysDynaModelId());
        assertNull(entity.getPSSysDynaModelName());

        PSSysReqItemDTO reqItem = named(new PSSysReqItemDTO(), "req-1", "Order requirement");
        entity.pssysreqitemid(reqItem);
        assertEquals("req-1", entity.getPSSysReqItemId());
        assertEquals("Order requirement", entity.getPSSysReqItemName());
        entity.pssysreqitemid((PSSysReqItemDTO) null);
        assertNull(entity.getPSSysReqItemId());
        assertNull(entity.getPSSysReqItemName());

        PSSysServiceAPIDTO sysServiceApi = named(new PSSysServiceAPIDTO(), "sys-api-1", "System API");
        entity.pssysserviceapiid(sysServiceApi);
        assertEquals("sys-api-1", entity.getPSSysServiceAPIId());
        assertEquals("System API", entity.getPSSysServiceAPIName());
        entity.pssysserviceapiid((PSSysServiceAPIDTO) null);
        assertNull(entity.getPSSysServiceAPIId());
        assertNull(entity.getPSSysServiceAPIName());

        PSSysSFPluginDTO plugin = named(new PSSysSFPluginDTO(), "plugin-1", "Plugin");
        entity.pssyssfpluginid(plugin);
        assertEquals("plugin-1", entity.getPSSysSFPluginId());
        assertEquals("Plugin", entity.getPSSysSFPluginName());
        entity.pssyssfpluginid((PSSysSFPluginDTO) null);
        assertNull(entity.getPSSysSFPluginId());
        assertNull(entity.getPSSysSFPluginName());

        PSSysUniResDTO uniRes = named(new PSSysUniResDTO(), "uni-res-1", "Resource");
        entity.pssysuniresid(uniRes);
        assertEquals("uni-res-1", entity.getPSSysUniResId());
        assertEquals("Resource", entity.getPSSysUniResName());
        entity.pssysuniresid((PSSysUniResDTO) null);
        assertNull(entity.getPSSysUniResId());
        assertNull(entity.getPSSysUniResName());

        PSLanguageResDTO languageRes = named(new PSLanguageResDTO(), "lang-1", "Order label");
        entity.lnpslanresid(languageRes);
        assertEquals("lang-1", entity.getLNPSLanResId());
        assertEquals("Order label", entity.getLNPSLanResName());
        entity.lnpslanresid((PSLanguageResDTO) null);
        assertNull(entity.getLNPSLanResId());
        assertNull(entity.getLNPSLanResName());

        PSDEViewBaseDTO linkView = named(new PSDEViewBaseDTO(), "view-link-1", "Link view");
        entity.linkpsdeviewid(linkView);
        assertEquals("view-link-1", entity.getLinkPSDEViewId());
        assertEquals("Link view", entity.getLinkPSDEViewName());
        entity.linkpsdeviewid((PSDEViewBaseDTO) null);
        assertNull(entity.getLinkPSDEViewId());
        assertNull(entity.getLinkPSDEViewName());

        PSDEViewBaseDTO masterView = named(new PSDEViewBaseDTO(), "view-master-1", "Master view");
        entity.mdpsdeviewid(masterView);
        assertEquals("view-master-1", entity.getMDPSDEViewId());
        assertEquals("Master view", entity.getMDPSDEViewName());
        entity.mdpsdeviewid((PSDEViewBaseDTO) null);
        assertNull(entity.getMDPSDEViewId());
        assertNull(entity.getMDPSDEViewName());

        PSDEViewBaseDTO sdView = named(new PSDEViewBaseDTO(), "view-sd-1", "SD view");
        entity.sdpsdeviewid(sdView);
        assertEquals("view-sd-1", entity.getSDPSDEViewID());
        assertEquals("SD view", entity.getSDPSDEViewName());
        entity.sdpsdeviewid((PSDEViewBaseDTO) null);
        assertNull(entity.getSDPSDEViewID());
        assertNull(entity.getSDPSDEViewName());

        PSAppDataEntityDTO parent = new PSAppDataEntityDTO().id("parent-1").name("Parent");
        entity.ppsappdataentityid(parent);
        assertEquals("parent-1", entity.getPPSAppDataEntityId());
        assertEquals("Parent", entity.getPPSAppDataEntityName());
        entity.ppsappdataentityid((PSAppDataEntityDTO) null);
        assertNull(entity.getPPSAppDataEntityId());
        assertNull(entity.getPPSAppDataEntityName());
    }

    private static String getString(Field field) {
        try {
            return (String) field.get(null);
        } catch (IllegalAccessException ex) {
            throw new AssertionError(ex);
        }
    }

    private static <T extends PSNamedModelDTOBase> T named(T dto, String id, String name) {
        dto.setId(id);
        dto.setName(name);
        return dto;
    }
}