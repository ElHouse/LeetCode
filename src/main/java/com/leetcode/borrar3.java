package com.leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class borrar3 {
    public static void main(String[] args) {


        Set<Integer> setOrenado = new TreeSet<>();
        Set<Integer> set = new HashSet<>();
        Queue<Integer> coia = new LinkedList<>();
        Stack<Integer> pila = new Stack<>();
        PriorityQueue<Integer> colaPrioridad = new PriorityQueue<>((q, w) -> q - w);
        Deque<String> colaDoble = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> listaBasica = new LinkedList<>(set);
        List<Integer> lista = new ArrayList<>(List.of(100, 50, 50, 40, 30));

        int suma = Stream.of(listaBasica, lista)
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .sum();

        int suma2 = Stream.concat(listaBasica.stream(), lista.stream())
                .mapToInt(Integer::intValue)
                .sum();

  /*      Integer maxi = listaBasica.stream()
                .max(Comparator.naturalOrder())
                .get();
*/
        IntStream.range(0, Math.min(lista.size(), lista.size()))
                .forEach(i -> {
                    int min = Math.min(
                            map.getOrDefault(lista.get(i), -1),
                            lista.get(i)
                    );
                    map.put(lista.get(i), min);
                });

        int suma1 = map.keySet().stream()
                .reduce(0, (aa, bb) -> aa + bb);

        long suma3 = map.keySet().stream()
                .mapToLong(Integer::longValue).sum();

        Map<Integer, Integer> map2 = lista.stream().collect(Collectors.toMap(
                k -> k,
                v -> 1,
                (integer, integer2) -> integer + integer2
        ));

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            return o2.getValue() - o1.getValue();
        });
       // map.entrySet().forEach(a -> priorityQueue.add(a));
    }
}
