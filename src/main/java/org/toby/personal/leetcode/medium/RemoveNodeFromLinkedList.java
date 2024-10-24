package org.toby.personal.leetcode.medium;

import org.toby.personal.leetcode.common.ListNode;

public class RemoveNodeFromLinkedList
{
    public ListNode removeNthFromEnd(ListNode head, int removeNode)
    {
        final var listSize = getListSize(head);
        final var nodePlaceToRemove = listSize - removeNode;
        var currentNodeNumber = 0;
        ListNode previousNode = null;
        var currentNode = head;
        var nextNode = head.next;

        while (currentNodeNumber != nodePlaceToRemove)
        {
            previousNode = currentNode;
            currentNode = currentNode.next;
            nextNode = currentNode.next;
            currentNodeNumber++;
        }
        if(previousNode == null)
        {
            return nextNode;
        }
        else previousNode.next = nextNode;
        return head;
    }

    private int getListSize(ListNode listNode)
    {
        var size = 1;
        while (listNode.next != null) {
            size++;
            listNode = listNode.next;
        }
        return size;
    }
}
