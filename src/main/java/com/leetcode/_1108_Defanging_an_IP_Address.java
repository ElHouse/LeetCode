package com.leetcode;


public class _1108_Defanging_an_IP_Address {

    public String defangIPaddr(String address) {

        if (address == null || address.isEmpty()) return null;

        return address.replaceAll("\\.", "[.]");
    }


}
