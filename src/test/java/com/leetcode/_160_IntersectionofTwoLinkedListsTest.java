package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class _160_IntersectionofTwoLinkedListsTest {


    _160_IntersectionofTwoLinkedLists intersectionofTwoLinkedLists = new _160_IntersectionofTwoLinkedLists();


    @Test
    public void test1() {

        ListNode auxList = createLists(new int[]{8, 4, 5});

        ListNode listA = createLists(new int[]{4, 1});
        ListNode listB = createLists(new int[]{5, 6, 1});

        ListNode aux = listA;
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = auxList;

        aux = listB;
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = auxList;


        assertEquals(auxList, intersectionofTwoLinkedLists.getIntersectionNode(listA, listB));
    }


    @Test
    public void test2() {

        ListNode auxList = createLists(new int[]{2, 4});

        ListNode listA = createLists(new int[]{1, 9, 1});
        ListNode listB = createLists(new int[]{3});

        ListNode aux = listA;
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = auxList;

        aux = listB;
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = auxList;


        assertEquals(auxList, intersectionofTwoLinkedLists.getIntersectionNode(listA, listB));
    }


    @Test
    public void test3() {

        ListNode listA = createLists(new int[]{1, 9, 1});
        ListNode listB = createLists(new int[]{3, 5});

        assertNull(intersectionofTwoLinkedLists.getIntersectionNode(listA, listB));
    }

    private ListNode createLists(int[] array) {

        ListNode head = new ListNode(array[0]);
        ListNode headAux = head;

        for (int i = 1; i < array.length; i++) {

            headAux.next = new ListNode(array[i]);
            headAux = headAux.next;
        }

        headAux.next = new ListNode(array[array.length - 1]);


        return head;
    }

}