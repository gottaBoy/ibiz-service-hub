package net.ibizsys.modeling.core.dataentity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFDLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFIUDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFIUpdateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormLogicDTO;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * Form runtime.
 *
 * <p>Nested form members, member logics and item updates are loaded before an
 * update so that the nested relation translation sees the full tree. Member,
 * logic and item-update names must be unique (case-insensitive) inside a
 * form; duplicates are rejected before the model is persisted.</p>
 */
public class PSDEFormDERuntime extends DataEntityRuntimeBase2 {

    private static final Log log = LogFactory.getLog(PSDEFormDERuntime.class);

    protected static final String[] batchActionDENames =
            new String[] {"PSDEFORMDETAIL", "PSDEFDLOGIC", "PSDEFIUPDATE",
                    "PSDEFIUDETAIL", "PSDEFORMLOGIC", "PSDEFIVR"};

    @Override
    protected String[] getBatchActionDENames() {
        return batchActionDENames;
    }

    @Override
    protected void checkEntityNestedDERsBeforeProceed(IEntityBase arg0, String strActionName,
            IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity,
            IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
        if (iPSDEAction != null && "UPDATE".equalsIgnoreCase(iPSDEAction.getActionMode())) {
            ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
            PSDEFormDTO psDEFormDTO = (PSDEFormDTO) rawGet(getFieldValue(arg0, getKeyPSDEField()));
            Map<String, PSDEFormDetailDTO> psDEFormDetailDTOMap = new HashMap<>();
            Map<String, PSDEFDLogicDTO> psDEFDLogicDTOMap = new HashMap<>();
            Map<String, PSDEFIUpdateDTO> psDEFIUpdateDTOMap = new HashMap<>();

            IDataEntityRuntime psDEFormDetailDERuntime =
                    (IDataEntityRuntime) getSystemRuntime().getDataEntityRuntime("PSDEFORMDETAIL");
            ISearchContextDTO iSearchContextDTO = psDEFormDetailDERuntime.createSearchContext();
            iSearchContextDTO.eq("PSDEFORMID", psDEFormDTO.getPSDEFormId());
            iSearchContextDTO.sort("ORDERVALUE");
            iSearchContextDTO.all().count(false);
            List<IEntityDTO> psDEFormDetailDTOs = psDEFormDetailDERuntime.select(iSearchContextDTO);
            if (!ObjectUtils.isEmpty(psDEFormDetailDTOs)) {
                List<PSDEFormDetailDTO> list = new ArrayList<>();
                for (IEntityDTO item : psDEFormDetailDTOs) {
                    PSDEFormDetailDTO psDEFormDetailDTO = (PSDEFormDetailDTO) item;
                    psDEFormDetailDTOMap.put(psDEFormDetailDTO.getPSDEFormDetailId(), psDEFormDetailDTO);
                }
                for (IEntityDTO item : psDEFormDetailDTOs) {
                    PSDEFormDetailDTO psDEFormDetailDTO = (PSDEFormDetailDTO) item;
                    if (StringUtils.hasLength(psDEFormDetailDTO.getPPSDEFormDetailId())) {
                        PSDEFormDetailDTO parentPSDEFormDetailDTO =
                                psDEFormDetailDTOMap.get(psDEFormDetailDTO.getPPSDEFormDetailId());
                        if (parentPSDEFormDetailDTO == null) {
                            throw new Exception(String.format(
                                    "无法获取指定表单成员[%1$s]",
                                    psDEFormDetailDTO.getPPSDEFormDetailId()));
                        }
                        parentPSDEFormDetailDTO.getPSDEFormDetailsIf().add(psDEFormDetailDTO);
                        continue;
                    }
                    list.add(psDEFormDetailDTO);
                }
                if (!ObjectUtils.isEmpty(list)) {
                    psDEFormDTO.setPSDEFormDetails(list);
                }
            }

            IDataEntityRuntime psDEFDLogicDERuntime =
                    (IDataEntityRuntime) getSystemRuntime().getDataEntityRuntime("PSDEFDLOGIC");
            ISearchContextDTO iSearchContextDTO2 = psDEFDLogicDERuntime.createSearchContext();
            iSearchContextDTO2.eq("PSDEFORMID", psDEFormDTO.getPSDEFormId());
            iSearchContextDTO2.sort("ORDERVALUE");
            iSearchContextDTO2.all().count(false);
            List<IEntityDTO> psDEFDLogicDTOs = psDEFDLogicDERuntime.select(iSearchContextDTO2);
            if (!ObjectUtils.isEmpty(psDEFDLogicDTOs)) {
                for (IEntityDTO item : psDEFDLogicDTOs) {
                    PSDEFDLogicDTO psDEFDLogicDTO = (PSDEFDLogicDTO) item;
                    psDEFDLogicDTOMap.put(psDEFDLogicDTO.getPSDEFDLogicId(), psDEFDLogicDTO);
                }
                for (IEntityDTO item : psDEFDLogicDTOs) {
                    PSDEFDLogicDTO psDEFDLogicDTO = (PSDEFDLogicDTO) item;
                    if (StringUtils.hasLength(psDEFDLogicDTO.getPPSDEFDLogicId())) {
                        PSDEFDLogicDTO parentPSDEFDLogicDTO =
                                psDEFDLogicDTOMap.get(psDEFDLogicDTO.getPPSDEFDLogicId());
                        if (parentPSDEFDLogicDTO == null) {
                            throw new Exception(String.format(
                                    "无法获取指定表单成员逻辑[%1$s]",
                                    psDEFDLogicDTO.getPPSDEFDLogicId()));
                        }
                        parentPSDEFDLogicDTO.getPSDEFDLogicsIf().add(psDEFDLogicDTO);
                        continue;
                    }
                    PSDEFormDetailDTO psDEFormDetailDTO =
                            psDEFormDetailDTOMap.get(psDEFDLogicDTO.getPSDEFormDetailId());
                    if (psDEFormDetailDTO == null) {
                        throw new Exception(String.format(
                                "无法获取指定表单成员[%1$s]",
                                psDEFDLogicDTO.getPSDEFormDetailId()));
                    }
                    psDEFormDetailDTO.getPSDEFDLogicsIf().add(psDEFDLogicDTO);
                }
            }

            IDataEntityRuntime psDEFIUpdateDERuntime =
                    (IDataEntityRuntime) getSystemRuntime().getDataEntityRuntime("PSDEFIUPDATE");
            ISearchContextDTO iSearchContextDTO3 = psDEFIUpdateDERuntime.createSearchContext();
            iSearchContextDTO3.eq("PSDEFORMID", psDEFormDTO.getPSDEFormId());
            iSearchContextDTO3.all().count(false);
            List<IEntityDTO> psDEFIUpdateDTOs = psDEFIUpdateDERuntime.select(iSearchContextDTO3);
            if (!ObjectUtils.isEmpty(psDEFIUpdateDTOs)) {
                List<PSDEFIUpdateDTO> psDEFIUpdateList = new ArrayList<>();
                for (IEntityDTO item : psDEFIUpdateDTOs) {
                    PSDEFIUpdateDTO psDEFIUpdateDTO = (PSDEFIUpdateDTO) item;
                    psDEFIUpdateDTOMap.put(psDEFIUpdateDTO.getPSDEFIUpdateId(), psDEFIUpdateDTO);
                    psDEFIUpdateList.add(psDEFIUpdateDTO);
                }
                psDEFormDTO.setPSDEFIUpdates(psDEFIUpdateList);
            }

            IDataEntityRuntime psDEFIUDetailDERuntime =
                    (IDataEntityRuntime) getSystemRuntime().getDataEntityRuntime("PSDEFIUDETAIL");
            ISearchContextDTO iSearchContextDTO4 = psDEFIUDetailDERuntime.createSearchContext();
            iSearchContextDTO4.eq("PSDEFORMID", psDEFormDTO.getPSDEFormId());
            iSearchContextDTO4.sort("PSDEFORMDETAILNAME");
            iSearchContextDTO4.all().count(false);
            List<IEntityDTO> psDEFIUDetailDTOs = psDEFIUDetailDERuntime.select(iSearchContextDTO4);
            if (!ObjectUtils.isEmpty(psDEFIUDetailDTOs)) {
                for (IEntityDTO item : psDEFIUDetailDTOs) {
                    PSDEFIUDetailDTO psDEFIUDetailDTO = (PSDEFIUDetailDTO) item;
                    PSDEFIUpdateDTO psDEFIUpdateDTO =
                            psDEFIUpdateDTOMap.get(psDEFIUDetailDTO.getPSDEFIUpdateId());
                    if (psDEFIUpdateDTO == null) {
                        throw new Exception(String.format(
                                "无法获取指定表单项更新[%1$s]",
                                psDEFIUDetailDTO.getPSDEFIUpdateId()));
                    }
                    psDEFIUpdateDTO.getPSDEFIDetailsIf().add(psDEFIUDetailDTO);
                }
            }

            IDataEntityRuntime psDEFieldDERuntime =
                    (IDataEntityRuntime) getSystemRuntime().getDataEntityRuntime("PSDEFIELD");
            ISearchContextDTO iSearchContextDTO5 = psDEFieldDERuntime.createSearchContext();
            iSearchContextDTO5.eq("PSDEID", psDEFormDTO.getPSDEId());
            iSearchContextDTO5.all().raw();
            List<IEntityDTO> psDEFieldDTOs = psDEFieldDERuntime.select(iSearchContextDTO5);
            if (!ObjectUtils.isEmpty(psDEFieldDTOs)) {
                for (IEntityDTO item : psDEFieldDTOs) {
                    PSDEFieldDTO psDEFieldDTO = (PSDEFieldDTO) item;
                    actionSession.setActionParam(String.format("_FILLENTITYFULLINFO_EXIST__%1$s__%2$s",
                            psDEFieldDERuntime.getId(), psDEFieldDTO.getId()), 1);
                    actionSession.setActionParam(String.format("_FILLENTITYFULLINFO__%1$s__%2$s",
                            psDEFieldDERuntime.getId(), psDEFieldDTO.getId()), psDEFieldDTO);
                }
            }

            actionSession.setActionParam(String.format("_NESTEDENTITIES__%1$s__%2$s__%3$s",
                    getId(), "psdeformdetails", psDEFormDTO.getId()), psDEFormDTO.getPSDEFormDetailsIf());
            actionSession.setActionParam(String.format("_NESTEDENTITIES__%1$s__%2$s__%3$s",
                    getId(), "psdefiupdates", psDEFormDTO.getId()), psDEFormDTO.getPSDEFIUpdatesIf());
            for (Map.Entry<String, PSDEFormDetailDTO> entry : psDEFormDetailDTOMap.entrySet()) {
                actionSession.setActionParam(String.format("_NESTEDENTITIES__%1$s__%2$s__%3$s",
                        psDEFormDetailDERuntime.getId(), "psdeformdetails", entry.getKey()),
                        entry.getValue().getPSDEFormDetailsIf());
                actionSession.setActionParam(String.format("_NESTEDENTITIES__%1$s__%2$s__%3$s",
                        psDEFormDetailDERuntime.getId(), "psdefdlogics", entry.getKey()),
                        entry.getValue().getPSDEFDLogicsIf());
            }
            for (Map.Entry<String, PSDEFDLogicDTO> entry : psDEFDLogicDTOMap.entrySet()) {
                actionSession.setActionParam(String.format("_NESTEDENTITIES__%1$s__%2$s__%3$s",
                        psDEFDLogicDERuntime.getId(), "psdefdlogics", entry.getKey()),
                        entry.getValue().getPSDEFDLogicsIf());
            }
            for (Map.Entry<String, PSDEFIUpdateDTO> entry : psDEFIUpdateDTOMap.entrySet()) {
                actionSession.setActionParam(String.format("_NESTEDENTITIES__%1$s__%2$s__%3$s",
                        psDEFIUpdateDERuntime.getId(), "psdefiudetails", entry.getKey()),
                        entry.getValue().getPSDEFIDetailsIf());
            }
        }
        super.checkEntityNestedDERsBeforeProceed(arg0, strActionName, iPSDEAction, iPSDataEntity,
                iDynaInstRuntime, actionData);
        PSDEFormDTO psDEFormDTO = (PSDEFormDTO) arg0;
        checkPSDEFormDetailNames(psDEFormDTO.getPSDEFormDetails(), null);
        checkPSDEFormLogicNames(psDEFormDTO.getPSDEFormLogics(), null);
        checkPSDEFIUpdateNames(psDEFormDTO.getPSDEFIUpdates(), null);
        checkPSDEFIUpdateCodeNames(psDEFormDTO.getPSDEFIUpdates(), null);
    }

