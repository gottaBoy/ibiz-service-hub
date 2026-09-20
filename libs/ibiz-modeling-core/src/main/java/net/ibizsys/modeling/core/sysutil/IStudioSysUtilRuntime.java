package net.ibizsys.modeling.core.sysutil;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="STUDIOUTIL")
public interface IStudioSysUtilRuntime
extends ISysUtilRuntime {
    public void sendConsole(String var1, String var2);

    public void sendConsole(String var1, String var2, String var3);

    public void sendConsole(String var1, String var2, String var3, boolean var4);

    public void sendConsole(String var1, String var2, String var3, String var4, boolean var5);

    public void sendCommand(String var1, String var2);

    public void sendCommand(String var1, String var2, String var3);
}
