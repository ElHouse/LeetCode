package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _944_Delete_Columns_to_Make_SortedTest {


    private final _944_Delete_Columns_to_Make_Sorted deleteColumnsToMakeSorted = new _944_Delete_Columns_to_Make_Sorted();


    @Test
    public void test01(){
        assertEquals(1, deleteColumnsToMakeSorted.minDeletionSize(new String[]{"cba","daf","ghi"}));
    }

    @Test
    public void test02(){
        assertEquals(0, deleteColumnsToMakeSorted.minDeletionSize(new String[]{"a","b"}));
    }

    @Test
    public void test03(){
        assertEquals(3, deleteColumnsToMakeSorted.minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }

    @Test
    public void test04(){
        assertEquals(3, deleteColumnsToMakeSorted.minDeletionSize(new String[]{"zyxaaaa","wvubbbb","tsrcccc"}));
    }

    @Test
    public void test05(){
        assertEquals(2, deleteColumnsToMakeSorted.minDeletionSize(new String[]{"rrjk","furt","guzm"}));
    }
}