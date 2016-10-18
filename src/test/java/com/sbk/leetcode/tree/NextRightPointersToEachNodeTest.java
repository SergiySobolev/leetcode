package com.sbk.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class NextRightPointersToEachNodeTest {

    private NextRightPointersToEachNode n = new NextRightPointersToEachNode();

    @Test
    public void connect_1() {
        TreeLinkNode input = new TreeLinkNode(1);
        input.left = new TreeLinkNode(2);
        input.right = new TreeLinkNode(3);
        input.left.left = new TreeLinkNode(4);
        input.left.right = new TreeLinkNode(5);
        input.right.left = new TreeLinkNode(6);
        input.right.right = new TreeLinkNode(7);
        n.connect(input);
        assertNull(input.next);
        assertSame(input.left.next, input.right);
        assertNull(input.right.next);
        assertSame(input.left.left.next, input.left.right);
        assertSame(input.left.right.next, input.right.left);
        assertSame(input.right.left.next, input.right.right);
        assertNull(input.right.right.next);
    }
}