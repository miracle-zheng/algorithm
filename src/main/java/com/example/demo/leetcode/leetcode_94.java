package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

//二叉树的中序遍历
public class leetcode_94 {

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
        //中序遍历，左根右
        public List<Integer> inorderTraversal(TreeNode root) {

            List<Integer> result = new ArrayList<>();
            accessTree(root, result);
            return result;
        }

        public void accessTree(TreeNode root, List<Integer> result) {
            if (root == null) return;
            accessTree(root.left, result);
            result.add(root.val);
            accessTree(root.right, result);

        }
    }
}
