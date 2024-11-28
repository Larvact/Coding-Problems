package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.TreeNode;

public class InvertBinaryTree
{
    public TreeNode invertTree(final TreeNode node)
    {
        if(node == null){return null;}
        final var tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;

        invertTree(node.left);
        invertTree(node.right);
        return node;
    }
}
