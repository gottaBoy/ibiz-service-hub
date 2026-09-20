package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFieldService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFormService;
import net.ibizsys.modeling.core.dataentity.service.IPSDataEntityService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

public class PSDEFormInitializer
extends PSModelInitializerBase {
    @Autowired
    private IPSDataEntityService iPSDataEntityService = null;
    @Autowired
    private IPSDEFormService iPSDEFormService = null;
    @Autowired
    private IPSDEFieldService iPSDEFieldService = null;

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        boolean result = super.onPrepare(iEntityDTO, args, bDraftMode);
        if (!bDraftMode) {
            return result;
        }
        PSDEFormDTO et = (PSDEFormDTO)iEntityDTO;
        String strFormType = et.getFormType();
        boolean bMobileFlag = DataTypeUtils.getBooleanValue((Object)et.getMobFlag(), (Boolean)false);
        if (PSModelEnums.FormType.EDITFORM.value.equals(strFormType)) {
            if (bMobileFlag) {
                this.doInitDefaultMobEditForm(et);
            } else {
                this.doInitDefaultEditForm(et);
            }
        } else if (PSModelEnums.FormType.SEARCHFORM.value.equals(strFormType)) {
            if (bMobileFlag) {
                this.doInitDefaultMobSearchForm(et);
            } else {
                this.doInitDefaultSearchForm(et);
            }
        }
        return result;
    }

    protected void doInitDefaultEditForm(PSDEFormDTO et) throws Throwable {
        PSDEFormDetailDTO psDEFormItem;
        ArrayList<PSDEFormDetailDTO> formItemList;
        String dataEntityId = et.getPSDEId();
        if (ObjectUtils.isEmpty((Object)dataEntityId)) {
            return;
        }
        PSDataEntityDTO psDataEntity = new PSDataEntityDTO();
        psDataEntity.setPSDataEntityId(dataEntityId);
        this.iPSDataEntityService.select(psDataEntity, false);
        String strCodeName = this.getDefaultFormName(et);
        et.setFormType(PSModelEnums.FormType.EDITFORM.value);
        et.setPSDEId(dataEntityId);
        et.setCodeName(strCodeName);
        et.setPSDEFormName("\u4e3b\u7f16\u8f91\u8868\u5355");
        et.setMobFlag(0);
        ISearchContextDTO searchContextDTO = this.iPSDEFieldService.getDataEntityRuntime().createSearchContext();
        searchContextDTO.eq("PSDEID", (Object)dataEntityId).all();
        List<PSDEFieldDTO> psDEFieldList = this.iPSDEFieldService.select(searchContextDTO);
        HashMap<String, PSDEFieldDTO> psDEFieldMap = new HashMap<String, PSDEFieldDTO>();
        PSDEFieldDTO majorPSDEField = null;
        if (!ObjectUtils.isEmpty((Object)psDEFieldList)) {
            for (PSDEFieldDTO psDEField : psDEFieldList) {
                psDEFieldMap.put(psDEField.getPSDEFieldName(), psDEField);
                if (!DataTypeUtils.getBooleanValue((Object)psDEField.getMajorField(), (Boolean)false).booleanValue()) continue;
                majorPSDEField = psDEField;
            }
        }
        ArrayList<PSDEFormDetailDTO> formDetailDTOList = new ArrayList<PSDEFormDetailDTO>();
        PSDEFormDetailDTO formpage1 = new PSDEFormDetailDTO();
        formpage1.setPSDEFormDetailName("formpage1");
        formpage1.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
        formpage1.setOrderValue(1);
        formpage1.setCaption("\u57fa\u672c\u4fe1\u606f");
        formDetailDTOList.add(formpage1);
        ArrayList<PSDEFormDetailDTO> groupList = new ArrayList<PSDEFormDetailDTO>();
        PSDEFormDetailDTO group1 = new PSDEFormDetailDTO();
        group1.setPSDEFormDetailName("group1");
        group1.setDetailType(PSModelEnums.FormDetailType.GROUPPANEL.value);
        group1.setOrderValue(1);
        group1.setCaption(String.format("%1$s\u57fa\u672c\u4fe1\u606f", psDataEntity.getLogicName()));
        group1.setColModel("50%;50%");
        groupList.add(group1);
        formpage1.setPSDEFormDetails(groupList);
        if (majorPSDEField != null) {
            formItemList = new ArrayList<PSDEFormDetailDTO>();
            PSDEFormDetailDTO majordef = new PSDEFormDetailDTO();
            majordef.setPSDEFormDetailName(majorPSDEField.getPSDEFieldName().toLowerCase());
            majordef.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            majordef.setOrderValue(1);
            majordef.setPSDEFId(majorPSDEField.getPSDEFieldId());
            majordef.setPSDEFName(majorPSDEField.getPSDEFieldName());
            formItemList.add(majordef);
            group1.setPSDEFormDetails(formItemList);
        }
        PSDEFormDetailDTO formpage2 = new PSDEFormDetailDTO();
        formpage2.setPSDEFormDetailName("formpage2");
        formpage2.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
        formpage2.setOrderValue(2);
        formpage2.setCaption("\u5176\u5b83");
        formDetailDTOList.add(formpage2);
        groupList = new ArrayList();
        PSDEFormDetailDTO group2 = new PSDEFormDetailDTO();
        group2.setPSDEFormDetailName("group2");
        group2.setDetailType(PSModelEnums.FormDetailType.GROUPPANEL.value);
        group2.setOrderValue(2);
        group2.setCaption("\u64cd\u4f5c\u4fe1\u606f");
        group2.setColModel("50%;50%");
        groupList.add(group2);
        formpage2.setPSDEFormDetails(groupList);
        formItemList = new ArrayList();
        PSDEFieldDTO psDEField = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.CREATEMAN.value));
        if (psDEField != null) {
            psDEFormItem = new PSDEFormDetailDTO();
            psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
            psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            psDEFormItem.setOrderValue(1);
            psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
            formItemList.add(psDEFormItem);
        }
        if ((psDEField = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.CREATEDATE.value))) != null) {
            psDEFormItem = new PSDEFormDetailDTO();
            psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
            psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            psDEFormItem.setOrderValue(2);
            psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
            formItemList.add(psDEFormItem);
        }
        if ((psDEField = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.UPDATEMAN.value))) != null) {
            psDEFormItem = new PSDEFormDetailDTO();
            psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
            psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            psDEFormItem.setOrderValue(3);
            psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
            formItemList.add(psDEFormItem);
        }
        if ((psDEField = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.UPDATEDATE.value))) != null) {
            psDEFormItem = new PSDEFormDetailDTO();
            psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
            psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            psDEFormItem.setOrderValue(4);
            psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
            formItemList.add(psDEFormItem);
        }
        group2.setPSDEFormDetails(formItemList);
        et.setPSDEFormDetails(formDetailDTOList);
    }

    protected void doInitDefaultSearchForm(PSDEFormDTO et) throws Throwable {
        String strCodeName = this.getDefaultFormName(et);
        et.setFormType(PSModelEnums.FormType.SEARCHFORM.value);
        et.setPSDEId(et.getPSDEId());
        et.setCodeName(strCodeName);
        et.setMobFlag(0);
        et.setPSDEFormName("\u9ed8\u8ba4\u641c\u7d22\u8868\u5355");
        ArrayList<PSDEFormDetailDTO> formDetailDTOList = new ArrayList<PSDEFormDetailDTO>();
        PSDEFormDetailDTO formpage1 = new PSDEFormDetailDTO();
        formpage1.setPSDEFormDetailName("formpage1");
        formpage1.setCaption("\u5e38\u89c4\u6761\u4ef6");
        formpage1.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
        formpage1.setOrderValue(1);
        formpage1.setShowCaption(0);
        formpage1.setColModel("33%;33%;34%");
        formDetailDTOList.add(formpage1);
        et.setPSDEFormDetails(formDetailDTOList);
    }

    protected void doInitDefaultMobEditForm(PSDEFormDTO et) throws Throwable {
        PSDEFormDetailDTO psDEFormItem;
        String dataEntityId = et.getPSDEId();
        if (ObjectUtils.isEmpty((Object)dataEntityId)) {
            return;
        }
        PSDataEntityDTO psDataEntity = new PSDataEntityDTO();
        psDataEntity.setPSDataEntityId(dataEntityId);
        this.iPSDataEntityService.select(psDataEntity, false);
        String strCodeName = this.getDefaultFormName(et);
        et.setFormType(PSModelEnums.FormType.EDITFORM.value);
        et.setPSDEId(dataEntityId);
        et.setCodeName(strCodeName);
        et.setPSDEFormName("\u79fb\u52a8\u7aef\u9ed8\u8ba4\u7f16\u8f91\u8868\u5355");
        et.setMobFlag(1);
        ISearchContextDTO searchContextDTO = this.iPSDEFieldService.getDataEntityRuntime().createSearchContext();
        searchContextDTO.eq("PSDEID", (Object)dataEntityId).all();
        List<PSDEFieldDTO> psDEFieldList = this.iPSDEFieldService.select(searchContextDTO);
        HashMap<String, PSDEFieldDTO> psDEFieldMap = new HashMap<String, PSDEFieldDTO>();
        PSDEFieldDTO majorPSDEField = null;
        if (!ObjectUtils.isEmpty((Object)psDEFieldList)) {
            for (PSDEFieldDTO psDEField : psDEFieldList) {
                psDEFieldMap.put(psDEField.getPSDEFieldName(), psDEField);
                if (!DataTypeUtils.getBooleanValue((Object)psDEField.getMajorField(), (Boolean)false).booleanValue()) continue;
                majorPSDEField = psDEField;
            }
        }
        ArrayList<PSDEFormDetailDTO> formDetailDTOList = new ArrayList<PSDEFormDetailDTO>();
        PSDEFormDetailDTO formpage1 = new PSDEFormDetailDTO();
        formpage1.setPSDEFormDetailName("formpage1");
        formpage1.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
        formpage1.setOrderValue(1);
        formpage1.setCaption("\u57fa\u672c\u4fe1\u606f");
        formDetailDTOList.add(formpage1);
        PSDEFormDetailDTO group1 = new PSDEFormDetailDTO();
        group1.setPSDEFormDetailName("group1");
        group1.setDetailType(PSModelEnums.FormDetailType.GROUPPANEL.value);
        group1.setOrderValue(1);
        group1.setCaption(String.format("%1$s\u57fa\u672c\u4fe1\u606f", psDataEntity.getLogicName()));
        formDetailDTOList.add(group1);
        if (majorPSDEField != null) {
            PSDEFormDetailDTO majordef = new PSDEFormDetailDTO();
            majordef.setPSDEFormDetailName(majorPSDEField.getPSDEFieldName().toLowerCase());
            majordef.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            majordef.setOrderValue(1);
            majordef.setPSDEFId(majorPSDEField.getPSDEFieldId());
            majordef.setPSDEFName(majorPSDEField.getPSDEFieldName());
            formDetailDTOList.add(majordef);
        }
        PSDEFormDetailDTO group2 = new PSDEFormDetailDTO();
        group2.setPSDEFormDetailName("group2");
        group2.setDetailType(PSModelEnums.FormDetailType.GROUPPANEL.value);
        group2.setOrderValue(2);
        group2.setCaption("\u64cd\u4f5c\u4fe1\u606f");
        formDetailDTOList.add(group2);
        PSDEFieldDTO psDEField = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.CREATEMAN.value));
        if (psDEField != null) {
            psDEFormItem = new PSDEFormDetailDTO();
            psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
            psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            psDEFormItem.setOrderValue(1);
            psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
            formDetailDTOList.add(psDEFormItem);
        }
        if ((psDEField = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.CREATEDATE.value))) != null) {
            psDEFormItem = new PSDEFormDetailDTO();
            psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
            psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            psDEFormItem.setOrderValue(2);
            psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
            formDetailDTOList.add(psDEFormItem);
        }
        if ((psDEField = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.UPDATEMAN.value))) != null) {
            psDEFormItem = new PSDEFormDetailDTO();
            psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
            psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            psDEFormItem.setOrderValue(3);
            psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
            formDetailDTOList.add(psDEFormItem);
        }
        if ((psDEField = (PSDEFieldDTO)((Object)psDEFieldMap.get(PSModelEnums.PredefinedFieldType.UPDATEDATE.value))) != null) {
            psDEFormItem = new PSDEFormDetailDTO();
            psDEFormItem.setPSDEFormDetailName(psDEField.getPSDEFieldName().toLowerCase());
            psDEFormItem.setDetailType(PSModelEnums.FormDetailType.FORMITEM.value);
            psDEFormItem.setOrderValue(4);
            psDEFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            psDEFormItem.setPSDEFName(psDEField.getPSDEFieldName());
            formDetailDTOList.add(psDEFormItem);
        }
        et.setPSDEFormDetails(formDetailDTOList);
    }

    protected void doInitDefaultMobSearchForm(PSDEFormDTO et) throws Throwable {
        String dataEntityId = et.getPSDEId();
        String strCodeName = this.getDefaultFormName(et);
        et.setFormType(PSModelEnums.FormType.SEARCHFORM.value);
        et.setPSDEId(dataEntityId);
        et.setMobFlag(1);
        et.setCodeName(strCodeName);
        et.setPSDEFormName("\u79fb\u52a8\u7aef\u641c\u7d22\u8868\u5355");
        ArrayList<PSDEFormDetailDTO> formDetailDTOList = new ArrayList<PSDEFormDetailDTO>();
        PSDEFormDetailDTO formpage1 = new PSDEFormDetailDTO();
        formpage1.setPSDEFormDetailName("formpage1");
        formpage1.setCaption("\u5e38\u89c4\u6761\u4ef6");
        formpage1.setDetailType(PSModelEnums.FormDetailType.FORMPAGE.value);
        formpage1.setOrderValue(1);
        formpage1.setShowCaption(0);
        formDetailDTOList.add(formpage1);
        et.setPSDEFormDetails(formDetailDTOList);
    }

    protected String getDefaultFormName(PSDEFormDTO et) throws Throwable {
        String strCodeName;
        PSDEFormDTO psDEForm2;
        int nFormIndex = 1;
        boolean bMobileFlag = DataTypeUtils.getBooleanValue((Object)et.getMobFlag(), (Boolean)false);
        String strFormType = et.getFormType();
        String strFormPrefix = bMobileFlag ? (PSModelEnums.FormType.SEARCHFORM.value.equals(strFormType) ? "MobDef" : "MobMain") : "Main";
        do {
            strCodeName = String.format("%1$s%2$s", strFormPrefix, nFormIndex == 1 ? "" : Integer.valueOf(nFormIndex));
            ++nFormIndex;
            psDEForm2 = new PSDEFormDTO();
            psDEForm2.setPSDEId(et.getPSDEId());
            psDEForm2.setCodeName(strCodeName);
        } while (this.iPSDEFormService.select(psDEForm2, true));
        return strCodeName;
    }
}
