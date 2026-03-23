package com.leetcode;

import java.util.Stack;

/*
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.



Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"
 */
public class _1047_Remove_All_Adjacent_Duplicates_In_String {

    public String removeDuplicates(String s) {

        if(s == null) return null;

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char letter = s.charAt(i);

            if (stack.isEmpty()) {
                stack.add(letter);
                sb.append(letter);
            } else {

                if (stack.peek() == letter) {
                    stack.pop();
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    stack.add(letter);
                    sb.append(letter);
                }
            }
        }

        return sb.toString();
    }


}
