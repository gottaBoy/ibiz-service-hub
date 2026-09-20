package net.ibizsys.modeling.core.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.util.domain.PasteModelInput;

public class PSModelPasteSession extends PSModelCloneSessionBase {

    private final PasteModelInput pasteModelInput;
    private final Map<String, Map<Object, IEntityDTO>> pastePSModelDataMap = new HashMap<>();

    public PSModelPasteSession(PasteModelInput pasteModelInput) {
        this.pasteModelInput = pasteModelInput;
    }

    public PasteModelInput getPasteModelInput() {
        return pasteModelInput;
    }

    public boolean setPastePSModelData(String modelName, Object key, IEntityDTO entity) throws Exception {
        Map<Object, IEntityDTO> map = pastePSModelDataMap.computeIfAbsent(
                modelName, item -> new LinkedHashMap<>());
        if (!map.containsKey(key)) {
            map.put(key, entity);
            return true;
        }
        return false;
    }

    public boolean resetPastePSModelData(String modelName, Object key, IEntityDTO entity) throws Exception {
        Map<Object, IEntityDTO> map = pastePSModelDataMap.get(modelName);
        return map != null && map.remove(key, entity);
    }

    public IEntityDTO getPastePSModelData(String modelName, Object key, boolean tryMode) throws Exception {
        Map<Object, IEntityDTO> map = pastePSModelDataMap.get(modelName);
        IEntityDTO entity = map == null ? null : map.get(key);
        if (entity != null || tryMode) {
            return entity;
        }
        throw new Exception(String.format("指定模型[%1$s]数据[%2$s]不存在", modelName, key));
    }
}