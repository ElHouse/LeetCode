package com.leetcode;

import java.util.Arrays;

public class _388_Longest_Absolute_FilePath {

/*

Suppose we have a file system that stores both files and directories. An example of one system is represented in the following picture:



Here, we have dir as the only directory in the root. dir contains two subdirectories, subdir1 and subdir2. subdir1 contains a file file1.ext and subdirectory subsubdir1. subdir2 contains a subdirectory subsubdir2, which contains a file file2.ext.

In text form, it looks like this (with ⟶ representing the tab character):

dir
⟶ subdir1
⟶ ⟶ file1.ext
⟶ ⟶ subsubdir1
⟶ subdir2
⟶ ⟶ subsubdir2
⟶ ⟶ ⟶ file2.ext
If we were to write this representation in code, it will look like this: "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext". Note that the '\n' and '\t' are the new-line and tab characters.

Every file and directory has a unique absolute path in the file system, which is the order of directories that must be opened to reach the file/directory itself, all concatenated by '/'s. Using the above example, the absolute path to file2.ext is "dir/subdir2/subsubdir2/file2.ext". Each directory name consists of letters, digits, and/or spaces. Each file name is of the form name.extension, where name and extension consist of letters, digits, and/or spaces.

Given a string input representing the file system in the explained format, return the length of the longest absolute path to a file in the abstracted file system. If there is no file in the system, return 0.

Note that the testcases are generated such that the file system is valid and no file or directory name has length 0.
*/

    int maxCount = -1;

    public int lengthLongestPath(String input) {

        process(input.trim(), 1, 0);

        return 0;
    }


    public void process(String input, int level, int count) {

        System.out.println("Level " + level);

        StringBuilder sb = new StringBuilder();
        sb.append("(\\\\n");
        sb.append("\\\\t".repeat(level));
        sb.append(")([^\\\\t])");

        System.out.println("sb " + sb);


        String[] paths = input.split(sb.toString());

        for (int i = 0; i < paths.length; i++) {
            System.out.println("i " + i);
            System.out.println(paths[i]);
        }


        count += paths[0].length();

        if (paths.length == 1) {
            maxCount = Math.max(maxCount, count);
        }

        for (int i = 1; i < paths.length; i++) {


            process(paths[i], level + 1, count);
        }

    }

}