package net.ibizsys.modeling.core.util;

import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.util.domain.CopyModelInput;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLInput;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import net.ibizsys.runtime.util.IEntityBase;
import org.springframework.util.StringUtils;

/**
 * Exports model data entities to DSL text.
 *
 * <p>Supports two invocation modes:
 * <ul>
 *   <li><b>data-map mode</b> -- {@code input.data} is a {@code Map<String, List<...>>}
 *       of model-type -> entity list. The exporter delegates to
 *       {@link IModelEnhancerSysUtilRuntime#prepareExportPSModelDSLNodes} and
 *       {@link IModelEnhancerSysUtilRuntime#exportPSModelDSLNodes} for each type.</li>
 *   <li><b>key/model-type mode</b> -- resolves the root entity, traverses its
 *       model scope chain, optionally loads member DER1N children, and
 *       optionally performs a copy pass before producing the DSL output.</li>
 * </ul>
 * </p>
 *
 * <p><b>Missing / incomplete features (clear hooks):</b>
 * <ul>
 *   <li>Full database-backed nested export ({@code doPrepareCopy} / {@code doCopy}
 *       are stubbed -- the {@code requires=true} path will not clone child entities).</li>
 *   <li>The {@code members} option only collects DER1N children; no generic
 *       member-path expansion is implemented.</li>
 * </ul>
 * </p>
 */
public class PSModelDSLExporter {

    private static final Log log = LogFactory.getLog(PSModelDSLExporter.class);

    private final IModelEnhancerSysUtilRuntime modelEnhancerSysUtilRuntime;

    public PSModelDSLExporter(IModelEnhancerSysUtilRuntime modelEnhancerSysUtilRuntime) {
        Assert.notNull(modelEnhancerSysUtilRuntime, "modelEnhancerSysUtilRuntime must not be null");
        this.modelEnhancerSysUtilRuntime = modelEnhancerSysUtilRuntime;
    }

    protected IModelEnhancerSysUtilRuntime getModelEnhancerSysUtilRuntime() {
        return modelEnhancerSysUtilRuntime;
    }

    // ========================================================================
    //  Public API
    // ========================================================================

    /**
     * Export model data to DSL text.
     *
     * @param input export input
     * @return export result containing the DSL string
     */
    public ExportModelDSLResult export(ExportModelDSLInput input) throws Throwable {
        Assert.notNull(input, "export input must not be null");

        // ---- data-map mode ----
        Object data = input.getData();
        if (data instanceof Map<?, ?>) {
            return exportFromDataMap(input, (Map<?, ?>) data);
        }

        // ---- key/model-type mode ----
        String strModelType = input.getModelType();
        String strKeys = input.getKey();
        Assert.hasLength(strModelType, "model type must be provided");
        Assert.hasLength(strKeys, "model keys must be provided");

        PSModelDSLExportSession session = createPSModelDSLExportSession(input);
        String[] keys = strKeys.split("[;]");

        // Resolve the root data entity runtime
        IDataEntityRuntime originDERuntime = (IDataEntityRuntime)
                modelEnhancerSysUtilRuntime.getSystemRuntime()
                        .getDataEntityRuntime(strModelType);

        // Load root entities
        Map<String, IEntityDTO> rootEntityMap = new LinkedHashMap<>();
        for (String key : keys) {
            rootEntityMap.put(key, originDERuntime.getSessionEntityIf(key));
        }

        // Walk model scope chain and register DSL id params
        registerParentScopeParams(session, originDERuntime, rootEntityMap);

        // ---- optional copy pass (requires=true) ----
        PSModelCloneSessionBase copySession = null;
        String strRequires = input.getRequires();
        if ("true".equalsIgnoreCase(strRequires)) {
            copySession = createCopySession(input, originDERuntime, rootEntityMap);
        }

        // ---- members (DER1N children) ----
        Map<String, List<IEntityDTO>> childMap = new LinkedHashMap<>();
        if (StringUtils.hasLength(input.getMembers())) {
            loadMemberChildren(input, originDERuntime, rootEntityMap, childMap, copySession);
        }

        // ---- prepare and export via enhancer runtime ----
        List<IEntityDTO> rootList = new ArrayList<>(rootEntityMap.values());
        modelEnhancerSysUtilRuntime.prepareExportPSModelDSLNodes(
                strModelType, session, rootList);
        for (Map.Entry<String, List<IEntityDTO>> entry : childMap.entrySet()) {
            modelEnhancerSysUtilRuntime.prepareExportPSModelDSLNodes(
                    entry.getKey(), session, entry.getValue());
        }

        modelEnhancerSysUtilRuntime.exportPSModelDSLNodes(
                strModelType, session, rootList);
        for (Map.Entry<String, List<IEntityDTO>> entry : childMap.entrySet()) {
            modelEnhancerSysUtilRuntime.exportPSModelDSLNodes(
                    entry.getKey(), session, entry.getValue());
        }

        return toExportModelDSLResult(session, childMap);
    }

