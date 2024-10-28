package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.common.ListNode;
import org.toby.personal.leetcode.medium.SwapListNodesInPairs;

import static org.junit.jupiter.api.Assertions.*;

class TestRemoveLinkedListElements
{

    private static final ListNode LIST_NODE_SIX = new ListNode(6);
    private static final ListNode LIST_NODE_FIVE = new ListNode(5, LIST_NODE_SIX);
    private static final ListNode LIST_NODE_FOUR = new ListNode(4, LIST_NODE_FIVE);
    private static final ListNode LIST_NODE_THREE = new ListNode(3, LIST_NODE_FOUR);
    private static final ListNode LIST_NODE_SEVEN = new ListNode(6, LIST_NODE_THREE);
    private static final ListNode LIST_NODE_TWO = new ListNode(2, LIST_NODE_SEVEN);
    private static final ListNode LIST_NODE_ONE = new ListNode(1, LIST_NODE_TWO);


    @Test
    void remove_linked_list_elements_correctly()
    {
        final var test = RemoveLinkedListElements.removeElements(LIST_NODE_ONE, 6);
    }

}