package com.sbk.leetcode.tree;


import java.util.Objects;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(Objects.isNull(root)) return true;
        boolean isLeftValid = Objects.isNull(root.left) || (root.left.val <= root.val && isValidBST(root.left));
        boolean isRightValid = Objects.isNull(root.right) || (root.right.val >= root.val && isValidBST(root.right));
        return isLeftValid && isRightValid;
    }
}
