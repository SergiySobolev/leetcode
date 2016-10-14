package com.sbk.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.*;


public class ConvertSortedArrayToBSTTest {
    private ConvertSortedArrayToBST csa = new ConvertSortedArrayToBST();

    @Test
    public void sortedArrayToBST_1() throws Exception {
        TreeNode actual = csa.sortedArrayToBST(new int[]{1, 2, 3});
        TreeNode expected = TreeUtils.fromArray(2, 1, 3);
        assertEquals(actual.val, expected.val);
        assertEquals(actual.left.val, expected.left.val);
        assertEquals(actual.right.val, expected.right.val);
    }

    @Test
    public void sortedArrayToBST_2() throws Exception {
        TreeNode actual = csa.sortedArrayToBST(new int[]{1, 2, 3, 4, 5});
        TreeNode expected = TreeUtils.fromArray(3,1,4,null,2,null,5);
        assertEquals(actual.val, expected.val);
        assertEquals(actual.left.val, expected.left.val);
        assertEquals(actual.right.val, expected.right.val);
    }

}