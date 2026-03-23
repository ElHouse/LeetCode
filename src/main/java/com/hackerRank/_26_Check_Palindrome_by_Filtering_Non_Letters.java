package com.hackerRank;

public class _26_Check_Palindrome_by_Filtering_Non_Letters {


    public boolean isAlphabeticPalindrome(String code) {

        if (code == null || code.isEmpty()) return false;

        int a = 0;
        int b = code.length() - 1;

        code = code.toLowerCase().trim();

        while (a < b) {

            char cA = code.charAt(a);
            if (97 > cA || cA > 122) {
                a++;
                continue;
            }

            char cB = code.charAt(b);
            if (97 > cB || cB > 122) {
                b--;
                continue;
            }
             if (cB != cA) {
                return false;
            }

            a++;
            b--;
        }


        return true;
    }
}
