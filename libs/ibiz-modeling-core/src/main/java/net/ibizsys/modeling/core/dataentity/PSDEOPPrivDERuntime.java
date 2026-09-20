package net.ibizsys.modeling.core.dataentity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUniResDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSSysUniResService;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntityBase;

public class PSDEOPPrivDERuntime extends DataEntityRuntimeBase {

    public static final String SYSUNIRES_PREFIX = "SRFUR__";

    /**
     * Default operation privilege names used when initializing a data entity.
     */
    public static final Map<String, String> defaultPSDEOPPrivMap = new HashMap<>();

    @Override
    protected boolean onFillEntityKeyValue(IEntityBase objEntity) throws Throwable {
        PSDEOPPrivDTO et = (PSDEOPPrivDTO) objEntity;
        if (!isImportModelMode()) {
            fillPSDEOPPriv(et);
        }
        return super.onFillEntityKeyValue(objEntity);
    }

    protected void fillPSDEOPPriv(PSDEOPPrivDTO entity) throws Throwable {
        if (entity.isMapSysUniResModeDirty()
                && DataTypeUtils.getBooleanValue(entity.getMapSysUniResMode(), false)
                && ObjectUtils.isEmpty(entity.getPSDEOPPrivName())
                && StringUtils.hasLength(entity.getPSSysUniResId())) {
            IPSSysUniResService service =
                    getSystemRuntime().getProxyDEService(IPSSysUniResService.class);
            PSSysUniResDTO sysUniRes = service.get(entity.getPSSysUniResId());
            entity.setPSDEOPPrivName(
                    String.format("%1$s%2$s", SYSUNIRES_PREFIX, sysUniRes.getResCode()));
        }

        String logicName = defaultPSDEOPPrivMap.get(entity.getPSDEOPPrivName());
        if (ObjectUtils.isEmpty(entity.getLogicName()) && !ObjectUtils.isEmpty(logicName)) {
            entity.setLogicName(logicName);
        }
    }

    @Override
    protected void onPrepareCreate(IEntityDTO entity) throws Throwable {
        if (!isImportModelMode()) {
            fillPSDEOPPriv((PSDEOPPrivDTO) entity);
        }
        super.onPrepareCreate(entity);
    }

    @Override
    protected void onPrepareUpdate(IEntityDTO entity) throws Throwable {
        if (!isImportModelMode()) {
            fillPSDEOPPriv((PSDEOPPrivDTO) entity);
        }
        super.onPrepareUpdate(entity);
    }

    static {
        defaultPSDEOPPrivMap.put("CREATE", "\u5efa\u7acb");
        defaultPSDEOPPrivMap.put("UPDATE", "\u66f4\u65b0");
        defaultPSDEOPPrivMap.put("DELETE", "\u5220\u9664");
        defaultPSDEOPPrivMap.put("READ", "\u8bfb\u53d6");
    }
}