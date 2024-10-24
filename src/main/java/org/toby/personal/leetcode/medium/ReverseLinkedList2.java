package org.toby.personal.leetcode.medium;

import org.toby.personal.leetcode.common.ListNode;

public class ReverseLinkedList2
{
    public ListNode reverseBetween(ListNode head, int left, int right)
    {
        int currentNodePosition = 1;
        ListNode previousNode = null;
        var beginningSection = head;

        while (currentNodePosition < left)
        {
            var newNode = new ListNode(beginningSection.val);
            if(previousNode != null)
            {
                previousNode.next = newNode;
            }
            previousNode = newNode;
            beginningSection = beginningSection.next;
            currentNodePosition++;
        }

        var endingSection = head;
        for(int index = 0; index < right; index++)
        {
            endingSection = endingSection.next;
        }

        var nodeToReverse = new ListNode(beginningSection.val, beginningSection.next);
        calculateNodeToReverse(currentNodePosition, right, nodeToReverse);

        var reverseEndingSection = reverse(nodeToReverse);
        reverseEndingSection.next = endingSection;

        previousNode.next = reverseEndingSection;

        return previousNode;


    }

    private void calculateNodeToReverse(int position, int right, ListNode baseNode)
    {
        if(position < right)
        {
            final var nextNode = new ListNode(baseNode.next.val);
            baseNode.next = nextNode;
            position++;
            calculateNodeToReverse(position, right, nextNode);
        }
    }

    private ListNode reverse(ListNode head)
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
