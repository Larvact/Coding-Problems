package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class TestAddTwoNumbers
{
    private static final ListNode LIST_NODE_SEVEN = new ListNode(9);
    private static final ListNode LIST_NODE_SIX = new ListNode(4, LIST_NODE_SEVEN);
    private static final ListNode LIST_NODE_FIVE = new ListNode(6, LIST_NODE_SIX);
    private static final ListNode LIST_NODE_FOUR = new ListNode(5, LIST_NODE_FIVE);
    private static final ListNode LIST_NODE_THREE = new ListNode(9);
    private static final ListNode LIST_NODE_TWO = new ListNode(4, LIST_NODE_THREE);
    private static final ListNode LIST_NODE_ONE = new ListNode(2, LIST_NODE_TWO);

    @Test
    void reverse_linked_list_reversed_correctly()
    {
        final var test = AddTwoNumbers.addTwoNumbers(LIST_NODE_ONE, LIST_NODE_FOUR);
    }

}