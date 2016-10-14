package com.sbk.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildTreeFromIOAndPOTest {
    private BuildTreeFromIOAndPO bt = new BuildTreeFromIOAndPO();

    @Test
    public void buildTree_1() {
        TreeNode res = bt.buildTree(new int[]{1,2}, new int[]{2,1});
        assertEquals(res.val, 1);
        assertNull(res.left.val);
        assertEquals(res.right.val, 2);
    }
}