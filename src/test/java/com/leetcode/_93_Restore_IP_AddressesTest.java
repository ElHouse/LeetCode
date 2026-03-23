package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _93_Restore_IP_AddressesTest {
    _93_Restore_IP_Addresses restoreIpAddresses = new _93_Restore_IP_Addresses();

    @Test
    public void test01() {
        assertEquals(List.of("0.0.0.0"), restoreIpAddresses.restoreIpAddresses("0000"));
    }

    @Test
    public void test02() {
        assertEquals(List.of("255.255.11.135","255.255.111.35"), restoreIpAddresses.restoreIpAddresses("25525511135"));
    }

    @Test
    public void test03() {
        assertEquals(List.of(), restoreIpAddresses.restoreIpAddresses("0279245587303"));
    }
}


