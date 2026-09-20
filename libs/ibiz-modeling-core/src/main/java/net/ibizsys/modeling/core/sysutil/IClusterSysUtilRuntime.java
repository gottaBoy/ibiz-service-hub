package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.addin.IPSDCClusterAgent;
import net.ibizsys.modeling.core.addin.IPSDCClusterProvider;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="CLUSTERUTIL")
public interface IClusterSysUtilRuntime
extends ISysUtilRuntime {
    public static final String ADDIN_PSDCCLUSTER_PREFIX = "PSDCCLUSTER:";
    public static final String CLUSTERTYPE_K8S = "K8S";

    public IPSDCClusterAgent getPSDCClusterAgent(String var1);

    public void registerPSDCClusterProvider(String var1, IPSDCClusterProvider var2);

    public boolean unregisterPSDCClusterProvider(String var1, IPSDCClusterProvider var2);
}
