package com.sbk.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlattenBinaryTreeToLinkedListTest {

    private FlattenBinaryTreeToLinkedList f = new FlattenBinaryTreeToLinkedList();

    @Test
    public void flatten_1() throws Exception {
        TreeNode input = TreeUtils.fromArray(1,2,5,3,4,null,6);
        f.flatten(input);
        assertEquals(input.val, 1);
        assertEquals(input.right.val, 2);
        assertEquals(input.right.right.val, 3);
        assertEquals(input.right.right.right.val, 4);
        assertEquals(input.right.right.right.right.val, 5);
        assertEquals(input.right.right.right.right.right.val, 6);
    }

    @Test
    public void flatten_2() throws Exception {
        TreeNode input = TreeUtils.fromArray(1,2,3);
        f.flatten(input);
        assertArrayEquals(TreeUtils.toArray(input), new Integer[]{1,null,2,null,null,3});
    }

    @Test
    public void flatten_3() throws Exception {
        TreeNode input = TreeUtils.fromArray(1,2,3,4);
        f.flatten(input);
        assertArrayEquals(TreeUtils.toArray(input), new Integer[]{1,null,2,null,null,3, null,null,null,null,4});
    }

    @Test
    public void flatten_4() throws Exception {
        TreeNode input = null;
        f.flatten(input);
        assertNull(input);
    }

}