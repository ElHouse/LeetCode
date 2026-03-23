package com.leetcode;

/**
 * A sentence consists of lowercase letters ('a' to 'z'), digits ('0' to '9'), hyphens ('-'), punctuation marks ('!', '.', and ','), and spaces (' ') only. Each sentence can be broken down into one or more tokens separated by one or more spaces ' '.
 * <p>
 * A token is a valid word if all three of the following are true:
 * <p>
 * It only contains lowercase letters, hyphens, and/or punctuation (no digits).
 * There is at most one hyphen '-'. If present, it must be surrounded by lowercase characters ("a-b" is valid, but "-ab" and "ab-" are not valid).
 * There is at most one punctuation mark. If present, it must be at the end of the token ("ab,", "cd!", and "." are valid, but "a!b" and "c.," are not valid).
 * Examples of valid words include "a-b.", "afad", "ba-c", "a!", and "!".
 * <p>
 * Given a string sentence, return the number of valid words in sentence.
 */
public class _2047_Number_of_Valid_Words_in_a_Sentence {


    public int countValidWords(String sentence) {

        if (sentence == null) return 0;

        int count = 0;
        String[] words = sentence.split(" ");


        for (String word : words) {
            if (validToken(word)) {
                count++;
            }
        }

        return count;
    }


    private boolean validToken(String str) {

        if (str.isEmpty()) return false;

        int countHyphen = 0;

        for (int i = 0; i < str.length(); i++) {

            var c = str.charAt(i);

            if (Character.isDigit(c)) {
                return false;
            } else if (c == '-') {
                if (countHyphen > 0) {
                    return false;
                }
                countHyphen++;

                if (i + 1 < str.length() && i - 1 >= 0) {
                    if (!Character.isLetter(str.charAt(i + 1))) {
                        return false;
                    }

                    if (!Character.isLetter(str.charAt(i - 1))) {
                        return false;
                    }
                } else {
                    return false;
                }

            } else if (c >= 65 && c <= 90) {
                return false;
            } else if (c == '!' || c == '.' || c == ',') {
                if (i + 1 != str.length()) {
                    return false;
                }
            }
        }

        return true;
    }


}
