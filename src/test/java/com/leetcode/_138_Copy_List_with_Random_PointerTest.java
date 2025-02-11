package com.leetcode;

import org.junit.jupiter.api.Test;

class _138_Copy_List_with_Random_PointerTest {


    _138_Copy_List_with_Random_Pointer copyListWithRandomPointer = new _138_Copy_List_with_Random_Pointer();
    @Test
    public void case1() {

        _138_Copy_List_with_Random_Pointer.Node head1 = new _138_Copy_List_with_Random_Pointer.Node(1,null,null);
        _138_Copy_List_with_Random_Pointer.Node head2 = new _138_Copy_List_with_Random_Pointer.Node(2,null,null);
        _138_Copy_List_with_Random_Pointer.Node head3 = new _138_Copy_List_with_Random_Pointer.Node(3,null,null);
        _138_Copy_List_with_Random_Pointer.Node head4 = new _138_Copy_List_with_Random_Pointer.Node(4,null,null);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        head1.random = head3;
        head2.random = head3;


        System.out.println(copyListWithRandomPointer.nodeToString(head1));

        copyListWithRandomPointer.copyRandomList(head1);


    }
}