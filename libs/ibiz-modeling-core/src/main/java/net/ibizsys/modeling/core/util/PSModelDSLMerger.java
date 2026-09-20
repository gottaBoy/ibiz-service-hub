package net.ibizsys.modeling.core.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLInput;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLResult;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLInput;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLResult;
import net.ibizsys.modeling.core.util.domain.MergeModelDSLInput;
import net.ibizsys.modeling.core.util.domain.MergeModelDSLResult;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.ITransactionalUtil;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

/**
 * 合并 DSL 定义，支持两种模式：
 * <ul>
 *   <li><b>changelog 模式</b> — 根据 {@link MergeModelDSLInput#getChangedModel()} 为 true，
 *       通过 {@link ChangelogProvider} 查询变更日志并导出变更实体的 DSL。</li>
 *   <li><b>direct 模式</b> — 直接合并输入 DSL 映射。</li>
 * </ul>
 *
 * 两种模式下均通过 {@link PSModelDSLCompiler} 编译、按主键去重、再通过 {@link PSModelDSLExporter} 导出。
 *
 * <p>导出步骤使用 {@link ActionSessionManager#execute(IAction, Object[], int)} 包裹，
 * retry 次数为 {@link #RETRY_COUNT}，与反编译原版一致。</p>
 */
public class PSModelDSLMerger {

    private static final Log log = LogFactory.getLog(PSModelDSLMerger.class);

    /** ActionSessionManager retry 次数，与原版 CFR 一致。 */
    private static final int RETRY_COUNT = 3;

    private final IModelEnhancerSysUtilRuntime modelEnhancerSysUtilRuntime;

    /**
     * 可选的变更日志提供者。changelog 模式必选。
     */
    private ChangelogProvider changelogProvider;

    /**
     * 当 changelog 查询失败或未配置时：true 返回空结果，false 抛出异常。默认 false。
     */
    private boolean emptyResultOnMissingChangelog = false;

    // ========================================================================
    //  Constructors
    // ========================================================================

    public PSModelDSLMerger(IModelEnhancerSysUtilRuntime modelEnhancerSysUtilRuntime) {
        this.modelEnhancerSysUtilRuntime = Objects.requireNonNull(
                modelEnhancerSysUtilRuntime, "modelEnhancerSysUtilRuntime must not be null");
    }

    // ========================================================================
    //  Configuration
    // ========================================================================

    public void setChangelogProvider(ChangelogProvider changelogProvider) {
        this.changelogProvider = changelogProvider;
    }

    public void setEmptyResultOnMissingChangelog(boolean emptyResultOnMissingChangelog) {
        this.emptyResultOnMissingChangelog = emptyResultOnMissingChangelog;
    }

    protected IModelEnhancerSysUtilRuntime getModelEnhancerSysUtilRuntime() {
        return modelEnhancerSysUtilRuntime;
    }

    // ========================================================================
    //  Public API
    // ========================================================================

