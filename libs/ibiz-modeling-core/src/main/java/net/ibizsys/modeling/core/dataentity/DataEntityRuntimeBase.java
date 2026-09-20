package net.ibizsys.modeling.core.dataentity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.ISearchGroupCond;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSInheritDEField;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.der.IPSDERMultiInherit;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDBValueOPDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelLogDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUniResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPubDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDEActionService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEDataSetService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEServiceAPIService;
import net.ibizsys.modeling.core.dataentity.service.IPSDataEntityService;
import net.ibizsys.modeling.core.dataentity.service.IPSLanguageResService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysSFPubService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysUniResService;
import net.ibizsys.modeling.core.dataentity.service.IPSSystemService;
import net.ibizsys.modeling.core.sysutil.IStudioSysUtilRuntime;
import net.ibizsys.modeling.core.util.PSModelTranslator;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.util.PSModels;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLInput;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLResult;
import net.ibizsys.modeling.core.util.domain.CopyModelInput;
import net.ibizsys.modeling.core.util.domain.CopyModelResult;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLInput;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLResult;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Input;
import net.ibizsys.modeling.core.util.domain.ExportModelV2Result;
import net.ibizsys.modeling.core.util.domain.ImportModelV2Input;
import net.ibizsys.modeling.core.util.domain.MergeModelDSLInput;
import net.ibizsys.modeling.core.util.domain.MergeModelDSLResult;
import net.ibizsys.modeling.core.util.domain.PasteModelInput;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.runtime.util.ASFutureActionBase;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionBackup;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.ConsoleUtils;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IASFutureAction;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IActionSessionLog;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * Base class for modeling data entity runtimes.
 *
 * <p>Provides the shared contract for model-instance CRUD lifecycle,
 * model tag/scope resolution, DSL action dispatch, model version
 * tracking, and studio-console notification hooks.</p>
 */
