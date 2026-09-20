package net.ibizsys.modeling.core.util;

import java.util.ArrayDeque;
import java.util.Deque;
import net.ibizsys.modeling.core.security.IPSDevSysUser;

/**
 * Per-thread stack used while a model operation runs in a system context.
 */
public final class PSDevSysUserHolder {

    private static final ThreadLocal<Deque<IPSDevSysUser>> HOLDER =
            ThreadLocal.withInitial(ArrayDeque::new);

    private PSDevSysUserHolder() {
    }

    public static IPSDevSysUser peek() {
        return HOLDER.get().peek();
    }

    public static void push(IPSDevSysUser user) {
        HOLDER.get().push(user);
    }

    public static void poll() {
        Deque<IPSDevSysUser> users = HOLDER.get();
        users.poll();
        if (users.isEmpty()) {
            HOLDER.remove();
        }
    }

    public static void clear() {
        HOLDER.remove();
    }
}