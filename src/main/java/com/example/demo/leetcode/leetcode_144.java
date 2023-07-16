package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

//二叉树的前序遍历
public class leetcode_144 {

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
        //前序遍历，根左右
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            accessTree(root, result);
            return result;
        }

        public void accessTree(TreeNode root, List<Integer> result){
            if (root == null) return;
            result.add(root.val);
            accessTree(root.left, result);
            accessTree(root.right, result);
        }
    }
}
