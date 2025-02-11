package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _929_Unique_Email_AddressesTest {

    _929_Unique_Email_Addresses uniqueEmailAddresses = new _929_Unique_Email_Addresses();



    @Test
    public void case1() {

        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        assertEquals(2, uniqueEmailAddresses.numUniqueEmails(emails));
    }


    @Test
    public void case2() {



        assertEquals(0, uniqueEmailAddresses.numUniqueEmails(null));
    }

    @Test
    public void case3() {

        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com",
                "acr@adssa.com"};

        assertEquals(3, uniqueEmailAddresses.numUniqueEmails(emails));
    }


    @Test
    public void case4() {

        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@leetcode.com"};

        assertEquals(1, uniqueEmailAddresses.numUniqueEmails(emails));
    }


    @Test
    public void case5() {

        String[] emails = {"test.email+alex@leetcode.com"};

        assertEquals(1, uniqueEmailAddresses.numUniqueEmails(emails));
    }
}