package com.sbk.leetcode.tree;

import org.junit.Test;

import static com.sbk.leetcode.tree.TreeUtils.fromArray;
import static org.junit.Assert.*;


public class TreeUtilsTest {
    @Test
    public void test_1() throws Exception {
        TreeNode n = fromArray(new int[]{1,2,3});
        assertEquals(n.val,1);
        assertEquals(n.left.val, 2);
        assertEquals(n.right.val, 3);
        assertNull(n.right.right);
        assertNull(n.right.left);
        assertNull(n.left.left);
        assertNull(n.left.right);
    }
    @Test
    public void test_2() throws Exception {
        TreeNode n = fromArray(new int[]{1,2,3,4,5});
        assertEquals(n.val,1);
        assertEquals(n.left.val, 2);
        assertEquals(n.right.val, 3);
        assertEquals(n.left.left.val, 4);
        assertEquals(n.left.right.val, 5);
        assertNull(n.right.left);
        assertNull(n.right.right);
    }
}