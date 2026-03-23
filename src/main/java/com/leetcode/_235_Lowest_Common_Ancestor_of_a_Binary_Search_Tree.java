package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

    TreeNode response = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        response = null;

        dfs(root, p,q);

        return response;
    }


    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {

        if (response != null) return false;
        if (root == null) return false;

        boolean L = dfs(root.left, p, q);
        boolean R = dfs(root.right, p, q);

        if (L && R) {
            response = root;
            return true;
        }

        boolean aux = (p.val == root.val || q.val == root.val);

        if ((L || R) && aux){
            response = root;
            return true;
        }

        return L || R|| aux;
    }


    //------------
    boolean found = false;


    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {


        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();

        algo(root, path1, p);
        found = false;
        algo(root, path2, q);

        if (path1.isEmpty() || path2.isEmpty()) return null;

        int auxI = path1.size() > path2.size() ? path1.size() - path2.size() : 0;
        int auxJ = path2.size() > path1.size() ? path2.size() - path1.size() : 0;


        for (int i = Math.max(auxI, auxJ); i < Math.max(path1.size(), path2.size()); i++) {

            if (path1.get(auxI++).equals(path2.get(auxJ++))) return path1.get(auxI - 1);

        }

        return null;
    }


    public void algo(TreeNode root, List<TreeNode> path, TreeNode target) {


        if (root.val == target.val) {

            found = true;
            path.add(root);
        } else {

            if (root.left != null && !found) {
                algo(root.left, path, target);
            }

            if (root.right != null && !found) {
                algo(root.right, path, target);
            }

            if (found) path.add(root);
        }

    }

}
