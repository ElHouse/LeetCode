package com.leetcode;

import java.util.ArrayList;
import java.util.List;


public class _559_Maximum_Depth_of_Nary_Tree {


    //	Runtime: 1 ms, faster than 97.69% of Java online submissions for Maximum Depth of N-ary Tree.
//	Memory Usage: 46.5 MB, less than 50.00% of Java online submissions for Maximum Depth of N-ary
    public int max = 0;

    public int maxDepth(Node root) {

        if (root != null) {
            findMaxDepth(root, 0);
        }

        return max;
    }

    public void findMaxDepth(Node root, int aux) {
        aux++;
        max = Math.max(max, aux);

        if (root.children != null) {
            for (Node child : root.children) {
                findMaxDepth(child, aux);
            }
        }
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

}


