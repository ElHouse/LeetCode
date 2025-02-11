package com.leetcode;

import com.leetcode._1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_BoxTest {


    private final _1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box minimumNumberOfOperationsToMoveAllBallsToEachBox = new _1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box();

    @Test
    public void test11() {


        assertArrayEquals(new int[]{1, 1, 3}, minimumNumberOfOperationsToMoveAllBallsToEachBox.minOperations("110"));
        assertArrayEquals(new int[]{11, 8, 5, 4, 3, 4}, minimumNumberOfOperationsToMoveAllBallsToEachBox.minOperations("001011"));
    }
}