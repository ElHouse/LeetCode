package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _1108_Defanging_an_IP_AddressTest {

    private final _1108_Defanging_an_IP_Address defangingAnIpAddress = new _1108_Defanging_an_IP_Address();

    @Test
    public void case1() {

        String address = "1.1.1.1";
        assertEquals("1[.]1[.]1[.]1", defangingAnIpAddress.defangIPaddr(address));
    }


    @Test
    public void case2() {

        String address = "255.100.50.0";
        assertEquals("255[.]100[.]50[.]0", defangingAnIpAddress.defangIPaddr(address));
    }
}