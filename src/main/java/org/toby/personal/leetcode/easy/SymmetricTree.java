package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SymmetricTree
{
    public static boolean isSymmetric(final TreeNode root)
    {
        if (root == null)
        {
            return false;
        }
        final List<Integer> binaryTreeLeftTraversal = new ArrayList<>();
        traverseTreeLeft(root.left, binaryTreeLeftTraversal);

        final List<Integer> binaryTreeRightTraversal = new ArrayList<>();
        traverseTreeRight(root.right, binaryTreeRightTraversal);

        if(binaryTreeLeftTraversal.size() != binaryTreeRightTraversal.size())
        {
            return false;
        }


        for(int index = 0; index < binaryTreeLeftTraversal.size(); index++)
        {
            final var lhsVal = binaryTreeLeftTraversal.get(index);
            final var rhsVal = binaryTreeRightTraversal.get(index);
            if(!Objects.equals(lhsVal, rhsVal))
            {
                return false;
            }
        }
        return true;
    }

    private static void traverseTreeLeft(final TreeNode node, final List<Integer> binaryTreeTraversal)
    {
        if(node == null)
        {
            return;
        }
        traverseTreeLeft(node.left, binaryTreeTraversal);
        binaryTreeTraversal.add(node.val);
        traverseTreeLeft(node.right, binaryTreeTraversal);
    }

    private static void traverseTreeRight(final TreeNode node, final List<Integer> binaryTreeTraversal)
    {
        if(node == null)
        {
            return;
        }
        traverseTreeRight(node.right, binaryTreeTraversal);
        binaryTreeTraversal.add(node.val);
        traverseTreeRight(node.left, binaryTreeTraversal);
    }
}
