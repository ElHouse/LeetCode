package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1496_Path_CrossingTest {

    private final _1496_Path_Crossing pathCrossing = new _1496_Path_Crossing();

    @Test
    public void test01(){


        assertFalse(this.pathCrossing.isPathCrossing("NES"));
    }


    @Test
    public void test02(){


        assertTrue(this.pathCrossing.isPathCrossing("NESWW"));
    }

    @Test
    public void test03(){


        assertTrue(this.pathCrossing.isPathCrossing("NNSWWEWSSESSWENNW"));
    }


    @Test
    public void test04(){


        assertTrue(this.pathCrossing.isPathCrossing("NNNNNNS"));
    }
}

