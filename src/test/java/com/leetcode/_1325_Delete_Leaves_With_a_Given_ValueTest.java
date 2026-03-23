package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _1325_Delete_Leaves_With_a_Given_ValueTest {


    private final _1325_Delete_Leaves_With_a_Given_Value deleteLeavesWithAGivenValue = new _1325_Delete_Leaves_With_a_Given_Value();


    @Test
    public void test01() {

        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 2, null, 2, null, 2));
        TreeNode.imprimirPorNiveles(root);

        deleteLeavesWithAGivenValue.removeLeafNodes(root, 2);

        System.out.println("FIN");
        TreeNode.imprimirPorNiveles(root);
    }


    @Test
    public void test02() {

        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 2));
        TreeNode.imprimirPorNiveles(root);

        deleteLeavesWithAGivenValue.removeLeafNodes(root, 2);

        System.out.println("FIN");
        TreeNode.imprimirPorNiveles(root);
    }


    @Test
    public void test03() {

        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 3, 3, 3, 2));
        TreeNode.imprimirPorNiveles(root);

        deleteLeavesWithAGivenValue.removeLeafNodes(root, 3);

        System.out.println("FIN");
        TreeNode.imprimirPorNiveles(root);
    }

    @Test
    public void test04() {

        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 2, 3, 2, null, 2, 4));
        TreeNode.imprimirPorNiveles(root);

        deleteLeavesWithAGivenValue.removeLeafNodes(root, 2);

        System.out.println("FIN");
        TreeNode.imprimirPorNiveles(root);
    }

    @Test
    public void test05() {

        TreeNode root = TreeNode.buildTree(Arrays.asList(1));
        TreeNode.imprimirPorNiveles(root);

        TreeNode result = deleteLeavesWithAGivenValue.removeLeafNodes(root, 1);
        assertNull(result);
    }

}