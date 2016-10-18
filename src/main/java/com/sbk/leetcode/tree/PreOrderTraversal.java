package com.sbk.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }

    private void preorderTraversal(TreeNode root, List<Integer> res) {
        if(!Objects.isNull(root)){
            res.add(root.val);
            preorderTraversal(root.left, res);
            preorderTraversal(root.right, res);
        }
    }
}
