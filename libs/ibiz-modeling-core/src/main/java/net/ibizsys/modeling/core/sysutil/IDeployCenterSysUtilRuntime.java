package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.addin.IPSDCDeployCenterAgent;
import net.ibizsys.modeling.core.addin.IPSDCDeployCenterProvider;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="DEPLOYCENTERUTIL")
public interface IDeployCenterSysUtilRuntime
extends ISysUtilRuntime {
    public static final String ADDIN_PSDCDEPLOYCENTER_PREFIX = "PSDCDEPLOYCENTER:";
    public static final String DEPLOYCENTERTYPE_JENKINS = "JENKINS";

    public IPSDCDeployCenterAgent getPSDCDeployCenterAgent(String var1);

    public IPSDCDeployCenterAgent getDefaultPSDCDeployCenterAgent(String var1);

    public IPSDCDeployCenterAgent getDefaultPSDCDeployCenterAgent();

    public void registerPSDCDeployCenterProvider(String var1, IPSDCDeployCenterProvider var2);

    public boolean unregisterPSDCDeployCenterProvider(String var1, IPSDCDeployCenterProvider var2);
}
