package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _3295_Report_Spam_Message {

    public boolean reportSpam(String[] message, String[] bannedWords) {

        int count = 0;

        Set<Object> set = new HashSet<>(Arrays.stream(bannedWords).toList());

        for (int i = 0; i < message.length; i++) {

            if (set.contains(message[i])) {
                count++;

                if (count == 2) {
                    return true;
                }
            }
        }

        return false;
    }
}
