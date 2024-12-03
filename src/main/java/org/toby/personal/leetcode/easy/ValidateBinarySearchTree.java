package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.TreeNode;

import java.util.function.Predicate;

public class ValidateBinarySearchTree
{
    private static Integer rootNodeValue;

    public static boolean isValidBST(final TreeNode node)
    {
        rootNodeValue = null;
        if(node == null)
        {
            return true;
        }
        else
        {
            rootNodeValue = node.val;
            return isValidBst(node.left, n -> n == null || n.val < rootNodeValue) &&
                    isValidBst(node.right, n -> n == null || n.val > rootNodeValue);
        }
    }

    private static boolean isValidBst(final TreeNode node, final Predicate<TreeNode> nodeSidePredicate)
    {
        if(node == null)
        {
            return true;
        }
        else
        {
            return (node.left == null || node.val > node.left.val) && (node.right == null || node.val < node.right.val)
                    && nodeSidePredicate.test(node)
                    && isValidBst(node.left, nodeSidePredicate)
                    && isValidBst(node.right, nodeSidePredicate);
        }
    }
}
