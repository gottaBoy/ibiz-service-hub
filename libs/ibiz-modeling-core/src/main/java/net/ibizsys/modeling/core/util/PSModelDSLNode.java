package net.ibizsys.modeling.core.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * Default implementation of {@link IPSModelDSLNode}.
 *
 * <p>A node holds a reference to its parent, a map of child nodes keyed by
 * {@code nodeName|id}, and an optional backing {@link IEntityDTO}. The unique
 * identifier is computed from the model scope and parent chain.</p>
 */
public class PSModelDSLNode extends EntityBase implements IPSModelDSLNode {

    private static final Log log = LogFactory.getLog(PSModelDSLNode.class);

    private final Map<String, IPSModelDSLNode> psModelDSLNodeMap = new LinkedHashMap<>();
    private final String strNodeName;
    private final transient IPSModelDSLNode parent;
    private transient IEntityDTO real;
    private transient String strUniqueId;
    private Map<String, Object> optionParams;

    public static final String FIELD_NESTED = "_nested";
    public static final String FIELD_DESC = "_desc";

    public PSModelDSLNode(IPSModelDSLNode parent, String strNodeName,
                          Map<String, Object> attributes, IEntityDTO real) {
        this.parent = parent;
        this.strNodeName = strNodeName;
        if (!ObjectUtils.isEmpty(attributes)) {
            this.putAll(attributes);
        }
        this.real = real;
        this.strUniqueId = this.calcUniqueId();
        if (parent != null) {
            parent.appendChild(this);
        }
    }

    @Override
    @JsonIgnore
    public IPSModelDSLNode getParent() {
        return parent;
    }

    @Override
    @JsonIgnore
    public IEntityDTO getReal() {
        return real;
    }

    @Override
    public String getId() {
        String strId = DataTypeUtils.asString(this.get("id"));
        if (StringUtils.hasLength(strId)) {
            return strId;
        }
        return null;
    }

    @Override
    public String getRealId() {
        if (real != null && real.getDEMethodDTORuntime() != null) {
            return DataTypeUtils.asString(
                    real.get(real.getDEMethodDTORuntime()
                            .getDataEntityRuntime()
                            .getKeyPSDEField()
                            .getLowerCaseName()));
        }
        return null;
    }

    @Override
    public String getPSModelName() {
        if (real != null && real.getDEMethodDTORuntime() != null) {
            return real.getDEMethodDTORuntime()
                    .getDataEntityRuntime()
                    .getName();
        }
        return null;
    }

    @Override
    public String getNodeName() {
        return strNodeName;
    }

    @Override
    public boolean appendChild(IPSModelDSLNode child) {
        String strId = child.getId();
        if (!StringUtils.hasLength(strId)) {
            strId = KeyValueUtils.genUniqueId();
        }
        String tag = String.format("%1$s|%2$s", child.getNodeName(), strId);
        if (psModelDSLNodeMap.containsKey(tag)) {
            return false;
        }
        psModelDSLNodeMap.put(tag, child);
        return true;
    }

    @Override
    public List<IPSModelDSLNode> getChildren() {
        if (ObjectUtils.isEmpty(psModelDSLNodeMap)) {
            return null;
        }
        return Collections.unmodifiableList(new ArrayList<>(psModelDSLNodeMap.values()));
    }

    @Override
    public boolean isNested() {
        return DataTypeUtils.asBoolean(this.get(FIELD_NESTED), false);
    }

    @Override
    public String getDesc() {
        return DataTypeUtils.asString(this.get(FIELD_DESC), null);
    }

    @Override
    public String getUniqueId() {
        return strUniqueId;
    }

    /**
     * Compute the unique identifier for this node based on model scope and
     * parent chain. Returns {@code null} for nested nodes or when the
     * backing runtime is unavailable.
     */
    protected String calcUniqueId() {
        if (isNested()) {
            return null;
        }
        if (real == null || real.getDEMethodDTORuntime() == null) {
            return null;
        }
        IDataEntityRuntime deRT = (IDataEntityRuntime)
                real.getDEMethodDTORuntime().getDataEntityRuntime();
        String strModelTag;
        try {
            strModelTag = deRT.getModelTag(real);
        } catch (Throwable ex) {
            ExceptionUtils.rethrowRuntimeException(ex);
            throw new RuntimeException(ex);
        }
        if (!StringUtils.hasLength(strModelTag)) {
            return null;
        }

        // With a parent, prefix with the parent's unique id.
        if (parent != null) {
            String parentUnique = parent.getUniqueId();
            if (StringUtils.hasLength(parentUnique)) {
                return String.format("%1$s.%2$s", parentUnique, strModelTag);
            }
            return null;
        }

        // Root node — try to resolve the model scope.
        try {
            String scope = deRT.getModelScope(real);
            if (StringUtils.hasLength(scope)) {
                String[] parts = scope.split("[#]");
                if (parts != null && parts.length == 2) {
                    List<IPSDER1NBase> der1Ns = deRT.getModelScopePSDER1Ns();
                    if (!ObjectUtils.isEmpty(der1Ns)) {
                        for (IPSDER1NBase der : der1Ns) {
                            if (der.getMajorPSDataEntityMust().getName().equals(parts[0])) {
                                String parentTag = DataTypeUtils.asString(
                                        this.get(der.getPickupPSDEFieldMust().getName().toLowerCase()));
                                if (StringUtils.hasLength(parentTag)) {
                                    return String.format("%1$s.%2$s", parentTag, strModelTag);
                                }
                            }
                        }
                    }
                }
                return null;
            }
            return strModelTag;
        } catch (Throwable ex) {
            log.error(ex);
            return null;
        }
    }

    @Override
    public void option(Map<String, Object> params) {
        if (ObjectUtils.isEmpty(params)) {
            this.optionParams = null;
        } else {
            this.optionParams = new LinkedHashMap<>();
            this.optionParams.putAll(params);
        }
    }

    @Override
    public boolean isEnableUpdate() {
        if (optionParams != null) {
            return DataTypeUtils.asBoolean(optionParams.get("update"), false);
        }
        return false;
    }
}