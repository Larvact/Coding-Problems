package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.ListNode;

public class LinkedListCycle
{
    public boolean hasCycle(final ListNode head)
    {
        var singleCycle = head;
        var doubleCycle = head;
        while (doubleCycle != null && doubleCycle.next != null)
        {
            singleCycle = singleCycle.next;
            doubleCycle = doubleCycle.next.next;
            if(singleCycle.equals(doubleCycle))
            {
                return true;
            }
        }
        return false;
    }
}
