package com.leetcode;

/***
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
 *
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
 * Return the resulting string.
 *
 *
 *
 * Example 1:
 *
 * Input: word = "abcdefd", ch = "d"
 * Output: "dcbaefd"
 * Explanation: The first occurrence of "d" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
 * Example 2:
 *
 * Input: word = "xyxzxe", ch = "z"
 * Output: "zxyxxe"
 * Explanation: The first and only occurrence of "z" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
 * Example 3:
 *
 * Input: word = "abcd", ch = "z"
 * Output: "abcd"
 * Explanation: "z" does not exist in word.
 * You should not do any reverse operation, the resulting string is "abcd".
 */
public class _2000_Reverse_Prefix_of_Word {

//Faster solution
    public String reversePrefix(String word, char ch) {

        char[] letters = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ch) {

                int left = 0;
                int right = i;

                while (left <= right) {

                    char aux = letters[left];
                    letters[left] = letters[right];
                    letters[right] = aux;
                    left++;
                    right--;
                }
                break;
            }

        }

        return String.valueOf(letters);
    }

    public String reversePrefix3(String word, char ch) {

        StringBuilder sb = new StringBuilder();
        int aux = -1;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ch) {
                aux = i;
                break;
            }
        }

        if (aux == -1) return word;

        for (int i = aux; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        for (int i = aux + 1; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }

    public String reversePrefix2(String word, char ch) {

        char[] letters = new char[word.length()];

        int i = 0;

        for (; i < word.length(); i++) {

            char aux = word.charAt(i);

            if (aux == ch) {

                int left = 0;
                int right = i;

                while (left <= right) {

                    char numLeft = word.charAt(left);
                    char numRight = word.charAt(right);

                    letters[left] = numRight;
                    letters[right] = numLeft;

                    left++;
                    right--;
                }
                i++;

                for (; i < word.length(); i++) {
                    letters[i] = word.charAt(i);
                }

                return String.valueOf(letters);
            }
        }

        return word;
    }
}