public abstract class DataEntityRuntimeBase
extends DataEntityRuntimeBaseBase
implements IDataEntityRuntime {

    private static final Log log = LogFactory.getLog(DataEntityRuntimeBase.class);

    public static final String LOGGER_OPINFO = "\u64cd\u4f5c\u4fe1\u606f";
    public static final String ACTIONSESSIONPARAM_GETFULLMODELTAGENTITY_X =
            "_GETFULLMODELTAGENTITY__%1$s__%2$s__%3$s";
    public static final String PSSYSMETHODDTO_EXPORTMODELV2INPUT = "EXPORTMODELV2INPUT";
    public static final String PSSYSMETHODDTO_EXPORTMODELV2RESULT = "EXPORTMODELV2RESULT";
    public static final String PSSYSMETHODDTO_IMPORTMODELV2INPUT = "IMPORTMODELV2INPUT";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_COMPILEMODELDSL = "COMPILEMODELDSL";
    public static final String ACTION_EXPORTMODELDSL = "EXPORTMODELDSL";
    public static final String ACTION_MERGEMODELDSL = "MERGEMODELDSL";
    public static final String PSSYSMETHODDTO_COPYMODELINPUT = "COPYMODELINPUT";
    public static final String PSSYSMETHODDTO_COPYMODELRESULT = "COPYMODELRESULT";
    public static final String PSSYSMETHODDTO_PASTEMODELINPUT = "PASTEMODELINPUT";
    public static final String PSSYSMETHODDTO_COMPILEMODELDSLINPUT = "COMPILEMODELDSLINPUT";
    public static final String PSSYSMETHODDTO_COMPILEMODELDSLRESULT = "COMPILEMODELDSLRESULT";
    public static final String PSSYSMETHODDTO_EXPORTMODELDSLINPUT = "EXPORTMODELDSLINPUT";
    public static final String PSSYSMETHODDTO_EXPORTMODELDSLRESULT = "EXPORTMODELDSLRESULT";
    public static final String PSSYSMETHODDTO_MERGEMODELDSLINPUT = "MERGEMODELDSLINPUT";
    public static final String PSSYSMETHODDTO_MERGEMODELDSLRESULT = "MERGEMODELDSLRESULT";
    public static final String ACTION_COPYMODEL = "COPYMODEL";
    public static final String ACTION_PASTEMODEL = "PASTEMODEL";

    private static boolean bEnableI18NDefault = true;
    private static boolean bEnableStateInformDefault = true;
    private static boolean bEnableOPInfoInformDefault = true;

    private static final Map<String, String> deLogMap = new HashMap<>();
    private static final Map<String, String> sysModelChgLogMap = new HashMap<>();
    private static final Map<String, String> deModelVerMap = new HashMap<>();
    private static final Map<String, String> deModelVerMap2 = new HashMap<>();
    private static final Map<String, String> deDBVerMap = new HashMap<>();
    private static final Map<String, String> sysModelVerMap = new HashMap<>();
    private static final Map<String, String> sysModelVerSqlMap = new HashMap<>();
    private static final Map<String, String> sysModelLogMap = new HashMap<>();
    private static final Map<String, String> informStateMap = new HashMap<>();
    private static final Map<String, String> informStateMap2 = new HashMap<>();
    private static final Map<String, String> nestedDERTranslateMap = new HashMap<>();
    private static final Random random = new Random();
    private static final ThreadLocal<Boolean> ImportModelMode = ThreadLocal.withInitial(() -> false);

    private static List<PSDBValueOPDTO> globalPSDBValueOPDTOList;

    private IModelEnhancerSysUtilRuntime iModelEnhancerSysUtilRuntime;
    private IStudioSysUtilRuntime iStudioSysUtilRuntime;
    private IDataEntityRuntime iPSSysModelChgLogDERuntime;
    private IDataEntityRuntime iPSSysModelLogDERuntime;
    private IDataEntityRuntime iPSSystemDERuntime;
    private IDataEntityRuntime iPSDBValueOPDERuntime;
    private List<IPSDER1NBase> modelScopePSDER1NList;
    private IPSDEField modelTagPSDEField;
    private Map<String, String> userDefaultValueMap = new LinkedHashMap<>();
    private boolean bNestedModel = false;

    // Static helpers ----------------------------------------------------------

    public static void setEnableStateInformDefault(boolean b) {
        bEnableStateInformDefault = b;
    }

    public static boolean isEnableStateInformDefault() {
        return bEnableStateInformDefault;
    }

    public static void setEnableOPInfoInformDefault(boolean b) {
        bEnableOPInfoInformDefault = b;
    }

    public static boolean isEnableOPInfoInformDefault() {
        return bEnableOPInfoInformDefault;
    }

    public boolean isImportModelMode() {
        return DataTypeUtils.asBoolean(ImportModelMode.get(), false);
    }

    protected void setImportModelMode(boolean b) {
        ImportModelMode.set(b);
    }

    public static void setGlobalImportModelMode(Boolean b) {
        ImportModelMode.set(b);
    }

    public static Boolean getGlobalImportModelMode() {
        return ImportModelMode.get();
    }

    // System runtime access ---------------------------------------------------

    @Override
    public IServiceSystemRuntime getSystemRuntime() {
        return (IServiceSystemRuntime) super.getSystemRuntime();
    }

    protected IModelEnhancerSysUtilRuntime getModelEnhancerSysUtilRuntime() {
        if (iModelEnhancerSysUtilRuntime == null) {
            iModelEnhancerSysUtilRuntime = getSystemRuntime()
                    .getSysUtilRuntime(IModelEnhancerSysUtilRuntime.class, false);
        }
        return iModelEnhancerSysUtilRuntime;
    }

    protected IStudioSysUtilRuntime getStudioSysUtilRuntime() {
        if (iStudioSysUtilRuntime == null) {
            iStudioSysUtilRuntime = getSystemRuntime()
                    .getSysUtilRuntime(IStudioSysUtilRuntime.class, false);
        }
        return iStudioSysUtilRuntime;
    }

    protected IDataEntityRuntime getPSSysModelChgLogDERuntime() {
        if (iPSSysModelChgLogDERuntime == null) {
            iPSSysModelChgLogDERuntime = (IDataEntityRuntime)
                    getSystemRuntime().getDataEntityRuntime("PSSYSDBCHGLOG");
        }
        return iPSSysModelChgLogDERuntime;
    }

    protected IDataEntityRuntime getPSSysModelLogDERuntime() {
        if (iPSSysModelLogDERuntime == null) {
            iPSSysModelLogDERuntime = (IDataEntityRuntime)
                    getSystemRuntime().getDataEntityRuntime("PSSYSMODELLOG");
        }
        return iPSSysModelLogDERuntime;
    }

    protected IDataEntityRuntime getPSSystemDERuntime() {
        if (iPSSystemDERuntime == null) {
            iPSSystemDERuntime = (IDataEntityRuntime)
                    getSystemRuntime().getDataEntityRuntime("PSSYSTEM");
        }
        return iPSSystemDERuntime;
    }

    protected IDataEntityRuntime getPSDBValueOPDERuntime() {
        if (iPSDBValueOPDERuntime == null) {
            iPSDBValueOPDERuntime = (IDataEntityRuntime)
                    getSystemRuntime().getDataEntityRuntime("PSDBVALUEOP");
        }
        return iPSDBValueOPDERuntime;
    }

    // Security helpers --------------------------------------------------------

    protected ISystemAccessManager getSystemAccessManager() {
        return (ISystemAccessManager) getSystemRuntime().getSystemAccessManager();
    }

    protected IPSDevSysUser getCurrentPSDevSysUser(boolean bTryMode) throws Exception {
        return getSystemAccessManager().getCurrentPSDevSysUser(bTryMode);
    }

    // isCloudMode / isEnableStateInform / isEnableActionLogic -----------------

    protected boolean isCloudMode() {
        return true;
    }

    protected boolean isEnableStateInform() {
        if (!bEnableStateInformDefault) return false;
        if (isNestedModel()) return false;
        ActionSession session = ActionSessionManager.getCurrentSession();
        return session == null || session.getActionParam("SRFIGNORESTATEINFORM") == null;
    }

    @Override
    protected boolean isEnableActionLogic(IPSDEAction action, String attachMode) {
        if (!super.isEnableActionLogic(action, attachMode)) {
            String name = action.getName();
            if ("getdraft".equalsIgnoreCase(name) && "AFTER".equalsIgnoreCase(attachMode)) {
                return true;
            }
            if ("create".equalsIgnoreCase(name) || "update".equalsIgnoreCase(name)
                    || "remove".equalsIgnoreCase(name)
                    || ACTION_EXPORTMODELV2.equalsIgnoreCase(name)
                    || ACTION_IMPORTMODELV2.equalsIgnoreCase(name)) {
                if ("BEFORE".equalsIgnoreCase(attachMode) || "AFTER".equalsIgnoreCase(attachMode)) {
                    return true;
                }
                if ("PREPARE".equalsIgnoreCase(attachMode)
                        && ("create".equalsIgnoreCase(name) || "update".equalsIgnoreCase(name))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    // onInit ------------------------------------------------------------------

    @Override
    protected void onInit() throws Exception {
        // Collect model-scope 1:N relations (customExportOrder2 > 0)
        List<IPSDERBase> minorDers = getPSDataEntity().getMinorPSDERs();
        if (!ObjectUtils.isEmpty(minorDers)) {
            List<IPSDER1N> scopeList = new ArrayList<>();
            for (IPSDERBase der : minorDers) {
                if (der instanceof IPSDER1N) {
                    IPSDER1N der1n = (IPSDER1N) der;
                    if (der1n.getCustomExportOrder2() > 0) {
                        scopeList.add(der1n);
                        if (der1n.getTempDataOrder() > 0) {
                            bNestedModel = true;
                        }
                    }
                }
            }
            if (!ObjectUtils.isEmpty(scopeList)) {
                Collections.sort(scopeList,
                        Comparator.comparingInt(IPSDER1NBase::getCustomExportOrder2));
                modelScopePSDER1NList = Collections.unmodifiableList(scopeList);
            }
        }

        // Collect user-default-value fields and MODELV2TAG field
        List<IPSDEField> allFields = getPSDataEntity().getAllPSDEFields();
        if (!ObjectUtils.isEmpty(allFields)) {
            for (IPSDEField field : allFields) {
                if (PSModelEnums.DEFDefaultValueType.USER.value.equals(field.getDefaultValueType())
                        && StringUtils.hasLength(field.getDefaultValue())) {
                    String val = field.getDefaultValue();
                    if (!val.contains("{0}")) {
                        val = val + "{0}";
                    }
                    userDefaultValueMap.put(field.getLowerCaseName(), val);
                }
                if ("MODELV2TAG".equals(field.getUserTag())) {
                    modelTagPSDEField = field;
                    break;
                }
            }
        }
        super.onInit();
    }

    // preparePSModelActionSessionParams ---------------------------------------

    protected void preparePSModelActionSessionParams(ActionSession session) throws Throwable {
        String tag = "__PREPAREPSMODELACTIONSESSIONPARAMS__";
        if (session.getActionParam(tag) != null) {
            return;
        }
        List<PSDBValueOPDTO> opList = globalPSDBValueOPDTOList;
        if (opList == null) {
            @SuppressWarnings("unchecked")
            List<PSDBValueOPDTO> fetched = (List<PSDBValueOPDTO>)
                    (List<?>) getPSDBValueOPDERuntime()
                            .rawSelect(new SearchContextDTO().all().raw());
            opList = fetched;
            globalPSDBValueOPDTOList = opList;
        }
        String opDeId = getPSDBValueOPDERuntime().getId();
        for (PSDBValueOPDTO op : opList) {
            session.setActionParam("_FILLENTITYFULLINFO__" + opDeId + "__" + op.getId(), op);
        }
        IPSDevSysUser devUser = getCurrentPSDevSysUser(true);
        if (devUser != null) {
            IEntityDTO sysDto = getPSSystemDERuntime().createEntity();
            sysDto.set("pssystemid", devUser.getPSSystemId());
            sysDto.set("pssystemname", devUser.getPSSystemName());
            String sysKey = DataTypeUtils.asString(
                    sysDto.get(getPSSystemDERuntime().getKeyPSDEField().getLowerCaseName()));
            String sysDeId = getPSSystemDERuntime().getId();
            if (StringUtils.hasLength(sysKey)) {
                session.setActionParam("_FILLENTITYFULLINFO__" + sysDeId + "__" + sysKey, sysDto);
            }
        }
        session.setActionParam(tag, "1");
    }

    // fillEntityFullInfo ------------------------------------------------------

    @Override
    protected void fillEntityFullInfo(IEntityBase arg0, String actionName,
            IPSDEAction action, IPSDataEntity dataEntity,
            IDynaInstRuntime dynaInstRuntime, Object actionData) throws Throwable {
        if (PSModels.isModelInstDataEntity(getName())
                && !"PSSYSTEM".equalsIgnoreCase(getName())
                && !"PSSYSMODELLOG".equalsIgnoreCase(getName())) {
            ActionSession session = ActionSessionManager.getCurrentSessionMust();
            preparePSModelActionSessionParams(session);
            if (arg0 instanceof IEntityDTO && getPSDEField("PSSYSTEMID") != null) {
                IPSDevSysUser devUser = getCurrentPSDevSysUser(true);
                if (devUser != null) {
                    ((IEntityDTO) arg0).set("pssystemid", devUser.getPSSystemId());
                    if (StringUtils.hasLength(devUser.getPSSystemName())) {
                        ((IEntityDTO) arg0).set("pssystemname", devUser.getPSSystemName());
                    }
                }
            }
        }
        super.fillEntityFullInfo(arg0, actionName, action, dataEntity, dynaInstRuntime, actionData);
    }

    // executeActionLogics -----------------------------------------------------

    @Override
    protected Object executeActionLogics(Object[] args, Object ret,
            IPSDEAction action, String attachMode,
            IDynaInstDataEntityRuntime dynaInstDERuntime,
            IDynaInstRuntime dynaInstRuntime, Object actionData) throws Throwable {
        ret = super.executeActionLogics(args, ret, action, attachMode,
                dynaInstDERuntime, dynaInstRuntime, actionData);
        String name = action.getName();

        if ("getdraft".equalsIgnoreCase(name) && "AFTER".equalsIgnoreCase(attachMode)) {
            if (!isImportModelMode()) {
                IModelEnhancerSysUtilRuntime enhancer = getModelEnhancerSysUtilRuntime();
                if (enhancer != null) {
                    if (ret instanceof IEntityDTO) {
                        enhancer.preparePSModel(getName(), new Object[]{ret}, 0);
                    } else {
                        enhancer.preparePSModel(getName(), args, 0);
                    }
                }
                if (!ObjectUtils.isEmpty(modelScopePSDER1NList)
                        && !ObjectUtils.isEmpty(userDefaultValueMap)) {
                    IEntityDTO target = (ret instanceof IEntityDTO)
                            ? (IEntityDTO) ret : (IEntityDTO) args[0];
                    fillDraftDefaultValues(target, modelScopePSDER1NList, userDefaultValueMap);
                }
                IEntityDTO target = (ret instanceof IEntityDTO)
                        ? (IEntityDTO) ret : (IEntityDTO) args[0];
                onAfterGetDraft(target);
            }
        } else if ("create".equalsIgnoreCase(name)) {
            if ("PREPARE".equalsIgnoreCase(attachMode)) {
                IModelEnhancerSysUtilRuntime enhancer = getModelEnhancerSysUtilRuntime();
                if (enhancer != null) enhancer.preparePSModel(getName(), args, 1);
                onPrepareCreate(args);
            } else if ("BEFORE".equalsIgnoreCase(attachMode)) {
                onBeforeCreate(args);
            } else if ("AFTER".equalsIgnoreCase(attachMode)) {
                onAfterCreate(args);
                if (!isImportModelMode()) {
                    IModelEnhancerSysUtilRuntime enhancer = getModelEnhancerSysUtilRuntime();
                    if (enhancer != null) enhancer.initializePSModel(getName(), args);
                }
            }
        } else if ("update".equalsIgnoreCase(name)) {
            if ("PREPARE".equalsIgnoreCase(attachMode)) {
                IModelEnhancerSysUtilRuntime enhancer = getModelEnhancerSysUtilRuntime();
                if (enhancer != null) enhancer.preparePSModel(getName(), args, 2);
                onPrepareUpdate(args);
            } else if ("BEFORE".equalsIgnoreCase(attachMode)) {
                onBeforeUpdate(args);
            } else if ("AFTER".equalsIgnoreCase(attachMode)) {
                onAfterUpdate(args);
            }
        } else if ("remove".equalsIgnoreCase(name)) {
            if ("BEFORE".equalsIgnoreCase(attachMode)) {
                onBeforeRemove(args);
            } else if ("AFTER".equalsIgnoreCase(attachMode)) {
                onAfterRemove(args);
            }
        } else if (ACTION_IMPORTMODELV2.equalsIgnoreCase(name)) {
            if ("BEFORE".equalsIgnoreCase(attachMode)) {
                onBeforeImportModelV2(args);
                IModelEnhancerSysUtilRuntime enhancer = getModelEnhancerSysUtilRuntime();
                if (enhancer != null) enhancer.prepareImportPSModelV2(getName(), args);
            } else if ("AFTER".equalsIgnoreCase(attachMode)) {
                ret = onAfterImportModelV2(args, ret);
                IModelEnhancerSysUtilRuntime enhancer = getModelEnhancerSysUtilRuntime();
                if (enhancer != null) enhancer.finishImportPSModelV2(getName(), args, ret);
            }
        } else if (ACTION_EXPORTMODELV2.equalsIgnoreCase(name)) {
            if ("BEFORE".equalsIgnoreCase(attachMode)) {
                onBeforeExportModelV2(args);
                IModelEnhancerSysUtilRuntime enhancer = getModelEnhancerSysUtilRuntime();
                if (enhancer != null) enhancer.prepareExportPSModelV2(getName(), args);
            } else if ("AFTER".equalsIgnoreCase(attachMode)) {
                ret = onAfterExportModelV2(args, ret);
                IModelEnhancerSysUtilRuntime enhancer = getModelEnhancerSysUtilRuntime();
                if (enhancer != null) enhancer.finishExportPSModelV2(getName(), args, ret);
            }
        }
        return ret;
    }

    // initModel / doInitModel -------------------------------------------------

    @Override
    public void initModel(IEntityDTO entity) throws Throwable {
        Assert.notNull(entity, "\u672a\u4f20\u5165\u6570\u636e\u5bf9\u8c61");
        executeAction("INITMODEL", null, new Object[]{entity});
    }

    protected void doInitModel(Object[] args) throws Throwable {
        IEntityDTO entity = (args != null && args.length > 0 && args[0] instanceof IEntityDTO)
                ? (IEntityDTO) args[0] : null;
        if (entity == null) {
            throw new Exception("\u672a\u4f20\u5165\u6570\u636e\u5bf9\u8c61");
        }
        Object key = entity.get(getKeyPSDEField().getLowerCaseName());
        IEntityDTO existing = get(key);
        IModelEnhancerSysUtilRuntime enhancer = getModelEnhancerSysUtilRuntime();
        if (enhancer != null) {
            enhancer.initializePSModel(getName(), new Object[]{existing});
        }
    }

    // Lifecycle double-dispatch (args[] -> entity) ----------------------------

    protected void onPrepareCreate(Object[] args) throws Throwable {
        if (args != null && args.length > 0 && args[0] instanceof IEntityDTO) {
            onPrepareCreate((IEntityDTO) args[0]);
        }
    }

    protected void onBeforeCreate(Object[] args) throws Throwable {
        if (args != null && args.length > 0 && args[0] instanceof IEntityDTO) {
            onBeforeCreate((IEntityDTO) args[0]);
        }
    }

    protected void onAfterCreate(Object[] args) throws Throwable {
        if (args != null && args.length > 0 && args[0] instanceof IEntityDTO) {
            onAfterCreate((IEntityDTO) args[0]);
        }
    }

    protected void onPrepareUpdate(Object[] args) throws Throwable {
        if (args != null && args.length > 0 && args[0] instanceof IEntityDTO) {
            onPrepareUpdate((IEntityDTO) args[0]);
        }
    }

    protected void onBeforeUpdate(Object[] args) throws Throwable {
        if (args != null && args.length > 0 && args[0] instanceof IEntityDTO) {
            onBeforeUpdate((IEntityDTO) args[0]);
        }
    }

    protected void onAfterUpdate(Object[] args) throws Throwable {
        if (args != null && args.length > 0 && args[0] instanceof IEntityDTO) {
            onAfterUpdate((IEntityDTO) args[0]);
        }
    }

    protected void onBeforeRemove(Object[] args) throws Throwable {
        IEntityDTO last = getLastEntity();
        if (last != null) {
            onBeforeRemove(last);
        } else if (args != null && args.length > 0) {
            if (args[0] instanceof IEntityDTO) {
                onBeforeRemove((IEntityDTO) args[0]);
            } else {
                IEntityDTO dto = createEntity();
                dto.set(getKeyPSDEField().getLowerCaseName(), args[0]);
                onBeforeRemove(dto);
            }
        }
    }

    protected void onAfterRemove(Object[] args) throws Throwable {
        IEntityDTO last = getLastEntity();
        if (last != null) {
            onAfterRemove(last);
        } else if (args != null && args.length > 0) {
            if (args[0] instanceof IEntityDTO) {
                onAfterRemove((IEntityDTO) args[0]);
            } else {
                IEntityDTO dto = createEntity();
                dto.set(getKeyPSDEField().getLowerCaseName(), args[0]);
                onAfterRemove(dto);
            }
        }
    }

    // Entity-level lifecycle hooks (default: logging + version tracking) ------

    protected void onAfterCreate(IEntityDTO entity) throws Throwable {
        informObjectChanged(entity, PSModelEnums.PSModelChangeType.CREATE);
        logSysModelChanged(entity, PSModelEnums.PSModelChangeType.CREATE);
        logDEModelVerChanged(entity);
        logDEDBVerChanged(entity);
        syncSysTask(entity, false);
    }

    protected void onAfterUpdate(IEntityDTO entity) throws Throwable {
        informObjectChanged(entity, PSModelEnums.PSModelChangeType.UPDATE);
        logSysModelChanged(entity, PSModelEnums.PSModelChangeType.UPDATE);
        logDEModelVerChanged(entity);
        logDEDBVerChanged(entity);
        syncSysTask(entity, false);
    }

    protected void onBeforeRemove(IEntityDTO entity) throws Throwable {
        logSysModelChanged(entity, PSModelEnums.PSModelChangeType.DELETE);
        logDEModelVerChanged(entity);
        logDEDBVerChanged(entity);
        syncSysTask(entity, true);
    }

    protected void onAfterRemove(IEntityDTO entity) throws Throwable {
        informObjectChanged(entity, PSModelEnums.PSModelChangeType.DELETE);
    }

    // rawCreate / rawUpdate / rawRemove ---------------------------------------

    @Override
    public void rawCreate(List<? extends IEntityDTO> list, boolean bSysMode) throws Throwable {
        super.rawCreate(list, bSysMode);
        logSysModelChanged(null, PSModelEnums.PSModelChangeType.CREATE);
    }

    @Override
    public void rawUpdate(List<? extends IEntityDTO> list, boolean bSysMode) throws Throwable {
        super.rawUpdate(list, bSysMode);
        logSysModelChanged(null, PSModelEnums.PSModelChangeType.UPDATE);
    }

    @Override
    public void rawRemove(List<Object> list, boolean bSysMode) throws Throwable {
        super.rawRemove(list, bSysMode);
        logSysModelChanged(null, PSModelEnums.PSModelChangeType.DELETE);
    }

    // fillDraftDefaultValues --------------------------------------------------

    protected boolean fillDraftDefaultValues(IEntityDTO entity,
            List<IPSDER1NBase> scopeDers,
            Map<String, String> defaultValues) throws Exception {
        // If any field already has a value containing "{0}", skip (draft-in-progress)
        for (String key : defaultValues.keySet()) {
            String val = entity.getString(key, null);
            if (val != null && val.contains("{0}")) {
                return false;
            }
        }
        ISearchContextDTO ctx = createSearchContext().all().count(false);
        for (IPSDER1NBase der : scopeDers) {
            IPSDEField pickup = der.getPickupPSDEFieldMust();
            Object val = entity.get(pickup.getLowerCaseName());
            if (ObjectUtils.isEmpty(val)) {
                ctx.nvl(pickup.getLowerCaseName());
            } else {
                ctx.eq(pickup.getLowerCaseName(), val);
            }
        }
        if (defaultValues.size() == 1) {
            Map.Entry<String, String> entry = defaultValues.entrySet().iterator().next();
            ctx.like(entry.getKey(), entry.getValue().replace("{0}", ""));
        } else {
            ISearchGroupCond or = ctx.or();
            for (Map.Entry<String, String> entry : defaultValues.entrySet()) {
                or.like(entry.getKey(), entry.getValue().replace("{0}", ""));
            }
        }
        @SuppressWarnings("unchecked")
        List<IEntityDTO> existing = rawSelect(ctx);
        for (int attempt = 0; attempt < 10000; attempt++) {
            boolean allOk = true;
            for (Map.Entry<String, String> entry : defaultValues.entrySet()) {
                boolean fieldOk = true;
                String template = entity.getString(entry.getKey(), entry.getValue());
                if (template == null || template.contains("{0}")) {
                    template = entry.getValue();
                }
                String candidate = (attempt == 0)
                        ? template.replace("{0}", "")
                        : template.replace("{0}", String.valueOf(attempt + 1));
                for (IEntityDTO item : existing) {
                    String existingVal = item.getString(entry.getKey(), null);
                    if (existingVal != null && existingVal.equalsIgnoreCase(candidate)) {
                        fieldOk = false;
                        break;
                    }
                }
                if (fieldOk) {
                    entity.set(entry.getKey(), candidate);
                } else {
                    allOk = false;
                    break;
                }
            }
            if (allOk) break;
        }
        return true;
    }

    // Model tag / scope / info ------------------------------------------------

    @Override
    public String getModelScope(IEntityDTO entity) throws Throwable {
        prepare();
        if (!ObjectUtils.isEmpty(modelScopePSDER1NList)) {
            for (IPSDER1NBase der : modelScopePSDER1NList) {
                Object val = entity.get(der.getPickupPSDEFieldMust().getLowerCaseName());
                if (!ObjectUtils.isEmpty(val)) {
                    return String.format("%1$s#%2$s",
                            der.getMajorPSDataEntityMust().getName(), val);
                }
            }
        }
        return null;
    }

    @Override
    public IPSDEField getModelTagPSDEField() {
        prepare();
        return modelTagPSDEField;
    }

    @Override
    public List<IPSDER1NBase> getModelScopePSDER1Ns() {
        prepare();
        return modelScopePSDER1NList;
    }

    @Override
    public boolean isNestedModel() {
        prepare();
        return bNestedModel;
    }

    @Override
    public String getFullDataInfo(IEntityDTO entity) throws Throwable {
        String dataInfo = getDataInfo(entity);
        if (!StringUtils.hasLength(dataInfo)) {
            return dataInfo;
        }
        String scope = getModelScope(entity);
        if (!StringUtils.hasLength(scope)) {
            return dataInfo;
        }
        String[] parts = scope.split("#");
        if (parts.length != 2) {
            return dataInfo;
        }
        // PSSYSTEM and PSMODULE scope are terminal — do not recurse
        if ("PSSYSTEM".equalsIgnoreCase(parts[0]) || "PSMODULE".equalsIgnoreCase(parts[0])) {
            return dataInfo;
        }
        if (!StringUtils.hasLength(parts[1])) {
            return dataInfo;
        }
        try {
            IDataEntityRuntime parentRt = (IDataEntityRuntime)
                    getSystemRuntime().getDataEntityRuntime(parts[0]);
            IEntityDTO parentEntity = parentRt.createEntity();
            parentEntity.set(parentRt.getKeyPSDEField().getLowerCaseName(), parts[1]);
            if (parentRt.rawSelect(parentEntity, true)) {
                String parentInfo = parentRt.getFullDataInfo(parentEntity);
                if (StringUtils.hasLength(parentInfo)) {
                    return parentInfo + "|" + dataInfo;
                }
            }
            return dataInfo;
        } catch (Throwable ex) {
            log.error("getFullDataInfo error", ex);
            return dataInfo;
        }
    }

        @SuppressWarnings("unused")
    public String getDataInfo(IEntityDTO entity) {
        if (getMajorPSDEField() != null) {
            return DataTypeUtils.asString(entity.get(getMajorPSDEField().getLowerCaseName()));
        }
        return DataTypeUtils.asString(entity.get("name"));
    }

    public String getDataInfo2(IEntityDTO entity) throws Throwable {
        String codeName = entity.getString("codename", null);
        if (codeName != null) {
            codeName = getFullModelTag(entity);
        }
        String logicName = entity.getString("logicname", null);
        String name = getDataInfo(entity);
        if (StringUtils.hasLength(logicName)) {
            if (StringUtils.hasLength(codeName)) {
                return String.format("%1$s(%2$s)", logicName, codeName);
            }
            if (StringUtils.hasLength(name) && !logicName.equals(name)) {
                return String.format("%1$s(%2$s)", logicName, name);
            }
            return logicName;
        }
        if (StringUtils.hasLength(name)) {
            if (StringUtils.hasLength(codeName) && !name.equalsIgnoreCase(codeName)) {
                return String.format("%1$s(%2$s)", name, codeName);
            }
            return name;
        }
        return null;
    }

    protected String getModelV2Name(boolean bSingle) {
        if (bSingle) {
            return getName();
        }
        return Inflector.getInstance().pluralize(getName()).toUpperCase();
    }

    // createEntityDTO (dynamic model + extra DTOs) ----------------------------

    @Override
    protected IEntityDTO createEntityDTO(IPSDEMethodDTO methodDTO) {
        if (PSModelEnums.DEMethodDTOSourceType.DYNAMODEL.value.equals(methodDTO.getSourceType())) {
            String tag = methodDTO.getSrcPSSysMethodDTOMust().getTag();
            if (StringUtils.hasLength(tag)) {
                if (PSSYSMETHODDTO_EXPORTMODELV2INPUT.equalsIgnoreCase(tag)) {
                    return new ExportModelV2Input();
                }
                if (PSSYSMETHODDTO_EXPORTMODELV2RESULT.equalsIgnoreCase(tag)) {
                    return new ExportModelV2Result();
                }
                if (PSSYSMETHODDTO_IMPORTMODELV2INPUT.equalsIgnoreCase(tag)) {
                    return new ImportModelV2Input();
                }
                if (PSSYSMETHODDTO_COPYMODELINPUT.equalsIgnoreCase(tag)) {
                    return new CopyModelInput();
                }
                if (PSSYSMETHODDTO_COPYMODELRESULT.equalsIgnoreCase(tag)) {
                    return new CopyModelResult();
                }
                if (PSSYSMETHODDTO_PASTEMODELINPUT.equalsIgnoreCase(tag)) {
                    return new PasteModelInput();
                }
                if (PSSYSMETHODDTO_COMPILEMODELDSLINPUT.equalsIgnoreCase(tag)) {
                    return new CompileModelDSLInput();
                }
                if (PSSYSMETHODDTO_COMPILEMODELDSLRESULT.equalsIgnoreCase(tag)) {
                    return new CompileModelDSLResult();
                }
                if (PSSYSMETHODDTO_EXPORTMODELDSLINPUT.equalsIgnoreCase(tag)) {
                    return new ExportModelDSLInput();
                }
                if (PSSYSMETHODDTO_EXPORTMODELDSLRESULT.equalsIgnoreCase(tag)) {
                    return new ExportModelDSLResult();
                }
                if (PSSYSMETHODDTO_MERGEMODELDSLINPUT.equalsIgnoreCase(tag)) {
                    return new MergeModelDSLInput();
                }
                if (PSSYSMETHODDTO_MERGEMODELDSLRESULT.equalsIgnoreCase(tag)) {
                    return new MergeModelDSLResult();
                }
            }
            throw new DataEntityRuntimeException((IDataEntityRuntimeBase) this,
                    String.format("\u672a\u652f\u6301\u7684\u7cfb\u7edf\u65b9\u6cd5DTO\u5bf9\u8c61[%1$s]",
                            methodDTO.getSrcPSSysMethodDTOMust().getName()));
        }
        switch (getName()) {
            case "PSSYSAPPTYPE":
                return new PSAppTypeDTO();
            default:
                return super.createEntityDTO(methodDTO);
        }
    }

    // Action entry points (delegate to executeAction) -------------------------

    @Override
    public ExportModelV2Result exportModelV2(ExportModelV2Input input) throws Throwable {
        return (ExportModelV2Result) executeAction(ACTION_EXPORTMODELV2, null, new Object[]{input});
    }

    @Override
    public IEntityDTO importModelV2(ImportModelV2Input input) throws Throwable {
        return (IEntityDTO) executeAction(ACTION_IMPORTMODELV2, null, new Object[]{input});
    }

    @Override
    public CopyModelResult copyModel(CopyModelInput input) throws Throwable {
        return (CopyModelResult) executeAction(ACTION_COPYMODEL, null, new Object[]{input});
    }

    @Override
    public IEntityDTO pasteModel(PasteModelInput input) throws Throwable {
        return (IEntityDTO) executeAction(ACTION_PASTEMODEL, null, new Object[]{input});
    }

    @Override
    public CompileModelDSLResult compileModelDSL(CompileModelDSLInput input) throws Throwable {
        return (CompileModelDSLResult) executeAction(ACTION_COMPILEMODELDSL, null, new Object[]{input});
    }

    @Override
    public ExportModelDSLResult exportModelDSL(ExportModelDSLInput input) throws Throwable {
        return (ExportModelDSLResult) executeAction(ACTION_EXPORTMODELDSL, null, new Object[]{input});
    }

    @Override
    public MergeModelDSLResult mergeModelDSL(MergeModelDSLInput input) throws Throwable {
        return (MergeModelDSLResult) executeAction(ACTION_MERGEMODELDSL, null, new Object[]{input});
    }

    // onExecuteActionReal / onExecuteActionUnknown -----------------------------

    @Override
    protected Object onExecuteActionReal(String actionName, IPSDEAction action,
            Object[] args, Object actionData) throws Throwable {
        // Subclasses override to intercept known actions
        return null;
    }

    @Override
    protected Object onExecuteActionUnknown(String actionName, IPSDEAction action,
            Object[] args, Object actionData) throws Throwable {
        if (ACTION_COPYMODEL.equalsIgnoreCase(actionName)) {
            return getModelEnhancerSysUtilRuntime().copyPSModel(getName(), args);
        }
        if (ACTION_PASTEMODEL.equalsIgnoreCase(actionName)) {
            return getModelEnhancerSysUtilRuntime().pastePSModel(getName(), args);
        }
        if ("INITMODEL".equalsIgnoreCase(actionName)) {
            doInitModel(args);
            return null;
        }
        if (ACTION_COMPILEMODELDSL.equalsIgnoreCase(actionName)) {
            boolean prev = isImportModelMode();
            try {
                setImportModelMode(true);
                return getModelEnhancerSysUtilRuntime().compilePSModelDSL(getName(), args);
            } finally {
                setImportModelMode(prev);
            }
        }
        if (ACTION_EXPORTMODELDSL.equalsIgnoreCase(actionName)) {
            return getModelEnhancerSysUtilRuntime().exportPSModelDSL(getName(), args);
        }
        if (ACTION_MERGEMODELDSL.equalsIgnoreCase(actionName)) {
            return getModelEnhancerSysUtilRuntime().mergePSModelDSL(getName(), args);
        }
        throw new ErrorException("\u672a\u652f\u6301\u7684\u884c\u4e3a", 20);
    }

    // doExecuteActionReal -----------------------------------------------------

    @Override
    protected Object doExecuteActionReal(String actionName, IPSDEAction action,
            Object[] args, Object actionData) throws Throwable {
        Object ret = onExecuteActionReal(actionName, action, args, actionData);
        if (ret != null) {
            return ret;
        }
        // Enable nested-data-light mode for all modeling actions
        ActionSession session = ActionSessionManager.getCurrentSessionMust();
        boolean prevLight = session.isEnableNestedDataLightMode();
        session.setEnableNestedDataLightMode(true);
        try {
            return super.doExecuteActionReal(actionName, action, args, actionData);
        } finally {
            session.setEnableNestedDataLightMode(prevLight);
        }
    }

    // pasteEntity -------------------------------------------------------------

    @Override
    public IEntityDTO pasteEntity(IEntityDTO entity) throws Throwable {
        prepare();
        ActionSession session = ActionSessionManager.getCurrentSession();
        boolean openedSession = (session == null);
        if (openedSession) {
            session = ActionSessionManager.openSession();
            session.setName(getName());
            session.setDEName(getName());
            session.setUserContext(getUserContext());
        }
        boolean prevImportMode = isImportModelMode();
        try {
            setImportModelMode(true);
            pushDataSource();
            ActionSessionBackup backup = session.backup();
            session.setSessionId(KeyValueUtils.genGuidEx());
            session.beginLog(getName(), "\u7c98\u8d34\u6570\u636e");
            if (PSModels.isModelInstDataEntity(getName())
                    && getPSDEField("PSSYSTEMID", true) != null) {
                IPSDevSysUser devUser = getCurrentPSDevSysUser(false);
                entity.set("pssystemid", devUser.getPSSystemId());
                entity.set("pssystemname", devUser.getPSSystemName());
            }
            IEntityDTO result = onPasteEntity(entity);
            session.restore(backup);
            session.endLog(null);
            if (openedSession) {
                ActionSessionManager.closeSession(true);
            }
            return result;
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            session.setDynaInstRuntime(null);
            session.setChildDynaInstRuntime(null);
            if (openedSession) {
                session.endLog(ex.getMessage(), true, ex);
                ActionSessionManager.closeSession(false);
            }
            DataEntityRuntimeException.rethrow((IModelRuntime) this, ex);
            throw new DataEntityRuntimeException((IDataEntityRuntimeBase) this,
                    String.format("\u7c98\u8d34\u6570\u636e\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
        } finally {
            pollDataSource();
            setImportModelMode(prevImportMode);
        }
    }

    protected IEntityDTO onPasteEntity(IEntityDTO pasteEntity) throws Throwable {
        if (fillEntityKeyValue((IEntityBase) pasteEntity)) {
            String key = pasteEntity.getString(getKeyPSDEField().getLowerCaseName(), null);
            try {
                IEntityDTO existing = get(key, true);
                if (existing != null) return existing;
            } catch (Throwable ex) {
                throw new Exception(String.format(
                        "\u83b7\u53d6\u6570\u636e[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", key, ex.getMessage()), ex);
            }
        }
        pasteEntity.reset(getKeyPSDEField().getLowerCaseName());

        Object modelTag = null;
        IPSDEField tagField = getModelTagPSDEField();
        if (tagField != null) {
            modelTag = pasteEntity.get(tagField.getLowerCaseName());
        }
        if (ObjectUtils.isEmpty(modelTag) && getMajorPSDEField() != null) {
            String dm = getMajorPSDEField().getDupCheckMode();
            if (StringUtils.hasLength(dm) && !PSModelEnums.DEFDupCheckMode.NONE.value.equals(dm)) {
                tagField = getMajorPSDEField();
                modelTag = pasteEntity.get(getMajorPSDEField().getLowerCaseName());
            }
        }
        if (ObjectUtils.isEmpty(modelTag)) {
            IPSDEField codeField = getPSDEField("CODENAME", true);
            if (codeField != null) {
                String dm = codeField.getDupCheckMode();
                if (StringUtils.hasLength(dm) && !PSModelEnums.DEFDupCheckMode.NONE.value.equals(dm)) {
                    tagField = codeField;
                    modelTag = pasteEntity.get(codeField.getLowerCaseName());
                }
            }
        }
        if (!ObjectUtils.isEmpty(modelTag) && tagField != null) {
            ISearchContextDTO ctx = createSearchContext();
            ctx.eq(tagField.getName(), modelTag);
            boolean hasSystem = false;
            List<IPSDEField> dupFields = tagField.getDupCheckPSDEFields();
            if (!ObjectUtils.isEmpty(dupFields)) {
                for (IPSDEField f : dupFields) {
                    if ("PSSYSTEMID".equalsIgnoreCase(f.getName())) {
                        hasSystem = true;
                    }
                    Object val = pasteEntity.get(f.getLowerCaseName());
                    if (!ObjectUtils.isEmpty(val)) {
                        ctx.eq(f.getName(), val);
                    } else {
                        ctx.nvl(f.getName());
                    }
                }
            }
            if (!hasSystem && PSModels.isModelInstDataEntity(getName())) {
                IPSDEField sysIdField = getPSDEField("PSSYSTEMID", true);
                if (sysIdField != null) {
                    ctx.eq(sysIdField.getName(), pasteEntity.get(sysIdField.getLowerCaseName()));
                }
            }
            IEntityDTO existing = selectOne(ctx, true);
            if (existing != null) return existing;
        }
        try {
            create(pasteEntity);
            return pasteEntity;
        } catch (Throwable ex) {
            throw new Exception(String.format(
                    "\u5efa\u7acb\u6570\u636e[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s",
                    pasteEntity, ex.getMessage()), ex);
        }
    }

    // RealId <-> FullModelTag -------------------------------------------------

    @Override
    public String getRealIdByFullModelTag(String fullModelTag, boolean bTryMode) throws Throwable {
        Assert.hasLength(fullModelTag, "\u4f20\u5165\u5b8c\u6574\u6a21\u578b\u6807\u8bb0\u65e0\u6548");
        prepare();
        return (String) execute((IAction) (Object[] unused) -> onGetRealIdByFullModelTag(fullModelTag, bTryMode), null);
    }

    protected String onGetRealIdByFullModelTag(String fullModelTag, boolean bTryMode) throws Throwable {
        IPSDevSysUser devUser = getCurrentPSDevSysUser(false);
        ActionSession session = ActionSessionManager.getCurrentSessionMust();
        String cacheKey = String.format("CACHE_getRealIdByFullModelTag_%s_%s_%s",
                getId(), devUser.getPSDevSlnSysId(), fullModelTag);
        Object cached = session.getActionParam(cacheKey);
        if (cached == null) {
            cached = doGetRealIdByFullModelTag(fullModelTag, true);
            session.setActionParam(cacheKey, cached != null ? cached : "");
        }
        String realId = (cached == null) ? "" : cached.toString();
        if (realId.isEmpty()) {
            if (bTryMode) return null;
            throw new Exception(String.format(
                    "\u65e0\u6cd5\u83b7\u53d6\u6307\u5b9a\u6807\u8bb0\u6570\u636e[%1$s]", fullModelTag));
        }
        return realId;
    }

    protected String doGetRealIdByFullModelTag(String fullModelTag, boolean bTryMode) throws Throwable {
        String simpleId = PSModelUtils.getSimpleId(fullModelTag);
        String parentId = PSModelUtils.getParentId(fullModelTag);
        List<IPSDER1NBase> scopeDers = getModelScopePSDER1Ns();
        if (StringUtils.hasLength(parentId) && ObjectUtils.isEmpty(scopeDers)) {
            throw new Exception(String.format(
                    "\u672a\u5b9a\u4e49\u6a21\u578b\u8303\u56f4\u5173\u7cfb\uff0c\u4f46\u6307\u5b9a\u7236\u6807\u8bb0[%1$s]", parentId));
        }

        // Resolve tag field
        Object modelTag = null;
        IPSDEField tagField = getModelTagPSDEField();
        if (tagField != null) {
            modelTag = simpleId;
        }
        if (ObjectUtils.isEmpty(modelTag) && getMajorPSDEField() != null) {
            String dm = getMajorPSDEField().getDupCheckMode();
            if (StringUtils.hasLength(dm) && !PSModelEnums.DEFDupCheckMode.NONE.value.equals(dm)) {
                tagField = getMajorPSDEField();
                modelTag = simpleId;
            }
        }
        if (ObjectUtils.isEmpty(modelTag)) {
            IPSDEField codeField = getPSDEField("CODENAME", true);
            if (codeField != null) {
                String dm = codeField.getDupCheckMode();
                if (StringUtils.hasLength(dm) && !PSModelEnums.DEFDupCheckMode.NONE.value.equals(dm)) {
                    tagField = codeField;
                    modelTag = simpleId;
                }
            }
        }
        if (ObjectUtils.isEmpty(modelTag) || tagField == null) {
            throw new Exception("\u6807\u8bb0\u5c5e\u6027\u65e0\u6548");
        }

        ISearchContextDTO ctx = createSearchContext();
        ctx.count(false).raw().limit(2);
        ctx.eq(tagField.getName(), modelTag);

        if (StringUtils.hasLength(parentId) && !ObjectUtils.isEmpty(scopeDers)) {
            boolean matched = false;
            for (IPSDER1NBase der : scopeDers) {
                IDataEntityRuntime parentRt = (IDataEntityRuntime)
                        getSystemRuntime().getDataEntityRuntime(der.getMajorPSDataEntityMust().getId());
                String realParentId = parentRt.getRealIdByFullModelTag(parentId, true);
                if (StringUtils.hasLength(realParentId)) {
                    matched = true;
                    ctx.eq(der.getPickupPSDEFieldMust().getName(), realParentId);
                    break;
                }
            }
            if (!matched) {
                if (bTryMode) return null;
                throw new Exception(String.format(
                        "\u65e0\u6cd5\u8bc6\u522b\u6307\u5b9a\u7236\u6807\u8bb0[%1$s]", parentId));
            }
        } else if (ObjectUtils.isEmpty(scopeDers)) {
            // no scope — query by tag alone
        } else {
            boolean allowEmpty = false;
            for (IPSDER1NBase der : scopeDers) {
                if (der.getPickupPSDEFieldMust().isAllowEmpty()) {
                    allowEmpty = true;
                    break;
                }
            }
            if (!allowEmpty) {
                if (bTryMode) return null;
                throw new Exception(String.format(
                        "\u5fc5\u987b\u6307\u5b9a\u7236\u5b9e\u4f53[%1$s]",
                        scopeDers.get(0).getMajorPSDataEntityMust().getId()));
            }
            for (IPSDER1NBase der : scopeDers) {
                ctx.nvl(der.getPickupPSDEFieldMust().getName());
            }
        }

        @SuppressWarnings("unchecked")
        List<IEntityDTO> results = rawSelect(ctx);
        if (ObjectUtils.isEmpty(results)) {
            if (bTryMode) return null;
            throw new Exception(String.format(
                    "\u65e0\u6cd5\u83b7\u53d6\u6307\u5b9a\u6807\u8bb0\u6570\u636e[%1$s]", fullModelTag));
        }
        if (results.size() == 1) {
            return results.get(0).getString(getKeyPSDEField().getLowerCaseName(), null);
        }
        throw new Exception(String.format(
                "\u5b58\u5728\u591a\u9879\u6ee1\u8db3\u6307\u5b9a\u6807\u8bb0\u6570\u636e[%1$s]", fullModelTag));
    }

    @Override
    public String getFullModelTagByRealId(String realId) throws Throwable {
        Assert.hasLength(realId, "\u4f20\u5165\u5b9e\u9645\u6807\u8bc6\u65e0\u6548");
        prepare();
        return (String) execute((IAction) (Object[] unused) -> onGetFullModelTagByRealId(realId), null);
    }

    protected String onGetFullModelTagByRealId(String realId) throws Throwable {
        IPSDevSysUser devUser = getCurrentPSDevSysUser(false);
        ActionSession session = ActionSessionManager.getCurrentSessionMust();
        String cacheKey = String.format("CACHE_getFullModelTagByRealId_%s_%s_%s",
                getId(), devUser.getPSDevSlnSysId(), realId);
        Object cached = session.getActionParam(cacheKey);
        if (cached == null) {
            cached = doGetFullModelTagByRealId(realId);
            session.setActionParam(cacheKey, (cached == null) ? "" : cached.toString());
        }
        String tag = (cached == null) ? "" : cached.toString();
        if (tag.isEmpty()) {
            throw new Exception(String.format(
                    "\u65e0\u6cd5\u83b7\u53d6\u6307\u5b9a\u5b8c\u6574\u6a21\u578b\u6807\u8bb0[%1$s]", realId));
        }
        return tag;
    }

    protected String doGetFullModelTagByRealId(String realId) throws Throwable {
        ActionSession session = ActionSessionManager.getCurrentSessionMust();
        String cacheKey = String.format(ACTIONSESSIONPARAM_GETFULLMODELTAGENTITY_X,
                getId(), "?", realId);
        Object data = session.getActionParam(cacheKey);
        IEntityDTO entity = (data instanceof IEntityDTO) ? (IEntityDTO) data : rawGet(realId);
        return doGetFullModelTag(entity);
    }

    @Override
    public String getFullModelTag(IEntityDTO entity) throws Throwable {
        Assert.notNull(entity, "\u4f20\u5165\u6570\u636e\u5bf9\u8c61\u65e0\u6548");
        prepare();
        return (String) execute((IAction) (Object[] unused) -> onGetFullModelTag(entity), null);
    }

    protected String onGetFullModelTag(IEntityDTO entity) throws Throwable {
        String id = entity.getString(getKeyPSDEField().getLowerCaseName(), null);
        if (!StringUtils.hasLength(id)) {
            return doGetFullModelTag(entity);
        }
        IPSDevSysUser devUser = getCurrentPSDevSysUser(false);
        ActionSession session = ActionSessionManager.getCurrentSessionMust();
        String cacheKey = String.format("CACHE_getFullModelTagByRealId_%s_%s_%s",
                getId(), devUser.getPSDevSlnSysId(), id);
        Object cached = session.getActionParam(cacheKey);
        if (cached == null) {
            cached = doGetFullModelTag(entity);
            session.setActionParam(cacheKey, (cached == null) ? "" : cached.toString());
        }
        String tag = (cached == null) ? "" : cached.toString();
        if (tag.isEmpty()) {
            throw new Exception(String.format(
                    "\u65e0\u6cd5\u83b7\u53d6\u6307\u5b9a\u5b8c\u6574\u6a21\u578b\u6807\u8bb0[%1$s]", id));
        }
        return tag;
    }

    protected String doGetFullModelTag(IEntityDTO entity) throws Throwable {
        if (isNestedModel()) {
            List<IPSDER1NBase> scopeDers = getModelScopePSDER1Ns();
            if (!ObjectUtils.isEmpty(scopeDers)) {
                for (IPSDER1NBase der : scopeDers) {
                    Object parentId = entity.get(der.getPickupPSDEFieldMust().getLowerCaseName());
                    if (ObjectUtils.isEmpty(parentId)) {
                        if (!der.getPickupPSDEFieldMust().isAllowEmpty()) {
                            throw new Exception(String.format(
                                    "\u7236\u5b9e\u4f53[%1$s]\u503c\u65e0\u6548",
                                    der.getMajorPSDataEntityMust().getId()));
                        }
                        continue;
                    }
                    IDataEntityRuntime parentRt = (IDataEntityRuntime)
                            getSystemRuntime().getDataEntityRuntime(der.getMajorPSDataEntityMust().getId());
                    return parentRt.getFullModelTagByRealId(parentId.toString());
                }
            }
        } else {
            Object modelTag = null;
            IPSDEField tagField = getModelTagPSDEField();
            if (tagField != null) {
                modelTag = entity.get(tagField.getLowerCaseName());
            }
            if (ObjectUtils.isEmpty(modelTag) && getMajorPSDEField() != null) {
                String dm = getMajorPSDEField().getDupCheckMode();
                if (StringUtils.hasLength(dm) && !PSModelEnums.DEFDupCheckMode.NONE.value.equals(dm)) {
                    tagField = getMajorPSDEField();
                    modelTag = entity.get(getMajorPSDEField().getLowerCaseName());
                }
            }
            if (ObjectUtils.isEmpty(modelTag)) {
                IPSDEField codeField = getPSDEField("CODENAME", true);
                if (codeField != null) {
                    String dm = codeField.getDupCheckMode();
                    if (StringUtils.hasLength(dm) && !PSModelEnums.DEFDupCheckMode.NONE.value.equals(dm)) {
                        tagField = codeField;
                        modelTag = entity.get(codeField.getLowerCaseName());
                        if (ObjectUtils.isEmpty(modelTag)) {
                            String autoCode = String.format("Auto%1$s", random.nextInt(99999999));
                            IEntityDTO upd = createEntity();
                            upd.set(getKeyPSDEField().getLowerCaseName(), getKeyFieldValue((IEntityBase) entity));
                            upd.set(codeField.getLowerCaseName(), autoCode);
                            final IEntityDTO fUpd = upd;
                            execute((IAction) (Object[] unused) -> {
                                rawUpdate(Arrays.asList(fUpd), true);
                                return null;
                            }, null, 3);
                            entity.set(codeField.getLowerCaseName(), autoCode);
                            modelTag = autoCode;
                        }
                    }
                }
            }
            if (!ObjectUtils.isEmpty(modelTag) && tagField != null) {
                List<IPSDER1NBase> scopeDers = getModelScopePSDER1Ns();
                if (!ObjectUtils.isEmpty(scopeDers)) {
                    for (IPSDER1NBase der : scopeDers) {
                        Object parentId = entity.get(der.getPickupPSDEFieldMust().getLowerCaseName());
                        if (ObjectUtils.isEmpty(parentId)) {
                            if (!der.getPickupPSDEFieldMust().isAllowEmpty()) {
                                throw new Exception(String.format(
                                        "\u7236\u5b9e\u4f53[%1$s]\u503c\u65e0\u6548",
                                        der.getMajorPSDataEntityMust().getId()));
                            }
                            continue;
                        }
                        IDataEntityRuntime parentRt = (IDataEntityRuntime)
                                getSystemRuntime().getDataEntityRuntime(der.getMajorPSDataEntityMust().getId());
                        String parentFullTag = parentRt.getFullModelTagByRealId(parentId.toString());
                        return String.format("%1$s.%2$s", parentFullTag, modelTag);
                    }
                }
                return modelTag.toString();
            }
        }
        throw new Exception("\u6807\u8bb0\u5c5e\u6027\u65e0\u6548");
    }

    @Override
    public String getModelTag(IEntityDTO entity) throws Throwable {
        Assert.notNull(entity, "\u4f20\u5165\u6570\u636e\u5bf9\u8c61\u65e0\u6548");
        prepare();
        try {
            return (String) execute((IAction) (Object[] unused) -> onGetModelTag(entity), null);
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            DataEntityRuntimeException.rethrow((IModelRuntime) this, ex);
            throw new DataEntityRuntimeException((IDataEntityRuntimeBase) this,
                    String.format("\u83b7\u53d6\u6a21\u578b\u6807\u8bb0\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
        }
    }

    protected String onGetModelTag(IEntityDTO entity) throws Throwable {
        Object modelTag = null;
        IPSDEField tagField = getModelTagPSDEField();
        if (tagField != null) {
            modelTag = entity.get(tagField.getLowerCaseName());
        }
        if (ObjectUtils.isEmpty(modelTag) && getMajorPSDEField() != null) {
            String dm = getMajorPSDEField().getDupCheckMode();
            if (StringUtils.hasLength(dm) && !PSModelEnums.DEFDupCheckMode.NONE.value.equals(dm)) {
                tagField = getMajorPSDEField();
                modelTag = entity.get(getMajorPSDEField().getLowerCaseName());
            }
        }
        if (ObjectUtils.isEmpty(modelTag)) {
            IPSDEField codeField = getPSDEField("CODENAME", true);
            if (codeField != null) {
                String dm = codeField.getDupCheckMode();
                if (StringUtils.hasLength(dm) && !PSModelEnums.DEFDupCheckMode.NONE.value.equals(dm)) {
                    tagField = codeField;
                    modelTag = entity.get(codeField.getLowerCaseName());
                    if (ObjectUtils.isEmpty(modelTag)) {
                        String autoCode = String.format("Auto%1$s", random.nextInt(99999999));
                        IEntityDTO upd = createEntity();
                        upd.set(getKeyPSDEField().getLowerCaseName(), getKeyFieldValue((IEntityBase) entity));
                        upd.set(codeField.getLowerCaseName(), autoCode);
                        final IEntityDTO fUpd = upd;
                        execute((IAction) (Object[] unused) -> {
                            rawUpdate(Arrays.asList(fUpd), true);
                            return null;
                        }, null, 3);
                        entity.set(codeField.getLowerCaseName(), autoCode);
                        return autoCode;
                    }
                }
            }
        }
        if (!ObjectUtils.isEmpty(modelTag) && tagField != null) {
            return modelTag.toString();
        }
        throw new Exception(String.format(
                "[%1$s]\u6807\u8bb0\u5c5e\u6027\u65e0\u6548", getFullDataInfo(entity)));
    }

    // DSL unique-ID bridge ----------------------------------------------------

    @Override
    public String getRealIdByDSLUniqueId(String dslUniqueId, boolean bTryMode) throws Throwable {
        return getRealIdByFullModelTag(dslUniqueId, bTryMode);
    }

    @Override
    public String getDSLUniqueIdByRealId(String realId) throws Throwable {
        return getFullModelTagByRealId(realId);
    }

    @Override
    public String getDSLUniqueId(IEntityDTO entity) throws Throwable {
        return getFullModelTag(entity);
    }

    // getModelDSLNodeName -----------------------------------------------------

    @Override
    public String getModelDSLNodeName() {
        try {
            return getPSDataEntity().getCodeName().toLowerCase();
        } catch (Throwable ex) {
            log.error("getModelDSLNodeName error", ex);
            return getLowerCaseName();
        }
    }

    // containsForeignKey2 -----------------------------------------------------

    @Override
    public Page<IEntityDTO> containsForeignKey2(IPSDEField field, Object key,
            IPSDERBase der, int maxCount) {
        Assert.notNull(field, "\u672a\u4f20\u5165\u5916\u952e\u5c5e\u6027");
        if (getDEType() == PSModelEnums.DEType.ABSTRACT.value) {
            try {
                List<IPSDERBase> majorDers = getPSDataEntity().getMajorPSDERs();
                if (!ObjectUtils.isEmpty(majorDers)) {
                    for (IPSDERBase item : majorDers) {
                        if (!(item instanceof IPSDERMultiInherit)) continue;
                        IPSDERMultiInherit mi = (IPSDERMultiInherit) item;
                        IDataEntityRuntime minorRt = (IDataEntityRuntime)
                                getSystemRuntime().getDataEntityRuntime(mi.getMinorPSDataEntityMust().getId());
                        IPSDEField inheritField = minorRt.getPSDEField(field.getName(), true);
                        if (inheritField instanceof IPSInheritDEField) {
                            IPSInheritDEField inh = (IPSInheritDEField) inheritField;
                            if (mi.getId().equals(inh.getPSDERMust().getId())) {
                                Page<IEntityDTO> result = minorRt.containsForeignKey2(
                                        inh, key, der, maxCount);
                                if (result != null && !result.getContent().isEmpty()) {
                                    return result;
                                }
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                throw new DataEntityRuntimeException((IDataEntityRuntimeBase) this,
                        String.format("\u83b7\u53d6\u5b9e\u4f53\u4e3b\u5173\u7cfb\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
            }
            return null;
        }

        ISearchContextDTO ctx = createSearchContext();
        SearchContextDTO.addSearchFieldCond(ctx, field.getName(), "EQ", key);

        if (getDEType() == 4 && der instanceof IPSDERCustom) {
            IPSDERCustom custom = (IPSDERCustom) der;
            IPSDEField parentTypeField = getPSDEFieldByPredefinedType(
                    PSModelEnums.PredefinedFieldType.PARENTTYPE.value, false);
            IPSDEField parentSubTypeField = getPSDEFieldByPredefinedType(
                    PSModelEnums.PredefinedFieldType.PARENTSUBTYPE.value, true);
            String parentType = custom.getParentType();
            if (!StringUtils.hasLength(parentType)) {
                parentType = getDERParentType();
            }
            String parentSubType = null;
            if (parentSubTypeField != null) {
                parentSubType = custom.getParentSubType();
                if (!StringUtils.hasLength(parentSubType)) {
                    parentSubType = custom.getMinorCodeName();
                }
            }
            if (parentTypeField != null) {
                setSearchCondition((ISearchContextBase) ctx, parentTypeField, "EQ", parentType);
            }
            if (parentSubTypeField != null) {
                if (StringUtils.hasLength(parentSubType)) {
                    try {
                        setSearchCondition((ISearchContextBase) ctx, parentSubTypeField, "EQ",
                                DataTypeUtils.convert(parentSubTypeField.getStdDataType(), parentSubType));
                    } catch (Exception ex) {
                        log.error("containsForeignKey2 parentSubType", ex);
                    }
                } else {
                    setSearchCondition((ISearchContextBase) ctx, parentSubTypeField, "ISNULL", null);
                }
            }
        }

        int limit = maxCount > 0 ? maxCount : 1;
        setSearchPaging((ISearchContextBase) ctx, 0, limit, Sort.unsorted());
        ctx.setCount(true);
        try {
            if (getDefaultPSDEDataSet() == null) {
                throw new Exception("\u672a\u6307\u5b9a\u9ed8\u8ba4\u6570\u636e\u96c6");
            }
            @SuppressWarnings("unchecked")
            Page<IEntityDTO> page = (Page<IEntityDTO>) fetchDataSet(
                    getDefaultPSDEDataSet().getName(), getDefaultPSDEDataSet(), new Object[]{ctx});
            if (page == null || ObjectUtils.isEmpty(page.getContent())) {
                return null;
            }
            return page;
        } catch (Throwable ex) {
            throw new DataEntityRuntimeException((IDataEntityRuntimeBase) this,
                    String.format("\u68c0\u67e5\u662f\u5426\u5f15\u7528\u6307\u5b9a\u6570\u636e[%1$s][%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s",
                            field.getName(), key, ex.getMessage()), ex);
        }
    }

    // Inform / log / version-tracking hooks -----------------------------------

    protected void informObjectChanged(IEntityDTO et,
            PSModelEnums.PSModelChangeType psModelChangeType) throws Throwable {
        if (!isEnableStateInform()) {
            return;
        }
        informOPInfo(et, psModelChangeType);
        String strTag = informStateMap.get(getName());
        if (strTag == null) {
            return;
        }
        IEntityDTO lastEt = et;
        String strPSDSConsoleId = DataTypeUtils.asString(et.get("psdsconsoleid"), null);
        if (ObjectUtils.isEmpty(strPSDSConsoleId)) {
            strPSDSConsoleId = DataTypeUtils.asString(et.get("psdevslnsysid"));
        }
        if (ObjectUtils.isEmpty(strPSDSConsoleId)) {
            IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
            if (iPSDevSysUser != null) {
                strPSDSConsoleId = iPSDevSysUser.getStudioConsoleId();
                if (ObjectUtils.isEmpty(strPSDSConsoleId)) {
                    strPSDSConsoleId = iPSDevSysUser.getPSDevSlnSysId();
                }
            }
        }
        if (ObjectUtils.isEmpty(strPSDSConsoleId)) {
            return;
        }
        final String strTopicId = strPSDSConsoleId;
        PSModelEnums.StudioConsoleCommandType studioConsoleCommandType =
                PSModelEnums.StudioConsoleCommandType.OBJECTUPDATED;
        if (psModelChangeType == PSModelEnums.PSModelChangeType.DELETE) {
            studioConsoleCommandType = PSModelEnums.StudioConsoleCommandType.OBJECTREMOVED;
        } else if (psModelChangeType == PSModelEnums.PSModelChangeType.CREATE) {
            studioConsoleCommandType = PSModelEnums.StudioConsoleCommandType.OBJECTCREATED;
        }
        Map<String, Object> jo = new LinkedHashMap<>();
        jo.put("srfdename", getName());
        String strMajorText = getMajorPSDEField() != null
                ? DataTypeUtils.asString(lastEt.get(getMajorPSDEField().getLowerCaseName())) : null;
        String strKey = DataTypeUtils.asString(lastEt.get(getKeyPSDEField().getLowerCaseName()));
        jo.put("srfkey", strKey);
        jo.put(getKeyPSDEField().getLowerCaseName(), strKey);
        if (strMajorText != null) {
            jo.put("srfmajortext", strMajorText);
            jo.put(getMajorPSDEField().getLowerCaseName(), strMajorText);
        }
        if (!ObjectUtils.isEmpty(strTag)) {
            String[] tags = strTag.split("[|]");
            for (String tag : tags) {
                jo.put(tag.toLowerCase(), lastEt.get(tag));
            }
        }
        IPSDEField iField = getPSDEField("CODENAME", true);
        if (iField != null && lastEt.contains("CODENAME")) {
            jo.put("codename", lastEt.get("CODENAME"));
        }
        iField = getPSDEField("LOGICNAME", true);
        if (iField != null && lastEt.contains("LOGICNAME")) {
            jo.put("logicname", lastEt.get("LOGICNAME"));
        }
        if (studioConsoleCommandType == PSModelEnums.StudioConsoleCommandType.OBJECTCREATED
                || studioConsoleCommandType == PSModelEnums.StudioConsoleCommandType.OBJECTUPDATED) {
            iField = getPSDEField("LEFTPOS", true);
            if (iField != null && lastEt.contains("LEFTPOS") && lastEt.get("LEFTPOS") != null) {
                jo.put("leftpos", lastEt.get("LEFTPOS"));
            }
            iField = getPSDEField("TOPPOS", true);
            if (iField != null && lastEt.contains("TOPPOS") && lastEt.get("TOPPOS") != null) {
                jo.put("toppos", lastEt.get("TOPPOS"));
            }
        }
        fillInformObject(lastEt, psModelChangeType, jo);
        final String strContent = JsonUtils.toString(jo);
        final String strSubType = studioConsoleCommandType.value;
        ActionSessionManager.getCurrentSessionMust().registerFutureAction(new ASFutureActionBase() {
            @Override
            public void commit() {
                getStudioSysUtilRuntime().sendCommand(strTopicId, strSubType, strContent);
            }
        });
    }

    protected void informOPInfo(IEntityDTO et, PSModelEnums.PSModelChangeType psModelChangeType) {
        try {
            if (!isEnableOPInfoInformDefault()) {
                return;
            }
            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            if (actionSession == null) {
                return;
            }
            if (!sysModelLogMap.containsKey(getName())) {
                return;
            }
            String strKey = DataTypeUtils.asString(et.get(getKeyPSDEField().getLowerCaseName()));
            if (ObjectUtils.isEmpty(strKey)) {
                return;
            }
            String strTag = String.format("INFORMOPINFO|%1$s|%2$s", getName(), strKey);
            if (actionSession.getActionParam(strTag) != null) {
                return;
            }
            actionSession.setActionParam(strTag, "");
            IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
            if (iEmployeeContext == null) {
                return;
            }
            String strPSDSConsoleId = DataTypeUtils.asString(et.get("psdsconsoleid"), null);
            if (ObjectUtils.isEmpty(strPSDSConsoleId)) {
                strPSDSConsoleId = DataTypeUtils.asString(et.get("psdevslnsysid"));
            }
            if (ObjectUtils.isEmpty(strPSDSConsoleId)) {
                IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
                if (iPSDevSysUser != null) {
                    strPSDSConsoleId = iPSDevSysUser.getStudioConsoleId();
                    if (ObjectUtils.isEmpty(strPSDSConsoleId)) {
                        strPSDSConsoleId = iPSDevSysUser.getPSDevSlnSysId();
                    }
                }
            }
            if (ObjectUtils.isEmpty(strPSDSConsoleId)) {
                return;
            }
            String strLoginName = iEmployeeContext.getUsername();
            if (ObjectUtils.isEmpty(strLoginName)) {
                strLoginName = "!\u672a\u77e5\u7528\u6237";
            }
            IEntityDTO lastEt = et;
            if (psModelChangeType == PSModelEnums.PSModelChangeType.DELETE) {
                lastEt = getLastEntity();
                if (lastEt == null) {
                    lastEt = rawGet(et.get(getKeyPSDEField().getLowerCaseName()));
                }
            }
            if (lastEt == null) {
                lastEt = et;
            }
            String strAction = psModelChangeType.text;
            String strDataInfo;
            try {
                strDataInfo = getDataInfo2(lastEt);
            } catch (Throwable ex) {
                strDataInfo = "!\u65e0\u6cd5\u8ba1\u7b97";
            }
            String strInfo = String.format("%1$s [%2$s] %3$s(%4$s)[%5$s]", strLoginName, strAction,
                    getLogicName(), getModelV2Name(true), strDataInfo);
            if (psModelChangeType == PSModelEnums.PSModelChangeType.DELETE) {
                strInfo = ConsoleUtils.getContent(strInfo, 33, -1, 1);
            } else if (psModelChangeType == PSModelEnums.PSModelChangeType.CREATE) {
                strInfo = ConsoleUtils.getContent(strInfo, 32, -1, 1);
            } else if (psModelChangeType == PSModelEnums.PSModelChangeType.UPDATE) {
                strInfo = ConsoleUtils.getContent(strInfo, 34, -1, 1);
            }
            final String strTopic = strPSDSConsoleId;
            final String strContent = strInfo;
            ActionSessionManager.getCurrentSessionMust().registerFutureAction(new ASFutureActionBase() {
                @Override
                public void commit() {
                    getStudioSysUtilRuntime().sendConsole(strTopic, strContent, LOGGER_OPINFO);
                }
            });
        } catch (Throwable ex) {
            log.error(ex);
        }
    }

    protected void fillInformObject(IEntityDTO entity,
            PSModelEnums.PSModelChangeType changeType,
            Map<String, Object> jo) throws Throwable {
        // subclasses may populate additional fields
    }

    // logSysModelChanged ------------------------------------------------------

    protected void logSysModelChanged(IEntityDTO entity,
            PSModelEnums.PSModelChangeType changeType) throws Throwable {
        if (!PSModels.isModelInstDataEntity(getName())) {
            return;
        }
        boolean simpleMode = (entity == null);

        // Log system model change (PSSysModelLog)
        if (sysModelLogMap.containsKey(getName())) {
            String modelName = sysModelLogMap.get(getName());
            if (!StringUtils.hasLength(modelName)) {
                modelName = getName();
            }
            Object sysId = simpleMode ? null : entity.get("pssystemid");
            if (sysId == null) {
                IPSDevSysUser devUser = getCurrentPSDevSysUser(false);
                sysId = devUser.getPSSystemId();
            }
            if (!ObjectUtils.isEmpty(sysId)) {
                ActionSession session = ActionSessionManager.getCurrentSession();
                if (session != null && session.registerRecursion("LOGSYSMODELCHANGED", (String) sysId, modelName)) {
                    PSSysModelLogDTO logDto = (PSSysModelLogDTO)
                            getPSSysModelLogDERuntime().createEntity();
                    logDto.setPSSystemId((String) sysId);
                    logDto.setPSSystemName("(N/A)");
                    logDto.setPSSysModelLogName(modelName);
                    getPSSysModelLogDERuntime().save((IEntityDTO) logDto, false);
                }
            } else {
                log.error(String.format(
                        "\u7cfb\u7edf\u6a21\u578b[%1$s]\u53d8\u5316\u6ca1\u6709\u88ab\u65e5\u5fd7\uff0c\u6ca1\u6709\u7cfb\u7edf\u6807\u8bc6",
                        getName()));
            }
        }

        if (simpleMode) return;

        // Delete model folder items on DELETE
        if (changeType == PSModelEnums.PSModelChangeType.DELETE) {
            try {
                String sql = "DELETE FROM T_SRFPSSYSMODELFOLDERITEM WHERE PSOBJTYPE=? AND PSOBJID=?";
                List<Object> params = new ArrayList<>();
                params.add(getName());
                params.add((String) entity.get(getKeyPSDEField().getLowerCaseName()));
                getSysDBSchemeRuntimeMust().executeSQL(sql, params);
            } catch (Throwable ex) {
                log.error("Failed to delete model folder items", ex);
            }
        }

        // TODO: PSSysModelChgLogDTO depends on ibiz-centralstudio.
        //       The full implementation also logs change details via
        //       deLogMap / sysModelChgLogMap lookups.
    }

    // logDEModelVerChanged ----------------------------------------------------

    protected void logDEModelVerChanged(IEntityDTO entity) throws Throwable {
        if (!PSModels.isModelInstDataEntity(getName())) return;
        boolean updatedSys = false;

        // deModelVerMap
        String psdeIdField = deModelVerMap.get(getName());
        if (StringUtils.hasLength(psdeIdField)) {
            String psdeId = entity.getString(psdeIdField, null);
            if (!StringUtils.hasLength(psdeId) && getLastEntity() != null) {
                psdeId = DataTypeUtils.asString(getLastEntity().get(psdeIdField));
            }
            if (StringUtils.hasLength(psdeId)) {
                ActionSession session = ActionSessionManager.getCurrentSession();
                if (session != null && session.registerRecursion("LOGDEMODELVERCHANGED", "PSDATAENTITY", psdeId)) {
                    List<Object> par = new ArrayList<>();
                    par.add(psdeId);
                    getSysDBSchemeRuntimeMust().executeSQL(
                            "UPDATE T_SRFPSDATAENTITY SET MODELVER=MODELVER+1 WHERE PSDATAENTITYID=?", par);
                    getSysDBSchemeRuntimeMust().executeSQL(
                            "UPDATE T_SRFPSSYSTEM SET MODELVER=MODELVER+1 WHERE EXISTS("
                            + "SELECT * FROM T_SRFPSDATAENTITY WHERE T_SRFPSSYSTEM.PSSYSTEMID=T_SRFPSDATAENTITY.PSSYSTEMID"
                            + " AND T_SRFPSDATAENTITY.PSDATAENTITYID=?)", par);
                }
                updatedSys = true;
            }
        }

        // deModelVerMap2
        psdeIdField = deModelVerMap2.get(getName());
        if (StringUtils.hasLength(psdeIdField)) {
            String psdeId = entity.getString(psdeIdField, null);
            if (!StringUtils.hasLength(psdeId) && getLastEntity() != null) {
                psdeId = DataTypeUtils.asString(getLastEntity().get(psdeIdField));
            }
            if (StringUtils.hasLength(psdeId)) {
                ActionSession session = ActionSessionManager.getCurrentSession();
                if (session != null && session.registerRecursion("LOGDEMODELVERCHANGED", "PSDATAENTITY", psdeId)) {
                    List<Object> par = new ArrayList<>();
                    par.add(psdeId);
                    getSysDBSchemeRuntimeMust().executeSQL(
                            "UPDATE T_SRFPSDATAENTITY SET MODELVER=MODELVER+1 WHERE PSDATAENTITYID=?", par);
                    getSysDBSchemeRuntimeMust().executeSQL(
                            "UPDATE T_SRFPSSYSTEM SET MODELVER=MODELVER+1 WHERE EXISTS("
                            + "SELECT * FROM T_SRFPSDATAENTITY WHERE T_SRFPSSYSTEM.PSSYSTEMID=T_SRFPSDATAENTITY.PSSYSTEMID"
                            + " AND T_SRFPSDATAENTITY.PSDATAENTITYID=?)", par);
                }
                updatedSys = true;
            }
        }

        if (!updatedSys) {
            IPSDevSysUser devUser = getCurrentPSDevSysUser(false);
            String sysIdField = sysModelVerMap.get(getName());
            if (sysIdField != null) {
                String sysId = devUser.getPSSystemId();
                if (!StringUtils.hasLength(sysId) && StringUtils.hasLength(sysIdField)) {
                    sysId = entity.getString(sysIdField, null);
                }
                if (!StringUtils.hasLength(sysId) && getLastEntity() != null) {
                    sysId = DataTypeUtils.asString(getLastEntity().get(sysIdField));
                }
                if (StringUtils.hasLength(sysId)) {
                    ActionSession session = ActionSessionManager.getCurrentSession();
                    if (session != null && session.registerRecursion("LOGDEMODELVERCHANGED", "PSSYSTEM", sysId)) {
                        List<Object> par = new ArrayList<>();
                        par.add(sysId);
                        getSysDBSchemeRuntimeMust().executeSQL(
                                "UPDATE T_SRFPSSYSTEM SET MODELVER=MODELVER+1 WHERE PSSYSTEMID=?", par);
                    }
                }
            } else {
                String sql = sysModelVerSqlMap.get(getName());
                if (StringUtils.hasLength(sql)) {
                    String key = DataTypeUtils.asString(entity.get(getKeyPSDEField().getLowerCaseName()));
                    if (StringUtils.hasLength(key)) {
                        ActionSession session = ActionSessionManager.getCurrentSession();
                        if (session != null && session.registerRecursion("LOGDEMODELVERCHANGED", "PSSYSTEM", (String) key)) {
                            List<Object> par = new ArrayList<>();
                            par.add(key);
                            getSysDBSchemeRuntimeMust().executeSQL(sql, par);
                        }
                    }
                }
            }
        }
    }

    // logDEDBVerChanged -------------------------------------------------------

    protected void logDEDBVerChanged(IEntityDTO entity) throws Throwable {
        String psdeIdField = deDBVerMap.get(getName());
        if (StringUtils.hasLength(psdeIdField)) {
            String psdeId = entity.getString(psdeIdField, null);
            if (!StringUtils.hasLength(psdeId)) {
                IEntityDTO last = getLastEntityIf(entity);
                if (last != null) {
                    psdeId = DataTypeUtils.asString(last.get(psdeIdField));
                }
            }
            if (StringUtils.hasLength(psdeId)) {
                ActionSession session = ActionSessionManager.getCurrentSession();
                if (session != null && session.registerRecursion("LOGDEDBVERCHANGED", "PSDATAENTITY", (String) psdeId)) {
                    List<Object> par = new ArrayList<>();
                    par.add(psdeId);
                    getSysDBSchemeRuntimeMust().executeSQL(
                            "UPDATE T_SRFPSDATAENTITY SET DBVER=DBVER+1 WHERE PSDATAENTITYID=?", par);
                    getSysDBSchemeRuntimeMust().executeSQL(
                            "UPDATE T_SRFPSSYSTEM SET DBVERSION=DBVERSION+1 WHERE EXISTS("
                            + "SELECT * FROM T_SRFPSDATAENTITY T1 WHERE T1.PSDATAENTITYID=? AND T1.PSSYSTEMID=T_SRFPSSYSTEM.PSSYSTEMID)",
                            par);
                }
            }
        }
    }

    // getLastEntityIf ---------------------------------------------------------

    protected IEntityDTO getLastEntityIf(IEntityDTO entity) {
        IEntityDTO last = getLastEntity();
        if (last == null) {
            last = rawSelectOne(
                    createSearchContext().count(false)
                            .eq(getKeyPSDEField().getLowerCaseName(),
                                    entity.get(getKeyPSDEField().getLowerCaseName())),
                    true);
        }
        return last;
    }

    // updatePSSysModelLog -----------------------------------------------------

    protected void updatePSSysModelLog(String psSystemId) {
        try {
            List<Object> par = new ArrayList<>();
            par.add(new Timestamp(System.currentTimeMillis()));
            par.add(psSystemId);
            getSysDBSchemeRuntimeMust().executeSQL(
                    "UPDATE T_SRFPSSYSMODELLOG SET UPDATEDATE = ? WHERE PSSYSTEMID=?", par);
        } catch (Throwable ex) {
            log.error("updatePSSysModelLog error", ex);
        }
    }

    // syncSysTask -------------------------------------------------------------

    protected void syncSysTask(IEntityDTO entity, boolean bRemove) throws Throwable {
        // subclasses may override; default no-op
    }

    // Nested DER translate (stubs) --------------------------------------------

    protected boolean isEnableNestedDERTranslate() {
        return nestedDERTranslateMap.containsKey(getName());
    }

    @Override
    protected void checkEntityNestedDERsBeforeProceed(IEntityBase arg0, String actionName,
            IPSDEAction action, IPSDataEntity dataEntity,
            IDynaInstRuntime dynaInstRuntime, Object actionData) throws Throwable {
        if (isEnableNestedDERTranslate() && arg0 instanceof IEntityDTO) {
            PSModelTranslator psModelTranslator = createPSModelTranslator(true);
            psModelTranslator.input((IEntityDTO) arg0);
        }
        super.checkEntityNestedDERsBeforeProceed(arg0, actionName, action, dataEntity,
                dynaInstRuntime, actionData);
    }

    protected PSModelTranslator createPSModelTranslator(boolean bInput) {
        return new PSModelTranslator();
    }

    @Override
    protected void translateEntityNestedDERsAfterProceed(IEntityBase arg0, String actionName,
            IPSDEAction action, IPSDataEntity dataEntity,
            IDynaInstRuntime dynaInstRuntime, Object actionData) throws Throwable {
        super.translateEntityNestedDERsAfterProceed(arg0, actionName, action, dataEntity,
                dynaInstRuntime, actionData);
        if (isEnableNestedDERTranslate() && arg0 instanceof IEntityDTO) {
            PSModelTranslator psModelTranslator = createPSModelTranslator(false);
            psModelTranslator.output((IEntityDTO) arg0);
        }
    }

    // fillEntityDefaultValues -------------------------------------------------

    @Override
    protected void fillEntityDefaultValues(IEntityBase arg0, String actionName,
            IPSDEAction action, IPSDataEntity dataEntity,
            IDynaInstRuntime dynaInstRuntime, Object actionData) throws Throwable {
        super.fillEntityDefaultValues(arg0, actionName, action, dataEntity,
                dynaInstRuntime, actionData);
    }

    // calcFieldValue ----------------------------------------------------------

    @Override
    protected Object calcFieldValue(IEntityBase entity, IPSDEField field,
            String defaultValueType, String defaultValue) throws Exception {
        return super.calcFieldValue(entity, field, defaultValueType, defaultValue);
    }

    // fillNestedEntitiesOrderValue --------------------------------------------

    @Override
    public void fillNestedEntitiesOrderValue(IEntityBase parentEntity,
            IEntityBase[] entities, IPSDERBase der,
            IDynaInstRuntime dynaInstRuntime) throws Throwable {
        if (PSModels.isModelInstDataEntity(getName())) {
            return;
        }
        super.fillNestedEntitiesOrderValue(parentEntity, entities, der, dynaInstRuntime);
    }

    // Hook stubs (IEntityDTO-level, may be overridden by subclasses) ----------

    protected void onPrepareCreate(IEntityDTO entity) throws Throwable {
    }

    protected void onBeforeCreate(IEntityDTO entity) throws Throwable {
    }

    protected void onPrepareUpdate(IEntityDTO entity) throws Throwable {
    }

    protected void onBeforeUpdate(IEntityDTO entity) throws Throwable {
    }

    protected void onAfterGetDraft(IEntityDTO entity) throws Throwable {
    }

    protected void onBeforeImportModelV2(Object[] args) throws Throwable {
    }

    protected Object onAfterImportModelV2(Object[] args, Object ret) throws Throwable {
        return ret;
    }

    protected void onBeforeExportModelV2(Object[] args) throws Throwable {
    }

    protected Object onAfterExportModelV2(Object[] args, Object ret) throws Throwable {
        return ret;
    }

    // DSL-transpiler-related stubs --------------------------------------------

    // TODO: createProxyDEService depends on PSModelDEServiceInvocationHandler
    //       (ibiz-centralstudio). When available, uncomment:
    // protected <T> T createProxyDEService(Class<?> cls) throws Exception {
    //     ...
    // }

    // Studio console -----------------------------------------------------------

    protected void sendStudioConsole(boolean bDSConsoleOnly, int nLogLevel, String strInfo,
            boolean bCommit) {
        sendStudioConsole(bDSConsoleOnly, nLogLevel, strInfo, null, null, bCommit);
    }

    protected void sendStudioConsole(boolean bDSConsoleOnly, int nLogLevel, String strInfo,
            String strLogger, String strData, boolean bCommit) {
        if (!internalSendStudioConsole(bDSConsoleOnly, nLogLevel, strInfo, strLogger, strData, bCommit)) {
            if (nLogLevel == 20000) {
                log.info(strInfo);
            } else if (nLogLevel == 30000) {
                log.warn(strInfo);
            } else if (nLogLevel == 40000) {
                log.error(strInfo);
            } else if (nLogLevel == 10000) {
                log.debug(strInfo);
            }
        }
    }

    protected boolean internalSendStudioConsole(boolean bDSConsoleOnly, int nLogLevel, String strInfo,
            String strLogger, String strData, boolean bCommit) {
        IPSDevSysUser iPSDevSysUser;
        try {
            iPSDevSysUser = getCurrentPSDevSysUser(true);
        } catch (Exception ex) {
            log.error(ex);
            return false;
        }
        String strPSDSConsoleId = null;
        if (iPSDevSysUser != null) {
            strPSDSConsoleId = iPSDevSysUser.getStudioConsoleId();
            if (ObjectUtils.isEmpty(strPSDSConsoleId) && !bDSConsoleOnly) {
                strPSDSConsoleId = iPSDevSysUser.getPSDevSlnSysId();
            }
        }
        if (ObjectUtils.isEmpty(strPSDSConsoleId)) {
            return false;
        }
        if (nLogLevel == 20000) {
            strInfo = ConsoleUtils.getContent(strInfo, 34, -1, 1);
        } else if (nLogLevel == 30000) {
            strInfo = ConsoleUtils.getContent(strInfo, 33, -1, 1);
        } else if (nLogLevel == 40000) {
            strInfo = ConsoleUtils.getContent(strInfo, 31, -1, 1);
        } else {
            strInfo = ConsoleUtils.getContent(strInfo, 32, -1, 1);
        }
        try {
            if (bCommit) {
                final String strTopicId2 = strPSDSConsoleId;
                final String strInfo2 = strInfo;
                final String strData2 = strData;
                final String strLogger2 = strLogger;
                ActionSessionManager.getCurrentSessionMust().registerFutureAction(new ASFutureActionBase() {
                    @Override
                    public void commit() {
                        getStudioSysUtilRuntime().sendConsole(strTopicId2, strInfo2, strLogger2, strData2, true);
                    }
                });
            } else {
                getStudioSysUtilRuntime().sendConsole(strPSDSConsoleId, strInfo, strLogger, strData, true);
            }
            return true;
        } catch (Exception ex) {
            log.error(ex);
            return false;
        }
    }

    // DTO cache helpers (cached per action session) ---------------------------

    protected PSSysSFPubDTO getCurrentDefaultPSSysSFPubDTO(boolean bTryMode) throws Throwable {
        PSSysSFPubDTO psSysSFPubDTO = null;
        IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
        if (iPSDevSysUser != null) {
            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            String strCacheTag = String.format("CACHE_%s_%s", PSSysSFPubDTO.class,
                    iPSDevSysUser.getPSDevSlnSysId());
            if (actionSession != null) {
                Object item = actionSession.getActionParam(strCacheTag);
                if (item != null) {
                    return (PSSysSFPubDTO) item;
                }
            }
            IPSSysSFPubService iPSSysSFPubService =
                    getSystemRuntime().getProxyDEService(IPSSysSFPubService.class);
            psSysSFPubDTO = iPSSysSFPubService.selectOne(new SearchContextDTO()
                    .eq("DEFAULTPUB", 1).eq("pssystemid", iPSDevSysUser.getPSSystemId()), true);
            if (psSysSFPubDTO != null && actionSession != null) {
                actionSession.setActionParam(strCacheTag, psSysSFPubDTO);
            }
        }
        if (psSysSFPubDTO != null || bTryMode) {
            return psSysSFPubDTO;
        }
        throw new Exception("\u5f53\u524d\u7cfb\u7edf\u9ed8\u8ba4\u540e\u53f0\u53d1\u5e03\u5bf9\u8c61\u65e0\u6548");
    }

    protected PSSystemDTO getCurrentPSSystemDTO(boolean bTryMode) throws Throwable {
        PSSystemDTO psSystemDTO = null;
        IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
        if (iPSDevSysUser != null) {
            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            String strCacheTag = String.format("CACHE_%s_%s", PSSystemDTO.class,
                    iPSDevSysUser.getPSDevSlnSysId());
            if (actionSession != null) {
                Object item = actionSession.getActionParam(strCacheTag);
                if (item != null) {
                    return (PSSystemDTO) item;
                }
            }
            IPSSystemService iPSSystemService = getSystemRuntime().getProxyDEService(IPSSystemService.class);
            psSystemDTO = iPSSystemService.get(iPSDevSysUser.getPSSystemId(), true);
            if (psSystemDTO != null && actionSession != null) {
                actionSession.setActionParam(strCacheTag, psSystemDTO);
            }
        }
        if (psSystemDTO != null || bTryMode) {
            return psSystemDTO;
        }
        throw new Exception("\u5f53\u524d\u7cfb\u7edf\u5bf9\u8c61\u65e0\u6548");
    }

    protected PSDataEntityDTO getPSDataEntityDTO(String strPSDEId, boolean bTryMode) throws Throwable {
        if (!StringUtils.hasLength(strPSDEId)) {
            throw new Exception("\u672a\u6307\u5b9a\u5b9e\u4f53\u6807\u8bc6");
        }
        PSDataEntityDTO result = null;
        IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
        if (iPSDevSysUser != null) {
            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            String strCacheTag = String.format("CACHE_%s_%s_%s", PSDataEntityDTO.class,
                    iPSDevSysUser.getPSDevSlnSysId(), strPSDEId);
            if (actionSession != null) {
                Object item = actionSession.getActionParam(strCacheTag);
                if (item != null) {
                    return (PSDataEntityDTO) item;
                }
            }
            IPSDataEntityService service = getSystemRuntime().getProxyDEService(IPSDataEntityService.class);
            result = service.get(strPSDEId, bTryMode);
            if (result != null && actionSession != null) {
                actionSession.setActionParam(strCacheTag, result);
            }
        }
        if (result != null || bTryMode) {
            return result;
        }
        throw new Exception(String.format("\u5f53\u524d\u7cfb\u7edf\u5b9e\u4f53\u5bf9\u8c61[%1$s]\u65e0\u6548", strPSDEId));
    }

    protected PSDEServiceAPIDTO getPSDEServiceAPIDTO(String strPSDEServiceAPIId, boolean bTryMode) throws Throwable {
        if (!StringUtils.hasLength(strPSDEServiceAPIId)) {
            throw new Exception("\u672a\u6307\u5b9a\u5b9e\u4f53\u670d\u52a1\u63a5\u53e3\u6807\u8bc6");
        }
        PSDEServiceAPIDTO result = null;
        IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
        if (iPSDevSysUser != null) {
            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            String strCacheTag = String.format("CACHE_%s_%s_%s", PSDEServiceAPIDTO.class,
                    iPSDevSysUser.getPSDevSlnSysId(), strPSDEServiceAPIId);
            if (actionSession != null) {
                Object item = actionSession.getActionParam(strCacheTag);
                if (item != null) {
                    return (PSDEServiceAPIDTO) item;
                }
            }
            IPSDEServiceAPIService service = getSystemRuntime().getProxyDEService(IPSDEServiceAPIService.class);
            result = service.get(strPSDEServiceAPIId, bTryMode);
            if (result != null && actionSession != null) {
                actionSession.setActionParam(strCacheTag, result);
            }
        }
        if (result != null || bTryMode) {
            return result;
        }
        throw new Exception(String.format("\u5f53\u524d\u7cfb\u7edf\u5b9e\u4f53\u670d\u52a1\u63a5\u53e3\u5bf9\u8c61[%1$s]\u65e0\u6548", strPSDEServiceAPIId));
    }

    protected PSDEDataSetDTO getPSDEDataSetDTO(String strPSDEDataSetId, boolean bTryMode) throws Throwable {
        if (!StringUtils.hasLength(strPSDEDataSetId)) {
            throw new Exception("\u672a\u6307\u5b9a\u5b9e\u4f53\u6570\u636e\u96c6\u6807\u8bc6");
        }
        PSDEDataSetDTO result = null;
        IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
        if (iPSDevSysUser != null) {
            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            String strCacheTag = String.format("CACHE_%s_%s_%s", PSDEDataSetDTO.class,
                    iPSDevSysUser.getPSDevSlnSysId(), strPSDEDataSetId);
            if (actionSession != null) {
                Object item = actionSession.getActionParam(strCacheTag);
                if (item != null) {
                    return (PSDEDataSetDTO) item;
                }
            }
            IPSDEDataSetService service = getSystemRuntime().getProxyDEService(IPSDEDataSetService.class);
            result = service.get(strPSDEDataSetId, bTryMode);
            if (result != null && actionSession != null) {
                actionSession.setActionParam(strCacheTag, result);
            }
        }
        if (result != null || bTryMode) {
            return result;
        }
        throw new Exception(String.format("\u5f53\u524d\u7cfb\u7edf\u5b9e\u4f53\u6570\u636e\u96c6\u5bf9\u8c61[%1$s]\u65e0\u6548", strPSDEDataSetId));
    }

    protected PSDEActionDTO getPSDEActionDTO(String strPSDEActionId, boolean bTryMode) throws Throwable {
        if (!StringUtils.hasLength(strPSDEActionId)) {
            throw new Exception("\u672a\u6307\u5b9a\u5b9e\u4f53\u884c\u4e3a\u6807\u8bc6");
        }
        PSDEActionDTO result = null;
        IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
        if (iPSDevSysUser != null) {
            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            String strCacheTag = String.format("CACHE_%s_%s_%s", PSDEActionDTO.class,
                    iPSDevSysUser.getPSDevSlnSysId(), strPSDEActionId);
            if (actionSession != null) {
                Object item = actionSession.getActionParam(strCacheTag);
                if (item != null) {
                    return (PSDEActionDTO) item;
                }
            }
            IPSDEActionService service = getSystemRuntime().getProxyDEService(IPSDEActionService.class);
            result = service.get(strPSDEActionId, bTryMode);
            if (result != null && actionSession != null) {
                actionSession.setActionParam(strCacheTag, result);
            }
        }
        if (result != null || bTryMode) {
            return result;
        }
        throw new Exception(String.format("\u5f53\u524d\u7cfb\u7edf\u5b9e\u4f53\u884c\u4e3a\u5bf9\u8c61[%1$s]\u65e0\u6548", strPSDEActionId));
    }

    protected PSLanguageResDTO getPSLanguageResDTO(String strPSLanguageResId, boolean bTryMode) throws Throwable {
        if (!StringUtils.hasLength(strPSLanguageResId)) {
            throw new Exception("\u672a\u6307\u5b9a\u8bed\u8a00\u8d44\u6e90\u6807\u8bc6");
        }
        PSLanguageResDTO result = null;
        IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
        if (iPSDevSysUser != null) {
            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            String strCacheTag = String.format("CACHE_%s_%s_%s", PSLanguageResDTO.class,
                    iPSDevSysUser.getPSDevSlnSysId(), strPSLanguageResId);
            if (actionSession != null) {
                Object item = actionSession.getActionParam(strCacheTag);
                if (item != null) {
                    return (PSLanguageResDTO) item;
                }
            }
            IPSLanguageResService service = getSystemRuntime().getProxyDEService(IPSLanguageResService.class);
            result = service.get(strPSLanguageResId, bTryMode);
            if (result != null && actionSession != null) {
                actionSession.setActionParam(strCacheTag, result);
            }
        }
        if (result != null || bTryMode) {
            return result;
        }
        throw new Exception(String.format("\u5f53\u524d\u7cfb\u7edf\u8bed\u8a00\u8d44\u6e90\u5bf9\u8c61[%1$s]\u65e0\u6548", strPSLanguageResId));
    }

    protected PSSysUniResDTO getPSSysUniResDTO(String strPSSysUniResId, boolean bTryMode) throws Throwable {
        if (!StringUtils.hasLength(strPSSysUniResId)) {
            throw new Exception("\u672a\u6307\u5b9a\u7cfb\u7edf\u7edf\u4e00\u8d44\u6e90\u6807\u8bc6");
        }
        PSSysUniResDTO result = null;
        IPSDevSysUser iPSDevSysUser = getCurrentPSDevSysUser(true);
        if (iPSDevSysUser != null) {
            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            String strCacheTag = String.format("CACHE_%s_%s_%s", PSSysUniResDTO.class,
                    iPSDevSysUser.getPSDevSlnSysId(), strPSSysUniResId);
            if (actionSession != null) {
                Object item = actionSession.getActionParam(strCacheTag);
                if (item != null) {
                    return (PSSysUniResDTO) item;
                }
            }
            IPSSysUniResService service = getSystemRuntime().getProxyDEService(IPSSysUniResService.class);
            result = service.get(strPSSysUniResId, bTryMode);
            if (result != null && actionSession != null) {
                actionSession.setActionParam(strCacheTag, result);
            }
        }
        if (result != null || bTryMode) {
            return result;
        }
        throw new Exception(String.format("\u5f53\u524d\u7cfb\u7edf\u7edf\u4e00\u8d44\u6e90\u5bf9\u8c61[%1$s]\u65e0\u6548", strPSSysUniResId));
    }


    // checkReferenceBeforeRemove ----------------------------------------------

    @Override
    protected void checkReferenceBeforeRemove(Object arg0, String actionName,
            IPSDEAction action, IPSDER1NBase der, IPSDataEntity dataEntity,
            IDynaInstRuntime dynaInstRuntime, Object actionData) throws Throwable {
        IPSDataEntity minor = der.getMinorPSDataEntity();
        if (minor == null) {
            throw new ModelException((IPSModelObject) der,
                    String.format("\u5173\u7cfb[%1$s]\u4ece\u5b9e\u4f53\u65e0\u6548", der.getName()));
        }
        // TODO: full reference check logic depends on checkEntityReference
        //       from ibiz-centralstudio; for now defer to super
        super.checkReferenceBeforeRemove(arg0, actionName, action, der, dataEntity,
                dynaInstRuntime, actionData);
    }

    // Entity-name driven behaviour tables (ported from the reference provider)
    static {
        deLogMap.put("PSACHANDLER", "PSDEID");
        deLogMap.put("PSCODELIST", "PSDEID");
        deLogMap.put("PSDEACMODE", "PSDEID");
        deLogMap.put("PSDEACTION", "PSDEID");
        deLogMap.put("PSDECTRL", "PSDEID");
        deLogMap.put("PSDEDATAQUERY", "PSDEID");
        deLogMap.put("PSDEDBINDEX", "PSDEID");
        deLogMap.put("PSDEDATARELATION", "PSDEID");
        deLogMap.put("PSDEDATASET", "PSDEID");
        deLogMap.put("PSDEDBCFG", "PSDEID");
        deLogMap.put("PSDEDRGROUP", "PSDEID");
        deLogMap.put("PSDEDRITEM", "PSDEID");
        deLogMap.put("PSDEDUPRULE", "PSDEID");
        deLogMap.put("PSDEFIELD", "PSDEID");
        deLogMap.put("PSDEFORM", "PSDEID");
        deLogMap.put("PSDEGRID", "PSDEID");
        deLogMap.put("PSDELOGIC", "PSDEID");
        deLogMap.put("PSDEOPPRIV", "PSDEID");
        deLogMap.put("PSDESYSPROC", "PSDEID");
        deLogMap.put("PSDETOOLBAR", "PSDEID");
        deLogMap.put("PSDEUIACTION", "PSDEID");
        deLogMap.put("PSDEVIEWBASE", "PSDEID");
        deLogMap.put("PSDEVRGROUP", "PSDEID");
        deLogMap.put("PSDEMAINSTATE", "PSDEID");
        deLogMap.put("PSDEMAINSTATERS", "PSDEID");
        deLogMap.put("PSDEUAGROUP", "PSDEID");
        deLogMap.put("PSDEFGROUP", "PSDEID");
        deLogMap.put("PSDEGROUP", "PSDEID");
        deLogMap.put("PSDERGROUP", "PSDEID");
        deLogMap.put("PSDEACTIONGROUP", "PSDEID");
        deLogMap.put("PSDEDATAVIEW", "PSDEID");
        deLogMap.put("PSDEMAP", "PSDEID");
        deLogMap.put("PSDEFVALUERULE", "PSDEID");
        deLogMap.put("PSDATAENTITY", "PSDATAENTITYID");
        deLogMap.put("PSDEOPPRIV", "PSDEID");
        deLogMap.put("PSDEFFORMITEM", "PSDEID");
        deLogMap.put("PSDEDATAIMP", "PSDEID");
        deLogMap.put("PSDEDATAEXP", "PSDEID");
        deLogMap.put("PSDEFINPUTTIP", "PSDEID");
        deLogMap.put("PSDEWIZARD", "PSDEID");
        deLogMap.put("PSDEACTIONWIZARD", "PSDEID");
        deLogMap.put("PSDEAWGROUP", "PSDEID");
        sysModelChgLogMap.put("PSAPPLOGIC", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPUTIL", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPRESOURCE", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPFUNC", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPUISTYLE", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPMENU", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPLOCALDE", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPWF", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPUITHEME", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPMODULE", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPUTILPAGE", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPSTORYBOARD", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPPFPLUGIN", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSMOBAPPPACK", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSMOBAPPSTARTPAGE", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPPORTLET", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPTITLEBAR", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPPKG", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPLAN", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPPDTVIEW", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPUSERMODE", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPINDEXVIEW", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPDEVIEW", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPPANELVIEW", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPPORTALVIEW", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSAPPUTILVIEW", "PSSYSAPP|PSSYSAPPID");
        sysModelChgLogMap.put("PSDESARS", "PSSYSSERVICEAPI|PSSYSSERVICEAPIID");
        sysModelChgLogMap.put("PSDESERVICEAPI", "PSSYSSERVICEAPI|PSSYSSERVICEAPIID");
        sysModelChgLogMap.put("PSSUBSYSSADE", "PSSUBSYSSERVICEAPI|PSSUBSYSSERVICEAPIID");
        sysModelChgLogMap.put("PSSUBSYSSADERS", "PSSUBSYSSERVICEAPI|PSSUBSYSSERVICEAPIID");
        sysModelChgLogMap.put("PSSUBSYSSADETAIL", "PSSUBSYSSERVICEAPI|PSSUBSYSSERVICEAPIID");
        sysModelChgLogMap.put("PSSYSDBPROC", "PSSYSDBSCHEME|PSSYSDBSCHEMEID");
        sysModelChgLogMap.put("PSSYSDBTABLE", "PSSYSDBSCHEME|PSSYSDBSCHEMEID");
        sysModelChgLogMap.put("PSSYSSFPUBPKG", "PSSYSSFPUB|PSSYSSFPUBID");
        sysModelChgLogMap.put("PSSYSBDMODULE", "PSSYSBDSCHEME|PSSYSBDSCHEMEID");
        sysModelChgLogMap.put("PSSYSBDPART", "PSSYSBDSCHEME|PSSYSBDSCHEMEID");
        sysModelChgLogMap.put("PSSYSBDTABLE", "PSSYSBDSCHEME|PSSYSBDSCHEMEID");
        sysModelChgLogMap.put("PSSYSBDTABLERS", "PSSYSBDSCHEME|PSSYSBDSCHEMEID");
        sysModelChgLogMap.put("PSSYSBIAGGTABLE", "PSSYSBISCHEME|PSSYSBISCHEMEID");
        sysModelChgLogMap.put("PSSYSBICUBE", "PSSYSBISCHEME|PSSYSBISCHEMEID");
        sysModelChgLogMap.put("PSSYSBIDIMENSION", "PSSYSBISCHEME|PSSYSBISCHEMEID");
        sysModelChgLogMap.put("PSSYSBIREPORT", "PSSYSBISCHEME|PSSYSBISCHEMEID");
        sysModelChgLogMap.put("PSSYSEAIDATATYPE", "PSSYSEAISCHEME|PSSYSEAISCHEMEID");
        sysModelChgLogMap.put("PSSYSEAIDE", "PSSYSEAISCHEME|PSSYSEAISCHEMEID");
        sysModelChgLogMap.put("PSSYSEAIELEMENT", "PSSYSEAISCHEME|PSSYSEAISCHEMEID");
        sysModelChgLogMap.put("PSSYSSEARCHDE", "PSSYSSEARCHSCHEME|PSSYSSEARCHSCHEMEID");
        sysModelChgLogMap.put("PSSYSSEARCHDOC", "PSSYSSEARCHSCHEME|PSSYSSEARCHSCHEMEID");
        sysModelChgLogMap.put("PSSYSAICHATAGENT", "PSSYSAIFACTORY|PSSYSAIFACTORYID");
        sysModelChgLogMap.put("PSSYSAIPIPELINEAGENT", "PSSYSAIFACTORY|PSSYSAIFACTORYID");
        sysModelChgLogMap.put("PSSYSAIWORKERAGENT", "PSSYSAIFACTORY|PSSYSAIFACTORYID");
        deModelVerMap.put("PSACHANDLER", "PSDEID");
        deModelVerMap.put("PSCODELIST", "PSDEID");
        deModelVerMap.put("PSDEACMODE", "PSDEID");
        deModelVerMap.put("PSDEACTION", "PSDEID");
        deModelVerMap.put("PSDECHART", "PSDEID");
        deModelVerMap.put("PSDECTRL", "PSDEID");
        deModelVerMap.put("PSDEDATAQUERY", "PSDEID");
        deModelVerMap.put("PSDEDBINDEX", "PSDEID");
        deModelVerMap.put("PSDEDATARELATION", "PSDEID");
        deModelVerMap.put("PSDEDATASET", "PSDEID");
        deModelVerMap.put("PSDEDATAVIEW", "PSDEID");
        deModelVerMap.put("PSDEDBCFG", "PSDEID");
        deModelVerMap.put("PSDEDRGROUP", "PSDEID");
        deModelVerMap.put("PSDEDRITEM", "PSDEID");
        deModelVerMap.put("PSDEDUPRULE", "PSDEID");
        deModelVerMap.put("PSDEFIELD", "PSDEID");
        deModelVerMap.put("PSDEFORM", "PSDEID");
        deModelVerMap.put("PSDEFSFITEM", "PSDEID");
        deModelVerMap.put("PSDEGRID", "PSDEID");
        deModelVerMap.put("PSDELIST", "PSDEID");
        deModelVerMap.put("PSDELOGIC", "PSDEID");
        deModelVerMap.put("PSDEMAP", "PSDEID");
        deModelVerMap.put("PSDEOPPRIV", "PSDEID");
        deModelVerMap.put("PSDEPRINT", "PSDEID");
        deModelVerMap.put("PSDEREPORT", "PSDEID");
        deModelVerMap.put("PSDEUTILDE", "PSDEID");
        deModelVerMap.put("PSDESYSPROC", "PSDEID");
        deModelVerMap.put("PSDETOOLBAR", "PSDEID");
        deModelVerMap.put("PSDETREEVIEW", "PSDEID");
        deModelVerMap.put("PSDEUAGROUP", "PSDEID");
        deModelVerMap.put("PSDEGROUP", "PSDEID");
        deModelVerMap.put("PSDEFGROUP", "PSDEID");
        deModelVerMap.put("PSDEACTIONGROUP", "PSDEID");
        deModelVerMap.put("PSDERGROUP", "PSDEID");
        deModelVerMap.put("PSDEUIACTION", "PSDEID");
        deModelVerMap.put("PSDEVIEWBASE", "PSDEID");
        deModelVerMap.put("PSDEVRGROUP", "PSDEID");
        deModelVerMap.put("PSDEMAINSTATE", "PSDEID");
        deModelVerMap.put("PSDEFVALUERULE", "PSDEID");
        deModelVerMap.put("PSDER", "MINORPSDEID");
        deModelVerMap.put("PSDEVIEWBASE", "PSDEID");
        deModelVerMap.put("PSDATAENTITY", "PSDATAENTITYID");
        deModelVerMap.put("PSDEOPPRIV", "PSDEID");
        deModelVerMap.put("PSDEFFORMITEM", "PSDEID");
        deModelVerMap.put("PSDEWIZARD", "PSDEID");
        deModelVerMap.put("PSDEACTIONWIZARD", "PSDEID");
        deModelVerMap.put("PSDEAWGROUP", "PSDEID");
        deModelVerMap.put("PSDESERVICEAPI", "PSDEID");
        deModelVerMap.put("PSDEUSERROLE", "PSDEID");
        deModelVerMap.put("PSDEOPPRIVROLE", "PSDEID");
        deModelVerMap.put("PSDESAMPLEDATA", "PSDEID");
        deModelVerMap.put("PSDEMAINSTATERS", "PSDEID");
        deModelVerMap2.put("PSDER", "MAJORPSDEID");
        deModelVerMap.put("PSWFDE", "PSDEID");
        deModelVerMap.remove("PSV3MIGRATEDE");
        deModelVerMap.remove("PSDETREENODE");
        deModelVerMap.remove("PSSYSDBCHGLOG");
        deModelVerMap.remove("PSSYSPORTLET");
        deModelVerMap.remove("PSV3MIGRATEDE");
        deDBVerMap.put("PSDEDATAQUERY", "PSDEID");
        deDBVerMap.put("PSDEDBCFG", "PSDEID");
        deDBVerMap.put("PSDEFIELD", "PSDEID");
        deDBVerMap.put("PSDESYSPROC", "PSDEID");
        deDBVerMap.put("PSDER", "MINORPSDEID");
        deDBVerMap.put("PSDEDBINDEX", "PSDEID");
        sysModelVerMap.put("PSACHANDLER", "");
        sysModelVerMap.put("PSACHANDLERACTION", "");
        sysModelVerMap.put("PSAPPDERS", "");
        sysModelVerMap.put("PSAPPDERSVIEW", "");
        sysModelVerMap.put("PSAPPFUNC", "");
        sysModelVerMap.put("PSAPPLAN", "");
        sysModelVerMap.put("PSAPPLOCALDE", "");
        sysModelVerMap.put("PSAPPMENU", "");
        sysModelVerMap.put("PSAPPMENUITEM", "");
        sysModelVerMap.put("PSAPPMODULE", "");
        sysModelVerMap.put("PSAPPPDTVIEW", "");
        sysModelVerMap.put("PSAPPPKG", "");
        sysModelVerMap.put("PSAPPPORTALVIEW", "");
        sysModelVerMap.put("PSAPPPVPART", "");
        sysModelVerMap.put("PSAPPRESOURCE", "");
        sysModelVerMap.put("PSAPPSBITEM", "");
        sysModelVerMap.put("PSAPPSBITEMRS", "");
        sysModelVerMap.put("PSAPPSTORYBOARD", "");
        sysModelVerMap.put("PSAPPTITLEBAR", "");
        sysModelVerMap.put("PSAPPUISTYLE", "");
        sysModelVerMap.put("PSAPPUITHEME", "");
        sysModelVerMap.put("PSAPPUSERMODE", "");
        sysModelVerMap.put("PSAPPUTIL", "");
        sysModelVerMap.put("PSAPPUTILPAGE", "");
        sysModelVerMap.put("PSAPPVIEW", "");
        sysModelVerMap.put("PSAPPWF", "");
        sysModelVerMap.put("PSAPPWFVER", "");
        sysModelVerMap.put("PSCODEITEM", "");
        sysModelVerMap.put("PSCODELIST", "");
        sysModelVerMap.put("PSCTRLMSG", "");
        sysModelVerMap.put("PSCTRLMSGITEM", "");
        sysModelVerMap.put("PSDATAENTITY", "");
        sysModelVerMap.put("PSDEACMODE", "");
        sysModelVerMap.put("PSDEACMODEITEM", "");
        sysModelVerMap.put("PSDEACTION", "");
        sysModelVerMap.put("PSDEACTIONGROUP", "");
        sysModelVerMap.put("PSDEACTIONLOGIC", "");
        sysModelVerMap.put("PSDEACTIONPARAM", "");
        sysModelVerMap.put("PSDEACTIONTEMPL", "");
        sysModelVerMap.put("PSDEACTIONWIZARD", "");
        sysModelVerMap.put("PSDEAGDETAIL", "");
        sysModelVerMap.put("PSDEAWGROUP", "");
        sysModelVerMap.put("PSDEAWGRPDETAIL", "");
        sysModelVerMap.put("PSDEAWITEM", "");
        sysModelVerMap.put("PSDECHART", "");
        sysModelVerMap.put("PSDECHARTAXES", "");
        sysModelVerMap.put("PSDECHARTPARAM", "");
        sysModelVerMap.put("PSDEDATAEXP", "");
        sysModelVerMap.put("PSDEDATAIMP", "");
        sysModelVerMap.put("PSDEDATAIMPITEM", "");
        sysModelVerMap.put("PSDEDATAQUERY", "");
        sysModelVerMap.put("PSDEDATARELATION", "");
        sysModelVerMap.put("PSDEDATASET", "");
        sysModelVerMap.put("PSDEDATASYNC", "");
        sysModelVerMap.put("PSDEDATAVIEW", "");
        sysModelVerMap.put("PSDEDBCFG", "");
        sysModelVerMap.put("PSDEDBIDXFIELD", "");
        sysModelVerMap.put("PSDEDBINDEX", "");
        sysModelVerMap.put("PSDEDQCODE", "");
        sysModelVerMap.put("PSDEDQCODECOND", "");
        sysModelVerMap.put("PSDEDQCODEEXP", "");
        sysModelVerMap.put("PSDEDQCOND", "");
        sysModelVerMap.put("PSDEDQJOIN", "");
        sysModelVerMap.put("PSDEDRDETAIL", "");
        sysModelVerMap.put("PSDEDRGROUP", "");
        sysModelVerMap.put("PSDEDRITEM", "");
        sysModelVerMap.put("PSDEDSCODE", "");
        sysModelVerMap.put("PSDEDSDQ", "");
        sysModelVerMap.put("PSDEDSGRPPARAM", "");
        sysModelVerMap.put("PSDEDTSQUEUE", "");
        sysModelVerMap.put("PSDEFDLOGIC", "");
        sysModelVerMap.put("PSDEFDTCOL", "");
        sysModelVerMap.put("PSDEFFORMITEM", "");
        sysModelVerMap.put("PSDEFGROUP", "");
        sysModelVerMap.put("PSDEFGROUPDETAIL", "");
        sysModelVerMap.put("PSDEFIELD", "");
        sysModelVerMap.put("PSDEFINPUTTIP", "");
        sysModelVerMap.put("PSDEFINPUTTIPSET", "");
        sysModelVerMap.put("PSDEFIUDETAIL", "");
        sysModelVerMap.put("PSDEFIUPDATE", "");
        sysModelVerMap.put("PSDEFIVR", "");
        sysModelVerMap.put("PSDEFORM", "");
        sysModelVerMap.put("PSDEFORMDETAIL", "");
        sysModelVerMap.put("PSDEFORMRF", "");
        sysModelVerMap.put("PSDEFSFITEM", "");
        sysModelVerMap.put("PSDEFVALUERULE", "");
        sysModelVerMap.put("PSDEFVRCOND", "");
        sysModelVerMap.put("PSDEGEIUDETAIL", "");
        sysModelVerMap.put("PSDEGEIUPDATE", "");
        sysModelVerMap.put("PSDEGRID", "");
        sysModelVerMap.put("PSDEGRIDCOL", "");
        sysModelVerMap.put("PSDEGROUP", "");
        sysModelVerMap.put("PSDEGROUPDETAIL", "");
        sysModelVerMap.put("PSDELIST", "");
        sysModelVerMap.put("PSDELISTITEM", "");
        sysModelVerMap.put("PSDELLCOND", "");
        sysModelVerMap.put("PSDELNPARAM", "");
        sysModelVerMap.put("PSDELOGIC", "");
        sysModelVerMap.put("PSDELOGICLINK", "");
        sysModelVerMap.put("PSDELOGICNODE", "");
        sysModelVerMap.put("PSDELOGICPARAM", "");
        sysModelVerMap.put("PSDEMAINSTATE", "");
        sysModelVerMap.put("PSDEMAINSTATERS", "");
        sysModelVerMap.put("PSDEMAP", "");
        sysModelVerMap.put("PSDEMAPACTION", "");
        sysModelVerMap.put("PSDEMAPDETAIL", "");
        sysModelVerMap.put("PSDEMAPDQ", "");
        sysModelVerMap.put("PSDEMAPDS", "");
        sysModelVerMap.put("PSDEMSACTION", "");
        sysModelVerMap.put("PSDEMSFIELD", "");
        sysModelVerMap.put("PSDEMSOPPRIV", "");
        sysModelVerMap.put("PSDEOPPRIV", "");
        sysModelVerMap.put("PSDEOPPRIVROLE", "");
        sysModelVerMap.put("PSDEPRINT", "");
        sysModelVerMap.put("PSDEPSLNASGRP", "");
        sysModelVerMap.put("PSDEPSLNASITEM", "");
        sysModelVerMap.put("PSDER", "");
        sysModelVerMap.put("PSDERDEFMAP", "");
        sysModelVerMap.put("PSDEREPITEM", "");
        sysModelVerMap.put("PSDEREPORT", "");
        sysModelVerMap.put("PSDERGROUP", "");
        sysModelVerMap.put("PSDERGROUPDETAIL", "");
        sysModelVerMap.put("PSDERTAW", "");
        sysModelVerMap.put("PSDERTAWI", "");
        sysModelVerMap.put("PSDESADETAIL", "");
        sysModelVerMap.put("PSDESAMPLEDATA", "");
        sysModelVerMap.put("PSDESAMPLEDATAREF", "");
        sysModelVerMap.put("PSDESARS", "");
        sysModelVerMap.put("PSDESAVR", "");
        sysModelVerMap.put("PSDESERVICEAPI", "");
        sysModelVerMap.put("PSDETABLE", "");
        sysModelVerMap.put("PSDETBITEM", "");
        sysModelVerMap.put("PSDETOOLBAR", "");
        sysModelVerMap.put("PSDETREECOL", "");
        sysModelVerMap.put("PSDETREENODE", "");
        sysModelVerMap.put("PSDETREENODECOL", "");
        sysModelVerMap.put("PSDETREENODERS", "");
        sysModelVerMap.put("PSDETREENODERV", "");
        sysModelVerMap.put("PSDETREEVIEW", "");
        sysModelVerMap.put("PSDEUAGROUP", "");
        sysModelVerMap.put("PSDEUAGRPDETAIL", "");
        sysModelVerMap.put("PSDEUIACTION", "");
        sysModelVerMap.put("PSDEUSERROLE", "");
        sysModelVerMap.put("PSDEUTILDE", "");
        sysModelVerMap.put("PSDEVIEWBASE", "");
        sysModelVerMap.put("PSDEVIEWCTRL", "");
        sysModelVerMap.put("PSDEVIEWENGINE", "");
        sysModelVerMap.put("PSDEVIEWLOGIC", "");
        sysModelVerMap.put("PSDEVIEWRV", "");
        sysModelVerMap.put("PSDEVSLNMSDEPFUNC", "");
        sysModelVerMap.put("PSDEVSLNMSDEPFUNCITEM", "");
        sysModelVerMap.put("PSDEWIZARD", "");
        sysModelVerMap.put("PSDEWIZARDFORM", "");
        sysModelVerMap.put("PSDEWIZARDSTEP", "");
        sysModelVerMap.put("PSLANGUAGE", "");
        sysModelVerMap.put("PSLANGUAGEITEM", "");
        sysModelVerMap.put("PSLANGUAGERES", "");
        sysModelVerMap.put("PSMOBAPPPACK", "");
        sysModelVerMap.put("PSMOBAPPPACKTD", "");
        sysModelVerMap.put("PSMOBAPPSTARTPAGE", "");
        sysModelVerMap.put("PSMODULE", "");
        sysModelVerMap.put("PSPANELENGINE", "");
        sysModelVerMap.put("PSPANELITEMLOGIC", "");
        sysModelVerMap.put("PSSUBSYSSADE", "");
        sysModelVerMap.put("PSSUBSYSSADEFIELD", "");
        sysModelVerMap.put("PSSUBSYSSADERS", "");
        sysModelVerMap.put("PSSUBSYSSADETAIL", "");
        sysModelVerMap.put("PSSUBSYSSERVICEAPI", "");
        sysModelVerMap.put("PSSUBVIEWTYPE", "");
        sysModelVerMap.put("PSSYSACTOR", "");
        sysModelVerMap.put("PSSYSAPP", "");
        sysModelVerMap.put("PSSYSBACKSERVICE", "");
        sysModelVerMap.put("PSSYSBDCOLSET", "");
        sysModelVerMap.put("PSSYSBDCOLUMN", "");
        sysModelVerMap.put("PSSYSBDINSTCFG", "");
        sysModelVerMap.put("PSSYSBDMODULE", "");
        sysModelVerMap.put("PSSYSBDPART", "");
        sysModelVerMap.put("PSSYSBDSCHEME", "");
        sysModelVerMap.put("PSSYSBDTABLE", "");
        sysModelVerMap.put("PSSYSBDTABLEDE", "");
        sysModelVerMap.put("PSSYSBDTABLEDER", "");
        sysModelVerMap.put("PSSYSBDTABLERS", "");
        sysModelVerMap.put("PSSYSCALENDAR", "");
        sysModelVerMap.put("PSSYSCALENDARITEM", "");
        sysModelVerMap.put("PSSYSCALENDARITEMRV", "");
        sysModelVerMap.put("PSSYSCODESNIPPET", "");
        sysModelVerMap.put("PSSYSCONTENT", "");
        sysModelVerMap.put("PSSYSCONTENTCAT", "");
        sysModelVerMap.put("PSSYSCOUNTER", "");
        sysModelVerMap.put("PSSYSCOUNTERITEM", "");
        sysModelVerMap.put("PSSYSCSS", "");
        sysModelVerMap.put("PSSYSCSSCAT", "");
        sysModelVerMap.put("PSSYSDASHBOARD", "");
        sysModelVerMap.put("PSSYSDATASYNCAGENT", "");
        sysModelVerMap.put("PSSYSDBCOLUMN", "");
        sysModelVerMap.put("PSSYSDBPART", "");
        sysModelVerMap.put("PSSYSDBPROC", "");
        sysModelVerMap.put("PSSYSDBPROCPARAM", "");
        sysModelVerMap.put("PSSYSDBSCHEME", "");
        sysModelVerMap.put("PSSYSDBTABLE", "");
        sysModelVerMap.put("PSSYSDBVALUEOP", "");
        sysModelVerMap.put("PSSYSDBVF", "");
        sysModelVerMap.put("PSSYSDBVFCODE", "");
        sysModelVerMap.put("PSSYSDELOGICNODE", "");
        sysModelVerMap.put("PSSYSDICTCAT", "");
        sysModelVerMap.put("PSSYSDMITEM", "");
        sysModelVerMap.put("PSSYSDMVER", "");
        sysModelVerMap.put("PSSYSDYNAMODEL", "");
        sysModelVerMap.put("PSSYSDYNAMODELATTR", "");
        sysModelVerMap.put("PSSYSEDITORSTYLE", "");
        sysModelVerMap.put("PSSYSERMAP", "");
        sysModelVerMap.put("PSSYSERMAPNODE", "");
        sysModelVerMap.put("PSSYSFILE", "");
        sysModelVerMap.put("PSSYSIMAGE", "");
        sysModelVerMap.put("PSSYSMODELGROUP", "");
        sysModelVerMap.put("PSSYSMSGTEMPL", "");
        sysModelVerMap.put("PSSYSOPPRIV", "");
        sysModelVerMap.put("PSSYSPDTVIEW", "");
        sysModelVerMap.put("PSSYSPFPITEMPL", "");
        sysModelVerMap.put("PSSYSPFPLUGIN", "");
        sysModelVerMap.put("PSSYSPORTLET", "");
        sysModelVerMap.put("PSSYSREF", "");
        sysModelVerMap.put("PSSYSREQITEM", "");
        sysModelVerMap.put("PSSYSREQITEMDATA", "");
        sysModelVerMap.put("PSSYSREQITEMHIS", "");
        sysModelVerMap.put("PSSYSREQMODULE", "");
        sysModelVerMap.put("PSSYSRESOURCE", "");
        sysModelVerMap.put("PSSYSSAHANDLER", "");
        sysModelVerMap.put("PSSYSSAMPLEVALUE", "");
        sysModelVerMap.put("PSSYSSEARCHBAR", "");
        sysModelVerMap.put("PSSYSSEARCHBARITEM", "");
        sysModelVerMap.put("PSSYSSERVICEAPI", "");
        sysModelVerMap.put("PSSYSSFCODE", "");
        sysModelVerMap.put("PSSYSSFPITEMPL", "");
        sysModelVerMap.put("PSSYSSFPLUGIN", "");
        sysModelVerMap.put("PSSYSSFPUB", "");
        sysModelVerMap.put("PSSYSSFPUBPKG", "");
        sysModelVerMap.put("PSSYSSQLCMD", "");
        sysModelVerMap.put("PSSYSSQLCMDSQL", "");
        sysModelVerMap.put("PSSYSTCASSERT", "");
        sysModelVerMap.put("PSSYSTCINPUT", "");
        sysModelVerMap.put("PSSYSTDITEM", "");
        sysModelVerMap.put("PSSYSTEM", "");
        sysModelVerMap.put("PSSYSTEMAS", "");
        sysModelVerMap.put("PSSYSTEMDBCFG", "");
        sysModelVerMap.put("PSSYSTEMMQ", "");
        sysModelVerMap.put("PSSYSTEMRUN", "");
        sysModelVerMap.put("PSSYSTESTCASE", "");
        sysModelVerMap.put("PSSYSTESTDATA", "");
        sysModelVerMap.put("PSSYSTESTMODULE", "");
        sysModelVerMap.put("PSSYSTESTPRJ", "");
        sysModelVerMap.put("PSSYSTITLEBAR", "");
        sysModelVerMap.put("PSSYSUCMAP", "");
        sysModelVerMap.put("PSSYSUCMAPNODE", "");
        sysModelVerMap.put("PSSYSUNIRES", "");
        sysModelVerMap.put("PSSYSUNISTATE", "");
        sysModelVerMap.put("PSSYSUNIT", "");
        sysModelVerMap.put("PSSYSUSERDR", "");
        sysModelVerMap.put("PSSYSUSERMODE", "");
        sysModelVerMap.put("PSSYSUSERROLERES", "");
        sysModelVerMap.put("PSSYSUSERROLEDATA", "");
        sysModelVerMap.put("PSSYSUTILDE", "");
        sysModelVerMap.put("PSSYSVALUERULE", "");
        sysModelVerMap.put("PSSYSVIEWLOGIC", "");
        sysModelVerMap.put("PSSYSVIEWLOGICPARAM", "");
        sysModelVerMap.put("PSSYSVIEWPANEL", "");
        sysModelVerMap.put("PSSYSVIEWPANELITEM", "");
        sysModelVerMap.put("PSSYSVIEWPANELLOGIC", "");
        sysModelVerMap.put("PSSYSVIEWPANELMODEL", "");
        sysModelVerMap.put("PSSYSWFMODE", "");
        sysModelVerMap.put("PSSYSWFSETTING", "");
        sysModelVerMap.put("PSVIEWMSG", "");
        sysModelVerMap.put("PSVIEWMSGGROUP", "");
        sysModelVerMap.put("PSVIEWMSGGRPDETAIL", "");
        sysModelVerMap.put("PSVIEWWIZARDGROUP", "");
        sysModelVerMap.put("PSWFDE", "");
        sysModelVerMap.put("PSWFLINK", "");
        sysModelVerMap.put("PSWFLINKCOND", "");
        sysModelVerMap.put("PSWFLINKROLE", "");
        sysModelVerMap.put("PSWFPROCESS", "");
        sysModelVerMap.put("PSWFPROCPARAM", "");
        sysModelVerMap.put("PSWFPROCROLE", "");
        sysModelVerMap.put("PSWFPROCSUBWF", "");
        sysModelVerMap.put("PSWFROLE", "");
        sysModelVerMap.put("PSWFSUBWF", "");
        sysModelVerMap.put("PSWFUTILUIACTION", "");
        sysModelVerMap.put("PSWFVERSION", "");
        sysModelVerMap.put("PSWFWORKTIME", "");
        sysModelVerMap.put("PSWORKFLOW", "");
        sysModelVerMap.put("PSWXACCOUNT", "");
        sysModelVerMap.put("PSWXENTAPP", "");
        sysModelVerMap.put("PSWXLOGIC", "");
        sysModelVerMap.put("PSWXMENU", "");
        sysModelVerMap.put("PSWXMENUFUNC", "");
        sysModelVerMap.put("PSWXMENUITEM", "");
        sysModelVerMap.put("PSACHANDLER", "PSSYSTEMID");
        sysModelVerMap.put("PSCODELIST", "PSSYSTEMID");
        sysModelVerMap.put("PSDER", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSDYNAMODEL", "PSSYSTEMID");
        sysModelVerMap.put("PSDETOOLBAR", "PSSYSTEMID");
        sysModelVerMap.put("PSDEUAGROUP", "PSSYSTEMID");
        sysModelVerMap.put("PSDEGROUP", "PSSYSTEMID");
        sysModelVerMap.put("PSDEFGROUP", "PSSYSTEMID");
        sysModelVerMap.put("PSDEACTIONGROUP", "PSSYSTEMID");
        sysModelVerMap.put("PSDERGROUP", "PSSYSTEMID");
        sysModelVerMap.put("PSDEUIACTION", "PSSYSTEMID");
        sysModelVerMap.put("PSDEVIEWBASE", "PSSYSTEMID");
        sysModelVerMap.put("PSMODULE", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSAPP", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSDBVF", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSDEPLOY", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSEDITORSTYLE", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSIMAGE", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSPORTLET", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSREF", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSSFPUB", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSTEMDBCFG", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSUSERMODE", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSVALUERULE", "PSSYSTEMID");
        sysModelVerMap.put("PSWFROLE", "PSSYSTEMID");
        sysModelVerMap.put("PSWFWORKTIME", "PSSYSTEMID");
        sysModelVerMap.put("PSWORKFLOW", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSCSS", "PSSYSTEMID");
        sysModelVerMap.put("PSCTRLMSG", "PSSYSTEMID");
        sysModelVerMap.put("PSDEACTIONTEMPL", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSUNIT", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSDELOGICNODE", "PSSYSTEMID");
        sysModelVerMap.put("PSLANGUAGERES", "PSSYSTEMID");
        sysModelVerMap.put("PSLANGUAGEITEM", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSDEFTYPE", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSOPPRIV", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSUSERROLERES", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSUSERROLEDATA", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSDMVER", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSPFPLUGIN", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSSFPLUGIN", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSCOUNTER", "PSSYSTEMID");
        sysModelVerMap.put("PSDEOPPRIV", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSDICTCAT", "PSSYSTEMID");
        sysModelVerMap.put("PSSUBVIEWTYPE", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSWFSETTING", "PSSYSWFSETTINGID");
        sysModelVerMap.put("PSDEFINPUTTIP", "PSSYSTEMID");
        sysModelVerMap.put("PSVIEWMSG", "PSSYSTEMID");
        sysModelVerMap.put("PSVIEWMSGGROUP", "PSSYSTEMID");
        sysModelVerMap.put("PSDEFINPUTTIPSET", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSUNISTATE", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSUTILDE", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSSEARCHBAR", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSDASHBOARD", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSCALENDAR", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSTITLEBAR", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSVIEWPANEL", "PSSYSTEMID");
        sysModelVerMap.put("PSDEDTSQUEUE", "PSSYSTEMID");
        sysModelVerMap.put("PSAPPDEVIEW", "PSSYSTEMID");
        sysModelVerMap.put("PSAPPINDEXVIEW", "PSSYSTEMID");
        sysModelVerMap.put("PSAPPPORTALVIEW", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSBDSCHEME", "PSSYSTEMID");
        sysModelVerMap.put("PSWXACCOUNT", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSTEM", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSSERVICEAPI", "PSSYSTEMID");
        sysModelVerMap.put("PSSUBSYSSERVICEAPI", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSSAHANDLER", "PSSYSTEMID");
        sysModelVerSqlMap.put("PSSYSPFPITEMPL", "UPDATE T_SRFPSSYSTEM SET MODELVER=MODELVER+1 WHERE EXISTS(SELECT * FROM T_SRFPSSYSPFPITEMPL INNER JOIN T_SRFPSSYSPFPLUGIN ON T_SRFPSSYSPFPITEMPL.PSSYSPFPLUGINID = T_SRFPSSYSPFPLUGIN.PSSYSPFPLUGINID WHERE T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSPFPLUGIN.PSSYSTEMID AND T_SRFPSSYSPFPITEMPL.PSSYSPFPITEMPLID=?)");
        sysModelVerSqlMap.put("PSSYSSFPITEMPL", "UPDATE T_SRFPSSYSTEM SET MODELVER=MODELVER+1 WHERE EXISTS(SELECT * FROM T_SRFPSSYSSFPITEMPL INNER JOIN T_SRFPSSYSSFPLUGIN ON T_SRFPSSYSSFPITEMPL.PSSYSSFPLUGINID = T_SRFPSSYSSFPLUGIN.PSSYSSFPLUGINID WHERE T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSSFPLUGIN.PSSYSTEMID AND T_SRFPSSYSSFPITEMPL.PSSYSSFPITEMPLID=?)");
        sysModelVerSqlMap.put("PSWFVERSION", "update t_srfpssystem set MODELVER=MODELVER+1 where exists(select * from t_srfpswfversion inner join t_srfpsworkflow on t_srfpswfversion.PSWFID = t_srfpsworkflow.PSWORKFLOWID   where t_srfpssystem.PSSYSTEMID = t_srfpsworkflow.PSSYSTEMID and t_srfpswfversion.pswfversionid=?)");
        sysModelVerSqlMap.put("PSAPPMENU", "update t_srfpssystem set MODELVER=MODELVER+1 where exists(select * from t_srfpsappmenu inner join t_srfpssysapp on t_srfpsappmenu.PSSYSAPPID = t_srfpssysapp.PSSYSAPPID   where t_srfpssystem.PSSYSTEMID = t_srfpssysapp.PSSYSTEMID and t_srfpsappmenu.psappmenuid=?)");
        sysModelVerSqlMap.put("PSWXENTAPP", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSWXENTAPP inner join T_SRFPSWXACCOUNT on T_SRFPSWXENTAPP.PSWXACCOUNTID = T_SRFPSWXACCOUNT.PSWXACCOUNTID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSWXACCOUNT.PSSYSTEMID and T_SRFPSWXENTAPP.PSWXENTAPPID=?)");
        sysModelVerSqlMap.put("PSWXLOGIC", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSWXLOGIC inner join T_SRFPSWXACCOUNT on T_SRFPSWXLOGIC.PSWXACCOUNTID = T_SRFPSWXACCOUNT.PSWXACCOUNTID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSWXACCOUNT.PSSYSTEMID and T_SRFPSWXLOGIC.PSWXLOGICID=?)");
        sysModelVerSqlMap.put("PSWXMENU", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSWXMENU inner join T_SRFPSWXACCOUNT on T_SRFPSWXMENU.PSWXACCOUNTID = T_SRFPSWXACCOUNT.PSWXACCOUNTID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSWXACCOUNT.PSSYSTEMID and T_SRFPSWXMENU.PSWXMENUID=?)");
        sysModelVerSqlMap.put("PSWXMENUFUNC", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSWXMENUFUNC inner join T_SRFPSWXACCOUNT on T_SRFPSWXMENUFUNC.PSWXACCOUNTID = T_SRFPSWXACCOUNT.PSWXACCOUNTID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSWXACCOUNT.PSSYSTEMID and T_SRFPSWXMENUFUNC.PSWXMENUFUNCID=?)");
        sysModelVerSqlMap.put("PSSYSSFCODE", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSSYSSFCODE inner join T_SRFPSSYSSFPUB on T_SRFPSSYSSFCODE.PSSYSSFPUBID = T_SRFPSSYSSFPUB.PSSYSSFPUBID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSSFPUB.PSSYSTEMID and T_SRFPSSYSSFCODE.PSSYSSFCODEID=?)");
        sysModelVerSqlMap.put("PSAPPVIEWCODE", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSAPPVIEWCODE inner join T_SRFPSSYSAPP on T_SRFPSAPPVIEWCODE.PSSYSAPPID = T_SRFPSSYSAPP.PSSYSAPPID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSAPP.PSSYSTEMID and T_SRFPSAPPVIEWCODE.PSAPPVIEWCODEID=?)");
        sysModelVerSqlMap.put("PSAPPLAN", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSAPPLAN inner join T_SRFPSSYSAPP on T_SRFPSAPPLAN.PSSYSAPPID = T_SRFPSSYSAPP.PSSYSAPPID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSAPP.PSSYSTEMID and T_SRFPSAPPLAN.PSAPPLANID=?)");
        sysModelVerSqlMap.put("PSAPPPKG", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSAPPPKG inner join T_SRFPSSYSAPP on T_SRFPSAPPPKG.PSSYSAPPID = T_SRFPSSYSAPP.PSSYSAPPID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSAPP.PSSYSTEMID and T_SRFPSAPPPKG.PSAPPPKGID=?)");
        sysModelVerSqlMap.put("PSSYSSFPUBPKG", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSSYSSFPUBPKG inner join T_SRFPSSYSSFPUB on T_SRFPSSYSSFPUBPKG.PSSYSSFPUBID = T_SRFPSSYSSFPUB.PSSYSSFPUBID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSSFPUB.PSSYSTEMID and T_SRFPSSYSSFPUBPKG.PSSYSSFPUBPKGID=?)");
        sysModelVerSqlMap.put("PSAPPUSERMODE", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSAPPUSERMODE inner join T_SRFPSSYSAPP on T_SRFPSAPPUSERMODE.PSSYSAPPID = T_SRFPSSYSAPP.PSSYSAPPID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSAPP.PSSYSTEMID and T_SRFPSAPPUSERMODE.PSAPPUSERMODEID=?)");
        sysModelVerSqlMap.put("PSAPPLOCALDE", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSAPPLOCALDE inner join T_SRFPSSYSAPP on T_SRFPSAPPLOCALDE.PSSYSAPPID = T_SRFPSSYSAPP.PSSYSAPPID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSAPP.PSSYSTEMID and T_SRFPSAPPLOCALDE.PSAPPLOCALDEID=?)");
        sysModelVerSqlMap.put("PSMOBAPPSTARTPAGE", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSMOBAPPSTARTPAGE inner join T_SRFPSSYSAPP on T_SRFPSMOBAPPSTARTPAGE.PSSYSAPPID = T_SRFPSSYSAPP.PSSYSAPPID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSAPP.PSSYSTEMID and T_SRFPSMOBAPPSTARTPAGE.PSMOBAPPSTARTPAGEID=?)");
        sysModelVerSqlMap.put("PSMOBAPPPACK", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSMOBAPPPACK inner join T_SRFPSSYSAPP on T_SRFPSMOBAPPPACK.PSSYSAPPID = T_SRFPSSYSAPP.PSSYSAPPID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSAPP.PSSYSTEMID and T_SRFPSMOBAPPPACK.PSMOBAPPPACKID=?)");
        sysModelVerSqlMap.put("PSSUBSYSSADETAIL", "update t_srfpssystem set MODELVER=MODELVER+1 where exists(select * from t_srfpssubsyssadetail inner join t_srfpssubsysserviceapi on t_srfpssubsyssadetail.PSSUBSYSSERVICEAPIID = t_srfpssubsysserviceapi.PSSUBSYSSERVICEAPIID   where t_srfpssystem.PSSYSTEMID = t_srfpssubsysserviceapi.PSSYSTEMID and t_srfpssubsyssadetail.pssubsyssadetailid=?)");
        sysModelVerSqlMap.put("PSAPPTITLEBAR", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSAPPTITLEBAR inner join T_SRFPSSYSAPP on T_SRFPSAPPTITLEBAR.PSSYSAPPID = T_SRFPSSYSAPP.PSSYSAPPID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSAPP.PSSYSTEMID and T_SRFPSAPPTITLEBAR.PSAPPTITLEBARID=?)");
        sysModelVerSqlMap.put("PSSYSDYNAMODELATTR", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSSYSDYNAMODELATTR inner join T_SRFPSSYSDYNAMODEL on T_SRFPSSYSDYNAMODELATTR.PSSYSDYNAMODELID = T_SRFPSSYSDYNAMODEL.PSSYSDYNAMODELID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSDYNAMODEL.PSSYSTEMID and T_SRFPSSYSDYNAMODELATTR.PSSYSDYNAMODELATTRID=?)");
        sysModelVerSqlMap.put("PSAPPUITHEME", "update T_SRFPSSYSTEM set MODELVER=MODELVER+1 where exists(select * from T_SRFPSAPPUITHEME inner join T_SRFPSSYSAPP on T_SRFPSAPPUITHEME.PSSYSAPPID = T_SRFPSSYSAPP.PSSYSAPPID   where T_SRFPSSYSTEM.PSSYSTEMID = T_SRFPSSYSAPP.PSSYSTEMID and T_SRFPSAPPUITHEME.PSAPPUITHEMEID=?)");
        sysModelVerMap.put("PSDESARS", "");
        sysModelVerMap.put("PSAPPWF", "");
        sysModelVerMap.put("PSAPPWFVER", "");
        sysModelVerMap.put("PSAPPDERS", "");
        sysModelVerMap.put("PSAPPDERSVIEW", "");
        sysModelVerMap.put("PSSUBSYSSADE", "");
        sysModelVerMap.put("PSSUBSYSSADERS", "");
        sysModelVerMap.put("PSSUBSYSSADEFIELD", "");
        sysModelVerMap.put("PSSYSDBSCHEME", "PSSYSTEMID");
        sysModelVerMap.put("PSSYSDBTABLE", "");
        sysModelVerMap.put("PSSYSDBCOLUMN", "");
        sysModelVerMap.put("PSSYSDBPROC", "");
        sysModelVerMap.put("PSSYSDBPROCPARAM", "");
        sysModelVerMap.put("PSAPPRESOURCE", "");
        sysModelVerMap.put("PSSYSRESOURCE", "");
        sysModelVerMap.put("PSSYSCONTENT", "");
        sysModelVerMap.put("PSSYSCONTENTCAT", "");
        sysModelVerMap.put("PSAPPSBITEM", "");
        sysModelVerMap.put("PSAPPSBITEMRS", "");
        sysModelVerMap.put("PSAPPSTORYBOARD", "");
        sysModelVerMap.put("PSDESAVR", "");
        sysModelVerMap.put("PSSYSACTOR", "");
        sysModelVerMap.put("PSSYSTESTCASE", "");
        sysModelVerMap.put("PSSYSTESTPRJ", "");
        sysModelVerMap.put("PSSYSTESTMODULE", "");
        sysModelVerMap.put("PSSYSREQMODULE", "");
        sysModelVerMap.put("PSSYSREQITEM", "");
        sysModelVerMap.put("PSDEUAGRPDETAIL", "");
        sysModelVerMap.put("PSCTRLLOGICGROUP", "");
        sysModelVerMap.put("PSCTRLLOGICGRPDETAIL", "");
        sysModelVerMap.put("PSSYSSEARCHSCHEME", "");
        sysModelVerMap.put("PSSYSSEARCHDOC", "");
        sysModelVerMap.put("PSSYSSEARCHFIELD", "");
        sysModelVerMap.put("PSSYSSEARCHDE", "");
        sysModelVerMap.put("PSSYSSEARCHDEFIELD", "");
        sysModelVerMap.put("PSSYSMAPVIEW", "");
        sysModelVerMap.put("PSSYSMAPITEM", "");
        sysModelVerMap.put("PSSYSPORTLETCAT", "");
        sysModelVerMap.put("PSAPPPORTLET", "");
        sysModelVerMap.put("PSDEGEIVR", "");
        sysModelVerMap.put("PSDEACTIONVR", "");
        sysModelVerMap.put("PSSYSSEQUENCE", "");
        sysModelVerMap.put("PSSYSTRANSLATOR", "");
        sysModelVerMap.put("PSSYSMSGQUEUE", "");
        sysModelVerMap.put("PSSYSMSGTARGET", "");
        sysModelVerMap.put("PSDENOTIFY", "");
        sysModelVerMap.put("PSDENOTIFYTARGET", "");
        sysModelVerMap.put("PSSYSEAIDATATYPEITEM", "");
        sysModelVerMap.put("PSSYSEAIDER", "");
        sysModelVerMap.put("PSSYSEAIDEFIELD", "");
        sysModelVerMap.put("PSSYSEAIDE", "");
        sysModelVerMap.put("PSSYSEAIELEMENTRE", "");
        sysModelVerMap.put("PSSYSEAIELEMENTATTR", "");
        sysModelVerMap.put("PSSYSEAIELEMENT", "");
        sysModelVerMap.put("PSSYSEAIDATATYPE", "");
        sysModelVerMap.put("PSSYSEAISCHEME", "");
        sysModelVerMap.put("PSSYSBIAGGCOLUMN", "");
        sysModelVerMap.put("PSSYSBIAGGTABLE", "");
        sysModelVerMap.put("PSSYSBICUBELEVEL", "");
        sysModelVerMap.put("PSSYSBICUBEMEASURE", "");
        sysModelVerMap.put("PSSYSBICUBEDIMENSION", "");
        sysModelVerMap.put("PSSYSBILEVEL", "");
        sysModelVerMap.put("PSSYSBIHIERARCHY", "");
        sysModelVerMap.put("PSSYSBIDIMENSION", "");
        sysModelVerMap.put("PSSYSBICUBE", "");
        sysModelVerMap.put("PSSYSBISCHEME", "");
        sysModelVerMap.put("PSTHRESHOLD", "");
        sysModelVerMap.put("PSTHRESHOLDGROUP", "");
        sysModelVerMap.put("PSSYSCHARTTHEME", "");
        sysModelVerMap.put("PSSYSCANVAS", "");
        sysModelVerMap.put("PSSYSCANVASMODEL", "");
        sysModelVerMap.put("PSSYSDASHBOARDLOGIC", "");
        sysModelVerMap.put("PSAPPMENULOGIC", "");
        sysModelVerMap.put("PSDEFORMLOGIC", "");
        sysModelVerMap.put("PSSYSSEARCHBARLOGIC", "");
        sysModelVerMap.put("PSAPPLOGIC", "");
        sysModelVerMap.put("PSDETOOLBARLOGIC", "");
        sysModelVerMap.put("PSDEWIZARDLOGIC", "");
        sysModelVerMap.put("PSDELISTLOGIC", "");
        sysModelVerMap.put("PSSYSMAPLOGIC", "");
        sysModelVerMap.put("PSDETREELOGIC", "");
        sysModelVerMap.put("PSDEDATAVIEWLOGIC", "");
        sysModelVerMap.put("PSSYSCALENDARLOGIC", "");
        sysModelVerMap.put("PSDEGRIDLOGIC", "");
        sysModelVerMap.put("PSDECHARTLOGIC", "");
        sysModelVerMap.put("PSDETEIUDETAIL", "");
        sysModelVerMap.put("PSDETEIUPDATE", "");
        sysModelLogMap.put("PSACHANDLER", "");
        sysModelLogMap.put("PSACHANDLERACTION", "");
        sysModelLogMap.put("PSAPPDERS", "");
        sysModelLogMap.put("PSAPPDERSVIEW", "");
        sysModelLogMap.put("PSAPPFUNC", "");
        sysModelLogMap.put("PSAPPLAN", "");
        sysModelLogMap.put("PSAPPLOCALDE", "");
        sysModelLogMap.put("PSAPPMENU", "");
        sysModelLogMap.put("PSAPPMENUITEM", "");
        sysModelLogMap.put("PSAPPMODULE", "");
        sysModelLogMap.put("PSAPPPDTVIEW", "");
        sysModelLogMap.put("PSAPPPKG", "");
        sysModelLogMap.put("PSAPPPORTALVIEW", "");
        sysModelLogMap.put("PSAPPPVPART", "");
        sysModelLogMap.put("PSAPPRESOURCE", "");
        sysModelLogMap.put("PSAPPSBITEM", "");
        sysModelLogMap.put("PSAPPSBITEMRS", "");
        sysModelLogMap.put("PSAPPSTORYBOARD", "");
        sysModelLogMap.put("PSAPPTITLEBAR", "");
        sysModelLogMap.put("PSAPPUISTYLE", "");
        sysModelLogMap.put("PSAPPUITHEME", "");
        sysModelLogMap.put("PSAPPUSERMODE", "");
        sysModelLogMap.put("PSAPPUTIL", "");
        sysModelLogMap.put("PSAPPUTILPAGE", "");
        sysModelLogMap.put("PSAPPVIEW", "");
        sysModelLogMap.put("PSAPPWF", "");
        sysModelLogMap.put("PSAPPWFVER", "");
        sysModelLogMap.put("PSCODEITEM", "");
        sysModelLogMap.put("PSCODELIST", "");
        sysModelLogMap.put("PSCTRLMSG", "");
        sysModelLogMap.put("PSCTRLMSGITEM", "");
        sysModelLogMap.put("PSDATAENTITY", "");
        sysModelLogMap.put("PSDEACMODE", "");
        sysModelLogMap.put("PSDEACMODEITEM", "");
        sysModelLogMap.put("PSDEACTION", "");
        sysModelLogMap.put("PSDEACTIONGROUP", "");
        sysModelLogMap.put("PSDEACTIONLOGIC", "");
        sysModelLogMap.put("PSDEACTIONPARAM", "");
        sysModelLogMap.put("PSDEACTIONTEMPL", "");
        sysModelLogMap.put("PSDEACTIONWIZARD", "");
        sysModelLogMap.put("PSDEAGDETAIL", "");
        sysModelLogMap.put("PSDEAWGROUP", "");
        sysModelLogMap.put("PSDEAWGRPDETAIL", "");
        sysModelLogMap.put("PSDEAWITEM", "");
        sysModelLogMap.put("PSDECHART", "");
        sysModelLogMap.put("PSDECHARTAXES", "");
        sysModelLogMap.put("PSDECHARTPARAM", "");
        sysModelLogMap.put("PSDEDATAEXP", "");
        sysModelLogMap.put("PSDEDATAIMP", "");
        sysModelLogMap.put("PSDEDATAIMPITEM", "");
        sysModelLogMap.put("PSDEDATAQUERY", "");
        sysModelLogMap.put("PSDEDATARELATION", "");
        sysModelLogMap.put("PSDEDATASET", "");
        sysModelLogMap.put("PSDEDATASYNC", "");
        sysModelLogMap.put("PSDEDATAVIEW", "");
        sysModelLogMap.put("PSDEDBCFG", "");
        sysModelLogMap.put("PSDEDBIDXFIELD", "");
        sysModelLogMap.put("PSDEDBINDEX", "");
        sysModelLogMap.put("PSDEDQCODE", "");
        sysModelLogMap.put("PSDEDQCODECOND", "");
        sysModelLogMap.put("PSDEDQCODEEXP", "");
        sysModelLogMap.put("PSDEDQCOND", "");
        sysModelLogMap.put("PSDEDQJOIN", "");
        sysModelLogMap.put("PSDEDRDETAIL", "");
        sysModelLogMap.put("PSDEDRGROUP", "");
        sysModelLogMap.put("PSDEDRITEM", "");
        sysModelLogMap.put("PSDEDSCODE", "");
        sysModelLogMap.put("PSDEDSDQ", "");
        sysModelLogMap.put("PSDEDSGRPPARAM", "");
        sysModelLogMap.put("PSDEDTSQUEUE", "");
        sysModelLogMap.put("PSDEFDLOGIC", "");
        sysModelLogMap.put("PSDEFDTCOL", "");
        sysModelLogMap.put("PSDEFFORMITEM", "");
        sysModelLogMap.put("PSDEFGROUP", "");
        sysModelLogMap.put("PSDEFGROUPDETAIL", "");
        sysModelLogMap.put("PSDEFIELD", "");
        sysModelLogMap.put("PSDEFINPUTTIP", "");
        sysModelLogMap.put("PSDEFINPUTTIPSET", "");
        sysModelLogMap.put("PSDEFIUDETAIL", "");
        sysModelLogMap.put("PSDEFIUPDATE", "");
        sysModelLogMap.put("PSDEFIVR", "");
        sysModelLogMap.put("PSDEFORM", "");
        sysModelLogMap.put("PSDEFORMDETAIL", "");
        sysModelLogMap.put("PSDEFORMRF", "");
        sysModelLogMap.put("PSDEFSFITEM", "");
        sysModelLogMap.put("PSDEFVALUERULE", "");
        sysModelLogMap.put("PSDEFVRCOND", "");
        sysModelLogMap.put("PSDEGEIUDETAIL", "");
        sysModelLogMap.put("PSDEGEIUPDATE", "");
        sysModelLogMap.put("PSDEGRID", "");
        sysModelLogMap.put("PSDEGRIDCOL", "");
        sysModelLogMap.put("PSDEGROUP", "");
        sysModelLogMap.put("PSDEGROUPDETAIL", "");
        sysModelLogMap.put("PSDELIST", "");
        sysModelLogMap.put("PSDELISTITEM", "");
        sysModelLogMap.put("PSDELLCOND", "");
        sysModelLogMap.put("PSDELNPARAM", "");
        sysModelLogMap.put("PSDELOGIC", "");
        sysModelLogMap.put("PSDELOGICLINK", "");
        sysModelLogMap.put("PSDELOGICNODE", "");
        sysModelLogMap.put("PSDELOGICPARAM", "");
        sysModelLogMap.put("PSDEMAINSTATE", "");
        sysModelLogMap.put("PSDEMAINSTATERS", "");
        sysModelLogMap.put("PSDEMAP", "");
        sysModelLogMap.put("PSDEMAPACTION", "");
        sysModelLogMap.put("PSDEMAPDETAIL", "");
        sysModelLogMap.put("PSDEMAPDQ", "");
        sysModelLogMap.put("PSDEMAPDS", "");
        sysModelLogMap.put("PSDEMSACTION", "");
        sysModelLogMap.put("PSDEMSFIELD", "");
        sysModelLogMap.put("PSDEMSOPPRIV", "");
        sysModelLogMap.put("PSDEOPPRIV", "");
        sysModelLogMap.put("PSDEOPPRIVROLE", "");
        sysModelLogMap.put("PSDEPRINT", "");
        sysModelLogMap.put("PSDEPSLNASGRP", "");
        sysModelLogMap.put("PSDEPSLNASITEM", "");
        sysModelLogMap.put("PSDER", "");
        sysModelLogMap.put("PSDERDEFMAP", "");
        sysModelLogMap.put("PSDEREPITEM", "");
        sysModelLogMap.put("PSDEREPORT", "");
        sysModelLogMap.put("PSDERGROUP", "");
        sysModelLogMap.put("PSDERGROUPDETAIL", "");
        sysModelLogMap.put("PSDERTAW", "");
        sysModelLogMap.put("PSDERTAWI", "");
        sysModelLogMap.put("PSDESADETAIL", "");
        sysModelLogMap.put("PSDESAMPLEDATA", "");
        sysModelLogMap.put("PSDESAMPLEDATAREF", "");
        sysModelLogMap.put("PSDESARS", "");
        sysModelLogMap.put("PSDESAVR", "");
        sysModelLogMap.put("PSDESERVICEAPI", "");
        sysModelLogMap.put("PSDETABLE", "");
        sysModelLogMap.put("PSDETBITEM", "");
        sysModelLogMap.put("PSDETOOLBAR", "");
        sysModelLogMap.put("PSDETREECOL", "");
        sysModelLogMap.put("PSDETREENODE", "");
        sysModelLogMap.put("PSDETREENODECOL", "");
        sysModelLogMap.put("PSDETREENODERS", "");
        sysModelLogMap.put("PSDETREENODERV", "");
        sysModelLogMap.put("PSDETREEVIEW", "");
        sysModelLogMap.put("PSDEUAGROUP", "");
        sysModelLogMap.put("PSDEUAGRPDETAIL", "");
        sysModelLogMap.put("PSDEUIACTION", "");
        sysModelLogMap.put("PSDEUSERROLE", "");
        sysModelLogMap.put("PSDEUTILDE", "");
        sysModelLogMap.put("PSDEVIEWBASE", "");
        sysModelLogMap.put("PSDEVIEWCTRL", "");
        sysModelLogMap.put("PSDEVIEWENGINE", "");
        sysModelLogMap.put("PSDEVIEWLOGIC", "");
        sysModelLogMap.put("PSDEVIEWRV", "");
        sysModelLogMap.put("PSDEVSLNMSDEPFUNC", "");
        sysModelLogMap.put("PSDEVSLNMSDEPFUNCITEM", "");
        sysModelLogMap.put("PSDEWIZARD", "");
        sysModelLogMap.put("PSDEWIZARDFORM", "");
        sysModelLogMap.put("PSDEWIZARDSTEP", "");
        sysModelLogMap.put("PSLANGUAGE", "");
        sysModelLogMap.put("PSLANGUAGEITEM", "");
        sysModelLogMap.put("PSLANGUAGERES", "");
        sysModelLogMap.put("PSMOBAPPPACK", "");
        sysModelLogMap.put("PSMOBAPPPACKTD", "");
        sysModelLogMap.put("PSMOBAPPSTARTPAGE", "");
        sysModelLogMap.put("PSMODULE", "");
        sysModelLogMap.put("PSPANELENGINE", "");
        sysModelLogMap.put("PSPANELITEMLOGIC", "");
        sysModelLogMap.put("PSSUBSYSSADE", "");
        sysModelLogMap.put("PSSUBSYSSADEFIELD", "");
        sysModelLogMap.put("PSSUBSYSSADERS", "");
        sysModelLogMap.put("PSSUBSYSSADETAIL", "");
        sysModelLogMap.put("PSSUBSYSSERVICEAPI", "");
        sysModelLogMap.put("PSSUBVIEWTYPE", "");
        sysModelLogMap.put("PSSYSACTOR", "");
        sysModelLogMap.put("PSSYSAPP", "");
        sysModelLogMap.put("PSSYSBACKSERVICE", "");
        sysModelLogMap.put("PSSYSBDCOLSET", "");
        sysModelLogMap.put("PSSYSBDCOLUMN", "");
        sysModelLogMap.put("PSSYSBDINSTCFG", "");
        sysModelLogMap.put("PSSYSBDMODULE", "");
        sysModelLogMap.put("PSSYSBDPART", "");
        sysModelLogMap.put("PSSYSBDSCHEME", "");
        sysModelLogMap.put("PSSYSBDTABLE", "");
        sysModelLogMap.put("PSSYSBDTABLEDE", "");
        sysModelLogMap.put("PSSYSBDTABLEDER", "");
        sysModelLogMap.put("PSSYSBDTABLERS", "");
        sysModelLogMap.put("PSSYSCALENDAR", "");
        sysModelLogMap.put("PSSYSCALENDARITEM", "");
        sysModelLogMap.put("PSSYSCALENDARITEMRV", "");
        sysModelLogMap.put("PSSYSCODESNIPPET", "");
        sysModelLogMap.put("PSSYSCONTENT", "");
        sysModelLogMap.put("PSSYSCONTENTCAT", "");
        sysModelLogMap.put("PSSYSCOUNTER", "");
        sysModelLogMap.put("PSSYSCOUNTERITEM", "");
        sysModelLogMap.put("PSSYSCSS", "");
        sysModelLogMap.put("PSSYSCSSCAT", "");
        sysModelLogMap.put("PSSYSDASHBOARD", "");
        sysModelLogMap.put("PSSYSDATASYNCAGENT", "");
        sysModelLogMap.put("PSSYSDBCOLUMN", "");
        sysModelLogMap.put("PSSYSDBPART", "");
        sysModelLogMap.put("PSSYSDBPROC", "");
        sysModelLogMap.put("PSSYSDBPROCPARAM", "");
        sysModelLogMap.put("PSSYSDBSCHEME", "");
        sysModelLogMap.put("PSSYSDBTABLE", "");
        sysModelLogMap.put("PSSYSDBVALUEOP", "");
        sysModelLogMap.put("PSSYSDBVF", "");
        sysModelLogMap.put("PSSYSDBVFCODE", "");
        sysModelLogMap.put("PSSYSDELOGICNODE", "");
        sysModelLogMap.put("PSSYSDICTCAT", "");
        sysModelLogMap.put("PSSYSDMITEM", "");
        sysModelLogMap.put("PSSYSDMVER", "");
        sysModelLogMap.put("PSSYSDYNAMODEL", "");
        sysModelLogMap.put("PSSYSDYNAMODELATTR", "");
        sysModelLogMap.put("PSSYSEDITORSTYLE", "");
        sysModelLogMap.put("PSSYSERMAP", "");
        sysModelLogMap.put("PSSYSERMAPNODE", "");
        sysModelLogMap.put("PSSYSFILE", "");
        sysModelLogMap.put("PSSYSIMAGE", "");
        sysModelLogMap.put("PSSYSMODELGROUP", "");
        sysModelLogMap.put("PSSYSMSGTEMPL", "");
        sysModelLogMap.put("PSSYSOPPRIV", "");
        sysModelLogMap.put("PSSYSPDTVIEW", "");
        sysModelLogMap.put("PSSYSPFPITEMPL", "");
        sysModelLogMap.put("PSSYSPFPLUGIN", "");
        sysModelLogMap.put("PSSYSPORTLET", "");
        sysModelLogMap.put("PSSYSREF", "");
        sysModelLogMap.put("PSSYSREQITEM", "");
        sysModelLogMap.put("PSSYSREQITEMDATA", "");
        sysModelLogMap.put("PSSYSREQITEMHIS", "");
        sysModelLogMap.put("PSSYSREQMODULE", "");
        sysModelLogMap.put("PSSYSRESOURCE", "");
        sysModelLogMap.put("PSSYSSAHANDLER", "");
        sysModelLogMap.put("PSSYSSAMPLEVALUE", "");
        sysModelLogMap.put("PSSYSSEARCHBAR", "");
        sysModelLogMap.put("PSSYSSEARCHBARITEM", "");
        sysModelLogMap.put("PSSYSSERVICEAPI", "");
        sysModelLogMap.put("PSSYSSFCODE", "");
        sysModelLogMap.put("PSSYSSFPITEMPL", "");
        sysModelLogMap.put("PSSYSSFPLUGIN", "");
        sysModelLogMap.put("PSSYSSFPUB", "");
        sysModelLogMap.put("PSSYSSFPUBPKG", "");
        sysModelLogMap.put("PSSYSSQLCMD", "");
        sysModelLogMap.put("PSSYSSQLCMDSQL", "");
        sysModelLogMap.put("PSSYSTCASSERT", "");
        sysModelLogMap.put("PSSYSTCINPUT", "");
        sysModelLogMap.put("PSSYSTDITEM", "");
        sysModelLogMap.put("PSSYSTEM", "");
        sysModelLogMap.put("PSSYSTEMAS", "");
        sysModelLogMap.put("PSSYSTEMDBCFG", "");
        sysModelLogMap.put("PSSYSTEMMQ", "");
        sysModelLogMap.put("PSSYSTEMRUN", "");
        sysModelLogMap.put("PSSYSTESTCASE", "");
        sysModelLogMap.put("PSSYSTESTDATA", "");
        sysModelLogMap.put("PSSYSTESTMODULE", "");
        sysModelLogMap.put("PSSYSTESTPRJ", "");
        sysModelLogMap.put("PSSYSTITLEBAR", "");
        sysModelLogMap.put("PSSYSUCMAP", "");
        sysModelLogMap.put("PSSYSUCMAPNODE", "");
        sysModelLogMap.put("PSSYSUNIRES", "");
        sysModelLogMap.put("PSSYSUNISTATE", "");
        sysModelLogMap.put("PSSYSUNIT", "");
        sysModelLogMap.put("PSSYSUSERDR", "");
        sysModelLogMap.put("PSSYSUSERMODE", "");
        sysModelLogMap.put("PSSYSUSERROLERES", "");
        sysModelLogMap.put("PSSYSUSERROLEDATA", "");
        sysModelLogMap.put("PSSYSUTILDE", "");
        sysModelLogMap.put("PSSYSVALUERULE", "");
        sysModelLogMap.put("PSSYSVIEWLOGIC", "");
        sysModelLogMap.put("PSSYSVIEWLOGICPARAM", "");
        sysModelLogMap.put("PSSYSVIEWPANEL", "");
        sysModelLogMap.put("PSSYSVIEWPANELITEM", "");
        sysModelLogMap.put("PSSYSVIEWPANELLOGIC", "");
        sysModelLogMap.put("PSSYSVIEWPANELMODEL", "");
        sysModelLogMap.put("PSSYSWFMODE", "");
        sysModelLogMap.put("PSSYSWFSETTING", "");
        sysModelLogMap.put("PSVIEWMSG", "");
        sysModelLogMap.put("PSVIEWMSGGROUP", "");
        sysModelLogMap.put("PSVIEWMSGGRPDETAIL", "");
        sysModelLogMap.put("PSVIEWWIZARDGROUP", "");
        sysModelLogMap.put("PSWFDE", "");
        sysModelLogMap.put("PSWFLINK", "");
        sysModelLogMap.put("PSWFLINKCOND", "");
        sysModelLogMap.put("PSWFLINKROLE", "");
        sysModelLogMap.put("PSWFPROCESS", "");
        sysModelLogMap.put("PSWFPROCPARAM", "");
        sysModelLogMap.put("PSWFPROCROLE", "");
        sysModelLogMap.put("PSWFPROCSUBWF", "");
        sysModelLogMap.put("PSWFROLE", "");
        sysModelLogMap.put("PSWFSUBWF", "");
        sysModelLogMap.put("PSWFUTILUIACTION", "");
        sysModelLogMap.put("PSWFVERSION", "");
        sysModelLogMap.put("PSWFWORKTIME", "");
        sysModelLogMap.put("PSWORKFLOW", "");
        sysModelLogMap.put("PSWXACCOUNT", "");
        sysModelLogMap.put("PSWXENTAPP", "");
        sysModelLogMap.put("PSWXLOGIC", "");
        sysModelLogMap.put("PSWXMENU", "");
        sysModelLogMap.put("PSWXMENUFUNC", "");
        sysModelLogMap.put("PSWXMENUITEM", "");
        sysModelLogMap.put("PSCODELIST", "");
        sysModelLogMap.put("PSSYSIMAGE", "");
        sysModelLogMap.put("PSSYSCSS", "");
        sysModelLogMap.put("PSCTRLMSG", "");
        sysModelLogMap.put("PSDEACTIONTEMPL", "");
        sysModelLogMap.put("PSSYSUNIT", "");
        sysModelLogMap.put("PSSYSDELOGICNODE", "");
        sysModelLogMap.put("PSSYSDEFTYPE", "");
        sysModelLogMap.put("PSSYSOPPRIV", "");
        sysModelLogMap.put("PSSYSUSERROLERES", "");
        sysModelLogMap.put("PSSYSUSERROLEDATA", "");
        sysModelLogMap.put("PSLANGUAGERES", "");
        sysModelLogMap.put("PSLANGUAGEITEM", "");
        sysModelLogMap.put("PSSUBVIEWTYPE", "");
        sysModelLogMap.put("PSSYSVALUERULE", "");
        sysModelLogMap.put("PSSYSPORTLET", "");
        sysModelLogMap.put("PSSYSDICTCAT", "");
        sysModelLogMap.put("PSSYSEDITORSTYLE", "");
        sysModelLogMap.put("PSSYSPFPLUGIN", "");
        sysModelLogMap.put("PSSYSPFPITEMPL", "");
        sysModelLogMap.put("PSSYSSFPLUGIN", "");
        sysModelLogMap.put("PSSYSSFPITEMPL", "");
        sysModelLogMap.put("PSSYSUNIRES", "");
        sysModelLogMap.put("PSSYSMSGTEMPL", "");
        sysModelLogMap.put("PSVIEWMSG", "");
        sysModelLogMap.put("PSDEFINPUTTIPSET", "");
        sysModelLogMap.put("PSSYSUNISTATE", "");
        sysModelLogMap.put("PSSYSUTILDE", "");
        sysModelLogMap.put("PSVIEWMSGGROUP", "");
        sysModelLogMap.put("PSSYSSFPUB", "");
        sysModelLogMap.put("PSSYSBACKSERVICE", "");
        sysModelLogMap.put("PSSYSPDTVIEW", "");
        sysModelLogMap.put("PSSYSVIEWLOGIC", "");
        sysModelLogMap.put("PSSYSDATASYNCAGENT", "");
        sysModelLogMap.put("PSDATAENTITY", "");
        sysModelLogMap.put("PSDEFIELD", "");
        sysModelLogMap.put("PSDEVIEWBASE", "");
        sysModelLogMap.put("PSDEFFORMITEM", "");
        sysModelLogMap.put("PSDEFSFITEM", "");
        sysModelLogMap.put("PSDEFDTCOL", "");
        sysModelLogMap.put("PSDEFVALUERULE", "");
        sysModelLogMap.put("PSDEFINPUTTIP", "");
        sysModelLogMap.put("PSDER", "");
        sysModelLogMap.put("PSSYSDYNAMODEL", "");
        sysModelLogMap.put("PSSYSDYNAMODELATTR", "");
        sysModelLogMap.put("PSDERDEFMAP", "");
        sysModelLogMap.put("PSDEDBCFG", "");
        sysModelLogMap.put("PSDEDBINDEX", "");
        sysModelLogMap.put("PSDEDATASET", "");
        sysModelLogMap.put("PSDEDATAQUERY", "");
        sysModelLogMap.put("PSDEDQCODE", "");
        sysModelLogMap.put("PSDEDQCODECOND", "");
        sysModelLogMap.put("PSDELOGIC", "");
        sysModelLogMap.put("PSDEACTION", "");
        sysModelLogMap.put("PSDEACTIONLOGIC", "");
        sysModelLogMap.put("PSACHANDLER", "");
        sysModelLogMap.put("PSDEDRITEM", "");
        sysModelLogMap.put("PSDEDRGROUP", "");
        sysModelLogMap.put("PSDEMAP", "");
        sysModelLogMap.put("PSDEDATARELATION", "");
        sysModelLogMap.put("PSDEDRDETAIL", "");
        sysModelLogMap.put("PSDEACMODE", "");
        sysModelLogMap.put("PSDEUIACTION", "");
        sysModelLogMap.put("PSDEUAGROUP", "");
        sysModelLogMap.put("PSDEGROUP", "");
        sysModelLogMap.put("PSDEFGROUP", "");
        sysModelLogMap.put("PSDEACTIONGROUP", "");
        sysModelLogMap.put("PSDERGROUP", "");
        sysModelLogMap.put("PSDEUAGRPDETAIL", "");
        sysModelLogMap.put("PSWFDE", "");
        sysModelLogMap.put("PSDEOPPRIV", "");
        sysModelLogMap.put("PSDEMAINSTATE", "");
        sysModelLogMap.put("PSDEMAINSTATERS", "");
        sysModelLogMap.put("PSDEDATAEXP", "");
        sysModelLogMap.put("PSDEDATAIMP", "");
        sysModelLogMap.put("PSDEREPORT", "");
        sysModelLogMap.put("PSDEPRINT", "");
        sysModelLogMap.put("PSDEUTILDE", "");
        sysModelLogMap.put("PSSYSUSERMODE", "");
        sysModelLogMap.put("PSSYSUSERDR", "");
        sysModelLogMap.put("PSSYSACTOR", "");
        sysModelLogMap.put("PSSYSSAMPLEVALUE", "");
        sysModelLogMap.put("PSSYSTESTDATA", "");
        sysModelLogMap.put("PSSYSTESTCASE", "");
        sysModelLogMap.put("PSSYSTESTPRJ", "");
        sysModelLogMap.put("PSSYSTESTMODULE", "");
        sysModelLogMap.put("PSSYSERMAP", "");
        sysModelLogMap.put("PSSYSUCMAP", "");
        sysModelLogMap.put("PSDEWIZARD", "");
        sysModelLogMap.put("PSDEDATASYNC", "");
        sysModelLogMap.put("PSSYSBDTABLE", "");
        sysModelLogMap.put("PSSYSBDSCHEME", "");
        sysModelLogMap.put("PSSYSBDMODULE", "");
        sysModelLogMap.put("PSSYSBDPART", "");
        sysModelLogMap.put("PSSYSBDTABLERS", "");
        sysModelLogMap.put("PSSYSBDTABLE", "");
        sysModelLogMap.put("PSSYSBDCOLSET", "");
        sysModelLogMap.put("PSSYSBDTABLEDE", "");
        sysModelLogMap.put("PSSYSBDTABLEDER", "");
        sysModelLogMap.put("PSSYSBDCOLUMN", "");
        sysModelLogMap.put("PSDEACTIONWIZARD", "");
        sysModelLogMap.put("PSDEAWGROUP", "");
        sysModelLogMap.put("PSWORKFLOW", "");
        sysModelLogMap.put("PSWFVERSION", "");
        sysModelLogMap.put("PSWXACCOUNT", "");
        sysModelLogMap.put("PSWXENTAPP", "");
        sysModelLogMap.put("PSWXLOGIC", "");
        sysModelLogMap.put("PSWXMENU", "");
        sysModelLogMap.put("PSWXMENUFUNC", "");
        sysModelLogMap.put("PSSYSSFPUBPKG", "");
        sysModelLogMap.put("PSAPPPKG", "");
        sysModelLogMap.put("PSSYSSEARCHBAR", "");
        sysModelLogMap.put("PSSYSTITLEBAR", "");
        sysModelLogMap.put("PSAPPTITLEBAR", "");
        sysModelLogMap.put("PSSYSDASHBOARD", "");
        sysModelLogMap.put("PSSYSCALENDAR", "");
        sysModelLogMap.put("PSSYSVIEWPANEL", "");
        sysModelLogMap.put("PSDEUSERROLE", "");
        sysModelLogMap.put("PSDEOPPRIVROLE", "");
        sysModelLogMap.put("PSDATAENTITY", "");
        sysModelLogMap.put("PSAPPMODULE", "");
        sysModelLogMap.put("PSAPPVIEW", "");
        sysModelLogMap.put("PSAPPLAN", "");
        sysModelLogMap.put("PSAPPUTILPAGE", "");
        sysModelLogMap.put("PSAPPPDTVIEW", "");
        sysModelLogMap.put("PSAPPUISTYLE", "");
        sysModelLogMap.put("PSAPPFUNC", "");
        sysModelLogMap.put("PSAPPEDITORTEMPL", "");
        sysModelLogMap.put("PSAPPMENU", "");
        sysModelLogMap.put("PSAPPUSERMODE", "");
        sysModelLogMap.put("PSAPPUITHEME", "");
        sysModelLogMap.put("PSAPPLOCALDE", "");
        sysModelLogMap.put("PSMOBAPPSTARTPAGE", "");
        sysModelLogMap.put("PSMOBAPPPACK", "");
        sysModelLogMap.put("PSAPPVIEWCODE", "");
        sysModelLogMap.put("PSAPPVIEWREF", "");
        sysModelLogMap.put("PSAPPVIEWLOGIC", "");
        sysModelLogMap.put("PSDEVIEWBASE", "");
        sysModelLogMap.put("PSDETOOLBAR", "");
        sysModelLogMap.put("PSDEFORM", "");
        sysModelLogMap.put("PSDEGRID", "");
        sysModelLogMap.put("PSDETREEVIEW", "");
        sysModelLogMap.put("PSDECHART", "");
        sysModelLogMap.put("PSDELIST", "");
        sysModelLogMap.put("PSDEDATAVIEW", "");
        sysModelLogMap.put("PSSYSSAHANDLER", "");
        sysModelLogMap.put("PSSYSSERVICEAPI", "");
        sysModelLogMap.put("PSDESERVICEAPI", "");
        sysModelLogMap.put("PSDESADETAIL", "");
        sysModelLogMap.put("PSSUBSYSSERVICEAPI", "");
        sysModelLogMap.put("PSSUBSYSSADETAIL", "");
        sysModelLogMap.put("PSDEDTSQUEUE", "");
        sysModelLogMap.put("PSDEGRIDCOL", "");
        sysModelLogMap.put("PSDEVIEWCTRL", "");
        sysModelLogMap.put("PSDESAMPLEDATA", "");
        sysModelLogMap.put("PSDESARS", "");
        sysModelLogMap.put("PSAPPWF", "");
        sysModelLogMap.put("PSAPPWFVER", "");
        sysModelLogMap.put("PSAPPDERS", "");
        sysModelLogMap.put("PSAPPDERSVIEW", "");
        sysModelLogMap.put("PSSUBSYSSADE", "");
        sysModelLogMap.put("PSSUBSYSSADERS", "");
        sysModelLogMap.put("PSSUBSYSSADEFIELD", "");
        sysModelLogMap.put("PSSYSDBSCHEME", "");
        sysModelLogMap.put("PSSYSDBTABLE", "");
        sysModelLogMap.put("PSSYSDBCOLUMN", "");
        sysModelLogMap.put("PSSYSDBPROC", "");
        sysModelLogMap.put("PSSYSDBPROCPARAM", "");
        sysModelLogMap.put("PSAPPRESOURCE", "");
        sysModelLogMap.put("PSSYSRESOURCE", "");
        sysModelLogMap.put("PSSYSCONTENT", "");
        sysModelLogMap.put("PSSYSCONTENTCAT", "");
        sysModelLogMap.put("PSAPPSBITEM", "");
        sysModelLogMap.put("PSAPPSBITEMRS", "");
        sysModelLogMap.put("PSAPPSTORYBOARD", "");
        sysModelLogMap.put("PSDESAVR", "");
        sysModelLogMap.put("PSSYSERMAP", "");
        sysModelLogMap.put("PSSYSERMAPNODE", "");
        sysModelLogMap.put("PSSYSUCMAP", "");
        sysModelLogMap.put("PSSYSUCMAPNODE", "");
        sysModelLogMap.put("PSSYSREQMODULE", "");
        sysModelLogMap.put("PSSYSREQITEM", "");
        sysModelLogMap.put("PSAPPDEVIEW", "PSAPPVIEW");
        sysModelLogMap.put("PSAPPPORTALVIEW", "PSAPPVIEW");
        sysModelLogMap.put("PSAPPINDEXVIEW", "PSAPPVIEW");
        sysModelLogMap.put("PSCTRLLOGICGROUP", "");
        sysModelLogMap.put("PSCTRLLOGICGRPDETAIL", "");
        sysModelLogMap.put("PSSYSSEARCHSCHEME", "");
        sysModelLogMap.put("PSSYSSEARCHDOC", "");
        sysModelLogMap.put("PSSYSSEARCHFIELD", "");
        sysModelLogMap.put("PSSYSSEARCHDE", "");
        sysModelLogMap.put("PSSYSSEARCHDEFIELD", "");
        sysModelLogMap.put("PSSYSMAPVIEW", "");
        sysModelLogMap.put("PSSYSMAPITEM", "");
        sysModelLogMap.put("PSSYSPORTLETCAT", "");
        sysModelLogMap.put("PSAPPPORTLET", "");
        sysModelLogMap.put("PSDEGEIVR", "");
        sysModelLogMap.put("PSDEACTIONVR", "");
        sysModelLogMap.put("PSSYSSEQUENCE", "");
        sysModelLogMap.put("PSSYSTRANSLATOR", "");
        sysModelLogMap.put("PSSYSMSGQUEUE", "");
        sysModelLogMap.put("PSSYSMSGTARGET", "");
        sysModelLogMap.put("PSDENOTIFY", "");
        sysModelLogMap.put("PSDENOTIFYTARGET", "");
        sysModelLogMap.put("PSSYSEAIDATATYPEITEM", "");
        sysModelLogMap.put("PSSYSEAIDER", "");
        sysModelLogMap.put("PSSYSEAIDEFIELD", "");
        sysModelLogMap.put("PSSYSEAIDE", "");
        sysModelLogMap.put("PSSYSEAIELEMENTRE", "");
        sysModelLogMap.put("PSSYSEAIELEMENTATTR", "");
        sysModelLogMap.put("PSSYSEAIELEMENT", "");
        sysModelLogMap.put("PSSYSEAIDATATYPE", "");
        sysModelLogMap.put("PSSYSEAISCHEME", "");
        sysModelLogMap.put("PSSYSBIAGGCOLUMN", "");
        sysModelLogMap.put("PSSYSBIAGGTABLE", "");
        sysModelLogMap.put("PSSYSBICUBELEVEL", "");
        sysModelLogMap.put("PSSYSBICUBEMEASURE", "");
        sysModelLogMap.put("PSSYSBICUBEDIMENSION", "");
        sysModelLogMap.put("PSSYSBILEVEL", "");
        sysModelLogMap.put("PSSYSBIHIERARCHY", "");
        sysModelLogMap.put("PSSYSBIDIMENSION", "");
        sysModelLogMap.put("PSSYSBICUBE", "");
        sysModelLogMap.put("PSSYSBISCHEME", "");
        sysModelLogMap.put("PSTHRESHOLD", "");
        sysModelLogMap.put("PSTHRESHOLDGROUP", "");
        sysModelLogMap.put("PSSYSCHARTTHEME", "");
        sysModelLogMap.put("PSSYSCANVAS", "");
        sysModelLogMap.put("PSSYSCANVASMODEL", "");
        sysModelLogMap.put("PSSYSDASHBOARDLOGIC", "");
        sysModelLogMap.put("PSAPPMENULOGIC", "");
        sysModelLogMap.put("PSDEFORMLOGIC", "");
        sysModelLogMap.put("PSSYSSEARCHBARLOGIC", "");
        sysModelLogMap.put("PSAPPLOGIC", "");
        sysModelLogMap.put("PSDETOOLBARLOGIC", "");
        sysModelLogMap.put("PSDEWIZARDLOGIC", "");
        sysModelLogMap.put("PSDELISTLOGIC", "");
        sysModelLogMap.put("PSSYSMAPLOGIC", "");
        sysModelLogMap.put("PSDETREELOGIC", "");
        sysModelLogMap.put("PSDEDATAVIEWLOGIC", "");
        sysModelLogMap.put("PSSYSCALENDARLOGIC", "");
        sysModelLogMap.put("PSDEGRIDLOGIC", "");
        sysModelLogMap.put("PSDECHARTLOGIC", "");
        sysModelLogMap.put("PSDETEIUDETAIL", "");
        sysModelLogMap.put("PSDETEIUPDATE", "");
        informStateMap.put("PSSYSDEVBKTASK", "");
        informStateMap.put("PSDCBKTASK", "");
        informStateMap.put("PSSYSERMAPNODE", "PSSYSERMAPID");
        informStateMap.put("PSSYSREQMODULE", "PSSYSREQMODULEID");
        informStateMap.put("PSSYSREQITEM", "PSSYSREQITEMID");
        informStateMap2.put("PSDCBKTASK", "");
        nestedDERTranslateMap.put("PSDEVIEWBASE", "");
        nestedDERTranslateMap.put("PSCODELIST", "");
        nestedDERTranslateMap.put("PSSYSTESTCASE", "");
        nestedDERTranslateMap.put("PSCTRLLOGICGROUP", "");
        nestedDERTranslateMap.put("PSDEFGROUP", "");
        nestedDERTranslateMap.put("PSDEDATARELATION", "");
        nestedDERTranslateMap.put("PSSYSEAIDATATYPE", "");
        nestedDERTranslateMap.put("PSAPPPORTALVIEW", "");
        nestedDERTranslateMap.put("PSDEACTION", "");
        nestedDERTranslateMap.put("PSDENOTIFY", "");
        nestedDERTranslateMap.put("PSSYSVIEWLOGIC", "");
        nestedDERTranslateMap.put("PSDETOOLBAR", "");
        nestedDERTranslateMap.put("PSDEACTIONGROUP", "");
        nestedDERTranslateMap.put("PSDEWIZARD", "");
        nestedDERTranslateMap.put("PSDELIST", "");
        nestedDERTranslateMap.put("PSVIEWMSGGROUP", "");
        nestedDERTranslateMap.put("PSDEGRID", "");
        nestedDERTranslateMap.put("PSSYSTESTDATA", "");
        nestedDERTranslateMap.put("PSDETREEVIEW", "");
        nestedDERTranslateMap.put("PSDECHART", "");
        nestedDERTranslateMap.put("PSDEDBINDEX", "");
        nestedDERTranslateMap.put("PSDEDATASET", "");
        nestedDERTranslateMap.put("PSAPPMENU", "");
        nestedDERTranslateMap.put("PSSYSEAIELEMENT", "");
        nestedDERTranslateMap.put("PSSYSERMAP", "");
        nestedDERTranslateMap.put("PSDEGROUP", "");
        nestedDERTranslateMap.put("PSDEFVALUERULE", "");
        nestedDERTranslateMap.put("PSSYSBIAGGTABLE", "");
        nestedDERTranslateMap.put("PSSYSUCMAP", "");
        nestedDERTranslateMap.put("PSCTRLMSG", "");
        nestedDERTranslateMap.put("PSTHRESHOLDGROUP", "");
        nestedDERTranslateMap.put("PSWXMENU", "");
        nestedDERTranslateMap.put("PSSYSEAIDE", "");
        nestedDERTranslateMap.put("PSDEACMODE", "");
        nestedDERTranslateMap.put("PSSYSBIREPORT", "");
        nestedDERTranslateMap.put("PSDERGROUP", "");
        nestedDERTranslateMap.put("PSAPPSTORYBOARD", "");
        nestedDERTranslateMap.put("PSDEVSLNMSDEPFUNC", "");
        nestedDERTranslateMap.put("PSDEUAGROUP", "");
        nestedDERTranslateMap.put("PSSYSMAPVIEW", "");
        nestedDERTranslateMap.put("PSDEDATAIMP", "");
        nestedDERTranslateMap.put("PSDEMAP", "");
        nestedDERTranslateMap.put("PSSYSSEARCHBAR", "");
        nestedDERTranslateMap.put("PSSYSDASHBOARD", "");
        nestedDERTranslateMap.put("PSSYSVIEWPANEL", "");
        nestedDERTranslateMap.put("PSDEREPORT", "");
        nestedDERTranslateMap.put("PSDEMAINSTATE", "");
        nestedDERTranslateMap.put("PSSYSCALENDAR", "");
        nestedDERTranslateMap.put("PSDEVSLNPIPELINE", "");
        nestedDERTranslateMap.put("PSDEDATAVIEW", "");
        nestedDERTranslateMap.put("PSDEFORM", "");
        nestedDERTranslateMap.put("PSDEDATAQUERY", "");
        nestedDERTranslateMap.put("PSDELOGIC", "");
        nestedDERTranslateMap.put("PSWFVERSION", "");
    }
}