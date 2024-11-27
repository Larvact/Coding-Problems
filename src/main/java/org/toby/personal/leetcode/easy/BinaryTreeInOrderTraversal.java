package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal
{
    public List<Integer> inorderTraversal(final TreeNode root)
    {
        final List<Integer> treeValues = new ArrayList<>();
        if(root == null) {return treeValues;}
        traverseNode(treeValues, root);
        return treeValues;
    }

    private void traverseNode(final List<Integer> treeValues, final TreeNode node)
    {
        if(node.left != null)
        {
            traverseNode(treeValues, node.left);
        }
        treeValues.add(node.val);
        if(node.right != null)
        {
            traverseNode(treeValues, node.right);
        }
    }
}
