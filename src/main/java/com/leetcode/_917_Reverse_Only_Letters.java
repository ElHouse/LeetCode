package com.leetcode;

/*
 Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.



Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
  */
public class _917_Reverse_Only_Letters {


    public String reverseOnlyLetters(String s) {

        char[] letters = new char[s.length()];

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char letterA = s.charAt(left);
            char letterB = s.charAt(right);

            if (!Character.isLetter(letterA)) {
                letters[left] = letterA;
                ++left;
            } else if (!Character.isLetter(letterB)) {
                letters[right] = letterB;
                --right;
            } else {
                letters[left++] = letterB;
                letters[right--] = letterA;
            }
        }

        if (left == right) {
            letters[right] = s.charAt(left);
        }


        return new String(letters);
    }

}
