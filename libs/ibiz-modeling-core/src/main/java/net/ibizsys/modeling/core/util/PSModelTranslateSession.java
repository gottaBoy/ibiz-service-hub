package net.ibizsys.modeling.core.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.central.util.IEntityDTO;

/**
 * State holder for translating model DTO keys between input and output forms.
 */
public class PSModelTranslateSession extends PSModelCloneSessionBase {

    private final IEntityDTO entityDTO;
    private final String modelKey;
    private final boolean input;
    private final Map<String, Map<Object, IEntityDTO>> outputPSModelDataMap = new HashMap<>();

    public PSModelTranslateSession(IEntityDTO entityDTO, String modelKey, boolean input) {
        this.entityDTO = entityDTO;
        this.modelKey = modelKey;
        this.input = input;
    }

    public String getModelKey() {
        return modelKey;
    }

    public boolean setOutputPSModelData(String modelName, Object key,
            IEntityDTO entity) throws Exception {
        Map<Object, IEntityDTO> map = outputPSModelDataMap.get(modelName);
        if (map == null) {
            map = new LinkedHashMap<>();
            outputPSModelDataMap.put(modelName, map);
        }
        if (map.containsKey(key)) {
            return false;
        }
        map.put(key, entity);
        return true;
    }

    public boolean resetOutputPSModelData(String modelName, Object key,
            IEntityDTO entity) throws Exception {
        Map<Object, IEntityDTO> map = outputPSModelDataMap.get(modelName);
        return map != null && map.remove(key, entity);
    }

    public IEntityDTO getOutputPSModelData(String modelName, Object key,
            boolean tryMode) throws Exception {
        Map<Object, IEntityDTO> map = outputPSModelDataMap.get(modelName);
        IEntityDTO entity = map == null ? null : map.get(key);
        if (entity != null || tryMode) {
            return entity;
        }
        throw new Exception(String.format(
                "\u6307\u5b9a\u6a21\u578b[%1$s]\u6570\u636e[%2$s]\u4e0d\u5b58\u5728",
                modelName, key));
    }
}