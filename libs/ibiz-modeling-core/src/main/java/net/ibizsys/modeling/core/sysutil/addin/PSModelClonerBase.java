package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSInheritDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupObjectDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.modeling.core.addin.IPSModelCloner;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.modeling.core.util.PSModelCopySession;
import net.ibizsys.modeling.core.util.PSModelPasteSession;
import net.ibizsys.modeling.core.util.domain.CopyModelInput;
import net.ibizsys.modeling.core.util.domain.CopyModelResult;
import net.ibizsys.modeling.core.util.domain.PasteModelInput;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.plugin.IModelRTAddin;
import net.ibizsys.runtime.plugin.ModelRTAddinException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public abstract class PSModelClonerBase extends ModelEnhancerSysUtilRTAddinBase
        implements IPSModelCloner {

    public static final String DTOFIELD_CHILDREN = "_children";
    public static final String DTOFIELD_INNER = "_inner";
    public static final String DTOFIELD_REPLACE = "_replace";
    public static final String REPLACE_RESET = "__RESET__";

    @Override
    public Object copy(Object[] args) {
        Assert.notEmpty(args, "未传入参数");
        try {
            if (args[0] instanceof CopyModelInput) {
                CopyModelInput input = (CopyModelInput) args[0];
                if (input.getDEMethodDTORuntime() == null) {
                    throw new Exception("传入参数运行时对象无效");
                }
                if (!StringUtils.hasLength(input.getKey())) {
                    throw new Exception("传入参数键值无效");
                }
                return onCopy(input, args);
            }
            throw new Exception(String.format("无法识别的传入参数[%1$s]", args));
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            ModelRTAddinException.rethrow((IModelRTAddin) this, ex);
            throw new ModelRTAddinException((IModelRuntime) getSysUtilRuntime(), this,
                    String.format("拷贝发生异常，%s", ex.getMessage()), ex);
        }
    }

    protected Object onCopy(CopyModelInput input, Object[] args) throws Throwable {
        IEntityDTO entity;
        PSModelCopySession session = createPSModelCopySession(input, args);
        String modelType = input.getDEMethodDTORuntime().getDataEntityRuntime().getName();
        entity = input.getDEMethodDTORuntime().getDataEntityRuntime().get(input.getKey());
        IEntityDTO root = entity;
        session.setPSModelData(modelType, input.getKey(), entity, false);
        while ((entity = session.pollClonePSModelData()) != null) {
            doPrepareCopy(session, entity, false, entity == root);
            doCopy(session, entity, false);
        }
        session.resetPSModelData(modelType, input.getKey(), root, false);

        CopyModelResult result = new CopyModelResult();
        result.setModelType(modelType);
        String currentScope = String.format("%1$s#%2$s", modelType, input.getKey());
        Map<String, Map<Object, IEntityDTO>> modelData = session.getPSModelData(false);
        LinkedHashMap<String, ArrayList<IEntityDTO>> requires = new LinkedHashMap<>();
        for (Map<Object, IEntityDTO> items : modelData.values()) {
            for (IEntityDTO item : items.values()) {
                IDataEntityRuntime runtime = (IDataEntityRuntime) item.getDEMethodDTORuntime()
                        .getDataEntityRuntime();
                String scope = runtime.getModelScope(item);
                if (StringUtils.hasLength(scope)) {
                    IEntityDTO parent;
                    if (currentScope.equals(scope)) {
                        appendChild(root, runtime.getName(), item);
                        continue;
                    }
                    String[] parts = scope.split("[#]");
                    Map<Object, IEntityDTO> parentItems = modelData.get(parts[0]);
                    if (parentItems != null && (parent = parentItems.get(parts[1])) != null) {
                        appendChild(parent, runtime.getName(), item);
                        continue;
                    }
                }
                requires.computeIfAbsent(runtime.getName(), key -> new ArrayList<>()).add(item);
            }
        }
        result.setModel(WebClientBase.OUTMAPPER.convertValue(root, ObjectNode.class));
        result.setRequires(WebClientBase.OUTMAPPER.convertValue(requires, ObjectNode.class));
        return result;
    }

    @SuppressWarnings("unchecked")
    protected void appendChild(IEntityDTO parent, String modelName, IEntityDTO child) {
        LinkedHashMap<String, ArrayList<IEntityDTO>> children =
                (LinkedHashMap<String, ArrayList<IEntityDTO>>) parent.get(DTOFIELD_CHILDREN);
        if (children == null) {
            children = new LinkedHashMap<>();
            parent.set(DTOFIELD_CHILDREN, children);
        }
        children.computeIfAbsent(modelName, key -> new ArrayList<>()).add(child);
    }

    protected PSModelCopySession createPSModelCopySession(CopyModelInput input, Object[] args)
            throws Throwable {
        return new PSModelCopySession(input);
    }

    protected void doPrepareCopy(PSModelCopySession session, IEntityDTO entity, boolean inner,
                                 boolean cloneRelations) throws Throwable {
        if (entity.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format("数据[%1$s]未指定运行时对象", entity));
        }
        net.ibizsys.central.dataentity.IDataEntityRuntime runtime =
                entity.getDEMethodDTORuntime().getDataEntityRuntime();
        Object key = entity.get(runtime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            throw new Exception(String.format("模型[%1$s]数据[%2$s]未指定键值",
                    runtime.getName(), entity));
        }
        session.setPSModelData(runtime.getName(), key, entity, inner);
        if (inner) {
            entity.set(runtime.getKeyPSDEField().getLowerCaseName(), KeyValueUtils.genUniqueId());
        }
        List<IPSDEMethodDTOField> fields = entity.getDEMethodDTORuntime().getPSDEMethodDTOFields();
        if (!ObjectUtils.isEmpty(fields)) {
            for (IPSDEMethodDTOField field : fields) {
                Object value = entity.get(field.getLowerCaseName());
                if (ObjectUtils.isEmpty(value)) {
                    continue;
                }
                IPSDEField psdeField = field.getPSDEField();
                if (!isNestedDTOField(field, psdeField)) {
                    continue;
                }
                for (Object item : values(value)) {
                    if (item instanceof IEntityDTO) {
                        doPrepareCopy(session, (IEntityDTO) item, true, false);
                    }
                }
            }
        }
        if (cloneRelations && !ObjectUtils.isEmpty(runtime.getClonePSDER1Ns())) {
            for (IPSDER1NBase relation : runtime.getClonePSDER1Ns()) {
                net.ibizsys.central.dataentity.IDataEntityRuntime minorRuntime =
                        getSystemRuntime().getDataEntityRuntime(
                                relation.getMinorPSDataEntityMust().getId());
                List<?> items = minorRuntime.selectByDER1N(relation, key);
                if (!ObjectUtils.isEmpty(items)) {
                    for (Object item : items) {
                        if (item instanceof IEntityDTO) {
                            doPrepareCopy(session, (IEntityDTO) item, false, true);
                        }
                    }
                }
            }
        }
    }

    protected void doCopy(PSModelCopySession session, IEntityDTO entity, boolean inner)
            throws Throwable {
        if (entity.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format("数据[%1$s]未指定运行时对象", entity));
        }
        net.ibizsys.central.dataentity.IDataEntityRuntime runtime =
                entity.getDEMethodDTORuntime().getDataEntityRuntime();
        Object key = entity.get(runtime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            throw new Exception(String.format("模型[%1$s]数据[%2$s]未指定键值",
                    runtime.getName(), entity));
        }
        session.pushParentPSModelData(entity);
        ISystemRuntime systemRuntime = entity.getDEMethodDTORuntime().getSystemRuntime();
        List<IPSDEMethodDTOField> fields = entity.getDEMethodDTORuntime().getPSDEMethodDTOFields();
        if (!ObjectUtils.isEmpty(fields)) {
            for (IPSDEMethodDTOField field : fields) {
                Object value = entity.get(field.getLowerCaseName());
                if (ObjectUtils.isEmpty(value)) {
                    continue;
                }
                IPSDEField psdeField = field.getPSDEField();
                if (psdeField != null) {
                    if (psdeField instanceof IPSInheritDEField) {
                        psdeField = ((IPSInheritDEField) psdeField).getRelatedPSDEFieldMust();
                    }
                    if (psdeField instanceof IPSPickupDEField) {
                        IPSPickupDEField pickupField = (IPSPickupDEField) psdeField;
                        if (!(pickupField.getPSDERMust() instanceof IPSDER1N)) {
                            continue;
                        }
                        IPSDER1N relation = (IPSDER1N) pickupField.getPSDERMust();
                        String majorName = relation.getMajorPSDataEntityMust().getName();
                        if (session.isParentPSModelData(majorName, value)) {
                            entity.reset(field.getLowerCaseName());
                            continue;
                        }
                        if (!session.isClonePSModel(majorName)) {
                            continue;
                        }
                        net.ibizsys.central.dataentity.IDataEntityRuntime majorRuntime =
                                systemRuntime.getDataEntityRuntime(majorName);
                        IEntityDTO parent = session.getPSModelData(majorName, value, true);
                        if (parent == null) {
                            try {
                                parent = majorRuntime.get(value);
                                session.setPSModelData(majorName, value, parent, false);
                                continue;
                            } catch (Throwable ex) {
                                throw new Exception(String.format("获取模型[%1$s]数据[%2$s]发生异常，%3$s",
                                        majorName, value, ex.getMessage()), ex);
                            }
                        }
                        Object newKey = parent.get(majorRuntime.getKeyPSDEField().getLowerCaseName());
                        if (newKey != null && !value.equals(newKey)) {
                            entity.set(field.getLowerCaseName(), newKey);
                        }
                        continue;
                    }
                    if (psdeField instanceof IPSLinkDEField) {
                        entity.reset(field.getLowerCaseName());
                        continue;
                    }
                }
                if (!isNestedDTOField(field, psdeField)) {
                    continue;
                }
                for (Object item : values(value)) {
                    if (item instanceof IEntityDTO) {
                        doCopy(session, (IEntityDTO) item, true);
                    }
                }
            }
        }
        if (session.pollParentPSModelData() != entity) {
            throw new Exception("退出父模型数据不正确");
        }
    }

    protected boolean isNestedDTOField(IPSDEMethodDTOField field, IPSDEField psdeField) {
        return ("DTO".equals(field.getType()) || "DTOS".equals(field.getType()))
                && field.getRefPSDataEntity() != null
                && !("DTO".equals(field.getType()) && psdeField instanceof IPSPickupObjectDEField);
    }

    protected Collection<?> values(Object value) {
        if (value instanceof List) {
            return (List<?>) value;
        }
        if (value instanceof Map) {
            return ((Map<?, ?>) value).values();
        }
        return java.util.Collections.emptyList();
    }

    @Override
    public Object paste(Object[] args) {
        Assert.notEmpty(args, "未传入参数");
        try {
            if (args[0] instanceof PasteModelInput) {
                PasteModelInput input = (PasteModelInput) args[0];
                if (input.getDEMethodDTORuntime() == null) {
                    throw new Exception("传入参数运行时对象无效");
                }
                if (input.getModel() == null) {
                    throw new Exception("传入参数粘贴模型无效");
                }
                return onPaste(input, args);
            }
            throw new Exception(String.format("无法识别的传入参数[%1$s]", args));
        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            ModelRTAddinException.rethrow((IModelRTAddin) this, ex);
            throw new ModelRTAddinException((IModelRuntime) getSysUtilRuntime(), this,
                    String.format("粘贴发生异常，%s", ex.getMessage()), ex);
        }
    }

    protected Object onPaste(PasteModelInput input, Object[] args) throws Throwable {
        IEntityDTO entity;
        PSModelPasteSession session = createPSModelPasteSession(input, args);
        String modelType = input.getDEMethodDTORuntime().getDataEntityRuntime().getName();
        if (StringUtils.hasLength(input.getModelType())
                && !input.getModelType().equalsIgnoreCase(modelType)) {
            throw new Exception(String.format("粘贴模型[%1$s]与当前模型[%2$s]不一致",
                    input.getModelType(), modelType));
        }
        net.ibizsys.central.dataentity.IDataEntityRuntime runtime =
                input.getDEMethodDTORuntime().getDataEntityRuntime();
        entity = runtime.createEntity(JsonUtils.asMap(input.getModel()), true);
        Object key = runtime.getKeyFieldValue((IEntityBase) entity);
        session.setPSModelData(modelType, key, entity, false);
        doPreparePaste(session, entity, false, true);
        if (input.getRequires() != null) {
            doPreparePaste(session, null, input.getRequires(), false);
        }
        while ((entity = session.pollClonePSModelData()) != null) {
            doPaste(session, entity, false);
        }
        return session.getPastePSModelData(modelType, key, false);
    }

    protected PSModelPasteSession createPSModelPasteSession(PasteModelInput input, Object[] args)
            throws Throwable {
        return new PSModelPasteSession(input);
    }

    protected void doPreparePaste(PSModelPasteSession session, IEntityDTO parent,
                                  ObjectNode children, boolean cloneRelations) throws Throwable {
        Iterator<Map.Entry<String, com.fasterxml.jackson.databind.JsonNode>> fields =
                children.fields();
        while (fields.hasNext()) {
            Map.Entry<String, com.fasterxml.jackson.databind.JsonNode> field = fields.next();
            if (!(field.getValue() instanceof ArrayNode)) {
                continue;
            }
            net.ibizsys.central.dataentity.IDataEntityRuntime runtime =
                    getSystemRuntime().getDataEntityRuntime(field.getKey());
            ArrayNode array = (ArrayNode) field.getValue();
            for (int i = 0; i < array.size(); i++) {
                IEntityDTO entity = runtime.createEntity(JsonUtils.asMap(array.get(i)), true);
                doPreparePaste(session, entity, false, cloneRelations);
            }
        }
    }

    protected void doPreparePaste(PSModelPasteSession session, IEntityDTO entity, boolean inner,
                                  boolean cloneRelations) throws Throwable {
        if (entity.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format("数据[%1$s]未指定运行时对象", entity));
        }
        net.ibizsys.central.dataentity.IDataEntityRuntime runtime =
                entity.getDEMethodDTORuntime().getDataEntityRuntime();
        Object key = entity.get(runtime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            throw new Exception(String.format("模型[%1$s]数据[%2$s]未指定键值",
                    runtime.getName(), entity));
        }
        session.setPSModelData(runtime.getName(), key, entity, inner);
        if (inner) {
            entity.set(DTOFIELD_INNER, true);
        }
        List<IPSDEMethodDTOField> fields = entity.getDEMethodDTORuntime().getPSDEMethodDTOFields();
        if (!ObjectUtils.isEmpty(fields)) {
            for (IPSDEMethodDTOField field : fields) {
                Object value = entity.get(field.getLowerCaseName());
                if (ObjectUtils.isEmpty(value) || !isNestedDTOField(field, field.getPSDEField())) {
                    continue;
                }
                for (Object item : values(value)) {
                    if (item instanceof IEntityDTO) {
                        doPreparePaste(session, (IEntityDTO) item, true, false);
                    }
                }
            }
        }
        if (inner) {
            return;
        }
        Object children = entity.get(DTOFIELD_CHILDREN);
        if (children == null) {
            return;
        }
        entity.reset(DTOFIELD_CHILDREN);
        doPreparePaste(session, entity, JsonUtils.toObjectNode(children), cloneRelations);
    }

    protected IEntityDTO doPaste(PSModelPasteSession session, IEntityDTO entity, boolean inner)
            throws Throwable {
        if (entity.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format("数据[%1$s]未指定运行时对象", entity));
        }
        IDataEntityRuntime runtime = (IDataEntityRuntime) entity.getDEMethodDTORuntime()
                .getDataEntityRuntime();
        Object key = entity.get(runtime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            throw new Exception(String.format("模型[%1$s]数据[%2$s]未指定键值",
                    runtime.getName(), entity));
        }
        IEntityDTO pasted = session.getPastePSModelData(runtime.getName(), key, true);
        if (pasted != null) {
            return pasted;
        }
        String replace = entity.getString(DTOFIELD_REPLACE, null);
        if (!inner && StringUtils.hasLength(replace)) {
            if (REPLACE_RESET.equalsIgnoreCase(replace)) {
                return null;
            }
            try {
                pasted = runtime.get(replace);
                session.setPastePSModelData(runtime.getName(), key, pasted);
                return pasted;
            } catch (Throwable ex) {
                throw new Exception(String.format("获取模型[%1$s]数据[%2$s]发生异常，%3$s",
                        runtime.getName(), replace, ex.getMessage()), ex);
            }
        }
        session.pushParentPSModelData(entity);
        ISystemRuntime systemRuntime = entity.getDEMethodDTORuntime().getSystemRuntime();
        List<IPSDEMethodDTOField> fields = entity.getDEMethodDTORuntime().getPSDEMethodDTOFields();
        if (!ObjectUtils.isEmpty(fields)) {
            for (IPSDEMethodDTOField field : fields) {
                Object value = entity.get(field.getLowerCaseName());
                if (ObjectUtils.isEmpty(value)) {
                    continue;
                }
                IPSDEField psdeField = field.getPSDEField();
                if (psdeField != null) {
                    if (psdeField instanceof IPSInheritDEField) {
                        psdeField = ((IPSInheritDEField) psdeField).getRelatedPSDEFieldMust();
                    }
                    if (psdeField instanceof IPSPickupDEField) {
                        IPSPickupDEField pickupField = (IPSPickupDEField) psdeField;
                        if (!(pickupField.getPSDERMust() instanceof IPSDER1N)) {
                            continue;
                        }
                        IPSDER1N relation = (IPSDER1N) pickupField.getPSDERMust();
                        String majorName = relation.getMajorPSDataEntityMust().getName();
                        if (session.isParentPSModelData(majorName, value)) {
                            entity.reset(field.getLowerCaseName());
                            continue;
                        }
                        if (!session.isClonePSModel(majorName)) {
                            continue;
                        }
                        IEntityDTO parent = session.getPSModelData(majorName, value, true);
                        if (parent == null) {
                            throw new Exception(String.format("无法获取模型[%1$s]数据[%2$s]",
                                    majorName, value));
                        }
                        if (DataTypeUtils.asBoolean(parent.get(DTOFIELD_INNER), false)) {
                            continue;
                        }
                        IEntityDTO real = doPaste(session, parent, false);
                        if (real == null) {
                            entity.reset(field.getLowerCaseName());
                            continue;
                        }
                        net.ibizsys.central.dataentity.IDataEntityRuntime majorRuntime =
                                systemRuntime.getDataEntityRuntime(majorName);
                        entity.set(field.getLowerCaseName(),
                                real.get(majorRuntime.getKeyPSDEField().getLowerCaseName()));
                        continue;
                    }
                    if (psdeField instanceof IPSLinkDEField) {
                        entity.reset(field.getLowerCaseName());
                        continue;
                    }
                }
                if (!isNestedDTOField(field, psdeField)) {
                    continue;
                }
                for (Object item : values(value)) {
                    if (item instanceof IEntityDTO) {
                        doPaste(session, (IEntityDTO) item, true);
                    }
                }
            }
        }
        if (session.pollParentPSModelData() != entity) {
            throw new Exception("退出父模型数据不正确");
        }
        if (inner) {
            session.setPastePSModelData(runtime.getName(), key, entity);
            return entity;
        }
        pasted = runtime.createEntity();
        entity.copyTo((IEntity) pasted, true);
        pasted.reset(runtime.getKeyPSDEField().getLowerCaseName());
        try {
            IEntityDTO existing = runtime.pasteEntity(pasted);
            if (existing != null) {
                session.setPastePSModelData(runtime.getName(), key, existing);
                return existing;
            }
        } catch (Throwable ex) {
            throw new Exception(String.format("粘贴模型[%1$s]数据[%2$s]发生异常，%3$s",
                    runtime.getName(), pasted, ex.getMessage()), ex);
        }
        return null;
    }
}