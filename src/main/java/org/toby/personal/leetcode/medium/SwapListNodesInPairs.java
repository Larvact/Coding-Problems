package org.toby.personal.leetcode.medium;

import org.toby.personal.leetcode.common.ListNode;

public class SwapListNodesInPairs
{
    public static ListNode swapPairs(ListNode head)
    {
        if (head == null || head.next == null)
            return head;

        ListNode res = new ListNode();

        ListNode currHead = res;
        ListNode curr = head;
        while (curr != null) {
            currHead.next = curr.next;
            if (curr.next == null) {
                currHead.next = curr;
                break;
            }

            curr.next = curr.next.next;
            currHead.next.next = curr;

            currHead = curr;
            curr = currHead.next;
        }

        return res.next;
    }
}
