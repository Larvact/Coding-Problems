package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.TreeNode;

public class SameBinaryTree
{
    public static boolean isSameTree(final TreeNode firstTree, final TreeNode secondTree)
    {
        if(firstTree == null && secondTree == null)
        {
            return true;
        }
        else if (firstTree == null)
        {
            return false;
        }
        else if(secondTree == null)
        {
            return false;
        }
        else
        {
            return firstTree.val == secondTree.val && isSameTree(firstTree.left, secondTree.left) && isSameTree(firstTree.right, secondTree.right);
        }
    }
}
