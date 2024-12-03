package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.toby.personal.leetcode.common.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.toby.personal.leetcode.easy.ValidateBinarySearchTree.isValidBST;

class TestValidateBinarySearchTree
{

    @Test
    void treeWithValue_isValidBST_returnsTrue()
    {
        final var root = new TreeNode(10);

        assertTrue(isValidBST(root));
    }

    public static Stream<Arguments> provideTreesForValidityCheck()
    {
        return Stream.of(
                Arguments.of(new TreeNode(10, new TreeNode(9), null), true),
                Arguments.of(new TreeNode(10, null, new TreeNode(9)), false),
                Arguments.of(new TreeNode(10, new TreeNode(9), new TreeNode(11)), true),
                Arguments.of(new TreeNode(10, new TreeNode(10), new TreeNode(11)), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTreesForValidityCheck")
    void rhsTreeNotNullLhsIsNull_isSameTree_returnsFalse(final TreeNode root, final boolean isValidExpectedResult)
    {
        assertEquals(isValidExpectedResult, isValidBST(root));
    }

}