package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.common.TreeNode;


class TestSymmetricTree
{

    @Test
    void nullTree_isSymmetric_returnFalse()
    {
        Assertions.assertFalse(SymmetricTree.isSymmetric(null));
    }

    @Test
    void singleNodeBinaryTree_isSymmetric_returnTrue()
    {
        final var root = new TreeNode(1, null, null);

        Assertions.assertTrue(SymmetricTree.isSymmetric(root));
    }

    @Test
    void nonSymmetricBinaryTree_isSymmetric_returnFalse()
    {
        final var secondLhsChild = new TreeNode(111);
        final var firstLhsChild = new TreeNode(6, secondLhsChild, null);
        final var secondRhsChild = new TreeNode(6);
        final var firstRhsChild = new TreeNode(111, null, secondRhsChild);
        final var root = new TreeNode(1, firstLhsChild, firstRhsChild);

        Assertions.assertFalse(SymmetricTree.isSymmetric(root));
    }

    @Test
    void symmetricBinaryTree_isSymmetric_returnTrue()
    {
        final var secondLhsChild = new TreeNode(111);
        final var firstLhsChild = new TreeNode(6, secondLhsChild, null);
        final var secondRhsChild = new TreeNode(111);
        final var firstRhsChild = new TreeNode(6, null, secondRhsChild);
        final var root = new TreeNode(1, firstLhsChild, firstRhsChild);

        Assertions.assertTrue(SymmetricTree.isSymmetric(root));
    }

}