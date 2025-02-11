package com.leetcode;

import com.leetcode.structure.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class _429_N_ary_Tree_Level_Order_TraversalTest {

    _429_N_ary_Tree_Level_Order_Traversal levelOrder = new _429_N_ary_Tree_Level_Order_Traversal();
//TODO asserts
    @Test
    public void case1() {

        Node root = new Node(1, null);

        Node root21 = new Node(3, null);
        Node root22 = new Node(2, null);
        Node root23 = new Node(4, null);

        Node root31 = new Node(5, null);
        Node root32 = new Node(6, null);
        Node root33 = new Node(8, null);
        Node root34 = new Node(11, null);

        Node root41 = new Node(7, null);

        Node root51 = new Node(91, null);
        Node root52 = new Node(92, null);
        Node root53 = new Node(93, null);

        List<Node> c1 = new ArrayList<>();
        c1.add(root21);
        c1.add(root22);
        c1.add(root23);
        root.children = c1;

        List<Node> c3 = new ArrayList<>();
        c3.add(root31);
        c3.add(root32);
        root21.children = c3;

        List<Node> c2 = new ArrayList<>();
        c2.add(root33);
        root22.children = c2;

        List<Node> c4 = new ArrayList<>();
        c4.add(root34);
        root23.children = c4;

        List<Node> c8 = new ArrayList<>();
        c8.add(root41);
        root33.children = c8;

        List<Node> c7 = new ArrayList<>();
        c7.add(root51);
        c7.add(root52);
        c7.add(root53);
        root41.children = c7;

        levelOrder.levelOrder(root);


    }
}