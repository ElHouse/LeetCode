package com.leetcode;


public class _168_Excel_Sheet_Column_Title {


    private String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "Q", "R", "S", "T", "U", "v", "W", "X", "Y", "Z"};

    //TODO: no funciona ver que onda

    public String letterFinder(int n) {

        int x = n % 26;
        int y = n % 26;
        String letter = "";


        if (x < 26) {
            letter += alphabet[x];

        } else {
            letterFinder(x);
        }

        System.out.println(n + "---" + letter);

        return letter;
    }

    public String convertToTitle(int n) {

        return letterFinder(n);
    }

}
