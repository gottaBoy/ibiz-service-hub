package net.ibizsys.modeling.core.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Timestamp;
import java.time.Instant;
import net.ibizsys.model.PSModelEnums;
import org.junit.jupiter.api.Test;

class PSDevUserTest {

    @Test
    void accessModesUseTheLegacyBitMasks() {
        PSDevUser user = new PSDevUser();

        user.setAccMode(IPSDevUserBase.ACCMODE_SHARE);
        assertTrue(user.isShareAccMode());
        assertFalse(user.isMaintainAccMode());

        user.setAccMode(IPSDevUserBase.ACCMODE_MAINTAIN);
        assertFalse(user.isShareAccMode());
        assertTrue(user.isMaintainAccMode());

        user.setAccMode(IPSDevUserBase.ACCMODE_ALL);
        assertFalse(user.isShareAccMode());
        assertFalse(user.isMaintainAccMode());
    }

    @Test
    void userBaseNormalizesOneTrailingTaskServerSlash() {
        PSDevUser user = new PSDevUser();

        user.setTaskServerUrl("https://task.example/");
        assertEquals("https://task.example", user.getTaskServerUrl());

        user.setTaskServerUrl("https://task.example//");
        assertEquals("https://task.example/", user.getTaskServerUrl());

        user.setTaskServerUrl("");
        assertEquals("", user.getTaskServerUrl());
    }

    @Test
    void expirationUsesTheConfiguredTimestamp() {
        PSDevUser user = new PSDevUser();
        assertFalse(user.isExpired());

        user.setExpiredTime(Timestamp.from(Instant.now().minusSeconds(5)));
        assertTrue(user.isExpired());

        user.setExpiredTime(Timestamp.from(Instant.now().plusSeconds(60)));
        assertFalse(user.isExpired());
    }

    @Test
    void systemUserHasTheUninitializedDefaultAndSystemNameFallback() {
        PSDevSysUser user = new PSDevSysUser();
        user.setPSDevSlnSysName("Demo System");

        assertEquals(PSModelEnums.DevSysState.UNINITIALIZED.value, user.getDevSysState());
        assertEquals("Demo System", user.getPSSystemName());
        assertEquals(IPSDevUserBase.TARGETTYPE_SYS, user.getTargetType());

        user.setPSSystemName("Published Name");
        assertEquals("Published Name", user.getPSSystemName());
    }
}