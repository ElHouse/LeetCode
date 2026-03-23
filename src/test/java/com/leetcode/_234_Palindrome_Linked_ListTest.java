package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _234_Palindrome_Linked_ListTest {

    private final _234_Palindrome_Linked_List palindromeLinkedList = new _234_Palindrome_Linked_List();

    @Test
    public void test01(){
        ListNode head = ListNode.crearListNodeXLista(new int[]{1,2,2,1});
        assertTrue(palindromeLinkedList.isPalindrome(head));

    }
    @Test
    public void test02(){
        ListNode head = ListNode.crearListNodeXLista(new int[]{1,2,2,3});
        assertFalse(palindromeLinkedList.isPalindrome(head));

    }
    @Test
    public void test03(){
        ListNode head = ListNode.crearListNodeXLista(new int[]{1,2,3,2,1});
        assertTrue(palindromeLinkedList.isPalindrome(head));

    }
    @Test
    public void test04(){
        ListNode head = ListNode.crearListNodeXLista(new int[]{1,2,3,3,2,1});
        assertTrue(palindromeLinkedList.isPalindrome(head));

    }
    @Test
    public void test05(){
        ListNode head = ListNode.crearListNodeXLista(new int[]{1,2,2,0});
        assertFalse(palindromeLinkedList.isPalindrome(head));

    }
    @Test
    public void test06(){
        ListNode head = ListNode.crearListNodeXLista(new int[]{1});
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void test07(){
        assertFalse(palindromeLinkedList.isPalindrome(null));
    }

    @Test
    public void test08(){
        ListNode head = ListNode.crearListNodeXLista(new int[]{1,1});
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

}