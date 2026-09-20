package net.ibizsys.modeling.core.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.util.IPSModelDSLNode;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLInput;
import net.ibizsys.runtime.util.DataTypeUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * Session context for DSL export.
 *
 * <p>Tracks DSL nodes, id parameters, nested model id mappings, and model data
 * during a model export pass. Supports both nested and flat export modes.</p>
 */
public class PSModelDSLExportSession {

    private final ExportModelDSLInput exportModelDSLInput;
    private final Map<String, Map<Object, IPSModelDSLNode>> psModelDSLNodeMap = new HashMap<>();
    private final Map<String, Map<String, String>> psModelDSLIdParamMap = new LinkedHashMap<>();
    private final Map<String, Map<Object, String>> nestedPSModelDSLIdMap = new LinkedHashMap<>();
    private final Map<String, Map<Object, IEntityDTO>> psModelDataMap = new HashMap<>();
    private final Map<String, Map<Object, IEntityDTO>> psModelDataMap2 = new HashMap<>();
    private final Map<String, String> psModelParamPrefixMap = new LinkedHashMap<>();
    private Map<String, String> ignorePSModelTypes;
    private final Deque<IPSModelDSLNode> currentHolder = new ArrayDeque<>();
    private boolean nestedMode = false;

    public PSModelDSLExportSession(ExportModelDSLInput exportModelDSLInput) {
        this.exportModelDSLInput = exportModelDSLInput;

        psModelParamPrefixMap.put("PSMODULE", "mod_");
        psModelParamPrefixMap.put("PSDATAENTITY", "de_");

        Map<?, ?> option = exportModelDSLInput.getOption();
        if (!ObjectUtils.isEmpty(option)) {
            String strIgnoreModels = (String) option.get("ignore_modeltypes");
            if (StringUtils.hasLength(strIgnoreModels)) {
                ignorePSModelTypes = new LinkedHashMap<>();
                for (String model : strIgnoreModels.toUpperCase().split("[,]")) {
                    ignorePSModelTypes.put(model.trim(), "");
                }
            }
        }
    }

    public ExportModelDSLInput getExportModelDSLInput() {
        return exportModelDSLInput;
    }

    // --- Parent stack ---

    public IPSModelDSLNode getParent() {
        return currentHolder.peek();
    }

    public void pushParent(IPSModelDSLNode node) {
        currentHolder.push(node);
    }

    public void pollParent() {
        currentHolder.poll();
    }

    // --- Nested mode ---

    public boolean isNestedMode() {
        return nestedMode;
    }

    public void setNestedMode(boolean nestedMode) {
        this.nestedMode = nestedMode;
    }

    // --- DSL node registry ---

    public boolean setPSModelDSLNode(String strPSModelName, Object key, IPSModelDSLNode node) {
        Map<Object, IPSModelDSLNode> map = psModelDSLNodeMap.computeIfAbsent(strPSModelName, k -> new LinkedHashMap<>());
        if (!map.containsKey(key)) {
            map.put(key, node);
            return true;
        }
        return false;
    }

    public boolean resetPSModelDSLNode(String strPSModelName, Object key, IPSModelDSLNode node) {
        Map<Object, IPSModelDSLNode> map = psModelDSLNodeMap.get(strPSModelName);
        if (map == null) {
            return false;
        }
        return map.remove(key, node);
    }

    public IPSModelDSLNode getPSModelDSLNode(String strPSModelName, Object key, boolean tryMode) throws Exception {
        Map<Object, IPSModelDSLNode> map = psModelDSLNodeMap.get(strPSModelName);
        IPSModelDSLNode node = null;
        if (map != null) {
            node = map.get(key);
        }
        if (node != null || tryMode) {
            return node;
        }
        throw new Exception(String.format(
                "\u6307\u5b9a\u6a21\u578b[%1$s]DSL\u8282\u70b9[%2$s]\u4e0d\u5b58\u5728",
                strPSModelName, key));
    }

    // --- DSL id parameter registry ---

