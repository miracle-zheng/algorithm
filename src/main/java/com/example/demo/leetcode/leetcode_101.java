package com.example.demo.leetcode;

//判断对称二叉树
public class leetcode_101 {


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
        public boolean isSymmetric(TreeNode root) {
            return check(root.left, root.right);
        }

        public boolean check(TreeNode left, TreeNode right) {
            if (left == null && right == null) return true;
            if (left != null && right == null) return false;
            if (left == null && right != null) return false;
            if (left.val != right.val) return false;
            return check(left.left, right.right) && check(left.right, right.left);
        }
    }
}
