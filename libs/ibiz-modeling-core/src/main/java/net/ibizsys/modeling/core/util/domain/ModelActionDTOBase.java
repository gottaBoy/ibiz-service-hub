package net.ibizsys.modeling.core.util.domain;

import java.util.Map;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * Common support for modeling action DTOs.
 */
public abstract class ModelActionDTOBase extends EntityDTO {
    private static final long serialVersionUID = 1L;

    protected void normalizeKey(IDEMethodDTORuntime runtime, Object dtoData) {
        if (!(dtoData instanceof Map) || runtime == null || runtime.getDataEntityRuntime() == null
                || runtime.getDataEntityRuntime().getKeyPSDEField() == null) {
            return;
        }
        Map<?, ?> rawMap = (Map<?, ?>) dtoData;
        @SuppressWarnings("unchecked")
        Map<Object, Object> map = (Map<Object, Object>) rawMap;
        String keyName = runtime.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName();
        if (map.get(keyName) == null && map.get("srfkey") != null) {
            map.put(keyName, map.get("srfkey"));
        }
        map.remove("srfkey");
    }

    protected String runtimeKey(String fallbackName) {
        if (getDEMethodDTORuntime() != null && getDEMethodDTORuntime().getDataEntityRuntime() != null
                && getDEMethodDTORuntime().getDataEntityRuntime().getKeyPSDEField() != null) {
            return DataTypeUtils.asString(
                    _get(getDEMethodDTORuntime().getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()));
        }
        return DataTypeUtils.asString(_get(fallbackName));
    }

    protected String runtimeModelType() {
        if (getDEMethodDTORuntime() == null || getDEMethodDTORuntime().getDataEntityRuntime() == null) {
            return null;
        }
        return getDEMethodDTORuntime().getDataEntityRuntime().getName();
    }

    protected Boolean booleanValue(String fieldName) {
        return DataTypeUtils.asBoolean(_get(fieldName), null);
    }
}