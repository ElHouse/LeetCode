package com.hackerRank;

public class _18_special_palindrome_again {


    public long substrCount(int n, String s) {

        long count = s.length();

        for (int size = 2; size <= s.length(); size++) {

            for (int i = 0; i + size <= s.length(); i++) {

                String sub = s.substring(i, i + size);
                if (isPalindrome(sub)) {
                    count++;
                }
            }
        }
        return count;

    }


    private static boolean isPalindrome(String str) {

        char prev = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != prev) {
                count++;
            }
        }

        if (count == 1) {
            return true;
        } else if (count == 2) {
            int mitad = (str.length() == 2) ? 0 : str.length() / 2;

            if (str.charAt(mitad) != prev) {
                return true;
            }
        }

        return false;
    }

}
