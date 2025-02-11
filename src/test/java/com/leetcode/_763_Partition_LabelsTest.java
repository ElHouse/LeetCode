package com.leetcode;

import org.junit.jupiter.api.Test;

class _763_Partition_LabelsTest {

    _763_Partition_Labels partition_labels = new _763_Partition_Labels();


    //	@Test
    public void case1() {

        String S = "ababcbacadefegdehijhklij";

        partition_labels.partitionLabels(S);

    }

    //	@Test
    public void case2() {
//                  0123456789
        String S = "eaaaabaaec";

        partition_labels.partitionLabels(S);

    }

    @Test
    public void case3() {
//                  012345678901234
        String S = "qiejxqfnqceocmy";
        //13 1 1
        partition_labels.partitionLabels(S);

    }
}