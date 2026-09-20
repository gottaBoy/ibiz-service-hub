package net.ibizsys.modeling.core.sysutil.addin;

import com.google.common.base.CaseFormat;
import java.util.List;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDCModelTemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFDataTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFSFItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFUIModeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDCModelTemplService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFDataTypeService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFSFItemService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFUIModeService;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFieldService;
import net.ibizsys.modeling.core.dataentity.service.IPSDataEntityService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class PSDEFieldInitializer
extends PSModelInitializerBase {
    @Autowired
    private IPSDEFDataTypeService iPSDEFDataTypeService = null;
    @Autowired
    private IPSDataEntityService iPSDataEntityService = null;
    @Autowired
    private IPSDEFieldService iPSDEFieldService = null;
    @Autowired
    private IPSDCModelTemplService IPSDCModelTemplService = null;
    @Autowired
    private IPSDEFUIModeService iPSDEFUIModeService = null;
    @Autowired
    private IPSDEFSFItemService iPSDEFSFItemService = null;

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        PSDEFieldDTO psDEField = (PSDEFieldDTO)iEntityDTO;
        if (bDraftMode) {
            return this.doPrepareGetDraft(psDEField, args);
        }
        return this.doPrepareBeforeCreate(psDEField, args);
    }

    protected boolean doPrepareGetDraft(PSDEFieldDTO et, Object[] args) throws Throwable {
        if (!StringUtils.hasLength(et.getPSDataTypeId())) {
            PSDEFDataTypeDTO psDEFDataType = new PSDEFDataTypeDTO();
            psDEFDataType.setPSDEFDataTypeId("TEXT");
            if (this.iPSDEFDataTypeService.select(psDEFDataType, true)) {
                et.setPSDataTypeId(psDEFDataType.getPSDEFDataTypeId());
                et.setPSDataTypeName(psDEFDataType.getPSDEFDataTypeName());
            }
        }

        if (!StringUtils.hasLength(et.getPSDEFieldName()) && StringUtils.hasLength(et.getPSDEId())) {
            int index = 0;
            PSDEFieldDTO candidate;
            do {
                candidate = new PSDEFieldDTO();
                candidate.setPSDEId(et.getPSDEId());
                index++;
                candidate.setPSDEFieldName(String.format("FIELD%s", index == 1 ? "" : index));
            } while (this.iPSDEFieldService.select(candidate, true));
            et.setPSDEFieldName(candidate.getPSDEFieldName());

            do {
                candidate = new PSDEFieldDTO();
                candidate.setPSDEId(et.getPSDEId());
                candidate.setLogicName(String.format("\u5c5e\u6027%s", index == 1 ? "" : index));
                index++;
            } while (this.iPSDEFieldService.select(candidate, true));
            et.setLogicName(candidate.getLogicName());
        }

        if (StringUtils.hasLength(et.getPSDEId())) {
            ISearchContextDTO searchContextDTO = this.iPSDEFieldService.createSearchContextDTO();
            int nCount = this.iPSDEFieldService.select(searchContextDTO.eq("PSDEID", et.getPSDEId()).all()).size();
            if (nCount == 0) {
                et.setOrderValue(100);
                return true;
            }
            int nOrderValue;
            while (true) {
                nOrderValue = 100 + nCount * 10;
                if (this.iPSDEFieldService.selectOne(searchContextDTO.eq("ORDERVALUE", nOrderValue), true) == null) {
                    break;
                }
                ++nCount;
            }
            et.setOrderValue(nOrderValue);
        }
        return true;
    }

    protected boolean doPrepareBeforeCreate(PSDEFieldDTO et, Object[] args) throws Throwable {
        PSDevSlnSysDTO psDevSlnSys;
        PSModuleDTO psModule;
        boolean bEnableCodeNameUpperCamel = true;
        PSDCModelTemplDTO psDCModelTempl = null;
        PSDataEntityDTO psDataEntity = this.getDataEntity(et.getPSDEId());
        boolean bIgnoreCheck = false;
        if (DataTypeUtils.getBooleanValue((Object)psDataEntity.getExistingModel(), (Boolean)false).booleanValue()) {
            bIgnoreCheck = true;
        }
        if (!bIgnoreCheck && psDataEntity.getPSModuleId() != null && DataTypeUtils.getBooleanValue((Object)(psModule = this.getPSModuleDTO(psDataEntity.getPSModuleId())).getSubSysModule(), (Boolean)false).booleanValue()) {
            bIgnoreCheck = true;
        }
        if (!bIgnoreCheck && (psDevSlnSys = this.getPSDevSlnSysDTO(this.getCurrentPSDevSlnSysId())) != null && StringUtils.hasLength((String)psDevSlnSys.getPSDCModelTemplId())) {
            psDCModelTempl = this.IPSDCModelTemplService.get(psDevSlnSys.getPSDCModelTemplId(), true);
        }
        if (psDCModelTempl != null) {
            String strPSDEFName = et.getPSDEFieldName();
            if (psDCModelTempl.getDEFNameMaxLength() != null && psDCModelTempl.getDEFNameMaxLength() > 0 && strPSDEFName.length() > psDCModelTempl.getDEFNameMaxLength()) {
                throw new Exception(String.format("\u6a21\u578b\u6a21\u677f[%1$s]\u5b9a\u4e49\u5c5e\u6027\u540d\u79f0\u957f\u5ea6\u4e0d\u80fd\u8d85\u8fc7[%2$s]", psDCModelTempl.getPSDCModelTemplName(), psDCModelTempl.getDEFNameMaxLength()));
            }
        }
        if (!StringUtils.hasLength((String)et.getCodeName())) {
            String strCodeName = this.calcDEFieldCodeName(et.getPSDEFieldName());
            if (!StringUtils.hasLength((String)strCodeName) && bEnableCodeNameUpperCamel) {
                strCodeName = this.toUpperCamel(et.getPSDEFieldName());
            }
            if (!StringUtils.hasLength((String)strCodeName)) {
                strCodeName = et.getPSDEFieldName().length() > 1 ? et.getPSDEFieldName().substring(0, 1).toUpperCase() + et.getPSDEFieldName().substring(1).toLowerCase() : et.getPSDEFieldName().toUpperCase();
            }
            if (StringUtils.hasLength((String)strCodeName)) {
                et.setCodeName(strCodeName);
            }
        }
        if (et.getDEFType() != null && et.getDEFType() == 1) {
            PSDataEntityDTO dataEntity = this.getDataEntity(et.getPSDEId());
            int nVirtualMode = DataTypeUtils.getIntegerValue((Object)dataEntity.getVirtualFlag(), (Integer)0);
            if (nVirtualMode == 1 || nVirtualMode == 3 || nVirtualMode == 2) {
                throw new Exception(String.format("\u865a\u62df\u5b9e\u4f53\u4e0d\u80fd\u5efa\u7acb\u7269\u7406\u5c5e\u6027", new Object[0]));
            }
            et.setTableName(dataEntity.getTableName());
            if (!StringUtils.hasLength((String)et.getTableName())) {
                throw new Exception(String.format("\u7269\u7406\u5c5e\u6027\u8868\u540d\u65e0\u6548", new Object[0]));
            }
            et.setPhysicalField(1);
            PSDEFDataTypeDTO psDEFDataType = new PSDEFDataTypeDTO();
            psDEFDataType.setPSDEFDataTypeId(et.getPSDataTypeId());
            this.iPSDEFDataTypeService.get(psDEFDataType);
            if (psDEFDataType.getLength() != null && et.getLength() == null) {
                et.setLength(psDEFDataType.getLength());
            }
            if (psDEFDataType.getPrecision2() != null && et.getPrecision2() == null) {
                et.setPrecision2(psDEFDataType.getPrecision2());
            }
        } else {
            et.setPhysicalField(0);
        }
        return true;
    }

    protected String toUpperCamel(String strCodeName) {
        if (StringUtils.hasLength((String)strCodeName)) {
            return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, strCodeName);
        }
        return strCodeName;
    }

    protected PSDataEntityDTO getDataEntity(String strDataEntityID) throws Throwable {
        PSDataEntityDTO dataEntityDTO = new PSDataEntityDTO();
        dataEntityDTO.setPSDataEntityId(strDataEntityID);
        if (!this.iPSDataEntityService.select(dataEntityDTO, true)) {
            throw new Exception(String.format("\u6307\u5b9a\u5b9e\u4f53[%1$s]\u4e0d\u5b58\u5728", strDataEntityID));
        }
        return dataEntityDTO;
    }

    protected String calcDEFieldCodeName(String strDEFName) throws Exception {
        ISearchContextDTO searchContextDTO = this.iPSDEFieldService.getDataEntityRuntime().createSearchContext();
        searchContextDTO.eq("pssystemid", (Object)this.getCurrentPSDevSysUser().getPSSystemId()).eq("PSDEFIELDNAME", (Object)strDEFName).nvl("CODENAME").sort("updatedate,desc");
        searchContextDTO.limit(1000);
        List psDEFieldList = this.iPSDEFieldService.select(searchContextDTO);
        if (psDEFieldList.size() > 0) {
            return ((PSDEFieldDTO)((Object)psDEFieldList.get(0))).getCodeName();
        }
        return null;
    }

    @Override
    protected boolean onInitialize(IEntityDTO iEntityDTO, Object[] args) throws Throwable {
        PSSystemDTO psSystem = this.getCurrentPSSystemDTO();
        PSDEFieldDTO psDEField = (PSDEFieldDTO)iEntityDTO;
        this.doInitPSDEFUIModes(psDEField);
        this.doInitPSDEFSearchModes(psDEField);
        return super.onInitialize(iEntityDTO, args);
    }

    protected void doInitPSDEFUIModes(PSDEFieldDTO psDEField) throws Throwable {
        String strPSDEFUIModeId = psDEField.getPSDEFieldId();
        PSDEFUIModeDTO psDEFFormItem = new PSDEFUIModeDTO();
        psDEFFormItem.setPSDEFUIModeId(strPSDEFUIModeId);
        if (this.iPSDEFUIModeService.checkKeyState(psDEFFormItem) == 0) {
            boolean bDefault = false;
            psDEFFormItem.resetAll();
            psDEFFormItem.setFTMode(PSModelEnums.DEFUIMode.DEFAULT.value);
            psDEFFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            if (!this.iPSDEFUIModeService.select(psDEFFormItem, true)) {
                bDefault = true;
            }
            psDEFFormItem.resetAll();
            psDEFFormItem.setPSDEFUIModeName(String.format("[%1$s][%2$s]", psDEField.getPSDEFieldName(), psDEField.getLogicName()));
            psDEFFormItem.setPSDEFUIModeId(strPSDEFUIModeId);
            psDEFFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            if (bDefault) {
                psDEFFormItem.setFTMode(PSModelEnums.DEFUIMode.DEFAULT.value);
                psDEFFormItem.setCodeName("Default");
            } else {
                psDEFFormItem.setFTMode(PSModelEnums.DEFUIMode.CUSTOM.value);
            }
            this.iPSDEFUIModeService.create(psDEFFormItem);
        }
        strPSDEFUIModeId = KeyValueUtils.genUniqueId((Object)psDEField.getPSDEFieldId(), (Object)PSModelEnums.DEFUIMode.MOBILEDEFAULT.value);
        psDEFFormItem = new PSDEFUIModeDTO();
        psDEFFormItem.setPSDEFUIModeId(strPSDEFUIModeId);
        if (this.iPSDEFUIModeService.checkKeyState(psDEFFormItem) == 0) {
            psDEFFormItem.resetAll();
            psDEFFormItem.setFTMode(PSModelEnums.DEFUIMode.MOBILEDEFAULT.value);
            psDEFFormItem.setPSDEFId(psDEField.getPSDEFieldId());
            if (!this.iPSDEFUIModeService.select(psDEFFormItem, true)) {
                psDEFFormItem.resetAll();
                psDEFFormItem.setPSDEFUIModeName(String.format("[%1$s][%2$s]\u79fb\u52a8\u7aef\u9ed8\u8ba4", psDEField.getPSDEFieldName(), psDEField.getLogicName()));
                psDEFFormItem.setPSDEFUIModeId(strPSDEFUIModeId);
                psDEFFormItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFFormItem.setFTMode(PSModelEnums.DEFUIMode.MOBILEDEFAULT.value);
                psDEFFormItem.setCodeName("MobileDefault");
                this.iPSDEFUIModeService.create(psDEFFormItem);
            }
        }
    }

    protected void doInitPSDEFSearchModes(PSDEFieldDTO psDEField) throws Throwable {
        String strPSDEFSearchItemName;
        PSDEFSFItemDTO psDEFSearchItem;
        if (DataTypeUtils.getBooleanValue((Object)psDEField.getMajorField(), (Boolean)false).booleanValue() || DataTypeUtils.compare((String)psDEField.getPSDataTypeId(), (String)PSModelEnums.DEFDataType.PICKUPTEXT.value, (boolean)true) == 0L) {
            psDEFSearchItem = new PSDEFSFItemDTO();
            psDEFSearchItem.setPSDEFId(psDEField.getPSDEFieldId());
            strPSDEFSearchItemName = String.format("N_%1$s_LIKE", psDEField.getPSDEFieldName());
            psDEFSearchItem.setPSDEFSFItemName(strPSDEFSearchItemName);
            if (!this.iPSDEFSFItemService.select(psDEFSearchItem, true)) {
                psDEFSearchItem.setPSDEFId(psDEField.getPSDEFieldId());
                psDEFSearchItem.setPSDEFSFItemName(strPSDEFSearchItemName);
                psDEFSearchItem.setPSDBValueOPId("LIKE");
                psDEFSearchItem.setPSDEId(psDEField.getPSDEId());
                psDEFSearchItem.setPSDEName(psDEField.getPSDEName());
                psDEFSearchItem.setPSDEFName(psDEField.getPSDEFieldName());
                this.iPSDEFSFItemService.create(psDEFSearchItem);
            }
        }
        if (DataTypeUtils.compare((String)psDEField.getPSDataTypeId(), (String)PSModelEnums.DEFDataType.PICKUPTEXT.value, (boolean)true) == 0L || DataTypeUtils.compare((String)psDEField.getPSDataTypeId(), (String)PSModelEnums.DEFDataType.SSCODELIST.value, (boolean)true) == 0L || DataTypeUtils.compare((String)psDEField.getPSDataTypeId(), (String)PSModelEnums.DEFDataType.NSCODELIST.value, (boolean)true) == 0L) {
            psDEFSearchItem = new PSDEFSFItemDTO();
            psDEFSearchItem.setPSDEFId(psDEField.getPSDEFieldId());
            strPSDEFSearchItemName = String.format("N_%1$s_EQ", psDEField.getPSDEFieldName());
            psDEFSearchItem.setPSDEFSFItemName(strPSDEFSearchItemName);
            if (!this.iPSDEFSFItemService.select(psDEFSearchItem, true)) {
                psDEFSearchItem.setPSDBValueOPId("EQ");
                psDEFSearchItem.setPSDEId(psDEField.getPSDEId());
                psDEFSearchItem.setPSDEName(psDEField.getPSDEName());
                psDEFSearchItem.setPSDEFName(psDEField.getPSDEFieldName());
                this.iPSDEFSFItemService.create(psDEFSearchItem);
            }
        }
        if (DataTypeUtils.compare((String)psDEField.getPSDataTypeId(), (String)PSModelEnums.DEFDataType.PICKUP.value, (boolean)true) == 0L) {
            psDEFSearchItem = new PSDEFSFItemDTO();
            psDEFSearchItem.setPSDEFId(psDEField.getPSDEFieldId());
            strPSDEFSearchItemName = String.format("N_%1$s_EQ", psDEField.getPSDEFieldName());
            psDEFSearchItem.setPSDEFSFItemName(strPSDEFSearchItemName);
            if (!this.iPSDEFSFItemService.select(psDEFSearchItem, true)) {
                psDEFSearchItem.setPSDBValueOPId("EQ");
                psDEFSearchItem.setPSDEId(psDEField.getPSDEId());
                psDEFSearchItem.setPSDEName(psDEField.getPSDEName());
                psDEFSearchItem.setPSDEFName(psDEField.getPSDEFieldName());
                this.iPSDEFSFItemService.create(psDEFSearchItem);
            }
        }
    }
}