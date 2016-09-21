package com.sbk.leetcode.tree;

import org.junit.Test;

import static com.sbk.leetcode.tree.TreeUtils.fromArray;
import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {
    private ValidateBinarySearchTree vbst = new ValidateBinarySearchTree();
    @Test
    public void isValidBST() throws Exception {
        assertFalse(vbst.isValidBST(fromArray(new Integer[]{3,1,5,0,2,4,6,null,null,null,3})));
        assertTrue(vbst.isValidBST(fromArray(new Integer[]{-2147483648,null,2147483647})));
        assertFalse(vbst.isValidBST(fromArray(new Integer[]{10,5,15,null,null,6,20})));
        assertTrue(vbst.isValidBST(fromArray(new Integer[]{1})));
        assertFalse(vbst.isValidBST(fromArray(new Integer[]{1,1})));
        assertFalse(vbst.isValidBST(fromArray(new Integer[]{1,2})));
        assertTrue(vbst.isValidBST(fromArray(new Integer[]{2,1})));
        assertFalse(vbst.isValidBST(fromArray(new Integer[]{1,2,3})));
        assertFalse(vbst.isValidBST(fromArray(new Integer[]{1,3,2})));
        assertFalse(vbst.isValidBST(fromArray(new Integer[]{3,1,2,4})));
        assertTrue(vbst.isValidBST(fromArray(new Integer[]{2,1,3})));
        assertTrue(vbst.isValidBST(fromArray(new Integer[]{2,1,3,0})));
        assertTrue(vbst.isValidBST(fromArray(new Integer[]{5,3,7,2,4,6,8})));
        assertFalse(vbst.isValidBST(fromArray(new Integer[]{5,3,7,2,4,4,8})));

    }

}