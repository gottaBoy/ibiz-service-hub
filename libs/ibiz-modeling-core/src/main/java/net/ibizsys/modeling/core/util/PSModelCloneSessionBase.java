package net.ibizsys.modeling.core.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * Abstract base for model clone/copy sessions.
 *
 * <p>Tracks model data in two tiers (outer and inner), a clone queue, and
 * a parent-stack used during recursive copy traversal. Subclasses implement
 * the concrete copy/import logic.</p>
 */
public abstract class PSModelCloneSessionBase {

    private final Map<String, Map<Object, IEntityDTO>> psModelDataMap = new HashMap<>();
    private final Map<String, Map<Object, IEntityDTO>> psModelDataMap2 = new HashMap<>();
    private final Deque<IEntityDTO> cloneEntityDTOList = new ArrayDeque<>();
    private final Deque<IEntityDTO> parentEntityDTOList = new ArrayDeque<>();

    private static final Map<String, String> IGNORE_CLONE_PS_MODEL_MAP = new HashMap<>();

    static {
        IGNORE_CLONE_PS_MODEL_MAP.put("PSSYSMODELCHGLOG", "");
        IGNORE_CLONE_PS_MODEL_MAP.put("PSSYSMODELLOG", "");
    }

    // ---- model data registry ----

    public boolean setPSModelData(String strPSModelName, Object key,
                                  IEntityDTO entity, boolean bInner) throws Exception {
        if (bInner) {
            Map<Object, IEntityDTO> map = psModelDataMap2
                    .computeIfAbsent(strPSModelName, k -> new LinkedHashMap<>());
            if (!map.containsKey(key)) {
                map.put(key, entity);
                return true;
            }
            return false;
        }
        Map<Object, IEntityDTO> map = psModelDataMap
                .computeIfAbsent(strPSModelName, k -> new LinkedHashMap<>());
        if (!map.containsKey(key)) {
            map.put(key, entity);
            pushClonePSModelData(entity);
            return true;
        }
        return false;
    }

    public boolean resetPSModelData(String strPSModelName, Object key,
                                    IEntityDTO entity, boolean bInner) throws Exception {
        if (bInner) {
            Map<Object, IEntityDTO> map = psModelDataMap2.get(strPSModelName);
            if (map == null) return false;
            return map.remove(key, entity);
        }
        Map<Object, IEntityDTO> map = psModelDataMap.get(strPSModelName);
        if (map == null) return false;
        return map.remove(key, entity);
    }

    public IEntityDTO getPSModelData(String strPSModelName, Object key,
                                     boolean tryMode) throws Exception {
        Map<Object, IEntityDTO> map = psModelDataMap.get(strPSModelName);
        IEntityDTO entity = null;
        if (map != null) entity = map.get(key);
        if (entity == null && (map = psModelDataMap2.get(strPSModelName)) != null) {
            entity = map.get(key);
        }
        if (entity != null || tryMode) return entity;
        throw new Exception(String.format(
                "\u6307\u5b9a\u6a21\u578b[%1$s]\u6570\u636e[%2$s]\u4e0d\u5b58\u5728",
                strPSModelName, key));
    }

    public Map<String, Map<Object, IEntityDTO>> getPSModelData(boolean bInner) {
        return bInner ? psModelDataMap2 : psModelDataMap;
    }

    // ---- clone queue ----

    public void pushClonePSModelData(IEntityDTO entity) {
        cloneEntityDTOList.push(entity);
    }

    public IEntityDTO pollClonePSModelData() {
        return cloneEntityDTOList.poll();
    }

    // ---- parent stack ----

    public void pushParentPSModelData(IEntityDTO entity) {
        parentEntityDTOList.push(entity);
    }

    public IEntityDTO pollParentPSModelData() {
        return parentEntityDTOList.poll();
    }

    public IEntityDTO getParentPSModelData(String strPSModelName,
                                           boolean bTryMode) throws Exception {
        for (IEntityDTO entity : parentEntityDTOList) {
            if (entity.getDEMethodDTORuntime() == null
                    || entity.getDEMethodDTORuntime().getDataEntityRuntime() == null) {
                continue;
            }
            IDataEntityRuntime dataEntityRuntime =
                    (IDataEntityRuntime) entity.getDEMethodDTORuntime().getDataEntityRuntime();
            if (dataEntityRuntime.getName().equals(strPSModelName)) {
                return entity;
            }
        }
        if (bTryMode) {
            return null;
        }
        throw new Exception(String.format(
                "\u6307\u5b9a\u6a21\u578b[%1$s]\u7236\u6570\u636e\u4e0d\u5b58\u5728",
                strPSModelName));
    }

    public IEntityDTO getParentPSModelData(String strPSModelName, Object key,
                                           boolean bTryMode) throws Exception {
        for (IEntityDTO entity : parentEntityDTOList) {
            if (entity.getDEMethodDTORuntime() == null
                    || entity.getDEMethodDTORuntime().getDataEntityRuntime() == null) {
                continue;
            }
            IDataEntityRuntime dataEntityRuntime =
                    (IDataEntityRuntime) entity.getDEMethodDTORuntime().getDataEntityRuntime();
            if (!dataEntityRuntime.getName().equals(strPSModelName)) {
                continue;
            }
            Object parentKey = entity.get(dataEntityRuntime.getKeyPSDEField().getLowerCaseName());
            if (parentKey != null && parentKey.equals(key)) {
                return entity;
            }
        }
        if (bTryMode) {
            return null;
        }
        throw new Exception(String.format(
                "\u6307\u5b9a\u6a21\u578b[%1$s]\u7236\u6570\u636e[%2$s]\u4e0d\u5b58\u5728",
                strPSModelName, key));
    }

    public boolean isParentPSModelData(String strPSModelName, Object key) {
        for (IEntityDTO parent : parentEntityDTOList) {
            if (parent.getDEMethodDTORuntime() == null
                    || parent.getDEMethodDTORuntime().getDataEntityRuntime() == null) {
                continue;
            }
            IDataEntityRuntime deRT = (IDataEntityRuntime)
                    parent.getDEMethodDTORuntime().getDataEntityRuntime();
            if (!deRT.getName().equals(strPSModelName)) continue;
            Object parentKey = parent.get(deRT.getKeyPSDEField().getLowerCaseName());
            if (parentKey != null && parentKey.equals(key)) return true;
        }
        return false;
    }

    public boolean isClonePSModel(String strPSModelName) {
        if (psModelDataMap.containsKey(strPSModelName)) return true;
        if (psModelDataMap2.containsKey(strPSModelName)) return true;
        return false;
    }

    // ---- ignore / copy policy ----

    public static boolean shouldIgnoreClonePSModel(String strPSModelName) {
        return IGNORE_CLONE_PS_MODEL_MAP.containsKey(strPSModelName);
    }

    public boolean shouldCopyPSModel(String strPSModelName) {
        return !shouldIgnoreClonePSModel(strPSModelName);
    }

    public boolean isRSModelCopyMandatory(String strPSModelName) {
        return false;
    }

    // ---- helpers ----

    public List<String> getPSModelNames() {
        List<String> names = new ArrayList<>();
        names.addAll(psModelDataMap.keySet());
        for (String name : psModelDataMap2.keySet()) {
            if (!names.contains(name)) names.add(name);
        }
        return Collections.unmodifiableList(names);
    }
}