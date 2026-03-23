package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _1302_Deepest_Leaves_Sum_Medium_Topics_premium_lock_icon_Companies_HintTest {


    private final _1302_Deepest_Leaves_Sum_Medium_Topics_premium_lock_icon_Companies_Hint deepestLeavesSumMediumTopicsPremiumLockIconCompaniesHint = new _1302_Deepest_Leaves_Sum_Medium_Topics_premium_lock_icon_Companies_Hint();

    @Test
    public void test01(){
        TreeNode head = TreeNode.buildTree(Arrays.asList(1,2,3,4,5,null,6,7,null,null,null,null,8));
        assertEquals(15, deepestLeavesSumMediumTopicsPremiumLockIconCompaniesHint.deepestLeavesSum(head));
    }
    @Test
    public void test02(){
        TreeNode head = TreeNode.buildTree(Arrays.asList(6,7,8,2,7,1,3,9,null,1,4,null,null,null,5));
        assertEquals(19, deepestLeavesSumMediumTopicsPremiumLockIconCompaniesHint.deepestLeavesSum(head));
    }

}