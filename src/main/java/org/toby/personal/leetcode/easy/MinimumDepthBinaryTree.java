package org.toby.personal.leetcode.easy;

import org.toby.personal.leetcode.common.TreeNode;

public class MinimumDepthBinaryTree {

    public static int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        else if(root.left != null && root.right == null){
            return 1 + minDepth(root.left);
        } else if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        return Math.min(1 + minDepth(root.left), 1 + minDepth(root.right));
    }
}
