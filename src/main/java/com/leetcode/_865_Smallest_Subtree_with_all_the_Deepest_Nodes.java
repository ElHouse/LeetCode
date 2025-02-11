package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _865_Smallest_Subtree_with_all_the_Deepest_Nodes {


    private final List<List<TreeNode>> paths = new ArrayList<>();
    private int pathSize = Integer.MIN_VALUE;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {

        TreeNode response = null;

        List<TreeNode> path = new ArrayList<>();
        path.add(root);

        process(path, root, 1);

        if (paths.size() == 1) {
            return paths.getFirst().get(pathSize - 2);
        }

        for (int i = 0; i < pathSize - 1; i++) {

            TreeNode aux = paths.getFirst().get(i);
            boolean equals = true;

            for (int j = 1; j < paths.size(); j++) {
                if (paths.get(j).get(i).val != aux.val) {
                    equals = false;
                    break;
                }
            }

            if (equals) {
                response = aux;
            }
        }

        return response;
    }

    private void process(List<TreeNode> path, TreeNode root, int level) {


        if (root == null) {
            if (level > pathSize) {
                pathSize = level;
                paths.clear();
                paths.add(path);
            } else if (level == pathSize) {
                if (!paths.contains(path)) {
                    paths.add(path);
                }
            }
        } else {

            List<TreeNode> pathLeft = new ArrayList<>(path);
            List<TreeNode> pathRight = new ArrayList<>(path);

            pathLeft.add(root.left);
            pathRight.add(root.right);

            process(pathLeft, root.left, level + 1);
            process(pathRight, root.right, level + 1);
        }


    }


}
