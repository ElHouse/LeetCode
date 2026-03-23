package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _482_License_Key_FormattingTest {

    private final _482_License_Key_Formatting licenseKeyFormatting = new _482_License_Key_Formatting();


    @Test
    public void test01() {
        assertEquals("5F3Z-2E9W", licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    @Test
    public void test02() {
        assertEquals("2-5G-3J", licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
    }


    @Test
    public void test03() {
        assertEquals("5F3Z-2E9W5F-3Z2E9W-5F3Z2E-9W5F3Z-2E9W5F-3Z2E9W", licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w-5F3Z-2e-9-w-5F3Z-2e-9-w-5F3Z-2e-9-w-5F3Z-2e-9-w", 6));
    }


    @Test
    public void test04() {
        assertEquals("2-5-G-3-J", licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 1));
    }

    @Test
    public void test05() {
        assertEquals("25G3J", licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 10));
    }

    @Test
    public void test06() {
        assertEquals("AA-AA", licenseKeyFormatting.licenseKeyFormatting("--a-a-a-a--", 2));
    }
}