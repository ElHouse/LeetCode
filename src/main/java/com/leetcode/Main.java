package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        //    List<Integer> lista = List.of(100, 50, 50, 50, 50, 50, 50, 50, 30);
        //  List<Integer> lista = List.of(5, 4, 4, 3, 3, 1);  int kMax = 4;
        List<Integer> lista = List.of(5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1);        int kMax = 2;

        Map<Integer, Integer> map = lista
                .stream()
                .sorted()
                .collect(
                        Collectors.toMap(k -> k,
                                v -> 1,
                                (v1, v2) -> v1 + 1));

        int countK = 0;
        int result = 0;

        for (Integer a : map.keySet()
                .stream()
                .sorted()
                .toList()) {

            if (countK >= kMax) break;

            int aux = map.get(a);
            if(aux == 0 ) continue;

            if (aux == 1) {
                result += aux;
                countK += 1;
            } else {
                countK += 2;
                result += aux;
            }

        }

        System.out.println(result);


    }
}