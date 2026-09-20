package net.ibizsys.modeling.core.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSInheritDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupObjectDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * Translates nested model DTO keys for model import and export operations.
 */
public class PSModelTranslator {

    public static final String SEPARATOR = "_@_@_";

    public PSModelTranslateSession input(IEntityDTO entityDTO) throws Throwable {
        if (entityDTO == null || entityDTO.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format(
                    "\u6570\u636e[%1$s]\u672a\u6307\u5b9a\u8fd0\u884c\u65f6\u5bf9\u8c61",
                    entityDTO));
        }

        net.ibizsys.central.dataentity.IDataEntityRuntime dataEntityRuntime =
                entityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
        Object key = entityDTO.get(dataEntityRuntime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            throw new Exception(String.format(
                    "\u6a21\u578b[%1$s]\u6570\u636e[%2$s]\u672a\u6307\u5b9a\u952e\u503c",
                    dataEntityRuntime.getName(), entityDTO));
        }

        PSModelTranslateSession session =
                createPSModelTranslateSession(entityDTO, String.valueOf(key), true);
        session.setPSModelData(dataEntityRuntime.getName(), key, entityDTO, false);

        IEntityDTO current;
        while ((current = session.pollClonePSModelData()) != null) {
            doPrepareInput(session, current, false);
            doInput(session, current, false);
        }
        return session;
    }

    protected PSModelTranslateSession createPSModelTranslateSession(
            IEntityDTO entityDTO, String modelKey, boolean input) {
        return new PSModelTranslateSession(entityDTO, modelKey, input);
    }

    protected void doPrepareInput(PSModelTranslateSession session,
            IEntityDTO entityDTO, boolean inner) throws Throwable {
        if (entityDTO.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format(
                    "\u6570\u636e[%1$s]\u672a\u6307\u5b9a\u8fd0\u884c\u65f6\u5bf9\u8c61",
                    entityDTO));
        }

        net.ibizsys.central.dataentity.IDataEntityRuntime dataEntityRuntime =
                entityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
        Object key = entityDTO.get(dataEntityRuntime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            if (!inner) {
                throw new Exception(String.format(
                        "\u6a21\u578b[%1$s]\u6570\u636e[%2$s]\u672a\u6307\u5b9a\u952e\u503c",
                        dataEntityRuntime.getName(), entityDTO));
            }
            key = KeyValueUtils.genUniqueId();
            entityDTO.set(dataEntityRuntime.getKeyPSDEField().getLowerCaseName(), key);
        }

        session.setPSModelData(dataEntityRuntime.getName(), key, entityDTO, inner);
        if (inner) {
            String oldKey = String.valueOf(key);
            String partKey = oldKey.length() > 40
                    ? KeyValueUtils.genUniqueId(oldKey) : oldKey;
            String newKey = String.format("%1$s%2$s%3$s",
                    session.getModelKey(), SEPARATOR, partKey);
            entityDTO.set(dataEntityRuntime.getKeyPSDEField().getLowerCaseName(), newKey);
            entityDTO.set("srforikey", oldKey);

            ActionSession actionSession = ActionSessionManager.getCurrentSession();
            if (actionSession != null) {
                String cacheTag = String.format("_FILLENTITYFULLINFO_EXIST__%1$s__%2$s",
                        dataEntityRuntime.getPSDataEntity().getId(), newKey);
                actionSession.setActionParam(cacheTag, 1);
                cacheTag = String.format("_FILLENTITYFULLINFO__%1$s__%2$s",
                        dataEntityRuntime.getPSDataEntity().getId(), newKey);
                actionSession.setActionParam(cacheTag, entityDTO);
            }
        }

        List<IPSDEMethodDTOField> fields =
                entityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFields();
        if (ObjectUtils.isEmpty(fields)) {
            return;
        }
        for (IPSDEMethodDTOField dtoField : fields) {
            Object value = entityDTO.get(dtoField.getLowerCaseName());
            if (ObjectUtils.isEmpty(value)) {
                continue;
            }
            IPSDEField field = dtoField.getPSDEField();
            if (!isNestedDTOField(dtoField, field)) {
                continue;
            }
            Collection<?> children = getChildren(value);
            if (ObjectUtils.isEmpty(children)) {
                continue;
            }
            IEntityDTO referenceEntity = null;
            for (Object child : children) {
                if (!(child instanceof IEntityDTO)) {
                    continue;
                }
                IEntityDTO childDTO = (IEntityDTO) child;
                if (childDTO.getDEMethodDTORuntime() == null) {
                    if (referenceEntity == null) {
                        referenceEntity = dataEntityRuntime.getSystemRuntime()
                                .getDataEntityRuntime(dtoField.getRefPSDataEntity().getId())
                                .createEntity();
                    }
                    childDTO.setDEMethodDTORuntime(referenceEntity.getDEMethodDTORuntime());
                }
                doPrepareInput(session, childDTO, true);
            }
        }
    }

    protected void doInput(PSModelTranslateSession session,
            IEntityDTO entityDTO, boolean inner) throws Throwable {
        if (entityDTO.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format(
                    "\u6570\u636e[%1$s]\u672a\u6307\u5b9a\u8fd0\u884c\u65f6\u5bf9\u8c61",
                    entityDTO));
        }

        net.ibizsys.central.dataentity.IDataEntityRuntime dataEntityRuntime =
                entityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
        Object key = entityDTO.get(dataEntityRuntime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            throw new Exception(String.format(
                    "\u6a21\u578b[%1$s]\u6570\u636e[%2$s]\u672a\u6307\u5b9a\u952e\u503c",
                    dataEntityRuntime.getName(), entityDTO));
        }

        session.pushParentPSModelData(entityDTO);
        ISystemRuntime systemRuntime = entityDTO.getDEMethodDTORuntime().getSystemRuntime();
        List<IPSDEMethodDTOField> fields =
                entityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFields();
        if (!ObjectUtils.isEmpty(fields)) {
            for (IPSDEMethodDTOField dtoField : fields) {
                Object value = entityDTO.get(dtoField.getLowerCaseName());
                IPSDEField field = dtoField.getPSDEField();

                if (ObjectUtils.isEmpty(value)) {
                    if (field == null) {
                        continue;
                    }
                    if (field instanceof IPSInheritDEField) {
                        field = ((IPSInheritDEField) field).getRelatedPSDEFieldMust();
                    }
                    if (!(field instanceof IPSPickupDEField)
                            || !(((IPSPickupDEField) field).getPSDERMust() instanceof IPSDER1N)) {
                        continue;
                    }
                    IPSDER1N der = (IPSDER1N) ((IPSPickupDEField) field).getPSDERMust();
                    String parentName = der.getMajorPSDataEntityMust().getName();
                    if (!session.isClonePSModel(parentName)
                            || parentName.equals(dataEntityRuntime.getName())) {
                        continue;
                    }
                    net.ibizsys.central.dataentity.IDataEntityRuntime parentRuntime =
                            systemRuntime.getDataEntityRuntime(parentName);
                    IEntityDTO parentData = session.getParentPSModelData(parentName, true);
                    Object newKey = parentData == null ? null
                            : parentData.get(parentRuntime.getKeyPSDEField().getLowerCaseName());
                    if (newKey != null && !field.isAllowEmpty()) {
                        entityDTO.set(dtoField.getLowerCaseName(), newKey);
                    }
                    continue;
                }

                if (field != null) {
                    if (field instanceof IPSInheritDEField) {
                        field = ((IPSInheritDEField) field).getRelatedPSDEFieldMust();
                    }
                    if (field instanceof IPSPickupDEField) {
                        IPSPickupDEField pickupField = (IPSPickupDEField) field;
                        if (!(pickupField.getPSDERMust() instanceof IPSDER1N)) {
                            continue;
                        }
                        IPSDER1N der = (IPSDER1N) pickupField.getPSDERMust();
                        String parentName = der.getMajorPSDataEntityMust().getName();
                        if (!session.isClonePSModel(parentName)) {
                            continue;
                        }
                        net.ibizsys.central.dataentity.IDataEntityRuntime parentRuntime =
                                systemRuntime.getDataEntityRuntime(parentName);
                        IEntityDTO parentData = session.getPSModelData(parentName, value, true);
                        Object newKey = parentData == null ? null
                                : parentData.get(parentRuntime.getKeyPSDEField().getLowerCaseName());
                        if (newKey != null && !value.equals(newKey)) {
                            entityDTO.set(dtoField.getLowerCaseName(), newKey);
                        }
                        continue;
                    }
                    if (field instanceof IPSLinkDEField) {
                        if (inner) {
                            entityDTO.reset(dtoField.getLowerCaseName());
                        }
                        continue;
                    }
                }

                if (!isNestedDTOField(dtoField, field)) {
                    continue;
                }
                Collection<?> children = getChildren(value);
                if (ObjectUtils.isEmpty(children)) {
                    continue;
                }
                for (Object child : children) {
                    if (child instanceof IEntityDTO) {
                        doInput(session, (IEntityDTO) child, true);
                    }
                }
            }
        }

        if (session.pollParentPSModelData() != entityDTO) {
            throw new Exception("\u9000\u51fa\u7236\u6a21\u578b\u6570\u636e\u4e0d\u6b63\u786e");
        }
    }

    public PSModelTranslateSession output(IEntityDTO entityDTO) throws Throwable {
        if (entityDTO == null || entityDTO.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format(
                    "\u6570\u636e[%1$s]\u672a\u6307\u5b9a\u8fd0\u884c\u65f6\u5bf9\u8c61",
                    entityDTO));
        }
        net.ibizsys.central.dataentity.IDataEntityRuntime dataEntityRuntime =
                entityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
        Object key = entityDTO.get(dataEntityRuntime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            throw new Exception(String.format(
                    "\u6a21\u578b[%1$s]\u6570\u636e[%2$s]\u672a\u6307\u5b9a\u952e\u503c",
                    dataEntityRuntime.getName(), entityDTO));
        }

        PSModelTranslateSession session =
                createPSModelTranslateSession(entityDTO, String.valueOf(key), false);
        session.setPSModelData(dataEntityRuntime.getName(), key, entityDTO, false);
        doPrepareOutput(session, entityDTO, false);

        IEntityDTO current;
        while ((current = session.pollClonePSModelData()) != null) {
            doOutput(session, current, false);
        }
        return session;
    }

    protected void doPrepareOutput(PSModelTranslateSession session,
            IEntityDTO entityDTO, boolean inner) throws Throwable {
        if (entityDTO.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format(
                    "\u6570\u636e[%1$s]\u672a\u6307\u5b9a\u8fd0\u884c\u65f6\u5bf9\u8c61",
                    entityDTO));
        }

        net.ibizsys.central.dataentity.IDataEntityRuntime dataEntityRuntime =
                entityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
        Object key = entityDTO.get(dataEntityRuntime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            throw new Exception(String.format(
                    "\u6a21\u578b[%1$s]\u6570\u636e[%2$s]\u672a\u6307\u5b9a\u952e\u503c",
                    dataEntityRuntime.getName(), entityDTO));
        }

        session.setPSModelData(dataEntityRuntime.getName(), key, entityDTO, inner);
        if (inner) {
            String oldKey = String.valueOf(key);
            String[] parts = StringUtils.split(oldKey, SEPARATOR);
            if (parts == null) {
                parts = StringUtils.split(oldKey, "__");
            }
            String newKey = parts == null ? oldKey : parts[parts.length - 1];
            entityDTO.set(dataEntityRuntime.getKeyPSDEField().getLowerCaseName(), newKey);
            entityDTO.reset("createman");
            entityDTO.reset("createdate");
            entityDTO.reset("updateman");
            entityDTO.reset("updatedate");
        }

        List<IPSDEMethodDTOField> fields =
                entityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFields();
        if (ObjectUtils.isEmpty(fields)) {
            return;
        }
        for (IPSDEMethodDTOField dtoField : fields) {
            Object value = entityDTO.get(dtoField.getLowerCaseName());
            if (ObjectUtils.isEmpty(value)) {
                continue;
            }
            if (!isNestedDTOField(dtoField, dtoField.getPSDEField())) {
                continue;
            }
            Collection<?> children = getChildren(value);
            if (ObjectUtils.isEmpty(children)) {
                continue;
            }
            for (Object child : children) {
                if (child instanceof IEntityDTO) {
                    doPrepareOutput(session, (IEntityDTO) child, true);
                }
            }
        }
    }

    protected IEntityDTO doOutput(PSModelTranslateSession session,
            IEntityDTO entityDTO, boolean inner) throws Throwable {
        if (entityDTO.getDEMethodDTORuntime() == null) {
            throw new Exception(String.format(
                    "\u6570\u636e[%1$s]\u672a\u6307\u5b9a\u8fd0\u884c\u65f6\u5bf9\u8c61",
                    entityDTO));
        }

        net.ibizsys.central.dataentity.IDataEntityRuntime dataEntityRuntime =
                entityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
        Object key = entityDTO.get(dataEntityRuntime.getKeyPSDEField().getLowerCaseName());
        if (ObjectUtils.isEmpty(key)) {
            throw new Exception(String.format(
                    "\u6a21\u578b[%1$s]\u6570\u636e[%2$s]\u672a\u6307\u5b9a\u952e\u503c",
                    dataEntityRuntime.getName(), entityDTO));
        }

        IEntityDTO outputEntity = session.getOutputPSModelData(
                dataEntityRuntime.getName(), key, true);
        if (outputEntity != null) {
            return outputEntity;
        }
        session.setOutputPSModelData(dataEntityRuntime.getName(), key, entityDTO);
        session.pushParentPSModelData(entityDTO);

        ISystemRuntime systemRuntime = entityDTO.getDEMethodDTORuntime().getSystemRuntime();
        List<IPSDEMethodDTOField> fields =
                entityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFields();
        if (!ObjectUtils.isEmpty(fields)) {
            for (IPSDEMethodDTOField dtoField : fields) {
                Object value = entityDTO.get(dtoField.getLowerCaseName());
                if (ObjectUtils.isEmpty(value)) {
                    continue;
                }

                IPSDEField field = dtoField.getPSDEField();
                if (field != null) {
                    if (field instanceof IPSInheritDEField) {
                        field = ((IPSInheritDEField) field).getRelatedPSDEFieldMust();
                    }
                    if (field instanceof IPSPickupDEField
                            && ((IPSPickupDEField) field).getPSDERMust() instanceof IPSDER1N) {
                        IPSDER1N der = (IPSDER1N) ((IPSPickupDEField) field).getPSDERMust();
                        String parentName = der.getMajorPSDataEntityMust().getName();
                        IEntityDTO parentData = session.getPSModelData(parentName, value, true);
                        if (session.isClonePSModel(parentName) && parentData != null) {
                            IEntityDTO realEntity = doOutput(session, parentData, false);
                            if (realEntity == null) {
                                entityDTO.reset(dtoField.getLowerCaseName());
                            } else {
                                net.ibizsys.central.dataentity.IDataEntityRuntime parentRuntime =
                                        systemRuntime.getDataEntityRuntime(parentName);
                                Object newKey = realEntity.get(
                                        parentRuntime.getKeyPSDEField().getLowerCaseName());
                                entityDTO.set(dtoField.getLowerCaseName(), newKey);
                            }
                        }
                    }
                }

                if (!isNestedDTOField(dtoField, field)) {
                    continue;
                }
                Collection<?> children = getChildren(value);
                if (ObjectUtils.isEmpty(children)) {
                    continue;
                }
                for (Object child : children) {
                    if (child instanceof IEntityDTO) {
                        doOutput(session, (IEntityDTO) child, true);
                    }
                }
            }
        }

        if (session.pollParentPSModelData() != entityDTO) {
            throw new Exception("\u9000\u51fa\u7236\u6a21\u578b\u6570\u636e\u4e0d\u6b63\u786e");
        }
        return entityDTO;
    }

    private boolean isNestedDTOField(IPSDEMethodDTOField dtoField, IPSDEField field) {
        if (!"DTO".equals(dtoField.getType()) && !"DTOS".equals(dtoField.getType())) {
            return false;
        }
        if (dtoField.getRefPSDataEntity() == null) {
            return false;
        }
        return !"DTO".equals(dtoField.getType()) || !(field instanceof IPSPickupObjectDEField);
    }

    private Collection<?> getChildren(Object value) {
        if (value instanceof List) {
            return (List<?>) value;
        }
        if (value instanceof Map) {
            return ((Map<?, ?>) value).values();
        }
        return null;
    }
}