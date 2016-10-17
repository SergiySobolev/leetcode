package com.sbk.leetcode.tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> al = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        boolean fromLeftToRight = true;
        while (!nodes.isEmpty()) {
            List<Integer> currentLevelNodesVals = nodes.stream().map(n -> n.val)
                    .collect(Collectors.toList());
            if(!fromLeftToRight) Collections.reverse(currentLevelNodesVals);
            al.add(currentLevelNodesVals);
            List<TreeNode> nextLevelNodes = new ArrayList<>();
            for (TreeNode n : nodes) {
                if (!Objects.isNull(n.left)) {
                    nextLevelNodes.add(n.left);
                }
                if (!Objects.isNull(n.right)) {
                    nextLevelNodes.add(n.right);
                }
            }
            nodes.clear();
            if (nextLevelNodes.stream().anyMatch(Objects::nonNull)) {
                nodes.addAll(nextLevelNodes);
            }
            fromLeftToRight = !fromLeftToRight;
        }
        return al;
    }
}
