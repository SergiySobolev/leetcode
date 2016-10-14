package com.sbk.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TreeUtils {

    static TreeNode fromArray(Integer... a) {
        return fromArray(a, 0);
    }

    static Integer[] toArray(TreeNode node) {
        List<Integer> al = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(node);
        while (!nodes.isEmpty()) {
            List<TreeNode> nextLevelNodes = new ArrayList<>();
            for (TreeNode n : nodes) {
                if (Objects.isNull(n)) {
                    nextLevelNodes.add(null);
                    nextLevelNodes.add(null);
                    al.add(null);
                } else {
                    nextLevelNodes.add(n.left);
                    nextLevelNodes.add(n.right);
                    al.add(n.val);
                }
            }
            nodes.clear();
            if (nextLevelNodes.stream().anyMatch(Objects::nonNull)) {
                nodes.addAll(nextLevelNodes);
            }
        }
        for(int i=al.size()-1; i>=0; i--) {
            if(Objects.isNull(al.get(i))){
                al.remove(i);
            } else {
                break;
            }
        }
        Integer[] res = new Integer[al.size()];
        for(int i=0; i<al.size(); i++) {
            res[i] = al.get(i);
        }
        return res;
    }

    static private TreeNode fromArray(Integer[] a, int i) {
        if (a.length <= i || a[i] == null) return null;
        TreeNode treeNode = new TreeNode(a[i]);
        treeNode.left = fromArray(a, 2 * i + 1);
        treeNode.right = fromArray(a, 2 * i + 2);
        return treeNode;
    }
}
