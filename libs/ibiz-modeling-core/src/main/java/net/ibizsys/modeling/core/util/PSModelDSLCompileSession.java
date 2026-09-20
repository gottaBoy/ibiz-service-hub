package net.ibizsys.modeling.core.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.modeling.core.util.IPSModelDSLNode;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLInput;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * Session context for DSL compilation.
 *
 * <p>Tracks registered DSL nodes, their parent-child relationships, and
 * recursion guards during a model compilation pass.</p>
 */
public class PSModelDSLCompileSession {

    private final CompileModelDSLInput compileModelDSLInput;
    private final Map<String, Map<Object, IPSModelDSLNode>> psModelDSLNodeMap = new LinkedHashMap<>();
    private final Map<String, String> recursionDataMap = new HashMap<>();

    public PSModelDSLCompileSession(CompileModelDSLInput compileModelDSLInput) {
        this.compileModelDSLInput = compileModelDSLInput;
    }

    public CompileModelDSLInput getCompileModelDSLInput() {
        return compileModelDSLInput;
    }

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

    public List<IPSModelDSLNode> getPSModelDSLNodes() {
        List<IPSModelDSLNode> list = new ArrayList<>();
        for (Map.Entry<String, Map<Object, IPSModelDSLNode>> entry : psModelDSLNodeMap.entrySet()) {
            list.addAll(entry.getValue().values());
        }
        return Collections.unmodifiableList(list);
    }

    /**
     * Register a recursion guard for the given entity id and key value.
     *
     * @return {@code true} if this is the first registration, {@code false}
     *         if the pair is already registered (i.e. a recursion cycle).
     */
    public boolean registerRecursion(String strDEId, Object objKeyValue) {
        String tag = String.format("%1$s||%2$s", strDEId, objKeyValue);
        if (recursionDataMap.containsKey(tag)) {
            return false;
        }
        recursionDataMap.put(tag, "");
        return true;
    }

    public void unregisterRecursion(String strDEId, Object objKeyValue) {
        String tag = String.format("%1$s||%2$s", strDEId, objKeyValue);
        recursionDataMap.remove(tag);
    }

    public boolean isAlwaysUpdate() {
        Map<?, ?> option = compileModelDSLInput.getOption();
        if (option == null) {
            return false;
        }
        return DataTypeUtils.asBoolean(option.get("update"), false);
    }
}