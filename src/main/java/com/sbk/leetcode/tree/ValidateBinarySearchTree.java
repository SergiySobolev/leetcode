package com.sbk.leetcode.tree;


import java.util.Objects;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, (long)(Integer.MIN_VALUE)-1, (long)(Integer.MAX_VALUE)+1);
    }
    private boolean isValidBST(TreeNode root, long min, long max) {
        if(Objects.isNull(root)) return true;
        if(root.val <= min || root.val >= max) return false;
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