    public boolean setPSModelDSLIdParam(String strParamName, String strExpression, String strDescription) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("name", strParamName);
        map.put("expression", strExpression);
        map.put("description", strDescription);
        if (StringUtils.hasLength(strDescription)) {
            psModelDSLIdParamMap.put(strParamName, map);
            return true;
        }
        if (psModelDSLIdParamMap.containsKey(strParamName)) {
            return false;
        }
        psModelDSLIdParamMap.put(strParamName, map);
        return true;
    }

    public List<Map<String, String>> getPSModelDSLIdParams() {
        return Collections.unmodifiableList(new ArrayList<>(psModelDSLIdParamMap.values()));
    }

    public boolean containsPSModelDSLIdParam(String strParamName) {
        return psModelDSLIdParamMap.containsKey(strParamName);
    }

    // --- Nested DSL id registry ---

    public String getNestedPSModelDSLId(String strPSModelName, Object key, boolean tryMode) throws Exception {
        Map<Object, String> map = nestedPSModelDSLIdMap.get(strPSModelName);
        String dslId = null;
        if (map != null) {
            dslId = map.get(key);
        }
        if (StringUtils.hasLength(dslId) || tryMode) {
            return dslId;
        }
        throw new Exception(String.format(
                "\u6307\u5b9a\u5d4c\u5957\u6a21\u578b[%1$s]DSL\u6807\u8bc6[%2$s]\u4e0d\u5b58\u5728",
                strPSModelName, key));
    }

    public boolean setNestedPSModelDSLId(String strPSModelName, Object key, String strDslId) {
        Map<Object, String> map = nestedPSModelDSLIdMap.computeIfAbsent(strPSModelName, k -> new LinkedHashMap<>());
        if (!map.containsKey(key)) {
            map.put(key, strDslId);
            return true;
        }
        return false;
    }

    // --- Model data registry ---

    public boolean setPSModelData(String strPSModelName, Object key, IEntityDTO entity, boolean inner) throws Exception {
        if (inner) {
            Map<Object, IEntityDTO> map = psModelDataMap2.computeIfAbsent(strPSModelName, k -> new LinkedHashMap<>());
            if (!map.containsKey(key)) {
                map.put(key, entity);
                return true;
            }
            return false;
        }
        Map<Object, IEntityDTO> map = psModelDataMap.computeIfAbsent(strPSModelName, k -> new LinkedHashMap<>());
        if (!map.containsKey(key)) {
            map.put(key, entity);
            return true;
        }
        return false;
    }

    public boolean resetPSModelData(String strPSModelName, Object key, IEntityDTO entity, boolean inner) throws Exception {
        if (inner) {
            Map<Object, IEntityDTO> map = psModelDataMap2.get(strPSModelName);
            if (map == null) {
                return false;
            }
            return map.remove(key, entity);
        }
        Map<Object, IEntityDTO> map = psModelDataMap.get(strPSModelName);
        if (map == null) {
            return false;
        }
        return map.remove(key, entity);
    }

    public IEntityDTO getPSModelData(String strPSModelName, Object key, boolean tryMode) throws Exception {
        Map<Object, IEntityDTO> map = psModelDataMap.get(strPSModelName);
        IEntityDTO entity = null;
        if (map != null) {
            entity = map.get(key);
        }
        if (entity == null && (map = psModelDataMap2.get(strPSModelName)) != null) {
            entity = map.get(key);
        }
        if (entity != null || tryMode) {
            return entity;
        }
        throw new Exception(String.format(
                "\u6307\u5b9a\u6a21\u578b[%1$s]\u6570\u636e[%2$s]\u4e0d\u5b58\u5728",
                strPSModelName, key));
    }

    // --- Option helpers ---

    public boolean isOutputDSLId() {
        Map<?, ?> option = exportModelDSLInput.getOption();
        if (option == null) {
            return false;
        }
        return DataTypeUtils.asBoolean(option.get("dsl_id"), false);
    }

    public boolean isOutputUpdateOption() {
        Map<?, ?> option = exportModelDSLInput.getOption();
        if (option == null) {
            return false;
        }
        return DataTypeUtils.asBoolean(option.get("update"), false);
    }

    public String getPSModelParamPrefix(String strPSModelName) {
        return psModelParamPrefixMap.get(strPSModelName);
    }

    public boolean shouldExportPSModel(String strPSModelName) {
        if (!ObjectUtils.isEmpty(ignorePSModelTypes)) {
            return !ignorePSModelTypes.containsKey(strPSModelName.toUpperCase());
        }
        return true;
    }
}