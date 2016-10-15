package com.sbk.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildTreeFromPreOAndIOTest {
    private BuildTreeFromPreOAndIO bt = new BuildTreeFromPreOAndIO();

    @Test
    public void buildTree_1() {
        TreeNode res = bt.buildTree(new int[]{1,2}, new int[]{1,2});
        assertArrayEquals(TreeUtils.toArray(res), new Integer[]{1,null,2});
    }

    @Test
    public void buildTree_2() {
        TreeNode res = bt.buildTree(new int[]{1,2,3}, new int[]{3,2,1});
        assertArrayEquals(TreeUtils.toArray(res), new Integer[]{1,2,null,3});
    }

    @Test
    public void buildTree_3() {
        TreeNode res = bt.buildTree(new int[]{1,2,3,4}, new int[]{4,3,2,1});
        assertArrayEquals(TreeUtils.toArray(res), new Integer[]{1,2,null,3,null,null,null,4});
    }

    @Test
    public void buildTree_4() {
        TreeNode res = bt.buildTree(new int[]{1,2,3}, new int[]{2,3,1});
        assertArrayEquals(TreeUtils.toArray(res), new Integer[]{1,2,null,null,3});
    }

}