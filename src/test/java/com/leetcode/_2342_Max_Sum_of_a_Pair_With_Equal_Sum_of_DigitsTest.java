package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_DigitsTest {

    _2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits maxSumOfAPairWithEqualSumOfDigits = new _2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits();


    @Test
    public void test01() {
        assertEquals(54, maxSumOfAPairWithEqualSumOfDigits.maximumSum(new int[]{18,43,36,13,7}));
        assertEquals(-1, maxSumOfAPairWithEqualSumOfDigits.maximumSum(new int[]{10,12,19,14}));
        assertEquals(973, maxSumOfAPairWithEqualSumOfDigits.maximumSum(new int[]{229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401}));

    }

}