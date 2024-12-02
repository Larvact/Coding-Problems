package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;
import static org.toby.personal.leetcode.easy.SameBinaryTree.isSameTree;

class TestSameBinaryTree
{
    @Test
    void nullTrees_isSameTree_returnsTrue()
    {
        assertTrue(isSameTree(null, null));
    }

    @Test
    void lhsTreeNotNullRhsIsNull_isSameTree_returnsFalse()
    {
        final var lhsTree = new TreeNode(10);

        assertFalse(isSameTree(lhsTree, null));
    }

    @Test
    void rhsTreeNotNullLhsIsNull_isSameTree_returnsFalse()
    {
        final var rhsTree = new TreeNode(10);

        assertFalse(isSameTree(null, rhsTree));
    }

    @Test
    void singleTreeSame_isSameTree_returnsTrue()
    {
        final var lhsTree = new TreeNode(10);
        final var rhsTree = new TreeNode(10);

        assertTrue(isSameTree(lhsTree, rhsTree));
    }

    @Test
    void singleTreeDifferent_isSameTree_returnsFalse()
    {
        final var lhsTree = new TreeNode(15);
        final var rhsTree = new TreeNode(10);

        assertFalse(isSameTree(lhsTree, rhsTree));
    }

    @Test
    void multiTreeSame_isSameTree_returnsTrue()
    {
        final var lhsTreeChild = new TreeNode(1);
        final var lhsTree = new TreeNode(10, lhsTreeChild, null);
        final var rhsTreeChild = new TreeNode(1);
        final var rhsTree = new TreeNode(10, rhsTreeChild, null);

        assertTrue(isSameTree(lhsTree, rhsTree));
    }

    @Test
    void multiTreeDifferent_isSameTree_returnsFalse()
    {
        final var lhsTreeChild = new TreeNode(1);
        final var lhsTree = new TreeNode(10, lhsTreeChild, null);
        final var rhsTreeChild = new TreeNode(15);
        final var rhsTree = new TreeNode(10, rhsTreeChild, null);

        assertFalse(isSameTree(lhsTree, rhsTree));
    }
}
