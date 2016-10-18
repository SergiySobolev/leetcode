package com.sbk.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if(Objects.isNull(root)) return;
        List<TreeNode> flattenNodes = new ArrayList<>();
        flatten(root, flattenNodes);
        TreeNode tempRoot = flattenNodes.get(0);
        for(int i=1; i<flattenNodes.size();i++) {
            tempRoot.left = null;
            tempRoot.right = flattenNodes.get(i);
            tempRoot = tempRoot.right;
        }
    }

    private void flatten(TreeNode root, List<TreeNode> flattenNodes) {
        if(Objects.nonNull(root)) {
            flattenNodes.add(root);
            flatten(root.left, flattenNodes);
            flatten(root.right, flattenNodes);
        }
    }
}
