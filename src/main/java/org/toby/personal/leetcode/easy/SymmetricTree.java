package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.TreeNode;

public class SymmetricTree
{
    public static boolean isSymmetric(final TreeNode root)
    {
        if (root == null)
        {
            return false;
        }
        return checkSymmetric(root.left, root.right);
    }

    private static boolean checkSymmetric(final TreeNode firstNode, final TreeNode secondNode)
    {
        if((firstNode == null && secondNode == null))
        {
            return true;
        }
        else if (firstNode == null)
        {
            return false;
        }
        else if (secondNode == null)
        {
            return false;
        }
        else
        {
            return firstNode.val == secondNode.val && checkSymmetric(firstNode.left, secondNode.right) && checkSymmetric(firstNode.right, secondNode.left);
        }
    }
}