    // ========================================================================
    //  Data-map mode
    // ========================================================================

    private ExportModelDSLResult exportFromDataMap(ExportModelDSLInput input,
                                                    Map<?, ?> data) throws Throwable {
        PSModelDSLExportSession session = createPSModelDSLExportSession(input);

        // Convert raw map entries to DTOs and register per model type
        Map<String, List<IEntityDTO>> dtoMap = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : data.entrySet()) {
            String modelType = (String) entry.getKey();
            Object item = entry.getValue();
            if (!(item instanceof List<?>)) continue;
            List<?> list = (List<?>) item;

            IDataEntityRuntime deRT = (IDataEntityRuntime)
                    modelEnhancerSysUtilRuntime.getSystemRuntime()
                            .getDataEntityRuntime(modelType);
            List<IEntityDTO> dtos = new ArrayList<>();
            for (Object elem : list) {
                if (elem instanceof Map<?, ?>) {
                    Map<?, ?> map = (Map<?, ?>) elem;
                    dtos.add(deRT.createEntity((Map<String, Object>) map, true));
                } else if (elem instanceof IEntityDTO) {
                    IEntityDTO dto = (IEntityDTO) elem;
                    dtos.add(dto);
                }
            }
            dtoMap.put(deRT.getName(), dtos);
        }

        // prepare + export all types
        for (Map.Entry<String, List<IEntityDTO>> entry : dtoMap.entrySet()) {
            modelEnhancerSysUtilRuntime.prepareExportPSModelDSLNodes(
                    entry.getKey(), session, entry.getValue());
        }
        for (Map.Entry<String, List<IEntityDTO>> entry : dtoMap.entrySet()) {
            modelEnhancerSysUtilRuntime.exportPSModelDSLNodes(
                    entry.getKey(), session, entry.getValue());
        }

