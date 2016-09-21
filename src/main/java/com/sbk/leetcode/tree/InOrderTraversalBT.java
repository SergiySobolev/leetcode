package com.sbk.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InOrderTraversalBT {
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrderTraversal(root, res);
        return res;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> res) {
        if(Objects.nonNull(root)) {
            inOrderTraversal(root.left, res);
            res.add(root.val);
            inOrderTraversal(root.right, res);
        }
    }
}
