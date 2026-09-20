package net.ibizsys.modeling.core.ai;

import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.model.ai.IPSSysAIChatAgent;

/**
 * Modeling service extension point for system AI factories.
 */
public abstract class SysAIFactoryRuntimeBase
        extends net.ibizsys.central.cloud.core.ai.SysAIFactoryRuntimeBase {

    @Override
    protected ISysAIChatAgentRuntime createDefaultSysAIChatAgentRuntime(
            IPSSysAIChatAgent psSysAIChatAgent) {
        return new DefaultSysAIChatAgentRuntime();
    }
}