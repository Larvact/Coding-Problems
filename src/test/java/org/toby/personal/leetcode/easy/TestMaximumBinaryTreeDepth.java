package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.common.TreeNode;

class TestMaximumBinaryTreeDepth
{
    @Test
    void nullBinaryTree_maxDepth_returnZero()
    {
        Assertions.assertEquals(0, MaximumBinaryTreeDepth.maxDepth(null));
    }

    @Test
    void singleNodeBinaryTree_maxDepth_returnZero()
    {
        final var root = new TreeNode(1);

        Assertions.assertEquals(1, MaximumBinaryTreeDepth.maxDepth(root));
    }

    @Test
    void twoNodeLhsBinaryTree_maxDepth_returnZero()
    {
        final var firstLhsChild = new TreeNode(6);
        final var root = new TreeNode(1, firstLhsChild, null);

        Assertions.assertEquals(2, MaximumBinaryTreeDepth.maxDepth(root));
    }

    @Test
    void twoNodeRhsBinaryTree_maxDepth_returnZero()
    {
        final var firstRhsChild = new TreeNode(6);
        final var root = new TreeNode(1, null, firstRhsChild);

        Assertions.assertEquals(2, MaximumBinaryTreeDepth.maxDepth(root));
    }

    @Test
    void fullBinaryTree_maxDepth_returnCorrectDepth()
    {
        final var secondLhsChild = new TreeNode(111);
        final var firstLhsChild = new TreeNode(6, secondLhsChild, null);
        final var secondRhsChild = new TreeNode(12);
        final var firstRhsChild = new TreeNode(6, null, secondRhsChild);
        final var root = new TreeNode(1, firstLhsChild, firstRhsChild);

        Assertions.assertEquals(3, MaximumBinaryTreeDepth.maxDepth(root));
    }
}