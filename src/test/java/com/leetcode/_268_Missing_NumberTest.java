package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _268_Missing_NumberTest {

    _268_Missing_Number missing_number = new _268_Missing_Number();

    @Test
    public void case1() {
        assertEquals(2, missing_number.missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    public void case2() {
        assertEquals(8, missing_number.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }


    @Test
    public void case3() {
        assertEquals(0, missing_number.missingNumber(null));
    }

    @Test
    public void case4() {
        assertEquals(0, missing_number.missingNumber(new int[]{1}));
    }

    @Test
    public void case5() {
        assertEquals(1, missing_number.missingNumber(new int[1]));
    }
}