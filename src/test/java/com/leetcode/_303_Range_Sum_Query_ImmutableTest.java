package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _303_Range_Sum_Query_ImmutableTest {

    @Test
    public void test01(){



        _303_Range_Sum_Query_Immutable rangeSumQueryImmutable  = new _303_Range_Sum_Query_Immutable(new int[]{-2, 0, 3, -5, 2, -1});

        assertEquals(1, rangeSumQueryImmutable.sumRange(0,2));
        assertEquals(-1, rangeSumQueryImmutable.sumRange(2,5));
        assertEquals(-3, rangeSumQueryImmutable.sumRange(0,5));

    }

}