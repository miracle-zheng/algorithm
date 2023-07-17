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

//    class Solution {
//        public int maxDepth(TreeNode root) {
//            if (root == null) {
//                return 0;
//            } else {
//                return Math.max(maxDepth(root.left), maxDepth(root.right)) +1 ;
//            }
//        }
//    }


    class Solution {
        public int maxDepth(TreeNode root) {
            //根节点为第一层，开始找
            return find(root, 1);
        }

        public int find(TreeNode root, int depth){
            //如果当前节点为null，证明这一层此子树没有，所以最深就是回退一层
            if(root == null) return depth - 1;
            //返回递归寻找左子树和右子树的深度，因为是找当前的子树，所以深度要加一
            return Math.max(find(root.left, depth+1), find(root.right, depth+1));
        }
    }
}
