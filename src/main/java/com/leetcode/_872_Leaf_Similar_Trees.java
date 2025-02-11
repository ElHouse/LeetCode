package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class _872_Leaf_Similar_Trees {


    //	Runtime: 0 ms, faster than 100.00% of Java online submissions for Leaf-Similar Trees.
//	Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Leaf-Similar Trees.
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        if (root1 == null || root2 == null) return false;

        List<Integer> leafRoot1 = new ArrayList<>();
        List<Integer> leafRoot2 = new ArrayList<>();

        getLeafList(root1, leafRoot1);
        getLeafList(root2, leafRoot2);

        if (leafRoot1.size() != leafRoot2.size()) return false;

        for (int i = 0; i < leafRoot1.size(); i++) {
            if (!leafRoot1.get(i).equals(leafRoot2.get(i))) {
                return false;
            }

        }

        return true;
    }


    private void getLeafList(TreeNode root, List<Integer> list) {

        if (root.left != null) {
            getLeafList(root.left, list);
        }

        if (root.right != null) {
            getLeafList(root.right, list);
        }

        if (root.right == null && root.left == null) {
            list.add(root.val);
        }

    }


}
