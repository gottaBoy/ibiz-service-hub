package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDataDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.modeling.core.addin.IPSModelDSLTranspiler;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.util.IPSModelDSLNode;
import net.ibizsys.modeling.core.util.PSDevSlnSysIdHolder;
import net.ibizsys.modeling.core.util.PSModelDSLCompileSession;
import net.ibizsys.modeling.core.util.PSModelDSLExportSession;
import net.ibizsys.modeling.core.util.PSModelDSLNode;
import net.ibizsys.modeling.core.util.PSModels;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.plugin.IModelRTAddin;
import net.ibizsys.runtime.plugin.ModelRTAddinException;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.KeyValueUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * Default node-level DSL transpiler for modeling data entities.
 *
 * <p>The transpiler converts DSL attributes into model DTOs, resolves model
 * references during compilation, and turns DTO trees back into DSL nodes
 * during export. Model-specific addins can override the protected hooks before
 * create and update operations.</p>
 */
public abstract class PSModelDSLTranspilerBase extends ModelEnhancerSysUtilRTAddinBase
        implements IPSModelDSLTranspiler {

    private static final Log log = LogFactory.getLog(PSModelDSLTranspilerBase.class);

    private static final Map<String, String> IGNORE_DUMP_FIELDS = new HashMap<>();
    private static final Map<String, String> PARAM_PREFIXES = new HashMap<>();
    private static final Map<String, String> AUTO_ORDER_VALUE_DES = new HashMap<>();
    private static final Map<String, String> IGNORE_DUMP_DE_FIELDS = new HashMap<>();

    protected static final Pattern codeNamePattern;

    public static final String NESTEDROOTID = "<NESTEDROOTID>";
    public static final String DSLTEMPID_PREFIX = "dsltmp_";
    public static final String DSLID_PREFIX = "dsl:";

    private IDataEntityRuntime dataEntityRuntime;

    @Override
    protected void onInit() throws Exception {
        dataEntityRuntime = (IDataEntityRuntime) getSystemRuntime()
                .getDataEntityRuntime(getModelName());
        super.onInit();
    }

    public IDataEntityRuntime getDataEntityRuntime() {
        return dataEntityRuntime;
    }

    @Override
    public IPSModelDSLNode createPSModelDSLNode(Object data, IPSModelDSLNode parent) {
        Assert.notNull(data, "\u672a\u4f20\u5165\u8282\u70b9\u6570\u636e");
        try {
            return onCreatePSModelDSLNode(data, parent);
        } catch (Throwable ex) {
            ModelRTAddinException.rethrow((IModelRTAddin) this, ex);
            throw new ModelRTAddinException((IModelRuntime) getSysUtilRuntime(),
                    (IModelRTAddin) this, ex.getMessage(), ex);
        }
    }

    protected IPSModelDSLNode onCreatePSModelDSLNode(Object data, IPSModelDSLNode parent)
            throws Throwable {
        List<IPSDER1NBase> modelScopeDERs = getDataEntityRuntime().getModelScopePSDER1Ns();
        if (ObjectUtils.isEmpty(modelScopeDERs) && parent != null) {
            throw new RuntimeException(String.format("\u6a21\u578b[%1$s]\u672a\u5b9a\u4e49\u6a21\u578b\u8303\u56f4\u5173\u7cfb",
                    getDataEntityRuntime().getName()));
        }

        IPSDER1NBase modelScopeDER = null;
        if (parent != null) {
            for (IPSDER1NBase item : modelScopeDERs) {
                IDataEntityRuntime majorRuntime = (IDataEntityRuntime) getSystemRuntime()
                        .getDataEntityRuntime(item.getMajorPSDataEntityMust().getId());
                if (majorRuntime.getModelDSLNodeName().equals(parent.getNodeName())) {
                    modelScopeDER = item;
                    break;
                }
            }
        } else {
            // Force model tag field resolution for root nodes. Some runtime
            // implementations lazily initialize the model metadata here.
            getDataEntityRuntime().getPSDEField("PSSYSTEMID", true);
        }

        if (modelScopeDER == null && parent != null) {
            throw new RuntimeException(String.format(
                    "\u6a21\u578b[%1$s]\u4e0d\u662f\u6a21\u578b[%2$s]\u7684\u6210\u5458\u6a21\u578b",
                    getDataEntityRuntime().getModelDSLNodeName(), parent.getNodeName()));
        }

        IEntityDTO entity = getEntityDTO(data);
        String name;
        if (getDataEntityRuntime().getMajorPSDEField() != null
                && ObjectUtils.isEmpty(name = entity.getString(
                        getDataEntityRuntime().getMajorPSDEField().getLowerCaseName(), null))
                && !ObjectUtils.isEmpty(name = entity.getString("name", null))) {
            entity.set(getDataEntityRuntime().getMajorPSDEField().getLowerCaseName(), name);
            entity.reset("name");
        }

        boolean dtoField = false;
        if (parent != null) {
            IEntityDTO parentEntity = parent.getReal();
            IDEMethodDTORuntime parentDTORuntime = parentEntity.getDEMethodDTORuntime();
            if (parentDTORuntime.getPSDEMethodDTOFieldByDER(modelScopeDER.getId(), true) != null) {
                dtoField = true;
            }
        }
        entity.set("_nested", dtoField ? 1 : 0);

        return new PSModelDSLNode(parent, getDataEntityRuntime().getModelDSLNodeName(),
                entity.any(), entity);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    protected IEntityDTO getEntityDTO(Object data) {
        if (data instanceof IEntityDTO) {
            return (IEntityDTO) data;
        }
        if (data instanceof Map) {
            Map attributes = (Map) data;
            List<IPSDEField> fields = getDataEntityRuntime().getPSDEFields(false);
            if (!ObjectUtils.isEmpty(fields)) {
                for (IPSDEField field : fields) {
                    String serviceCodeName = field.getUserTag4();
                    if (ObjectUtils.isEmpty(serviceCodeName)
                            || attributes.containsKey(field.getCodeName().toLowerCase())
                            || !attributes.containsKey(serviceCodeName.toLowerCase())) {
                        continue;
                    }
                    attributes.put(field.getCodeName().toLowerCase(),
                            attributes.get(serviceCodeName.toLowerCase()));
                }
            }
            IEntityDTO entity = getDataEntityRuntime().createEntity();
            entity.putAll(attributes);
            return entity;
        }
        throw new RuntimeException(String.format("\u65e0\u6cd5\u8bc6\u522b\u7684\u4f20\u5165\u6570\u636e\u7c7b\u578b[%1$s]",
                data.getClass()));
    }

    @Override
    public void prepareCompilePSModelDSLNode(PSModelDSLCompileSession session,
                                             IPSModelDSLNode node) {
        Assert.notNull(session, "\u672a\u4f20\u5165\u6a21\u578bDSL\u7f16\u8bd1\u4f1a\u8bdd\u5bf9\u8c61");
        Assert.notNull(node, "\u672a\u4f20\u5165\u6a21\u578bDSL\u8282\u70b9\u5bf9\u8c61");
        try {
            onPrepareCompilePSModelDSLNode(session, node);
        } catch (Throwable ex) {
            ModelRTAddinException.rethrow((IModelRTAddin) this, ex);
            throw new ModelRTAddinException((IModelRuntime) getSysUtilRuntime(),
                    (IModelRTAddin) this, ex.getMessage(), ex);
        }
    }

    protected void onPrepareCompilePSModelDSLNode(PSModelDSLCompileSession session,
                                                  IPSModelDSLNode node) throws Throwable {
        IEntityDTO entity = node.getReal();
        if (entity == null || entity.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format(
                    "dsl\u8282\u70b9[%1$s][%2$s]\u6570\u636e\u5bf9\u8c61\u65e0\u6548",
                    node.getNodeName(), node.getUniqueId()));
        }
        IDataEntityRuntime runtime = (IDataEntityRuntime) entity.getDEMethodDTORuntime()
                .getDataEntityRuntime();
        entity.reset(runtime.getKeyPSDEField().getLowerCaseName());
    }

    @Override
    public void compilePSModelDSLNode(PSModelDSLCompileSession session,
                                      IPSModelDSLNode node) {
        Assert.notNull(session, "\u672a\u4f20\u5165\u6a21\u578bDSL\u7f16\u8bd1\u4f1a\u8bdd\u5bf9\u8c61");
        Assert.notNull(node, "\u672a\u4f20\u5165\u6a21\u578bDSL\u8282\u70b9\u5bf9\u8c61");
        boolean nested = node.isNested();
        String uniqueId = node.getUniqueId();
        try {
            if (!nested && StringUtils.hasLength(uniqueId)
                    && !session.registerRecursion(node.getPSModelName(), uniqueId)) {
                throw new Exception(String.format(
                        "\u7f16\u8bd1\u6a21\u578b[%1$s][%2$s]\u51fa\u73b0\u9012\u5f52",
                        node.getPSModelName(), uniqueId));
            }
            onCompilePSModelDSLNode(session, node);
        } catch (Throwable ex) {
            ModelRTAddinException.rethrow((IModelRTAddin) this, ex);
            throw new ModelRTAddinException((IModelRuntime) getSysUtilRuntime(),
                    (IModelRTAddin) this, ex.getMessage(), ex);
        } finally {
            if (!nested && StringUtils.hasLength(uniqueId)) {
                session.unregisterRecursion(node.getPSModelName(), uniqueId);
            }
        }
    }

    protected void onCompilePSModelDSLNode(PSModelDSLCompileSession session,
                                           IPSModelDSLNode node) throws Throwable {
        IEntityDTO entity = node.getReal();
        IDEMethodDTORuntime dtoRuntime = entity.getDEMethodDTORuntime();
        if (dtoRuntime == null) {
            return;
        }

        IDataEntityRuntime runtime = (IDataEntityRuntime) dtoRuntime.getDataEntityRuntime();
        Object key = entity.get(runtime.getKeyPSDEField().getLowerCaseName());
        if (!ObjectUtils.isEmpty(key)) {
            return;
        }

        if (!node.isNested()) {
            String uniqueId = node.getUniqueId();
            if (!StringUtils.hasLength(uniqueId)) {
                throw new Exception(String.format(
                        "\u6570\u636e[%1$s][%2$s]DSL\u552f\u4e00\u6807\u8bc6\u65e0\u6548",
                        runtime.getName(), entity));
            }
            key = runtime.getRealIdByFullModelTag(uniqueId, true);
        } else {
            key = node.getId();
        }
        if (!ObjectUtils.isEmpty(key)) {
            entity.set(runtime.getKeyPSDEField().getLowerCaseName(), key);
        }

        List<IPSDEMethodDTOField> fields = dtoRuntime.getPSDEMethodDTOFields();
        for (IPSDEMethodDTOField dtoField : fields) {
            String type = dtoField.getType();
            Object value = node.get(dtoField.getName());
            if (ObjectUtils.isEmpty(value)
                    || !PSModelEnums.DEMethodDTOFieldType.SIMPLE.value.equals(type)) {
                continue;
            }
            IPSDEField field = dtoField.getPSDEField();
            if (field == null || field.isKeyDEField() || field.isMajorDEField()
                    || IGNORE_DUMP_FIELDS.containsKey(field.getLowerCaseName())) {
                continue;
            }
            if (dtoField.getRelatedPSDEMethodDTOField() != null) {
                field = dtoField.getRelatedPSDEMethodDTOField().getPSDEFieldMust();
            }
            if (!field.isPhisicalDEField() || field instanceof IPSPickupDataDEField) {
                continue;
            }
            if (field instanceof IPSPickupDEField) {
                IPSPickupDEField pickupField = (IPSPickupDEField) field;
                IPSDER1N relation = (IPSDER1N) pickupField.getPSDERMust();
                IDataEntityRuntime refRuntime = (IDataEntityRuntime) getDataEntityRuntime()
                        .getSystemRuntime()
                        .getDataEntityRuntime(relation.getMajorPSDataEntityMust().getId(), false);
                if (PSModels.isConfigInstDataEntity(refRuntime.getName())) {
                    entity.set(dtoField.getLowerCaseName(), value);
                    continue;
                }
                if (!PSModels.isModelInstDataEntity(refRuntime.getName())) {
                    continue;
                }
                try {
                    if (relation.getTempDataOrder() >= 0) {
                        entity.set(dtoField.getLowerCaseName(), value);
                        continue;
                    }
                    IPSModelDSLNode refNode = session.getPSModelDSLNode(
                            refRuntime.getName(), value, true);
                    if (refNode != null) {
                        if (!StringUtils.hasLength(refNode.getRealId())) {
                            getSysUtilRuntime().compilePSModelDSLNode(
                                    refNode.getPSModelName(), session, refNode);
                            if (!StringUtils.hasLength(refNode.getRealId())) {
                                throw new Exception("\u7f16\u8bd1\u8fd4\u56de\u6807\u8bc6\u65e0\u6548");
                            }
                        }
                        entity.set(dtoField.getLowerCaseName(), refNode.getRealId());
                        continue;
                    }
                    String realId = refRuntime.getRealIdByFullModelTag(String.valueOf(value), false);
                    entity.set(dtoField.getLowerCaseName(), realId);
                    continue;
                } catch (Throwable ex) {
                    throw new Exception(String.format(
                            "\u8f6c\u5316\u5f15\u7528\u6570\u636e[%1$s][%2$s]DSL\u552f\u4e00\u6807\u8bc6\u53d1\u751f\u5f02\u5e38\uff0c%3$s",
                            refRuntime.getName(), value, ex.getMessage()), ex);
                }
            }
            entity.set(dtoField.getLowerCaseName(), value);
        }

        if (!node.isNested() && node.getParent() != null) {
            IPSModelDSLNode parent = node.getParent();
            if (!StringUtils.hasLength(parent.getRealId())) {
                getSysUtilRuntime().compilePSModelDSLNode(
                        parent.getPSModelName(), session, parent);
                if (!StringUtils.hasLength(parent.getRealId())) {
                    throw new Exception("\u7f16\u8bd1\u8fd4\u56de\u6807\u8bc6\u65e0\u6548");
                }
            }
            List<IPSDER1NBase> scopeDERs = getDataEntityRuntime().getModelScopePSDER1Ns();
            if (!ObjectUtils.isEmpty(scopeDERs)) {
                for (IPSDER1NBase relation : scopeDERs) {
                    if (relation.getMajorPSDataEntityMust().getName()
                            .equals(parent.getPSModelName())) {
                        entity.set(relation.getPickupPSDEFieldMust().getLowerCaseName(),
                                parent.getRealId());
                        break;
                    }
                }
            }
        }

        for (IPSDEMethodDTOField dtoField : fields) {
            String type = dtoField.getType();
            if (!PSModelEnums.DEMethodDTOFieldType.DTOS.value.equals(type)
                    || dtoField.getPSDER() == null) {
                continue;
            }
            String minorName = dtoField.getPSDERMust().getMinorPSDataEntityMust().getName();
            IDataEntityRuntime minorRuntime = (IDataEntityRuntime) getSystemRuntime()
                    .getDataEntityRuntime(dtoField.getPSDERMust().getMinorPSDataEntityMust().getId());
            ArrayList<IEntityDTO> dtoList = new ArrayList<>();
            List<IPSModelDSLNode> children = node.getChildren();
            if (!ObjectUtils.isEmpty(children)) {
                for (IPSModelDSLNode child : children) {
                    if (!child.isNested() || !minorName.equals(child.getPSModelName())) {
                        continue;
                    }
                    getSysUtilRuntime().compilePSModelDSLNode(
                            child.getPSModelName(), session, child);
                    minorRuntime.fillEntityDefaultValues((IEntity) child.getReal());
                    dtoList.add(child.getReal());
                }
                if (isAutoOrderValue(minorRuntime.getName())) {
                    int order = 1;
                    for (IEntityDTO item : dtoList) {
                        item.set("ordervalue", order++);
                    }
                } else {
                    IPSDEField orderField = minorRuntime.getPSDEField("ORDERVALUE", true);
                    if (orderField != null) {
                        int order = 1;
                        for (IEntityDTO item : dtoList) {
                            int lastOrder = item.getInteger("ordervalue", -1);
                            if (lastOrder <= -1) {
                                item.set("ordervalue", order++);
                            } else {
                                order = lastOrder + 1;
                            }
                        }
                    }
                }
            }
            entity.set(dtoField.getLowerCaseName(), dtoList);
        }

        if (!node.isNested()) {
            if (ObjectUtils.isEmpty(key)) {
                onBeforeCreatePSModel(session, node, entity);
                if (DataTypeUtils.asBoolean(
                        session.getCompileModelDSLInput().getBuild(), false)) {
                    IPSDEAction action = runtime.getPSDEAction("create");
                    if (action != null) {
                        runtime.removeInvalidUserInput(action, entity);
                    }
                    runtime.create(entity);
                } else {
                    entity.set(runtime.getKeyPSDEField().getLowerCaseName(),
                            DSLTEMPID_PREFIX + KeyValueUtils.genUniqueId());
                }
            } else {
                onBeforeUpdatePSModel(session, node, entity);
                if ((node.isEnableUpdate() || session.isAlwaysUpdate())
                        && DataTypeUtils.asBoolean(
                                session.getCompileModelDSLInput().getBuild(), false)) {
                    IPSDEAction action = runtime.getPSDEAction("update");
                    if (action != null) {
                        runtime.removeInvalidUserInput(action, entity);
                    }
                    runtime.update(entity);
                }
            }
        }
    }

    protected void onBeforeCreatePSModel(PSModelDSLCompileSession session,
                                         IPSModelDSLNode node, IEntityDTO entity)
            throws Throwable {
    }

    protected void onBeforeUpdatePSModel(PSModelDSLCompileSession session,
                                         IPSModelDSLNode node, IEntityDTO entity)
            throws Throwable {
    }

    @Override
    public void exportPSModelDSLNodes(PSModelDSLExportSession session,
                                      List<? extends IEntityDTO> entities) {
        Assert.notEmpty(entities, "\u672a\u4f20\u5165\u5bfc\u51fa\u6570\u636e\u5217\u8868");
        try {
            onExportPSModelDSLNodes(session, entities);
        } catch (Throwable ex) {
            ModelRTAddinException.rethrow((IModelRTAddin) this, ex);
            throw new ModelRTAddinException((IModelRuntime) getSysUtilRuntime(),
                    (IModelRTAddin) this, ex.getMessage(), ex);
        }
    }

    protected void onExportPSModelDSLNodes(PSModelDSLExportSession session,
                                           List<? extends IEntityDTO> entities)
            throws Throwable {
        for (IEntityDTO entity : entities) {
            exportPSModelDSLNode(session, entity);
        }
    }

    protected void exportPSModelDSLNode(PSModelDSLExportSession session,
                                        IEntityDTO entity) throws Throwable {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        String id = entity.getString(
                getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), null);
        if (StringUtils.hasLength(id)) {
            map.put("id", id);
        }
        boolean noId = entity.getBoolean("_noid", false);
        if (noId) {
            map.put("_noid", 1);
        }
        boolean nested = entity.getBoolean("_nested", false);
        if (nested) {
            map.put("_nested", 1);
        }
        if (getDataEntityRuntime().getMajorPSDEField() != null) {
            String name = entity.getString(
                    getDataEntityRuntime().getMajorPSDEField().getLowerCaseName(), null);
            if (StringUtils.hasLength(name)) {
                map.put("name", name);
            }
        }
        String codeName = entity.getString("codename", null);
        if (StringUtils.hasLength(codeName)) {
            map.put("codename", codeName);
        }

        IDEMethodDTORuntime dtoRuntime = entity.getDEMethodDTORuntime();
        if (dtoRuntime != null) {
            List<IPSDEMethodDTOField> fields = dtoRuntime.getPSDEMethodDTOFields();
            for (IPSDEMethodDTOField dtoField : fields) {
                String type = dtoField.getType();
                Object value = entity.get(dtoField.getName());
                if (ObjectUtils.isEmpty(value)
                        || !PSModelEnums.DEMethodDTOFieldType.SIMPLE.value.equals(type)) {
                    continue;
                }
                IPSDEField field = dtoField.getPSDEField();
                if (field == null || field.isKeyDEField() || field.isMajorDEField()
                        || IGNORE_DUMP_FIELDS.containsKey(field.getLowerCaseName())) {
                    continue;
                }
                if (dtoField.getRelatedPSDEMethodDTOField() != null) {
                    field = dtoField.getRelatedPSDEMethodDTOField().getPSDEFieldMust();
                }
                if (!field.isPhisicalDEField() || field instanceof IPSPickupDataDEField) {
                    continue;
                }
                if (field instanceof IPSPickupDEField) {
                    IPSPickupDEField pickupField = (IPSPickupDEField) field;
                    if ("PSSYSTEMID".equals(pickupField.getName())) {
                        continue;
                    }
                    IPSDER1N relation = (IPSDER1N) pickupField.getPSDERMust();
                    IDataEntityRuntime refRuntime = (IDataEntityRuntime) getDataEntityRuntime()
                            .getSystemRuntime()
                            .getDataEntityRuntime(
                                    relation.getMajorPSDataEntityMust().getId(), false);
                    if (!session.shouldExportPSModel(refRuntime.getName())) {
                        continue;
                    }
                    String newValue = String.valueOf(value);
                    if (relation.getTempDataOrder() >= 0
                            && !StringUtils.hasLength(newValue = session.getNestedPSModelDSLId(
                                    refRuntime.getName(), value, true))) {
                        newValue = String.valueOf(value);
                    }
                    if (session.getParent() != null
                            && session.getParent().getNodeName()
                                    .equals(refRuntime.getModelDSLNodeName())
                            && newValue.equals(session.getParent().getId())) {
                        continue;
                    }
                    if (session.getParent() != null && session.getParent().isNested()) {
                        boolean ignore = false;
                        for (IPSModelDSLNode parentNode = session.getParent().getParent();
                             parentNode != null; parentNode = parentNode.getParent()) {
                            if (!parentNode.isNested()) {
                                String realId = session.getNestedPSModelDSLId(
                                        parentNode.getPSModelName(), parentNode.getId(), true);
                                if (!NESTEDROOTID.equalsIgnoreCase(realId)
                                        || !parentNode.getNodeName()
                                                .equals(refRuntime.getModelDSLNodeName())
                                        || !parentNode.getId().equals(value)) {
                                    break;
                                }
                                ignore = true;
                                break;
                            }
                            if (parentNode.getNodeName().equals(refRuntime.getModelDSLNodeName())
                                    && newValue.equals(parentNode.getId())) {
                                ignore = true;
                                break;
                            }
                        }
                        if (ignore) {
                            continue;
                        }
                    }
                    if (PSModels.isConfigInstDataEntity(refRuntime.getName())) {
                        map.put(dtoField.getLowerCaseName(), value);
                        continue;
                    }
                    if (!PSModels.isModelInstDataEntity(refRuntime.getName())) {
                        continue;
                    }
                    try {
                        if (relation.getTempDataOrder() >= 0) {
                            String nestedId = session.getNestedPSModelDSLId(
                                    refRuntime.getName(), value, true);
                            if (NESTEDROOTID.equalsIgnoreCase(nestedId)) {
                                continue;
                            }
                            if (StringUtils.hasLength(nestedId)) {
                                map.put(dtoField.getLowerCaseName(), nestedId);
                                continue;
                            }
                            map.put(dtoField.getLowerCaseName(), String.valueOf(value));
                            continue;
                        }
                        IEntityDTO refEntity = session.getPSModelData(
                                refRuntime.getName(), String.valueOf(value), true);
                        if (refEntity == null) {
                            refEntity = refRuntime.getSessionEntityIf(String.valueOf(value));
                        }
                        String realRefId = refRuntime.getFullModelTag(refEntity);
                        map.put(dtoField.getLowerCaseName(), realRefId);
                        session.setPSModelData(refRuntime.getName(),
                                DSLID_PREFIX + realRefId, refEntity, false);
                        continue;
                    } catch (Throwable ex) {
                        throw new Exception(String.format(
                                "\u8f6c\u6362\u5f15\u7528\u6570\u636e[%1$s][%2$s]DSL\u552f\u4e00\u6807\u8bc6\u53d1\u751f\u5f02\u5e38\uff0c%3$s",
                                refRuntime.getName(), value, ex.getMessage()), ex);
                    }
                }
                String tag = String.format("%1$s.%2$s",
                        getDataEntityRuntime().getName(),
                        dtoField.getLowerCaseName()).toUpperCase();
                String ignoredValue = IGNORE_DUMP_DE_FIELDS.get(tag);
                if (ignoredValue != null
                        && (ignoredValue.length() == 0 || ignoredValue.equals(value.toString()))) {
                    continue;
                }
                if (dtoField.getPSDEField() != null
                        && StringUtils.hasLength(dtoField.getPSDEField().getUserTag4())) {
                    map.put(dtoField.getPSDEField().getUserTag4().toLowerCase(), value);
                    continue;
                }
                map.put(dtoField.getLowerCaseName(), value);
            }
        }

        PSModelDSLNode node = new PSModelDSLNode(session.getParent(),
                getDataEntityRuntime().getModelDSLNodeName(), map, entity);
        session.setPSModelDSLNode(getDataEntityRuntime().getName(),
                entity.get(getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()), node);
        exportNestedPSModelDSLNodes(session, node, entity);
        exportPSModelDSLNodes(session, node, entity);
    }

    protected void exportNestedPSModelDSLNodes(PSModelDSLExportSession session,
                                               IPSModelDSLNode node,
                                               IEntityDTO entity) throws Throwable {
        IDEMethodDTORuntime dtoRuntime = entity.getDEMethodDTORuntime();
        if (dtoRuntime == null) {
            return;
        }
        List<IDEMethodDTORuntime> nestedRuntimes = dtoRuntime.getNestedDEMethodDTORuntimes();
        if (ObjectUtils.isEmpty(nestedRuntimes)) {
            return;
        }
        try {
            session.pushParent(node);
            ArrayList<IPSDEMethodDTOField> outputFields = new ArrayList<>();
            List<IPSDEMethodDTOField> fields = dtoRuntime.getPSDEMethodDTOFields();
            for (IPSDEMethodDTOField dtoField : fields) {
                String type = dtoField.getType();
                Object value = entity.get(dtoField.getName());
                if (ObjectUtils.isEmpty(value)
                        || !PSModelEnums.DEMethodDTOFieldType.DTOS.value.equals(type)
                        || !(dtoField.getPSDER() instanceof IPSDER1NBase)) {
                    continue;
                }
                outputFields.add(dtoField);
            }
            if (!ObjectUtils.isEmpty(outputFields)) {
                Collections.sort(outputFields, new Comparator<IPSDEMethodDTOField>() {
                    @Override
                    public int compare(IPSDEMethodDTOField first,
                                       IPSDEMethodDTOField second) {
                        IPSDER1NBase firstDER = (IPSDER1NBase) first.getPSDER();
                        IPSDER1NBase secondDER = (IPSDER1NBase) second.getPSDER();
                        return Integer.valueOf(secondDER.getRemoveOrder())
                                .compareTo(firstDER.getRemoveOrder());
                    }
                });
                for (IPSDEMethodDTOField dtoField : outputFields) {
                    Object value = entity.get(dtoField.getName());
                    if (isAutoOrderValue(dtoField.getPSDERMust()
                            .getMinorPSDataEntityMust().getName())) {
                        for (Object item : (List<?>) value) {
                            ((IEntityDTO) item).reset("ordervalue");
                        }
                    }
                    exportNestedPSModelDSLNodes(session, dtoField.getPSDERMust(),
                            (List<? extends IEntityDTO>) value);
                }
            }
        } finally {
            session.pollParent();
        }
    }

    protected void exportPSModelDSLNodes(PSModelDSLExportSession session,
                                         IPSModelDSLNode node,
                                         IEntityDTO entity) throws Throwable {
        try {
            session.pushParent(node);
            session.setNestedMode(false);
            List<IPSDERBase> relations = getDataEntityRuntime().getPSDataEntity()
                    .getMajorPSDERs();
            if (!ObjectUtils.isEmpty(relations)) {
                for (IPSDERBase relation : relations) {
                    if (!(relation instanceof IPSDER1N)
                            || ((IPSDER1N) relation).getCustomExportOrder2() <= 0) {
                        continue;
                    }
                    IPSDER1N der1n = (IPSDER1N) relation;
                    String fieldName = Inflector.getInstance()
                            .pluralize(der1n.getMinorPSDataEntity().getCodeName())
                            .toLowerCase();
                    Object data = entity.get("_" + fieldName);
                    if (!(data instanceof List) || ObjectUtils.isEmpty(data)) {
                        continue;
                    }
                    exportPSModelDSLNodes(session, relation, (List) data);
                }
            }
        } finally {
            session.pollParent();
        }
    }

    protected void exportNestedPSModelDSLNodes(PSModelDSLExportSession session,
                                               IPSDERBase relation,
                                               List<? extends IEntityDTO> entities)
            throws Throwable {
        getSysUtilRuntime().exportPSModelDSLNodes(
                relation.getMinorPSDataEntityMust().getName(), session, entities);
    }

    protected void exportPSModelDSLNodes(PSModelDSLExportSession session,
                                         IPSDERBase relation,
                                         List<? extends IEntityDTO> entities)
            throws Throwable {
        getSysUtilRuntime().exportPSModelDSLNodes(
                relation.getMinorPSDataEntityMust().getName(), session, entities);
    }

    @Override
    public void prepareExportPSModelDSLNodes(PSModelDSLExportSession session,
                                             List<? extends IEntityDTO> entities) {
        Assert.notEmpty(entities, "\u672a\u4f20\u5165\u5bfc\u51fa\u6570\u636e\u5217\u8868");
        try {
            onPrepareExportPSModelDSLNodes(session, entities);
        } catch (Throwable ex) {
            ModelRTAddinException.rethrow((IModelRTAddin) this, ex);
            throw new ModelRTAddinException((IModelRuntime) getSysUtilRuntime(),
                    (IModelRTAddin) this, ex.getMessage(), ex);
        }
    }

    protected void onPrepareExportPSModelDSLNodes(PSModelDSLExportSession session,
                                                  List<? extends IEntityDTO> entities)
            throws Throwable {
        for (IEntityDTO entity : entities) {
            prepareExportPSModelDSLNode(session, entity);
        }
    }

    protected void prepareExportPSModelDSLNode(PSModelDSLExportSession session,
                                               IEntityDTO entity) throws Throwable {
        boolean removeId = true;
        if (session.isNestedMode()) {
            List<IPSDERBase> relations = getDataEntityRuntime().getPSDataEntity()
                    .getMajorPSDERs();
            if (!ObjectUtils.isEmpty(relations)) {
                for (IPSDERBase relation : relations) {
                    if ((relation instanceof IPSDER1N
                            && ((IPSDER1N) relation).getCustomExportOrder2() > 0)
                            || relation.getMinorPSDataEntityMust().getId()
                                    .equals(getDataEntityRuntime().getId())) {
                        continue;
                    }
                    removeId = false;
                    break;
                }
            }
            String id;
            if (!removeId && StringUtils.hasLength(id = entity.getString(
                    getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), null))) {
                String newId = entity.getString("codename", null);
                if (!StringUtils.hasLength(newId)
                        && getDataEntityRuntime().getMajorPSDEField() != null
                        && StringUtils.hasLength(newId = entity.getString(
                                getDataEntityRuntime().getMajorPSDEField()
                                        .getLowerCaseName(), null))
                        && !codeNamePattern.matcher(newId).matches()) {
                    newId = null;
                }
                if (StringUtils.hasLength(newId) && !newId.equals(id)) {
                    entity.set(getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(),
                            newId);
                    session.setNestedPSModelDSLId(
                            getDataEntityRuntime().getName(), id, newId);
                }
            }
        } else {
            String key = entity.getString(
                    getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), null);
            if (StringUtils.hasLength(key)) {
                session.setPSModelData(getDataEntityRuntime().getName(), key, entity, false);
                if (key.indexOf(DSLTEMPID_PREFIX) == 0) {
                    ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
                    String cacheTag = String.format(
                            "_GETFULLMODELTAGENTITY__%1$s__%2$s__%3$s",
                            getDataEntityRuntime().getId(), PSDevSlnSysIdHolder.peek(), key);
                    actionSession.setActionParam(cacheTag, entity);
                }
            }
        }
        if (removeId) {
            entity.set("_noid", 1);
        }

        IDEMethodDTORuntime dtoRuntime = entity.getDEMethodDTORuntime();
        if (dtoRuntime == null) {
            return;
        }
        List<IDEMethodDTORuntime> nestedRuntimes = dtoRuntime.getNestedDEMethodDTORuntimes();
        if (!ObjectUtils.isEmpty(nestedRuntimes)) {
            boolean nestedMode = session.isNestedMode();
            if (!nestedMode) {
                String id = entity.getString(
                        getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), null);
                session.setNestedPSModelDSLId(
                        getDataEntityRuntime().getName(), id, NESTEDROOTID);
            }
            try {
                session.setNestedMode(true);
                ArrayList<IPSDEMethodDTOField> outputFields = new ArrayList<>();
                List<IPSDEMethodDTOField> fields = dtoRuntime.getPSDEMethodDTOFields();
                for (IPSDEMethodDTOField dtoField : fields) {
                    Object value = entity.get(dtoField.getName());
                    if (ObjectUtils.isEmpty(value)
                            || !PSModelEnums.DEMethodDTOFieldType.DTOS.value
                                    .equals(dtoField.getType())
                            || !(dtoField.getPSDER() instanceof IPSDER1NBase)) {
                        continue;
                    }
                    outputFields.add(dtoField);
                }
                for (IPSDEMethodDTOField dtoField : outputFields) {
                    prepareExportNestedPSModelDSLNodes(session,
                            dtoField.getPSDERMust(),
                            (List<? extends IEntityDTO>) entity.get(dtoField.getName()));
                }
            } finally {
                session.setNestedMode(nestedMode);
            }
        }

        boolean nestedMode = session.isNestedMode();
        try {
            session.setNestedMode(false);
            List<IPSDERBase> relations = getDataEntityRuntime().getPSDataEntity()
                    .getMajorPSDERs();
            if (!ObjectUtils.isEmpty(relations)) {
                for (IPSDERBase relation : relations) {
                    if (!(relation instanceof IPSDER1N)
                            || ((IPSDER1N) relation).getCustomExportOrder2() <= 0) {
                        continue;
                    }
                    IPSDER1N der1n = (IPSDER1N) relation;
                    String fieldName = Inflector.getInstance()
                            .pluralize(der1n.getMinorPSDataEntity().getCodeName())
                            .toLowerCase();
                    Object data = entity.get("_" + fieldName);
                    if (!(data instanceof List) || ObjectUtils.isEmpty(data)) {
                        continue;
                    }
                    prepareExportPSModelDSLNodes(session, relation, (List) data);
                }
            }
        } finally {
            session.setNestedMode(nestedMode);
        }
    }

    protected void prepareExportNestedPSModelDSLNodes(PSModelDSLExportSession session,
                                                      IPSDERBase relation,
                                                      List<? extends IEntityDTO> entities)
            throws Throwable {
        for (IEntityDTO entity : entities) {
            entity.set("_nested", 1);
        }
        getSysUtilRuntime().prepareExportPSModelDSLNodes(
                relation.getMinorPSDataEntityMust().getName(), session, entities);
    }

    protected void prepareExportPSModelDSLNodes(PSModelDSLExportSession session,
                                                IPSDERBase relation,
                                                List<? extends IEntityDTO> entities)
            throws Throwable {
        getSysUtilRuntime().prepareExportPSModelDSLNodes(
                relation.getMinorPSDataEntityMust().getName(), session, entities);
    }

    protected boolean isAutoOrderValue(String modelName) {
        return AUTO_ORDER_VALUE_DES.containsKey(modelName);
    }

    static {
        IGNORE_DUMP_FIELDS.put("codename", "");
        IGNORE_DUMP_FIELDS.put("createdate", "");
        IGNORE_DUMP_FIELDS.put("createman", "");
        IGNORE_DUMP_FIELDS.put("updatedate", "");
        IGNORE_DUMP_FIELDS.put("updateman", "");
        IGNORE_DUMP_FIELDS.put("dynamodelflag", "");

        IGNORE_DUMP_DE_FIELDS.put("PSDEUIACTION.ITEMOBJ", "");
        IGNORE_DUMP_DE_FIELDS.put("PSACHANDLER.HANDLEROBJ", "");
        IGNORE_DUMP_DE_FIELDS.put("PSACHANDLER.HANDLEROBJ2", "");
        IGNORE_DUMP_DE_FIELDS.put("PSDEFORMDETAIL.COLMODEL", "");
        IGNORE_DUMP_DE_FIELDS.put("PSDEFORMDETAIL.EDITORTYPENAME", "");
        IGNORE_DUMP_DE_FIELDS.put("PSDEFORMDETAIL.MODELSTATE", "0");
        IGNORE_DUMP_DE_FIELDS.put("PSDEFORM.DYNASYSREFMODE", "0");
        IGNORE_DUMP_DE_FIELDS.put("PSSYSDYNAMODEL.DEFAULTFLAG", "0");
        IGNORE_DUMP_DE_FIELDS.put("PSDEFIELD.VALIDFLAG", "");
        IGNORE_DUMP_DE_FIELDS.put("PSDEFIELD.TABLENAME", "");
        IGNORE_DUMP_DE_FIELDS.put("PSDEFIELD.FKEY", "");
        IGNORE_DUMP_DE_FIELDS.put("PSDATAENTITY.VALIDFLAG", "");
        IGNORE_DUMP_DE_FIELDS.put("PSCODELIST.VALIDFLAG", "");
        IGNORE_DUMP_DE_FIELDS.put("PSDER.VALIDFLAG", "");
        IGNORE_DUMP_DE_FIELDS.put("PSDEDRITEM.VIEWPSDEID", "");
        IGNORE_DUMP_DE_FIELDS.put("PSLANGUAGERES.PSDEID", "");
        IGNORE_DUMP_DE_FIELDS.put("PSLANGUAGERES.PSSYSAPPID", "");
        IGNORE_DUMP_DE_FIELDS.put("PSLANGUAGERES.PSWFVERSIONID", "");
        IGNORE_DUMP_DE_FIELDS.put("PSLANGUAGERES.PSWFID", "");
        IGNORE_DUMP_DE_FIELDS.put("PSLANGUAGERES.PSDEVIEWBASEID", "");
        IGNORE_DUMP_DE_FIELDS.put("PSLANGUAGERES.PSAPPVIEWID", "");
        IGNORE_DUMP_DE_FIELDS.put("PSLANGUAGERES.PSDEFID", "");

        PARAM_PREFIXES.put("PSMODULE", "mod");
        PARAM_PREFIXES.put("PSDATAENTITY", "de");

        AUTO_ORDER_VALUE_DES.put("PSAPPMENUITEM", "");
        AUTO_ORDER_VALUE_DES.put("PSAPPPVPART", "");
        AUTO_ORDER_VALUE_DES.put("PSDEDQCOND", "");
        AUTO_ORDER_VALUE_DES.put("PSDEDQJOIN", "");
        AUTO_ORDER_VALUE_DES.put("PSDEDSDQ", "");
        AUTO_ORDER_VALUE_DES.put("PSDEFDLOGIC", "");
        AUTO_ORDER_VALUE_DES.put("PSDEFIVR", "");
        AUTO_ORDER_VALUE_DES.put("PSDEFORMDETAIL", "");
        AUTO_ORDER_VALUE_DES.put("PSDEFVRCOND", "");
        AUTO_ORDER_VALUE_DES.put("PSDEGEIVR", "");
        AUTO_ORDER_VALUE_DES.put("PSDEGRIDCOL", "");
        AUTO_ORDER_VALUE_DES.put("PSDELLCOND", "");
        AUTO_ORDER_VALUE_DES.put("PSDELNPARAM", "");
        AUTO_ORDER_VALUE_DES.put("PSDETBITEM", "");
        AUTO_ORDER_VALUE_DES.put("PSDEVIEWCTRL", "");
        AUTO_ORDER_VALUE_DES.put("PSPANELITEMLOGIC", "");
        AUTO_ORDER_VALUE_DES.put("PSSYSDBPART", "");
        AUTO_ORDER_VALUE_DES.put("PSSYSVIEWPANELITEM", "");
        AUTO_ORDER_VALUE_DES.put("PSWFLINKCOND", "");

        codeNamePattern = Pattern.compile("[a-zA-Z_$][a-zA-Z0-9_$]*");
    }
}