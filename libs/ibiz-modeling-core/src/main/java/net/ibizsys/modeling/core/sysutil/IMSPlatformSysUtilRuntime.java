package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformAgent;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformProvider;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="MSPLATFORMUTIL")
public interface IMSPlatformSysUtilRuntime
extends ISysUtilRuntime {
    public static final String ADDIN_PSDCMSPLATFORM_PREFIX = "PSDCMSPLATFORM:";
    public static final String MSPLATFORMTYPE_IBIZCLOUD = "IBIZCLOUD";

    public IPSDCMSPlatformAgent getPSDCMSPlatformAgent(String var1);

    public void registerPSDCMSPlatformProvider(String var1, IPSDCMSPlatformProvider var2);

    public boolean unregisterPSDCMSPlatformProvider(String var1, IPSDCMSPlatformProvider var2);
}
