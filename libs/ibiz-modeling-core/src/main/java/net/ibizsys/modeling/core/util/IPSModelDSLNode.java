package net.ibizsys.modeling.core.util;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.runtime.util.IEntity;

/**
 * DSL tree node interface for the modeling service.
 *
 * <p>Each node in the DSL tree represents a model element (data entity, module,
 * action, etc.) and provides access to its parent, children, and the underlying
 * DTO data.</p>
 */
public interface IPSModelDSLNode extends IEntity {

    String getNodeName();

    String getPSModelName();

    IPSModelDSLNode getParent();

    String getId();

    String getRealId();

    IEntityDTO getReal();

    boolean appendChild(IPSModelDSLNode child);

    List<IPSModelDSLNode> getChildren();

    boolean isNested();

    String getUniqueId();

    String getDesc();

    void option(Map<String, Object> params);

    boolean isEnableUpdate();
}