package net.ibizsys.modeling.core.sysutil.addin;

import com.google.common.base.CaseFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.PSDEOPPrivDERuntime;
import net.ibizsys.modeling.core.dataentity.dto.PSACHandlerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMTDEFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCModelTemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEACModeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQJoinDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDRDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDRGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDSDQDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataRelationDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFSFItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGridColDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGridDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivRoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEToolbarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUserRoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewCtrlDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewRVDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPDTViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSVTCtrlDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSVTRVDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFDEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFProcessDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFVersionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWorkflowDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSACHandlerService;
import net.ibizsys.modeling.core.dataentity.service.IPSCodeListService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCModelTemplService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEACModeService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEActionService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEDBTableService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEDRDetailService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEDRGroupService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEDataQueryService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEDataRelationService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEDataSetService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEDataViewService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFGroupService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFSFItemService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFieldService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFormService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEGridService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEListService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEOPPrivRoleService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEOPPrivService;
import net.ibizsys.modeling.core.dataentity.service.IPSDERService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEToolbarService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEUserRoleService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEViewBaseService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEViewCtrlService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEViewRVService;
import net.ibizsys.modeling.core.dataentity.service.IPSDataEntityService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysDBSchemeService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysDBTableService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysPDTViewService;
import net.ibizsys.modeling.core.dataentity.service.IPSViewTypeService;
import net.ibizsys.modeling.core.dataentity.service.IPSWFDEService;
import net.ibizsys.modeling.core.dataentity.service.IPSWFProcessService;
import net.ibizsys.modeling.core.dataentity.service.IPSWFVersionService;
import net.ibizsys.modeling.core.dataentity.service.IPSWorkflowService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.KeyValueUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class PSDataEntityInitializer
extends PSModelInitializerBase {
    private static final Log log = LogFactory.getLog(PSDataEntityInitializer.class);
    @Autowired
    private IPSDataEntityService iPSDataEntityService = null;
    @Autowired
    private IPSDEFieldService iPSDEFieldService = null;
    @Autowired
    private IPSDCModelTemplService IPSDCModelTemplService = null;
    @Autowired
    private IPSDEFormService iPSDEFormService = null;
    @Autowired
    private IPSDEGridService iPSDEGridService = null;
    @Autowired
    private IPSDEFSFItemService iPSDEFSFItemService = null;
    @Autowired
    private IPSDEOPPrivService iPSDEOPPrivService = null;
    @Autowired
    private IPSDEDataQueryService iPSDEDataQueryService = null;
    @Autowired
    private IPSDEDataSetService iPSDEDataSetService = null;
    @Autowired
    private IPSDEViewBaseService iPSDEViewBaseService = null;
    @Autowired
    private IPSDEFGroupService iPSDEFGroupService = null;
    @Autowired
    private IPSDEActionService iPSDEActionService = null;
    @Autowired
    private IPSDEDBTableService iPSDETableService = null;
    @Autowired
    private IPSDEUserRoleService iPSDEUserRoleService = null;
    @Autowired
    private IPSDEOPPrivRoleService iPSDEOPPrivRoleService = null;
    @Autowired
    private IPSSysDBSchemeService iPSSysDBSchemeService = null;
    @Autowired
    private IPSSysDBTableService iPSSysDBTableService = null;
    @Autowired
    private IPSDERService iPSDERService = null;
    @Autowired
    private IPSViewTypeService iPSViewTypeService = null;
    @Autowired
    private IPSWFDEService iPSWFDEService = null;
    @Autowired
    private IPSCodeListService iPSCodeListService = null;
    @Autowired
    private IPSWFVersionService iPSWFVersionService = null;
    @Autowired
    private IPSWorkflowService iPSWorkflowService = null;
    @Autowired
    private IPSDEDRGroupService iPSDEDRGroupService = null;
    @Autowired
    private IPSSysPDTViewService iPSSysPDTViewService = null;
    @Autowired
    private IPSDEDRDetailService iPSDEDRDetailService = null;
    @Autowired
    private IPSWFProcessService iPSWFProcessService = null;
    @Autowired
    private IPSDEViewCtrlService iPSDEViewCtrlService = null;
    @Autowired
    private IPSDEViewRVService iPSDEViewRVService = null;
    @Autowired
    private IPSACHandlerService iPSACHandlerService = null;
    @Autowired
    private IPSDEToolbarService iPSDEToolbarService = null;
    @Autowired
    private IPSDEDataRelationService iPSDEDataRelationService = null;
    @Autowired
    private IPSDEDataViewService iPSDEDataViewService = null;
    @Autowired
    private IPSDEListService iPSDEListService = null;
    @Autowired
    private IPSDEACModeService iPSDEACModeService = null;
    private static HashMap<String, String> wfActionMap = new HashMap();
    private static HashMap<String, String> predefinedFieldMap = new HashMap();
    public static final String[] DEACTIONS;
    public static final String[] DEACTIONS2;
    private static final String[] initViewTypes;
    private static final String[] initMobViewTypes;
    private static final String[] initWFViewTypes;
    private static final String[] initMobWFViewTypes;
    private static Map<String, PSViewTypeDTO> psViewTypeMap;
    public static final String CTRLTYPE_TOOLBAR = "TOOLBAR";
    public static final String CTRLTYPE_GRID = "GRID";
    public static final String CTRLTYPE_FORM = "FORM";
    public static final String CTRLTYPE_SEARCHFORM = "SEARCHFORM";
    public static final String CTRLTYPE_DRBAR = "DRBAR";
    public static final String CTRLTYPE_VIEWPANEL = "VIEWPANEL";
    public static final String CTRLTYPE_PICKUPVIEWPANEL = "PICKUPVIEWPANEL";
    public static final String CTRLTYPE_DATAVIEW = "DATAVIEW";
    public static final String CTRLTYPE_TREEGRID = "TREEGRID";
    public static final String CTRLTYPE_WFEXPBAR = "WFEXPBAR";
    public static final String CTRLTYPE_TREEVIEW = "TREEVIEW";
    public static final String CTRLTYPE_TREEEXPBAR = "TREEEXPBAR";
    public static final String CTRLTYPE_TABVIEWPANEL = "TABVIEWPANEL";
    public static final String CTRLTYPE_DRTAB = "DRTAB";
    public static final String CTRLTYPE_CHART = "CHART";
    public static final String CTRLTYPE_REPORTPANEL = "REPORTPANEL";
    public static final String CTRLTYPE_LIST = "LIST";
    public static final String CTRLTYPE_MOBMDCTRL = "MOBMDCTRL";
    public static final String CTRLTYPE_MULTIEDITVIEWPANEL = "MULTIEDITVIEWPANEL";
    public static final String CTRLTYPE_WIZARDPANEL = "WIZARDPANEL";
    public static final String CTRLTYPE_UPDATEPANEL = "UPDATEPANEL";
    public static final String CTRLTYPE_SEARCHBAR = "SEARCHBAR";
    public static final String CTRLTYPE_DASHBOARD = "DASHBOARD";
    public static final String CTRLTYPE_CALENDAR = "CALENDAR";
    public static final String CTRLTYPE_PANEL = "PANEL";
    public static final String CTRLTYPE_MAP = "MAP";
    public static final String CTRLTYPE_GANTT = "GANTT";
    public static final String CTRLTYPE_TREEGRIDEX = "TREEGRIDEX";
    public static final String CTRLTYPE_KANBAN = "KANBAN";
    public static final String CTRLTYPE_CALENDAREXPBAR = "CALENDAREXPBAR";
    public static final String CTRLTYPE_CHARTEXPBAR = "CHARTEXPBAR";
    public static final String CTRLTYPE_DATAVIEWEXPBAR = "DATAVIEWEXPBAR";
    public static final String CTRLTYPE_GANTTEXPBAR = "GANTTEXPBAR";
    public static final String CTRLTYPE_GRIDEXPBAR = "GRIDEXPBAR";
    public static final String CTRLTYPE_LISTEXPBAR = "LISTEXPBAR";
    public static final String CTRLTYPE_MAPEXPBAR = "MAPEXPBAR";
    public static final String CTRLTYPE_STATEWIZARDPANEL = "STATEWIZARDPANEL";
    public static final String CTRLTYPE_APPMENU = "APPMENU";
    public static final String CTRLTYPE_TABEXPPANEL = "TABEXPPANEL";
    public static final String CTRLTYPE_CUSTOM = "CUSTOM";

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        PSDataEntityDTO et = (PSDataEntityDTO)iEntityDTO;
        if (!bDraftMode) {
            this.doPrepareBeforeCreate(et);
        } else {
            this.doPrepareGetDraft(et);
        }
        return super.onPrepare(iEntityDTO, args, bDraftMode);
    }

    protected void doPrepareGetDraft(PSDataEntityDTO et) throws Throwable {
        block2: {
            PSDataEntityDTO psDataEntity;
            if (et.getDEType() == null) {
                et.setDEType(1);
            }
            if (!ObjectUtils.isEmpty((Object)et.getPSDataEntityName()) || !StringUtils.hasLength((String)et.getPSSystemId())) break block2;
            int nIndex = 0;
            while (true) {
                psDataEntity = new PSDataEntityDTO();
                psDataEntity.setPSSystemId(et.getPSSystemId());
                psDataEntity.setPSDataEntityName(String.format("ENTITY%1$s", ++nIndex == 1 ? "" : Integer.valueOf(nIndex)));
                if (this.iPSDataEntityService.rawSelect(psDataEntity, true)) continue;
                et.setPSDataEntityName(psDataEntity.getPSDataEntityName());
                psDataEntity.resetAll();
                psDataEntity.setPSSystemId(et.getPSSystemId());
                psDataEntity.setLogicName(String.format("\u5b9e\u4f53%1$s", nIndex == 1 ? "" : Integer.valueOf(nIndex)));
                if (!this.iPSDataEntityService.select(psDataEntity, true)) break;
            }
            et.setLogicName(psDataEntity.getLogicName());
        }
    }

    protected void doPrepareBeforeCreate(PSDataEntityDTO et) throws Throwable {
        int nVirtualFlag;
        PSDevSlnSysDTO psDevSlnSys;
        PSModuleDTO psModule;
        PSDCModelTemplDTO psDCModelTempl = null;
        boolean bIgnoreCheck = false;
        if (DataTypeUtils.getBooleanValue((Object)et.getExistingModel(), (Boolean)false).booleanValue()) {
            bIgnoreCheck = true;
        }
        if (!bIgnoreCheck && et.getPSModuleId() != null && DataTypeUtils.getBooleanValue((Object)(psModule = this.getPSModuleDTO(et.getPSModuleId())).getSubSysModule(), (Boolean)false).booleanValue()) {
            bIgnoreCheck = true;
        }
        if (!bIgnoreCheck && (psDevSlnSys = this.getPSDevSlnSysDTO(this.getCurrentPSDevSlnSysId())) != null && StringUtils.hasLength((String)psDevSlnSys.getPSDCModelTemplId())) {
            psDCModelTempl = (PSDCModelTemplDTO)this.IPSDCModelTemplService.get(psDevSlnSys.getPSDCModelTemplId(), true);
        }
        String strPSDataEntityName = et.getPSDataEntityName().toUpperCase();
        if (psDCModelTempl != null && psDCModelTempl.getDENameMaxLength() != null && psDCModelTempl.getDENameMaxLength() > 0 && strPSDataEntityName.length() > psDCModelTempl.getDENameMaxLength()) {
            throw new Exception(String.format("\u6a21\u578b\u6a21\u677f[%1$s]\u5b9a\u4e49\u5b9e\u4f53\u540d\u79f0\u957f\u5ea6\u4e0d\u80fd\u8d85\u8fc7[%2$s]", psDCModelTempl.getPSDCModelTemplName(), psDCModelTempl.getDENameMaxLength()));
        }
        et.setPSDataEntityName(strPSDataEntityName);
        if (ObjectUtils.isEmpty((Object)et.getCodeName())) {
            if (this.isEnableCodeNameUpperCamel()) {
                et.setCodeName(this.toUpperCamel(strPSDataEntityName));
            } else {
                et.setCodeName(strPSDataEntityName);
            }
        }
        if (psDCModelTempl == null) {
            if (ObjectUtils.isEmpty((Object)et.getTableName())) {
                et.setTableName(String.format("T_%1$s", strPSDataEntityName));
            }
            if (ObjectUtils.isEmpty((Object)et.getViewName())) {
                et.setViewName(String.format("V_%1$s", strPSDataEntityName));
            }
        } else {
            String strTablePreFix = "";
            String strViewPreFix = "";
            String strView2PreFix = "";
            String strView3PreFix = "";
            String strView4PreFix = "";
            if (DataTypeUtils.getBooleanValue((Object)psDCModelTempl.getTablePrefixFlag(), (Boolean)true).booleanValue() && ObjectUtils.isEmpty((Object)(strTablePreFix = psDCModelTempl.getTablePrefix()))) {
                strTablePreFix = "T_";
            }
            if (DataTypeUtils.getBooleanValue((Object)psDCModelTempl.getViewPrefixFlag(), (Boolean)true).booleanValue()) {
                strViewPreFix = psDCModelTempl.getViewPrefix();
                if (ObjectUtils.isEmpty((Object)strViewPreFix)) {
                    strViewPreFix = "V_";
                }
                if (ObjectUtils.isEmpty((Object)(strView2PreFix = psDCModelTempl.getView2Prefix()))) {
                    strView2PreFix = "V2_";
                }
                if (ObjectUtils.isEmpty((Object)(strView3PreFix = psDCModelTempl.getView3Prefix()))) {
                    strView3PreFix = "V3_";
                }
                if (ObjectUtils.isEmpty((Object)(strView4PreFix = psDCModelTempl.getView4Prefix()))) {
                    strView4PreFix = "V4_";
                }
            }
            if (ObjectUtils.isEmpty((Object)et.getTableName())) {
                et.setTableName(String.format("%1$s%2$s", strTablePreFix, strPSDataEntityName));
            }
            if (ObjectUtils.isEmpty((Object)et.getViewName())) {
                et.setViewName(String.format("%1$s%2$s", strViewPreFix, strPSDataEntityName));
            }
        }
        if ((nVirtualFlag = DataTypeUtils.getIntegerValue((Object)et.getVirtualFlag(), (Integer)0).intValue()) > 0) {
            if (nVirtualFlag != PSModelEnums.DEVirtualMode.MIXMINHERIT.value && nVirtualFlag != PSModelEnums.DEVirtualMode.MIXMINHERITMERGE.value) {
                et.resetTableName();
            }
            if (nVirtualFlag == PSModelEnums.DEVirtualMode.INDEXMAJOR.value && DataTypeUtils.compare((String)et.getIndexDEType(), (String)PSModelEnums.DEIndexType.INDEX.value, (boolean)false) != 0L) {
                this.sendStudioConsole(true, 20000, String.format("\u8bbe\u7f6e\u5b9e\u4f53[%1$s]\u7d22\u5f15\u7c7b\u578b[\u7d22\u5f15\u4e3b\u5b9e\u4f53]", et.getPSDataEntityName()), false);
                et.setIndexDEType(PSModelEnums.DEIndexType.INDEX.value);
            }
        }
        if (DataTypeUtils.getBooleanValue((Object)et.getNoViewMode(), (Boolean)false).booleanValue()) {
            et.resetViewName();
        }
    }

    @Override
    protected boolean onInitialize(IEntityDTO iEntityDTO, Object[] args) throws Throwable {
        PSSystemDTO psSystem = this.getCurrentPSSystemDTO();
        PSDataEntityDTO psDataEntityDTO = (PSDataEntityDTO)iEntityDTO;
        this.doInitPSDEFields(psDataEntityDTO);
        this.doInitPSDEActions(psDataEntityDTO);
        this.doInitPSDEACModes(psDataEntityDTO);
        this.doInitPSDEDataRelations(psDataEntityDTO);
        this.doInitPSDEDataSets(psDataEntityDTO);
        this.doInitPSDEForms(psDataEntityDTO);
        this.doInitPSDEGrids(psDataEntityDTO);
        this.doInitPSDEFSFItems(psDataEntityDTO);
        this.doInitPSDEOPPrivs(psDataEntityDTO);
        if (DataTypeUtils.getBooleanValue((Object)psSystem.getEnableMultiLan(), (Boolean)this.isEnableI18NDefault()).booleanValue()) {
            this.doInitPSLanguageReses(psDataEntityDTO, false);
        }
        if (this.isEnableModelRTModes()) {
            this.doInitModelRTModes(psDataEntityDTO);
        }
        this.doInitPSDETables(psDataEntityDTO);
        this.doInitPSDEViews(psDataEntityDTO);
        return super.onInitialize(iEntityDTO, args);
    }

    protected void doInitPSDEActions(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        PSDEActionDTO psDEAction;
        for (String strAction : DEACTIONS) {
            psDEAction = new PSDEActionDTO();
            psDEAction.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEAction.setPSDEActionName(strAction);
            if (this.iPSDEActionService.select(psDEAction, true)) continue;
            psDEAction.setPSDEName(psDataEntityDTO.getPSDataEntityName());
            psDEAction.setActionType(PSModelEnums.DEActionType.BUILTIN.value);
            psDEAction.setCodeName(strAction);
            psDEAction.setLogicName(strAction);
            this.iPSDEActionService.create(psDEAction);
        }
        if (DataTypeUtils.getIntegerValue((Object)psDataEntityDTO.getEnaTempData(), (Integer)0) > 0) {
            for (String strAction : DEACTIONS2) {
                psDEAction = new PSDEActionDTO();
                psDEAction.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                psDEAction.setPSDEActionName(strAction);
                if (this.iPSDEActionService.select(psDEAction, true)) continue;
                psDEAction.setPSDEName(psDataEntityDTO.getPSDataEntityName());
                psDEAction.setActionType(PSModelEnums.DEActionType.BUILTIN.value);
                psDEAction.setCodeName(strAction);
                psDEAction.setLogicName(strAction);
                this.iPSDEActionService.create(psDEAction);
            }
        }
    }

    protected void doInitPSDEViews(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        PSViewTypeDTO psViewTypeStruct;
        for (String strViewType : initViewTypes) {
            psViewTypeStruct = this.getPSViewType(strViewType);
            this.doInitDEView(psDataEntityDTO, psViewTypeStruct);
        }
        if (DataTypeUtils.getBooleanValue((Object)psDataEntityDTO.getEnableMob(), (Boolean)false).booleanValue()) {
            for (String strViewType : initMobViewTypes) {
                psViewTypeStruct = this.getPSViewType(strViewType);
                this.doInitDEView(psDataEntityDTO, psViewTypeStruct);
            }
        }
        this.doInitDEWFViews(psDataEntityDTO);
    }

    protected void doInitDEWFViews(PSDataEntityDTO psDataEntity) throws Throwable {
        ISearchContextDTO searchContextDTO = this.iPSWFDEService.getDataEntityRuntime().createSearchContext().all().count(false).eq("PSDEID", (Object)psDataEntity.getPSDataEntityId());
        List<PSWFDEDTO> psWFDEList = this.iPSWFDEService.select(searchContextDTO);
        if (ObjectUtils.isEmpty((Object)psWFDEList)) {
            return;
        }
        for (PSWFDEDTO psWFDE : psWFDEList) {
            this.doInitWFDEViews(psWFDE, psDataEntity);
        }
    }

    public void doInitWFDEViews(PSWFDEDTO psWFDE, PSDataEntityDTO psDataEntity) throws Throwable {
        block54: {
            PSViewTypeDTO psViewTypeStruct;
            PSCodeListDTO wfStepCodeList;
            PSCodeListDTO udStateCodeList;
            boolean bEnableMob;
            List<PSWFVersionDTO> psWFVersionList;
            PSDataEntityDTO psDataEntity2;
            PSWFDEDTO psWFDE2;
            block53: {
                PSDEDRDetailDTO psDEDRDetail;
                psWFDE2 = psWFDE;
                psDataEntity2 = psDataEntity != null ? psDataEntity : (PSDataEntityDTO)this.iPSDataEntityService.get(psWFDE.getPSDEId());
                PSWorkflowDTO workflowDTO = new PSWorkflowDTO();
                workflowDTO.setPSWorkflowId(psWFDE2.getPSWFId());
                if (!this.iPSWorkflowService.select(workflowDTO, false)) {
                    throw new RuntimeException(String.format("\u672a\u627e\u5230\u5b9e\u4f53[%1$s]\u5bf9\u5e94\u7684\u5de5\u4f5c\u6d41", psDataEntity.getCodeName()));
                }
                psWFVersionList = null;
                int nWFProxyMode = DataTypeUtils.getIntegerValue((Object)psWFDE2.getWFProxyMode(), (Integer)0);
                boolean bUseWFProxyApp = (nWFProxyMode & 1) == 1;
                boolean bWFServer = nWFProxyMode != 1;
                boolean bDynaSys = DataTypeUtils.getBooleanValue((Object)workflowDTO.getEnableDynaSys(), (Boolean)false);
                bEnableMob = false;
                if (DataTypeUtils.getBooleanValue((Object)workflowDTO.getEnableMob(), (Boolean)false).booleanValue()) {
                    bEnableMob = true;
                }
                if (bUseWFProxyApp) {
                    bDynaSys = false;
                }
                if (bDynaSys) {
                    PSWFVersionDTO psWFVersion = new PSWFVersionDTO();
                    psWFVersion.setPSWFId(psWFDE2.getPSWFId());
                    psWFVersion.setEnableDynaSys(1);
                    if (this.iPSWFVersionService.select(psWFVersion, true)) {
                        psWFVersionList = new ArrayList();
                        psWFVersionList.add(psWFVersion);
                    }
                } else if (bWFServer) {
                    ISearchContextDTO searchContextDTO = this.iPSWFVersionService.createSearchContextDTO().all().count(false).eq("PSWFID", (Object)psWFDE2.getPSWFId());
                    searchContextDTO.sort("wfversion,desc");
                    psWFVersionList = this.iPSWFVersionService.rawSelect(searchContextDTO);
                }
                PSDEFieldDTO mfDEField = null;
                PSCodeListDTO mfCodeList = null;
                udStateCodeList = null;
                wfStepCodeList = null;
                if (!bDynaSys && bWFServer) {
                    if (DataTypeUtils.getIntegerValue((Object)psDataEntity2.getEnaMultiForm(), (Integer)0) > 0) {
                        mfDEField = new PSDEFieldDTO();
                        mfDEField.setPSDEId(psDataEntity2.getPSDataEntityId());
                        mfDEField.setMultiFormField(1);
                        if (!this.iPSDEFieldService.select(mfDEField, false)) {
                            throw new Exception(String.format("\u5b9e\u4f53[%1$s]\u6ca1\u6709\u5b9a\u4e49\u591a\u8868\u5355\u8bc6\u522b\u5c5e\u6027", psDataEntity2.getPSDataEntityName()));
                        }
                        if (ObjectUtils.isEmpty((Object)mfDEField.getPSCodeListId())) {
                            throw new Exception(String.format("\u5c5e\u6027[%1$s]\u6ca1\u6709\u5b9a\u4e49\u4ee3\u7801\u8868", mfDEField.getPSDEFieldName()));
                        }
                        mfCodeList = new PSCodeListDTO();
                        mfCodeList.setPSCodeListId(mfDEField.getPSCodeListId());
                        this.iPSCodeListService.select(mfCodeList, true);
                    }
                    if (StringUtils.hasLength((String)psWFDE2.getWFStepPSDEFId())) {
                        PSDEFieldDTO wfStepDEField = new PSDEFieldDTO();
                        wfStepDEField.setPSDEFieldId(psWFDE2.getWFStepPSDEFId());
                        this.iPSDEFieldService.select(wfStepDEField, true);
                        if (StringUtils.hasLength((String)wfStepDEField.getPSCodeListId())) {
                            wfStepCodeList = new PSCodeListDTO();
                            wfStepCodeList.setPSCodeListId(wfStepDEField.getPSCodeListId());
                            this.iPSCodeListService.select(wfStepCodeList, true);
                        } else {
                            this.sendStudioConsole(true, 30000, String.format("\u5b9e\u4f53\u5c5e\u6027[%1$s|%2$s]\u6ca1\u6709\u6307\u5b9a\u6d41\u7a0b\u6b65\u9aa4\u4ee3\u7801\u8868\uff0c\u53ef\u80fd\u65e0\u6cd5\u6b63\u786e\u521d\u59cb\u5316\u76f8\u5173\u6d41\u7a0b\u89c6\u56fe", wfStepDEField.getPSDEName(), wfStepDEField.getPSDEFieldName()), false);
                        }
                    } else {
                        this.sendStudioConsole(true, 30000, String.format("\u5b9e\u4f53\u5de5\u4f5c\u6d41[%1$s|%2$s]\u6ca1\u6709\u6307\u5b9a\u6d41\u7a0b\u6b65\u9aa4\u5c5e\u6027\uff0c\u53ef\u80fd\u65e0\u6cd5\u6b63\u786e\u521d\u59cb\u5316\u76f8\u5173\u6d41\u7a0b\u89c6\u56fe", psWFDE2.getPSDEName(), psWFDE2.getPSWFName()), false);
                    }
                }
                PSDEFieldDTO udStateDEField = new PSDEFieldDTO();
                udStateDEField.setPSDEFieldId(psWFDE2.getStatePSDEFId());
                this.iPSDEFieldService.select(udStateDEField, true);
                if (StringUtils.hasLength((String)udStateDEField.getPSCodeListId())) {
                    udStateCodeList = new PSCodeListDTO();
                    udStateCodeList.setPSCodeListId(udStateDEField.getPSCodeListId());
                    this.iPSCodeListService.select(udStateCodeList, true);
                } else {
                    this.sendStudioConsole(true, 30000, String.format("\u5b9e\u4f53\u5c5e\u6027[%1$s|%2$s]\u6ca1\u6709\u6307\u5b9a\u6d41\u7a0b\u7528\u6237\u6570\u636e\u72b6\u6001\u4ee3\u7801\u8868\uff0c\u53ef\u80fd\u65e0\u6cd5\u6b63\u786e\u521d\u59cb\u5316\u76f8\u5173\u6d41\u7a0b\u89c6\u56fe", udStateDEField.getPSDEName(), udStateDEField.getPSDEFieldName()), false);
                }
                PSDEDRGroupDTO psDEDRGroup = new PSDEDRGroupDTO();
                psDEDRGroup.setPSDEDRGroupId(psDataEntity2.getPSDataEntityId());
                if (!this.iPSDEDRGroupService.get(psDEDRGroup, true)) {
                    psDEDRGroup.resetAll();
                    psDEDRGroup.setPSDEId(psDataEntity2.getPSDataEntityId());
                    if (!this.iPSDEDRGroupService.select(psDEDRGroup, true)) {
                        psDEDRGroup.setPSDEDRGroupId(psDataEntity2.getPSDataEntityId());
                        psDEDRGroup.setOrderValue(10000);
                        psDEDRGroup.setPSDEId(psDataEntity2.getPSDataEntityId());
                        psDEDRGroup.setPSDEDRGroupName("\u8be6\u7ec6\u4fe1\u606f");
                        this.iPSDEDRGroupService.create(psDEDRGroup);
                    }
                }
                PSSysPDTViewDTO stepDataListPSSysPDTView = new PSSysPDTViewDTO();
                String strPSSysPDTViewId = KeyValueUtils.genUniqueId((Object)psDataEntity2.getPSSystemId(), (Object)"WF_STEPDATALIST");
                stepDataListPSSysPDTView.setPSSysPDTViewId(strPSSysPDTViewId);
                if (!this.iPSSysPDTViewService.get(stepDataListPSSysPDTView, true)) {
                    stepDataListPSSysPDTView.resetAll();
                    stepDataListPSSysPDTView.setPSPDTViewId("WF_STEPDATALIST");
                    if (!this.iPSSysPDTViewService.select(stepDataListPSSysPDTView, true)) {
                        stepDataListPSSysPDTView = null;
                    }
                }
                PSSysPDTViewDTO stepActorListPSSysPDTView = new PSSysPDTViewDTO();
                String strPSSysPDTViewId2 = KeyValueUtils.genUniqueId((Object)psDataEntity2.getPSSystemId(), (Object)"WF_STEPACTORLIST");
                stepActorListPSSysPDTView.setPSSysPDTViewId(strPSSysPDTViewId2);
                if (!this.iPSSysPDTViewService.get(stepActorListPSSysPDTView, true)) {
                    stepActorListPSSysPDTView.resetAll();
                    stepActorListPSSysPDTView.setPSPDTViewId("WF_STEPACTORLIST");
                    if (!this.iPSSysPDTViewService.select(stepActorListPSSysPDTView, true)) {
                        stepActorListPSSysPDTView = null;
                    }
                }
                PSSysPDTViewDTO stepTraceChartPSSysPDTView = new PSSysPDTViewDTO();
                String strPSSysPDTViewId3 = KeyValueUtils.genUniqueId((Object)psDataEntity2.getPSSystemId(), (Object)"WF_STEPTRACECHART");
                stepTraceChartPSSysPDTView.setPSSysPDTViewId(strPSSysPDTViewId3);
                if (!this.iPSSysPDTViewService.get(stepTraceChartPSSysPDTView, true)) {
                    stepTraceChartPSSysPDTView.resetAll();
                    stepTraceChartPSSysPDTView.setPSPDTViewId("WF_STEPTRACECHART");
                    if (!this.iPSSysPDTViewService.select(stepTraceChartPSSysPDTView, true)) {
                        stepTraceChartPSSysPDTView = null;
                    }
                }
                PSDEDataRelationDTO psDEDataRelation = new PSDEDataRelationDTO();
                String strDEDataRelationId = KeyValueUtils.genUniqueId((Object)psDataEntity2.getPSDataEntityId(), (Object)psWFDE2.getPSWFId());
                psDEDataRelation.setPSDEDataRelationId(strDEDataRelationId);
                boolean bCreate = true;
                if (this.iPSDEDataRelationService.get(psDEDataRelation, true)) {
                    bCreate = false;
                    if (ObjectUtils.isEmpty((Object)psDEDataRelation.getPSWFDEId())) {
                        psDEDataRelation.setPSWFDEId(psWFDE2.getPSWFDEId());
                        psDEDataRelation.setDRTag(null);
                        this.iPSDEDataRelationService.update(psDEDataRelation);
                    }
                } else {
                    psDEDataRelation.resetAll();
                    ISearchContextDTO selectCond = this.iPSDEDataRelationService.createSearchContextDTO().eq("PSDEID", (Object)psDataEntity2.getPSDataEntityId()).eq("PSWFDEID", (Object)psWFDE2.getPSWFDEId()).nvl("DRTAG");
                    List<PSDEDataRelationDTO> list = this.iPSDEDataRelationService.select(selectCond);
                    if (!ObjectUtils.isEmpty((Object)list)) {
                        bCreate = false;
                        ((PSDEDataRelationDTO)list.get(0)).copyTo((IEntity)psDEDataRelation, true);
                    } else {
                        psDEDataRelation.resetAll();
                        psDEDataRelation.setCodeName(psWFDE2.getCodeName() + "DR");
                        psDEDataRelation.setPSDEId(psDataEntity2.getPSDataEntityId());
                        if (this.iPSDEDataRelationService.select(psDEDataRelation, true)) {
                            bCreate = false;
                            if (ObjectUtils.isEmpty((Object)psDEDataRelation.getPSWFDEId())) {
                                psDEDataRelation.setPSWFDEId(psWFDE2.getPSWFDEId());
                                psDEDataRelation.setDRTag(null);
                                this.iPSDEDataRelationService.update(psDEDataRelation);
                            }
                        }
                    }
                }
                if (bCreate) {
                    psDEDataRelation.setPSDEDataRelationId(strDEDataRelationId);
                    psDEDataRelation.setPSDEId(psDataEntity2.getPSDataEntityId());
                    psDEDataRelation.setPSDEDataRelationName(String.format("%1$s/%2$s\u5173\u7cfb\u754c\u9762\u7ec4", psDataEntity2.getLogicName(), psWFDE2.getPSWFName()));
                    psDEDataRelation.setCodeName(psWFDE2.getCodeName() + "DR");
                    psDEDataRelation.setPSWFDEId(psWFDE2.getPSWFDEId());
                    this.iPSDEDataRelationService.create(psDEDataRelation);
                    if (stepDataListPSSysPDTView != null) {
                        psDEDRDetail = new PSDEDRDetailDTO();
                        psDEDRDetail.setPSDEDRId(strDEDataRelationId);
                        psDEDRDetail.setPSDEDRDetailName("dritem1");
                        psDEDRDetail.setCaption("\u6d41\u7a0b\u5904\u7406");
                        psDEDRDetail.setDetailType(PSModelEnums.DEDRDetailType.PDTVIEW.value);
                        psDEDRDetail.setOrderValue(1000);
                        psDEDRDetail.setPSSysPDTViewId(stepDataListPSSysPDTView.getPSSysPDTViewId());
                        psDEDRDetail.setPSDEDRGroupId(psDEDRGroup.getPSDEDRGroupId());
                        this.iPSDEDRDetailService.create(psDEDRDetail);
                    }
                    if (stepActorListPSSysPDTView != null) {
                        psDEDRDetail = new PSDEDRDetailDTO();
                        psDEDRDetail.setPSDEDRId(strDEDataRelationId);
                        psDEDRDetail.setPSDEDRDetailName("dritem2");
                        psDEDRDetail.setCaption("\u6d41\u7a0b\u50ac\u529e");
                        psDEDRDetail.setDetailType(PSModelEnums.DEDRDetailType.PDTVIEW.value);
                        psDEDRDetail.setOrderValue(1100);
                        psDEDRDetail.setPSSysPDTViewId(stepActorListPSSysPDTView.getPSSysPDTViewId());
                        psDEDRDetail.setPSDEDRGroupId(psDEDRGroup.getPSDEDRGroupId());
                        this.iPSDEDRDetailService.create(psDEDRDetail);
                    }
                    if (stepTraceChartPSSysPDTView != null) {
                        psDEDRDetail = new PSDEDRDetailDTO();
                        psDEDRDetail.setPSDEDRId(strDEDataRelationId);
                        psDEDRDetail.setPSDEDRDetailName("dritem3");
                        psDEDRDetail.setCaption("\u6d41\u7a0b\u8ddf\u8e2a");
                        psDEDRDetail.setDetailType(PSModelEnums.DEDRDetailType.PDTVIEW.value);
                        psDEDRDetail.setOrderValue(1200);
                        psDEDRDetail.setPSSysPDTViewId(stepTraceChartPSSysPDTView.getPSSysPDTViewId());
                        psDEDRDetail.setPSDEDRGroupId(psDEDRGroup.getPSDEDRGroupId());
                        this.iPSDEDRDetailService.create(psDEDRDetail);
                    }
                }
                if (bEnableMob) {
                    psDEDataRelation = new PSDEDataRelationDTO();
                    strDEDataRelationId = KeyValueUtils.genUniqueId((Object)psDataEntity2.getPSDataEntityId(), (Object)psWFDE2.getPSWFId(), (Object)"MOB");
                    psDEDataRelation.setPSDEDataRelationId(strDEDataRelationId);
                    bCreate = true;
                    if (this.iPSDEDataRelationService.get(psDEDataRelation, true)) {
                        bCreate = false;
                        if (ObjectUtils.isEmpty((Object)psDEDataRelation.getPSWFDEId())) {
                            psDEDataRelation.setPSWFDEId(psWFDE2.getPSWFDEId());
                            psDEDataRelation.setDRTag("MOB");
                            this.iPSDEDataRelationService.update(psDEDataRelation);
                        }
                    } else {
                        psDEDataRelation.resetAll();
                        psDEDataRelation.setPSDEId(psDataEntity2.getPSDataEntityId());
                        psDEDataRelation.setPSWFDEId(psWFDE2.getPSWFDEId());
                        psDEDataRelation.setDRTag("MOB");
                        if (this.iPSDEDataRelationService.select(psDEDataRelation, true)) {
                            bCreate = false;
                        } else {
                            psDEDataRelation.resetAll();
                            psDEDataRelation.setCodeName(psWFDE2.getCodeName() + "MobDR");
                            psDEDataRelation.setPSDEId(psDataEntity2.getPSDataEntityId());
                            if (this.iPSDEDataRelationService.select(psDEDataRelation, true)) {
                                bCreate = false;
                                if (ObjectUtils.isEmpty((Object)psDEDataRelation.getPSWFDEId())) {
                                    psDEDataRelation.setPSWFDEId(psWFDE2.getPSWFDEId());
                                    psDEDataRelation.setDRTag("MOB");
                                    this.iPSDEDataRelationService.update(psDEDataRelation);
                                }
                            }
                        }
                    }
                    if (bCreate) {
                        psDEDataRelation.setPSDEDataRelationId(strDEDataRelationId);
                        psDEDataRelation.setPSDEId(psDataEntity2.getPSDataEntityId());
                        psDEDataRelation.setPSDEDataRelationName(String.format("%1$s/%2$s\u5173\u7cfb\u754c\u9762\u7ec4\uff08\u79fb\u52a8\u7aef\uff09", psDataEntity2.getLogicName(), psWFDE2.getPSWFName()));
                        psDEDataRelation.setCodeName(psWFDE2.getCodeName() + "MobDR");
                        psDEDataRelation.setPSWFDEId(psWFDE2.getPSWFDEId());
                        psDEDataRelation.setDRTag("MOB");
                        this.iPSDEDataRelationService.create(psDEDataRelation);
                        if (stepDataListPSSysPDTView != null) {
                            psDEDRDetail = new PSDEDRDetailDTO();
                            psDEDRDetail.setPSDEDRId(strDEDataRelationId);
                            psDEDRDetail.setPSDEDRDetailName("dritem1");
                            psDEDRDetail.setCaption("\u6d41\u7a0b\u5904\u7406");
                            psDEDRDetail.setDetailType(PSModelEnums.DEDRDetailType.PDTVIEW.value);
                            psDEDRDetail.setOrderValue(1000);
                            psDEDRDetail.setPSSysPDTViewId(stepDataListPSSysPDTView.getPSSysPDTViewId());
                            psDEDRDetail.setPSDEDRGroupId(psDEDRGroup.getPSDEDRGroupId());
                            this.iPSDEDRDetailService.create(psDEDRDetail);
                        }
                        if (stepActorListPSSysPDTView != null) {
                            psDEDRDetail = new PSDEDRDetailDTO();
                            psDEDRDetail.setPSDEDRId(strDEDataRelationId);
                            psDEDRDetail.setPSDEDRDetailName("dritem2");
                            psDEDRDetail.setCaption("\u6d41\u7a0b\u50ac\u529e");
                            psDEDRDetail.setDetailType(PSModelEnums.DEDRDetailType.PDTVIEW.value);
                            psDEDRDetail.setOrderValue(1100);
                            psDEDRDetail.setPSSysPDTViewId(stepActorListPSSysPDTView.getPSSysPDTViewId());
                            psDEDRDetail.setPSDEDRGroupId(psDEDRGroup.getPSDEDRGroupId());
                            this.iPSDEDRDetailService.create(psDEDRDetail);
                        }
                        if (stepTraceChartPSSysPDTView != null) {
                            psDEDRDetail = new PSDEDRDetailDTO();
                            psDEDRDetail.setPSDEDRId(strDEDataRelationId);
                            psDEDRDetail.setPSDEDRDetailName("dritem3");
                            psDEDRDetail.setCaption("\u6d41\u7a0b\u8ddf\u8e2a");
                            psDEDRDetail.setDetailType(PSModelEnums.DEDRDetailType.PDTVIEW.value);
                            psDEDRDetail.setOrderValue(1200);
                            psDEDRDetail.setPSSysPDTViewId(stepTraceChartPSSysPDTView.getPSSysPDTViewId());
                            psDEDRDetail.setPSDEDRGroupId(psDEDRGroup.getPSDEDRGroupId());
                            this.iPSDEDRDetailService.create(psDEDRDetail);
                        }
                    }
                }
                if (mfCodeList == null) break block53;
                List<PSCodeItemDTO> psCodeItems = mfCodeList.getPSCodeItems();
                for (PSCodeItemDTO psCodeItem : psCodeItems) {
                    PSViewTypeDTO psViewTypeStruct2;
                    for (String strViewType : initWFViewTypes) {
                        psViewTypeStruct2 = this.getPSViewType(strViewType);
                        this.doInitDEWFView(psDataEntity2, psCodeItem, psViewTypeStruct2, psWFDE2, wfStepCodeList, udStateCodeList, psWFVersionList);
                    }
                    if (!bEnableMob) continue;
                    for (String strViewType : initMobWFViewTypes) {
                        psViewTypeStruct2 = this.getPSViewType(strViewType);
                        this.doInitDEWFView(psDataEntity2, psCodeItem, psViewTypeStruct2, psWFDE2, wfStepCodeList, udStateCodeList, psWFVersionList);
                    }
                }
                break block54;
            }
            for (String strViewType : initWFViewTypes) {
                psViewTypeStruct = this.getPSViewType(strViewType);
                this.doInitDEWFView(psDataEntity2, null, psViewTypeStruct, psWFDE2, wfStepCodeList, udStateCodeList, psWFVersionList);
            }
            if (!bEnableMob) break block54;
            for (String strViewType : initMobWFViewTypes) {
                psViewTypeStruct = this.getPSViewType(strViewType);
                this.doInitDEWFView(psDataEntity2, null, psViewTypeStruct, psWFDE2, wfStepCodeList, udStateCodeList, psWFVersionList);
            }
        }
    }

    protected void doInitDEWFView(PSDataEntityDTO psDataEntity, PSCodeItemDTO mfCodeItem, PSViewTypeDTO psViewTypeStruct, PSWFDEDTO psWFDE, PSCodeListDTO wfStepCodeList, PSCodeListDTO udStateCodeList, List<PSWFVersionDTO> psWFVersionList) throws Throwable {
        boolean bWFServer;
        PSWorkflowDTO psWorkflow = new PSWorkflowDTO();
        psWorkflow.setPSWorkflowId(psWFDE.getPSWFId());
        if (!this.iPSWorkflowService.select(psWorkflow, false)) {
            throw new RuntimeException(String.format("\u672a\u627e\u5230\u5b9e\u4f53[%1$s]\u5bf9\u5e94\u7684\u5de5\u4f5c\u6d41", psDataEntity.getCodeName()));
        }
        if (psViewTypeStruct == null) {
            return;
        }
        boolean bDynaSys = DataTypeUtils.getBooleanValue((Object)psWorkflow.getEnableDynaSys(), (Boolean)false);
        int nWFProxyMode = DataTypeUtils.getIntegerValue((Object)psWFDE.getWFProxyMode(), (Integer)0);
        boolean bUseWFProxyApp = (nWFProxyMode & 1) == 1;
        boolean bl = bWFServer = nWFProxyMode != 1;
        if (bUseWFProxyApp) {
            bDynaSys = false;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEWFEXPVIEW", (boolean)true) == 0L) {
            PSDEViewBaseDTO srcPSDEViewBase = new PSDEViewBaseDTO();
            srcPSDEViewBase.set("pswfdeid", psWFDE.getPSWFDEId());
            srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
            if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
            }
            srcPSDEViewBase.setCodeName(String.format("%1$s_%2$s", psWFDE.getCodeName(), psViewTypeStruct.getCodeName()));
            srcPSDEViewBase.set("dyncmode", bDynaSys ? 1 : 0);
            this.doInitDEView(psDataEntity, psViewTypeStruct, psWorkflow.getPSWorkflowId(), "", srcPSDEViewBase, "", "");
            return;
        }
        String strMFCodeName = "";
        if (mfCodeItem != null && ObjectUtils.isEmpty((Object)(strMFCodeName = mfCodeItem.getCodeName()))) {
            strMFCodeName = mfCodeItem.getCodeItemValue();
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEWFGRIDVIEW", (boolean)true) == 0L) {
            PSDEViewBaseDTO srcPSDEViewBase;
            String strPDTParam;
            List<PSCodeItemDTO> psCodeItems;
            String strPDTParam2 = String.format("%1$s:D", psWFDE.getCodeName());
            strPDTParam2 = strPDTParam2.toUpperCase();
            PSDEViewBaseDTO srcPSDEViewBase2 = new PSDEViewBaseDTO();
            srcPSDEViewBase2.set("wfviewparam", 0);
            srcPSDEViewBase2.set("pswfdeid", psWFDE.getPSWFDEId());
            srcPSDEViewBase2.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
            if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                srcPSDEViewBase2.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
            }
            srcPSDEViewBase2.setCodeName(String.format("%1$s_D_%2$s", psWFDE.getCodeName(), psViewTypeStruct.getCodeName()));
            srcPSDEViewBase2.set("dyncmode", bDynaSys ? 1 : 0);
            this.doInitDEView(psDataEntity, psViewTypeStruct, psWorkflow.getPSWorkflowId(), "D", (PSDEViewBaseDTO)((Object)srcPSDEViewBase2), PSModelEnums.PredefinedViewType.WFMDATAVIEW.value, strPDTParam2);
            if (udStateCodeList != null && udStateCodeList.getPSCodeItems() != null) {
                psCodeItems = udStateCodeList.getPSCodeItems();
                for (PSCodeItemDTO psCodeItem : psCodeItems) {
                    strPDTParam = String.format("%1$s:D:%2$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue());
                    strPDTParam = strPDTParam.toUpperCase();
                    srcPSDEViewBase = new PSDEViewBaseDTO();
                    srcPSDEViewBase.set("wfviewparam", 0);
                    srcPSDEViewBase.set("pswfdeid", psWFDE.getPSWFDEId());
                    srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s:%4$s)", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName()));
                    if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                        srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s:%4$s)", psDataEntity.getLogicName(), psViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName()));
                    }
                    srcPSDEViewBase.setCodeName(String.format("%1$s_D%2$s_%3$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue(), psViewTypeStruct.getCodeName()));
                    srcPSDEViewBase.set("dyncmode", bDynaSys ? 1 : 0);
                    this.doInitDEView(psDataEntity, psViewTypeStruct, psWorkflow.getPSWorkflowId(), "D:" + psCodeItem.getCodeItemValue(), srcPSDEViewBase, PSModelEnums.PredefinedViewType.WFMDATAVIEW.value, strPDTParam);
                }
            }
            strPDTParam2 = String.format("%1$s:W", psWFDE.getCodeName());
            strPDTParam2 = strPDTParam2.toUpperCase();
            srcPSDEViewBase2 = new PSDEViewBaseDTO();
            srcPSDEViewBase2.set("wfviewparam", 1);
            srcPSDEViewBase2.set("pswfdeid", psWFDE.getPSWFDEId());
            srcPSDEViewBase2.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
            if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                srcPSDEViewBase2.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
            }
            srcPSDEViewBase2.setCodeName(String.format("%1$s_W_%2$s", psWFDE.getCodeName(), psViewTypeStruct.getCodeName()));
            srcPSDEViewBase2.set("dyncmode", bDynaSys ? 1 : 0);
            this.doInitDEView(psDataEntity, psViewTypeStruct, psWorkflow.getPSWorkflowId(), "W", (PSDEViewBaseDTO)((Object)srcPSDEViewBase2), PSModelEnums.PredefinedViewType.WFMDATAVIEW.value, strPDTParam2);
            if (wfStepCodeList != null && wfStepCodeList.getPSCodeItems() != null) {
                psCodeItems = wfStepCodeList.getPSCodeItems();
                for (PSCodeItemDTO psCodeItem : psCodeItems) {
                    strPDTParam = String.format("%1$s:W:%2$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue());
                    strPDTParam = strPDTParam.toUpperCase();
                    srcPSDEViewBase = new PSDEViewBaseDTO();
                    srcPSDEViewBase.set("wfviewparam", 1);
                    srcPSDEViewBase.set("wfviewparam3", psCodeItem.getCodeItemValue());
                    srcPSDEViewBase.set("pswfdeid", psWFDE.getPSWFDEId());
                    srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s:%4$s)", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName()));
                    if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                        srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s:%4$s)", psDataEntity.getLogicName(), psViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName()));
                    }
                    srcPSDEViewBase.setCodeName(String.format("%1$s_W%2$s_%3$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue(), psViewTypeStruct.getCodeName()));
                    this.doInitDEView(psDataEntity, psViewTypeStruct, psWorkflow.getPSWorkflowId(), "W:" + psCodeItem.getCodeItemValue(), srcPSDEViewBase, PSModelEnums.PredefinedViewType.WFMDATAVIEW.value, strPDTParam);
                }
            }
            return;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEWFEDITVIEW", (boolean)true) == 0L || DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEWFEDITVIEW2", (boolean)true) == 0L || DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEWFEDITVIEW3", (boolean)true) == 0L || DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEWFEDITVIEW4", (boolean)true) == 0L) {
            String strTag;
            PSDEViewBaseDTO srcPSDEViewBase;
            String strPDTParam;
            PSViewTypeDTO wfPSViewTypeStruct = psViewTypeStruct;
            if (StringUtils.hasLength((String)psWorkflow.getWFEditViewType())) {
                wfPSViewTypeStruct = this.getPSViewType(psWorkflow.getWFEditViewType());
            }
            String strPDTParam3 = String.format("%1$s:D", psWFDE.getCodeName());
            if (mfCodeItem != null) {
                strPDTParam3 = String.format("%1$s:%2$s", mfCodeItem.getCodeItemValue(), strPDTParam3);
            }
            strPDTParam3 = strPDTParam3.toUpperCase();
            PSDEViewBaseDTO srcPSDEViewBase3 = new PSDEViewBaseDTO();
            srcPSDEViewBase3.set("wfviewparam", 0);
            srcPSDEViewBase3.set("pswfdeid", psWFDE.getPSWFDEId());
            if (mfCodeItem != null) {
                srcPSDEViewBase3.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)(%4$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getPSViewTypeName(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName()));
                if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                    srcPSDEViewBase3.set("title", String.format("%1$s%2$s(%3$s)(%4$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getTitle(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName()));
                }
            } else {
                srcPSDEViewBase3.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
                if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                    srcPSDEViewBase3.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
                }
            }
            if (mfCodeItem != null) {
                srcPSDEViewBase3.setCodeName(String.format("%3$s_%1$s_D_%2$s", psWFDE.getCodeName(), wfPSViewTypeStruct.getCodeName(), strMFCodeName));
            } else {
                srcPSDEViewBase3.setCodeName(String.format("%1$s_D_%2$s", psWFDE.getCodeName(), wfPSViewTypeStruct.getCodeName()));
            }
            String strTag2 = "";
            strTag2 = mfCodeItem != null ? String.format("%1$s:D", mfCodeItem.getCodeItemValue()) : String.format("D", new Object[0]);
            srcPSDEViewBase3.set("dyncmode", bDynaSys ? 1 : 0);
            this.doInitDEView(psDataEntity, wfPSViewTypeStruct, psWorkflow.getPSWorkflowId(), strTag2, srcPSDEViewBase3, PSModelEnums.PredefinedViewType.WFEDITVIEW.value, strPDTParam3);
            if (bUseWFProxyApp) {
                PSViewTypeDTO wfPSViewTypeStruct2 = this.getPSViewType("DEWFEDITVIEW9");
                strPDTParam = String.format("%1$s:ED", psWFDE.getCodeName());
                if (mfCodeItem != null) {
                    strPDTParam = String.format("%1$s:%2$s", mfCodeItem.getCodeItemValue(), strPDTParam);
                }
                strPDTParam = strPDTParam.toUpperCase();
                srcPSDEViewBase = new PSDEViewBaseDTO();
                srcPSDEViewBase.set("wfviewparam", 0);
                srcPSDEViewBase.set("pswfdeid", psWFDE.getPSWFDEId());
                if (mfCodeItem != null) {
                    srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)(%4$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct2.getPSViewTypeName(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName()));
                    if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                        srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s)(%4$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct2.getTitle(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName()));
                    }
                } else {
                    srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct2.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
                    if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                        srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct2.getTitle(), psWorkflow.getPSWorkflowName()));
                    }
                }
                if (mfCodeItem != null) {
                    srcPSDEViewBase.setCodeName(String.format("%3$s_%1$s_ED_%2$s", psWFDE.getCodeName(), wfPSViewTypeStruct2.getCodeName(), strMFCodeName));
                } else {
                    srcPSDEViewBase.setCodeName(String.format("%1$s_ED_%2$s", psWFDE.getCodeName(), wfPSViewTypeStruct2.getCodeName()));
                }
                strTag = "";
                strTag = mfCodeItem != null ? String.format("%1$s:ED", mfCodeItem.getCodeItemValue()) : String.format("ED", new Object[0]);
                srcPSDEViewBase.set("dyncmode", bDynaSys ? 1 : 0);
                this.doInitDEView(psDataEntity, wfPSViewTypeStruct2, psWorkflow.getPSWorkflowId(), strTag, srcPSDEViewBase, PSModelEnums.PredefinedViewType.WFEDITVIEW.value, strPDTParam);
            }
            if (bWFServer && wfStepCodeList != null && wfStepCodeList.getPSCodeItems() != null) {
                for (PSWFVersionDTO psWFVersion : psWFVersionList) {
                    int nWFVersion = psWFVersion.getWFVersion();
                    HashMap<String, PSWFProcessDTO> psWFProcessMap = new HashMap<String, PSWFProcessDTO>();
                    ISearchContextDTO searchContextDTO = this.iPSWFProcessService.createSearchContextDTO().eq("PSWFVERSIONID", (Object)psWFVersion.getPSWFVersionId()).all().count(false);
                    List<PSWFProcessDTO> psWFProcessList = this.iPSWFProcessService.rawSelect(searchContextDTO);
                    if (!ObjectUtils.isEmpty((Object)psWFProcessList)) {
                        for (PSWFProcessDTO psWFProcess2 : psWFProcessList) {
                            if (!StringUtils.hasLength((String)psWFProcess2.getWFStepValue())) continue;
                            psWFProcessMap.put(psWFProcess2.getWFStepValue(), psWFProcess2);
                        }
                    }
                    List<PSCodeItemDTO> psCodeItems = wfStepCodeList.getPSCodeItems();
                    Iterator<PSCodeItemDTO> iterator = psCodeItems.iterator();
                    while (iterator.hasNext()) {
                        PSCodeItemDTO psCodeItem = iterator.next();
                        PSWFProcessDTO psWFProcess3 = psWFProcessMap.get(psCodeItem.getCodeItemValue());
                        if (psWFProcess3 == null) continue;
                        PSViewTypeDTO wfProcPSViewTypeStruct = wfPSViewTypeStruct;
                        if (StringUtils.hasLength((String)psWFProcess3.getWFEditViewType())) {
                            wfProcPSViewTypeStruct = this.getPSViewType(psWFProcess3.getWFEditViewType());
                        }
                        String strPDTParam4 = String.format("%1$s:%3$sW:%2$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue(), nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion));
                        if (mfCodeItem != null) {
                            strPDTParam4 = String.format("%1$s:%2$s", mfCodeItem.getCodeItemValue(), strPDTParam4);
                        }
                        strPDTParam4 = strPDTParam4.toUpperCase();
                        PSDEViewBaseDTO srcPSDEViewBase4 = new PSDEViewBaseDTO();
                        srcPSDEViewBase4.set("wfviewparam", 1);
                        srcPSDEViewBase4.set("wfviewparam3", psCodeItem.getCodeItemValue());
                        srcPSDEViewBase4.set("pswfdeid", psWFDE.getPSWFDEId());
                        srcPSDEViewBase4.set("pswfversionid", psWFVersion.getPSWFVersionId());
                        srcPSDEViewBase4.set("pswfversionname", psWFVersion.getPSWFVersionName());
                        if (mfCodeItem != null) {
                            srcPSDEViewBase4.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)(%4$sv%6$s:%5$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getPSViewTypeName(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName(), nWFVersion));
                            if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                                srcPSDEViewBase4.set("title", String.format("%1$s%2$s(%3$s)(%4$sv%6$s:%5$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getTitle(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName(), nWFVersion));
                            }
                        } else {
                            srcPSDEViewBase4.setPSDEViewBaseName(String.format("%1$s%2$s(%3$sv%5$s:%4$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName(), nWFVersion));
                            if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                                srcPSDEViewBase4.set("title", String.format("%1$s%2$s(%3$sv%5$s:%4$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName(), nWFVersion));
                            }
                        }
                        if (mfCodeItem != null) {
                            srcPSDEViewBase4.setCodeName(String.format("%4$s_%1$s_%5$sW%2$s_%3$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue(), wfProcPSViewTypeStruct.getCodeName(), strMFCodeName, nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion)));
                        } else {
                            srcPSDEViewBase4.setCodeName(String.format("%1$s_%4$sW%2$s_%3$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue(), wfProcPSViewTypeStruct.getCodeName(), nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion)));
                        }
                        String strTag3 = "";
                        strTag3 = mfCodeItem != null ? String.format("%1$s:%3$sD:%2$s", mfCodeItem.getCodeItemValue(), psCodeItem.getCodeItemValue(), nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion)) : String.format("%2$sW:%1$s", psCodeItem.getCodeItemValue(), nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion));
                        PSDEViewBaseDTO psDEViewBase = this.doInitDEView(psDataEntity, wfProcPSViewTypeStruct, psWorkflow.getPSWorkflowId(), strTag3, srcPSDEViewBase4, PSModelEnums.PredefinedViewType.WFEDITVIEW.value, strPDTParam4);
                        if (psDEViewBase == null || psWFProcess3 == null || !StringUtils.hasLength((String)psWFProcess3.getPSDEFormId())) continue;
                        PSDEViewCtrlDTO psDEViewCtrl = new PSDEViewCtrlDTO();
                        psDEViewCtrl.setPSDEViewBaseId(psDEViewBase.getPSDEViewBaseId());
                        psDEViewCtrl.setPSDEViewCtrlType(CTRLTYPE_FORM);
                        if (!this.iPSDEViewCtrlService.select(psDEViewCtrl, true) || DataTypeUtils.compare((String)psWFProcess3.getPSDEFormId(), (String)psDEViewCtrl.getPSDEFormId(), (boolean)false) == 0L) continue;
                        psDEViewCtrl.setPSDEFormId(psWFProcess3.getPSDEFormId());
                        psDEViewCtrl.setPSDEFormName(psWFProcess3.getPSDEFormName());
                        this.iPSDEViewCtrlService.update(psDEViewCtrl);
                    }
                }
            } else if (bUseWFProxyApp) {
                PSViewTypeDTO wfProcPSViewTypeStruct = wfPSViewTypeStruct;
                strPDTParam = String.format("%1$s:W", psWFDE.getCodeName());
                strPDTParam = strPDTParam.toUpperCase();
                srcPSDEViewBase = new PSDEViewBaseDTO();
                srcPSDEViewBase.set("wfviewparam", 1);
                srcPSDEViewBase.set("pswfdeid", psWFDE.getPSWFDEId());
                srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
                if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                    srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
                }
                srcPSDEViewBase.setCodeName(String.format("%1$s_W_%2$s", psWFDE.getCodeName(), wfProcPSViewTypeStruct.getCodeName()));
                strTag = "W";
                srcPSDEViewBase.set("dyncmode", bDynaSys ? 1 : 0);
                PSDEViewBaseDTO searchContextDTO = this.doInitDEView(psDataEntity, wfProcPSViewTypeStruct, psWorkflow.getPSWorkflowId(), strTag, srcPSDEViewBase, PSModelEnums.PredefinedViewType.WFEDITVIEW.value, strPDTParam);
            } else if (bDynaSys && psWFVersionList.size() > 0) {
                PSWFVersionDTO psWFVersion = psWFVersionList.get(0);
                PSViewTypeDTO wfProcPSViewTypeStruct = wfPSViewTypeStruct;
                String strPDTParam5 = String.format("%1$s:W", psWFDE.getCodeName());
                strPDTParam5 = strPDTParam5.toUpperCase();
                PSDEViewBaseDTO srcPSDEViewBase5 = new PSDEViewBaseDTO();
                srcPSDEViewBase5.set("wfviewparam", 1);
                srcPSDEViewBase5.set("pswfdeid", psWFDE.getPSWFDEId());
                srcPSDEViewBase5.set("pswfversionid", psWFVersion.getPSWFVersionId());
                srcPSDEViewBase5.set("pswfversionname", psWFVersion.getPSWFVersionName());
                srcPSDEViewBase5.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
                if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                    srcPSDEViewBase5.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
                }
                srcPSDEViewBase5.setCodeName(String.format("%1$s_W_%2$s", psWFDE.getCodeName(), wfProcPSViewTypeStruct.getCodeName()));
                String strTag4 = "W";
                srcPSDEViewBase5.set("dyncmode", bDynaSys ? 1 : 0);
                PSDEViewBaseDTO psWFProcessList = this.doInitDEView(psDataEntity, wfProcPSViewTypeStruct, psWorkflow.getPSWorkflowId(), strTag4, srcPSDEViewBase5, PSModelEnums.PredefinedViewType.WFEDITVIEW.value, strPDTParam5);
            }
            return;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBWFMDVIEW", (boolean)true) == 0L) {
            String strPDTParam = String.format("%1$s:D", psWFDE.getCodeName());
            strPDTParam = strPDTParam.toUpperCase();
            PSDEViewBaseDTO srcPSDEViewBase = new PSDEViewBaseDTO();
            srcPSDEViewBase.set("wfviewparam", 0);
            srcPSDEViewBase.set("pswfdeid", psWFDE.getPSWFDEId());
            srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
            if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
            }
            srcPSDEViewBase.setCodeName(String.format("%1$s_D_%2$s", psWFDE.getCodeName(), psViewTypeStruct.getCodeName()));
            srcPSDEViewBase.set("dyncmode", bDynaSys ? 1 : 0);
            this.doInitDEView(psDataEntity, psViewTypeStruct, psWorkflow.getPSWorkflowId(), "D", srcPSDEViewBase, PSModelEnums.PredefinedViewType.MOBWFMDATAVIEW.value, strPDTParam);
            strPDTParam = String.format("%1$s:W", psWFDE.getCodeName());
            strPDTParam = strPDTParam.toUpperCase();
            srcPSDEViewBase = new PSDEViewBaseDTO();
            srcPSDEViewBase.set("wfviewparam", 1);
            srcPSDEViewBase.set("pswfdeid", psWFDE.getPSWFDEId());
            srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
            if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), psViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
            }
            srcPSDEViewBase.setCodeName(String.format("%1$s_W_%2$s", psWFDE.getCodeName(), psViewTypeStruct.getCodeName()));
            srcPSDEViewBase.set("dyncmode", bDynaSys ? 1 : 0);
            this.doInitDEView(psDataEntity, psViewTypeStruct, psWorkflow.getPSWorkflowId(), "W", srcPSDEViewBase, PSModelEnums.PredefinedViewType.MOBWFMDATAVIEW.value, strPDTParam);
            return;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBWFEDITVIEW", (boolean)true) == 0L || DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBWFEDITVIEW2", (boolean)true) == 0L || DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBWFEDITVIEW3", (boolean)true) == 0L || DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBWFEDITVIEW4", (boolean)true) == 0L) {
            PSViewTypeDTO wfPSViewTypeStruct = psViewTypeStruct;
            if (StringUtils.hasLength((String)psWorkflow.getMobWFEditViewType())) {
                wfPSViewTypeStruct = this.getPSViewType(psWorkflow.getMobWFEditViewType());
            }
            Object strPDTParam = String.format("%1$s:D", psWFDE.getCodeName());
            if (mfCodeItem != null) {
                strPDTParam = String.format("%1$s:%2$s", mfCodeItem.getCodeItemValue(), strPDTParam);
            }
            strPDTParam = ((String)strPDTParam).toUpperCase();
            PSDEViewBaseDTO srcPSDEViewBase = new PSDEViewBaseDTO();
            srcPSDEViewBase.set("wfviewparam", 0);
            srcPSDEViewBase.set("pswfdeid", psWFDE.getPSWFDEId());
            if (mfCodeItem != null) {
                srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)(%4$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getPSViewTypeName(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName()));
                if (StringUtils.hasLength((String)wfPSViewTypeStruct.getTitle())) {
                    srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s)(%4$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getTitle(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName()));
                }
            } else {
                srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
                if (StringUtils.hasLength((String)wfPSViewTypeStruct.getTitle())) {
                    srcPSDEViewBase.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
                }
            }
            if (mfCodeItem != null) {
                srcPSDEViewBase.setCodeName(String.format("%3$s_%1$s_D_%2$s", psWFDE.getCodeName(), wfPSViewTypeStruct.getCodeName(), strMFCodeName));
            } else {
                srcPSDEViewBase.setCodeName(String.format("%1$s_D_%2$s", psWFDE.getCodeName(), wfPSViewTypeStruct.getCodeName()));
            }
            String strTag = "";
            strTag = mfCodeItem != null ? String.format("%1$s:D", mfCodeItem.getCodeItemValue()) : String.format("D", new Object[0]);
            this.doInitDEView(psDataEntity, wfPSViewTypeStruct, psWorkflow.getPSWorkflowId(), strTag, srcPSDEViewBase, PSModelEnums.PredefinedViewType.MOBWFEDITVIEW.value, (String)strPDTParam);
            if (wfStepCodeList != null && wfStepCodeList.getPSCodeItems() != null) {
                for (PSWFVersionDTO psWFVersion : psWFVersionList) {
                    int nWFVersion = psWFVersion.getWFVersion();
                    HashMap<String, PSWFProcessDTO> psWFProcessMap = new HashMap<String, PSWFProcessDTO>();
                    ISearchContextDTO searchContextDTO = this.iPSWFProcessService.createSearchContextDTO().eq("PSWFVERSIONID", (Object)psWFVersion.getPSWFVersionId()).all();
                    List<PSWFProcessDTO> psWFProcessList = this.iPSWFProcessService.select(searchContextDTO);
                    if (!ObjectUtils.isEmpty((Object)psWFProcessList)) {
                        for (PSWFProcessDTO psWFProcess : psWFProcessList) {
                            if (!StringUtils.hasLength((String)psWFProcess.getWFStepValue())) continue;
                            psWFProcessMap.put(psWFProcess.getWFStepValue(), psWFProcess);
                        }
                    }
                    List<PSCodeItemDTO> psCodeItems = wfStepCodeList.getPSCodeItems();
                    Iterator<PSCodeItemDTO> iterator = psCodeItems.iterator();
                    while (iterator.hasNext()) {
                        PSCodeItemDTO psCodeItem = (PSCodeItemDTO)((Object)iterator.next());
                        PSWFProcessDTO psWFProcess = (PSWFProcessDTO)((Object)psWFProcessMap.get(psCodeItem.getCodeItemValue()));
                        if (psWFProcess == null) continue;
                        String strPDTParam6 = String.format("%1$s:%3$sW:%2$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue(), nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion));
                        if (mfCodeItem != null) {
                            strPDTParam6 = String.format("%1$s:%2$s", mfCodeItem.getCodeItemValue(), strPDTParam6);
                        }
                        strPDTParam6 = strPDTParam6.toUpperCase();
                        PSDEViewBaseDTO srcPSDEViewBase6 = new PSDEViewBaseDTO();
                        srcPSDEViewBase6.set("wfviewparam", 1);
                        srcPSDEViewBase6.set("wfviewparam3", psCodeItem.getCodeItemValue());
                        srcPSDEViewBase6.set("pswfdeid", psWFDE.getPSWFDEId());
                        srcPSDEViewBase6.set("pswfversionid", psWFVersion.getPSWFVersionId());
                        srcPSDEViewBase6.set("pswfversionname", psWFVersion.getPSWFVersionName());
                        if (mfCodeItem != null) {
                            srcPSDEViewBase6.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)(%4$sv%6$s:%5$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getPSViewTypeName(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName(), nWFVersion));
                            if (StringUtils.hasLength((String)wfPSViewTypeStruct.getTitle())) {
                                srcPSDEViewBase6.set("title", String.format("%1$s%2$s(%3$s)(%4$sv%6$s:%5$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getTitle(), mfCodeItem.getPSCodeItemName(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName(), nWFVersion));
                            }
                        } else {
                            srcPSDEViewBase6.setPSDEViewBaseName(String.format("%1$s%2$s(%3$sv%5$s:%4$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName(), nWFVersion));
                            if (StringUtils.hasLength((String)wfPSViewTypeStruct.getTitle())) {
                                srcPSDEViewBase6.set("title", String.format("%1$s%2$s(%3$sv%5$s:%4$s)", psDataEntity.getLogicName(), wfPSViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName(), psCodeItem.getPSCodeItemName(), nWFVersion));
                            }
                        }
                        if (mfCodeItem != null) {
                            srcPSDEViewBase6.setCodeName(String.format("%4$s_%1$s_%5$sW%2$s_%3$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue(), wfPSViewTypeStruct.getCodeName(), strMFCodeName, nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion)));
                        } else {
                            srcPSDEViewBase6.setCodeName(String.format("%1$s_%4$sW%2$s_%3$s", psWFDE.getCodeName(), psCodeItem.getCodeItemValue(), wfPSViewTypeStruct.getCodeName(), nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion)));
                        }
                        String strTag5 = "";
                        strTag5 = mfCodeItem != null ? String.format("%1$s:%3$sD:%2$s", mfCodeItem.getCodeItemValue(), psCodeItem.getCodeItemValue(), nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion)) : String.format("%2$sW:%1$s", psCodeItem.getCodeItemValue(), nWFVersion == 1 ? "" : Integer.valueOf(nWFVersion));
                        PSDEViewBaseDTO psDEViewBase = this.doInitDEView(psDataEntity, wfPSViewTypeStruct, psWorkflow.getPSWorkflowId(), strTag5, srcPSDEViewBase6, PSModelEnums.PredefinedViewType.MOBWFEDITVIEW.value, strPDTParam6);
                        if (psDEViewBase == null || psWFProcess == null || !StringUtils.hasLength((String)psWFProcess.getMobPSDEFormId())) continue;
                        PSDEViewCtrlDTO psDEViewCtrl = new PSDEViewCtrlDTO();
                        psDEViewCtrl.setPSDEViewBaseId(psDEViewBase.getPSDEViewBaseId());
                        psDEViewCtrl.setPSDEViewCtrlType(CTRLTYPE_FORM);
                        if (!this.iPSDEViewCtrlService.select(psDEViewCtrl, true) || DataTypeUtils.compare((String)psWFProcess.getMobPSDEFormId(), (String)psDEViewCtrl.getPSDEFormId(), (boolean)false) == 0L) continue;
                        psDEViewCtrl.setPSDEFormId(psWFProcess.getMobPSDEFormId());
                        psDEViewCtrl.setPSDEFormName(psWFProcess.getMobPSDEFormName());
                        this.iPSDEViewCtrlService.update(psDEViewCtrl);
                    }
                }
            } else if (bDynaSys && psWFVersionList.size() > 0) {
                PSWFVersionDTO psWFVersion = psWFVersionList.get(0);
                PSViewTypeDTO wfProcPSViewTypeStruct = wfPSViewTypeStruct;
                String strPDTParam7 = String.format("%1$s:W", psWFDE.getCodeName());
                strPDTParam7 = strPDTParam7.toUpperCase();
                PSDEViewBaseDTO srcPSDEViewBase7 = new PSDEViewBaseDTO();
                srcPSDEViewBase7.set("wfviewparam", 1);
                srcPSDEViewBase7.set("pswfdeid", psWFDE.getPSWFDEId());
                srcPSDEViewBase7.set("pswfversionid", psWFVersion.getPSWFVersionId());
                srcPSDEViewBase7.set("pswfversionname", psWFVersion.getPSWFVersionName());
                srcPSDEViewBase7.setPSDEViewBaseName(String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getPSViewTypeName(), psWorkflow.getPSWorkflowName()));
                if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                    srcPSDEViewBase7.set("title", String.format("%1$s%2$s(%3$s)", psDataEntity.getLogicName(), wfProcPSViewTypeStruct.getTitle(), psWorkflow.getPSWorkflowName()));
                }
                srcPSDEViewBase7.setCodeName(String.format("%1$s_W_%2$s", psWFDE.getCodeName(), wfProcPSViewTypeStruct.getCodeName()));
                String strTag6 = "W";
                srcPSDEViewBase7.set("dyncmode", bDynaSys ? 1 : 0);
                PSDEViewBaseDTO pSDEViewBaseDTO = this.doInitDEView(psDataEntity, wfProcPSViewTypeStruct, psWorkflow.getPSWorkflowId(), strTag6, srcPSDEViewBase7, PSModelEnums.PredefinedViewType.MOBWFEDITVIEW.value, strPDTParam7);
            }
            return;
        }
    }

    protected void doInitDEView(PSDataEntityDTO psDataEntity, PSViewTypeDTO psViewTypeStruct) throws Throwable {
        PSDEViewBaseDTO srcPSDEViewBase;
        String strIndexMode;
        if (psViewTypeStruct == null) {
            return;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEINDEXPICKUPDATAVIEW", (boolean)true) == 0L) {
            String strIndexMode2 = psDataEntity.getIndexDEType();
            if (StringUtils.hasLength((String)strIndexMode2)) {
                this.doInitDEView(psDataEntity, psViewTypeStruct, "INDEXDETYPE", strIndexMode2, null, null, null);
            }
            return;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEFORMPICKUPDATAVIEW", (boolean)true) == 0L) {
            if (DataTypeUtils.getIntegerValue((Object)psDataEntity.getEnaMultiForm(), (Integer)0) > 0) {
                this.doInitDEView(psDataEntity, psViewTypeStruct, "FORMTYPE", "", null, null, null);
            }
            return;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBINDEXPICKUPMDVIEW", (boolean)true) == 0L) {
            String strIndexMode3 = psDataEntity.getIndexDEType();
            if (StringUtils.hasLength((String)strIndexMode3)) {
                this.doInitDEView(psDataEntity, psViewTypeStruct, "INDEXDETYPE", strIndexMode3, null, null, null);
            }
            return;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBFORMPICKUPMDVIEW", (boolean)true) == 0L) {
            if (DataTypeUtils.getIntegerValue((Object)psDataEntity.getEnaMultiForm(), (Integer)0) > 0) {
                this.doInitDEView(psDataEntity, psViewTypeStruct, "FORMTYPE", "", null, null, null);
            }
            return;
        }
        String strPredefineType = "";
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEREDIRECTVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.REDIRECTVIEW.value;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEEDITVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.EDITVIEW.value;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEGRIDVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.MDATAVIEW.value;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEPICKUPVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.PICKUPVIEW.value;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMPICKUPVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.MPICKUPVIEW.value;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBREDIRECTVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.MOBREDIRECTVIEW.value;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBEDITVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.MOBEDITVIEW.value;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBMDVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.MOBMDATAVIEW.value;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBPICKUPVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.MOBPICKUPVIEW.value;
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBMPICKUPVIEW", (boolean)true) == 0L) {
            strPredefineType = PSModelEnums.PredefinedViewType.MOBMPICKUPVIEW.value;
        }
        this.doInitDEView(psDataEntity, psViewTypeStruct, "", "", null, strPredefineType, null);
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEPICKUPVIEW", (boolean)true) == 0L) {
            strIndexMode = psDataEntity.getIndexDEType();
            if (StringUtils.hasLength((String)strIndexMode)) {
                srcPSDEViewBase = new PSDEViewBaseDTO();
                srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s(\u7d22\u5f15\u5b9e\u4f53)%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName()));
                if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                    srcPSDEViewBase.set("title", String.format("%1$s%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getTitle()));
                }
                srcPSDEViewBase.setCodeName("Index" + psViewTypeStruct.getCodeName());
                this.doInitDEView(psDataEntity, psViewTypeStruct, "INDEXDETYPE", strIndexMode, srcPSDEViewBase, PSModelEnums.PredefinedViewType.INDEXDEPICKUPVIEW.value, null);
            }
            if (DataTypeUtils.getIntegerValue((Object)psDataEntity.getEnaMultiForm(), (Integer)0) > 0) {
                srcPSDEViewBase = new PSDEViewBaseDTO();
                srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s(\u8868\u5355\u7c7b\u578b)%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName()));
                if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                    srcPSDEViewBase.set("title", String.format("%1$s%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getTitle()));
                }
                srcPSDEViewBase.setCodeName("Form" + psViewTypeStruct.getCodeName());
                this.doInitDEView(psDataEntity, psViewTypeStruct, "FORMTYPE", "", srcPSDEViewBase, PSModelEnums.PredefinedViewType.FORMPICKUPVIEW.value, null);
            }
        }
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMOBPICKUPVIEW", (boolean)true) == 0L) {
            strIndexMode = psDataEntity.getIndexDEType();
            if (StringUtils.hasLength((String)strIndexMode)) {
                srcPSDEViewBase = new PSDEViewBaseDTO();
                srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s(\u7d22\u5f15\u5b9e\u4f53)%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName()));
                if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                    srcPSDEViewBase.set("title", String.format("%1$s%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getTitle()));
                }
                srcPSDEViewBase.setCodeName("MobIndex" + psViewTypeStruct.getCodeName());
                this.doInitDEView(psDataEntity, psViewTypeStruct, "INDEXDETYPE", strIndexMode, srcPSDEViewBase, PSModelEnums.PredefinedViewType.MOBINDEXDEPICKUPVIEW.value, null);
            }
            if (DataTypeUtils.getIntegerValue((Object)psDataEntity.getEnaMultiForm(), (Integer)0) > 0) {
                srcPSDEViewBase = new PSDEViewBaseDTO();
                srcPSDEViewBase.setPSDEViewBaseName(String.format("%1$s(\u8868\u5355\u7c7b\u578b)%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName()));
                if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                    srcPSDEViewBase.set("title", String.format("%1$s%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getTitle()));
                }
                srcPSDEViewBase.setCodeName("MobForm" + psViewTypeStruct.getCodeName());
                this.doInitDEView(psDataEntity, psViewTypeStruct, "FORMTYPE", "", srcPSDEViewBase, PSModelEnums.PredefinedViewType.MOBFORMPICKUPVIEW.value, null);
            }
        }
    }

    protected PSDEViewBaseDTO doInitDEView(PSDataEntityDTO psDataEntity, PSViewTypeDTO psViewTypeStruct, String strSubTypeId, String strTag, PSDEViewBaseDTO srcPSDEViewBase, String strPredefineType, String strPDTParam) throws Throwable {
        PSDEViewBaseDTO psDEViewBase = new PSDEViewBaseDTO();
        boolean bCreateView = false;
        String strDEViewId = "";
        strDEViewId = ObjectUtils.isEmpty((Object)strSubTypeId) ? KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)psViewTypeStruct.getPSViewTypeId()) : KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)psViewTypeStruct.getPSViewTypeId(), (Object)strSubTypeId, (Object)strTag);
        psDEViewBase.setPSDEViewBaseId(strDEViewId);
        if (this.iPSDEViewBaseService.get(psDEViewBase, true)) {
            if (StringUtils.hasLength((String)strSubTypeId)) {
                if (ObjectUtils.isEmpty((Object)psDEViewBase.getDEViewTag3())) {
                    psDEViewBase.setDEViewTag3(strSubTypeId);
                    psDEViewBase.setDEViewTag4(strTag);
                    this.iPSDEViewBaseService.update(psDEViewBase);
                }
            } else if (StringUtils.hasLength((String)psDEViewBase.getDEViewTag3())) {
                psDEViewBase.setDEViewTag3(strSubTypeId);
                psDEViewBase.setDEViewTag4(strTag);
                this.iPSDEViewBaseService.update(psDEViewBase);
            }
        } else {
            psDEViewBase.resetAll();
            ISearchContextDTO selectCond = this.iPSDEViewBaseService.createSearchContextDTO().eq("PSDEID", (Object)psDataEntity.getPSDataEntityId()).eq("PSDEVIEWBASETYPE", (Object)psViewTypeStruct.getPSViewTypeId());
            if (ObjectUtils.isEmpty((Object)strSubTypeId)) {
                selectCond.nvl("DEVIEWTAG3");
                selectCond.nvl("DEVIEWTAG4");
            } else {
                selectCond.eq("DEVIEWTAG3", (Object)strSubTypeId);
                if (StringUtils.hasLength((String)strTag)) {
                    selectCond.eq("DEVIEWTAG4", (Object)strTag);
                } else {
                    selectCond.nvl("DEVIEWTAG4");
                }
            }
            List<PSDEViewBaseDTO> list = this.iPSDEViewBaseService.select(selectCond);
            if (ObjectUtils.isEmpty((Object)list)) {
                String strCodeName = psViewTypeStruct.getCodeName();
                if (srcPSDEViewBase != null && StringUtils.hasLength((String)srcPSDEViewBase.getCodeName())) {
                    strCodeName = srcPSDEViewBase.getCodeName();
                }
                if (StringUtils.hasLength((String)strCodeName)) {
                    psDEViewBase.resetAll();
                    psDEViewBase.setPSDEId(psDataEntity.getPSDataEntityId());
                    psDEViewBase.setPSDEViewBaseType(psViewTypeStruct.getPSViewTypeId());
                    psDEViewBase.setCodeName(strCodeName);
                    if (this.iPSDEViewBaseService.select(psDEViewBase, true)) {
                        return psDEViewBase;
                    }
                }
                psDEViewBase.resetAll();
                psDEViewBase.setPSDEViewBaseId(strDEViewId);
                bCreateView = true;
            } else {
                return (PSDEViewBaseDTO)((Object)list.get(0));
            }
        }
        if (bCreateView) {
            List<PSVTRVDTO> psViewTypeViews;
            PSDEViewBaseDTO psDEViewBase2;
            psDEViewBase.setPSSystemId(psDataEntity.getPSSystemId());
            psDEViewBase.setPSDEId(psDataEntity.getPSDataEntityId());
            psDEViewBase.setPSDEName(psDataEntity.getPSDataEntityName());
            psDEViewBase.setPSDEViewBaseName(String.format("%1$s%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getPSViewTypeName()));
            if (StringUtils.hasLength((String)psViewTypeStruct.getTitle())) {
                psDEViewBase.setTitle(String.format("%1$s%2$s", psDataEntity.getLogicName(), psViewTypeStruct.getTitle()));
            }
            psDEViewBase.setPSDEViewBaseType(psViewTypeStruct.getPSViewTypeId());
            psDEViewBase.setCodeName(psViewTypeStruct.getCodeName());
            if (srcPSDEViewBase != null) {
                srcPSDEViewBase.copyTo((IEntity)psDEViewBase, false);
            }
            String strCodeName = psDEViewBase.getCodeName();
            int nViewIndex = 1;
            do {
                if (nViewIndex > 1) {
                    strCodeName = String.format("Usr%1$s%2$s", nViewIndex == 1 ? "" : Integer.valueOf(nViewIndex), psDEViewBase.getCodeName());
                }
                ++nViewIndex;
                psDEViewBase2 = new PSDEViewBaseDTO();
                psDEViewBase2.setPSDEId(psDataEntity.getPSDataEntityId());
                psDEViewBase2.setCodeName(strCodeName);
            } while (this.iPSDEViewBaseService.select(psDEViewBase2, true));
            psDEViewBase.setCodeName(strCodeName);
            if (StringUtils.hasLength((String)strPredefineType)) {
                PSDEViewBaseDTO predefineDEViewBase = new PSDEViewBaseDTO();
                predefineDEViewBase.setPSDEId(psDataEntity.getPSDataEntityId());
                predefineDEViewBase.setPredefinedViewType(strPredefineType);
                if (StringUtils.hasLength((String)strPDTParam)) {
                    predefineDEViewBase.setPDVTParam(strPDTParam);
                }
                if (!this.iPSDEViewBaseService.select(predefineDEViewBase, true)) {
                    psDEViewBase.setPredefinedViewType(strPredefineType);
                    psDEViewBase.setPDVTParam(strPDTParam);
                }
            }
            psDEViewBase.setDEViewTag3(strSubTypeId);
            psDEViewBase.setDEViewTag4(strTag);
            try {
                this.iPSDEViewBaseService.create(psDEViewBase);
            }
            catch (Exception ex) {
                throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u89c6\u56fe[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEViewBase.getPSDEViewBaseName(), ex.getMessage()), ex);
            }
            PSSystemDTO psSystem = this.getCurrentPSSystemDTO();
            List<PSVTCtrlDTO> psViewTypeCtrls = psViewTypeStruct.getPSVTCtrls();
            if (psViewTypeCtrls != null) {
                for (PSVTCtrlDTO psVTCtrl : psViewTypeCtrls) {
                    if (!DataTypeUtils.getBooleanValue((Object)psVTCtrl.getValidFlag(), (Boolean)true).booleanValue()) continue;
                    try {
                        this.doInitDEViewCtrl(psSystem, psDataEntity, psViewTypeStruct, psDEViewBase, psVTCtrl, strSubTypeId, strTag);
                    }
                    catch (Exception ex) {
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u89c6\u56fe[%1$s]\u90e8\u4ef6[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", psDEViewBase.getPSDEViewBaseName(), psVTCtrl.getPSVTCtrlName(), ex.getMessage()), ex);
                    }
                }
            }
            if ((psViewTypeViews = (List)psViewTypeStruct.get("PSVTRVs")) != null) {
                for (PSVTRVDTO psVTRV : psViewTypeViews) {
                    if (!DataTypeUtils.getBooleanValue((Object)psVTRV.getValidFlag(), (Boolean)true).booleanValue() || !DataTypeUtils.getBooleanValue((Object)psVTRV.getDefaultFlag(), (Boolean)true).booleanValue()) continue;
                    try {
                        this.doInitDEViewRV(psSystem, psDataEntity, psViewTypeStruct, psDEViewBase, psVTRV, strSubTypeId, strTag);
                    }
                    catch (Exception ex) {
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u89c6\u56fe[%1$s]\u89c6\u56fe\u5f15\u7528[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", psDEViewBase.getPSDEViewBaseName(), psVTRV.getPSVTRVName(), ex.getMessage()), ex);
                    }
                }
            }
        }
        return psDEViewBase;
    }

    protected void doInitDEViewRV(PSSystemDTO psSystem, PSDataEntityDTO psDataEntity, PSViewTypeDTO psViewTypeStruct, PSDEViewBaseDTO psDEViewBase, PSVTRVDTO psVTRV, String strSubTypeId, String strTag) throws Throwable {
        PSDEViewRVDTO psDEViewRV = new PSDEViewRVDTO();
        psDEViewRV.setMajorPSDEViewId(psDEViewBase.getPSDEViewBaseId());
        psDEViewRV.setMajorPSDEViewName(psDEViewBase.getPSDEViewBaseName());
        psDEViewRV.setPSDEViewRVName(psVTRV.getPSVTRVName());
        psDEViewRV.setRefMode(psVTRV.getLogicName());
        psDEViewRV.setMemo(psVTRV.getMemo());
        psDEViewRV.setDefViewType(psVTRV.getDEFViewType());
        this.fillDEViewRV(psDEViewRV, psSystem, psDataEntity, psViewTypeStruct, psDEViewBase, psVTRV, strSubTypeId, strTag);
        try {
            this.iPSDEViewRVService.create(psDEViewRV);
        }
        catch (Exception ex) {
            throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u89c6\u56fe[%1$s]\u5f15\u7528[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", psDEViewBase.getPSDEViewBaseName(), psDEViewRV.getPSDEViewRVName(), ex.getMessage()), ex);
        }
    }

    protected void fillDEViewRV(PSDEViewRVDTO psDEViewRV, PSSystemDTO psSystem, PSDataEntityDTO psDataEntity, PSViewTypeDTO psViewTypeStruct, PSDEViewBaseDTO psDEViewBase, PSVTRVDTO psVTRV, String strSubTypeId, String strTag) throws Throwable {
        if (DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEGRIDVIEW", (boolean)true) == 0L || DataTypeUtils.compare((String)psViewTypeStruct.getPSViewTypeId(), (String)"DEMDCUSTOMVIEW", (boolean)true) == 0L) {
            if (DataTypeUtils.compare((String)psVTRV.getPSVTRVName(), (String)"NEWDATA", (boolean)true) == 0L) {
                String strDEViewId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"DEEDITVIEW");
                if (this.iPSDEViewBaseService.checkKeyState(strDEViewId) == 1) {
                    psDEViewRV.setMinorPSDEViewId(strDEViewId);
                }
                return;
            }
            if (DataTypeUtils.compare((String)psVTRV.getPSVTRVName(), (String)"EDITDATA", (boolean)true) == 0L) {
                String strDEViewId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"DEEDITVIEW");
                if (this.iPSDEViewBaseService.checkKeyState(strDEViewId) == 1) {
                    psDEViewRV.setMinorPSDEViewId(strDEViewId);
                }
                return;
            }
        }
    }

    protected void doInitDEViewCtrl(PSSystemDTO psSystem, PSDataEntityDTO psDataEntity, PSViewTypeDTO psViewTypeStruct, PSDEViewBaseDTO psDEViewBase, PSVTCtrlDTO psVTCtrl, String strSubTypeId, String strTag) throws Throwable {
        if (!DataTypeUtils.getBooleanValue((Object)psVTCtrl.getValidFlag(), (Boolean)true).booleanValue()) {
            return;
        }
        PSDEViewCtrlDTO psDEViewCtrl = new PSDEViewCtrlDTO();
        psDEViewCtrl.setPSDEViewBaseId(psDEViewBase.getPSDEViewBaseId());
        psDEViewCtrl.setPSDEViewBaseName(psDEViewBase.getPSDEViewBaseName());
        psDEViewCtrl.setPSDEViewCtrlName(psVTCtrl.getPSVTCtrlName());
        psDEViewCtrl.setPSDEViewCtrlType(psVTCtrl.getCtrlType());
        psDEViewCtrl.setPSDEId(psDEViewBase.getPSDEId());
        psDEViewCtrl.setPSDEName(psDEViewBase.getPSDEName());
        if (psVTCtrl.getDefaultFlag() != null) {
            psDEViewCtrl.setDefaultFlag(psVTCtrl.getDefaultFlag());
        } else {
            psDEViewCtrl.setDefaultFlag(1);
        }
        this.fillDEViewCtrlParams(psDEViewCtrl, psVTCtrl);
        if (psVTCtrl.getOrderValue() != null) {
            psDEViewCtrl.setOrderValue(psVTCtrl.getOrderValue());
        }
        if (psVTCtrl.getEnableViewActions() != null) {
            psDEViewCtrl.setEnableViewActions(psVTCtrl.getEnableViewActions());
        }
        this.fillDEViewCtrl(psDEViewCtrl, psSystem, psDataEntity, psViewTypeStruct, psDEViewBase, psVTCtrl, strSubTypeId, strTag);
        this.iPSDEViewCtrlService.create(psDEViewCtrl);
        this.iPSDEViewCtrlService.update(psDEViewCtrl);
    }

    protected String getPSDEEditFormId(PSDataEntityDTO psDataEntity, boolean bMobile) throws Throwable {
        String strPSDEEditFormId = this.getPSDEEditFormIdReal(psDataEntity, bMobile);
        return strPSDEEditFormId;
    }

    protected String getPSDEEditFormIdReal(PSDataEntityDTO psDataEntity, boolean bMobile) throws Throwable {
        String strDefaultEditFormId = null;
        strDefaultEditFormId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)PSModelEnums.FormType.EDITFORM.value);
        if (bMobile) {
            strDefaultEditFormId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)PSModelEnums.FormType.EDITFORM.value, (Object)"MOB");
        }
        if (this.iPSDEFormService.checkKeyState(strDefaultEditFormId) == 1) {
            return strDefaultEditFormId;
        }
        ISearchContextDTO selectCond = this.iPSDEFormService.createSearchContextDTO().all().count(false).eq("FORMTYPE", (Object)PSModelEnums.FormType.EDITFORM.value).eq("PSDEID", (Object)psDataEntity.getPSDataEntityId());
        List<PSDEFormDTO> list = this.iPSDEFormService.select(selectCond);
        if (!ObjectUtils.isEmpty((Object)list)) {
            for (PSDEFormDTO psDEForm2 : list) {
                if (bMobile) {
                    if (DataTypeUtils.getBooleanValue((Object)psDEForm2.getMobFlag(), (Boolean)false).booleanValue()) {
                        return psDEForm2.getPSDEFormId();
                    }
                    if (psDEForm2.getCodeName().indexOf("Mob") == -1) continue;
                    return psDEForm2.getPSDEFormId();
                }
                if (DataTypeUtils.getBooleanValue((Object)psDEForm2.getMobFlag(), (Boolean)false).booleanValue() || psDEForm2.getCodeName().indexOf("Mob") != -1) continue;
                return psDEForm2.getPSDEFormId();
            }
        }
        return null;
    }

    protected String getPSACHandlerId(String strPSSysACHandlerId, PSSystemDTO psSystem) throws Throwable {
        String strPSACHandlerId = this.getPSACHandlerIdReal(strPSSysACHandlerId, psSystem);
        return strPSACHandlerId;
    }

    protected String getPSACHandlerIdReal(String strPSSysACHandlerId, PSSystemDTO psSystem) throws Throwable {
        String strPSSFACHandlerId = KeyValueUtils.genUniqueId((Object)strPSSysACHandlerId, (Object)psSystem.getPSSFId());
        String strPSACHandlerId = KeyValueUtils.genUniqueId((Object)psSystem.getPSSystemId(), (Object)strPSSFACHandlerId);
        if (this.iPSACHandlerService.checkKeyState(strPSACHandlerId) == 1) {
            return strPSACHandlerId;
        }
        ISearchContextDTO selectCond = this.iPSACHandlerService.createSearchContextDTO().nvl("PSDEID").eq("pssystemid", (Object)psSystem.getPSSystemId()).eq("PSSFACHANDLERID", (Object)strPSSFACHandlerId);
        List<PSACHandlerDTO> psACHandlerList = this.iPSACHandlerService.select(selectCond);
        if (!ObjectUtils.isEmpty((Object)psACHandlerList)) {
            return ((PSACHandlerDTO)((Object)psACHandlerList.get(0))).getPSACHandlerId();
        }
        return null;
    }

    protected String getPSDEToolbarId(String strPSSysToolbarId, PSSystemDTO psSystem) throws Throwable {
        String strPSDEToolbarId = this.getPSDEToolbarIdReal(strPSSysToolbarId, psSystem);
        return strPSDEToolbarId;
    }

    protected String getPSDEToolbarIdReal(String strPSSysToolbarId, PSSystemDTO psSystem) throws Throwable {
        String strPSDEToolbarId = KeyValueUtils.genUniqueId((Object)psSystem.getPSSystemId(), (Object)strPSSysToolbarId);
        if (this.iPSDEToolbarService.checkKeyState(strPSDEToolbarId) == 1) {
            return strPSDEToolbarId;
        }
        ISearchContextDTO selectCond = this.iPSDEToolbarService.createSearchContextDTO().nvl("PSDEID").eq("pssystemid", (Object)psSystem.getPSSystemId()).eq("PSSYSTOOLBARID", (Object)strPSSysToolbarId);
        List<PSDEToolbarDTO> psDEToolbarList = this.iPSDEToolbarService.select(selectCond);
        if (!ObjectUtils.isEmpty((Object)psDEToolbarList)) {
            return ((PSDEToolbarDTO)((Object)psDEToolbarList.get(0))).getPSDEToolbarId();
        }
        return null;
    }

    protected String getPSDESearchFormId(PSDataEntityDTO psDataEntity, boolean bMobile) throws Throwable {
        String strPSDESearchFormId = this.getPSDESearchFormIdReal(psDataEntity, bMobile);
        return strPSDESearchFormId;
    }

    protected String getPSDESearchFormIdReal(PSDataEntityDTO psDataEntity, boolean bMobile) throws Throwable {
        String strDefaultSearchFormId = null;
        strDefaultSearchFormId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)PSModelEnums.FormType.SEARCHFORM.value);
        if (bMobile) {
            strDefaultSearchFormId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)PSModelEnums.FormType.SEARCHFORM.value, (Object)"MOB");
        }
        if (this.iPSDEFormService.checkKeyState(strDefaultSearchFormId) == 1) {
            return strDefaultSearchFormId;
        }
        ISearchContextDTO selectCond = this.iPSDEFormService.createSearchContextDTO().eq("FORMTYPE", (Object)PSModelEnums.FormType.SEARCHFORM.value).eq("PSDEID", (Object)psDataEntity.getPSDataEntityId());
        List<PSDEFormDTO> list = this.iPSDEFormService.select(selectCond);
        for (PSDEFormDTO psDEForm2 : list) {
            if (bMobile) {
                if (DataTypeUtils.getBooleanValue((Object)psDEForm2.getMobFlag(), (Boolean)false).booleanValue()) {
                    return psDEForm2.getPSDEFormId();
                }
                if (psDEForm2.getCodeName().indexOf("Mob") == -1) continue;
                return psDEForm2.getPSDEFormId();
            }
            if (DataTypeUtils.getBooleanValue((Object)psDEForm2.getMobFlag(), (Boolean)false).booleanValue() || psDEForm2.getCodeName().indexOf("Mob") != -1) continue;
            return psDEForm2.getPSDEFormId();
        }
        return null;
    }

    protected String getPSDEGridId(PSDataEntityDTO psDataEntity, boolean bMobile) throws Throwable {
        String strPSDEGridId = this.getPSDEGridIdReal(psDataEntity, bMobile);
        return strPSDEGridId;
    }

    protected String getPSDEGridIdReal(PSDataEntityDTO psDataEntity, boolean bMobile) throws Throwable {
        String strDefaultGridId = null;
        strDefaultGridId = psDataEntity.getPSDataEntityId();
        if (this.iPSDEGridService.checkKeyState(strDefaultGridId) == 1) {
            return strDefaultGridId;
        }
        ISearchContextDTO selectCond = this.iPSDEGridService.createSearchContextDTO().eq("PSDEID", (Object)psDataEntity.getPSDataEntityId());
        List<PSDEGridDTO> list = this.iPSDEGridService.select(selectCond);
        if (!ObjectUtils.isEmpty((Object)list)) {
            for (PSDEGridDTO psDEGrid2 : list) {
                if (!(bMobile ? psDEGrid2.getCodeName().indexOf("Mob") != -1 : psDEGrid2.getCodeName().indexOf("Mob") == -1)) continue;
                return psDEGrid2.getPSDEGridId();
            }
        }
        return null;
    }

    protected String getPSDEDataSetId(PSDataEntityDTO psDataEntity) throws Throwable {
        return this.getPSDEDataSetId(psDataEntity, null, null);
    }

    protected String getPSDEDataSetId(PSDataEntityDTO psDataEntity, String strSubTypeId, String strTag) throws Throwable {
        String strPSDEDataSetId = this.getPSDEDataSetIdReal(psDataEntity, strSubTypeId, strTag);
        return strPSDEDataSetId;
    }

    protected String getPSDEDataSetIdReal(PSDataEntityDTO psDataEntity, String strSubTypeId, String strTag) throws Throwable {
        String strDefaultDataSetId = null;
        strDefaultDataSetId = psDataEntity.getPSDataEntityId();
        if (StringUtils.hasLength((String)strSubTypeId)) {
            if (DataTypeUtils.compare((String)strSubTypeId, (String)"INDEXDETYPE", (boolean)true) == 0L) {
                strDefaultDataSetId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"INDEXDETYPE", (Object)strTag);
            } else if (DataTypeUtils.compare((String)strSubTypeId, (String)"FORMTYPE", (boolean)true) == 0L) {
                strDefaultDataSetId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"FORMTYPE", (Object)"");
            }
        }
        if (this.iPSDEDataSetService.checkKeyState(strDefaultDataSetId) == 1) {
            return strDefaultDataSetId;
        }
        ISearchContextDTO selectCond = this.iPSDEDataSetService.createSearchContextDTO().eq("PSDEID", (Object)psDataEntity.getPSDataEntityId());
        List<PSDEDataSetDTO> list = this.iPSDEDataSetService.select(selectCond);
        if (ObjectUtils.isEmpty((Object)list)) {
            return null;
        }
        if (StringUtils.hasLength((String)strSubTypeId)) {
            for (PSDEDataSetDTO psDEDataSet2 : list) {
                if (!(DataTypeUtils.compare((String)strSubTypeId, (String)"INDEXDETYPE", (boolean)true) == 0L ? PSModelEnums.DEDataSetPredefinedType.INDEXDE.value.equals(psDEDataSet2.getPredefineType()) : DataTypeUtils.compare((String)strSubTypeId, (String)"FORMTYPE", (boolean)true) == 0L && PSModelEnums.DEDataSetPredefinedType.MULTIFORM.value.equals(psDEDataSet2.getPredefineType()))) continue;
                return psDEDataSet2.getPSDEDataSetId();
            }
        } else {
            for (PSDEDataSetDTO psDEDataSet2 : list) {
                if (!DataTypeUtils.getBooleanValue((Object)psDEDataSet2.getDefaultMode(), (Boolean)false).booleanValue()) continue;
                return psDEDataSet2.getPSDEDataSetId();
            }
            Iterator<PSDEDataSetDTO> iterator = list.iterator();
            if (iterator.hasNext()) {
                PSDEDataSetDTO psDEDataSet2;
                psDEDataSet2 = (PSDEDataSetDTO)((Object)iterator.next());
                return psDEDataSet2.getPSDEDataSetId();
            }
        }
        return null;
    }

    protected String getPSDEViewBaseId(PSDataEntityDTO psDataEntity, PSViewTypeDTO psViewTypeStruct, String strSubTypeId, String strTag) throws Throwable {
        String strPSDEViewBaseId = this.getPSDEViewBaseIdReal(psDataEntity, psViewTypeStruct, strSubTypeId, strTag);
        return strPSDEViewBaseId;
    }

    protected String getPSDEViewBaseIdReal(PSDataEntityDTO psDataEntity, PSViewTypeDTO psViewTypeStruct, String strSubTypeId, String strTag) throws Throwable {
        String strDEViewId = "";
        String strPSViewTypeId = "";
        if (psViewTypeStruct != null && psViewTypeStruct.getPSViewTypeId().indexOf("DEMOB") != -1) {
            if (DataTypeUtils.compare((String)strSubTypeId, (String)"INDEXDETYPE", (boolean)true) == 0L) {
                strDEViewId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"DEMOBINDEXPICKUPMDVIEW", (Object)strSubTypeId, (Object)strTag);
                strPSViewTypeId = "DEMOBINDEXPICKUPMDVIEW";
            } else if (DataTypeUtils.compare((String)strSubTypeId, (String)"FORMTYPE", (boolean)true) == 0L) {
                strDEViewId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"DEMOBFORMPICKUPMDVIEW", (Object)strSubTypeId, (Object)strTag);
                strPSViewTypeId = "DEMOBFORMPICKUPMDVIEW";
            } else {
                strDEViewId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"DEMOBPICKUPMDVIEW");
                strPSViewTypeId = "DEMOBPICKUPMDVIEW";
            }
        } else if (DataTypeUtils.compare((String)strSubTypeId, (String)"INDEXDETYPE", (boolean)true) == 0L) {
            strDEViewId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"DEINDEXPICKUPDATAVIEW", (Object)strSubTypeId, (Object)strTag);
            strPSViewTypeId = "DEINDEXPICKUPDATAVIEW";
        } else if (DataTypeUtils.compare((String)strSubTypeId, (String)"FORMTYPE", (boolean)true) == 0L) {
            strDEViewId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"DEFORMPICKUPDATAVIEW", (Object)strSubTypeId, (Object)strTag);
            strPSViewTypeId = "DEFORMPICKUPDATAVIEW";
        } else {
            strDEViewId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"DEPICKUPGRIDVIEW");
            strPSViewTypeId = "DEPICKUPGRIDVIEW";
        }
        if (this.iPSDEViewBaseService.checkKeyState(strDEViewId) == 1) {
            return strDEViewId;
        }
        ISearchContextDTO selectCond = this.iPSDEViewBaseService.createSearchContextDTO().eq("PSDEID", (Object)psDataEntity.getPSDataEntityId()).eq("PSDEVIEWBASETYPE", (Object)strPSViewTypeId);
        if (ObjectUtils.isEmpty((Object)strSubTypeId)) {
            selectCond.nvl("DEVIEWTAG3");
            selectCond.nvl("DEVIEWTAG4");
        } else {
            selectCond.set("DEVIEWTAG3", strSubTypeId);
            if (StringUtils.hasLength((String)strTag)) {
                selectCond.set("DEVIEWTAG4", strTag);
            } else {
                selectCond.nvl("DEVIEWTAG4");
            }
        }
        List<PSDEViewBaseDTO> list = this.iPSDEViewBaseService.select(selectCond);
        if (ObjectUtils.isEmpty((Object)list)) {
            return null;
        }
        return ((PSDEViewBaseDTO)((Object)list.get(0))).getPSDEViewBaseId();
    }

    protected String getPSDEDataRelationId(PSDataEntityDTO psDataEntity, PSDEViewBaseDTO psDEViewBase, boolean bMobile) throws Throwable {
        String strPSDEDataRelationId = this.getPSDEDataRelationIdReal(psDataEntity, psDEViewBase, bMobile);
        return strPSDEDataRelationId;
    }

    protected String getPSDEDataRelationIdReal(PSDataEntityDTO psDataEntity, PSDEViewBaseDTO psDEViewBase, boolean bMobile) throws Throwable {
        String strDEDataRelationId = null;
        strDEDataRelationId = psDataEntity.getPSDataEntityId();
        if (StringUtils.hasLength((String)psDEViewBase.getPSWFId())) {
            strDEDataRelationId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)psDEViewBase.getPSWFId());
            if (bMobile) {
                strDEDataRelationId = KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)psDEViewBase.getPSWFId(), (Object)"MOB");
            }
        }
        if (this.iPSDEDataRelationService.checkKeyState(strDEDataRelationId) == 1) {
            return strDEDataRelationId;
        }
        ISearchContextDTO selectCond = this.iPSDEDataRelationService.createSearchContextDTO().eq("PSDEID", (Object)psDEViewBase.getPSDEId());
        if (ObjectUtils.isEmpty((Object)psDEViewBase.getPSWFDEId())) {
            selectCond.nvl("PSWFDEID");
        } else {
            selectCond.eq("PSWFDEID", (Object)psDEViewBase.getPSWFDEId());
        }
        if (bMobile) {
            selectCond.eq("DRTAG", (Object)"MOB");
        } else {
            selectCond.nvl("DRTAG");
        }
        List<PSDEDataRelationDTO> list = this.iPSDEDataRelationService.select(selectCond);
        if (!ObjectUtils.isEmpty((Object)list)) {
            return list.get(0).getPSDEDataRelationId();
        }
        return null;
    }

    protected String getPSDEDataViewId(PSDataEntityDTO psDataEntity, String strSubTypeId, String strTag) throws Throwable {
        String strPSDEDataViewId = this.getPSDEDataViewIdReal(psDataEntity, strSubTypeId, strTag);
        return strPSDEDataViewId;
    }

    protected String getPSDEDataViewIdReal(PSDataEntityDTO psDataEntity, String strSubTypeId, String strTag) throws Throwable {
        String strDefaultDataViewId = "";
        strDefaultDataViewId = ObjectUtils.isEmpty((Object)strSubTypeId) ? psDataEntity.getPSDataEntityId() : KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)strSubTypeId, (Object)strTag);
        if (this.iPSDEDataViewService.checkKeyState(strDefaultDataViewId) == 1) {
            return strDefaultDataViewId;
        }
        ISearchContextDTO selectCond = this.iPSDEDataViewService.createSearchContextDTO().eq("PSDEID", (Object)psDataEntity.getPSDataEntityId());
        List<PSDEDataViewDTO> list = this.iPSDEDataViewService.select(selectCond);
        if (ObjectUtils.isEmpty((Object)list)) {
            return null;
        }
        if (StringUtils.hasLength((String)strSubTypeId)) {
            for (PSDEDataViewDTO psDEDataView2 : list) {
                if (!(DataTypeUtils.compare((String)strSubTypeId, (String)"INDEXDETYPE", (boolean)true) == 0L ? "IndexType".equals(psDEDataView2.getCodeName()) : DataTypeUtils.compare((String)strSubTypeId, (String)"FORMTYPE", (boolean)true) == 0L && "FormType".equals(psDEDataView2.getCodeName()))) continue;
                return psDEDataView2.getPSDEDataViewId();
            }
        } else {
            Iterator<PSDEDataViewDTO> iterator = list.iterator();
            if (iterator.hasNext()) {
                PSDEDataViewDTO psDEDataView2 = (PSDEDataViewDTO)((Object)iterator.next());
                return psDEDataView2.getPSDEDataViewId();
            }
        }
        return null;
    }

    protected String getPSDEListId(PSDataEntityDTO psDataEntity, String strSubTypeId, String strTag, boolean bMobile) throws Throwable {
        String strPSDEDataViewId = this.getPSDEListIdReal(psDataEntity, strSubTypeId, strTag, bMobile);
        return strPSDEDataViewId;
    }

    protected String getPSDEListIdReal(PSDataEntityDTO psDataEntity, String strSubTypeId, String strTag, boolean bMobile) throws Throwable {
        String strDefaultListId = "";
        strDefaultListId = bMobile ? (ObjectUtils.isEmpty((Object)strSubTypeId) ? KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)"MOB") : KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)strSubTypeId, (Object)strTag, (Object)"MOB")) : (ObjectUtils.isEmpty((Object)strSubTypeId) ? psDataEntity.getPSDataEntityId() : KeyValueUtils.genUniqueId((Object)psDataEntity.getPSDataEntityId(), (Object)strSubTypeId, (Object)strTag));
        if (this.iPSDEListService.checkKeyState(strDefaultListId) == 1) {
            return strDefaultListId;
        }
        ISearchContextDTO selectCond = this.iPSDEListService.createSearchContextDTO().eq("PSDEID", (Object)psDataEntity.getPSDataEntityId());
        List<PSDEListDTO> list = this.iPSDEListService.select(selectCond);
        if (ObjectUtils.isEmpty((Object)list)) {
            return null;
        }
        if (StringUtils.hasLength((String)strSubTypeId)) {
            for (PSDEListDTO psDEList2 : list) {
                if (!(DataTypeUtils.compare((String)strSubTypeId, (String)"INDEXDETYPE", (boolean)true) == 0L ? (bMobile ? "MobIndexType".equals(psDEList2.getCodeName()) : "IndexType".equals(psDEList2.getCodeName())) : DataTypeUtils.compare((String)strSubTypeId, (String)"FORMTYPE", (boolean)true) == 0L && (bMobile ? "MobFormType".equals(psDEList2.getCodeName()) : "FormType".equals(psDEList2.getCodeName())))) continue;
                return psDEList2.getPSDEListId();
            }
        } else {
            for (PSDEListDTO psDEList2 : list) {
                if (!bMobile || !"Mob".equals(psDEList2.getCodeName())) continue;
                return psDEList2.getPSDEListId();
            }
            Iterator<PSDEListDTO> iterator = list.iterator();
            if (iterator.hasNext()) {
                PSDEListDTO psDEList2;
                psDEList2 = (PSDEListDTO)((Object)iterator.next());
                return psDEList2.getPSDEListId();
            }
        }
        return null;
    }

    protected void fillDEViewCtrl(PSDEViewCtrlDTO psDEViewCtrl, PSSystemDTO psSystem, PSDataEntityDTO psDataEntity, PSViewTypeDTO psViewTypeStruct, PSDEViewBaseDTO psDEViewBase, PSVTCtrlDTO psVTCtrl, String strSubTypeId, String strTag) throws Throwable {
        if (DataTypeUtils.compare((String)psVTCtrl.getCtrlType(), (String)PSModelEnums.CtrlType.FORM.value, (boolean)true) == 0L) {
            String strDefaultEditFormId;
            boolean bMobile = false;
            if (psViewTypeStruct != null && psViewTypeStruct.getPSViewTypeId().indexOf("DEMOB") != -1) {
                bMobile = true;
            }
            if (StringUtils.hasLength((String)(strDefaultEditFormId = this.getPSDEEditFormId(psDataEntity, bMobile)))) {
                psDEViewCtrl.setPSDEFormId(strDefaultEditFormId);
            }
            if (StringUtils.hasLength((String)psVTCtrl.getPSSysACHandlerId())) {
                psDEViewCtrl.setPSACHandlerId(this.getPSACHandlerId(psVTCtrl.getPSSysACHandlerId(), psSystem));
            }
            return;
        }
        if (DataTypeUtils.compare((String)psVTCtrl.getCtrlType(), (String)PSModelEnums.CtrlType.SEARCHFORM.value, (boolean)true) == 0L) {
            String strDefaultSearchFormId;
            boolean bMobile = false;
            if (psViewTypeStruct != null && psViewTypeStruct.getPSViewTypeId().indexOf("DEMOB") != -1) {
                bMobile = true;
            }
            if (StringUtils.hasLength((String)(strDefaultSearchFormId = this.getPSDESearchFormId(psDataEntity, bMobile)))) {
                psDEViewCtrl.setPSDEFormId(strDefaultSearchFormId);
            }
            if (StringUtils.hasLength((String)psVTCtrl.getPSSysACHandlerId())) {
                psDEViewCtrl.setPSACHandlerId(this.getPSACHandlerId(psVTCtrl.getPSSysACHandlerId(), psSystem));
            }
            return;
        }
        if (DataTypeUtils.compare((String)psVTCtrl.getCtrlType(), (String)PSModelEnums.CtrlType.GRID.value, (boolean)true) == 0L) {
            String strDefaultGridId;
            boolean bMobile = false;
            if (psViewTypeStruct != null && psViewTypeStruct.getPSViewTypeId().indexOf("DEMOB") != -1) {
                bMobile = true;
            }
            if (StringUtils.hasLength((String)(strDefaultGridId = this.getPSDEGridId(psDataEntity, bMobile)))) {
                psDEViewCtrl.setPSDEGridId(strDefaultGridId);
            }
            psDEViewCtrl.setPSDEDataSetId(this.getPSDEDataSetId(psDataEntity));
            if (StringUtils.hasLength((String)psVTCtrl.getPSSysACHandlerId())) {
                psDEViewCtrl.setPSACHandlerId(this.getPSACHandlerId(psVTCtrl.getPSSysACHandlerId(), psSystem));
            }
            return;
        }
        if (DataTypeUtils.compare((String)psVTCtrl.getCtrlType(), (String)PSModelEnums.CtrlType.TOOLBAR.value, (boolean)true) == 0L) {
            if (StringUtils.hasLength((String)psVTCtrl.getPSSysToolbarId())) {
                psDEViewCtrl.setPSDEToolbarId(this.getPSDEToolbarId(psVTCtrl.getPSSysToolbarId(), psSystem));
            }
            return;
        }
        if (DataTypeUtils.compare((String)psVTCtrl.getCtrlType(), (String)PSModelEnums.CtrlType.PICKUPVIEWPANEL.value, (boolean)true) == 0L) {
            String strPSDEViewId = this.getPSDEViewBaseId(psDataEntity, psViewTypeStruct, strSubTypeId, strTag);
            if (StringUtils.hasLength((String)strPSDEViewId)) {
                psDEViewCtrl.setPSDEViewId(strPSDEViewId);
            }
            return;
        }
        if (DataTypeUtils.compare((String)psVTCtrl.getCtrlType(), (String)PSModelEnums.CtrlType.DRBAR.value, (boolean)true) == 0L || DataTypeUtils.compare((String)psVTCtrl.getCtrlType(), (String)PSModelEnums.CtrlType.DRTAB.value, (boolean)true) == 0L) {
            boolean bMobile = false;
            if (psViewTypeStruct != null && psViewTypeStruct.getPSViewTypeId().indexOf("DEMOB") != -1) {
                bMobile = true;
            }
            psDEViewCtrl.setPSDEDRId(this.getPSDEDataRelationId(psDataEntity, psDEViewBase, bMobile));
            return;
        }
        if (DataTypeUtils.compare((String)psVTCtrl.getCtrlType(), (String)PSModelEnums.CtrlType.DATAVIEW.value, (boolean)true) == 0L) {
            psDEViewCtrl.setPSDEDataViewId(this.getPSDEDataViewId(psDataEntity, strSubTypeId, strTag));
            psDEViewCtrl.setPSDEDataSetId(this.getPSDEDataSetId(psDataEntity, strSubTypeId, strTag));
            if (ObjectUtils.isEmpty((Object)strSubTypeId)) {
                if (StringUtils.hasLength((String)psVTCtrl.getPSSysACHandlerId())) {
                    psDEViewCtrl.setPSACHandlerId(this.getPSACHandlerId(psVTCtrl.getPSSysACHandlerId(), psSystem));
                }
            } else {
                String strPSSysACHandlerId = "";
                if (DataTypeUtils.compare((String)strSubTypeId, (String)"INDEXDETYPE", (boolean)true) == 0L) {
                    strPSSysACHandlerId = "INDEXPICKUPDATAVIEWHANDLER";
                } else if (DataTypeUtils.compare((String)strSubTypeId, (String)"FORMTYPE", (boolean)true) == 0L) {
                    strPSSysACHandlerId = "FORMPICKUPDATAVIEWHANDLER";
                }
                psDEViewCtrl.setPSACHandlerId(this.getPSACHandlerId(strPSSysACHandlerId, psSystem));
            }
            return;
        }
        if (DataTypeUtils.compare((String)psVTCtrl.getCtrlType(), (String)PSModelEnums.CtrlType.MOBMDCTRL.value, (boolean)true) == 0L) {
            psDEViewCtrl.setPSDEListId(this.getPSDEListId(psDataEntity, strSubTypeId, strTag, true));
            psDEViewCtrl.setPSDEDataSetId(this.getPSDEDataSetId(psDataEntity, strSubTypeId, strTag));
            if (ObjectUtils.isEmpty((Object)strSubTypeId)) {
                if (StringUtils.hasLength((String)psVTCtrl.getPSSysACHandlerId())) {
                    psDEViewCtrl.setPSACHandlerId(this.getPSACHandlerId(psVTCtrl.getPSSysACHandlerId(), psSystem));
                }
            } else {
                String strPSSysACHandlerId = psVTCtrl.getPSSysACHandlerId();
                psDEViewCtrl.setPSACHandlerId(this.getPSACHandlerId(strPSSysACHandlerId, psSystem));
            }
            psDEViewCtrl.setCtrlParam(PSModelEnums.MobMDCtrlType.LISTVIEW.value);
            return;
        }
    }

    protected void fillDEViewCtrlParams(PSDEViewCtrlDTO psDEViewCtrl, PSVTCtrlDTO psVTCtrl) throws Exception {
        if (psVTCtrl.getCtrlParam() != null) {
            psDEViewCtrl.setCtrlParam(psVTCtrl.getCtrlParam());
        }
        if (psVTCtrl.getCtrlParam2() != null) {
            psDEViewCtrl.setCtrlParam2(psVTCtrl.getCtrlParam2());
        }
        if (psVTCtrl.getCtrlParam3() != null) {
            psDEViewCtrl.setCtrlParam3(psVTCtrl.getCtrlParam3());
        }
        if (psVTCtrl.getCtrlParam4() != null) {
            psDEViewCtrl.setCtrlParam4(psVTCtrl.getCtrlParam4());
        }
        if (psVTCtrl.getCtrlParam5() != null) {
            psDEViewCtrl.setCtrlParam5(psVTCtrl.getCtrlParam5());
        }
        if (psVTCtrl.getCtrlParam6() != null) {
            psDEViewCtrl.setCtrlParam6(psVTCtrl.getCtrlParam6());
        }
        if (psVTCtrl.getCtrlParam7() != null) {
            psDEViewCtrl.setCtrlParam7(psVTCtrl.getCtrlParam7());
        }
        if (psVTCtrl.getCtrlParam8() != null) {
            psDEViewCtrl.setCtrlParam8(psVTCtrl.getCtrlParam8());
        }
        if (psVTCtrl.getCtrlParam9() != null) {
            psDEViewCtrl.setCtrlParam9(psVTCtrl.getCtrlParam9());
        }
        if (psVTCtrl.getCtrlParam10() != null) {
            psDEViewCtrl.setCtrlParam10(psVTCtrl.getCtrlParam10());
        }
    }

    protected void doInitPSDETables(PSDataEntityDTO et) throws Throwable {
        this.iPSDataEntityService.initDEDBTables(et);
    }

    protected void doInitPSLanguageReses(PSDataEntityDTO et, boolean bFixMode) throws Throwable {
        this.iPSDataEntityService.fixLanRes(et);
    }

    protected void doInitPSDEDataSets(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        PSDEDataSetDTO psDEDataSet;
        PSDEDataSetDTO psDEDataSet2;
        boolean bCreate;
        String strIndexType;
        boolean bNoViewModeDefault = this.isEnableNoViewMode(psDataEntityDTO);
        if (DataTypeUtils.getBooleanValue((Object)psDataEntityDTO.getNoViewMode(), (Boolean)bNoViewModeDefault).booleanValue()) {
            HashMap<String, Integer> viewDQMap = new HashMap<String, Integer>();
            int nViewLevel = DataTypeUtils.getIntegerValue((Object)psDataEntityDTO.getViewLevel(), (Integer)PSModelEnums.DEFieldViewColLevel.DEFAULT.value);
            if (nViewLevel >= PSModelEnums.DEFieldViewColLevel.LEVEL3.value) {
                viewDQMap.put("View4", PSModelEnums.DEFieldViewColLevel.LEVEL3.value);
            }
            if (nViewLevel >= PSModelEnums.DEFieldViewColLevel.LEVEL2.value) {
                viewDQMap.put("View3", PSModelEnums.DEFieldViewColLevel.LEVEL2.value);
            }
            if (nViewLevel >= PSModelEnums.DEFieldViewColLevel.LEVEL1.value) {
                viewDQMap.put("View2", PSModelEnums.DEFieldViewColLevel.LEVEL1.value);
            }
            if (nViewLevel >= PSModelEnums.DEFieldViewColLevel.DEFAULT.value) {
                viewDQMap.put("View", PSModelEnums.DEFieldViewColLevel.DEFAULT.value);
            }
            for (String strKey : viewDQMap.keySet()) {
                Integer nValue = (Integer)viewDQMap.get(strKey);
                String strLogicName = PSModelEnums.DEFieldViewColLevel.from((int)nValue.intValue()).text;
                String strDQKey = KeyValueUtils.genUniqueId((Object)psDataEntityDTO.getPSDataEntityId(), (Object)strKey.toUpperCase());
                boolean bCreate2 = false;
                if (this.iPSDEDataQueryService.checkKeyState(strDQKey) == 0) {
                    PSDEDataQueryDTO psDEDataQuery2 = new PSDEDataQueryDTO();
                    psDEDataQuery2.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                    psDEDataQuery2.setViewColLevel(nValue);
                    if (!this.iPSDEDataQueryService.select(psDEDataQuery2, true)) {
                        psDEDataQuery2.resetAll();
                        psDEDataQuery2.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                        psDEDataQuery2.setCodeName(strKey);
                        if (!this.iPSDEDataQueryService.select(psDEDataQuery2, true)) {
                            bCreate2 = true;
                        }
                    }
                }
                if (!bCreate2) continue;
                PSDEDataQueryDTO psDEDataQuery = new PSDEDataQueryDTO();
                psDEDataQuery.setPSDEDataQueryId(strDQKey);
                psDEDataQuery.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                psDEDataQuery.setPSDEName(psDataEntityDTO.getPSDataEntityName());
                psDEDataQuery.setPSDEDataQueryName(strKey.toUpperCase());
                psDEDataQuery.setLogicName(strLogicName);
                psDEDataQuery.setCodeName(strKey);
                psDEDataQuery.setCustomMode(0);
                psDEDataQuery.setDefaultMode(0);
                psDEDataQuery.setViewColLevel(nValue);
                PSDEDQJoinDTO psDEDataQueryJoin = new PSDEDQJoinDTO();
                psDEDataQueryJoin.setJoinPSDEId(psDEDataQuery.getPSDEId());
                psDEDataQueryJoin.setJoinPSDEName(psDEDataQuery.getPSDEName());
                psDEDataQueryJoin.setMainFlag(1);
                psDEDataQueryJoin.setPSDEJoinTypeId("MAIN");
                psDEDataQueryJoin.setPSDEDQJoinName(psDEDataQuery.getPSDEName());
                psDEDataQuery.getPSDEDQJoinsIf().add(psDEDataQueryJoin);
                this.iPSDEDataQueryService.create(psDEDataQuery);
            }
        }
        boolean bCreate3 = false;
        String strPSDEDataSetId = psDataEntityDTO.getPSDataEntityId();
        if (this.iPSDEDataSetService.checkKeyState(strPSDEDataSetId) == 0) {
            PSDEDataSetDTO psDEDataSet22 = new PSDEDataSetDTO();
            psDEDataSet22.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEDataSet22.setDefaultMode(1);
            if (!this.iPSDEDataSetService.select(psDEDataSet22, true)) {
                psDEDataSet22.resetAll();
                psDEDataSet22.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                psDEDataSet22.setCodeName("Default");
                if (!this.iPSDEDataSetService.select(psDEDataSet22, true)) {
                    bCreate3 = true;
                }
            }
        }
        if (bCreate3) {
            PSDEDataSetDTO psDEDataSet3 = new PSDEDataSetDTO();
            psDEDataSet3.setPSDEDataSetId(strPSDEDataSetId);
            psDEDataSet3.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEDataSet3.setDefaultMode(1);
            boolean bDefault = true;
            ISearchContextDTO searchContextDTO = this.iPSDEDataSetService.getDataEntityRuntime().createSearchContext();
            searchContextDTO.eq("PSDEID", (Object)psDataEntityDTO.getPSDataEntityId()).eq("DEFAULTMODE", (Object)1);
            searchContextDTO.limit(1);
            List<PSDEDataSetDTO> psDEDataSetList = this.iPSDEDataSetService.select(searchContextDTO);
            if (!ObjectUtils.isEmpty((Object)psDEDataSetList)) {
                bDefault = false;
            }
            psDEDataSet3.resetAll();
            psDEDataSet3.setPSDEDataSetId(strPSDEDataSetId);
            psDEDataSet3.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEDataSet3.setDefaultMode(bDefault ? 1 : 0);
            psDEDataSet3.setPSDEDataSetName("DEFAULT");
            psDEDataSet3.setCodeName("Default");
            PSDEDataQueryDTO psDEDataQuery = new PSDEDataQueryDTO();
            psDEDataQuery.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEDataQuery.setPSDEName(psDataEntityDTO.getPSDataEntityName());
            psDEDataQuery.setPSDEDataQueryName("DEFAULT");
            psDEDataQuery.setCodeName("Default");
            psDEDataQuery.setCustomMode(0);
            PSDEDQJoinDTO psDEDataQueryJoin = new PSDEDQJoinDTO();
            psDEDataQueryJoin.setJoinPSDEId(psDEDataQuery.getPSDEId());
            psDEDataQueryJoin.setJoinPSDEName(psDEDataQuery.getPSDEName());
            psDEDataQueryJoin.setMainFlag(1);
            psDEDataQueryJoin.setPSDEJoinTypeId("MAIN");
            psDEDataQueryJoin.setPSDEDQJoinName(psDEDataQuery.getPSDEName());
            psDEDataQuery.getPSDEDQJoinsIf().add(psDEDataQueryJoin);
            this.iPSDEDataQueryService.create(psDEDataQuery);
            PSDEDSDQDTO psDEDSDQ = new PSDEDSDQDTO();
            psDEDSDQ.setPSDEDataSetId(psDEDataSet3.getPSDEDataSetId());
            psDEDSDQ.setPSDEDQId(psDEDataQuery.getPSDEDataQueryId());
            psDEDataSet3.getPSDEDSDQsIf().add(psDEDSDQ);
            this.iPSDEDataSetService.create(psDEDataSet3);
        }
        if (StringUtils.hasLength((String)(strIndexType = psDataEntityDTO.getIndexDEType()))) {
            strPSDEDataSetId = KeyValueUtils.genUniqueId((Object)psDataEntityDTO.getPSDataEntityId(), (Object)"INDEXDETYPE", (Object)strIndexType);
            bCreate = false;
            if (this.iPSDEDataSetService.checkKeyState(strPSDEDataSetId) == 0) {
                psDEDataSet2 = new PSDEDataSetDTO();
                psDEDataSet2.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                psDEDataSet2.setPredefineType(PSModelEnums.DEDataSetType.INDEXDE.value);
                if (!this.iPSDEDataSetService.select(psDEDataSet2, true)) {
                    bCreate = true;
                }
            }
            if (bCreate) {
                psDEDataSet = new PSDEDataSetDTO();
                psDEDataSet.setPSDEDataSetId(strPSDEDataSetId);
                psDEDataSet.setPSDEDataSetId(strPSDEDataSetId);
                psDEDataSet.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                psDEDataSet.setDefaultMode(0);
                psDEDataSet.setPredefineType(PSModelEnums.DEDataSetType.INDEXDE.value);
                psDEDataSet.setPSDEDataSetName("IndexDER");
                psDEDataSet.setCodeName("IndexDER");
                this.iPSDEDataSetService.create(psDEDataSet);
            }
        }
        if (DataTypeUtils.getIntegerValue((Object)psDataEntityDTO.getEnaMultiForm(), (Integer)0) > 0) {
            strPSDEDataSetId = KeyValueUtils.genUniqueId((Object)psDataEntityDTO.getPSDataEntityId(), (Object)"FORMTYPE", (Object)"");
            bCreate = false;
            if (this.iPSDEDataSetService.checkKeyState(strPSDEDataSetId) == 0) {
                psDEDataSet2 = new PSDEDataSetDTO();
                psDEDataSet2.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                psDEDataSet2.setPredefineType(PSModelEnums.DEDataSetType.MULTIFORM.value);
                if (!this.iPSDEDataSetService.select(psDEDataSet2, true)) {
                    bCreate = true;
                }
            }
            if (bCreate) {
                psDEDataSet = new PSDEDataSetDTO();
                psDEDataSet.setPSDEDataSetId(strPSDEDataSetId);
                psDEDataSet.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                psDEDataSet.setDefaultMode(0);
                psDEDataSet.setPredefineType(PSModelEnums.DEDataSetType.MULTIFORM.value);
                psDEDataSet.setPSDEDataSetName("FormType");
                psDEDataSet.setCodeName("FormType");
                this.iPSDEDataSetService.create(psDEDataSet);
            }
        }
    }

    protected void doInitPSDEOPPrivs(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        Map<String, String> defaultPSDEOPPrivMap = PSDEOPPrivDERuntime.defaultPSDEOPPrivMap;
        for (String strPSDEOPPrivId : defaultPSDEOPPrivMap.keySet()) {
            String strPSDEOPPrivKey = KeyValueUtils.genUniqueId((Object)psDataEntityDTO.getPSSystemId(), (Object)psDataEntityDTO.getPSDataEntityId(), (Object)strPSDEOPPrivId);
            if (this.iPSDEOPPrivService.checkKeyState(strPSDEOPPrivKey) != 0) continue;
            ISearchContextDTO searchContextDTO = this.iPSDEFieldService.getDataEntityRuntime().createSearchContext();
            searchContextDTO.nn("PSDERID").eq("PSDEID", (Object)psDataEntityDTO.getPSDataEntityId()).eq("PSDEOPPRIVNAME", (Object)strPSDEOPPrivId);
            searchContextDTO.limit(1);
            if (!ObjectUtils.isEmpty((Object)this.iPSDEOPPrivService.select(searchContextDTO))) continue;
            String strLogicName = defaultPSDEOPPrivMap.get(strPSDEOPPrivId);
            PSDEOPPrivDTO opprivDTO = new PSDEOPPrivDTO();
            opprivDTO.setPSDEOPPrivId(strPSDEOPPrivKey);
            opprivDTO.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            opprivDTO.setPSDEName(psDataEntityDTO.getPSDataEntityName());
            opprivDTO.setPSDEOPPrivName(strPSDEOPPrivId);
            opprivDTO.setLogicName(strLogicName);
            this.iPSDEOPPrivService.create(opprivDTO);
        }
    }

    protected void doInitPSDEFSFItems(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        ISearchContextDTO searchContextDTO = this.iPSDEFieldService.getDataEntityRuntime().createSearchContext().all().count(false).eq("PSDEID", (Object)psDataEntityDTO.getPSDataEntityId());
        List<PSDEFieldDTO> psDEFieldList = this.iPSDEFieldService.rawSelect(searchContextDTO);
        HashMap<String, PSDEFieldDTO> psDEFieldMap = new HashMap<String, PSDEFieldDTO>();
        PSDEFieldDTO majorPSDEField = null;
        if (!ObjectUtils.isEmpty((Object)psDEFieldList)) {
            for (PSDEFieldDTO psDEField : psDEFieldList) {
                psDEFieldMap.put(psDEField.getPSDEFieldName(), psDEField);
                if (!DataTypeUtils.getBooleanValue((Object)psDEField.getMajorField(), (Boolean)false).booleanValue()) continue;
                majorPSDEField = psDEField;
            }
        }
        if (majorPSDEField == null) {
            return;
        }
        PSDEFSFItemDTO psDEFSearchItem = new PSDEFSFItemDTO();
        psDEFSearchItem.setPSDEFId(majorPSDEField.getPSDEFieldId());
        String strPSDEFSearchItemName = String.format("N_%1$s_LIKE", majorPSDEField.getPSDEFieldName());
        psDEFSearchItem.setPSDEFSFItemName(strPSDEFSearchItemName);
        if (!this.iPSDEFSFItemService.select(psDEFSearchItem, true)) {
            psDEFSearchItem.setPSDBValueOPId("LIKE");
            psDEFSearchItem.setPSDEId(majorPSDEField.getPSDEId());
            psDEFSearchItem.setPSDEName(majorPSDEField.getPSDEName());
            psDEFSearchItem.setPSDEFName(majorPSDEField.getPSDEFieldName());
            this.iPSDEFSFItemService.create(psDEFSearchItem);
        }
    }

    protected void doInitPSDEGrids(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        String strPSDEGridId = psDataEntityDTO.getPSDataEntityId();
        if (this.iPSDEGridService.checkKeyState(strPSDEGridId) == 0) {
            PSDEGridColDTO psDEGridCol;
            PSDEFieldDTO psDEField;
            PSDEGridDTO psDEGrid = new PSDEGridDTO();
            psDEGrid.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEGrid.setCodeName("Main");
            if (this.iPSDEGridService.select(psDEGrid, true)) {
                return;
            }
            psDEGrid.resetAll();
            psDEGrid.setPSDEGridId(strPSDEGridId);
            psDEGrid.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEGrid.setCodeName("Main");
            psDEGrid.setPSDEGridName("\u4e3b\u8868\u683c");
            psDEGrid.setEnablePagingBar(1);
            psDEGrid.setPagingSize(20);
            ISearchContextDTO searchContextDTO = this.iPSDEFieldService.getDataEntityRuntime().createSearchContext().all().count(false).eq("PSDEID", (Object)psDataEntityDTO.getPSDataEntityId());
            List<PSDEFieldDTO> psDEFieldList = this.iPSDEFieldService.rawSelect(searchContextDTO);
            HashMap<String, PSDEFieldDTO> psDEFieldMap = new HashMap<String, PSDEFieldDTO>();
            PSDEFieldDTO majorPSDEField = null;
            PSDEFieldDTO createManPSDEField = null;
            PSDEFieldDTO createDatePSDEField = null;
            PSDEFieldDTO updateManPSDEField = null;
            PSDEFieldDTO updateDatePSDEField = null;
            if (!ObjectUtils.isEmpty((Object)psDEFieldList)) {
                for (PSDEFieldDTO psDEField2 : psDEFieldList) {
                    psDEFieldMap.put(psDEField2.getPSDEFieldName(), psDEField2);
                    if (DataTypeUtils.getBooleanValue((Object)psDEField2.getMajorField(), (Boolean)false).booleanValue()) {
                        majorPSDEField = psDEField2;
                        continue;
                    }
                    if (PSModelEnums.PredefinedFieldType.CREATEMAN.value.equals(psDEField2.getPredefinedType())) {
                        createManPSDEField = psDEField2;
                        continue;
                    }
                    if (PSModelEnums.PredefinedFieldType.CREATEDATE.value.equals(psDEField2.getPredefinedType())) {
                        createDatePSDEField = psDEField2;
                        continue;
                    }
                    if (PSModelEnums.PredefinedFieldType.UPDATEMAN.value.equals(psDEField2.getPredefinedType())) {
                        updateManPSDEField = psDEField2;
                        continue;
                    }
                    if (!PSModelEnums.PredefinedFieldType.UPDATEDATE.value.equals(psDEField2.getPredefinedType())) continue;
                    updateDatePSDEField = psDEField2;
                }
            }
            if (majorPSDEField != null) {
                PSDEGridColDTO majordef = new PSDEGridColDTO();
                majordef.setPSDEGridColName(majorPSDEField.getPSDEFieldName().toLowerCase());
                majordef.setGridColType(PSModelEnums.GridColType.DEFGRIDCOLUMN.value);
                majordef.setOrderValue(1);
                majordef.setWidth(150);
                majordef.setPSDEFId(majorPSDEField.getPSDEFieldId());
                majordef.setPSDEFName(majorPSDEField.getPSDEFieldName());
                psDEGrid.getPSDEGridColsIf().add(majordef);
            }
            if ((psDEField = updateManPSDEField) != null) {
                psDEGridCol = new PSDEGridColDTO();
                psDEGridCol.setPSDEGridColName(psDEField.getPSDEFieldName().toLowerCase());
                psDEGridCol.setGridColType(PSModelEnums.GridColType.DEFGRIDCOLUMN.value);
                psDEGridCol.setOrderValue(3);
                psDEGridCol.setWidth(150);
                psDEGridCol.setPSDEFId(psDEField.getPSDEFieldId());
                psDEGridCol.setPSDEFName(psDEField.getPSDEFieldName());
                psDEGrid.getPSDEGridColsIf().add(psDEGridCol);
            }
            if ((psDEField = updateDatePSDEField) != null) {
                psDEGridCol = new PSDEGridColDTO();
                psDEGridCol.setPSDEGridColName(psDEField.getPSDEFieldName().toLowerCase());
                psDEGridCol.setGridColType(PSModelEnums.GridColType.DEFGRIDCOLUMN.value);
                psDEGridCol.setOrderValue(4);
                psDEGridCol.setWidth(150);
                psDEGridCol.setPSDEFId(psDEField.getPSDEFieldId());
                psDEGridCol.setPSDEFName(psDEField.getPSDEFieldName());
                psDEGrid.getPSDEGridColsIf().add(psDEGridCol);
            }
            this.iPSDEGridService.create(psDEGrid);
        }
    }

    protected void doInitPSDEForms(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        this.doInitDefaultEditForm(psDataEntityDTO);
        this.doInitDefaultSearchForm(psDataEntityDTO);
        if (DataTypeUtils.getBooleanValue((Object)psDataEntityDTO.getEnableMob(), (Boolean)false).booleanValue()) {
            this.doInitDefaultMobEditForm(psDataEntityDTO);
            this.doInitDefaultMobSearchForm(psDataEntityDTO);
        }
    }

    protected void doInitDefaultMobSearchForm(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        String strDefaultEditFormId = KeyValueUtils.genUniqueId((Object)psDataEntityDTO.getPSDataEntityId(), (Object)PSModelEnums.FormType.SEARCHFORM.value, (Object)"MOB");
        if (this.iPSDEFormService.checkKeyState(strDefaultEditFormId) == 0) {
            PSDEFormDTO psDEForm2;
            PSDEFormDTO psDEForm = new PSDEFormDTO();
            psDEForm.setFormType(PSModelEnums.FormType.SEARCHFORM.value);
            psDEForm.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEForm.setCodeName("MobDef");
            if (this.iPSDEFormService.select(psDEForm, true)) {
                return;
            }
            int nFormIndex = 1;
            String strCodeName = null;
            do {
                strCodeName = String.format("MobDef%1$s", nFormIndex == 1 ? "" : Integer.valueOf(nFormIndex));
                ++nFormIndex;
                psDEForm2 = new PSDEFormDTO();
                psDEForm2.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                psDEForm2.setCodeName(strCodeName);
            } while (this.iPSDEFormService.select(psDEForm2, true));
            psDEForm.resetAll();
            psDEForm.setPSDEFormId(strDefaultEditFormId);
            psDEForm.setMobFlag(1);
            psDEForm.setCodeName(strCodeName);
            psDEForm.setPSDEFormName("\u79fb\u52a8\u7aef\u641c\u7d22\u8868\u5355");
            psDEForm.setFormType(PSModelEnums.FormType.SEARCHFORM.value);
            psDEForm.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            PSDEFormDetailDTO formpage1 = new PSDEFormDetailDTO();
            formpage1.setPSDEFormDetailName("formpage1");
            formpage1.setCaption("\u5e38\u89c4\u6761\u4ef6");
            formpage1.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
            formpage1.setOrderValue(1);
            formpage1.setShowCaption(0);
            psDEForm.getPSDEFormDetailsIf().add(formpage1);
            this.iPSDEFormService.create(psDEForm);
        }
    }

    protected void doInitDefaultMobEditForm(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        String strDefaultEditFormId = KeyValueUtils.genUniqueId((Object)psDataEntityDTO.getPSDataEntityId(), (Object)PSModelEnums.FormType.EDITFORM.value, (Object)"MOB");
        if (this.iPSDEFormService.checkKeyState(strDefaultEditFormId) == 0) {
            PSDEFormDetailDTO psDEFormItem;
            PSDEFormDTO psDEForm2;
            PSDEFormDTO psDEForm = new PSDEFormDTO();
            psDEForm.setFormType(PSModelEnums.FormType.EDITFORM.value);
            psDEForm.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEForm.setCodeName("MobMain");
            if (this.iPSDEFormService.select(psDEForm, true)) {
                return;
            }
            int nFormIndex = 1;
            String strCodeName = null;
            do {
                strCodeName = String.format("MobMain%1$s", nFormIndex == 1 ? "" : Integer.valueOf(nFormIndex));
                ++nFormIndex;
                psDEForm2 = new PSDEFormDTO();
                psDEForm2.setPSDEId(psDataEntityDTO.getPSDataEntityId());
                psDEForm2.setCodeName(strCodeName);
            } while (this.iPSDEFormService.select(psDEForm2, true));
            psDEForm.resetAll();
            psDEForm.setPSDEFormId(strDefaultEditFormId);
            psDEForm.setFormType(PSModelEnums.FormType.EDITFORM.value);
            psDEForm.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEForm.setCodeName(strCodeName);
            psDEForm.setPSDEFormName("\u79fb\u52a8\u7aef\u9ed8\u8ba4\u7f16\u8f91\u8868\u5355");
            psDEForm.setMobFlag(1);
            ISearchContextDTO searchContextDTO = this.iPSDEFieldService.getDataEntityRuntime().createSearchContext().all().count(false).eq("PSDEID", (Object)psDataEntityDTO.getPSDataEntityId());
            List<PSDEFieldDTO> psDEFieldList = this.iPSDEFieldService.rawSelect(searchContextDTO);
            HashMap<String, PSDEFieldDTO> psDEFieldMap = new HashMap<String, PSDEFieldDTO>();
            PSDEFieldDTO majorPSDEField = null;
            PSDEFieldDTO createManPSDEField = null;
            PSDEFieldDTO createDatePSDEField = null;
            PSDEFieldDTO updateManPSDEField = null;
            PSDEFieldDTO updateDatePSDEField = null;
            if (!ObjectUtils.isEmpty((Object)psDEFieldList)) {
                for (PSDEFieldDTO psDEField : psDEFieldList) {
                    psDEFieldMap.put(psDEField.getPSDEFieldName(), psDEField);
                    if (DataTypeUtils.getBooleanValue((Object)psDEField.getMajorField(), (Boolean)false).booleanValue()) {
                        majorPSDEField = psDEField;
                        continue;
                    }
                    if (PSModelEnums.PredefinedFieldType.CREATEMAN.value.equals(psDEField.getPredefinedType())) {
                        createManPSDEField = psDEField;
                        continue;
                    }
                    if (PSModelEnums.PredefinedFieldType.CREATEDATE.value.equals(psDEField.getPredefinedType())) {
                        createDatePSDEField = psDEField;
                        continue;
                    }
                    if (PSModelEnums.PredefinedFieldType.UPDATEMAN.value.equals(psDEField.getPredefinedType())) {
                        updateManPSDEField = psDEField;
                        continue;
                    }
                    if (!PSModelEnums.PredefinedFieldType.UPDATEDATE.value.equals(psDEField.getPredefinedType())) continue;
                    updateDatePSDEField = psDEField;
                }
            }
            PSDEFormDetailDTO formpage1 = new PSDEFormDetailDTO();
            formpage1.setPSDEFormDetailName("formpage1");
            formpage1.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
            formpage1.setOrderValue(1);
            formpage1.setCaption("\u57fa\u672c\u4fe1\u606f");
            psDEForm.getPSDEFormDetailsIf().add(formpage1);
            PSDEFormDetailDTO group1 = new PSDEFormDetailDTO();
            group1.setPSDEFormDetailName("group1");
            group1.setDetailType(PSModelEnums.FormDetailType.GROUPPANEL.value);
            group1.setOrderValue(1);
            group1.setCaption(String.format("%1$s\u57fa\u672c\u4fe1\u606f", psDataEntityDTO.getLogicName()));
            formpage1.getPSDEFormDetailsIf().add(group1);
            if (majorPSDEField != null) {
                PSDEFormDetailDTO majordef = new PSDEFormDetailDTO();
                majordef.setPSDEFormDetailName(majorPSDEField.getPSDEFieldName().toLowerCase());
                majordef.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                majordef.setOrderValue(1);
                majordef.setPSDEFId(majorPSDEField.getPSDEFieldId());
                majordef.setPSDEFName(majorPSDEField.getPSDEFieldName());
                group1.getPSDEFormDetailsIf().add(majordef);
            }
            PSDEFormDetailDTO group2 = new PSDEFormDetailDTO();
            group2.setPSDEFormDetailName("group2");
            group2.setDetailType(PSModelEnums.FormDetailType.GROUPPANEL.value);
            group2.setOrderValue(2);
            group2.setCaption("\u64cd\u4f5c\u4fe1\u606f");
            formpage1.getPSDEFormDetailsIf().add(group2);
            PSDEFieldDTO psDEField = createManPSDEField;
            if (psDEField != null) {
                psDEFormItem = new PSDEFormDetailDTO();
                psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
                psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                psDEFormItem.setOrderValue(1);
                psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
                group2.getPSDEFormDetailsIf().add(psDEFormItem);
            }
            if ((psDEField = createDatePSDEField) != null) {
                psDEFormItem = new PSDEFormDetailDTO();
                psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
                psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                psDEFormItem.setOrderValue(2);
                psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
                group2.getPSDEFormDetailsIf().add(psDEFormItem);
            }
            if ((psDEField = updateManPSDEField) != null) {
                psDEFormItem = new PSDEFormDetailDTO();
                psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
                psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                psDEFormItem.setOrderValue(3);
                psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
                group2.getPSDEFormDetailsIf().add(psDEFormItem);
            }
            if ((psDEField = updateDatePSDEField) != null) {
                psDEFormItem = new PSDEFormDetailDTO();
                psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
                psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                psDEFormItem.setOrderValue(4);
                psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
                group2.getPSDEFormDetailsIf().add(psDEFormItem);
            }
            this.iPSDEFormService.create(psDEForm);
        }
    }

    protected void doInitDefaultSearchForm(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        String strDefaultEditFormId = KeyValueUtils.genUniqueId((Object)psDataEntityDTO.getPSDataEntityId(), (Object)PSModelEnums.FormType.SEARCHFORM.value);
        if (this.iPSDEFormService.checkKeyState(strDefaultEditFormId) == 0) {
            PSDEFormDTO psDEForm = new PSDEFormDTO();
            psDEForm.setFormType(PSModelEnums.FormType.SEARCHFORM.value);
            psDEForm.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEForm.setCodeName("Default");
            if (this.iPSDEFormService.select(psDEForm, true)) {
                return;
            }
            psDEForm.resetAll();
            psDEForm.setPSDEFormId(strDefaultEditFormId);
            psDEForm.setFormType(PSModelEnums.FormType.SEARCHFORM.value);
            psDEForm.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEForm.setCodeName("Default");
            psDEForm.setMobFlag(0);
            psDEForm.setPSDEFormName("\u9ed8\u8ba4\u641c\u7d22\u8868\u5355");
            PSDEFormDetailDTO formpage1 = new PSDEFormDetailDTO();
            formpage1.setPSDEFormDetailName("formpage1");
            formpage1.setCaption("\u5e38\u89c4\u6761\u4ef6");
            formpage1.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
            formpage1.setOrderValue(1);
            formpage1.setShowCaption(0);
            formpage1.setColModel("33%;33%;34%");
            psDEForm.getPSDEFormDetailsIf().add(formpage1);
            this.iPSDEFormService.create(psDEForm);
        }
    }

    protected void doInitDefaultEditForm(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        String strDefaultEditFormId = KeyValueUtils.genUniqueId((Object)psDataEntityDTO.getPSDataEntityId(), (Object)PSModelEnums.FormType.EDITFORM.value);
        if (this.iPSDEFormService.checkKeyState(strDefaultEditFormId) == 0) {
            PSDEFormDetailDTO psDEFormItem;
            PSDEFormDTO psDEForm = new PSDEFormDTO();
            psDEForm.setFormType(PSModelEnums.FormType.EDITFORM.value);
            psDEForm.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEForm.setCodeName("Main");
            if (this.iPSDEFormService.select(psDEForm, true)) {
                return;
            }
            psDEForm.resetAll();
            psDEForm.setPSDEFormId(strDefaultEditFormId);
            psDEForm.setFormType(PSModelEnums.FormType.EDITFORM.value);
            psDEForm.setPSDEId(psDataEntityDTO.getPSDataEntityId());
            psDEForm.setCodeName("Main");
            psDEForm.setPSDEFormName("\u4e3b\u7f16\u8f91\u8868\u5355");
            psDEForm.setMobFlag(0);
            ISearchContextDTO searchContextDTO = this.iPSDEFieldService.getDataEntityRuntime().createSearchContext().all().count(false).eq("PSDEID", (Object)psDataEntityDTO.getPSDataEntityId());
            List<PSDEFieldDTO> psDEFieldList = this.iPSDEFieldService.rawSelect(searchContextDTO);
            HashMap<String, PSDEFieldDTO> psDEFieldMap = new HashMap<String, PSDEFieldDTO>();
            PSDEFieldDTO majorPSDEField = null;
            PSDEFieldDTO createManPSDEField = null;
            PSDEFieldDTO createDatePSDEField = null;
            PSDEFieldDTO updateManPSDEField = null;
            PSDEFieldDTO updateDatePSDEField = null;
            if (!ObjectUtils.isEmpty((Object)psDEFieldList)) {
                for (PSDEFieldDTO psDEField : psDEFieldList) {
                    psDEFieldMap.put(psDEField.getPSDEFieldName(), psDEField);
                    if (DataTypeUtils.getBooleanValue((Object)psDEField.getMajorField(), (Boolean)false).booleanValue()) {
                        majorPSDEField = psDEField;
                        continue;
                    }
                    if (PSModelEnums.PredefinedFieldType.CREATEMAN.value.equals(psDEField.getPredefinedType())) {
                        createManPSDEField = psDEField;
                        continue;
                    }
                    if (PSModelEnums.PredefinedFieldType.CREATEDATE.value.equals(psDEField.getPredefinedType())) {
                        createDatePSDEField = psDEField;
                        continue;
                    }
                    if (PSModelEnums.PredefinedFieldType.UPDATEMAN.value.equals(psDEField.getPredefinedType())) {
                        updateManPSDEField = psDEField;
                        continue;
                    }
                    if (!PSModelEnums.PredefinedFieldType.UPDATEDATE.value.equals(psDEField.getPredefinedType())) continue;
                    updateDatePSDEField = psDEField;
                }
            }
            PSDEFormDetailDTO formpage1 = new PSDEFormDetailDTO();
            formpage1.setPSDEFormDetailName("formpage1");
            formpage1.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
            formpage1.setOrderValue(1);
            formpage1.setCaption("\u57fa\u672c\u4fe1\u606f");
            psDEForm.getPSDEFormDetailsIf().add(formpage1);
            PSDEFormDetailDTO group1 = new PSDEFormDetailDTO();
            group1.setPSDEFormDetailName("group1");
            group1.setDetailType(PSModelEnums.FormDetailType.GROUPPANEL.value);
            group1.setOrderValue(1);
            group1.setCaption(String.format("%1$s\u57fa\u672c\u4fe1\u606f", psDataEntityDTO.getLogicName()));
            group1.setColModel("50%;50%");
            formpage1.getPSDEFormDetailsIf().add(group1);
            if (majorPSDEField != null) {
                PSDEFormDetailDTO majordef = new PSDEFormDetailDTO();
                majordef.setPSDEFormDetailName(majorPSDEField.getPSDEFieldName().toLowerCase());
                majordef.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                majordef.setOrderValue(1);
                majordef.setPSDEFId(majorPSDEField.getPSDEFieldId());
                majordef.setPSDEFName(majorPSDEField.getPSDEFieldName());
                group1.getPSDEFormDetailsIf().add(majordef);
            }
            PSDEFormDetailDTO formpage2 = new PSDEFormDetailDTO();
            formpage2.setPSDEFormDetailName("formpage2");
            formpage2.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
            formpage2.setOrderValue(2);
            formpage2.setCaption("\u5176\u5b83");
            psDEForm.getPSDEFormDetailsIf().add(formpage2);
            PSDEFormDetailDTO group2 = new PSDEFormDetailDTO();
            group2.setPSDEFormDetailName("group2");
            group2.setDetailType(PSModelEnums.FormDetailType.GROUPPANEL.value);
            group2.setOrderValue(2);
            group2.setCaption("\u64cd\u4f5c\u4fe1\u606f");
            group2.setColModel("50%;50%");
            formpage2.getPSDEFormDetailsIf().add(group2);
            PSDEFieldDTO psDEField = createManPSDEField;
            if (psDEField != null) {
                psDEFormItem = new PSDEFormDetailDTO();
                psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
                psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                psDEFormItem.setOrderValue(1);
                psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
                group2.getPSDEFormDetailsIf().add(psDEFormItem);
            }
            if ((psDEField = createDatePSDEField) != null) {
                psDEFormItem = new PSDEFormDetailDTO();
                psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
                psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                psDEFormItem.setOrderValue(2);
                psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
                group2.getPSDEFormDetailsIf().add(psDEFormItem);
            }
            if ((psDEField = updateManPSDEField) != null) {
                psDEFormItem = new PSDEFormDetailDTO();
                psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
                psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                psDEFormItem.setOrderValue(3);
                psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
                group2.getPSDEFormDetailsIf().add(psDEFormItem);
            }
            if ((psDEField = updateDatePSDEField) != null) {
                psDEFormItem = new PSDEFormDetailDTO();
                psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
                psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
                psDEFormItem.setOrderValue(4);
                psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
                group2.getPSDEFormDetailsIf().add(psDEFormItem);
            }
            this.iPSDEFormService.create(psDEForm);
        }
    }

    protected void doInitModelRTModes(PSDataEntityDTO et) throws Throwable {
        int nDefaultAccMode;
        boolean bMajor;
        boolean bl = bMajor = DataTypeUtils.getIntegerValue((Object)et.getDEType(), (Integer)1) == 1;
        if (bMajor) {
            this.doInitSimplePSDataQuery(et);
            if (DataTypeUtils.getBooleanValue((Object)et.getEnableOrgModel(), (Boolean)true).booleanValue()) {
                this.doInitDEOrgModels(et);
            }
        }
        if (DataTypeUtils.getIntegerValue((Object)et.getEnableAudit(), (Integer)0) == 1) {
            this.doInitAuditPSDataQuery(et);
        }
        int n = nDefaultAccMode = bMajor ? 0 : 2;
        if ((DataTypeUtils.getIntegerValue((Object)et.getDataAccMode(), (Integer)nDefaultAccMode) & 2) == 2) {
            this.doInitMapPSDEOPPrivs(et);
        }
    }

    protected void doInitDEOrgModels(PSDataEntityDTO et) throws Throwable {
        PSDCMTDEFDTO psDCMTDEF;
        PSDEFieldDTO psDEField;
        boolean bIgnoreInit = false;
        if (DataTypeUtils.getBooleanValue((Object)et.getExistingModel(), (Boolean)false).booleanValue()) {
            bIgnoreInit = true;
        }
        if (!bIgnoreInit && DataTypeUtils.getIntegerValue((Object)et.getVirtualFlag(), (Integer)0) > 0) {
            bIgnoreInit = true;
        }
        if (!bIgnoreInit && (StringUtils.hasLength((String)et.getPSSubSysServiceAPIId()) || StringUtils.hasLength((String)et.getPSSubSysSADEId()))) {
            bIgnoreInit = true;
        }
        PSDevSlnSysDTO psDevSlnSys = this.getPSDevSlnSysDTO(this.getCurrentPSDevSlnSysId());
        HashMap<String, PSDCMTDEFDTO> pdtPSDCMTDEFMap = new HashMap<String, PSDCMTDEFDTO>();
        if (StringUtils.hasLength((String)psDevSlnSys.getPSDCModelTemplId())) {
            List<PSDCMTDEFDTO> psDCMTDEFList = this.getPSDCMTDEFDTOs(psDevSlnSys.getPSDCModelTemplId());
            for (PSDCMTDEFDTO psDCMTDEF2 : psDCMTDEFList) {
                if (ObjectUtils.isEmpty((Object)psDCMTDEF2.getPredefinedType())) continue;
                pdtPSDCMTDEFMap.put(psDCMTDEF2.getPredefinedType(), psDCMTDEF2);
            }
        }
        if (!bIgnoreInit) {
            psDEField = new PSDEFieldDTO();
            psDEField.setPSDEId(et.getPSDataEntityId());
            psDEField.setPreDefineType(PSModelEnums.PredefinedFieldType.ORGID.value);
            if (!this.iPSDEFieldService.select(psDEField, true)) {
                psDEField.resetPreDefineType();
                psDEField.setPSDEFieldName(PSModelEnums.PredefinedFieldType.ORGID.value);
                if (!this.iPSDEFieldService.select(psDEField, true)) {
                    psDCMTDEF = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.remove(PSModelEnums.PredefinedFieldType.ORGID.value));
                    if (psDCMTDEF != null) {
                        psDEField.setPSDEFieldName(psDCMTDEF.getPSDCMTDEFName());
                        psDEField.setCodeName(psDCMTDEF.getCodeName());
                        psDEField.setLogicName(psDCMTDEF.getLogicName());
                        psDEField.setPSDataTypeId(psDCMTDEF.getDEFDataType());
                        psDEField.setLength(psDCMTDEF.getLength());
                        psDEField.setPreDefineType(PSModelEnums.PredefinedFieldType.ORGID.value);
                    } else {
                        if (this.isEnableCodeNameUpperCamel()) {
                            psDEField.setPSDEFieldName(String.format("ORG_ID", new Object[0]));
                        } else {
                            psDEField.setPSDEFieldName(String.format("ORGID", new Object[0]));
                        }
                        psDEField.setLogicName("\u7ec4\u7ec7\u673a\u6784\u6807\u8bc6");
                        psDEField.setCodeName("OrgId");
                        psDEField.setPSDataTypeId(PSModelEnums.DEFDataType.TEXT.value);
                        psDEField.setLength(60);
                        psDEField.setPreDefineType(PSModelEnums.PredefinedFieldType.ORGID.value);
                    }
                    psDEField.setPSDEId(et.getPSDataEntityId());
                    psDEField.setTableName(et.getTableName());
                    psDEField.setDEFType(1);
                    psDEField.setPhysicalField(1);
                    psDEField.setAllowEmpty(1);
                    psDEField.setMajorField(0);
                    psDEField.setPKey(0);
                    psDEField.setFKey(0);
                    try {
                        this.iPSDEFieldService.create(psDEField);
                        this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u5c5e\u6027[%2$s]", et.getPSDataEntityName(), psDEField.getPSDEFieldName()), false);
                    }
                    catch (Exception ex) {
                        log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEField.getPSDEFieldName(), ex.getMessage()), (Throwable)ex);
                        this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u5c5e\u6027[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEField.getPSDEFieldName(), ex.getMessage()), false);
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEField.getPSDEFieldName(), ex.getMessage()), ex);
                    }
                }
            }
        }
        if (!bIgnoreInit) {
            psDEField = new PSDEFieldDTO();
            psDEField.setPSDEId(et.getPSDataEntityId());
            psDEField.setPreDefineType(PSModelEnums.PredefinedFieldType.ORGSECTORID.value);
            if (!this.iPSDEFieldService.select(psDEField, true)) {
                psDEField.resetPreDefineType();
                psDEField.setPSDEFieldName(PSModelEnums.PredefinedFieldType.ORGSECTORID.value);
                if (!this.iPSDEFieldService.select(psDEField, true)) {
                    psDEField.setPSDEFieldName("DEPTID");
                    if (!this.iPSDEFieldService.select(psDEField, true)) {
                        psDCMTDEF = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.remove(PSModelEnums.PredefinedFieldType.ORGSECTORID.value));
                        if (psDCMTDEF != null) {
                            psDEField.setPSDEFieldName(psDCMTDEF.getPSDCMTDEFName());
                            psDEField.setCodeName(psDCMTDEF.getCodeName());
                            psDEField.setLogicName(psDCMTDEF.getLogicName());
                            psDEField.setPSDataTypeId(psDCMTDEF.getDEFDataType());
                            psDEField.setLength(psDCMTDEF.getLength());
                            psDEField.setPreDefineType(PSModelEnums.PredefinedFieldType.ORGSECTORID.value);
                        } else {
                            if (this.isEnableCodeNameUpperCamel()) {
                                psDEField.setPSDEFieldName(String.format("DEPT_ID", new Object[0]));
                            } else {
                                psDEField.setPSDEFieldName(String.format("DEPTID", new Object[0]));
                            }
                            psDEField.setLogicName("\u7ec4\u7ec7\u90e8\u95e8\u6807\u8bc6");
                            psDEField.setCodeName("DeptId");
                            psDEField.setPSDataTypeId(PSModelEnums.DEFDataType.TEXT.value);
                            psDEField.setLength(60);
                            psDEField.setPreDefineType(PSModelEnums.PredefinedFieldType.ORGSECTORID.value);
                        }
                        psDEField.setPSDEId(et.getPSDataEntityId());
                        psDEField.setTableName(et.getTableName());
                        psDEField.setDEFType(1);
                        psDEField.setPhysicalField(1);
                        psDEField.setAllowEmpty(1);
                        psDEField.setMajorField(0);
                        psDEField.setPKey(0);
                        psDEField.setFKey(0);
                        try {
                            this.iPSDEFieldService.create(psDEField);
                            this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u5c5e\u6027[%2$s]", et.getPSDataEntityName(), psDEField.getPSDEFieldName()), false);
                        }
                        catch (Exception ex) {
                            log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEField.getPSDEFieldName(), ex.getMessage()), (Throwable)ex);
                            this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u5c5e\u6027[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEField.getPSDEFieldName(), ex.getMessage()), false);
                            throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEField.getPSDEFieldName(), ex.getMessage()), ex);
                        }
                    }
                }
            }
        }
        ISearchContextDTO psDEOPPrivSearchContextDTO = this.iPSDEOPPrivService.createSearchContextDTO();
        psDEOPPrivSearchContextDTO.set("PSDEID", et.getPSDataEntityId());
        List<PSDEOPPrivDTO> psDEOPPrivDTOList = this.iPSDEOPPrivService.select(psDEOPPrivSearchContextDTO);
        if (!ObjectUtils.isEmpty((Object)psDEOPPrivDTOList)) {
            PSDEOPPrivRoleDTO psDEOPPrivRole;
            PSDEUserRoleDTO psDEUserRole;
            HashMap<String, PSDEOPPrivDTO> psDEOPPrivMap = new HashMap<String, PSDEOPPrivDTO>();
            for (PSDEOPPrivDTO psDEOPPriv : psDEOPPrivDTOList) {
                if (psDEOPPrivMap.containsKey(psDEOPPriv.getPSDEOPPrivName()) && !ObjectUtils.isEmpty((Object)psDEOPPriv.getPSDERId())) continue;
                psDEOPPrivMap.put(psDEOPPriv.getPSDEOPPrivName(), psDEOPPriv);
            }
            PSDEOPPrivDTO readPSDEOPPriv = (PSDEOPPrivDTO)((Object)psDEOPPrivMap.get("READ"));
            PSDEOPPrivDTO writedPSDEOPPriv = (PSDEOPPrivDTO)((Object)psDEOPPrivMap.get("UPDATE"));
            PSDEOPPrivDTO deletePSDEOPPriv = (PSDEOPPrivDTO)((Object)psDEOPPrivMap.get("DELETE"));
            PSDEOPPrivDTO createPSDEOPPriv = (PSDEOPPrivDTO)((Object)psDEOPPrivMap.get("CREATE"));
            if (readPSDEOPPriv != null) {
                psDEUserRole = new PSDEUserRoleDTO();
                psDEUserRole.setPSDEId(et.getPSDataEntityId());
                psDEUserRole.setUserRoleTag("ALL_R");
                if (!this.iPSDEUserRoleService.select(psDEUserRole, true)) {
                    psDEUserRole.setPSDEUserRoleName("\u5168\u90e8\u6570\u636e\uff08\u8bfb\uff09");
                    psDEUserRole.setDefaultFlag(0);
                    psDEUserRole.setAllDataFlag(1);
                    try {
                        this.iPSDEUserRoleService.create(psDEUserRole);
                        this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName()), false);
                    }
                    catch (Exception ex) {
                        log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), (Throwable)ex);
                        this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), false);
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), ex);
                    }
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(readPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(readPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(readPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                }
                psDEUserRole = new PSDEUserRoleDTO();
                psDEUserRole.setPSDEId(et.getPSDataEntityId());
                psDEUserRole.setUserRoleTag("CURORG_R");
                if (!this.iPSDEUserRoleService.select(psDEUserRole, true)) {
                    psDEUserRole.setPSDEUserRoleName("\u5f53\u524d\u7ec4\u7ec7\uff08\u8bfb\uff09");
                    psDEUserRole.setDefaultFlag(0);
                    psDEUserRole.setEnableOrgDR(1);
                    psDEUserRole.setOrgDR(PSModelEnums.OrgScope.CURRENT.value);
                    try {
                        this.iPSDEUserRoleService.create(psDEUserRole);
                        this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName()), false);
                    }
                    catch (Exception ex) {
                        log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), (Throwable)ex);
                        this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), false);
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), ex);
                    }
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(readPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(readPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(readPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                }
                psDEUserRole = new PSDEUserRoleDTO();
                psDEUserRole.setPSDEId(et.getPSDataEntityId());
                psDEUserRole.setUserRoleTag("CURDEPT_R");
                if (!this.iPSDEUserRoleService.select(psDEUserRole, true)) {
                    psDEUserRole.setPSDEUserRoleName("\u5f53\u524d\u90e8\u95e8\uff08\u8bfb\uff09");
                    psDEUserRole.setDefaultFlag(0);
                    psDEUserRole.setEnableSecDR(1);
                    psDEUserRole.setSecDR(PSModelEnums.DeptScope.CURRENT.value);
                    try {
                        this.iPSDEUserRoleService.create(psDEUserRole);
                        this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName()), false);
                    }
                    catch (Exception ex) {
                        log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), (Throwable)ex);
                        this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), false);
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), ex);
                    }
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(readPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(readPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(readPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                }
            }
            if (readPSDEOPPriv != null && writedPSDEOPPriv != null && deletePSDEOPPriv != null && createPSDEOPPriv != null) {
                psDEUserRole = new PSDEUserRoleDTO();
                psDEUserRole.setPSDEId(et.getPSDataEntityId());
                psDEUserRole.setUserRoleTag("ALL_RW");
                if (!this.iPSDEUserRoleService.select(psDEUserRole, true)) {
                    psDEUserRole.setPSDEUserRoleName("\u5168\u90e8\u6570\u636e\uff08\u8bfb\u5199\uff09");
                    psDEUserRole.setDefaultFlag(0);
                    psDEUserRole.setAllDataFlag(1);
                    try {
                        this.iPSDEUserRoleService.create(psDEUserRole);
                        this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName()), false);
                    }
                    catch (Exception ex) {
                        log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), (Throwable)ex);
                        this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), false);
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), ex);
                    }
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(readPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(readPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(readPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(writedPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(writedPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(writedPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(deletePSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(deletePSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(deletePSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(createPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(createPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(createPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                }
                psDEUserRole = new PSDEUserRoleDTO();
                psDEUserRole.setPSDEId(et.getPSDataEntityId());
                psDEUserRole.setUserRoleTag("CURORG_RW");
                if (!this.iPSDEUserRoleService.select(psDEUserRole, true)) {
                    psDEUserRole.setPSDEUserRoleName("\u5f53\u524d\u7ec4\u7ec7\uff08\u8bfb\u5199\uff09");
                    psDEUserRole.setDefaultFlag(0);
                    psDEUserRole.setEnableOrgDR(1);
                    psDEUserRole.setOrgDR(PSModelEnums.OrgScope.CURRENT.value);
                    try {
                        this.iPSDEUserRoleService.create(psDEUserRole);
                        this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName()), false);
                    }
                    catch (Exception ex) {
                        log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), (Throwable)ex);
                        this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), false);
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), ex);
                    }
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(readPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(readPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(readPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(writedPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(writedPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(writedPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(deletePSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(deletePSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(deletePSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(createPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(createPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(createPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                }
                psDEUserRole = new PSDEUserRoleDTO();
                psDEUserRole.setPSDEId(et.getPSDataEntityId());
                psDEUserRole.setUserRoleTag("CURDEPT_RW");
                if (!this.iPSDEUserRoleService.select(psDEUserRole, true)) {
                    psDEUserRole.setPSDEUserRoleName("\u5f53\u524d\u90e8\u95e8\uff08\u8bfb\u5199\uff09");
                    psDEUserRole.setDefaultFlag(0);
                    psDEUserRole.setEnableSecDR(1);
                    psDEUserRole.setSecDR(PSModelEnums.DeptScope.CURRENT.value);
                    try {
                        this.iPSDEUserRoleService.create(psDEUserRole);
                        this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName()), false);
                    }
                    catch (Exception ex) {
                        log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), (Throwable)ex);
                        this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u89d2\u8272[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), false);
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u89d2\u8272[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEUserRole.getPSDEUserRoleName(), ex.getMessage()), ex);
                    }
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(readPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(readPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(readPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(writedPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(writedPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(writedPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(deletePSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(deletePSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(deletePSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                    psDEOPPrivRole = new PSDEOPPrivRoleDTO();
                    psDEOPPrivRole.setPSDEId(et.getPSDataEntityId());
                    psDEOPPrivRole.setPSDEName(et.getPSDataEntityName());
                    psDEOPPrivRole.setRoleType(PSModelEnums.DEOPPrivRoleType.DEROLE.value);
                    psDEOPPrivRole.setPSDEUserRoleId(psDEUserRole.getPSDEUserRoleId());
                    psDEOPPrivRole.setPSDEOPPrivId(createPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPrivRole.setPSDEOPPrivName(createPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPrivRole.setPSDEOPPrivRoleName(createPSDEOPPriv.getPSDEOPPrivName());
                    this.iPSDEOPPrivRoleService.create(psDEOPPrivRole);
                }
            }
        }
    }

    protected void doInitWFPSDEActions(PSDataEntityDTO et) throws Throwable {
        for (Map.Entry<String, String> entry : wfActionMap.entrySet()) {
            PSDEActionDTO psDEAction = new PSDEActionDTO();
            psDEAction.setPSDEId(et.getPSDataEntityId());
            psDEAction.setPSDEActionName(entry.getKey());
            if (this.iPSDEActionService.select(psDEAction, true)) continue;
            psDEAction.setPSDEName(et.getPSDataEntityName());
            psDEAction.setCodeName(entry.getKey());
            psDEAction.setLogicName(entry.getValue());
            psDEAction.setActionType(PSModelEnums.DEActionType.BUILTIN.value);
            if (DataTypeUtils.compare((String)entry.getKey(), (String)"wfStart", (boolean)false) != 0L) {
                psDEAction.setPubMode(0);
            }
            try {
                this.iPSDEActionService.create(psDEAction);
                this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u884c\u4e3a[%2$s]", et.getPSDataEntityName(), psDEAction.getPSDEActionName()), false);
            }
            catch (Exception ex) {
                log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u884c\u4e3a[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEAction.getPSDEActionName(), ex.getMessage()), (Throwable)ex);
                this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u884c\u4e3a[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEAction.getPSDEActionName(), ex.getMessage()), false);
                throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u884c\u4e3a[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEAction.getPSDEActionName(), ex.getMessage()), ex);
            }
        }
    }

    protected void doInitMapPSDEOPPrivs(PSDataEntityDTO et) throws Throwable {
        ISearchContextDTO psDERSearchContextDTO = this.iPSDERService.getDataEntityRuntime().createSearchContext();
        psDERSearchContextDTO.eq("pssystemid", (Object)et.getPSSystemId()).eq("MAJORPSDEID", (Object)et.getPSDataEntityId()).all();
        List<PSDERDTO> psDERList = this.iPSDERService.select(psDERSearchContextDTO);
        if (psDERList == null) {
            return;
        }
        PSSystemDTO psSystem = this.getCurrentPSSystemDTO();
        for (PSDERDTO psDER : psDERList) {
            String[] actions;
            int nMasterRS;
            if (!PSModelEnums.DERType.DER1N.value.equals(psDER.getDERType()) && (!PSModelEnums.DERType.DERCUSTOM.value.equals(psDER.getDERType()) || !PSModelEnums.DERType.DER1N.value.equals(psDER.getDERSubType())) || ((nMasterRS = DataTypeUtils.getIntegerValue((Object)psDER.getMasterRS(), (Integer)0).intValue()) & PSModelEnums.DER1NMasterRS.DAC.value) == 0) continue;
            PSDEOPPrivDTO readPSDEOPPriv = null;
            PSDEOPPrivDTO writedPSDEOPPriv = null;
            ISearchContextDTO psDEOPPrivSearchContext = this.iPSDEOPPrivService.getDataEntityRuntime().createSearchContext();
            psDEOPPrivSearchContext.set("PSDEID", et.getPSDataEntityId());
            List<PSDEOPPrivDTO> psDEOPPrivDTOList = this.iPSDEOPPrivService.select(psDEOPPrivSearchContext);
            if (!ObjectUtils.isEmpty((Object)psDEOPPrivDTOList)) {
                HashMap<String, PSDEOPPrivDTO> psDEOPPrivMap = new HashMap<String, PSDEOPPrivDTO>();
                for (PSDEOPPrivDTO psDEOPPriv : psDEOPPrivDTOList) {
                    if (psDEOPPrivMap.containsKey(psDEOPPriv.getPSDEOPPrivName()) || !ObjectUtils.isEmpty((Object)psDEOPPriv.getPSDERId())) continue;
                    psDEOPPrivMap.put(psDEOPPriv.getPSDEOPPrivName(), psDEOPPriv);
                }
                readPSDEOPPriv = (PSDEOPPrivDTO)((Object)psDEOPPrivMap.get("READ"));
                writedPSDEOPPriv = (PSDEOPPrivDTO)((Object)psDEOPPrivMap.get("UPDATE"));
            }
            if (readPSDEOPPriv != null) {
                PSDEOPPrivDTO psDEOPPriv = new PSDEOPPrivDTO();
                psDEOPPriv.setPSDEId(et.getPSDataEntityId());
                psDEOPPriv.setPSDEOPPrivName("READ");
                psDEOPPriv.setPSDERId(psDER.getPSDERId());
                if (!this.iPSDEOPPrivService.select(psDEOPPriv, true)) {
                    psDEOPPriv.setMapPSDEOPPrivId(readPSDEOPPriv.getPSDEOPPrivId());
                    psDEOPPriv.setMapPSDEOPPrivName(readPSDEOPPriv.getPSDEOPPrivName());
                    psDEOPPriv.setPSSystemId(psSystem.getPSSystemId());
                    psDEOPPriv.setPSSystemName(psSystem.getPSSystemName());
                    try {
                        this.iPSDEOPPrivService.create(psDEOPPriv);
                        this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u6807\u8bc6[%2$s]", et.getPSDataEntityName(), psDEOPPriv.getPSDEOPPrivName()), false);
                    }
                    catch (Exception ex) {
                        log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u6807\u8bc6[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEOPPriv.getPSDEOPPrivName(), ex.getMessage()), (Throwable)ex);
                        this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u6807\u8bc6[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEOPPriv.getPSDEOPPrivName(), ex.getMessage()), false);
                        throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u6807\u8bc6[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEOPPriv.getPSDEOPPrivName(), ex.getMessage()), ex);
                    }
                }
            }
            if (writedPSDEOPPriv == null) continue;
            for (String strDataAccAction : actions = new String[]{"UPDATE", "CREATE", "DELETE"}) {
                PSDEOPPrivDTO psDEOPPriv = new PSDEOPPrivDTO();
                psDEOPPriv.setPSDEId(et.getPSDataEntityId());
                psDEOPPriv.setPSDEOPPrivName(strDataAccAction);
                psDEOPPriv.setPSDERId(psDER.getPSDERId());
                if (this.iPSDEOPPrivService.select(psDEOPPriv, true)) continue;
                psDEOPPriv.setMapPSDEOPPrivId(writedPSDEOPPriv.getPSDEOPPrivId());
                psDEOPPriv.setMapPSDEOPPrivName(writedPSDEOPPriv.getPSDEOPPrivName());
                psDEOPPriv.setPSSystemId(psSystem.getPSSystemId());
                psDEOPPriv.setPSSystemName(psSystem.getPSSystemName());
                try {
                    this.iPSDEOPPrivService.create(psDEOPPriv);
                    this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u6807\u8bc6[%2$s]", et.getPSDataEntityName(), psDEOPPriv.getPSDEOPPrivName()), false);
                }
                catch (Exception ex) {
                    log.error((Object)String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u6807\u8bc6[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEOPPriv.getPSDEOPPrivName(), ex.getMessage()), (Throwable)ex);
                    this.sendStudioConsole(true, 40000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u64cd\u4f5c\u6807\u8bc6[%2$s]\u53d1\u751f\u5f02\u5e38\uff0c%3$s", et.getPSDataEntityName(), psDEOPPriv.getPSDEOPPrivName(), ex.getMessage()), false);
                    throw new Exception(String.format("\u5efa\u7acb\u5b9e\u4f53\u64cd\u4f5c\u6807\u8bc6[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEOPPriv.getPSDEOPPrivName(), ex.getMessage()), ex);
                }
            }
        }
    }

    protected void doInitAuditPSDataQuery(PSDataEntityDTO et) throws Throwable {
        PSDEFGroupDTO psDEFGroup = new PSDEFGroupDTO();
        psDEFGroup.setPSDEId(et.getPSDataEntityId());
        psDEFGroup.setGroupType(PSModelEnums.DEFGroupType.AUDITFIELDS.value);
        boolean bNewDEFGroup = false;
        if (!this.iPSDEFGroupService.select(psDEFGroup, true)) {
            psDEFGroup.setCodeName("Audit");
            psDEFGroup.setPSDEFGroupName("\u5ba1\u8ba1\u5c5e\u6027\u7ec4");
            this.iPSDEFGroupService.create(psDEFGroup);
            this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u5c5e\u6027\u7ec4[%2$s]", et.getPSDataEntityName(), psDEFGroup.getPSDEFGroupName()), false);
            bNewDEFGroup = true;
        }
        PSDEDataQueryDTO psDEDataQuery = new PSDEDataQueryDTO();
        psDEDataQuery.setPSDEId(et.getPSDataEntityId());
        psDEDataQuery.setViewColLevel(PSModelEnums.DEDataQueryViewLevel.DEFGROUP.value);
        psDEDataQuery.setPSDEFGroupId(psDEFGroup.getPSDEFGroupId());
        if (bNewDEFGroup || !this.iPSDEDataQueryService.select(psDEDataQuery, true)) {
            psDEDataQuery.setCodeName("Audit");
            psDEDataQuery.setPSDEDataQueryName("AUDIT");
            psDEDataQuery.setLogicName("\u5ba1\u8ba1\u5c5e\u6027\u67e5\u8be2");
            psDEDataQuery.setPubMode(0);
            PSDEDQJoinDTO psDEDataQueryJoin = new PSDEDQJoinDTO();
            psDEDataQueryJoin.setJoinPSDEId(psDEDataQuery.getPSDEId());
            psDEDataQueryJoin.setJoinPSDEName(psDEDataQuery.getPSDEName());
            psDEDataQueryJoin.setMainFlag(1);
            psDEDataQueryJoin.setPSDEJoinTypeId("MAIN");
            psDEDataQueryJoin.setPSDEDQJoinName(psDEDataQuery.getPSDEName());
            psDEDataQuery.getPSDEDQJoinsIf().add(psDEDataQueryJoin);
            this.iPSDEDataQueryService.create(psDEDataQuery);
            this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u6570\u636e\u67e5\u8be2[%2$s]", et.getPSDataEntityName(), psDEDataQuery.getPSDEDataQueryName()), false);
        }
    }

    protected void doInitSimplePSDataQuery(PSDataEntityDTO et) throws Throwable {
        PSDEFGroupDTO psDEFGroup = new PSDEFGroupDTO();
        psDEFGroup.setPSDEId(et.getPSDataEntityId());
        psDEFGroup.setGroupType(PSModelEnums.DEFGroupType.BASEFIELDS.value);
        boolean bNewDEFGroup = false;
        if (!this.iPSDEFGroupService.select(psDEFGroup, true)) {
            psDEFGroup.setCodeName("Simple");
            psDEFGroup.setPSDEFGroupName("\u57fa\u7840\u5c5e\u6027\u7ec4");
            this.iPSDEFGroupService.create(psDEFGroup);
            this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u5c5e\u6027\u7ec4[%2$s]", et.getPSDataEntityName(), psDEFGroup.getPSDEFGroupName()), false);
            bNewDEFGroup = true;
        }
        PSDEDataQueryDTO psDEDataQuery = new PSDEDataQueryDTO();
        psDEDataQuery.setPSDEId(et.getPSDataEntityId());
        psDEDataQuery.setViewColLevel(PSModelEnums.DEDataQueryViewLevel.DEFGROUP.value);
        psDEDataQuery.setPSDEFGroupId(psDEFGroup.getPSDEFGroupId());
        if (bNewDEFGroup || !this.iPSDEDataQueryService.select(psDEDataQuery, true)) {
            psDEDataQuery.setCodeName("Simple");
            psDEDataQuery.setPSDEDataQueryName("SIMPLE");
            psDEDataQuery.setLogicName("\u57fa\u7840\u5c5e\u6027\u67e5\u8be2");
            psDEDataQuery.setPubMode(0);
            PSDEDQJoinDTO psDEDataQueryJoin = new PSDEDQJoinDTO();
            psDEDataQueryJoin.setJoinPSDEId(psDEDataQuery.getPSDEId());
            psDEDataQueryJoin.setJoinPSDEName(psDEDataQuery.getPSDEName());
            psDEDataQueryJoin.setMainFlag(1);
            psDEDataQueryJoin.setPSDEJoinTypeId("MAIN");
            psDEDataQueryJoin.setPSDEDQJoinName(psDEDataQuery.getPSDEName());
            psDEDataQuery.getPSDEDQJoinsIf().add(psDEDataQueryJoin);
            this.iPSDEDataQueryService.create(psDEDataQuery);
            this.sendStudioConsole(true, 20000, String.format("\u5b9e\u4f53[%1$s]\u5efa\u7acb\u6570\u636e\u67e5\u8be2[%2$s]", et.getPSDataEntityName(), psDEDataQuery.getPSDEDataQueryName()), false);
        }
    }

    protected void doInitPSDEFields(PSDataEntityDTO psDataEntity) throws Throwable {
        PSModuleDTO psModule;
        boolean bIgnoreInit = false;
        if (DataTypeUtils.getBooleanValue((Object)psDataEntity.getExistingModel(), (Boolean)false).booleanValue()) {
            this.sendStudioConsole(true, 30000, String.format("\u73b0\u6709\u7ed3\u6784\u5b9e\u4f53[%1$s]\u4e0d\u4f1a\u81ea\u52a8\u521d\u59cb\u5316\u9ed8\u8ba4\u5c5e\u6027", psDataEntity.getPSDataEntityName()), false);
            bIgnoreInit = true;
        }
        if (!bIgnoreInit && DataTypeUtils.getIntegerValue((Object)psDataEntity.getVirtualFlag(), (Integer)0) > 0) {
            bIgnoreInit = true;
            this.sendStudioConsole(true, 30000, String.format("\u865a\u62df\u5b9e\u4f53[%1$s]\u4e0d\u4f1a\u81ea\u52a8\u521d\u59cb\u5316\u9ed8\u8ba4\u5c5e\u6027", psDataEntity.getPSDataEntityName()), false);
        }
        if (!bIgnoreInit && !ObjectUtils.isEmpty((Object)psDataEntity.getPSSubSysSADEId())) {
            bIgnoreInit = true;
            this.sendStudioConsole(true, 30000, String.format("\u5916\u90e8\u63a5\u53e3\u5b9e\u4f53[%1$s]\u4e0d\u4f1a\u81ea\u52a8\u521d\u59cb\u5316\u9ed8\u8ba4\u5c5e\u6027", psDataEntity.getPSDataEntityName()), false);
        }
        if (!bIgnoreInit && StringUtils.hasLength((String)psDataEntity.getPSModuleId()) && DataTypeUtils.getBooleanValue((Object)(psModule = this.getPSModuleDTO(psDataEntity.getPSModuleId())).getSubSysModule(), (Boolean)false).booleanValue()) {
            bIgnoreInit = true;
            this.sendStudioConsole(true, 30000, String.format("\u5b50\u7cfb\u7edf\u5b9e\u4f53[%1$s]\u4e0d\u4f1a\u81ea\u52a8\u521d\u59cb\u5316\u9ed8\u8ba4\u5c5e\u6027", psDataEntity.getPSDataEntityName()), false);
        }
        if (!bIgnoreInit) {
            PSModelEnums.DEFDataType defDataType;
            PSModelEnums.DEFDataType defDataType2;
            String strDEFName;
            PSDCMTDEFDTO psDCMTDEF2;
            boolean bEnableCodeNameUpperCamel = false;
            String strDEName = psDataEntity.getPSDataEntityName();
            String strDELogicName = psDataEntity.getLogicName();
            String strDECodeName = psDataEntity.getCodeName();
            PSDevSlnSysDTO psDevSlnSys = this.getPSDevSlnSysDTO(this.getCurrentPSDevSlnSysId());
            ArrayList<PSDCMTDEFDTO> otherPSDCMTDEFList = new ArrayList<PSDCMTDEFDTO>();
            PSDCMTDEFDTO keyPSDCMTDEF = null;
            PSDCMTDEFDTO majorPSDCMTDEF = null;
            HashMap<String, PSDCMTDEFDTO> pdtPSDCMTDEFMap = new HashMap<String, PSDCMTDEFDTO>();
            if (StringUtils.hasLength((String)psDevSlnSys.getPSDCModelTemplId())) {
                List<PSDCMTDEFDTO> psDCMTDEFList = this.getPSDCMTDEFDTOs(psDevSlnSys.getPSDCModelTemplId());
                for (PSDCMTDEFDTO psDCMTDEFItem : psDCMTDEFList) {
                    if (DataTypeUtils.getBooleanValue((Object)psDCMTDEFItem.getPKey(), (Boolean)false).booleanValue()) {
                        keyPSDCMTDEF = psDCMTDEFItem;
                        continue;
                    }
                    if (DataTypeUtils.getBooleanValue((Object)psDCMTDEFItem.getMajorField(), (Boolean)false).booleanValue()) {
                        majorPSDCMTDEF = psDCMTDEFItem;
                        continue;
                    }
                    if (!ObjectUtils.isEmpty((Object)psDCMTDEFItem.getPredefinedType())) {
                        pdtPSDCMTDEFMap.put(psDCMTDEFItem.getPredefinedType(), psDCMTDEFItem);
                        continue;
                    }
                    otherPSDCMTDEFList.add(psDCMTDEFItem);
                }
            }
            PSDEFieldDTO base_id = new PSDEFieldDTO();
            base_id.setPSDEId(psDataEntity.getPSDataEntityId());
            base_id.setPKey(1);
            if (!this.iPSDEFieldService.select(base_id, true)) {
                if (keyPSDCMTDEF != null) {
                    strDEFName = keyPSDCMTDEF.getPSDCMTDEFName().replace("_DENAME_", strDEName);
                    if (!ObjectUtils.isEmpty((Object)strDEFName) && strDEFName.indexOf("_") == 0 && strDEFName.lastIndexOf("_") == strDEFName.length() - 1 && !ObjectUtils.isEmpty((Object)(strDEFName = strDEFName.substring(1)))) {
                        strDEFName = strDEFName.substring(0, strDEFName.length() - 1);
                    }
                    if (DataTypeUtils.compare((String)strDEFName, (String)keyPSDCMTDEF.getPSDCMTDEFName(), (boolean)false) == 0L) {
                        strDEFName = strDEName + keyPSDCMTDEF.getPSDCMTDEFName();
                    }
                    base_id.setPSDEFieldName(strDEFName);
                    base_id.setLength(keyPSDCMTDEF.getLength());
                    if (!ObjectUtils.isEmpty((Object)keyPSDCMTDEF.getLogicName())) {
                        String strDEFLogicName = keyPSDCMTDEF.getLogicName().replace("_DENAME_", strDELogicName);
                        base_id.setLogicName(strDEFLogicName);
                    }
                    if (!ObjectUtils.isEmpty((Object)keyPSDCMTDEF.getCodeName())) {
                        String strDEFCodeName = keyPSDCMTDEF.getCodeName().replace("_DENAME_", strDECodeName);
                        base_id.setCodeName(strDEFCodeName);
                    }
                    if (keyPSDCMTDEF.getOrderValue() != null) {
                        base_id.setOrderValue(keyPSDCMTDEF.getOrderValue());
                    }
                } else {
                    if (bEnableCodeNameUpperCamel) {
                        base_id.setPSDEFieldName(String.format("%1$s_ID", strDEName));
                    } else {
                        base_id.setPSDEFieldName(String.format("%1$sID", strDEName));
                    }
                    if (ObjectUtils.isEmpty((Object)base_id.getCodeName())) {
                        base_id.setCodeName(String.format("%1$sId", strDECodeName));
                    }
                }
                if (ObjectUtils.isEmpty((Object)base_id.getLogicName())) {
                    base_id.setLogicName(String.format("%1$s\u6807\u8bc6", strDELogicName));
                }
                base_id.setPSDataTypeId(PSModelEnums.DEFDataType.GUID.value);
                base_id.setPSDataTypeName(PSModelEnums.DEFDataType.GUID.text);
                base_id.setPSDEId(psDataEntity.getPSDataEntityId());
                base_id.setPSDEFieldName(base_id.getPSDEFieldName().toUpperCase());
                base_id.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)base_id.getPSDEId(), (Object)base_id.getPSDEFieldName()));
                if (this.iPSDEFieldService.checkKeyState((Object)base_id) == 0) {
                    base_id.setTableName(psDataEntity.getTableName());
                    base_id.deftype(PSModelEnums.DEFType.PHISICAL);
                    base_id.setPhysicalField(1);
                    base_id.setAllowEmpty(0);
                    base_id.setLength(100);
                    base_id.setMajorField(0);
                    base_id.setPKey(1);
                    base_id.setFKey(0);
                    try {
                        this.iPSDEFieldService.create(base_id);
                    }
                    catch (Throwable ex) {
                        throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", base_id.getPSDEFieldName(), ex.getMessage()), ex);
                    }
                }
            }
            PSDEFieldDTO base_name = new PSDEFieldDTO();
            base_name.setPSDEId(psDataEntity.getPSDataEntityId());
            base_name.setMajorField(1);
            if (!this.iPSDEFieldService.select(base_name, true)) {
                if (majorPSDCMTDEF != null) {
                    strDEFName = majorPSDCMTDEF.getPSDCMTDEFName().replace("_DENAME_", strDEName);
                    if (!ObjectUtils.isEmpty((Object)strDEFName) && strDEFName.indexOf("_") == 0 && strDEFName.lastIndexOf("_") == strDEFName.length() - 1 && !ObjectUtils.isEmpty((Object)(strDEFName = strDEFName.substring(1)))) {
                        strDEFName = strDEFName.substring(0, strDEFName.length() - 1);
                    }
                    if (DataTypeUtils.compare((String)strDEFName, (String)majorPSDCMTDEF.getPSDCMTDEFName(), (boolean)false) == 0L) {
                        strDEFName = strDEName + majorPSDCMTDEF.getPSDCMTDEFName();
                    }
                    base_name.setPSDEFieldName(strDEFName);
                    defDataType2 = PSModelEnums.DEFDataType.from((String)majorPSDCMTDEF.getDEFDataType());
                    base_name.setPSDataTypeId(defDataType2.value);
                    base_name.setPSDataTypeName(defDataType2.text);
                    base_name.setLength(majorPSDCMTDEF.getLength());
                    if (!ObjectUtils.isEmpty((Object)majorPSDCMTDEF.getLogicName())) {
                        String strDEFLogicName = majorPSDCMTDEF.getLogicName().replace("_DENAME_", strDELogicName);
                        base_name.setLogicName(strDEFLogicName);
                    }
                    if (!ObjectUtils.isEmpty((Object)majorPSDCMTDEF.getCodeName())) {
                        String strDEFCodeName = majorPSDCMTDEF.getCodeName().replace("_DENAME_", strDECodeName);
                        base_name.setCodeName(strDEFCodeName);
                    }
                    if (majorPSDCMTDEF.getOrderValue() != null) {
                        base_name.setOrderValue(majorPSDCMTDEF.getOrderValue());
                    }
                } else {
                    if (bEnableCodeNameUpperCamel) {
                        base_name.setPSDEFieldName(String.format("%1$s_NAME", strDEName));
                    } else {
                        base_name.setPSDEFieldName(String.format("%1$sNAME", strDEName));
                    }
                    if (ObjectUtils.isEmpty((Object)base_name.getCodeName())) {
                        base_name.setCodeName(String.format("%1$sName", strDECodeName));
                    }
                }
                if (ObjectUtils.isEmpty((Object)base_name.getDEFType())) {
                    base_name.setPSDataTypeId(PSModelEnums.DEFDataType.TEXT.value);
                    base_name.setPSDataTypeName(PSModelEnums.DEFDataType.TEXT.text);
                    if (base_name.getLength() == null || base_name.getLength() <= 0) {
                        base_name.setLength(200);
                    }
                }
                if (ObjectUtils.isEmpty((Object)base_name.getLogicName())) {
                    base_name.setLogicName(String.format("%1$s\u540d\u79f0", strDELogicName));
                }
                base_name.setTableName(psDataEntity.getTableName());
                base_name.deftype(PSModelEnums.DEFType.PHISICAL);
                base_name.setPhysicalField(1);
                base_name.setEnableUserInput(PSModelEnums.UserInputMode.CREATE.value | PSModelEnums.UserInputMode.UPDATE.value);
                base_name.setAllowEmpty(1);
                base_name.setPSDEId(psDataEntity.getPSDataEntityId());
                base_name.setPSDEFieldName(base_name.getPSDEFieldName().toUpperCase());
                base_name.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)base_name.getPSDEId(), (Object)base_name.getPSDEFieldName()));
                if (this.iPSDEFieldService.checkKeyState((Object)base_name) == 0) {
                    base_name.setMajorField(1);
                    base_name.setPKey(0);
                    base_name.setFKey(0);
                    try {
                        this.iPSDEFieldService.create(base_name);
                    }
                    catch (Throwable ex) {
                        throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", base_name.getPSDEFieldName(), ex.getMessage()), ex);
                    }
                }
            }
            if (DataTypeUtils.getBooleanValue((Object)psDataEntity.getLogicValid(), (Boolean)false).booleanValue()) {
                PSDEFieldDTO validflag = new PSDEFieldDTO();
                validflag.setPSDEId(psDataEntity.getPSDataEntityId());
                validflag.predefinedtype(PSModelEnums.PredefinedFieldType.LOGICVALID);
                if (!this.iPSDEFieldService.select(validflag, true)) {
                    PSDCMTDEFDTO psDCMTDEF3 = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.get(PSModelEnums.PredefinedFieldType.LOGICVALID.value));
                    if (psDCMTDEF3 != null) {
                        validflag.setPSDEFieldName(psDCMTDEF3.getPSDCMTDEFName());
                        validflag.setCodeName(psDCMTDEF3.getCodeName());
                        validflag.setLogicName(psDCMTDEF3.getLogicName());
                        defDataType2 = PSModelEnums.DEFDataType.from((String)psDCMTDEF3.getDEFDataType());
                        validflag.setPSDataTypeId(defDataType2.value);
                        validflag.setPSDataTypeName(defDataType2.text);
                        validflag.setLength(psDCMTDEF3.getLength());
                        validflag.predefinedtype(PSModelEnums.PredefinedFieldType.LOGICVALID);
                        if (psDCMTDEF3.getOrderValue() != null) {
                            validflag.setOrderValue(psDCMTDEF3.getOrderValue());
                        }
                    } else {
                        validflag.setPSDEFieldName("ENABLE");
                        validflag.setCodeName("Enable");
                        validflag.setLogicName("\u903b\u8f91\u6709\u6548\u6807\u5fd7");
                        validflag.setPSDataTypeId(PSModelEnums.DEFDataType.YESNO.value);
                        validflag.setPSDataTypeName(PSModelEnums.DEFDataType.YESNO.text);
                        validflag.setLength(8);
                    }
                    validflag.setPSDEId(psDataEntity.getPSDataEntityId());
                    validflag.setTableName(psDataEntity.getTableName());
                    validflag.setDEFType(1);
                    validflag.setPhysicalField(1);
                    validflag.setAllowEmpty(0);
                    validflag.setMajorField(0);
                    validflag.setPKey(0);
                    validflag.setFKey(0);
                    validflag.setPSDEFieldName(validflag.getPSDEFieldName().toUpperCase());
                    validflag.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)validflag.getPSDEId(), (Object)validflag.getPSDEFieldName()));
                    if (this.iPSDEFieldService.checkKeyState((Object)validflag) == 0) {
                        try {
                            this.iPSDEFieldService.create(validflag);
                        }
                        catch (Throwable ex) {
                            throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", validflag.getPSDEFieldName(), ex.getMessage()), ex);
                        }
                    }
                }
            }
            if (!ObjectUtils.isEmpty((Object)psDataEntity.getIndexDEType())) {
                PSDEFieldDTO indextype = new PSDEFieldDTO();
                indextype.setPSDEId(psDataEntity.getPSDataEntityId());
                indextype.setIndexType(1);
                if (!this.iPSDEFieldService.select(indextype, true)) {
                    if (bEnableCodeNameUpperCamel) {
                        indextype.setPSDEFieldName(String.format("%1$s_TYPE", strDEName));
                    } else {
                        indextype.setPSDEFieldName(String.format("%1$sTYPE", strDEName));
                    }
                    indextype.setPSDEId(psDataEntity.getPSDataEntityId());
                    indextype.setLogicName("\u5206\u7ec4\u7c7b\u578b");
                    indextype.setCodeName(String.format("%1$sType", strDECodeName));
                    indextype.setTableName(psDataEntity.getTableName());
                    indextype.setDEFType(1);
                    indextype.setAllowEmpty(0);
                    indextype.setPSDataTypeId(PSModelEnums.DEFDataType.SSCODELIST.value);
                    indextype.setPSDataTypeName(PSModelEnums.DEFDataType.SSCODELIST.text);
                    indextype.setLength(100);
                    indextype.setPhysicalField(1);
                    indextype.setIndexType(1);
                    indextype.setMajorField(0);
                    indextype.setPKey(0);
                    indextype.setFKey(0);
                    indextype.setPSDEFieldName(indextype.getPSDEFieldName().toUpperCase());
                    indextype.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)indextype.getPSDEId(), (Object)indextype.getPSDEFieldName()));
                    if (this.iPSDEFieldService.checkKeyState((Object)indextype) == 0) {
                        try {
                            this.iPSDEFieldService.create(indextype);
                        }
                        catch (Throwable ex) {
                            throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", indextype.getPSDEFieldName(), ex.getMessage()), ex);
                        }
                    }
                }
            }
            boolean bEnableOPNameModel = false;
            bEnableOPNameModel = psDataEntity.isEnableOPNameModelDirty() ? DataTypeUtils.getBooleanValue((Object)psDataEntity.getEnableOPNameModel(), (Boolean)false).booleanValue() : DataTypeUtils.getBooleanValue((Object)this.getCurrentPSSystemDTO().getEnableOPNameModel(), (Boolean)false).booleanValue();
            PSDEFieldDTO createman = new PSDEFieldDTO();
            createman.setPSDEId(psDataEntity.getPSDataEntityId());
            createman.predefinedtype(PSModelEnums.PredefinedFieldType.CREATEMAN);
            if (!this.iPSDEFieldService.select(createman, true)) {
                psDCMTDEF2 = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.remove(PSModelEnums.PredefinedFieldType.CREATEMAN.value));
                if (psDCMTDEF2 != null) {
                    createman.setPSDEFieldName(psDCMTDEF2.getPSDCMTDEFName());
                    createman.setCodeName(psDCMTDEF2.getCodeName());
                    createman.setLogicName(psDCMTDEF2.getLogicName());
                    defDataType = PSModelEnums.DEFDataType.from((String)psDCMTDEF2.getDEFDataType());
                    createman.setPSDataTypeId(defDataType.value);
                    createman.setPSDataTypeName(defDataType.text);
                    createman.setLength(psDCMTDEF2.getLength());
                    createman.predefinedtype(PSModelEnums.PredefinedFieldType.CREATEMAN);
                    if (psDCMTDEF2.getOrderValue() != null) {
                        createman.setOrderValue(psDCMTDEF2.getOrderValue());
                    }
                } else {
                    createman.setLogicName("\u5efa\u7acb\u4eba");
                    createman.setCodeName("CreateMan");
                    if (bEnableCodeNameUpperCamel) {
                        createman.setPSDEFieldName(String.format("CREATE_MAN", strDEName));
                    } else {
                        createman.setPSDEFieldName(String.format("CREATEMAN", strDEName));
                    }
                    createman.setPSDataTypeId(PSModelEnums.DEFDataType.TEXT.value);
                    createman.setPSDataTypeName(PSModelEnums.DEFDataType.TEXT.text);
                    createman.setLength(60);
                }
                createman.setPSDEId(psDataEntity.getPSDataEntityId());
                createman.setTableName(psDataEntity.getTableName());
                createman.setDEFType(1);
                createman.setPhysicalField(1);
                createman.setAllowEmpty(0);
                createman.setMajorField(0);
                createman.setPKey(0);
                createman.setFKey(0);
                createman.setPSDEFieldName(createman.getPSDEFieldName().toUpperCase());
                createman.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)createman.getPSDEId(), (Object)createman.getPSDEFieldName()));
                if (this.iPSDEFieldService.checkKeyState((Object)createman) == 0) {
                    try {
                        this.iPSDEFieldService.create(createman);
                    }
                    catch (Throwable ex) {
                        throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", createman.getPSDEFieldName(), ex.getMessage()), ex);
                    }
                }
            }
            if (bEnableOPNameModel) {
                createman = new PSDEFieldDTO();
                createman.setPSDEId(psDataEntity.getPSDataEntityId());
                createman.predefinedtype(PSModelEnums.PredefinedFieldType.CREATEMANNAME);
                if (!this.iPSDEFieldService.select(createman, true)) {
                    psDCMTDEF2 = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.remove(PSModelEnums.PredefinedFieldType.CREATEMANNAME.value));
                    if (psDCMTDEF2 != null) {
                        createman.setPSDEFieldName(psDCMTDEF2.getPSDCMTDEFName());
                        createman.setCodeName(psDCMTDEF2.getCodeName());
                        createman.setLogicName(psDCMTDEF2.getLogicName());
                        defDataType = PSModelEnums.DEFDataType.from((String)psDCMTDEF2.getDEFDataType());
                        createman.setPSDataTypeId(defDataType.value);
                        createman.setPSDataTypeName(defDataType.text);
                        createman.setLength(psDCMTDEF2.getLength());
                        createman.predefinedtype(PSModelEnums.PredefinedFieldType.CREATEMANNAME);
                        if (psDCMTDEF2.getOrderValue() != null) {
                            createman.setOrderValue(psDCMTDEF2.getOrderValue());
                        }
                    } else {
                        createman.setLogicName("\u5efa\u7acb\u4eba\u540d\u79f0");
                        createman.setCodeName("CreateManName");
                        if (bEnableCodeNameUpperCamel) {
                            createman.setPSDEFieldName(String.format("CREATE_MAN_NAME", strDEName));
                        } else {
                            createman.setPSDEFieldName(String.format("CREATEMANNAME", strDEName));
                        }
                        createman.setPSDataTypeId(PSModelEnums.DEFDataType.TEXT.value);
                        createman.setPSDataTypeName(PSModelEnums.DEFDataType.TEXT.text);
                        createman.setLength(100);
                    }
                    createman.setPSDEId(psDataEntity.getPSDataEntityId());
                    createman.setTableName(psDataEntity.getTableName());
                    createman.setDEFType(1);
                    createman.setPhysicalField(1);
                    createman.setAllowEmpty(1);
                    createman.setMajorField(0);
                    createman.setPKey(0);
                    createman.setFKey(0);
                    createman.setPSDEFieldName(createman.getPSDEFieldName().toUpperCase());
                    createman.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)createman.getPSDEId(), (Object)createman.getPSDEFieldName()));
                    if (this.iPSDEFieldService.checkKeyState((Object)createman) == 0) {
                        try {
                            this.iPSDEFieldService.create(createman);
                        }
                        catch (Throwable ex) {
                            throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", createman.getPSDEFieldName(), ex.getMessage()), ex);
                        }
                    }
                }
            }
            PSDEFieldDTO createdate = new PSDEFieldDTO();
            createdate.setPSDEId(psDataEntity.getPSDataEntityId());
            createdate.predefinedtype(PSModelEnums.PredefinedFieldType.CREATEDATE);
            if (!this.iPSDEFieldService.select(createdate, true)) {
                psDCMTDEF2 = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.remove(PSModelEnums.PredefinedFieldType.CREATEDATE.value));
                if (psDCMTDEF2 != null) {
                    createdate.setPSDEFieldName(psDCMTDEF2.getPSDCMTDEFName());
                    createdate.setCodeName(psDCMTDEF2.getCodeName());
                    createdate.setLogicName(psDCMTDEF2.getLogicName());
                    defDataType = PSModelEnums.DEFDataType.from((String)psDCMTDEF2.getDEFDataType());
                    createdate.setPSDataTypeId(defDataType.value);
                    createdate.setPSDataTypeName(defDataType.text);
                    createdate.setLength(psDCMTDEF2.getLength());
                    createdate.predefinedtype(PSModelEnums.PredefinedFieldType.CREATEDATE);
                    if (psDCMTDEF2.getOrderValue() != null) {
                        createdate.setOrderValue(psDCMTDEF2.getOrderValue());
                    }
                } else {
                    if (bEnableCodeNameUpperCamel) {
                        createdate.setPSDEFieldName(String.format("CREATE_DATE", strDEName));
                    } else {
                        createdate.setPSDEFieldName(String.format("CREATEDATE", strDEName));
                    }
                    createdate.setLogicName("\u5efa\u7acb\u65f6\u95f4");
                    createdate.setCodeName("CreateDate");
                    createdate.setPSDataTypeId(PSModelEnums.DEFDataType.DATETIME.value);
                    createdate.setPSDataTypeName(PSModelEnums.DEFDataType.DATETIME.text);
                    createdate.setLength(8);
                }
                createdate.setPSDEId(psDataEntity.getPSDataEntityId());
                createdate.setTableName(psDataEntity.getTableName());
                createdate.setDEFType(1);
                createdate.setPhysicalField(1);
                createdate.setAllowEmpty(0);
                createdate.setMajorField(0);
                createdate.setPKey(0);
                createdate.setFKey(0);
                createdate.setPSDEFieldName(createdate.getPSDEFieldName().toUpperCase());
                createdate.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)createdate.getPSDEId(), (Object)createdate.getPSDEFieldName()));
                if (this.iPSDEFieldService.checkKeyState((Object)createdate) == 0) {
                    try {
                        this.iPSDEFieldService.create(createdate);
                    }
                    catch (Throwable ex) {
                        throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", createdate.getPSDEFieldName(), ex.getMessage()), ex);
                    }
                }
            }
            PSDEFieldDTO updateman = new PSDEFieldDTO();
            updateman.setPSDEId(psDataEntity.getPSDataEntityId());
            updateman.predefinedtype(PSModelEnums.PredefinedFieldType.UPDATEMAN);
            if (!this.iPSDEFieldService.select(updateman, true)) {
                psDCMTDEF2 = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.remove(PSModelEnums.PredefinedFieldType.UPDATEMAN.value));
                if (psDCMTDEF2 != null) {
                    updateman.setPSDEFieldName(psDCMTDEF2.getPSDCMTDEFName());
                    updateman.setCodeName(psDCMTDEF2.getCodeName());
                    updateman.setLogicName(psDCMTDEF2.getLogicName());
                    defDataType = PSModelEnums.DEFDataType.from((String)psDCMTDEF2.getDEFDataType());
                    updateman.setPSDataTypeId(defDataType.value);
                    updateman.setPSDataTypeName(defDataType.text);
                    updateman.setLength(psDCMTDEF2.getLength());
                    updateman.predefinedtype(PSModelEnums.PredefinedFieldType.UPDATEMAN);
                    if (psDCMTDEF2.getOrderValue() != null) {
                        updateman.setOrderValue(psDCMTDEF2.getOrderValue());
                    }
                } else {
                    if (bEnableCodeNameUpperCamel) {
                        updateman.setPSDEFieldName(String.format("UPDATE_MAN", strDEName));
                    } else {
                        updateman.setPSDEFieldName(String.format("UPDATEMAN", strDEName));
                    }
                    updateman.setLogicName("\u66f4\u65b0\u4eba");
                    updateman.setCodeName("UpdateMan");
                    updateman.setPSDataTypeId(PSModelEnums.DEFDataType.TEXT.value);
                    updateman.setPSDataTypeName(PSModelEnums.DEFDataType.TEXT.text);
                    updateman.setLength(60);
                }
                updateman.setPSDEId(psDataEntity.getPSDataEntityId());
                updateman.setTableName(psDataEntity.getTableName());
                updateman.setDEFType(1);
                updateman.setAllowEmpty(0);
                updateman.setMajorField(0);
                updateman.setPKey(0);
                updateman.setFKey(0);
                updateman.setPSDEFieldName(updateman.getPSDEFieldName().toUpperCase());
                updateman.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)updateman.getPSDEId(), (Object)updateman.getPSDEFieldName()));
                if (this.iPSDEFieldService.checkKeyState((Object)updateman) == 0) {
                    try {
                        this.iPSDEFieldService.create(updateman);
                    }
                    catch (Throwable ex) {
                        throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", updateman.getPSDEFieldName(), ex.getMessage()), ex);
                    }
                }
            }
            if (bEnableOPNameModel) {
                updateman = new PSDEFieldDTO();
                updateman.setPSDEId(psDataEntity.getPSDataEntityId());
                updateman.predefinedtype(PSModelEnums.PredefinedFieldType.UPDATEMANNAME);
                if (!this.iPSDEFieldService.select(updateman, true)) {
                    psDCMTDEF2 = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.remove(PSModelEnums.PredefinedFieldType.UPDATEMANNAME.value));
                    if (psDCMTDEF2 != null) {
                        updateman.setPSDEFieldName(psDCMTDEF2.getPSDCMTDEFName());
                        updateman.setCodeName(psDCMTDEF2.getCodeName());
                        updateman.setLogicName(psDCMTDEF2.getLogicName());
                        defDataType = PSModelEnums.DEFDataType.from((String)psDCMTDEF2.getDEFDataType());
                        updateman.setPSDataTypeId(defDataType.value);
                        updateman.setPSDataTypeName(defDataType.text);
                        updateman.setLength(psDCMTDEF2.getLength());
                        updateman.predefinedtype(PSModelEnums.PredefinedFieldType.UPDATEMANNAME);
                        if (psDCMTDEF2.getOrderValue() != null) {
                            updateman.setOrderValue(psDCMTDEF2.getOrderValue());
                        }
                    } else {
                        updateman.setLogicName("\u66f4\u65b0\u4eba\u540d\u79f0");
                        updateman.setCodeName("UpdateManName");
                        if (bEnableCodeNameUpperCamel) {
                            updateman.setPSDEFieldName(String.format("UPDATE_MAN_NAME", strDEName));
                        } else {
                            updateman.setPSDEFieldName(String.format("UPDATEMANNAME", strDEName));
                        }
                        updateman.setPSDataTypeId(PSModelEnums.DEFDataType.TEXT.value);
                        updateman.setPSDataTypeName(PSModelEnums.DEFDataType.TEXT.text);
                        updateman.setLength(100);
                    }
                    updateman.setPSDEId(psDataEntity.getPSDataEntityId());
                    updateman.setTableName(psDataEntity.getTableName());
                    updateman.setDEFType(1);
                    updateman.setPhysicalField(1);
                    updateman.setAllowEmpty(1);
                    updateman.setMajorField(0);
                    updateman.setPKey(0);
                    updateman.setFKey(0);
                    updateman.setPSDEFieldName(updateman.getPSDEFieldName().toUpperCase());
                    updateman.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)updateman.getPSDEId(), (Object)updateman.getPSDEFieldName()));
                    if (this.iPSDEFieldService.checkKeyState((Object)updateman) == 0) {
                        try {
                            this.iPSDEFieldService.create(updateman);
                        }
                        catch (Throwable ex) {
                            throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", updateman.getPSDEFieldName(), ex.getMessage()), ex);
                        }
                    }
                }
            }
            PSDEFieldDTO updatedate = new PSDEFieldDTO();
            updatedate.setPSDEId(psDataEntity.getPSDataEntityId());
            updatedate.predefinedtype(PSModelEnums.PredefinedFieldType.UPDATEDATE);
            if (!this.iPSDEFieldService.select(updatedate, true)) {
                psDCMTDEF2 = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.remove(PSModelEnums.PredefinedFieldType.UPDATEDATE.value));
                if (psDCMTDEF2 != null) {
                    updatedate.setPSDEFieldName(psDCMTDEF2.getPSDCMTDEFName());
                    updatedate.setCodeName(psDCMTDEF2.getCodeName());
                    updatedate.setLogicName(psDCMTDEF2.getLogicName());
                    defDataType = PSModelEnums.DEFDataType.from((String)psDCMTDEF2.getDEFDataType());
                    updatedate.setPSDataTypeId(defDataType.value);
                    updatedate.setPSDataTypeName(defDataType.text);
                    updatedate.setLength(psDCMTDEF2.getLength());
                    updatedate.predefinedtype(PSModelEnums.PredefinedFieldType.UPDATEDATE);
                    if (psDCMTDEF2.getOrderValue() != null) {
                        updatedate.setOrderValue(psDCMTDEF2.getOrderValue());
                    }
                } else {
                    if (bEnableCodeNameUpperCamel) {
                        updatedate.setPSDEFieldName(String.format("UPDATE_DATE", strDEName));
                    } else {
                        updatedate.setPSDEFieldName(String.format("UPDATEDATE", strDEName));
                    }
                    updatedate.setLogicName("\u66f4\u65b0\u65f6\u95f4");
                    updatedate.setCodeName("UpdateDate");
                    updatedate.setPSDataTypeId(PSModelEnums.DEFDataType.DATETIME.value);
                    updatedate.setPSDataTypeName(PSModelEnums.DEFDataType.DATETIME.text);
                    updatedate.setLength(8);
                }
                updatedate.setPSDEId(psDataEntity.getPSDataEntityId());
                updatedate.setTableName(psDataEntity.getTableName());
                updatedate.setDEFType(1);
                updatedate.setPhysicalField(1);
                updatedate.setAllowEmpty(0);
                updatedate.setMajorField(0);
                updatedate.setPKey(0);
                updatedate.setFKey(0);
                updatedate.setPSDEFieldName(updatedate.getPSDEFieldName().toUpperCase());
                updatedate.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)updatedate.getPSDEId(), (Object)updatedate.getPSDEFieldName()));
                if (this.iPSDEFieldService.checkKeyState((Object)updatedate) == 0) {
                    try {
                        this.iPSDEFieldService.create(updatedate);
                    }
                    catch (Throwable ex) {
                        throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", updatedate.getPSDEFieldName(), ex.getMessage()), ex);
                    }
                }
            }
            if (DataTypeUtils.getBooleanValue((Object)psDataEntity.getEnableOrgModel(), (Boolean)false).booleanValue()) {
                PSDEFieldDTO psDEField = new PSDEFieldDTO();
                psDEField.setPSDEId(psDataEntity.getPSDataEntityId());
                psDEField.predefinedtype(PSModelEnums.PredefinedFieldType.ORGID);
                if (!this.iPSDEFieldService.select(psDEField, true)) {
                    psDCMTDEF2 = (PSDCMTDEFDTO)((Object)pdtPSDCMTDEFMap.remove(PSModelEnums.PredefinedFieldType.ORGID.value));
                    if (psDCMTDEF2 != null) {
                        psDEField.setPSDEFieldName(psDCMTDEF2.getPSDCMTDEFName());
                        psDEField.setCodeName(psDCMTDEF2.getCodeName());
                        psDEField.setLogicName(psDCMTDEF2.getLogicName());
                        defDataType = PSModelEnums.DEFDataType.from((String)psDCMTDEF2.getDEFDataType());
                        psDEField.setPSDataTypeId(defDataType.value);
                        psDEField.setPSDataTypeName(defDataType.text);
                        psDEField.setLength(psDCMTDEF2.getLength());
                        psDEField.predefinedtype(PSModelEnums.PredefinedFieldType.ORGID);
                        if (psDCMTDEF2.getOrderValue() != null) {
                            psDEField.setOrderValue(psDCMTDEF2.getOrderValue());
                        }
                    } else {
                        if (bEnableCodeNameUpperCamel) {
                            psDEField.setPSDEFieldName(String.format("ORG_ID", new Object[0]));
                        } else {
                            psDEField.setPSDEFieldName(String.format("ORGID", new Object[0]));
                        }
                        psDEField.setLogicName("\u7ec4\u7ec7\u673a\u6784\u6807\u8bc6");
                        psDEField.setCodeName("OrgId");
                        psDEField.setPSDataTypeId(PSModelEnums.DEFDataType.TEXT.value);
                        psDEField.setPSDataTypeName(PSModelEnums.DEFDataType.TEXT.text);
                        psDEField.setLength(60);
                    }
                    psDEField.setPSDEId(psDataEntity.getPSDataEntityId());
                    psDEField.setTableName(psDataEntity.getTableName());
                    psDEField.setDEFType(1);
                    psDEField.setPhysicalField(1);
                    psDEField.setAllowEmpty(0);
                    psDEField.setMajorField(0);
                    psDEField.setPKey(0);
                    psDEField.setFKey(0);
                    psDEField.setPSDEFieldName(psDEField.getPSDEFieldName().toUpperCase());
                    psDEField.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)psDEField.getPSDEId(), (Object)psDEField.getPSDEFieldName()));
                    if (this.iPSDEFieldService.checkKeyState((Object)psDEField) == 0) {
                        try {
                            this.iPSDEFieldService.create(psDEField);
                        }
                        catch (Throwable ex) {
                            throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEField.getPSDEFieldName(), ex.getMessage()), ex);
                        }
                    }
                }
            }
            otherPSDCMTDEFList.addAll(pdtPSDCMTDEFMap.values());
            for (PSDCMTDEFDTO psDCMTDEFItem : otherPSDCMTDEFList) {
                PSDEFieldDTO psDEField = new PSDEFieldDTO();
                psDEField.setPSDEFieldName(psDCMTDEFItem.getPSDCMTDEFName());
                psDEField.setCodeName(psDCMTDEFItem.getCodeName());
                psDEField.setLogicName(psDCMTDEFItem.getLogicName());
                psDEField.setPSDataTypeId(psDCMTDEFItem.getDEFDataType());
                psDEField.setLength(psDCMTDEFItem.getLength());
                PSModelEnums.DEFDataType defDataType3 = PSModelEnums.DEFDataType.from((String)psDCMTDEFItem.getDEFDataType());
                psDEField.setPSDataTypeId(defDataType3.value);
                psDEField.setPSDataTypeName(defDataType3.text);
                psDEField.setPSDEId(psDataEntity.getPSDataEntityId());
                psDEField.setTableName(psDataEntity.getTableName());
                psDEField.setDEFType(1);
                psDEField.setPhysicalField(1);
                psDEField.setAllowEmpty(1);
                psDEField.setMajorField(0);
                psDEField.setPKey(0);
                psDEField.setFKey(0);
                if (psDCMTDEFItem.getOrderValue() != null) {
                    psDEField.setOrderValue(psDCMTDEFItem.getOrderValue());
                }
                psDEField.setPSDEFieldName(psDEField.getPSDEFieldName().toUpperCase());
                psDEField.setPSDEFieldId(KeyValueUtils.genUniqueId((Object)psDEField.getPSDEId(), (Object)psDEField.getPSDEFieldName()));
                if (this.iPSDEFieldService.checkKeyState((Object)psDEField) != 0) continue;
                try {
                    this.iPSDEFieldService.create(psDEField);
                }
                catch (Throwable ex) {
                    throw new Exception(String.format("\u5efa\u7acb\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEField.getPSDEFieldName(), ex.getMessage()), ex);
                }
            }
        }
        ISearchContextDTO iSearchContextDTO = this.iPSDEFieldService.createSearchContextDTO().eq("PSDEID", (Object)psDataEntity.getPSDataEntityId()).count(false).all();
        List<PSDEFieldDTO> psDEFieldList = this.iPSDEFieldService.select(iSearchContextDTO);
        for (PSDEFieldDTO psDEField : psDEFieldList) {
            try {
                this.iPSDEFieldService.initModel(psDEField);
            }
            catch (Throwable ex) {
                throw new Exception(String.format("\u521d\u59cb\u5316\u5c5e\u6027[%1$s]\u53d1\u751f\u5f02\u5e38\uff0c%2$s", psDEField.getPSDEFieldName(), ex.getMessage()), ex);
            }
        }
    }

    protected void doInitPSDEACModes(PSDataEntityDTO psDataEntity) throws Throwable {
        PSDEACModeDTO psDEACMode = new PSDEACModeDTO();
        psDEACMode.setPSDEACModeId(psDataEntity.getPSDataEntityId());
        if (this.iPSDEACModeService.checkKeyState((Object)psDEACMode) == 0) {
            String strPSDEACModeId = psDEACMode.getPSDEACModeId();
            psDEACMode.resetAll();
            psDEACMode.setPSDEId(psDataEntity.getPSDataEntityId());
            psDEACMode.setDefaultMode(1);
            boolean bDefault = true;
            SearchContextDTO selectCond = new SearchContextDTO();
            selectCond.limit(1);
            selectCond.eq("PSDEID", (Object)psDataEntity.getPSDataEntityId());
            List<PSDEACModeDTO> psDEACModeList = this.iPSDEACModeService.select(selectCond);
            for (PSDEACModeDTO psDEACMode2 : psDEACModeList) {
                if (DataTypeUtils.compare((String)psDEACMode2.getCodeName(), (String)"Default", (boolean)true) == 0L) {
                    return;
                }
                if (!DataTypeUtils.getBooleanValue((Object)psDEACMode2.getDefaultMode(), (Boolean)false).booleanValue()) continue;
                bDefault = false;
            }
            psDEACMode.resetAll();
            psDEACMode.setPSDEACModeId(strPSDEACModeId);
            psDEACMode.setPSDEId(psDataEntity.getPSDataEntityId());
            psDEACMode.setDefaultMode(bDefault ? 1 : 0);
            psDEACMode.setPSDEACModeName("DEFAULT");
            psDEACMode.setCodeName("Default");
            this.iPSDEACModeService.create(psDEACMode);
        }
    }

    protected void doInitPSDEDataRelations(PSDataEntityDTO psDataEntity) throws Throwable {
        PSDEDataRelationDTO psDEDataRelation = new PSDEDataRelationDTO();
        psDEDataRelation.setPSDEDataRelationId(psDataEntity.getPSDataEntityId());
        if (this.iPSDEDataRelationService.checkKeyState((Object)psDEDataRelation) == 0) {
            PSDEDataRelationDTO psDEDataRelation2 = new PSDEDataRelationDTO();
            psDEDataRelation2.setPSDEId(psDataEntity.getPSDataEntityId());
            psDEDataRelation2.setCodeName("Default");
            if (this.iPSDEDataRelationService.select(psDEDataRelation2, true)) {
                return;
            }
            psDEDataRelation.setPSDEId(psDataEntity.getPSDataEntityId());
            psDEDataRelation.setPSDEDataRelationName(String.format("%1$s\u9ed8\u8ba4\u5173\u7cfb\u754c\u9762\u7ec4", psDataEntity.getLogicName()));
            psDEDataRelation.setCodeName("Default");
            this.iPSDEDataRelationService.create(psDEDataRelation);
        }
    }

    public PSViewTypeDTO getPSViewType(String strPSDEViewTypeId) throws Exception {
        return psViewTypeMap.get(strPSDEViewTypeId);
    }

    protected boolean isEnableCodeNameUpperCamel() {
        return false;
    }

    protected boolean isEnableNoViewMode(PSDataEntityDTO psDataEntityDTO) throws Throwable {
        PSSystemDTO psSystem = this.getCurrentPSSystemDTO();
        return DataTypeUtils.getBooleanValue((Object)psSystem.getNoViewMode(), (Boolean)false);
    }

    protected boolean isEnableModelRTModes() {
        return false;
    }

    protected boolean isEnableI18NDefault() {
        return true;
    }

    protected String toUpperCamel(String strCodeName) {
        if (StringUtils.hasLength((String)strCodeName)) {
            return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, strCodeName);
        }
        return strCodeName;
    }

    static {
        wfActionMap.put("WFStart", "\u5de5\u4f5c\u6d41\u542f\u52a8");
        wfActionMap.put("WFInit", "\u5de5\u4f5c\u6d41\u521d\u59cb\u5316\u56de\u8c03");
        wfActionMap.put("WFUpdate", "\u5de5\u4f5c\u6d41\u66f4\u65b0\u56de\u8c03");
        wfActionMap.put("WFFinish", "\u5de5\u4f5c\u6d41\u5b8c\u6210\u56de\u8c03");
        wfActionMap.put("WFError", "\u5de5\u4f5c\u6d41\u9519\u8bef\u56de\u8c03");
        predefinedFieldMap.put("CREATEMAN", "");
        predefinedFieldMap.put("CREATEMANNAME", "");
        predefinedFieldMap.put("CREATEDATE", "");
        predefinedFieldMap.put("UPDATEMAN", "");
        predefinedFieldMap.put("UPDATEMANNAME", "");
        predefinedFieldMap.put("UPDATEDATE", "");
        predefinedFieldMap.put("ENABLE", "");
        predefinedFieldMap.put("ORGID", "");
        predefinedFieldMap.put("ORGSECTORID", "");
        predefinedFieldMap.put("ORGNAME", "");
        predefinedFieldMap.put("ORGSECTORNAME", "");
        predefinedFieldMap.put("ORDERVALUE", "");
        DEACTIONS = new String[]{"CheckKey", "Create", "Get", "Remove", "Save", "Update", "GetDraft"};
        DEACTIONS2 = new String[]{"CreateTemp", "CreateTempMajor", "GetDraftTemp", "GetDraftTempMajor", "GetTemp", "GetTempMajor", "RemoveTemp", "RemoveTempMajor", "UpdateTemp", "UpdateTempMajor"};
        initViewTypes = new String[]{"DEEDITVIEW", "DEEDITVIEW2", "DEGRIDVIEW", "DEINDEXPICKUPDATAVIEW", "DEFORMPICKUPDATAVIEW", "DEPICKUPGRIDVIEW", "DEPICKUPVIEW", "DEMPICKUPVIEW", "DEREDIRECTVIEW"};
        initMobViewTypes = new String[]{"DEMOBEDITVIEW", "DEMOBMDVIEW", "DEMOBINDEXPICKUPMDVIEW", "DEMOBFORMPICKUPMDVIEW", "DEMOBPICKUPMDVIEW", "DEMOBPICKUPVIEW", "DEMOBMPICKUPVIEW", "DEMOBREDIRECTVIEW"};
        initWFViewTypes = new String[]{"DEWFEXPVIEW", "DEWFGRIDVIEW", "DEWFEDITVIEW3"};
        initMobWFViewTypes = new String[]{"DEMOBWFMDVIEW", "DEMOBWFEDITVIEW"};
        psViewTypeMap = new HashMap<String, PSViewTypeDTO>();
        PSViewTypeDTO psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEEDITVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u7f16\u8f91\u89c6\u56fe");
        psViewType.setCodeName("EditView");
        psViewType.setTitle("\u7f16\u8f91\u89c6\u56fe");
        PSVTCtrlDTO psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setPSSysToolbarId("TBTEMPL_00001");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        PSVTCtrlDTO psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl1.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEEDITVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEEDITVIEW2");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u7f16\u8f91\u89c6\u56fe\uff08\u5de6\u53f3\u5173\u7cfb\uff09");
        psViewType.setCodeName("EditView2");
        psViewType.setTitle("\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setPSSysToolbarId("TBTEMPL_00001");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl1.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        PSVTCtrlDTO psVTCtrl2 = new PSVTCtrlDTO();
        psVTCtrl2.setPSVTCtrlName(CTRLTYPE_DRBAR);
        psVTCtrl2.setCtrlType(CTRLTYPE_DRBAR);
        psVTCtrl2.setPSSysToolbarId("");
        psVTCtrl2.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl2);
        psViewTypeMap.put("DEEDITVIEW2", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEEDITVIEW3");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u7f16\u8f91\u89c6\u56fe\uff08\u5206\u9875\u5173\u7cfb\uff09");
        psViewType.setCodeName("EditView3");
        psViewType.setTitle("\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setPSSysToolbarId("TBTEMPL_00001");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl1.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psVTCtrl2 = new PSVTCtrlDTO();
        psVTCtrl2.setPSVTCtrlName(CTRLTYPE_DRTAB);
        psVTCtrl2.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl2.setPSSysToolbarId("");
        psVTCtrl2.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl2);
        psViewTypeMap.put("DEEDITVIEW3", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEEDITVIEW4");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u7f16\u8f91\u89c6\u56fe\uff08\u4e0a\u4e0b\u5173\u7cfb\uff09");
        psViewType.setCodeName("EditView4");
        psViewType.setTitle("\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setPSSysToolbarId("TBTEMPL_00001");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl1.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psVTCtrl2 = new PSVTCtrlDTO();
        psVTCtrl2.setPSVTCtrlName(CTRLTYPE_DRTAB);
        psVTCtrl2.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl2.setPSSysToolbarId("");
        psVTCtrl2.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl2);
        psViewTypeMap.put("DEEDITVIEW4", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEEDITVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u7f16\u8f91\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("EditView9");
        psViewType.setTitle("\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setPSSysToolbarId("TBTEMPL_00101");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl1.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEEDITVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBEDITVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u7f16\u8f91\u89c6\u56fe");
        psViewType.setCodeName("MobEditView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl1.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl1.setPSSysToolbarId("TBTEMPL_01016");
        psVTCtrl1.setPSSysACHandlerId("");
        psVTCtrl1.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBEDITVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBEDITVIEW3");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u7f16\u8f91\u89c6\u56fe\uff08\u5206\u9875\u5173\u7cfb\uff09");
        psViewType.setCodeName("MobEditView3");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl1.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl1.setPSSysToolbarId("TBTEMPL_01012");
        psVTCtrl1.setPSSysACHandlerId("");
        psVTCtrl1.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psVTCtrl2 = new PSVTCtrlDTO();
        psVTCtrl2.setPSVTCtrlName(CTRLTYPE_DRTAB);
        psVTCtrl2.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl2.setPSSysToolbarId("");
        psVTCtrl2.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl2);
        psViewTypeMap.put("DEMOBEDITVIEW3", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBEDITVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u7f16\u8f91\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobEditView9");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl1.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl1.setPSSysToolbarId("TBTEMPL_01016");
        psVTCtrl1.setPSSysACHandlerId("");
        psVTCtrl1.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBEDITVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEGRIDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u8868\u683c\u89c6\u56fe");
        psViewType.setCodeName("GridView");
        psViewType.setTitle("\u8868\u683c\u89c6\u56fe");
        PSVTRVDTO psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("OPENDATA");
        psVTRV0.setDEFViewType("MAINVIEW");
        ArrayList<PSVTRVDTO> PSVTRVs = new ArrayList<PSVTRVDTO>();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        PSVTRVDTO psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("NEWDATA");
        psVTRV1.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV1);
        PSVTRVDTO psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("EDITDATA");
        psVTRV2.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV2);
        PSVTCtrlDTO psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        PSVTCtrlDTO psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_GRID);
        psVTCtrl12.setCtrlType(CTRLTYPE_GRID);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("GRIDHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        PSVTCtrlDTO psVTCtrl22 = new PSVTCtrlDTO();
        psVTCtrl22.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl22.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl22.setPSSysToolbarId("");
        psVTCtrl22.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl22);
        psViewTypeMap.put("DEGRIDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEOPTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u9009\u9879\u64cd\u4f5c\u89c6\u56fe");
        psViewType.setCodeName("OptionView");
        psViewType.setTitle("\u9009\u9879\u64cd\u4f5c\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("OPTFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEOPTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBOPTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u9009\u9879\u64cd\u4f5c\u89c6\u56fe");
        psViewType.setCodeName("MobOptionView");
        psViewType.setTitle("\u9009\u9879\u64cd\u4f5c\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("OPTFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBOPTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEGRIDVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u8868\u683c\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("GridView9");
        psViewType.setTitle("\u8868\u683c\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("NEWDATA");
        psVTRV0.setDEFViewType("EDITVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("OPENDATA");
        psVTRV1.setDEFViewType("MAINVIEW");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("EDITDATA");
        psVTRV2.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00049");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_GRID);
        psVTCtrl12.setCtrlType(CTRLTYPE_GRID);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("GRIDHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psViewTypeMap.put("DEGRIDVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEREDIRECTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6570\u636e\u91cd\u5b9a\u5411\u89c6\u56fe");
        psViewType.setCodeName("RedirectView");
        psViewType.setTitle("\u6570\u636e\u91cd\u5b9a\u5411\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("RDITEM:");
        psVTRV0.setDEFViewType("");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psViewTypeMap.put("DEREDIRECTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBREDIRECTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u6570\u636e\u91cd\u5b9a\u5411\u89c6\u56fe");
        psViewType.setCodeName("MobRedirectView");
        psViewType.setTitle("\u6570\u636e\u91cd\u5b9a\u5411\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("RDITEM:");
        psVTRV0.setDEFViewType("");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psViewTypeMap.put("DEMOBREDIRECTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEGRIDEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u8868\u683c\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("GridExpView");
        psViewType.setTitle("\u8868\u683c\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_GRIDEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_GRIDEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("GRIDEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEGRIDEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPICKUPGRIDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u9009\u62e9\u8868\u683c\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("PickupGridView");
        psViewType.setTitle("\u9009\u62e9\u8868\u683c\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_GRID);
        psVTCtrl0.setCtrlType(CTRLTYPE_GRID);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("GRIDHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl1.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEPICKUPGRIDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBPICKUPMDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u9009\u62e9\u591a\u6570\u636e\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobPickupMDView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u9009\u62e9\u591a\u6570\u636e\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("MDCTRL");
        psVTCtrl0.setCtrlType(CTRLTYPE_MOBMDCTRL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBPICKUPMDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBMDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u591a\u6570\u636e\u89c6\u56fe");
        psViewType.setCodeName("MobMDView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u591a\u6570\u636e\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("NEWDATA");
        psVTRV0.setDEFViewType("MOBEDITVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("EDITDATA");
        psVTRV1.setDEFViewType("MOBEDITVIEW");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("OPENDATA");
        psVTRV2.setDEFViewType("MOBMAINVIEW");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName("MDCTRL");
        psVTCtrl02.setCtrlType(CTRLTYPE_MOBMDCTRL);
        psVTCtrl02.setPSSysToolbarId("");
        psVTCtrl02.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl12.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl12.setPSSysToolbarId("TBTEMPL_01015");
        psVTCtrl12.setPSSysACHandlerId("");
        psVTCtrl12.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psViewTypeMap.put("DEMOBMDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBMDVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u591a\u6570\u636e\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobMDView9");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u591a\u6570\u636e\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("MDCTRL");
        psVTCtrl0.setCtrlType(CTRLTYPE_MOBMDCTRL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl1.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl1.setPSSysToolbarId("TBTEMPL_01017");
        psVTCtrl1.setPSSysACHandlerId("");
        psVTCtrl1.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBMDVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEDATAVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6570\u636e\u89c6\u56fe");
        psViewType.setCodeName("DataView");
        psViewType.setTitle("\u6570\u636e\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("OPENDATA");
        psVTRV0.setDEFViewType("");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("NEWDATA");
        psVTRV1.setDEFViewType("");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("EDITDATA");
        psVTRV2.setDEFViewType("");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psVTCtrl22 = new PSVTCtrlDTO();
        psVTCtrl22.setPSVTCtrlName(CTRLTYPE_DATAVIEW);
        psVTCtrl22.setCtrlType(CTRLTYPE_DATAVIEW);
        psVTCtrl22.setPSSysToolbarId("");
        psVTCtrl22.setPSSysACHandlerId("DATAVIEWHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl22);
        psViewTypeMap.put("DEDATAVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEDATAVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6570\u636e\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("DataView9");
        psViewType.setTitle("\u6570\u636e\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("NEWDATA");
        psVTRV0.setDEFViewType("");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("OPENDATA");
        psVTRV1.setDEFViewType("");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("EDITDATA");
        psVTRV2.setDEFViewType("");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psVTCtrl22 = new PSVTCtrlDTO();
        psVTCtrl22.setPSVTCtrlName(CTRLTYPE_DATAVIEW);
        psVTCtrl22.setCtrlType(CTRLTYPE_DATAVIEW);
        psVTCtrl22.setPSSysToolbarId("");
        psVTCtrl22.setPSSysACHandlerId("DATAVIEWHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl22);
        psViewTypeMap.put("DEDATAVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEDATAVIEWEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5361\u7247\u89c6\u56fe\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("DataViewExpView");
        psViewType.setTitle("\u5361\u7247\u89c6\u56fe\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_DATAVIEWEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_DATAVIEWEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("DATAVIEWEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEDATAVIEWEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBDATAVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5361\u7247\u89c6\u56fe");
        psViewType.setCodeName("MobDataView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u5361\u7247\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("NEWDATA");
        psVTRV0.setDEFViewType("MOBEDITVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("EDITDATA");
        psVTRV1.setDEFViewType("MOBEDITVIEW");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("OPENDATA");
        psVTRV2.setDEFViewType("MOBMAINVIEW");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_01011");
        psVTCtrl02.setPSSysACHandlerId("");
        psVTCtrl02.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_DATAVIEW);
        psVTCtrl12.setCtrlType(CTRLTYPE_DATAVIEW);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("DATAVIEWHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psViewTypeMap.put("DEMOBDATAVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBDATAVIEWEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5361\u7247\u89c6\u56fe\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("MobDataViewExpView");
        psViewType.setTitle("\u5361\u7247\u89c6\u56fe\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_DATAVIEWEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_DATAVIEWEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("DATAVIEWEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBDATAVIEWEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPICKUPDATAVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u9009\u62e9\u6570\u636e\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("PickupDataView");
        psViewType.setTitle("\u9009\u62e9\u6570\u636e\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_DATAVIEW);
        psVTCtrl1.setCtrlType(CTRLTYPE_DATAVIEW);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("DATAVIEWHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEPICKUPDATAVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DELISTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5217\u8868\u89c6\u56fe");
        psViewType.setCodeName("ListView");
        psViewType.setTitle("\u5217\u8868\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("OPENDATA");
        psVTRV0.setDEFViewType("");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("EDITDATA");
        psVTRV1.setDEFViewType("");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("NEWDATA");
        psVTRV2.setDEFViewType("");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psVTCtrl22 = new PSVTCtrlDTO();
        psVTCtrl22.setPSVTCtrlName(CTRLTYPE_LIST);
        psVTCtrl22.setCtrlType(CTRLTYPE_LIST);
        psVTCtrl22.setPSSysToolbarId("");
        psVTCtrl22.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl22);
        psViewTypeMap.put("DELISTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DELISTVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5217\u8868\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("ListView9");
        psViewType.setTitle("\u5217\u8868\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("OPENDATA");
        psVTRV0.setDEFViewType("");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("EDITDATA");
        psVTRV1.setDEFViewType("");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("NEWDATA");
        psVTRV2.setDEFViewType("");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psVTCtrl22 = new PSVTCtrlDTO();
        psVTCtrl22.setPSVTCtrlName(CTRLTYPE_LIST);
        psVTCtrl22.setCtrlType(CTRLTYPE_LIST);
        psVTCtrl22.setPSSysToolbarId("");
        psVTCtrl22.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl22);
        psViewTypeMap.put("DELISTVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DELISTEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5217\u8868\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("ListExpView");
        psViewType.setTitle("\u5217\u8868\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_LISTEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_LISTEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("LISTEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DELISTEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBLISTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5217\u8868\u89c6\u56fe");
        psViewType.setCodeName("MobListView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u5217\u8868\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("EDITDATA");
        psVTRV0.setDEFViewType("MOBEDITVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("OPENDATA");
        psVTRV1.setDEFViewType("MOBMAINVIEW");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("NEWDATA");
        psVTRV2.setDEFViewType("MOBEDITVIEW");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName("MDCTRL");
        psVTCtrl02.setCtrlType(CTRLTYPE_MOBMDCTRL);
        psVTCtrl02.setPSSysToolbarId("");
        psVTCtrl02.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl12.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl12.setPSSysToolbarId("TBTEMPL_01011");
        psVTCtrl12.setPSSysACHandlerId("");
        psVTCtrl12.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psViewTypeMap.put("DEMOBLISTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBLISTEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5217\u8868\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("MobListExpView");
        psViewType.setTitle("\u5217\u8868\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_LISTEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_LISTEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("LISTEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBLISTEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBPICKUPLISTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u9009\u62e9\u5217\u8868\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobPickupListView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u9009\u62e9\u5217\u8868\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("MDCTRL");
        psVTCtrl0.setCtrlType(CTRLTYPE_MOBMDCTRL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBPICKUPLISTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DECHARTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u56fe\u8868\u89c6\u56fe");
        psViewType.setCodeName("ChartView");
        psViewType.setTitle("\u56fe\u8868\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_CHART);
        psVTCtrl1.setCtrlType(CTRLTYPE_CHART);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("CHARTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DECHARTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DECHARTVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u56fe\u8868\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("ChartView9");
        psViewType.setTitle("\u56fe\u8868\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_CHART);
        psVTCtrl1.setCtrlType(CTRLTYPE_CHART);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("CHARTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DECHARTVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DECHARTEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u56fe\u8868\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("ChartExpView");
        psViewType.setTitle("\u56fe\u8868\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_CHARTEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_CHARTEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("CHARTEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DECHARTEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBCHARTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u56fe\u8868\u89c6\u56fe");
        psViewType.setCodeName("MobChartView");
        psViewType.setTitle("\u56fe\u8868\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_CHART);
        psVTCtrl1.setCtrlType(CTRLTYPE_CHART);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("CHARTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBCHARTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBCHARTEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u56fe\u8868\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("MobChartExpView");
        psViewType.setTitle("\u56fe\u8868\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_CHARTEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_CHARTEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("CHARTEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBCHARTEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBCHARTVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u56fe\u8868\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobChartView9");
        psViewType.setTitle("\u56fe\u8868\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_CHART);
        psVTCtrl1.setCtrlType(CTRLTYPE_CHART);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("CHARTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBCHARTVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DECALENDARVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u65e5\u5386\u89c6\u56fe");
        psViewType.setCodeName("CalendarView");
        psViewType.setTitle("\u65e5\u5386\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_CALENDAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_CALENDAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DECALENDARVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DECALENDARVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u65e5\u5386\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("CalendarView9");
        psViewType.setTitle("\u65e5\u5386\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_CALENDAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_CALENDAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DECALENDARVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DECALENDAREXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u65e5\u5386\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("CalendarExpView");
        psViewType.setTitle("\u65e5\u5386\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_CALENDAREXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_CALENDAREXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("CALENDAREXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DECALENDAREXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBCALENDARVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u65e5\u5386\u89c6\u56fe");
        psViewType.setCodeName("MobCalendarView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u65e5\u5386\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_CALENDAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_CALENDAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBCALENDARVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBCALENDAREXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u65e5\u5386\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("MobCalendarExpView");
        psViewType.setTitle("\u65e5\u5386\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_CALENDAREXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_CALENDAREXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("CALENDAREXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBCALENDAREXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBCALENDARVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u65e5\u5386\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobCalendarView9");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u65e5\u5386\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_CALENDAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_CALENDAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBCALENDARVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMAPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5730\u56fe\u89c6\u56fe");
        psViewType.setCodeName("MapView");
        psViewType.setTitle("\u5730\u56fe\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_MAP);
        psVTCtrl0.setCtrlType(CTRLTYPE_MAP);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMAPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMAPVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5730\u56fe\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MapView9");
        psViewType.setTitle("\u5730\u56fe\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_MAP);
        psVTCtrl0.setCtrlType(CTRLTYPE_MAP);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMAPVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMAPEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5730\u56fe\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("MapExpView");
        psViewType.setTitle("\u5730\u56fe\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_MAPEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_MAPEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("MAPEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMAPEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBMAPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5730\u56fe\u89c6\u56fe");
        psViewType.setCodeName("MobMapView");
        psViewType.setTitle("\u5730\u56fe\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_MAP);
        psVTCtrl0.setCtrlType(CTRLTYPE_MAP);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBMAPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBMAPEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5730\u56fe\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("MobMapExpView");
        psViewType.setTitle("\u5730\u56fe\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_MAPEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_MAPEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("MAPEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBMAPEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBMAPVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5730\u56fe\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobMapView9");
        psViewType.setTitle("\u5730\u56fe\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_MAP);
        psVTCtrl0.setCtrlType(CTRLTYPE_MAP);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBMAPVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPORTALVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6570\u636e\u770b\u677f\u89c6\u56fe");
        psViewType.setCodeName("DashboardView");
        psViewType.setTitle("\u6570\u636e\u770b\u677f\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_DASHBOARD);
        psVTCtrl0.setCtrlType(CTRLTYPE_DASHBOARD);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEPORTALVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPORTALVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6570\u636e\u770b\u677f\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("DashboardView9");
        psViewType.setTitle("\u6570\u636e\u770b\u677f\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_DASHBOARD);
        psVTCtrl0.setCtrlType(CTRLTYPE_DASHBOARD);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEPORTALVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBPORTALVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u6570\u636e\u770b\u677f\u89c6\u56fe");
        psViewType.setCodeName("MobDashboardView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u6570\u636e\u770b\u677f\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_DASHBOARD);
        psVTCtrl0.setCtrlType(CTRLTYPE_DASHBOARD);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBPORTALVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBPORTALVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u6570\u636e\u770b\u677f\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobDashboardView9");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u6570\u636e\u770b\u677f\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_DASHBOARD);
        psVTCtrl0.setCtrlType(CTRLTYPE_DASHBOARD);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBPORTALVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETREEVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6811\u89c6\u56fe");
        psViewType.setCodeName("TreeView");
        psViewType.setTitle("\u6811\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("TREE");
        psVTCtrl0.setCtrlType(CTRLTYPE_TREEVIEW);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("TREEHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DETREEVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETREEVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6811\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("TreeView9");
        psViewType.setTitle("\u6811\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("TREE");
        psVTCtrl0.setCtrlType(CTRLTYPE_TREEVIEW);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("TREEHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DETREEVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETREEEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6811\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("TreeExpView");
        psViewType.setTitle("\u6811\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TREEEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TREEEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("TREEEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DETREEEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBTREEVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u6811\u89c6\u56fe");
        psViewType.setCodeName("MobTreeView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u6811\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl0.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("TREE");
        psVTCtrl1.setCtrlType(CTRLTYPE_TREEVIEW);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("TREEHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBTREEVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBTREEEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u6811\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("MobTreeExpView");
        psViewType.setTitle("\u6811\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TREEEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TREEEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("TREEEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl1.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBTREEEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBTREEEXPVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u6811\u5bfc\u822a\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobTreeExpView9");
        psViewType.setTitle("\u6811\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TREEEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TREEEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("TREEEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl1.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBTREEEXPVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBPICKUPTREEVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u9009\u62e9\u6811\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobPickupTreeView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u9009\u62e9\u6811\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("TREE");
        psVTCtrl0.setCtrlType(CTRLTYPE_TREEVIEW);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("TREEHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBPICKUPTREEVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPICKUPTREEVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u9009\u62e9\u6811\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("PickupTreeView");
        psViewType.setTitle("\u9009\u62e9\u6811\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("TREE");
        psVTCtrl0.setCtrlType(CTRLTYPE_TREEVIEW);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("TREEHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEPICKUPTREEVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETREEGRIDEXVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6811\u8868\u683c\u89c6\u56fe\uff08\u589e\u5f3a\uff09");
        psViewType.setCodeName("TreeGridExView");
        psViewType.setTitle("\u6811\u8868\u683c\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("EDITDATA");
        psVTRV0.setDEFViewType("EDITVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("NEWDATA");
        psVTRV1.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("OPENDATA");
        psVTRV2.setDEFViewType("MAINVIEW");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_TREEGRIDEX);
        psVTCtrl12.setCtrlType(CTRLTYPE_TREEGRIDEX);
        psVTCtrl12.setPSSysToolbarId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psViewTypeMap.put("DETREEGRIDEXVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETREEGRIDEXVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6811\u8868\u683c\u89c6\u56fe\uff08\u589e\u5f3a\uff09\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("TreeGridExView9");
        psViewType.setTitle("\u6811\u8868\u683c\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("OPENDATA");
        psVTRV0.setDEFViewType("MAINVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("EDITDATA");
        psVTRV1.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("NEWDATA");
        psVTRV2.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_TREEGRIDEX);
        psVTCtrl12.setCtrlType(CTRLTYPE_TREEGRIDEX);
        psVTCtrl12.setPSSysToolbarId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psViewTypeMap.put("DETREEGRIDEXVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETREEGRIDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6811\u8868\u683c\u89c6\u56fe");
        psViewType.setCodeName("TreeGridView");
        psViewType.setTitle("\u6811\u8868\u683c\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("EDITDATA");
        psVTRV0.setDEFViewType("EDITVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("NEWDATA");
        psVTRV1.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("OPENDATA");
        psVTRV2.setDEFViewType("MAINVIEW");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psVTCtrl22 = new PSVTCtrlDTO();
        psVTCtrl22.setPSVTCtrlName(CTRLTYPE_TREEGRID);
        psVTCtrl22.setCtrlType(CTRLTYPE_TREEGRID);
        psVTCtrl22.setPSSysToolbarId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl22);
        psViewTypeMap.put("DETREEGRIDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETREEGRIDVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6811\u8868\u683c\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("TreeGridView9");
        psViewType.setTitle("\u6811\u8868\u683c\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("OPENDATA");
        psVTRV0.setDEFViewType("MAINVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("EDITDATA");
        psVTRV1.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("NEWDATA");
        psVTRV2.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_TREEGRID);
        psVTCtrl12.setCtrlType(CTRLTYPE_TREEGRID);
        psVTCtrl12.setPSSysToolbarId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psViewTypeMap.put("DETREEGRIDVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEKANBANVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u770b\u677f\u89c6\u56fe");
        psViewType.setCodeName("KanbanView");
        psViewType.setTitle("\u770b\u677f\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("OPENDATA");
        psVTRV0.setDEFViewType("");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("EDITDATA");
        psVTRV1.setDEFViewType("");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("NEWDATA");
        psVTRV2.setDEFViewType("");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psVTCtrl22 = new PSVTCtrlDTO();
        psVTCtrl22.setPSVTCtrlName(CTRLTYPE_KANBAN);
        psVTCtrl22.setCtrlType(CTRLTYPE_KANBAN);
        psVTCtrl22.setPSSysToolbarId("");
        psVTCtrl22.setPSSysACHandlerId("DATAVIEWHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl22);
        psViewTypeMap.put("DEKANBANVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEKANBANVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u770b\u677f\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("KanbanView9");
        psViewType.setTitle("\u770b\u677f\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("NEWDATA");
        psVTRV0.setDEFViewType("");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("OPENDATA");
        psVTRV1.setDEFViewType("");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("EDITDATA");
        psVTRV2.setDEFViewType("");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl12 = new PSVTCtrlDTO();
        psVTCtrl12.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl12.setPSSysToolbarId("");
        psVTCtrl12.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl12);
        psVTCtrl22 = new PSVTCtrlDTO();
        psVTCtrl22.setPSVTCtrlName(CTRLTYPE_KANBAN);
        psVTCtrl22.setCtrlType(CTRLTYPE_KANBAN);
        psVTCtrl22.setPSSysToolbarId("");
        psVTCtrl22.setPSSysACHandlerId("DATAVIEWHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl22);
        psViewTypeMap.put("DEKANBANVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEREPORTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u62a5\u8868\u89c6\u56fe");
        psViewType.setCodeName("ReportView");
        psViewType.setTitle("\u62a5\u8868\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_REPORTPANEL);
        psVTCtrl1.setCtrlType(CTRLTYPE_REPORTPANEL);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEREPORTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBREPORTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u62a5\u8868\u89c6\u56fe");
        psViewType.setCodeName("MobReportView");
        psViewType.setTitle("\u62a5\u8868\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_REPORTPANEL);
        psVTCtrl1.setCtrlType(CTRLTYPE_REPORTPANEL);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBREPORTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEWIZARDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5411\u5bfc\u89c6\u56fe");
        psViewType.setCodeName("WizardView");
        psViewType.setTitle("\u5411\u5bfc\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_WIZARDPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_WIZARDPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEWIZARDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBWIZARDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5411\u5bfc\u89c6\u56fe");
        psViewType.setCodeName("MobWizardView");
        psViewType.setTitle("\u5411\u5bfc\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_WIZARDPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_WIZARDPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBWIZARDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEHTMLVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53HTML\u89c6\u56fe");
        psViewType.setCodeName("HtmlView");
        psViewType.setTitle("HTML\u89c6\u56fe");
        psViewTypeMap.put("DEHTMLVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBHTMLVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aefHTML\u89c6\u56fe");
        psViewType.setCodeName("MobHtmlView");
        psViewType.setTitle("HTML\u89c6\u56fe");
        psViewTypeMap.put("DEMOBHTMLVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBFORMPICKUPMDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u8868\u5355\u7c7b\u578b\u9009\u62e9\u591a\u6570\u636e\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobFormPickupMDView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u8868\u5355\u7c7b\u578b\u9009\u62e9\u591a\u6570\u636e\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("MDCTRL");
        psVTCtrl0.setCtrlType(CTRLTYPE_MOBMDCTRL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBFORMPICKUPMDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBINDEXPICKUPMDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u7d22\u5f15\u7c7b\u578b\u9009\u62e9\u591a\u6570\u636e\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobIndexPickupMDView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u7d22\u5f15\u7c7b\u578b\u9009\u62e9\u591a\u6570\u636e\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("MDCTRL");
        psVTCtrl0.setCtrlType(CTRLTYPE_MOBMDCTRL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBINDEXPICKUPMDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEFORMPICKUPDATAVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u8868\u5355\u9009\u62e9\u6570\u636e\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("FormPickupDataView");
        psViewType.setTitle("\u8868\u5355\u9009\u62e9\u6570\u636e\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_DATAVIEW);
        psVTCtrl0.setCtrlType(CTRLTYPE_DATAVIEW);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("DATAVIEWHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEFORMPICKUPDATAVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEINDEXPICKUPDATAVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u7d22\u5f15\u5173\u7cfb\u9009\u62e9\u6570\u636e\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("IndexPickupDataView");
        psViewType.setTitle("\u7d22\u5f15\u5173\u7cfb\u9009\u62e9\u6570\u636e\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_DATAVIEW);
        psVTCtrl0.setCtrlType(CTRLTYPE_DATAVIEW);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("DATAVIEWHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEINDEXPICKUPDATAVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETABEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5206\u9875\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("TabExpView");
        psViewType.setTitle("\u5206\u9875\u5bfc\u822a\u89c6\u56fe");
        PSVTCtrlDTO psVTCtrl = new PSVTCtrlDTO();
        psVTCtrl.setPSVTCtrlName(CTRLTYPE_TABEXPPANEL);
        psVTCtrl.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl.setPSSysToolbarId("");
        psVTCtrl.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl);
        psViewTypeMap.put("DETABEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETABEXPVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5206\u9875\u5bfc\u822a\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("TabExpView9");
        psViewType.setTitle("\u5206\u9875\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl = new PSVTCtrlDTO();
        psVTCtrl.setPSVTCtrlName(CTRLTYPE_TABEXPPANEL);
        psVTCtrl.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl.setPSSysToolbarId("");
        psVTCtrl.setPSSysACHandlerId("");
        psViewTypeMap.put("DETABEXPVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETABSEARCHVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5206\u9875\u641c\u7d22\u89c6\u56fe");
        psViewType.setCodeName("TabSearchView");
        psViewType.setTitle("\u5206\u9875\u641c\u7d22\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_DRTAB);
        psVTCtrl1.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DETABSEARCHVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DETABSEARCHVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5206\u9875\u641c\u7d22\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("TabSearchView9");
        psViewType.setTitle("\u5206\u9875\u641c\u7d22\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_DRTAB);
        psVTCtrl1.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DETABSEARCHVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBTABSEARCHVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5206\u9875\u641c\u7d22\u89c6\u56fe");
        psViewType.setCodeName("MobTabSearchView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u5206\u9875\u641c\u7d22\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_DRTAB);
        psVTCtrl1.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBTABSEARCHVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBTABSEARCHVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5206\u9875\u641c\u7d22\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobTabSearchView9");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u5206\u9875\u641c\u7d22\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_SEARCHBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_SEARCHBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_DRTAB);
        psVTCtrl1.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBTABSEARCHVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBTABEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5206\u9875\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("MobTabExpView");
        psViewType.setTitle("\u5206\u9875\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TABVIEWPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_TABVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("TABVIEWPANEL2");
        psVTCtrl1.setCtrlType(CTRLTYPE_TABVIEWPANEL);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psVTCtrl2 = new PSVTCtrlDTO();
        psVTCtrl2.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl2.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl2.setPSSysToolbarId("");
        psVTCtrl2.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl2);
        psViewTypeMap.put("DEMOBTABEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBTABEXPVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5206\u9875\u5bfc\u822a\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobTabExpView9");
        psViewType.setTitle("\u5206\u9875\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TABVIEWPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_TABVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("TABVIEWPANEL2");
        psVTCtrl1.setCtrlType(CTRLTYPE_TABVIEWPANEL);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psVTCtrl2 = new PSVTCtrlDTO();
        psVTCtrl2.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl2.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl2.setPSSysToolbarId("");
        psVTCtrl2.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl2);
        psViewTypeMap.put("DEMOBTABEXPVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMEDITVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u591a\u8868\u5355\u7f16\u8f91\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MEditView9");
        psViewType.setTitle("\u591a\u8868\u5355\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("MEDITVIEWPANEL");
        psVTCtrl0.setCtrlType(CTRLTYPE_MULTIEDITVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("GRIDHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMEDITVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBMEDITVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u591a\u8868\u5355\u7f16\u8f91\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobMEditView9");
        psViewType.setTitle("\u591a\u8868\u5355\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("MEDITVIEWPANEL");
        psVTCtrl0.setCtrlType(CTRLTYPE_MULTIEDITVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("GRIDHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBMEDITVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPICKUPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6570\u636e\u9009\u62e9\u89c6\u56fe");
        psViewType.setCodeName("PickupView");
        psViewType.setTitle("\u6570\u636e\u9009\u62e9\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEPICKUPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPICKUPVIEW2");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6570\u636e\u9009\u62e9\u89c6\u56fe\uff08\u5de6\u53f3\u5173\u7cfb\uff09");
        psViewType.setCodeName("PickupView2");
        psViewType.setTitle("\u6570\u636e\u9009\u62e9\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_TREEEXPBAR);
        psVTCtrl1.setCtrlType(CTRLTYPE_TREEEXPBAR);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("TREEEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEPICKUPVIEW2", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPICKUPVIEW3");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6570\u636e\u9009\u62e9\u89c6\u56fe\uff08\u5206\u9875\u5173\u7cfb\uff09");
        psViewType.setCodeName("PickupView3");
        psViewType.setTitle("\u6570\u636e\u9009\u62e9\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("PICKUPVIEWPANEL2");
        psVTCtrl1.setCtrlType(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEPICKUPVIEW3", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMPICKUPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u6570\u636e\u591a\u9879\u9009\u62e9\u89c6\u56fe");
        psViewType.setCodeName("MPickupView");
        psViewType.setTitle("\u6570\u636e\u591a\u9879\u9009\u62e9\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMPICKUPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMPICKUPVIEW2");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u591a\u9879\u6570\u636e\u9009\u62e9\u89c6\u56fe\uff08\u5de6\u53f3\u5173\u7cfb\uff09");
        psViewType.setCodeName("MPickupView2");
        psViewType.setTitle("\u591a\u9879\u6570\u636e\u9009\u62e9\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_TREEEXPBAR);
        psVTCtrl1.setCtrlType(CTRLTYPE_TREEEXPBAR);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("TREEEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMPICKUPVIEW2", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBPICKUPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u6570\u636e\u9009\u62e9\u89c6\u56fe");
        psViewType.setCodeName("MobPickupView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u6570\u636e\u9009\u62e9\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName("MDCTRL");
        psVTCtrl0.setCtrlType(CTRLTYPE_MOBMDCTRL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl1.setCtrlType(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEMOBPICKUPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBMPICKUPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u591a\u6570\u636e\u9009\u62e9\u89c6\u56fe");
        psViewType.setCodeName("MobMPickupView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u591a\u6570\u636e\u9009\u62e9\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PICKUPVIEWPANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBMPICKUPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEGANTTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u7518\u7279\u89c6\u56fe");
        psViewType.setCodeName("GanttView");
        psViewType.setTitle("\u7518\u7279\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_GANTT);
        psVTCtrl0.setCtrlType(CTRLTYPE_GANTT);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEGANTTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEGANTTVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u7518\u7279\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("GanttView9");
        psViewType.setTitle("\u7518\u7279\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_GANTT);
        psVTCtrl0.setCtrlType(CTRLTYPE_GANTT);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEGANTTVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEGANTTEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u7518\u7279\u56fe\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("GanttExpView");
        psViewType.setTitle("\u7518\u7279\u56fe\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_GANTTEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_GANTTEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("GANTTEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEGANTTEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBGANTTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u7518\u7279\u89c6\u56fe");
        psViewType.setCodeName("MobGanttView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u7518\u7279\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_GANTT);
        psVTCtrl0.setCtrlType(CTRLTYPE_GANTT);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBGANTTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBGANTTVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u7518\u7279\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobGanttView9");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u7518\u7279\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_GANTT);
        psVTCtrl0.setCtrlType(CTRLTYPE_GANTT);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBGANTTVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBGANTTEXPVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u7518\u7279\u56fe\u5bfc\u822a\u89c6\u56fe");
        psViewType.setCodeName("MobGanttExpView");
        psViewType.setTitle("\u7518\u7279\u56fe\u5bfc\u822a\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_GANTTEXPBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_GANTTEXPBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("GANTTEXPBARHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBGANTTEXPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBWFDYNASTARTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u52a8\u6001\u542f\u52a8\u89c6\u56fe");
        psViewType.setCodeName("MobWFDynaStartView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u542f\u52a8\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("WFACTIONFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBWFDYNASTARTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBWFDYNAEXPMDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u52a8\u6001\u5bfc\u822a\u591a\u6570\u636e\u89c6\u56fe");
        psViewType.setCodeName("MobWFDynaExpMDView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u52a8\u6001\u5bfc\u822a\u591a\u6570\u636e\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("EDITDATA");
        psVTRV0.setDEFViewType("");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("NEWDATA");
        psVTRV1.setDEFViewType("");
        PSVTRVs.add(psVTRV1);
        PSVTCtrlDTO psVTCtrl03 = new PSVTCtrlDTO();
        psVTCtrl03.setPSVTCtrlName("MDCTRL");
        psVTCtrl03.setCtrlType(CTRLTYPE_MOBMDCTRL);
        psVTCtrl03.setPSSysToolbarId("");
        psVTCtrl03.setPSSysACHandlerId("LISTHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl03);
        PSVTCtrlDTO psVTCtrl13 = new PSVTCtrlDTO();
        psVTCtrl13.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl13.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl13.setPSSysToolbarId("TBTEMPL_01011");
        psVTCtrl13.setPSSysACHandlerId("");
        psVTCtrl13.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl13);
        psViewTypeMap.put("DEMOBWFDYNAEXPMDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBWFDYNAACTIONVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u52a8\u6001\u64cd\u4f5c\u89c6\u56fe");
        psViewType.setCodeName("MobWFDynaActionView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u64cd\u4f5c\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("WFACTIONFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBWFDYNAACTIONVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBWFDYNAEDITVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u52a8\u6001\u7f16\u8f91\u89c6\u56fe");
        psViewType.setCodeName("MobWFDynaEditView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl1.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl1.setPSSysToolbarId("TBTEMPL_01012");
        psVTCtrl1.setPSSysACHandlerId("");
        psVTCtrl1.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psVTCtrl2 = new PSVTCtrlDTO();
        psVTCtrl2.setPSVTCtrlName("QUICKTOOLBAR");
        psVTCtrl2.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl2.setPSSysToolbarId("TBTEMPL_01014");
        psVTCtrl2.setPSSysACHandlerId("");
        psVTCtrl2.setCtrlParam3("MOBWFACTIONMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl2);
        psViewTypeMap.put("DEMOBWFDYNAEDITVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBWFDYNAEDITVIEW3");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u52a8\u6001\u7f16\u8f91\u89c6\u56fe\uff08\u5206\u9875\u5173\u7cfb\uff09");
        psViewType.setCodeName("MobWFDynaEditView3");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u5de5\u4f5c\u6d41\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName("RIGHTTOOLBAR");
        psVTCtrl1.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl1.setPSSysToolbarId("TBTEMPL_01012");
        psVTCtrl1.setPSSysACHandlerId("");
        psVTCtrl1.setCtrlParam3("MOBNAVRIGHTMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psVTCtrl2 = new PSVTCtrlDTO();
        psVTCtrl2.setPSVTCtrlName(CTRLTYPE_DRTAB);
        psVTCtrl2.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl2.setPSSysToolbarId("");
        psVTCtrl2.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl2);
        PSVTCtrlDTO psVTCtrl3 = new PSVTCtrlDTO();
        psVTCtrl3.setPSVTCtrlName("QUICKTOOLBAR");
        psVTCtrl3.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl3.setPSSysToolbarId("TBTEMPL_01014");
        psVTCtrl3.setPSSysACHandlerId("");
        psVTCtrl3.setCtrlParam3("MOBWFACTIONMENU");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl3);
        psViewTypeMap.put("DEMOBWFDYNAEDITVIEW3", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEWFDYNASTARTVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5de5\u4f5c\u6d41\u52a8\u6001\u542f\u52a8\u89c6\u56fe");
        psViewType.setCodeName("WFDynaStartView");
        psViewType.setTitle("\u5de5\u4f5c\u6d41\u542f\u52a8\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("WFACTIONFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEWFDYNASTARTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEWFDYNAEXPGRIDVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5de5\u4f5c\u6d41\u52a8\u6001\u5bfc\u822a\u8868\u683c\u89c6\u56fe");
        psViewType.setCodeName("WFDynaExpGridView");
        psViewType.setTitle("\u5de5\u4f5c\u6d41\u5bfc\u822a\u8868\u683c\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("NEWDATA");
        psVTRV0.setDEFViewType("EDITVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("EDITDATA");
        psVTRV1.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV1);
        psVTCtrl03 = new PSVTCtrlDTO();
        psVTCtrl03.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl03.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl03.setPSSysToolbarId("TBTEMPL_01001");
        psVTCtrl03.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl03);
        psVTCtrl13 = new PSVTCtrlDTO();
        psVTCtrl13.setPSVTCtrlName(CTRLTYPE_GRID);
        psVTCtrl13.setCtrlType(CTRLTYPE_GRID);
        psVTCtrl13.setPSSysToolbarId("");
        psVTCtrl13.setPSSysACHandlerId("GRIDHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl13);
        PSVTCtrlDTO psVTCtrl23 = new PSVTCtrlDTO();
        psVTCtrl23.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl23.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl23.setPSSysToolbarId("");
        psVTCtrl23.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl23);
        psViewTypeMap.put("DEWFDYNAEXPGRIDVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEWFDYNAACTIONVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5de5\u4f5c\u6d41\u52a8\u6001\u64cd\u4f5c\u89c6\u56fe");
        psViewType.setCodeName("WFDynaActionView");
        psViewType.setTitle("\u5de5\u4f5c\u6d41\u64cd\u4f5c\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl0.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("WFACTIONFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEWFDYNAACTIONVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEWFDYNAEDITVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5de5\u4f5c\u6d41\u52a8\u6001\u7f16\u8f91\u89c6\u56fe");
        psViewType.setCodeName("WFDynaEditView");
        psViewType.setTitle("\u5de5\u4f5c\u6d41\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setPSSysToolbarId("TBTEMPL_01002");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl1.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEWFDYNAEDITVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEWFDYNAEDITVIEW3");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5de5\u4f5c\u6d41\u52a8\u6001\u89c6\u56fe\uff08\u5206\u9875\u5173\u7cfb\uff09");
        psViewType.setCodeName("WFDynaEditView3");
        psViewType.setTitle("\u5de5\u4f5c\u6d41\u7f16\u8f91\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl0.setPSSysToolbarId("TBTEMPL_01002");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl1.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psVTCtrl2 = new PSVTCtrlDTO();
        psVTCtrl2.setPSVTCtrlName(CTRLTYPE_DRTAB);
        psVTCtrl2.setCtrlType(CTRLTYPE_DRTAB);
        psVTCtrl2.setPSSysToolbarId("");
        psVTCtrl2.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl2);
        psViewTypeMap.put("DEWFDYNAEDITVIEW3", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DECUSTOMVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u81ea\u5b9a\u4e49\u89c6\u56fe");
        psViewType.setCodeName("CustomView");
        psViewType.setTitle("\u81ea\u5b9a\u4e49\u89c6\u56fe");
        psViewTypeMap.put("DECUSTOMVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMDCUSTOMVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u591a\u6570\u636e\u81ea\u5b9a\u4e49\u89c6\u56fe");
        psViewType.setCodeName("MDCustomView");
        psViewType.setTitle("\u591a\u6570\u636e\u81ea\u5b9a\u4e49\u89c6\u56fe");
        psVTRV0 = new PSVTRVDTO();
        psVTRV0.setPSVTRVName("OPENDATA");
        psVTRV0.setDEFViewType("MAINVIEW");
        PSVTRVs = new ArrayList();
        psViewType.set("PSVTRVs", PSVTRVs);
        PSVTRVs.add(psVTRV0);
        psVTRV1 = new PSVTRVDTO();
        psVTRV1.setPSVTRVName("NEWDATA");
        psVTRV1.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV1);
        psVTRV2 = new PSVTRVDTO();
        psVTRV2.setPSVTRVName("EDITDATA");
        psVTRV2.setDEFViewType("EDITVIEW");
        PSVTRVs.add(psVTRV2);
        psVTCtrl02 = new PSVTCtrlDTO();
        psVTCtrl02.setPSVTCtrlName(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setCtrlType(CTRLTYPE_TOOLBAR);
        psVTCtrl02.setPSSysToolbarId("TBTEMPL_00002");
        psVTCtrl02.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl02);
        psVTCtrl23 = new PSVTCtrlDTO();
        psVTCtrl23.setPSVTCtrlName(CTRLTYPE_SEARCHFORM);
        psVTCtrl23.setCtrlType(CTRLTYPE_SEARCHFORM);
        psVTCtrl23.setPSSysToolbarId("");
        psVTCtrl23.setPSSysACHandlerId("SEARCHFORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl23);
        psViewTypeMap.put("DEMDCUSTOMVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBCUSTOMVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u79fb\u52a8\u7aef\u81ea\u5b9a\u4e49\u89c6\u56fe");
        psViewType.setCodeName("MobCustomView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u81ea\u5b9a\u4e49\u89c6\u56fe");
        psViewTypeMap.put("DEMOBCUSTOMVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPANELVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u9762\u677f\u89c6\u56fe");
        psViewType.setCodeName("PanelView");
        psViewType.setTitle("\u9762\u677f\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEPANELVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEPANELVIEW9");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u9762\u677f\u89c6\u56fe");
        psViewType.setCodeName("PanelView9");
        psViewType.setTitle("\u9762\u677f\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEPANELVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBPANELVIEW");
        psViewType.setPSViewTypeName("\u79fb\u52a8\u7aef\u5b9e\u4f53\u9762\u677f\u89c6\u56fe");
        psViewType.setCodeName("MobPanelView");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u9762\u677f\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBPANELVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEMOBPANELVIEW9");
        psViewType.setPSViewTypeName("\u79fb\u52a8\u7aef\u5b9e\u4f53\u9762\u677f\u89c6\u56fe\uff08\u90e8\u4ef6\u89c6\u56fe\uff09");
        psViewType.setCodeName("MobPanelView9");
        psViewType.setTitle("\u79fb\u52a8\u7aef\u9762\u677f\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_PANEL);
        psVTCtrl0.setCtrlType(CTRLTYPE_PANEL);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psViewTypeMap.put("DEMOBPANELVIEW9", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DEINDEXVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u9996\u9875\u89c6\u56fe");
        psViewType.setCodeName("IndexView");
        psViewType.setTitle("\u9996\u9875\u89c6\u56fe");
        psVTCtrl0 = new PSVTCtrlDTO();
        psVTCtrl0.setPSVTCtrlName(CTRLTYPE_DRBAR);
        psVTCtrl0.setCtrlType(CTRLTYPE_DRBAR);
        psVTCtrl0.setPSSysToolbarId("");
        psVTCtrl0.setPSSysACHandlerId("");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl0);
        psVTCtrl1 = new PSVTCtrlDTO();
        psVTCtrl1.setPSVTCtrlName(CTRLTYPE_FORM);
        psVTCtrl1.setCtrlType(CTRLTYPE_FORM);
        psVTCtrl1.setPSSysToolbarId("");
        psVTCtrl1.setPSSysACHandlerId("FORMHANDLER");
        psViewType.getPSVTCtrlsIf().add(psVTCtrl1);
        psViewTypeMap.put("DEINDEXVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("DESUBAPPREFVIEW");
        psViewType.setPSViewTypeName("\u5b9e\u4f53\u5b50\u5e94\u7528\u5f15\u7528\u89c6\u56fe");
        psViewType.setCodeName("SubAppRefView");
        psViewType.setTitle("\u5b50\u5e94\u7528\u5f15\u7528\u89c6\u56fe");
        psViewTypeMap.put("DESUBAPPREFVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPINDEXVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u9996\u9875\u89c6\u56fe");
        psViewType.setCodeName("AppIndexView");
        psViewType.setTitle("\u5e94\u7528\u9996\u9875\u89c6\u56fe");
        psViewTypeMap.put("APPINDEXVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPLOGINVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u767b\u5f55\u89c6\u56fe");
        psViewType.setCodeName("AppLoginView");
        psViewType.setTitle("\u5e94\u7528\u767b\u5f55\u89c6\u56fe");
        psViewTypeMap.put("APPLOGINVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPLOGOUTVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6ce8\u9500\u89c6\u56fe");
        psViewType.setCodeName("AppLogoutView");
        psViewType.setTitle("\u5e94\u7528\u6ce8\u9500\u89c6\u56fe");
        psViewTypeMap.put("APPLOGOUTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPPANELVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u9762\u677f\u89c6\u56fe");
        psViewType.setCodeName("AppPanelView");
        psViewType.setTitle("\u5e94\u7528\u9762\u677f\u89c6\u56fe");
        psViewTypeMap.put("APPPANELVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPPICUPLOADVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u56fe\u7247\u4e0a\u4f20\u89c6\u56fe");
        psViewType.setCodeName("AppPicUploadView");
        psViewType.setTitle("\u5e94\u7528\u56fe\u7247\u4e0a\u4f20\u89c6\u56fe");
        psViewTypeMap.put("APPPICUPLOADVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPPORTALVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u770b\u677f\u89c6\u56fe");
        psViewType.setCodeName("AppPortalView");
        psViewType.setTitle("\u5e94\u7528\u770b\u677f\u89c6\u56fe");
        psViewTypeMap.put("APPPORTALVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPSTARTVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u542f\u52a8\u89c6\u56fe");
        psViewType.setCodeName("AppStartView");
        psViewType.setTitle("\u5e94\u7528\u542f\u52a8\u89c6\u56fe");
        psViewTypeMap.put("APPSTARTVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPWELCOMEVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6b22\u8fce\u89c6\u56fe");
        psViewType.setCodeName("AppWelcomeView");
        psViewType.setTitle("\u5e94\u7528\u6b22\u8fce\u89c6\u56fe");
        psViewTypeMap.put("APPWELCOMEVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPFUNCPICKUPVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u529f\u80fd\u9009\u62e9\u89c6\u56fe");
        psViewType.setCodeName("AppFuncPickupView");
        psViewType.setTitle("\u5e94\u7528\u529f\u80fd\u9009\u62e9\u89c6\u56fe");
        psViewTypeMap.put("APPFUNCPICKUPVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPFILEUPLOADVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6587\u4ef6\u4e0a\u4f20\u89c6\u56fe");
        psViewType.setCodeName("AppFileUploadView");
        psViewType.setTitle("\u5e94\u7528\u6587\u4ef6\u4e0a\u4f20\u89c6\u56fe");
        psViewTypeMap.put("APPFILEUPLOADVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPERRORVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u9519\u8bef\u663e\u793a\u89c6\u56fe");
        psViewType.setCodeName("AppErrorView");
        psViewType.setTitle("\u5e94\u7528\u9519\u8bef\u663e\u793a\u89c6\u56fe");
        psViewTypeMap.put("APPERRORVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPDATAUPLOADVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6570\u636e\u5bfc\u5165\u89c6\u56fe");
        psViewType.setCodeName("AppDataUploadView");
        psViewType.setTitle("\u5e94\u7528\u6570\u636e\u5bfc\u5165\u89c6\u56fe");
        psViewTypeMap.put("APPDATAUPLOADVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPWFADDSTEPAFTERVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6d41\u7a0b\u540e\u52a0\u7b7e\u64cd\u4f5c\u89c6\u56fe");
        psViewType.setCodeName("AppWFAddStepAfterView");
        psViewType.setTitle("\u5e94\u7528\u6d41\u7a0b\u540e\u52a0\u7b7e\u64cd\u4f5c\u89c6\u56fe");
        psViewTypeMap.put("APPWFADDSTEPAFTERVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPWFADDSTEPBEFOREVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6d41\u7a0b\u524d\u52a0\u7b7e\u64cd\u4f5c\u89c6\u56fe");
        psViewType.setCodeName("AppWFAddStepBeforeView");
        psViewType.setTitle("\u5e94\u7528\u6d41\u7a0b\u524d\u52a0\u7b7e\u64cd\u4f5c\u89c6\u56fe");
        psViewTypeMap.put("APPWFADDSTEPBEFOREVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPWFSENDBACKVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6d41\u7a0b\u56de\u9000\u64cd\u4f5c\u89c6\u56fe");
        psViewType.setCodeName("AppWFSendBackView");
        psViewType.setTitle("\u5e94\u7528\u6d41\u7a0b\u56de\u9000\u64cd\u4f5c\u89c6\u56fe");
        psViewTypeMap.put("APPWFSENDBACKVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPWFSTEPACTORVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6d41\u7a0b\u5f53\u524d\u5904\u7406\u4eba\u89c6\u56fe");
        psViewType.setCodeName("AppWFStepActorView");
        psViewType.setTitle("\u5e94\u7528\u6d41\u7a0b\u5f53\u524d\u5904\u7406\u4eba\u89c6\u56fe");
        psViewTypeMap.put("APPWFSTEPACTORVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPWFSTEPDATAVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6d41\u7a0b\u5904\u7406\u8bb0\u5f55\u89c6\u56fe");
        psViewType.setCodeName("AppWFStepDataView");
        psViewType.setTitle("\u5e94\u7528\u6d41\u7a0b\u5904\u7406\u8bb0\u5f55\u89c6\u56fe");
        psViewTypeMap.put("APPWFSTEPDATAVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPWFSTEPTRACEVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6d41\u7a0b\u8ddf\u8e2a\u89c6\u56fe");
        psViewType.setCodeName("AppWFStepTraceView");
        psViewType.setTitle("\u5e94\u7528\u6d41\u7a0b\u8ddf\u8e2a\u89c6\u56fe");
        psViewTypeMap.put("APPWFSTEPTRACEVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPWFSUPPLYINFOVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6d41\u7a0b\u8865\u5145\u4fe1\u606f\u64cd\u4f5c\u89c6\u56fe");
        psViewType.setCodeName("AppWFSupplyInfoView");
        psViewType.setTitle("\u5e94\u7528\u6d41\u7a0b\u8865\u5145\u4fe1\u606f\u64cd\u4f5c\u89c6\u56fe");
        psViewTypeMap.put("APPWFSUPPLYINFOVIEW", psViewType);
        psViewType = new PSViewTypeDTO();
        psViewType.setPSViewTypeId("APPWFTAKEADVICEVIEW");
        psViewType.setPSViewTypeName("\u5e94\u7528\u6d41\u7a0b\u5f81\u6c42\u610f\u89c1\u64cd\u4f5c\u89c6\u56fe");
        psViewType.setCodeName("AppWFTakeAdviceView");
        psViewType.setTitle("\u5e94\u7528\u6d41\u7a0b\u5f81\u6c42\u610f\u89c1\u64cd\u4f5c\u89c6\u56fe");
        psViewTypeMap.put("APPWFTAKEADVICEVIEW", psViewType);
    }
}