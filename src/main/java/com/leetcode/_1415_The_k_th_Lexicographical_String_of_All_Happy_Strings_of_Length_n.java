package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*A happy string is a string that:

consists only of letters of the set ['a', 'b', 'c'].
s[i] != s[i + 1] for all values of i from 1 to s.length - 1 (string is 1-indexed).
For example, strings "abc", "ac", "b" and "abcbabcbcb" are all happy strings and strings "aa", "baa" and "ababbc" are not happy strings.

Given two integers n and k, consider a list of all happy strings of length n sorted in lexicographical order.

Return the kth string of this list or return an empty string if there are less than k happy strings of length n.

 */
public class _1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n {

    public String getHappyString(int n, int k) {

        char[] abc = new char[]{'a', 'b', 'c'};

        List<String> ans = new ArrayList<>();

        backTracking(abc, -1, n, new StringBuilder(), ans);

        Collections.sort(ans);

        return ans.size() < k ? "" : ans.get(k - 1);
    }

    private void backTracking(char[] abc, int index, int size, StringBuilder sb, List<String> ans) {

        if (sb.length() > size) {
            return;
        }

        if (size == sb.length()) {
            ans.add(sb.toString());
        }

        for (int i = 0; i < abc.length; i++) {
            if (index != i) {
                sb.append(abc[i]);
                backTracking(abc, i, size, sb, ans);
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }


}
