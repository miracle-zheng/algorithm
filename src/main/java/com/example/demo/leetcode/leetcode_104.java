package com.example.demo.leetcode;

//二叉树的最大深度
public class leetcode_104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                return Math.max(maxDepth(root.left), maxDepth(root.right)) +1 ;
            }
        }
    }
}
