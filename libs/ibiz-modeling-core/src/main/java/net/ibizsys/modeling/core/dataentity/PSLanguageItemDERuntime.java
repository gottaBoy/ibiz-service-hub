package net.ibizsys.modeling.core.dataentity;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageItemDTO;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * Language item runtime.
 *
 * <p>A language item is unique per system, language and language resource.
 * When a new item is created for a combination that already exists the
 * existing key is reused instead of generating a duplicate row.</p>
 */
public class PSLanguageItemDERuntime extends DataEntityRuntimeBase {

    private static final Log log = LogFactory.getLog(PSLanguageItemDERuntime.class);

    /**
     * Maximum content length stored in the CONTENT column, longer values are
     * moved to CONTENT2.
     */
    public static final int CONTENT_MAX_LENGTH = 2000;

    @Override
    protected boolean onFillEntityKeyValue(IEntityBase objEntity) throws Throwable {
        PSLanguageItemDTO et = (PSLanguageItemDTO) objEntity;
        if (!isImportModelMode() && et.isPSSystemIdDirty() && et.isPSLanguageIdDirty()
                && et.isPSLanguageResIdDirty()) {
            PSLanguageItemDTO et2 = new PSLanguageItemDTO();
            et2.setPSSystemId(et.getPSSystemId());
            et2.setPSLanguageId(et.getPSLanguageId());
            et2.setPSLanguageResId(et.getPSLanguageResId());
            if (rawSelect(et2, true)) {
                et.setPSLanguageItemId(et2.getPSLanguageItemId());
                return true;
            }
        }
        return super.onFillEntityKeyValue(objEntity);
    }

    @Override
    protected void onPrepareCreate(IEntityDTO iEntityDTO) throws Throwable {
        PSLanguageItemDTO et = (PSLanguageItemDTO) iEntityDTO;
        if (!isImportModelMode()) {
            fillPSLanguageItem(et, false);
        }
        super.onPrepareCreate(iEntityDTO);
    }

    @Override
    protected void onPrepareUpdate(IEntityDTO iEntityDTO) throws Throwable {
        PSLanguageItemDTO et = (PSLanguageItemDTO) iEntityDTO;
        if (!isImportModelMode()) {
            fillPSLanguageItem(et, true);
        }
        super.onPrepareUpdate(iEntityDTO);
    }

    protected void fillPSLanguageItem(PSLanguageItemDTO et, boolean bUpdate) throws Throwable {
        if (!bUpdate) {
            et.setPSLanguageItemName(String.format("%1$s.%2$s", et.getPSLanguageId(),
                    getPSLanguageResDTO(et.getPSLanguageResId(), false).getLanResTag()));
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
}