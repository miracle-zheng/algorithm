package com.example.demo.leetcode;

public class leetcode_110 {

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
        private boolean result = true;
        public boolean isBalanced(TreeNode root) {
            getDepth(root, 1);
            return result;
        }

        public Integer getDepth(TreeNode root, Integer depth) {
            if (result == false) return 123;
            if (root == null) return depth -1 ;

            Integer leftDepth = getDepth(root.left, depth + 1);
            Integer rightDepth = getDepth(root.right, depth +1);
            if (Math.abs(leftDepth - rightDepth) > 1){
                result = false;
            }
            return Math.max(leftDepth, rightDepth);
        }
    }
}
