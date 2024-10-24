package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.common.ListNode;

class TestReverseLinkedList2
{
    private static final ListNode LIST_NODE_FOUR = new ListNode(4);
    private static final ListNode LIST_NODE_THREE = new ListNode(3, LIST_NODE_FOUR);
    private static final ListNode LIST_NODE_TWO = new ListNode(2, LIST_NODE_THREE);
    private static final ListNode LIST_NODE_ONE = new ListNode(1, LIST_NODE_TWO);
    private ReverseLinkedList2 reverseLinkedList;

    @BeforeEach
    void setup()
    {
        reverseLinkedList = new ReverseLinkedList2();
    }

    @Test
    void reverse_linked_list_reversed_correctly()
    {
        reverseLinkedList.reverseBetween(LIST_NODE_ONE,2,3);
    }
}