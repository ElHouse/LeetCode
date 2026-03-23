package com.leetcode;

/*
Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

Return the minimum number of substrings in such a partition.

Note that each character should belong to exactly one substring in a partition.
 */

import java.util.HashSet;
import java.util.Set;

public class _2405_Optimal_Partition_of_String {


    public int partitionString(String s) {

        int count = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            if (set.contains(s.charAt(i))) {
                set.clear();
                count++;
            }

            set.add(s.charAt(i));
        }


        return count+1;
    }

}
