package com.example.demo.leetcode;

import java.util.HashMap;

public class leetcode_226 {

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
        public TreeNode invertTree(TreeNode root) {
            invert(root);
            return root;
        }

        public void invert(TreeNode root){
            //如果当前根节点为null，就返回
            if (root == null)
                return;
            TreeNode left = root.left;
            TreeNode right = root.right;
            //根节点的左右交换
            root.left = right;
            root.right = left;
            //继续递归翻转左子节点和右子节点
            invert(root.left);
            invert(root.right);
        }
    }

}
