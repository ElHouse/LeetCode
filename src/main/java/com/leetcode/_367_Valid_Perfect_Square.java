package com.leetcode;

public class _367_Valid_Perfect_Square {

    //	Runtime: 792 ms, faster than 5.08% of Java online submissions for Valid Perfect Square.
    //	Memory Usage: 32.9 MB, less than 6.12% of Java online submissions for Valid Perfect Square.
    public boolean isPerfectSquare(int num) {


        System.out.println("num>" + num);
        if (num == 1) return true;

        for (int i = 1; i < num; i++) {
            if (i * i == num) {
                return true;
            } else if (i * i > num) {
                return false;
            }
        }

        return false;
    }


}
