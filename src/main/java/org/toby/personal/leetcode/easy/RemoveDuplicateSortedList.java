package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.ListNode;

public class RemoveDuplicateSortedList
{
    public ListNode deleteDuplicates(final ListNode sortedList)
    {
        ListNode prev = null;
        var currentNode = sortedList;
        while (currentNode != null)
        {
            final var currentValue = currentNode.val;
            if(prev != null && prev.val == currentValue)
            {
                prev.next = currentNode.next;
            }
            else
            {
                prev = currentNode;
            }
            currentNode = currentNode.next;
        }
        return sortedList;
    }
}
