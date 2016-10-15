package com.sbk.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildTreeFromIOAndPOTest {
    private BuildTreeFromIOAndPO bt = new BuildTreeFromIOAndPO();

    @Test
    public void buildTree_1() {
        TreeNode res = bt.buildTree(new int[]{1,2}, new int[]{2,1});
        assertArrayEquals(TreeUtils.toArray(res), new Integer[]{1,null,2});
    }

    @Test
    public void buildTree_2() {
        TreeNode res = bt.buildTree(new int[]{1,2,3}, new int[]{3,2,1});
        assertArrayEquals(TreeUtils.toArray(res), new Integer[]{1,null,2,null,null,null,3});
    }
}