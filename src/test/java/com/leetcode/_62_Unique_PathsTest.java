package com.leetcode;

import com.leetcode.pendientes._62_Unique_Paths;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _62_Unique_PathsTest {

    private final _62_Unique_Paths uniquePaths = new _62_Unique_Paths();

    @Test
    public void test1() {
        assertEquals(28, uniquePaths.uniquePaths(3, 7));
        assertEquals(3, uniquePaths.uniquePaths(3, 2));
        assertEquals(8178, uniquePaths.uniquePaths(23, 12));
     //   assertEquals(23, uniquePaths.uniquePaths(100, 100));
    }

}