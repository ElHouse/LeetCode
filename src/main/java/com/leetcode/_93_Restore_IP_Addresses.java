package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _93_Restore_IP_Addresses {

    private List<String> response = new ArrayList<>();
    private Set<String> set = new HashSet<>();

    public List<String> restoreIpAddresses(String s) {

        bt(new StringBuilder(s), 1, 0);

        return response;
    }


    private void bt(StringBuilder sb, int index, int count) {


        if (set.contains(sb.toString())) {
            return;
        }

        set.add(sb.toString());
        if (count == 3) {

            String[] parts = sb.toString().split("\\.");
            int valid = 0;

            for (String part : parts) {
                if (part.length() > 1 && part.startsWith("0")) return;
                long number = Long.parseLong(part);

                if (number >= 0 && number <= 255) {
                    valid++;

                } else {
                    break;
                }
            }

            if (valid == 4) {
                 response.add(sb.toString());
            }

        }

        int length = sb.length();

        for (int i = index; i < sb.length(); i++) {

            if (index < length && count < 3) {
                sb.insert(index, ".");
                bt(new StringBuilder(sb), index + 2, count + 1);
                sb.deleteCharAt(index);
            }


            if (index + 1 < length && count < 3) {
                sb.insert(index + 1, ".");
                bt(new StringBuilder(sb), index + 3, count + 1);
                sb.deleteCharAt(index + 1);
            }
            if (index + 2 < length && count < 3) {
                sb.insert(index + 2, ".");
                bt(new StringBuilder(sb), index + 4, count + 1);
                sb.deleteCharAt(index + 2);
            }

        }


    }


}
