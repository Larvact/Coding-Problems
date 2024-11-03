package org.toby.personal.leetcode.medium;

import org.toby.personal.leetcode.common.ListNode;

import java.util.Optional;

public class AddTwoNumbers
{
    public static ListNode addTwoNumbers(ListNode listOne, ListNode listTwo)
    {
        final var resultList = new ListNode();
        var incrementNextSum = false;
        var currentNode = resultList;

        while(listOne != null || listTwo != null )
        {
            final var nextNodeSum = incrementNextSum ? getNodeValue(listOne) + getNodeValue(listTwo) + 1 : getNodeValue(listOne) + getNodeValue(listTwo);
            incrementNextSum = nextNodeSum > 9;
            final var nextNode = new ListNode(nextNodeSum % 10);
            currentNode.next = nextNode;
            currentNode = nextNode;
            listOne = listOne == null ? null : listOne.next;
            listTwo = listTwo == null ? null : listTwo.next;;
        }
        if(incrementNextSum)
        {
            currentNode.next = new ListNode(1);
        }
        return resultList.next;
    }

    private static int getNodeValue(ListNode node)
    {
        return Optional.ofNullable(node)
                .map(n -> n.val)
                .orElse(0);
    }
}
