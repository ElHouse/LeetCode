package com.leetcode;


public class _838_Push_Dominoes {


    public String pushDominoes(String dominoes) {

        char[] letters = dominoes.toCharArray();

        for (int i = 0; i < letters.length; i++) {

            char letter = letters[i];

            if (letter != '.') {

                if (letter == 'R') {

                    int left = i;
                    int right = i + 1;
                    int count = 0;

                    while (right < letters.length && letters[right] == '.') {
                        right++;
                        count++;
                    }

                    if (right < letters.length && letters[right] == 'L') {
                        int mitad = left + (right - left) / 2;
                        for (int j = left; (count % 2 == 0) ? j <= mitad : j < mitad; j++) {
                            letters[j] = 'R';
                        }
                        for (int j = mitad + 1; j < right; j++) {
                            letters[j] = 'L';
                        }
                    } else {
                        if (right >= letters.length) right--;
                        for (int j = left; j <= right; j++) {
                            letters[j] = 'R';
                        }
                    }
                 } else {

                    int left = i;
                    int right = i - 1;

                    while (right >= 0 && letters[right] == '.') {
                        right--;
                    }

                    if (right >= 0 && letters[right] == 'R') {
                        int mitad = right + (left - right) / 2;
                        for (int j = left; j > mitad; j--) {
                            letters[j] = 'L';
                        }
                        for (int j = mitad - 1; j > right; j--) {
                            letters[j] = 'R';
                        }
                    } else {
                        if (right == -1) right = 0;
                        for (int j = left; j >= right; j--) {
                            letters[j] = 'L';
                        }
                    }
                }
            }
        }

        return new String(letters);
    }


    public String pushDominoes2(String dominoes) {

        boolean change = true;


        while (change) {
            change = false;

            char[] letters = dominoes.toCharArray();

            for (int i = 0; i < letters.length; i++) {

                if (dominoes.charAt(i) != '.') {
                    continue;
                }

                if (i == 0) {
                    if (1 < letters.length && dominoes.charAt(1) == 'L') {
                        change = true;
                        letters[0] = 'L';
                    }
                } else if (letters.length - 1 == i) {
                    if (dominoes.charAt(letters.length - 2) == 'R') {
                        change = true;
                        letters[letters.length - 1] = 'R';
                    }
                } else {
                    if (dominoes.charAt(i - 1) == 'R' && (dominoes.charAt(i + 1) == '.' || dominoes.charAt(i + 1) == 'R')) {
                        change = true;
                        letters[i] = 'R';
                    } else if (dominoes.charAt(i + 1) == 'L' && (dominoes.charAt(i - 1) == '.' || dominoes.charAt(i - 1) == 'L')) {
                        change = true;
                        letters[i] = 'L';
                    }
                }
            }

            dominoes = new String(letters);
        }


        return dominoes;
    }

}
