package com.leetcode;

import com.leetcode.structure.ListNode;

public class _1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {

    public int getDecimalValue(ListNode head) {

        if (head == null) return 0;

        StringBuilder sb = new StringBuilder();

        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }

        return Integer.valueOf(sb.toString(), 2);
    }
}
