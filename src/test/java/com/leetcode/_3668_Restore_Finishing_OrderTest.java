package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3668_Restore_Finishing_OrderTest {


    _3668_Restore_Finishing_Order restoreFinishingOrder = new _3668_Restore_Finishing_Order();


    @Test
    public void test01() {
        assertArrayEquals(new int[]{3, 1, 4},
                restoreFinishingOrder.recoverOrder(
                        new int[]{3, 1, 2, 5, 4},
                        new int[]{1, 3, 4}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{5, 2},
                restoreFinishingOrder.recoverOrder(
                        new int[]{1, 4, 5, 3, 2},
                        new int[]{2, 5}));
    }
}