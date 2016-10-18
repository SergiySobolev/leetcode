package com.sbk.leetcode.tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NextRightPointersToEachNode {
    public void connect(TreeLinkNode root) {
        if (root == null || root.left == null)
            return;

        root.left.next = root.right;
        root.right.next = (root.next == null)?null:root.next.left;
        connect(root.left);
        connect(root.right);
    }
}