    /**
     * Ensure every (nested) form member has a name that is unique inside the
     * form, ignoring case.
     */
    protected void checkPSDEFormDetailNames(List<PSDEFormDetailDTO> list,
            Map<String, PSDEFormDetailDTO> psDEFormDetailNameMap) throws Exception {
        if (ObjectUtils.isEmpty(list)) {
            return;
        }
        if (psDEFormDetailNameMap == null) {
            psDEFormDetailNameMap = new HashMap<>();
        }
        for (PSDEFormDetailDTO psDEFormDetailDTO : list) {
            if (!StringUtils.hasLength(psDEFormDetailDTO.getName())) {
                throw new Exception("表单成员未指定名称");
            }
            PSDEFormDetailDTO last = psDEFormDetailNameMap.get(psDEFormDetailDTO.getName().toLowerCase());
            if (last != null) {
                throw new Exception(String.format(
                        "出现重复的表单成员名称[%1$s]", last.getName()));
            }
            psDEFormDetailNameMap.put(psDEFormDetailDTO.getName().toLowerCase(), psDEFormDetailDTO);
            checkPSDEFormDetailNames(psDEFormDetailDTO.getPSDEFormDetails(), psDEFormDetailNameMap);
        }
    }

    /**
     * Ensure every form logic has a name that is unique inside the form,
     * ignoring case.
     */
    protected void checkPSDEFormLogicNames(List<PSDEFormLogicDTO> list,
            Map<String, PSDEFormLogicDTO> psDEFormLogicNameMap) throws Exception {
        if (ObjectUtils.isEmpty(list)) {
            return;
        }
        if (psDEFormLogicNameMap == null) {
            psDEFormLogicNameMap = new HashMap<>();
        }
        for (PSDEFormLogicDTO psDEFormLogicDTO : list) {
            if (!StringUtils.hasLength(psDEFormLogicDTO.getName())) {
                throw new Exception("表单逻辑项未指定名称");
            }
            PSDEFormLogicDTO last = psDEFormLogicNameMap.get(psDEFormLogicDTO.getName().toLowerCase());
            if (last != null) {
                throw new Exception(String.format(
                        "出现重复的表单逻辑项名称[%1$s]", last.getName()));
            }
            psDEFormLogicNameMap.put(psDEFormLogicDTO.getName().toLowerCase(), psDEFormLogicDTO);
        }
    }

