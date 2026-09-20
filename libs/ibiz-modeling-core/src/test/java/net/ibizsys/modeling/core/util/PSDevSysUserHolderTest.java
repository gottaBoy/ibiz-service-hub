package net.ibizsys.modeling.core.util;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import net.ibizsys.modeling.core.security.PSDevSysUser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class PSDevSysUserHolderTest {

    @AfterEach
    void clearThreadContext() {
        PSDevSysUserHolder.clear();
    }

    @Test
    void holderBehavesAsAThreadLocalStack() {
        PSDevSysUser first = new PSDevSysUser();
        PSDevSysUser second = new PSDevSysUser();

        assertNull(PSDevSysUserHolder.peek());
        PSDevSysUserHolder.push(first);
        PSDevSysUserHolder.push(second);
        assertSame(second, PSDevSysUserHolder.peek());

        PSDevSysUserHolder.poll();
        assertSame(first, PSDevSysUserHolder.peek());
        PSDevSysUserHolder.poll();
        assertNull(PSDevSysUserHolder.peek());
    }

    @Test
    void holderDoesNotCrossThreadBoundaries() throws Exception {
        PSDevSysUser current = new PSDevSysUser();
        PSDevSysUserHolder.push(current);

        PSDevSysUser[] otherThreadValue = new PSDevSysUser[1];
        Thread thread = new Thread(() -> otherThreadValue[0] = (PSDevSysUser) PSDevSysUserHolder.peek());
        thread.start();
        thread.join();

        assertNull(otherThreadValue[0]);
        assertSame(current, PSDevSysUserHolder.peek());
    }
}