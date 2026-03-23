package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _388_Longest_Absolute_FilePathTest {


    private final _388_Longest_Absolute_FilePath longestAbsoluteFilePath = new _388_Longest_Absolute_FilePath();


    @Test
    public void test01() {

        longestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");
    }

}