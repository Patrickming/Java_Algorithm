package com.aloex.leetcode.easy;


/**
 * @author: xrm
 * @date: 2022/11/23 17:39
 * @description:
 */


class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode expandBinaryTree(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode father) {
        TreeNode original_left = father.left;
        TreeNode original_right = father.right;
        if (original_left != null) {
            father.left = new TreeNode(-1, original_left, null);
            dfs(original_left);
        }
        if (original_right != null) {
            father.right = new TreeNode(-1, null, original_right);
            dfs(original_right);
        }
    }
}
