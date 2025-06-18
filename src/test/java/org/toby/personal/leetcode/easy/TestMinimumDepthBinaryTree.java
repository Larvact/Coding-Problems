package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class TestMinimumDepthBinaryTree {

    @Test
    void fullBinaryTree_minDepth_returnCorrectDepth()
    {
        final var secondLhsChild = new TreeNode(111);
        final var firstLhsChild = new TreeNode(6, secondLhsChild, null);
        final var secondRhsChild = new TreeNode(12);
        final var firstRhsChild = new TreeNode(6, null, secondRhsChild);
        final var root = new TreeNode(1, firstLhsChild, firstRhsChild);

        Assertions.assertEquals(3, MinimumDepthBinaryTree.minDepth(root));
    }

}