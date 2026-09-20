package net.ibizsys.modeling.core.dataentity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.annotation.DEAction;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSAppLanDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSAppLanService;
import net.ibizsys.modeling.core.dataentity.service.IPSLanguageItemService;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * Language resource runtime.
 *
 * <p>Language resources use a deterministic primary key derived from the owner
 * system, module, resource type and user data so that the same resource is
 * never duplicated when it is re-created outside of model import mode.</p>
 */
public class PSLanguageResDERuntime extends DataEntityRuntimeBase {

    private static final Log log = LogFactory.getLog(PSLanguageResDERuntime.class);

    /**
     * Placeholder used for empty key parts when calculating the unique key.
     */
    public static final String EMPTY_KEY_PART = "__EMTPY__";

    /**
     * Separator between key parts when calculating the unique key.
     */
    public static final String KEY_PART_SEPARATOR = "||";

    /**
     * Maximum content length stored in the CONTENT column, longer values are
     * moved to CONTENT2.
     */
    public static final int CONTENT_MAX_LENGTH = 2000;

    @Override
    protected boolean onFillEntityKeyValue(IEntityBase objEntity) throws Throwable {
        PSLanguageResDTO et = (PSLanguageResDTO) objEntity;
        if (!isImportModelMode() && !ObjectUtils.isEmpty(et.getPSModuleId())) {
            et.setPSLanguageResId(KeyValueUtils.genUniqueId(calcUniqueKeyValue(et)));
            return true;
        }
        return super.onFillEntityKeyValue(objEntity);
    }

    /**
     * Build the composite value that seeds the deterministic key:
     * {@code pssystemid||psmoduleid||lanrestype||userdata}, with empty parts
     * replaced by {@link #EMPTY_KEY_PART}.
     */
    public static String calcUniqueKeyValue(PSLanguageResDTO et) {
        StringBuilder sb = new StringBuilder();
        Object objPSSystemId = et.get("pssystemid");
        if (objPSSystemId == null) {
            objPSSystemId = EMPTY_KEY_PART;
        }
        sb.append(String.format("%1$s", objPSSystemId));
        sb.append(KEY_PART_SEPARATOR);
        sb.append(String.format("%1$s", et.getPSModuleId()));
        sb.append(KEY_PART_SEPARATOR);
        Object objLanResType = et.get("LANRESTYPE");
        if (objLanResType == null) {
            objLanResType = EMPTY_KEY_PART;
        }
        sb.append(String.format("%1$s", objLanResType));
        sb.append(KEY_PART_SEPARATOR);
        Object objUserData = et.get("USERDATA");
        if (objUserData == null) {
            objUserData = EMPTY_KEY_PART;
        }
        sb.append(String.format("%1$s", objUserData));
        return sb.toString();
    }

    @Override
    protected void onPrepareCreate(IEntityDTO iEntityDTO) throws Throwable {
        PSLanguageResDTO et = (PSLanguageResDTO) iEntityDTO;
        if (!isImportModelMode()) {
            fillPSLanguageRes(et, false);
        }
        super.onPrepareCreate(iEntityDTO);
    }

    @Override
    protected void onPrepareUpdate(IEntityDTO iEntityDTO) throws Throwable {
        PSLanguageResDTO et = (PSLanguageResDTO) iEntityDTO;
        if (!isImportModelMode()) {
            fillPSLanguageRes(et, true);
        }
        super.onPrepareUpdate(iEntityDTO);
    }

    protected void fillPSLanguageRes(PSLanguageResDTO et, boolean bUpdate) throws Throwable {
        if (!bUpdate) {
            et.setLanResTag(String.format("%1$s.%2$s", et.getLanResType(), et.getUserData()));
            if (ObjectUtils.isEmpty(et.getPSLanguageResName())) {
                PSModelEnums.LanResType lanResType = PSModelEnums.LanResType.from(et.getLanResType());
                et.setPSLanguageResName(String.format("%1$s[%2$s]", lanResType.text, et.getUserData()));
            }
        }
        if (et.isContentDirty()) {
            if (StringUtils.length(et.getContent()) > CONTENT_MAX_LENGTH) {
                et.setContent2(et.getContent());
                et.setContent(null);
            } else {
                et.setContent2(null);
            }
        }
    }

    @DEAction(value = "INITLANITEM")
    protected void doInitLanItem(IEntityDTO iEntityDTO) throws Throwable {
        PSLanguageResDTO psLanguageRes = (PSLanguageResDTO) get(
                iEntityDTO.get(getKeyPSDEField().getLowerCaseName()));
        Map<String, PSAppLanDTO> psAppLanMap = new HashMap<>();
        SearchContextDTO selectContext = new SearchContextDTO().all().count(false);
        selectContext.set("pssystemid", psLanguageRes.getPSSystemId());
        IPSAppLanService iPSAppLanService = getSystemRuntime().getProxyDEService(IPSAppLanService.class);
        List<PSAppLanDTO> psAppLanList = iPSAppLanService.rawSelect(selectContext);
        for (PSAppLanDTO psAppLan : psAppLanList) {
            psAppLanMap.put(psAppLan.getPSLanguageId(), psAppLan);
        }
        IPSLanguageItemService iPSLanguageItemService =
                getSystemRuntime().getProxyDEService(IPSLanguageItemService.class);
        for (PSAppLanDTO psAppLan : psAppLanMap.values()) {
            PSLanguageItemDTO psLanguageItem = new PSLanguageItemDTO();
            psLanguageItem.setPSSystemId(psLanguageRes.getPSSystemId());
            psLanguageItem.setPSLanguageResId(psLanguageRes.getPSLanguageResId());
            psLanguageItem.setPSLanguageId(psAppLan.getPSLanguageId());
            if (iPSLanguageItemService.rawSelect(psLanguageItem, true)) {
                continue;
            }
            psLanguageItem.setPSLanguageName(psAppLan.getPSLanguageName());
            psLanguageItem.setPSLanguageResName(psLanguageRes.getPSLanguageResName());
            psLanguageItem.setPSSystemName(psLanguageRes.getPSSystemName());
            iPSLanguageItemService.create(psLanguageItem);
        }
    }

    @DEAction(value = "AUTOFILLMODULE")
    protected void doAutoFillModule(IEntityDTO iEntityDTO) throws Throwable {
        SearchContextDTO selectCond = new SearchContextDTO().all().count(false);
        selectCond.nvl("PSMODULEID");
        selectCond.eq("pssystemid", getCurrentPSDevSysUser(false).getPSSystemId());
        List<IEntityDTO> psLanguageResList = rawSelect(selectCond);
        for (IEntityDTO psLanguageResEntity : psLanguageResList) {
            PSLanguageResDTO psLanguageRes2 = (PSLanguageResDTO) psLanguageResEntity;
            if (ObjectUtils.isEmpty(psLanguageRes2.getPSDEId())) {
                continue;
            }
            PSDataEntityDTO psDataEntity = getPSDataEntityDTO(psLanguageRes2.getPSDEId(), true);
            if (psDataEntity == null) {
                continue;
            }
            PSLanguageResDTO psLanguageRes3 = new PSLanguageResDTO();
            psLanguageRes3.setPSLanguageResId(psLanguageRes2.getPSLanguageResId());
            psLanguageRes3.setPSModuleId(psDataEntity.getPSModuleId());
            psLanguageRes3.setPSModuleName(psDataEntity.getPSModuleName());
            update(psLanguageRes3);
        }
    }
}