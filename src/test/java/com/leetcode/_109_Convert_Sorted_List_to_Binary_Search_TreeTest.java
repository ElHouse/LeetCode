package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.structure.ListNode;
import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

class _109_Convert_Sorted_List_to_Binary_Search_TreeTest {


    private final _109_Convert_Sorted_List_to_Binary_Search_Tree convertSortedListToBinarySearchTree = new _109_Convert_Sorted_List_to_Binary_Search_Tree();

    @Test
    public void case1() {

        int[] nums = {-10, -3, 0, 5, 9};

        ListNode head = fromArrayToListNode(nums);

        System.out.println("List->");
        System.out.println(nodeToString(head));

        TreeNode root = convertSortedListToBinarySearchTree.sortedListToBST(head);

        System.out.println("final");
        printTree(root);

    }


    private String nodeToString(ListNode head) {

        StringBuilder sb = new StringBuilder();

        ListNode aux = head;

        while (aux != null) {

            sb.append(aux.val);
            sb.append(",");

            aux = aux.next;
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    private ListNode fromArrayToListNode(int[] nums) {


        ListNode head = new ListNode(nums[0]);
        ListNode tail = head;

        for (int i = 1; i < nums.length; i++) {
            ListNode aux = new ListNode(nums[i]);
            tail.next = aux;
            tail = tail.next;
        }

        return head;
    }

    private void printTree(TreeNode root) {


        System.out.println(root.val);
        if (root.left != null) {
            printTree(root.left);
        }
        if (root.right != null) {
            printTree(root.right);
        }

    }

}