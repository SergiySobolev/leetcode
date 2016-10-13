package com.sbk.leetcode.tree;


public class LeftLeavesSum {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root ==  null) return 0;
        return sumOfLeftLeavesLeft(root.left) + sumOfLeftLeavesRight(root.right);
    }

    private int sumOfLeftLeavesRight(TreeNode node) {
        if(node == null || (node.left == null && node.right == null)) return 0;
        return sumOfLeftLeavesLeft(node.left) + sumOfLeftLeavesRight(node.right);
    }

    private int sumOfLeftLeavesLeft(TreeNode node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return node.val;
        return sumOfLeftLeavesLeft(node.left) + sumOfLeftLeavesRight(node.right);
    }
}
