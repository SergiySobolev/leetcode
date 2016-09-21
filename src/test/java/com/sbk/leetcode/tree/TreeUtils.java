package com.sbk.leetcode.tree;

public class TreeUtils {
    static TreeNode fromArray(Integer[] a) {
        return fromArray(a, 0);
    }

    static private TreeNode fromArray(Integer[] a, int i) {
        if(a.length <= i || a[i] == null) return null;
        TreeNode treeNode = new TreeNode(a[i]);
        treeNode.left = fromArray(a, 2*i+1);
        treeNode.right = fromArray(a, 2*i+2);
        return treeNode;
    }
}