    /**
     * 合并 DSL。
     *
     * @param input 合并输入
     * @return 合并结果
     * @throws Throwable 校验 / 编译 / 导出失败时
     */
    public MergeModelDSLResult merge(MergeModelDSLInput input) throws Throwable {
        Objects.requireNonNull(input, "merge input must not be null");

        // ---- Phase 1: 获取 DSL 映射 ----
        boolean bUpdateMode = false;
        Map<String, String> dsl;

        if (DataTypeUtils.asBoolean(input.getChangedModel(), false)) {
            Timestamp from = input.getFrom();
            if (from == null) {
                throw new Exception("未传入变更模型起始时间");
            }
            bUpdateMode = true;
            dsl = resolveChangedModelDSL(from);
            if (dsl == null) {
                MergeModelDSLResult emptyResult = new MergeModelDSLResult();
                emptyResult.setDSL("");
                return emptyResult;
            }
        } else {
            dsl = input.getDSL();
        }

        if (ObjectUtils.isEmpty(dsl)) {
            if (bUpdateMode && emptyResultOnMissingChangelog) {
                log.warn("Changelog mode produced no DSL entries; returning empty result");
                MergeModelDSLResult emptyResult = new MergeModelDSLResult();
                emptyResult.setDSL("");
                return emptyResult;
            }
            if (!bUpdateMode) {
                throw new Exception("未传入编译DSL对象");
            }
        }

        // ---- Phase 2: 编译并合并 ----
        // 使用 LinkedHashMap 保持顺序
        LinkedHashMap<String, ArrayList<IEntityDTO>> total = new LinkedHashMap<>();

        for (Map.Entry<String, String> entry : dsl.entrySet()) {
            String entryKey = entry.getKey();
            String dslSource = entry.getValue();

            PSModelDSLCompiler compiler = new PSModelDSLCompiler(modelEnhancerSysUtilRuntime);
            CompileModelDSLInput compileInput = new CompileModelDSLInput();
            compileInput.setDSL(dslSource);

            CompileModelDSLResult compileResult;
            try {
                compileResult = compiler.compile(compileInput);
            } catch (Throwable ex) {
                throw new Exception(String.format(
                        "编译[%1$s]DSL发生异常，%2$s", entryKey, ex.getMessage()), ex);
            }

            Object data = compileResult.getData();
            if (data instanceof Map) {
                Map<String, List<IEntityDTO>> map = (Map<String, List<IEntityDTO>>) data;
                for (String key : map.keySet()) {
                    List<IEntityDTO> list = map.get(key);
                    if (ObjectUtils.isEmpty(list)) {
                        continue;
                    }

                    ArrayList<IEntityDTO> last = total.get(key);
                    if (last == null) {
                        last = new ArrayList<>();
                        last.addAll(list);
                        total.put(key, last);
                        continue;
                    }

                    // 按主键去重
                    LinkedHashMap<Object, IEntityDTO> lastMap = new LinkedHashMap<>();
                    for (IEntityDTO item : last) {
                        Object keyValue = extractKeyValue(item);
                        if (keyValue != null) {
                            lastMap.put(keyValue, item);
                        }
                    }
                    for (IEntityDTO item : list) {
                        Object keyValue = extractKeyValue(item);
                        if (keyValue != null && !lastMap.containsKey(keyValue)) {
                            lastMap.put(keyValue, item);
                            last.add(item);
                        }
                    }
                }
            }
        }

        // ---- Phase 3: 导出 ----
        try {
            final PSModelDSLExporter exporter = new PSModelDSLExporter(modelEnhancerSysUtilRuntime);
            final ExportModelDSLInput exportInput = new ExportModelDSLInput();
            exportInput.setData(total);

            LinkedHashMap<String, Boolean> option = new LinkedHashMap<>();
            if (bUpdateMode) {
                option.put("update", true);
            }
            exportInput.setOption(option);

            final MergeModelDSLResult result = new MergeModelDSLResult();

            // 与原版 CFR 一致：通过 ActionSessionManager.execute 包裹，retry=3
            ActionSessionManager.execute(new IAction() {
                @Override
                public Object execute(Object[] args) throws Throwable {
                    ExportModelDSLResult exportResult = exporter.export(exportInput);
                    result.setDSL(exportResult.getDSL());
                    return null;
                }
            }, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

            return result;
        } catch (Throwable ex) {
            throw new Exception(String.format(
                    "导出合并DSL发生异常，%1$s", ex.getMessage()), ex);
        }
    }

    // ========================================================================
    //  Changelog 解析
    // ========================================================================

    /**
     * 解析 changelog 模式下的 DSL 映射。
     *
     * <p>当 {@link #emptyResultOnMissingChangelog} 为 true 时，provider 缺失或返回空数据返回 null。</p>
     */
    @SuppressWarnings("unchecked")
    protected Map<String, String> resolveChangedModelDSL(final Timestamp from) throws Throwable {
        if (changelogProvider == null) {
            if (emptyResultOnMissingChangelog) {
                log.warn("ChangelogProvider not configured; returning empty result for changedmodel path");
                return null;
            }
            throw new Exception("变更模型查询需要 ChangelogProvider，请通过 setChangelogProvider 设置");
        }

        List<? extends ChangelogEntry> entries = changelogProvider.queryChangedModel(from);
        if (ObjectUtils.isEmpty(entries)) {
            if (emptyResultOnMissingChangelog) {
                log.warn("Changelog provider returned no data; returning empty result");
                return null;
            }
            throw new Exception("未存在变更模型数据");
        }

        // 收集 DELETE 标记
        final LinkedHashMap<String, String> removeMap = new LinkedHashMap<>();
        for (ChangelogEntry entry : entries) {
            if (PSModelEnums.PSModelChangeType.DELETE.value.equals(entry.getChgType())) {
                String tag = String.format("%1$s_%2$s", entry.getObjType(), entry.getPSObjId());
                removeMap.put(tag, "");
            }
        }

        // 导出每个 CREATE/UPDATE 的 DSL
        final LinkedHashMap<String, String> dslMap = new LinkedHashMap<>();
        for (ChangelogEntry entry : entries) {
            String chgType = entry.getChgType();
            if (!PSModelEnums.PSModelChangeType.CREATE.value.equals(chgType)
                    && !PSModelEnums.PSModelChangeType.UPDATE.value.equals(chgType)) {
                continue;
            }

            String tag = String.format("%1$s_%2$s", entry.getObjType(), entry.getPSObjId());
            if (dslMap.containsKey(tag) || removeMap.containsKey(tag)) {
                continue;
            }

            final IDataEntityRuntime deRT;
            try {
                deRT = (IDataEntityRuntime) modelEnhancerSysUtilRuntime
                        .getSystemRuntime().getDataEntityRuntime(entry.getObjType());
            } catch (Exception e) {
                log.error("无法获取数据实体运行时[" + entry.getObjType() + "]，跳过", e);
                continue;
            }

            if (deRT.isNestedModel()) {
                continue;
            }

            final String strTag = tag;
            final ExportModelDSLInput exportInput = new ExportModelDSLInput();
            exportInput.set(deRT.getKeyPSDEField().getLowerCaseName(), entry.getPSObjId());

            // 与原版 CFR 一致：通过 ActionSessionManager.execute 包裹，retry=3
            try {
                ActionSessionManager.execute(new IAction() {
                    @Override
                    public Object execute(Object[] args) throws Throwable {
                        ExportModelDSLResult exportResult = deRT.exportModelDSL(exportInput);
                        dslMap.put(strTag, exportResult.getDSL());
                        return null;
                    }
                }, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
            } catch (Throwable ex) {
                log.error(String.format(
                        "[%1$s]导出DSL[%2$s]发生异常，%3$s",
                        deRT.getName(), entry.getPSObjId(), ex.getMessage()), ex);
            }
        }

        return dslMap;
    }

    // ========================================================================
    //  主键提取
    // ========================================================================

    /**
     * 提取实体 DTO 的主键值。
     */
    private static Object extractKeyValue(IEntityDTO entity) {
        if (entity.getDEMethodDTORuntime() == null
                || entity.getDEMethodDTORuntime().getDataEntityRuntime() == null
                || entity.getDEMethodDTORuntime().getDataEntityRuntime()
                        .getKeyPSDEField() == null) {
            return null;
        }
        String keyField = entity.getDEMethodDTORuntime().getDataEntityRuntime()
                .getKeyPSDEField().getLowerCaseName();
        return entity.get(keyField);
    }

    // ========================================================================
    //  ChangelogProvider 接口
    // ========================================================================

    /**
     * 变更日志查询提供者接口。
     *
     * <p>实现者负责查询变更日志存储（如 {@code PSSYSDBCHGLOG}）并返回 {@link ChangelogEntry} 列表。</p>
     */
    public interface ChangelogProvider {

        /**
         * 查询自指定时间以来的变更日志。
         *
         * @param from 起始时间（含）
         * @return 变更日志条目列表，不可为 null
         * @throws Throwable 查询失败时
         */
        List<? extends ChangelogEntry> queryChangedModel(Timestamp from) throws Throwable;
    }

    /**
     * 单条模型变更日志。
     */
    public interface ChangelogEntry {

        /** 变更类型：CREATE / UPDATE / DELETE。 */
        String getChgType();

        /** 模型对象类型名（如 PSDATAENTITY）。 */
        String getObjType();

        /** 模型对象主键。 */
        String getPSObjId();
    }
}