package com.leetcode;

public class _330_FindTheK_thCharacterInStringGame_I {


    public char kthCharacter(int k) {

        char[] word = new char[1];
        word[0] = 'a';

        while (true) {

            if (word.length > k) {
                return word[k-1];
            }

            char[] aux = new char[word.length * 2];

            for (int i = 0; i < word.length; i++) {
                aux[i] = word[i];
            }

            int count = 0;
            for (int i = word.length; i < aux.length; i++) {
                char nextLetter = word[count++];

                if (nextLetter == 'z') {
                    nextLetter = 'a';
                } else {
                    nextLetter = (char) (nextLetter + 1);
                }

                aux[i] = nextLetter;
            }

            word = aux;

        }


    }


}
