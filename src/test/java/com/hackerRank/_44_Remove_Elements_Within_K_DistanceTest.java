package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _44_Remove_Elements_Within_K_DistanceTest {

    _44_Remove_Elements_Within_K_Distance removeElementsWithinKDistance = new _44_Remove_Elements_Within_K_Distance();

    @Test
    void debounceTimestamps1() {
        assertEquals(3, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 1, 2, 2, 3), 0));

    }

    @Test
    void debounceTimestamps() {

        assertEquals(2, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 2, 3, 8, 10), 3));
        assertEquals(1, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 2, 3, 8, 10), 10));
        assertEquals(0, removeElementsWithinKDistance.debounceTimestamps(List.of(), 0));
        assertEquals(1, removeElementsWithinKDistance.debounceTimestamps(List.of(5), 0));


        assertEquals(2, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 2, 3, 8, 10), 3));

// Caso donde todos los elementos están separados por más de K
        assertEquals(5, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 5, 10, 15, 20), 3));

// Caso donde algunos elementos están justo a K de distancia
        assertEquals(4, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 4, 7, 10), 3));

// Caso con elementos repetidos
        assertEquals(2, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 1, 1, 5), 3));

// Caso con lista vacía
        assertEquals(0, removeElementsWithinKDistance.debounceTimestamps(List.of(), 3));

// Caso con un solo elemento
        assertEquals(1, removeElementsWithinKDistance.debounceTimestamps(List.of(10), 3));

// Caso con todos los elementos dentro de K
        assertEquals(2, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 2, 3, 4, 5), 3));

// Caso con K = 0 (solo se eliminan duplicados)
        assertEquals(5, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 2, 3, 4, 5), 0));
        assertEquals(3, removeElementsWithinKDistance.debounceTimestamps(List.of(1, 1, 2, 2, 3), 0));

    }
}