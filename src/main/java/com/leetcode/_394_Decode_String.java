package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class _394_Decode_String {



    //Solucion con recursividad 2025
    public String decodeString(String s) {

        if (s == null || s.isEmpty()) return "";

        Queue<Integer> stackNumero = new LinkedList<>();
        Queue<String> stackTexto = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {


                int x = i;
                while (true) {
                    if (!Character.isDigit(s.charAt(++x))) {
                        break;
                    }
                }

                stackNumero.add(Integer.valueOf(s.substring(i, x)));

                i = x - 1;

                String corA = "[";
                String corC = "]";

                int countA = 1;
                int countC = 0;

                int j = i + 2;
                for (; j < s.length(); j++) {

                    if (String.valueOf(s.charAt(j)).equals(corA)) {
                        countA++;
                    } else if (String.valueOf(s.charAt(j)).equals(corC)) {
                        countC++;
                    }

                    if (countA == countC) {
                        break;
                    }
                }

                if (countA == 1) {
                    stackTexto.add(s.substring(i + 2, j));
                } else {
                    stackTexto.add(decodeString(s.substring(i + 2, j)));
                }


                i = j;
            } else {
                stackNumero.add(1);
                stackTexto.add(String.valueOf(s.charAt(i)));
            }

        }

        while (!stackNumero.isEmpty()) {

            int num = stackNumero.poll();
            String text = stackTexto.poll();

            sb.append(text.repeat(num));
        }

        return sb.toString();
    }


    //Solucion 2019

    public String decodeString2(String s) {

        if (s == null) return "";

        return algo(s, 1);
    }

    public String algo(String s, int repeticions) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (count < repeticions) {

            for (int i = 0; i < s.length(); i++) {

                if (Character.isDigit(s.charAt(i))) {

                    int aux = i;
                    while (Character.isDigit(s.charAt(++aux))) {
                    }

                    aux--;

                    int j = finder(s, aux + 1);
                    sb.append(algo(s.substring(aux + 2, j), Integer.valueOf(s.substring(i, aux + 1))));
                    i = j;
                } else {
                    char c = s.charAt(i);
                    sb.append(c);
                }
            }
            count++;
        }

        return sb.toString();
    }


    public int finder(String s, int x) {

        Stack<Character> stack = new Stack<>();
        for (int i = x; i < s.length(); i++) {

            if (s.charAt(i) == '[') {
                stack.add('[');
            } else if (s.charAt(i) == ']') {
                stack.pop();
            }

            if (stack.isEmpty()) return i;

        }
        return -1;
    }


}
