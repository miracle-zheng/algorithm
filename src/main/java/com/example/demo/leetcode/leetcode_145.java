package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

//二叉树的后序遍历
public class leetcode_145 {

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
        //后序遍历，左右根
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            accessTree(root, result);
            return result;
        }

        public void accessTree(TreeNode root, List<Integer> result){
            if (root == null) return;
            accessTree(root.left, result);
            accessTree(root.right, result);
            result.add(root.val);
        }
    }
}
