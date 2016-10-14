package com.sbk.leetcode.tree;

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return sortedArrayToBST(nums, 0, nums.length-1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        int diff = end - start;
        if (diff == 0) return new TreeNode(nums[start]);
        if (diff == 1) {
            TreeNode node = new TreeNode(nums[start]);
            node.right = new TreeNode(nums[end]);
            return node;
        }
        int pivotIndex = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[pivotIndex]);
        node.left = sortedArrayToBST(nums, start, pivotIndex - 1);
        node.right = sortedArrayToBST(nums, pivotIndex + 1, end);
        return node;
    }
}
