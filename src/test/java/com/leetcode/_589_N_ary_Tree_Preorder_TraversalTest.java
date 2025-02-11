package com.leetcode;

import com.leetcode.structure.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _589_N_ary_Tree_Preorder_TraversalTest {
    //TODO asserts
    _589_N_ary_Tree_Preorder_Traversal nAryTreePreorderTraversal = new _589_N_ary_Tree_Preorder_Traversal();

    @Test
    public void case1() {

        System.out.println("----------case 1");
        Node root = new Node(1, null);

        Node root11 = new Node(3, null);
        Node root12 = new Node(2, null);
        Node root13 = new Node(4, null);


        Node root21 = new Node(5, null);
        Node root22 = new Node(6, null);

        List<Node> c1 = new ArrayList<>();
        c1.add(root11);
        c1.add(root12);
        c1.add(root13);

        List<Node> c2 = new ArrayList<>();
        c2.add(root21);
        c2.add(root22);


        root.children = c1;
        root11.children = c2;

        nAryTreePreorderTraversal.preorder(root);

    }

    @Test
    public void case2() {
        System.out.println("----------case 2");
        Node root = new Node(1, null);

        Node root11 = new Node(3, null);
        Node root12 = new Node(2, null);
        Node root13 = new Node(4, null);


        Node root21 = new Node(5, null);
        Node root22 = new Node(6, null);


        Node root2a = new Node(7, null);
        Node root2b = new Node(8, null);


        Node root3a = new Node(9, null);
        Node root3b = new Node(10, null);

        List<Node> c1 = new ArrayList<>();
        c1.add(root11);
        c1.add(root12);
        c1.add(root13);

        List<Node> c2 = new ArrayList<>();
        c2.add(root21);
        c2.add(root22);

        List<Node> c3 = new ArrayList<>();
        c3.add(root2a);
        c3.add(root2b);

        List<Node> c4 = new ArrayList<>();
        c4.add(root3a);
        c4.add(root3b);

        root.children = c1;
        root11.children = c2;
        root12.children = c3;
        root13.children = c4;


        //5 6 3 7 8 2 9 10 4 1
        nAryTreePreorderTraversal.preorder(root);

    }


    @Test
    public void case3() {

        System.out.println("----------case 3");
        Node root = new Node(1, null);

        Node root11 = new Node(3, null);
        Node root12 = new Node(2, null);
        Node root13 = new Node(4, null);


        Node root21 = new Node(5, null);
        Node root22 = new Node(6, null);


        Node root2a = new Node(7, null);
        Node root2b = new Node(8, null);


        Node root3a = new Node(9, null);
        Node root3b = new Node(10, null);

        Node root4a = new Node(11, null);
        Node root4b = new Node(12, null);


        List<Node> c1 = new ArrayList<>();
        c1.add(root11);
        c1.add(root12);
        c1.add(root13);

        List<Node> c2 = new ArrayList<>();
        c2.add(root21);
        c2.add(root22);

        List<Node> c3 = new ArrayList<>();
        c3.add(root2a);
        c3.add(root2b);

        List<Node> c4 = new ArrayList<>();
        c4.add(root3a);
        c4.add(root3b);

        List<Node> c5 = new ArrayList<>();
        c5.add(root4a);
        c5.add(root4b);

        root.children = c1;
        root11.children = c2;
        root12.children = c3;
        root13.children = c4;

        root22.children = c5;

        //5 11 12 6 3 7 8 2 9 10 4 1
        nAryTreePreorderTraversal.preorder(root);

    }

}