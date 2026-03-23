package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _05_crushTest {


    _05_crush crush = new _05_crush();

    @Test
    public void test01() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(1, 5, 3));
        queries.add(List.of(4, 8, 7));
        queries.add(List.of(6, 9, 1));

        assertEquals(10, crush.arrayManipulation(10, queries));
    }

    @Test
    public void test02() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(1, 2, 100));
        queries.add(List.of(2, 5, 100));
        queries.add(List.of(3, 4, 100));

        assertEquals(200, crush.arrayManipulation(5, queries));
    }


    @Test
    public void test03() throws IOException {

        String rutaArchivo = "src/test/java/com/hackerRank/resources/_05_crush_file_01.txt";
        List<List<Integer>> queries = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                List<Integer> aux = new ArrayList<>();
                String[] partes = linea.trim().split("\\s+");
                int[] numeros = Arrays.stream(partes).mapToInt(Integer::parseInt).toArray();
                aux.add(numeros[0]);
                aux.add(numeros[1]);
                aux.add(numeros[2]);
                queries.add(aux);
            }
        }


        assertEquals(2_484_930_878L, crush.arrayManipulation3(10_000_000, queries));
    }


}