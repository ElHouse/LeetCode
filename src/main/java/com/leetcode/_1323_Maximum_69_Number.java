package com.leetcode;

public class _1323_Maximum_69_Number {


    public int maximum69Number(int num) {

        char[] numberArray = String.valueOf(num).toCharArray();

        for (int i = 0; i < numberArray.length; i++) {

            if (numberArray[i] == '6') {
                numberArray[i] = '9';
                break;
            }
        }

        return Integer.parseInt(String.valueOf(numberArray));
    }


}
