package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _219_Contains_Duplicate_IITest {


    _219_Contains_Duplicate_II containsDuplicateIi = new _219_Contains_Duplicate_II();


    @Test
    public void test01() {
        assertTrue(containsDuplicateIi.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(containsDuplicateIi.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertFalse(containsDuplicateIi.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

}