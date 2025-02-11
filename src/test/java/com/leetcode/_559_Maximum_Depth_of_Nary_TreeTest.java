package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _559_Maximum_Depth_of_Nary_TreeTest {

    _559_Maximum_Depth_of_Nary_Tree maximumDepthOfNaryTree = new _559_Maximum_Depth_of_Nary_Tree();

    @Test
    public void case1() {

        _559_Maximum_Depth_of_Nary_Tree.Node root1 = new _559_Maximum_Depth_of_Nary_Tree.Node(1, null);

        _559_Maximum_Depth_of_Nary_Tree.Node root2 = new _559_Maximum_Depth_of_Nary_Tree.Node(3, null);
        _559_Maximum_Depth_of_Nary_Tree.Node root3 = new _559_Maximum_Depth_of_Nary_Tree.Node(2, null);
        _559_Maximum_Depth_of_Nary_Tree.Node root4 = new _559_Maximum_Depth_of_Nary_Tree.Node(4, null);

        _559_Maximum_Depth_of_Nary_Tree.Node root5 = new _559_Maximum_Depth_of_Nary_Tree.Node(5, null);
        _559_Maximum_Depth_of_Nary_Tree.Node root6 = new _559_Maximum_Depth_of_Nary_Tree.Node(6, null);


        List<_559_Maximum_Depth_of_Nary_Tree.Node> children = new ArrayList<>();
        children.add(root2);
        children.add(root3);
        children.add(root4);

        List<_559_Maximum_Depth_of_Nary_Tree.Node> children2 = new ArrayList<>();
        children2.add(root5);
        children2.add(root6);

        root2.children = children2;
        root1.children = children;


        assertEquals(3, maximumDepthOfNaryTree.maxDepth(root1));

    }


    @Test
    public void case2() {

        _559_Maximum_Depth_of_Nary_Tree.Node root1 = new _559_Maximum_Depth_of_Nary_Tree.Node(1, null);


        assertEquals(1, maximumDepthOfNaryTree.maxDepth(root1));

    }

    @Test
    public void case3() {

        _559_Maximum_Depth_of_Nary_Tree.Node root1 = new _559_Maximum_Depth_of_Nary_Tree.Node(1, null);

        _559_Maximum_Depth_of_Nary_Tree.Node root2 = new _559_Maximum_Depth_of_Nary_Tree.Node(3, null);
        _559_Maximum_Depth_of_Nary_Tree.Node root3 = new _559_Maximum_Depth_of_Nary_Tree.Node(2, null);
        _559_Maximum_Depth_of_Nary_Tree.Node root4 = new _559_Maximum_Depth_of_Nary_Tree.Node(4, null);

        _559_Maximum_Depth_of_Nary_Tree.Node root5 = new _559_Maximum_Depth_of_Nary_Tree.Node(5, null);
        _559_Maximum_Depth_of_Nary_Tree.Node root6 = new _559_Maximum_Depth_of_Nary_Tree.Node(6, null);

        _559_Maximum_Depth_of_Nary_Tree.Node root7 = new _559_Maximum_Depth_of_Nary_Tree.Node(7, null);
        _559_Maximum_Depth_of_Nary_Tree.Node root8 = new _559_Maximum_Depth_of_Nary_Tree.Node(8, null);


        List<_559_Maximum_Depth_of_Nary_Tree.Node> children = new ArrayList<>();
        children.add(root2);
        children.add(root3);
        children.add(root4);

        List<_559_Maximum_Depth_of_Nary_Tree.Node> children2 = new ArrayList<>();
        children2.add(root5);
        children2.add(root6);

        List<_559_Maximum_Depth_of_Nary_Tree.Node> children3 = new ArrayList<>();
        children3.add(root7);
        children3.add(root8);


        root2.children = children2;
        root1.children = children;
        root6.children = children3;


        assertEquals(4, maximumDepthOfNaryTree.maxDepth(root1));

    }
}