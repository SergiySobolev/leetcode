package com.sbk.leetcode.tree;

import org.junit.Test;

import static com.sbk.leetcode.tree.TreeUtils.fromArray;
import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {
    private ValidateBinarySearchTree vbst = new ValidateBinarySearchTree();
    @Test
    public void isValidBST() throws Exception {
        assertFalse(vbst.isValidBST(fromArray(10,5,15,null,null,6,20)));
        assertTrue(vbst.isValidBST(fromArray(1)));
        assertFalse(vbst.isValidBST(fromArray(1,2)));
        assertTrue(vbst.isValidBST(fromArray(2,1)));
        assertFalse(vbst.isValidBST(fromArray(1,2,3)));
        assertFalse(vbst.isValidBST(fromArray(1,3,2)));
        assertFalse(vbst.isValidBST(fromArray(3,1,2,4)));
        assertTrue(vbst.isValidBST(fromArray(2,1,3)));
        assertTrue(vbst.isValidBST(fromArray(2,1,3,0)));
        assertTrue(vbst.isValidBST(fromArray(5,3,7,2,4,6,8)));

    }

}