package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _657_Robot_Return_to_OriginTest {

    _657_Robot_Return_to_Origin robotReturnToOrigin = new _657_Robot_Return_to_Origin();

    @Test
    public void case0() {

        assertFalse(robotReturnToOrigin.judgeCircle(null));

    }

    @Test
    public void case1() {

        assertTrue(robotReturnToOrigin.judgeCircle("UUDDLLRR"));

    }

    @Test
    public void case2() {

        assertTrue(robotReturnToOrigin.judgeCircle("UD"));

    }

    @Test
    public void case3() {

        assertFalse(robotReturnToOrigin.judgeCircle("UDL"));

    }

    @Test
    public void case4() {

        assertFalse(robotReturnToOrigin.judgeCircle("U"));

    }
}