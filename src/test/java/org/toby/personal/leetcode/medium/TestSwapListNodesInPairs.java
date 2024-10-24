package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class TestSwapListNodesInPairs
{
    private static final ListNode LIST_NODE_FOUR = new ListNode(4);
    private static final ListNode LIST_NODE_THREE = new ListNode(3, LIST_NODE_FOUR);
    private static final ListNode LIST_NODE_TWO = new ListNode(2, LIST_NODE_THREE);
    private static final ListNode LIST_NODE_ONE = new ListNode(1, LIST_NODE_TWO);


    @Test
    void reverse_linked_list_reversed_correctly()
    {
        final var test = SwapListNodesInPairs.swapPairs(LIST_NODE_ONE);
    }

}