    /**
     * Ensure every form item update has a name that is unique inside the
     * form, ignoring case.
     */
    protected void checkPSDEFIUpdateNames(List<PSDEFIUpdateDTO> list,
            Map<String, PSDEFIUpdateDTO> psDEFIUpdateNameMap) throws Exception {
        if (ObjectUtils.isEmpty(list)) {
            return;
        }
        if (psDEFIUpdateNameMap == null) {
            psDEFIUpdateNameMap = new HashMap<>();
        }
        for (PSDEFIUpdateDTO psDEFIUpdateDTO : list) {
            if (!StringUtils.hasLength(psDEFIUpdateDTO.getName())) {
                throw new Exception("表单项更新未指定名称");
            }
            PSDEFIUpdateDTO last = psDEFIUpdateNameMap.get(psDEFIUpdateDTO.getName().toLowerCase());
            if (last != null) {
                throw new Exception(String.format(
                        "出现重复的表单项更新名称[%1$s]", last.getName()));
            }
            psDEFIUpdateNameMap.put(psDEFIUpdateDTO.getName().toLowerCase(), psDEFIUpdateDTO);
        }
    }

    /**
     * Ensure every form item update has a code name that is unique inside
     * the form, ignoring case.
     */
    protected void checkPSDEFIUpdateCodeNames(List<PSDEFIUpdateDTO> list,
            Map<String, PSDEFIUpdateDTO> psDEFIUpdateNameMap) throws Exception {
        if (ObjectUtils.isEmpty(list)) {
            return;
        }
        if (psDEFIUpdateNameMap == null) {
            psDEFIUpdateNameMap = new HashMap<>();
        }
        for (PSDEFIUpdateDTO psDEFIUpdateDTO : list) {
            if (!StringUtils.hasLength(psDEFIUpdateDTO.getCodeName())) {
                throw new Exception("表单项更新未指定代码名称");
            }
            PSDEFIUpdateDTO last = psDEFIUpdateNameMap.get(psDEFIUpdateDTO.getCodeName().toLowerCase());
            if (last != null) {
                throw new Exception(String.format(
                        "出现重复的表单项更新代码名称[%1$s]", last.getName()));
            }
            psDEFIUpdateNameMap.put(psDEFIUpdateDTO.getCodeName().toLowerCase(), psDEFIUpdateDTO);
        }
    }

