package org.toby.personal.leetcode.medium;

import org.toby.personal.leetcode.common.ListNode;

public class ReverseLinkedList
{
    public ListNode reverse(ListNode head)
    {
        ListNode previousNode = null;
        var currentNode = head;
        while (currentNode != null)
        {
            var nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
