package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _168_Excel_Sheet_Column_TitleTest {


    private final _168_Excel_Sheet_Column_Title excelSheetColumnTitle = new _168_Excel_Sheet_Column_Title();

    @Test
    public void case1() {
        System.out.println("case 1");
        assertEquals("B", excelSheetColumnTitle.convertToTitle(1));
    }


    @Test
    public void case2() {

        System.out.println("----------case 2");
        assertEquals("C", excelSheetColumnTitle.convertToTitle(28));
    }


 //   @Test
    public void case3() {

        System.out.println("case 3");
        assertEquals("ZY", excelSheetColumnTitle.convertToTitle(701));
    }


    @Test
    public void case4() {

        System.out.println("case 4");
        assertEquals("A", excelSheetColumnTitle.convertToTitle(702));
    }

    @Test
    public void case5() {

        System.out.println("case 5");
        assertEquals("B", excelSheetColumnTitle.convertToTitle(703));
    }
}