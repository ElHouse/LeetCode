package com.leetcode;

import com.leetcode.structure.ListNode;
import com.leetcode.structure.TreeNode;

import java.util.Stack;


public class _109_Convert_Sorted_List_to_Binary_Search_Tree {

    public TreeNode sortedListToBST(ListNode head) {

        int size = getListSize(head);
        int start = (size / 2) + size % 2;

        System.out.println("startt>" + start);

        TreeNode rootLeft = null;
        Stack<Integer> stack = new Stack<>();
        ListNode aux = head;

        System.out.println("parte 1");
        for (int i = start - 1; i > 0; i--) {

            stack.add(aux.val);
            System.out.println(aux.val);
            aux = aux.next;
        }

        while (!stack.empty()) {

            if (rootLeft == null) {
                rootLeft = new TreeNode(stack.pop());
            } else {
                insertInLeftSide(stack.pop(), rootLeft);
            }
        }

        System.out.println("--_>" + aux.val);

        TreeNode root = new TreeNode(aux.val);
        root.left = rootLeft;
        aux = aux.next;

        System.out.println("parte 2");
        for (int i = start + 1; i < size + 1; i++) {
            stack.add(aux.val);

            System.out.println(aux.val);
            aux = aux.next;
        }

        while (!stack.empty()) {

            insertInRightSide(stack.pop(), root);
        }


        return root;
    }

    public void insertInRightSide(int element, TreeNode root) {


        if (root.right == null) {
            root.right = new TreeNode(element);
        } else {
            insertInLeftSide(element, root.right);
        }

    }

    public void insertInLeftSide(int element, TreeNode root) {


        if (root.left == null) {
            root.left = new TreeNode(element);
        } else {
            insertInLeftSide(element, root.left);
        }

    }

    public int getListSize(ListNode head) {

        int size = 0;

        ListNode aux = head;

        while (aux != null) {
            size++;
            aux = aux.next;

        }

        return size;
    }

}
