package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.TreeNode;

public class ValidateBinarySearchTree
{
    public static boolean isValidBST(final TreeNode node)
    {
        if(node == null)
        {
            return true;
        }
        else
        {
            return (node.left == null || node.val > node.left.val) && (node.right == null || node.val < node.right.val)
                    && isValidBST(node.left) && isValidBST(node.right);
        }
    }
}
