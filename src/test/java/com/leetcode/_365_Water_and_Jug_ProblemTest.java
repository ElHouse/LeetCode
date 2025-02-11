package com.leetcode;

import com.leetcode._365_Water_and_Jug_Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _365_Water_and_Jug_ProblemTest {

    private final _365_Water_and_Jug_Problem waterAndJugProblem = new _365_Water_and_Jug_Problem();

    @Test
    public void tests() {


        assertTrue(waterAndJugProblem.canMeasureWater(3, 5, 4));
        assertTrue(waterAndJugProblem.canMeasureWater(1, 2, 3));
        assertFalse(waterAndJugProblem.canMeasureWater(2, 6, 5));

    }

}