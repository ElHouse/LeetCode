package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _35_Search_Insert_PositionTest {

    _35_Search_Insert_Position searchInsertPosition = new _35_Search_Insert_Position();

    @Test
    public void test01(){
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1,3,5,6},5));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1,3,5,6},2));
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1,3,5,6},7));
        assertEquals(0, searchInsertPosition.searchInsert(new int[0],7));

    }

}