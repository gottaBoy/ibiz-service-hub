package net.ibizsys.modeling.core.dataentity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * Second-level modeling data entity runtime base with batch action support.
 */
public abstract class DataEntityRuntimeBase2
extends DataEntityRuntimeBase {

    protected abstract String[] getBatchActionDENames();

    @Override
    protected Object doExecuteActionReal(String strActionName, IPSDEAction iPSDEAction,
            Object[] args, Object actionData) throws Throwable {
        ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
        boolean bIgnoreDuplicateCheckLast = actionSession.isIgnoreDuplicateCheck();
        try {
            HashMap<String, List<Object>> batchInsertMap = null;
            HashMap<String, List<Object>> batchUpdateMap = null;
            if (iPSDEAction != null
                    && ("CREATE".equalsIgnoreCase(iPSDEAction.getActionMode())
                    || "UPDATE".equalsIgnoreCase(iPSDEAction.getActionMode()))) {
                actionSession.setIgnoreDuplicateCheck(true);
                batchInsertMap = new HashMap<>();
                batchUpdateMap = new HashMap<>();
                for (String strPSModelName : getBatchActionDENames()) {
                    IDataEntityRuntime modelDataEntityRuntime =
                            (IDataEntityRuntime) getSystemRuntime()
                                    .getDataEntityRuntime(strPSModelName);
                    if (!StringUtils.hasLength(modelDataEntityRuntime.getTableName())) {
                        throw new Exception(String.format(
                                "\u5b9e\u4f53[%1$s]\u672a\u6307\u5b9a\u8868\u540d",
                                strPSModelName));
                    }
                    ArrayList<Object> batchInsertList = new ArrayList<>();
                    ArrayList<Object> batchUpdateList = new ArrayList<>();
                    batchInsertMap.put(strPSModelName, batchInsertList);
                    batchUpdateMap.put(strPSModelName, batchUpdateList);
                    actionSession.setActionParam(
                            String.format("_MODEL_BATCHINSERT_%1$s",
                                    modelDataEntityRuntime.getTableName().toUpperCase()),
                            batchInsertList);
                    actionSession.setActionParam(
                            String.format("_MODEL_BATCHUPDATE_%1$s",
                                    modelDataEntityRuntime.getTableName().toUpperCase()),
                            batchUpdateList);
                }
            }
            Object ret = super.doExecuteActionReal(strActionName, iPSDEAction, args, actionData);
            if (batchInsertMap != null && batchUpdateMap != null) {
                for (String strPSModelName : getBatchActionDENames()) {
                    IDataEntityRuntime modelDataEntityRuntime =
                            (IDataEntityRuntime) getSystemRuntime()
                                    .getDataEntityRuntime(strPSModelName);
                    @SuppressWarnings("unchecked")
                    List<Object> batchInsertList = (List<Object>) batchInsertMap.get(strPSModelName);
                    @SuppressWarnings("unchecked")
                    List<Object> batchUpdateList = (List<Object>) batchUpdateMap.get(strPSModelName);
                    actionSession.removeActionParam(
                            String.format("_MODEL_BATCHINSERT_%1$s",
                                    modelDataEntityRuntime.getTableName().toUpperCase()));
                    actionSession.removeActionParam(
                            String.format("_MODEL_BATCHUPDATE_%1$s",
                                    modelDataEntityRuntime.getTableName().toUpperCase()));
                    if (!ObjectUtils.isEmpty(batchInsertList)) {
                        List<List<Map<String, Object>>> partitioned = partitionMaps(batchInsertList, 50);
                        for (List<Map<String, Object>> list : partitioned) {
                            modelDataEntityRuntime.getSysDBSchemeRuntimeMust()
                                    .insert(modelDataEntityRuntime.getTableName(), list, null);
                        }
                    }
                    if (!ObjectUtils.isEmpty(batchUpdateList)) {
                        List<List<Map<String, Object>>> partitioned = partitionMaps(batchUpdateList, 50);
                        for (List<Map<String, Object>> list : partitioned) {
                            modelDataEntityRuntime.getSysDBSchemeRuntimeMust()
                                    .update(modelDataEntityRuntime.getTableName(), list, null);
                        }
                    }
                }
            }
            return ret;
        } finally {
            actionSession.setIgnoreDuplicateCheck(bIgnoreDuplicateCheckLast);
        }
    }

    @SuppressWarnings("unchecked")
    private static List<List<Map<String, Object>>> partitionMaps(List<Object> list, int size) {
        List<List<Map<String, Object>>> result = new ArrayList<>();
        if (list == null || list.isEmpty()) {
            return result;
        }
        int n = list.size();
        for (int i = 0; i < n; i += size) {
            int end = Math.min(n, i + size);
            List<Map<String, Object>> sub = new ArrayList<>();
            for (int j = i; j < end; j++) {
                sub.add((Map<String, Object>) list.get(j));
            }
            result.add(sub);
        }
        return result;
    }
}