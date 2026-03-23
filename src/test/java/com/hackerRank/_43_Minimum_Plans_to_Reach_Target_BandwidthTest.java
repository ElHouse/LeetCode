package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _43_Minimum_Plans_to_Reach_Target_BandwidthTest {
    _43_Minimum_Plans_to_Reach_Target_Bandwidth minimumPlansToReachTargetBandwidth = new _43_Minimum_Plans_to_Reach_Target_Bandwidth();

    @Test
    public void test00(){
        assertEquals(1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(Integer.MAX_VALUE), Integer.MAX_VALUE)); // único plan igual

    }

    @Test
    public void test01() {
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 2, 3), 6)); // 1 + 2 + 3

        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 2, 5), 6)); // 1 + 5
        assertEquals(1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(10, 20, 30), 30)); // solo 30
        assertEquals(1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(3, 4, 7), 7)); // 3 + 4

        // Casos imposibles
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(2, 4, 6), 5)); // no hay combinación
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(5, 10), 3)); // menor que el mínimo
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(), 10)); // lista vacía

        // Casos límite
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 2, 3), 0)); // objetivo 0
        assertEquals(1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(7), 7)); // único plan igual al objetivo
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(7), 8)); // único plan insuficiente

        // Múltiples combinaciones, elegir la mínima
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 3, 4), 6)); // 3 + 3 o 4 + 2
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 3, 5), 8)); // 3 + 5

        // Valores grandes
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(100, 200, 300), 500)); // 200 + 300
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(100, 200, 300), 250)); // no hay combinación

        // Repeticiones permitidas
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(2, 3), 6)); // 3 + 3
        assertEquals(3, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(2), 6));

        // Casos con múltiples combinaciones posibles
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 3, 4), 5)); // 1 + 4
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 3, 4), 6)); // 1 + 1 + 4
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(2, 3, 7), 5)); // 2 + 3

// Casos con planes grandes y pequeños
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 100), 101)); // 1 + 100
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(25, 50), 100)); // 50 + 25 + 25

// Casos con valores repetidos en la lista
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 2, 2, 3), 4)); // 2 + 2
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 2, 2, 3), 6)); // 2 + 2 + 2

// Casos con valores extremos
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(Integer.MAX_VALUE), Integer.MAX_VALUE - 1)); // imposible

// Casos con valores negativos (si se permiten)
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(-1, 2, 3), 1)); // -1 + 2
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(-2, -3), 5)); // imposible

// Casos con muchos planes pequeños
        assertEquals(10, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1), 10)); // diez veces 1
        assertEquals(5, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(2), 10)); // cinco veces 2

// Casos con combinación exacta usando todos los elementos
        assertEquals(3, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 2, 3, 4), 10));



// Combinaciones con números primos
        assertEquals(3, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(2, 3, 7), 8)); // 3 + 3 + 2
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(2, 3, 7), 9)); // 2 + 7

// Combinaciones con múltiplos
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(4, 6, 8), 12)); // 6 + 6
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(4, 6, 8), 14)); // 6 + 4 + 4

// Casos con planes que no dividen el objetivo
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(5, 10), 7)); // imposible
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(3, 6), 5)); // imposible

// Casos con objetivo muy pequeño
        assertEquals(1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 2, 3), 1)); // solo 1
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(2, 3), 1)); // imposible

// Casos con objetivo muy grande
        assertEquals(10, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(10), 100)); // diez veces 10
        assertEquals(4, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(25, 40), 100)); // 25 + 25 + 25 + 25

// Casos con planes que exceden el objetivo
        assertEquals(-1, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(100, 200), 50)); // imposible

// Casos con mezcla de valores grandes y pequeños
        assertEquals(3, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 50, 100), 102)); // 1 + 1 + 100
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(1, 50, 100), 101)); // 1 + 100

// Casos con valores repetidos en la lista
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(5, 5, 5), 10)); // 5 + 5
        assertEquals(3, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(5, 5, 5), 15)); // 5 + 5 + 5

// Casos con valores no ordenados
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(7, 1, 3), 10)); // 7 + 3
        assertEquals(2, minimumPlansToReachTargetBandwidth.findMinimumPlansForBandwidth(List.of(3, 1, 2), 6)); // 2 + 2 + 2

    }


}