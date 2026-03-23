package com.hackerRank;

import java.util.Stack;

public class _21_Validate_Properly_Nested_Brackets {

    public boolean areBracketsProperlyMatched(String code_snippet) {
        // Write your code here

        Stack<Character> stack = new Stack<>();

        for (char c : code_snippet.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else if (c == ')') {
                if (stack.isEmpty()) return false;
                char last = stack.pop();
                if (last != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.isEmpty()) return false;
                char last = stack.pop();
                if (last != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty()) return false;
                char last = stack.pop();
                if (last != '{') {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }


        return true;
    }
}