        return toExportModelDSLResult(session);
    }

    // ========================================================================
    //  Parent scope chain registration
    // ========================================================================

    private void registerParentScopeParams(PSModelDSLExportSession session,
                                            IDataEntityRuntime deRT,
                                            Map<String, IEntityDTO> entityMap) throws Throwable {
        IEntityDTO firstEntity = entityMap.values().iterator().next();
        IDataEntityRuntime currentDERuntime = deRT;
        IEntityDTO currentEntity = firstEntity;

        while (currentEntity != null) {
            String paramPrefix = session.getPSModelParamPrefix(currentDERuntime.getName());
            if (StringUtils.hasLength(paramPrefix)) {
                String parentDSLId = currentDERuntime.getDSLUniqueId(currentEntity);
                String modelTag = currentDERuntime.getModelTag(currentEntity);
                String paramRef = String.format("__%1$s__", currentDERuntime.getName());
                session.setPSModelDSLIdParam(paramRef,
                        String.format("context[\"%1$s\"]?:\"%2$s\"",
                                currentDERuntime.getName(), parentDSLId),
                        String.format("\u5f53\u524d%1$s[%2$s]",
                                currentDERuntime.getLogicName(),
                                currentDERuntime.getFullDataInfo(currentEntity)));

                String dslIdParam = String.format("%1$s%2$s", paramPrefix,
                        modelTag.toLowerCase());
                if (!session.containsPSModelDSLIdParam(dslIdParam)) {
                    session.setPSModelDSLIdParam(dslIdParam, paramRef,
                            String.format("%1$s[%2$s]",
                                    currentDERuntime.getLogicName(),
                                    currentDERuntime.getFullDataInfo(currentEntity)));
                }
            }

            // Walk up model scope
            String modelScope = currentDERuntime.getModelScope(currentEntity);
            if (!StringUtils.hasLength(modelScope)) break;
            String[] parts = modelScope.split("[#]");
            if (parts.length < 2 || "PSSYSTEM".equals(parts[0])) break;

            currentDERuntime = (IDataEntityRuntime)
                    modelEnhancerSysUtilRuntime.getSystemRuntime()
                            .getDataEntityRuntime(parts[0]);
            currentEntity = currentDERuntime.getSessionEntityIf(parts[1]);
        }
    }

    // ========================================================================
    //  Member (DER1N) children loading
    // ========================================================================

    private void loadMemberChildren(ExportModelDSLInput input,
                                     IDataEntityRuntime deRT,
                                     Map<String, IEntityDTO> rootEntityMap,
                                     Map<String, List<IEntityDTO>> childMap,
                                     PSModelCloneSessionBase copySession) throws Throwable {
        String[] members = input.getMembers().split("[,]");
        Map<String, String> memberSet = new LinkedHashMap<>();
        for (String m : members) {
            if (StringUtils.hasLength(m)) memberSet.put(m.toUpperCase(), "");
        }

        for (String memberName : memberSet.keySet()) {
            var derList = deRT.getPSDataEntity().getMajorPSDERs();
            if (ObjectUtils.isEmpty(derList)) continue;

            for (var der : derList) {
                if (!(der instanceof net.ibizsys.model.dataentity.der.IPSDER1N)) continue;
                net.ibizsys.model.dataentity.der.IPSDER1N der1n =
                        (net.ibizsys.model.dataentity.der.IPSDER1N) der;
                if (der1n.getCustomExportOrder2() <= 0) continue;
                if (der1n.getTempDataOrder() >= 0) continue;
                if (!der1n.getMinorPSDataEntity().getName().equals(memberName)) continue;

                IDataEntityRuntime minorDERuntime = (IDataEntityRuntime)
                        modelEnhancerSysUtilRuntime.getSystemRuntime()
                                .getDataEntityRuntime(
                                        der1n.getMinorPSDataEntity().getId());

                for (Map.Entry<String, IEntityDTO> rootEntry : rootEntityMap.entrySet()) {
                    var searchCtx = minorDERuntime.createSearchContext();
                    searchCtx.all().setCount(false);
                    searchCtx.eq(der1n.getPSPickupDEFieldMust().getName(),
                            rootEntry.getKey());
                    List<?> children = minorDERuntime.rawSelect(searchCtx);

                    if (ObjectUtils.isEmpty(children)) continue;

                    if (copySession != null) {
                        for (Object child : children) {
                            copySession.setPSModelData(minorDERuntime.getName(),
                                    minorDERuntime.getKeyFieldValue((IEntityBase) child),
                                    (IEntityDTO) child, false);
                        }
                    } else {
                        String fieldName = "_" + inflectorPluralize(
                                minorDERuntime.getPSDataEntity().getCodeName()).toLowerCase();
                        List<IEntityDTO> list = new ArrayList<>();
                        for (Object child : children) {
                            list.add((IEntityDTO) child);
                        }
                        rootEntry.getValue().set(fieldName, list);
                        childMap.computeIfAbsent(minorDERuntime.getName(),
                                k -> new ArrayList<>()).addAll(list);
                    }
                }
            }
        }
    }

    // ========================================================================
    //  Copy session creation (stub -- full traversal not implemented)
    // ========================================================================

    /**
     * Create a copy session. The full copy traversal (doPrepareCopy / doCopy)
     * is not implemented in this hand-written version.
     *
     * <p>Override this method or extend the class to provide a complete copy
     * implementation.</p>
     */
    protected PSModelCloneSessionBase createCopySession(ExportModelDSLInput input,
                                                         IDataEntityRuntime deRT,
                                                         Map<String, IEntityDTO> rootMap) throws Throwable {
        // TODO: implement full copy traversal (doPrepareCopy / doCopy)
        log.warn("Copy session (requires=true) is not fully implemented. "
                + "Child entities will not be cloned.");
        CopyModelInput copyInput = new CopyModelInput();
        copyInput.setDEMethodDTORuntime(input.getDEMethodDTORuntime());
        copyInput.set(deRT.getKeyPSDEField().getLowerCaseName(),
                String.join(";", rootMap.keySet()));
        copyInput.setOption(input.getOption());
        return new PSModelCopySession(copyInput);
    }

    // ========================================================================
    //  Factory methods
    // ========================================================================

    protected PSModelDSLExportSession createPSModelDSLExportSession(
            ExportModelDSLInput input) {
        return new PSModelDSLExportSession(input);
    }

    protected IPSModelDSLNode createPSModelDSLNode(String nodeName,
                                                    Map<String, Object> attributes,
                                                    IPSModelDSLNode parent) {
        return modelEnhancerSysUtilRuntime.createPSModelDSLNode(
                nodeName, attributes, parent);
    }

    // ========================================================================
    //  Result assembly
    // ========================================================================

    protected ExportModelDSLResult toExportModelDSLResult(
            PSModelDSLExportSession session) throws Throwable {
        return toExportModelDSLResult(session, null);
    }

    protected ExportModelDSLResult toExportModelDSLResult(
            PSModelDSLExportSession session,
            Map<String, List<IEntityDTO>> childMap) throws Throwable {

        StringWriter sw = new StringWriter();
        Object data = session.getExportModelDSLInput().getData();

        if (data instanceof Map<?, ?>) {
            Map<?, ?> dataMap = (Map<?, ?>) data;
            // Data-map mode: tree-building via parent-scope attachment
            writeDataMapDSL(session, sw, dataMap);
        } else {
            // Key/model-type mode
            writeKeyBasedDSL(session, sw, childMap);
        }

        // Prepend DSL variable definitions
        String dslText = prependDSLParams(session, sw.toString());

        ExportModelDSLResult result = new ExportModelDSLResult();
        result.setDSL(dslText);
        log.debug("\n" + dslText);
        return result;
    }

    private void writeDataMapDSL(PSModelDSLExportSession session,
                                  StringWriter sw,
                                  Map<?, ?> dataMap) throws Throwable {
        // Collect all root-level nodes (no parent scope)
        List<IPSModelDSLNode> rootNodes = new ArrayList<>();

        for (Map.Entry<?, ?> entry : dataMap.entrySet()) {
            String modelType = (String) entry.getKey();
            Object item = entry.getValue();
            if (!(item instanceof List<?>)) continue;
            List<?> list = (List<?>) item;

            IDataEntityRuntime deRT = (IDataEntityRuntime)
                    modelEnhancerSysUtilRuntime.getSystemRuntime()
                            .getDataEntityRuntime(modelType);

            for (Object elem : list) {
                IEntityDTO dto;
                if (elem instanceof Map<?, ?>) {
                    Map<?, ?> map = (Map<?, ?>) elem;
                    dto = deRT.createEntity((Map<String, Object>) map, true);
                } else if (elem instanceof IEntityDTO) {
                    dto = (IEntityDTO) elem;
                } else {
                    continue;
                }

                Object key = dto.get(deRT.getKeyPSDEField().getLowerCaseName());
                IPSModelDSLNode node = session.getPSModelDSLNode(
                        deRT.getName(), key, false);
                if (node == null) continue;

                // Try to attach to parent via model scope
                String modelScope = deRT.getModelScope(dto);
                if (StringUtils.hasLength(modelScope)) {
                    String[] parts = modelScope.split("[#]");
                    if (parts.length == 2) {
                        IPSModelDSLNode parent = session.getPSModelDSLNode(
                                parts[0], parts[1], true);
                        if (parent != null) {
                            var scopeDERs = deRT.getModelScopePSDER1Ns();
                            if (!ObjectUtils.isEmpty(scopeDERs)) {
                                for (var der : scopeDERs) {
                                    if (der.getMajorPSDataEntityMust().getName()
                                            .equals(parts[0])) {
                                        node.reset(der.getPickupPSDEFieldMust()
                                                .getLowerCaseName());
                                        break;
                                    }
                                }
                            }
                            parent.appendChild(node);
                            continue;
                        }
                    }
                }
                rootNodes.add(node);
            }
        }

        // Write root nodes
        boolean first = true;
        for (IPSModelDSLNode node : rootNodes) {
            if (first) first = false;
            else sw.write("\r\n");
            writeDSL(session, sw, "", node, false);
        }
    }

    private void writeKeyBasedDSL(PSModelDSLExportSession session,
                                   StringWriter sw,
                                   Map<String, List<IEntityDTO>> childMap) throws Throwable {
        String keyText = session.getExportModelDSLInput().getKey();
        if (StringUtils.hasLength(keyText)) {
            String[] keys = keyText.split("[;]");
            for (String key : keys) {
                if (!StringUtils.hasLength(key)) {
                    continue;
                }
                IPSModelDSLNode node = session.getPSModelDSLNode(
                        session.getExportModelDSLInput().getModelType(), key, false);
                if (node == null) {
                    continue;
                }
                writeDSL(session, sw, "", node, true);
                sw.write("\r\n");
            }
        }

        if (!ObjectUtils.isEmpty(childMap)) {
            for (Map.Entry<String, List<IEntityDTO>> entry : childMap.entrySet()) {
                IDataEntityRuntime deRT = (IDataEntityRuntime)
                        modelEnhancerSysUtilRuntime.getSystemRuntime()
                                .getDataEntityRuntime(entry.getKey());
                for (IEntityDTO dto : entry.getValue()) {
                    IPSModelDSLNode node = session.getPSModelDSLNode(
                            deRT.getName(),
                            dto.get(deRT.getKeyPSDEField().getLowerCaseName()),
                            false);
                    if (node == null) {
                        continue;
                    }
                    writeDSL(session, sw, "", node, false);
                    sw.write("\r\n");
                }
            }
        }
    }

    // ========================================================================
    //  DSL serialization
    // ========================================================================

    /**
     * Write a single DSL node recursively.
     *
     * @param session     export session
     * @param writer      output writer
     * @param prefix      indentation prefix
     * @param node        the node to write
     * @param isRootNode  whether this is the root (top-level) node
     */
    protected void writeDSL(PSModelDSLExportSession session,
                             Writer writer,
                             String prefix,
                             IPSModelDSLNode node,
                             boolean isRootNode) throws Throwable {
        if (StringUtils.hasLength(prefix)) {
            writer.write(prefix);
        }
        writer.write(String.format("%1$s(%2$s)",
                node.getNodeName(),
                getAttributesString(session, node.any(), node)));

        List<IPSModelDSLNode> children = node.getChildren();
        if (ObjectUtils.isEmpty(children)) return;

        writer.write("{");
        if (isRootNode && session.isOutputUpdateOption()) {
            writer.write("\r\n");
            writer.write(prefix + "  ");
            writer.write("option(update:true) //\u542f\u7528\u66f4\u65b0\u64cd\u4f5c");
        }
        for (IPSModelDSLNode child : children) {
            writer.write("\r\n");
            writeDSL(session, writer, prefix + "  ", child, false);
        }
        writer.write("\r\n");
        if (StringUtils.hasLength(prefix)) {
            writer.write(prefix);
        }
        writer.write("}");
    }

    /**
     * Serialize node attributes to a DSL argument string.
     */
    protected String getAttributesString(PSModelDSLExportSession session,
                                          Map<String, Object> attrs,
                                          IPSModelDSLNode node) throws Throwable {
        if (ObjectUtils.isEmpty(attrs)) return "";

        boolean noId = false;
        Object noIdVal = attrs.get("_noid");
        if (noIdVal instanceof Boolean) {
            noId = (Boolean) noIdVal;
        } else if (noIdVal instanceof String) {
            noId = Boolean.parseBoolean((String) noIdVal);
        }

        // Resolve the data entity runtime for attribute-level pickup resolution
        IDataEntityRuntime deRT = null;
        if (node.getReal() != null && node.getReal().getDEMethodDTORuntime() != null) {
            deRT = (IDataEntityRuntime)
                    node.getReal().getDEMethodDTORuntime().getDataEntityRuntime();
        }

        StringBuilder sb = new StringBuilder();
        boolean first = true;

        // DSL id output
        if (!node.isNested()
                && session.isOutputDSLId()
                && StringUtils.hasLength(node.getUniqueId())) {
            sb.append("dsl_id: ");
            sb.append(String.format("\"%1$s\"",
                    node.getUniqueId().replace("\"", "\\\"")));
            first = false;
        }

        for (Map.Entry<String, Object> attr : attrs.entrySet()) {
            String key = attr.getKey();
            // Skip internal fields and suppressed id
            if (key.startsWith("_")) continue;
            if ("id".equalsIgnoreCase(key) && noId) continue;

            if (!first) sb.append(", ");
            first = false;

            sb.append(key);
            sb.append(": ");

            Object value = attr.getValue();
            if (value instanceof String) {
                String strVal = (String) value;
                // Try pickup-reference resolution
                if (deRT != null) {
                    var psdeField = deRT.getPSDEField(key);
                    if (psdeField instanceof net.ibizsys.model.dataentity.defield.IPSInheritDEField) {
                        net.ibizsys.model.dataentity.defield.IPSInheritDEField inherit =
                                (net.ibizsys.model.dataentity.defield.IPSInheritDEField) psdeField;
                        psdeField = inherit.getRelatedPSDEFieldMust();
                    }
                    if (psdeField instanceof net.ibizsys.model.dataentity.defield.IPSPickupDEField) {
                        net.ibizsys.model.dataentity.defield.IPSPickupDEField pickup =
                                (net.ibizsys.model.dataentity.defield.IPSPickupDEField) psdeField;
                        String resolved = resolvePickupRef(session, deRT, pickup, strVal, node);
                        if (resolved != null) {
                            sb.append(resolved);
                            continue;
                        }
                    }
                }
                // Plain string value
                if (strVal.indexOf('\n') == -1) {
                    sb.append(String.format("\"%1$s\"",
                            strVal.replace("\"", "\\\"").replace("$", "\\$")));
                } else {
                    sb.append(String.format("\n\"\"\"%1$s\"\"\"",
                            strVal.replace("\\", "\\\\")
                                    .replace("\"", "\\\"")
                                    .replace("$", "\\$")));
                }
            } else {
                sb.append(value);
            }
        }
        return sb.toString();
    }

    /**
     * Resolve a pickup field value to a DSL id parameter reference.
     *
     * <p>Walks the parent scope chain to find a matching DSL id parameter
     * and returns a parameter reference if the value matches the parent's
     * DSL unique id; otherwise returns {@code null}.</p>
     */
    private String resolvePickupRef(PSModelDSLExportSession session,
                                     IDataEntityRuntime deRT,
                                     net.ibizsys.model.dataentity.defield.IPSPickupDEField pickup,
                                     String strValue,
                                     IPSModelDSLNode node) throws Throwable {
        var der = pickup.getPSDERMust();
        if (der == null) return null;

        String parentModelName = der.getMajorPSDataEntityMust().getName();
        IEntityDTO refEntity = session.getPSModelData(
                parentModelName, "dsl:" + strValue, true);
        if (refEntity == null) return null;

        IDataEntityRuntime parentDERuntime = (IDataEntityRuntime)
                modelEnhancerSysUtilRuntime.getSystemRuntime()
                        .getDataEntityRuntime(
                                der.getMajorPSDataEntityMust().getId());

        IEntityDTO currentEntity = refEntity;
        IDataEntityRuntime currentDERuntime = parentDERuntime;

        while (currentEntity != null) {
            String paramPrefix = session.getPSModelParamPrefix(
                    currentDERuntime.getName());
            if (StringUtils.hasLength(paramPrefix)) {
                String parentDSLId = currentDERuntime.getDSLUniqueId(currentEntity);
                String modelTag = currentDERuntime.getModelTag(currentEntity);
                String dslIdParam = String.format("%1$s%2$s",
                        paramPrefix, modelTag.toLowerCase());
                if (!session.containsPSModelDSLIdParam(dslIdParam)) {
                    session.setPSModelDSLIdParam(dslIdParam,
                            String.format("\"%1$s\"", parentDSLId),
                            String.format("%1$s[%2$s]",
                                    currentDERuntime.getLogicName(),
                                    currentDERuntime.getFullDataInfo(currentEntity)));
                }
                if (strValue.equals(parentDSLId)) {
                    return dslIdParam;
                }
                return String.format("%1$s + \"%2$s\"",
                        dslIdParam,
                        strValue.substring(parentDSLId.length()));
            }

            // Walk up scope
            String modelScope = currentDERuntime.getModelScope(currentEntity);
            if (!StringUtils.hasLength(modelScope)) break;
            String[] parts = modelScope.split("[#]");
            if (parts.length < 2 || "PSSYSTEM".equals(parts[0])) break;

            currentDERuntime = (IDataEntityRuntime)
                    modelEnhancerSysUtilRuntime.getSystemRuntime()
                            .getDataEntityRuntime(parts[0]);
            currentEntity = currentDERuntime.getSessionEntityIf(parts[1]);
        }
        return null;
    }

    // ========================================================================
    //  DSL parameter prepending
    // ========================================================================

    private String prependDSLParams(PSModelDSLExportSession session, String dslBody) {
        List<Map<String, String>> params = session.getPSModelDSLIdParams();
        if (ObjectUtils.isEmpty(params)) return dslBody;

        StringWriter sw = new StringWriter();
        sw.append("//DSL\u53d8\u91cf\r\n");

        // Write params with __ prefix first (auto-generated context refs)
        for (Map<String, String> param : params) {
            String name = param.get("name");
            if (name == null) continue;
            if (name.startsWith("__")) {
                sw.append(String.format("//%1$s\r\n", param.get("description")));
                sw.append(String.format("def %1$s = %2$s\r\n",
                        name, param.get("expression")));
            }
        }
        for (Map<String, String> param : params) {
            String name = param.get("name");
            if (name == null || name.startsWith("__")) continue;
            sw.append(String.format("//%1$s\r\n", param.get("description")));
            sw.append(String.format("def %1$s = %2$s\r\n",
                    name, param.get("expression")));
        }
        sw.append("//DSL\u4ee3\u7801\r\n");
        sw.append(dslBody);
        return sw.toString();
    }

    // ========================================================================
    //  Internal helpers
    // ========================================================================

    /**
     * Simple pluralization helper (replaces the Inflector dependency).
     */
    private static String inflectorPluralize(String word) {
        if (word == null || word.isEmpty()) return word;
        // Basic English pluralization rules
        if (word.endsWith("s") || word.endsWith("x") || word.endsWith("ch")
                || word.endsWith("sh") || word.endsWith("o")) {
            return word + "es";
        }
        if (word.endsWith("y") && word.length() > 1) {
            char prev = word.charAt(word.length() - 2);
            if (!(prev == 'a' || prev == 'e' || prev == 'i' || prev == 'o' || prev == 'u')) {
                return word.substring(0, word.length() - 1) + "ies";
            }
        }
        return word + "s";
    }
}