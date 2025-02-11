package com.leetcode;

import java.util.Arrays;

public class _1657_Determine_if_Two_Strings_Are_Close {

/*

Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.



Example 1:

Input: word1 = "abc", word2 = "bca"
Output: true
Explanation: You can attain word2 from word1 in 2 operations.
Apply Operation 1: "abc" -> "acb"
Apply Operation 1: "acb" -> "bca"
Example 2:

Input: word1 = "a", word2 = "aa"
Output: false
Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
Example 3:

Input: word1 = "cabbba", word2 = "abbccc"
Output: true
Explanation: You can attain word2 from word1 in 3 operations.
Apply Operation 1: "cabbba" -> "caabbb"
Apply Operation 2: "caabbb" -> "baaccc"
Apply Operation 2: "baaccc" -> "abbccc"

 */



    public boolean closeStrings(String word1, String word2) {

        if (word1.isEmpty() || word2.isEmpty()) return false;

        int[] listaRepetidos = new int[26];
        int[] listaRepetidos2 = new int[26];
        int[] abecedario = new int[26];
        int[] abecedario2 = new int[26];

        countRepetitions(word1, abecedario, listaRepetidos);
        countRepetitions(word2, abecedario2, listaRepetidos2);

        Arrays.sort(abecedario);
        Arrays.sort(abecedario2);

        return word1.length() == word2.length() && Arrays.equals(abecedario, abecedario2) && Arrays.equals(listaRepetidos, listaRepetidos2);
    }


    private void countRepetitions(String word, int[] abecedario, int[] listaRepetidos) {

        char[] letras = word.toCharArray();
        Arrays.sort(letras);

        int letra = letras[0];
        int count = 1;

        for (int i = 1; i < word.length(); i++) {

            if (letra != letras[i]) {
                int index = Character.toLowerCase(letras[i]) - 'a' - 1;
                abecedario[index] = count;
                listaRepetidos[index] = 1;
                count = 1;
                letra = letras[i];
            } else {
                count++;
            }

        }

        int index = Character.toLowerCase(letra) - 'a';
        listaRepetidos[index] = 1;
        abecedario[index] = count;

    }

}
