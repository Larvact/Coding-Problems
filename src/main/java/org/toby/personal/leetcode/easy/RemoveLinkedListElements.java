package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.ListNode;

public class RemoveLinkedListElements
{
    public static ListNode removeElements(ListNode head, int val)
    {
        while (head != null && head.val == val)
        {
            head = head.next;
        }
        ListNode result = head;
        var currentNode = result;
        while (head != null && head.next != null)
        {
            head = head.next;
            if(head.val != val)
            {
                currentNode.next = head;
                currentNode = currentNode.next;
            }
        }
        if(currentNode != null && head.val == val)
        {
            currentNode.next = null;
        }
        return result;
    }
}
