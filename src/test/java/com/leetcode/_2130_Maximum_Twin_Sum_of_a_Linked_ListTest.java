package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2130_Maximum_Twin_Sum_of_a_Linked_ListTest {

    private final _2130_Maximum_Twin_Sum_of_a_Linked_List maximumTwinSumOfALinkedList = new _2130_Maximum_Twin_Sum_of_a_Linked_List();

    @Test
    public void test01() {

        assertEquals(6, maximumTwinSumOfALinkedList.pairSum(
                ListNode.crearListNodeXLista(
                        new int[]{5, 4, 2, 1}
                )));
    }

    @Test
    public void test02() {

        assertEquals(7, maximumTwinSumOfALinkedList.pairSum(
                ListNode.crearListNodeXLista(
                        new int[]{4, 2, 2, 3}
                )));
    }

    @Test
    public void test03() {

        assertEquals(100001, maximumTwinSumOfALinkedList.pairSum(
                ListNode.crearListNodeXLista(
                        new int[]{1, 100000}
                )));
    }

}