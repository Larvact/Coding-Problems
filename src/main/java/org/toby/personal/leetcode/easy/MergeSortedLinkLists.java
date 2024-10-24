package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.ListNode;

public class MergeSortedLinkLists
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if(list1 == null)
        {
            return list2;
        }
        if(list2 == null)
        {
            return list1;
        }

        final var initialListOneNumber = list1.val;
        final var initialListTwoNumber = list2.val;
        ListNode result = null;
        if (initialListOneNumber >= initialListTwoNumber)
        {
            result = new ListNode(initialListTwoNumber);
            list2 = list2.next;
        }
        else
        {
            result = new ListNode(initialListOneNumber);
            list1 = list1.next;
        }

        var head = result;
        while (list1 != null && list2 != null)
        {
            final var listOneNumber = list1.val;
            final var listTwoNumber = list2.val;
            if (listOneNumber >= listTwoNumber)
            {
                head.next = list2;
                list2 = list2.next;
            }
            else
            {
                head.next = list1;
                list1 = list1.next;
            }
            head = head.next;
        }
        if(list1 != null)
        {
            head.next = list1;
        }
        else
        {
            head.next = list2;
        }
        return result;
    }
}
