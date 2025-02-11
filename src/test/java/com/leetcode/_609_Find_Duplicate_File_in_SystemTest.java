package com.leetcode;


import static org.junit.jupiter.api.Assertions.assertEquals;

class _609_Find_Duplicate_File_in_SystemTest {

    _609_Find_Duplicate_File_in_System findDuplicateFileInSystem = new _609_Find_Duplicate_File_in_System();


   // @Test
    public void case1() {


        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        assertEquals("[[root/a/1.txt, root/c/3.txt], [root/a/2.txt, root/c/d/4.txt, root/4.txt]]", findDuplicateFileInSystem.findDuplicate(paths));

    }
}