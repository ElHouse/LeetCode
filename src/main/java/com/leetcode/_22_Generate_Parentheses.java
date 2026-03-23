package com.leetcode;

import java.util.ArrayList;
import java.util.List;


public class _22_Generate_Parentheses {

    public List<String> generateParenthesis(int n) {

        List<String> response = new ArrayList<>();

        bt(response, new StringBuilder(), n, n);

        return response;
    }

    private void bt(List<String> response, StringBuilder sb, int a, int c) {

        if (a == 0 && c == 0) {
            response.add(sb.toString());
        }

        if (c < a) {
            return;
        }

        if (a > 0) {
            sb.append("(");
            bt(response, sb, a - 1, c);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (c > 0) {
            sb.append(")");
            bt(response, sb, a, c - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
