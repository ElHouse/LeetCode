package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class _572_Subtree_of_Another_Tree {


    List<TreeNode> list = new ArrayList<>();

    //	Runtime: 6 ms, faster than 93.31% of Java online submissions for Subtree of Another Tree.
//	Memory Usage: 40.1 MB, less than 97.78% of Java online submissions for Subtree of Another Tree.
    public boolean isSubtree(TreeNode s, TreeNode t) {

        if (s == null || t == null) return false;

        findElement(s, t);

        if (list.isEmpty()) return false;

        for (TreeNode aux : list) {
            if (areEqualTrees(aux, t)) return true;
        }

        return false;
    }

    public boolean areEqualTrees(TreeNode aux, TreeNode t) {

        if (aux.val != t.val) return false;

        if (aux.left == null && t.left != null) return false;
        else if (aux.left != null && t.left == null) return false;
        else if (aux.left != null) {
            boolean a = areEqualTrees(aux.left, t.left);
            if (!a) return false;
        }

        if (aux.right == null && t.right != null) return false;
        else if (aux.right != null && t.right == null) return false;
        else if (aux.right != null) {
            boolean a = areEqualTrees(aux.right, t.right);
            if (!a) return false;
        }

        return true;
    }

    public void findElement(TreeNode s, TreeNode t) {

        if (s.val == t.val) list.add(s);


        if (s.left != null) {
            findElement(s.left, t);
        }

        if (s.right != null) {
            findElement(s.right, t);
        }

    }


}

