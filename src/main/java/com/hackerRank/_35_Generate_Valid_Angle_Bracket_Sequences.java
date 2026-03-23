package com.hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _35_Generate_Valid_Angle_Bracket_Sequences {


    public List<String> generateAngleBracketSequences(int n) {

        if (n <= 0) return new ArrayList<>();

        List<String> response = new ArrayList<>();

        recursion(n * 2, new StringBuilder("<"), response);

        return response;
    }


    private static void recursion(int n, StringBuilder sb, List<String> list) {

        if (sb.length() == n) {
            if (isValid(sb.toString())) {
                list.add(sb.toString());
            }
            return;
        }

        StringBuilder sbAbre = new StringBuilder(sb).append("<");
        StringBuilder sbCiere = new StringBuilder(sb).append(">");

        recursion(n, sbAbre, list);
        recursion(n, sbCiere, list);
    }

    private static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '<') {
                stack.add('<');
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }


}
