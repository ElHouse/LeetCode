package com.leetcode;

import com.leetcode._3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_DistinctTest {


    _3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct minimumNumberOfOperationsToMakeElementsInArrayDistinct = new _3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct();


    @Test
    public void test1() {

        assertEquals(2, minimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperations(new int[]{1, 2, 3, 4, 2, 3, 3, 5, 7}));
        assertEquals(1, minimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperations(new int[]{4, 4}));
        assertEquals(0, minimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperations(new int[]{6,7,8,9}));
        assertEquals(2, minimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperations(new int[]{4,5,6,4,4}));


    }


}