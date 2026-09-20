package net.ibizsys.modeling.core.dataentity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFSFItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBVFDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDEFSFItemService;
import net.ibizsys.modeling.core.dataentity.service.IPSSysDBVFService;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * Search form item runtime.
 *
 * <p>The search item name is derived from the field, the optional value
 * function, the condition operator, the optional target item and the search
 * mode. The derived name acts as the unique identifier of the item.</p>
 */
public class PSDEFSFItemDERuntime extends DataEntityRuntimeBase {

    private static final Log log = LogFactory.getLog(PSDEFSFItemDERuntime.class);

    @Override
    protected boolean onFillEntityKeyValue(IEntityBase objEntity) throws Throwable {
        PSDEFSFItemDTO et = (PSDEFSFItemDTO) objEntity;
        if (!isImportModelMode()) {
            fillPSDEFSFItem(et);
        }
        return super.onFillEntityKeyValue(objEntity);
    }

    protected void fillPSDEFSFItem(PSDEFSFItemDTO et) throws Throwable {
        if (ObjectUtils.isEmpty(et.getPSDEFName())) {
            return;
        }
        try {
            if (ObjectUtils.isEmpty(et.getPSDBValueOPId())) {
                throw new Exception("搜索项未指定条件操作符");
            }
            String strPSDEFSFItemName;
            if (ObjectUtils.isEmpty(et.getPSSysDBVFId())) {
                strPSDEFSFItemName = String.format("N_%1$s_%2$s", et.getPSDEFName(),
                        et.getPSDBValueOPId()).toUpperCase();
            } else {
                IPSSysDBVFService iPSSysDBVFService =
                        getSystemRuntime().getProxyDEService(IPSSysDBVFService.class);
                PSSysDBVFDTO psSysDBVFDTO = iPSSysDBVFService.get(et.getPSSysDBVFId());
                strPSDEFSFItemName = String.format("F_%1$s_%2$s_%3$s", et.getPSDEFName(),
                        psSysDBVFDTO.getCodeName(), et.getPSDBValueOPId()).toUpperCase();
            }
            if ("EXISTS".equals(et.getPSDBValueOPId()) || "NOTEXISTS".equals(et.getPSDBValueOPId())) {
                if (StringUtils.hasLength(et.getDstPSDEFSFItemId())) {
                    IPSDEFSFItemService iPSDEFSFItemService =
                            getSystemRuntime().getProxyDEService(IPSDEFSFItemService.class);
                    PSDEFSFItemDTO dst = iPSDEFSFItemService.get(et.getDstPSDEFSFItemId());
                    strPSDEFSFItemName = strPSDEFSFItemName + "__" + dst.getPSDEFSFItemName();
                }
            } else {
                et.setDstPSDEFSFItemId(null);
            }
            if (!ObjectUtils.isEmpty(et.getSearchMode())) {
                strPSDEFSFItemName = strPSDEFSFItemName + "#" + et.getSearchMode();
            }
            et.setPSDEFSFItemName(strPSDEFSFItemName);
        } catch (Throwable ex) {
            throw new Exception(String.format(
                    "计算搜索项标识发生异常，%1$s",
                    ex.getMessage()), ex);
        }
    }

    @Override
    protected void onPrepareCreate(IEntityDTO iEntityDTO) throws Throwable {
        PSDEFSFItemDTO et = (PSDEFSFItemDTO) iEntityDTO;
        if (!isImportModelMode()) {
            fillPSDEFSFItem(et);
        }
        super.onPrepareCreate(iEntityDTO);
    }
}