    @Override
    protected void translateEntityNestedDERAfterProceed(IEntityDTO iEntityDTO,
            IPSDEMethodDTOField iPSDEMethodDTOField, String strActionName, IPSDEAction iPSDEAction,
            IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData)
            throws Throwable {
        if (iPSDEMethodDTOField.getName().equalsIgnoreCase("psdeformdetails")) {
            PSDEFormDTO psDEFormDTO = (PSDEFormDTO) iEntityDTO;
            Map<String, PSDEFormDetailDTO> psDEFormDetailDTOMap = new HashMap<>();
            Map<String, PSDEFDLogicDTO> psDEFDLogicDTOMap = new HashMap<>();
            IDataEntityRuntime psDEFormDetailDERuntime =
                    (IDataEntityRuntime) getSystemRuntime().getDataEntityRuntime("PSDEFORMDETAIL");
            ISearchContextDTO iSearchContextDTO = psDEFormDetailDERuntime.createSearchContext();
            iSearchContextDTO.eq("PSDEFORMID", psDEFormDTO.getPSDEFormId());
            iSearchContextDTO.sort("ORDERVALUE");
            iSearchContextDTO.all().count(false);
            List<IEntityDTO> psDEFormDetailDTOs = psDEFormDetailDERuntime.select(iSearchContextDTO);
            if (!ObjectUtils.isEmpty(psDEFormDetailDTOs)) {
                List<PSDEFormDetailDTO> list = new ArrayList<>();
                for (IEntityDTO item : psDEFormDetailDTOs) {
                    PSDEFormDetailDTO psDEFormDetailDTO = (PSDEFormDetailDTO) item;
                    psDEFormDetailDTOMap.put(psDEFormDetailDTO.getPSDEFormDetailId(), psDEFormDetailDTO);
                }
                for (IEntityDTO item : psDEFormDetailDTOs) {
                    PSDEFormDetailDTO psDEFormDetailDTO = (PSDEFormDetailDTO) item;
                    if (StringUtils.hasLength(psDEFormDetailDTO.getPPSDEFormDetailId())) {
                        PSDEFormDetailDTO parentPSDEFormDetailDTO =
                                psDEFormDetailDTOMap.get(psDEFormDetailDTO.getPPSDEFormDetailId());
                        if (parentPSDEFormDetailDTO == null) {
                            throw new Exception(String.format(
                                    "无法获取指定表单成员[%1$s]",
                                    psDEFormDetailDTO.getPPSDEFormDetailId()));
                        }
                        parentPSDEFormDetailDTO.getPSDEFormDetailsIf().add(psDEFormDetailDTO);
                        continue;
                    }
                    list.add(psDEFormDetailDTO);
                }
                if (!ObjectUtils.isEmpty(list)) {
                    psDEFormDTO.setPSDEFormDetails(list);
                }
            }
            IDataEntityRuntime psDEFDLogicDERuntime =
                    (IDataEntityRuntime) getSystemRuntime().getDataEntityRuntime("PSDEFDLOGIC");
            iSearchContextDTO = psDEFDLogicDERuntime.createSearchContext();
            iSearchContextDTO.eq("PSDEFORMID", psDEFormDTO.getPSDEFormId());
            iSearchContextDTO.sort("ORDERVALUE");
            iSearchContextDTO.all().count(false);
            List<IEntityDTO> psDEFDLogicDTOs = psDEFDLogicDERuntime.select(iSearchContextDTO);
            if (!ObjectUtils.isEmpty(psDEFDLogicDTOs)) {
                for (IEntityDTO item : psDEFDLogicDTOs) {
                    PSDEFDLogicDTO psDEFDLogicDTO = (PSDEFDLogicDTO) item;
                    psDEFDLogicDTOMap.put(psDEFDLogicDTO.getPSDEFDLogicId(), psDEFDLogicDTO);
                }
                for (IEntityDTO item : psDEFDLogicDTOs) {
                    PSDEFDLogicDTO psDEFDLogicDTO = (PSDEFDLogicDTO) item;
                    if (StringUtils.hasLength(psDEFDLogicDTO.getPPSDEFDLogicId())) {
                        PSDEFDLogicDTO parentPSDEFDLogicDTO =
                                psDEFDLogicDTOMap.get(psDEFDLogicDTO.getPPSDEFDLogicId());
                        if (parentPSDEFDLogicDTO == null) {
                            throw new Exception(String.format(
                                    "无法获取指定表单成员逻辑[%1$s]",
                                    psDEFDLogicDTO.getPPSDEFDLogicId()));
                        }
                        parentPSDEFDLogicDTO.getPSDEFDLogicsIf().add(psDEFDLogicDTO);
                        continue;
                    }
                    PSDEFormDetailDTO psDEFormDetailDTO =
                            psDEFormDetailDTOMap.get(psDEFDLogicDTO.getPSDEFormDetailId());
                    if (psDEFormDetailDTO == null) {
                        throw new Exception(String.format(
                                "无法获取指定表单成员[%1$s]",
                                psDEFDLogicDTO.getPSDEFormDetailId()));
                    }
                    psDEFormDetailDTO.getPSDEFDLogicsIf().add(psDEFDLogicDTO);
                    psDEFormDetailDTO.set("fdlogiccount", psDEFormDetailDTO.getPSDEFDLogicsIf().size());
                }
            }
            return;
        }
        if (iPSDEMethodDTOField.getName().equalsIgnoreCase("psdefiupdates")) {
            PSDEFormDTO psDEFormDTO = (PSDEFormDTO) iEntityDTO;
            Map<String, PSDEFIUpdateDTO> psDEFIUpdateDTOMap = new HashMap<>();
            IDataEntityRuntime psDEFIUpdateDERuntime =
                    (IDataEntityRuntime) getSystemRuntime().getDataEntityRuntime("PSDEFIUPDATE");
            ISearchContextDTO iSearchContextDTO = psDEFIUpdateDERuntime.createSearchContext();
            iSearchContextDTO.eq("PSDEFORMID", psDEFormDTO.getPSDEFormId());
            iSearchContextDTO.all().count(false);
            List<IEntityDTO> psDEFIUpdateDTOs = psDEFIUpdateDERuntime.select(iSearchContextDTO);
            if (!ObjectUtils.isEmpty(psDEFIUpdateDTOs)) {
                List<PSDEFIUpdateDTO> psDEFIUpdateList = new ArrayList<>();
                for (IEntityDTO item : psDEFIUpdateDTOs) {
                    PSDEFIUpdateDTO psDEFIUpdateDTO = (PSDEFIUpdateDTO) item;
                    psDEFIUpdateDTOMap.put(psDEFIUpdateDTO.getPSDEFIUpdateId(), psDEFIUpdateDTO);
                    psDEFIUpdateList.add(psDEFIUpdateDTO);
                }
                psDEFormDTO.setPSDEFIUpdates(psDEFIUpdateList);
            }
            IDataEntityRuntime psDEFIUDetailDERuntime =
                    (IDataEntityRuntime) getSystemRuntime().getDataEntityRuntime("PSDEFIUDETAIL");
            iSearchContextDTO = psDEFIUDetailDERuntime.createSearchContext();
            iSearchContextDTO.eq("PSDEFORMID", psDEFormDTO.getPSDEFormId());
            iSearchContextDTO.sort("PSDEFORMDETAILNAME");
            iSearchContextDTO.all().count(false);
            List<IEntityDTO> psDEFIUDetailDTOs = psDEFIUDetailDERuntime.select(iSearchContextDTO);
            if (!ObjectUtils.isEmpty(psDEFIUDetailDTOs)) {
                for (IEntityDTO item : psDEFIUDetailDTOs) {
                    PSDEFIUDetailDTO psDEFIUDetailDTO = (PSDEFIUDetailDTO) item;
                    PSDEFIUpdateDTO psDEFIUpdateDTO =
                            psDEFIUpdateDTOMap.get(psDEFIUDetailDTO.getPSDEFIUpdateId());
                    if (psDEFIUpdateDTO == null) {
                        throw new Exception(String.format(
                                "无法获取指定表单项更新[%1$s]",
                                psDEFIUDetailDTO.getPSDEFIUpdateId()));
                    }
                    psDEFIUpdateDTO.getPSDEFIDetailsIf().add(psDEFIUDetailDTO);
                }
            }
            return;
        }
        super.translateEntityNestedDERAfterProceed(iEntityDTO, iPSDEMethodDTOField, strActionName,
                iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
    }
}