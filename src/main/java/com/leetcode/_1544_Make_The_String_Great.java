package com.leetcode;

public class _1544_Make_The_String_Great {


    public String makeGood(String s) {

        if (s == null) return null;

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (sb.isEmpty()) {
                sb.append(c);
            } else {
                if (Math.abs(c - sb.charAt(sb.length() - 1)) == 32) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(c);
                }
            }
        }


        return sb.toString();
    }

}
