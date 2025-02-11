package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class _173_Binary_Search_Tree_Iterator {


    Queue<TreeNode> cola = new LinkedList<>();

    //	Runtime: 57 ms, faster than 90.18% of Java online submissions for Binary Search Tree Iterator.
//	Memory Usage: 50.3 MB, less than 92.59% of Java online submissions for Binary Search Tree Iterator.
    public _173_Binary_Search_Tree_Iterator(TreeNode root) {

        setNewTail(root);
    }


    /**
     * @return the next smallest number
     */
    public int next() {

        return cola.poll().val;
    }

    private void setNewTail(TreeNode root) {

        if (root.left != null) {
            setNewTail(root.left);
        }

        cola.add(root);

        if (root.right != null) {
            setNewTail(root.right);
        }


    }


    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !cola.isEmpty();
    }





}
