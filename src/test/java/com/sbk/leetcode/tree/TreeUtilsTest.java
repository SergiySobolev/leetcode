package com.sbk.leetcode.tree;

import org.junit.Test;

import java.util.Arrays;

import static com.sbk.leetcode.tree.TreeUtils.fromArray;
import static org.junit.Assert.*;


public class TreeUtilsTest {
    @Test
    public void test_fromArray_1() throws Exception {
        TreeNode n = fromArray(1,2,3);
        assertEquals(n.val,1);
        assertEquals(n.left.val, 2);
        assertEquals(n.right.val, 3);
        assertNull(n.right.right);
        assertNull(n.right.left);
        assertNull(n.left.left);
        assertNull(n.left.right);
    }
    @Test
    public void test_fromArray_2() throws Exception {
        TreeNode n = fromArray(1,2,3,4,5);
        assertEquals(n.val,1);
        assertEquals(n.left.val, 2);
        assertEquals(n.right.val, 3);
        assertEquals(n.left.left.val, 4);
        assertEquals(n.left.right.val, 5);
        assertNull(n.right.left);
        assertNull(n.right.right);
    }
    @Test
    public void test_fromArray_3() throws Exception {
        TreeNode n = fromArray(10,5,15,null,null,6,20);
        assertEquals(n.val,10);
        assertEquals(n.left.val, 5);
        assertEquals(n.right.val, 15);
        assertNull(n.left.left);
        assertNull(n.left.right);
        assertEquals(n.right.left.val, 6);
        assertEquals(n.right.right.val, 20);
    }

    @Test
    public void test_toArray_1() throws Exception {
        TreeNode n = fromArray(1,2,3);
        assertArrayEquals(TreeUtils.toArray(n), new Integer[]{1,2,3});
    }

    @Test
    public void test_toArray_2() throws Exception {
        TreeNode n = fromArray(1,2,3,4,5);
        assertArrayEquals(TreeUtils.toArray(n), new Integer[]{1,2,3,4,5});
    }

    @Test
    public void test_toArray_3() throws Exception {
        TreeNode n = fromArray(10,5,15,null,null,6,20);
        assertArrayEquals(TreeUtils.toArray(n), new Integer[]{10,5,15,null,null,6,20});
    }
}