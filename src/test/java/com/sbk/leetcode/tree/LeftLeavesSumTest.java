package com.sbk.leetcode.tree;

import org.junit.Test;

import static com.sbk.leetcode.tree.TreeUtils.fromArray;
import static org.junit.Assert.*;
public class LeftLeavesSumTest {
    private LeftLeavesSum lls = new LeftLeavesSum();
    @Test
    public void sumOfLeftLeaves() throws Exception {
        assertEquals(lls.sumOfLeftLeaves(fromArray(3,9,20,null,null,15,7)), 24);
        assertEquals(lls.sumOfLeftLeaves(fromArray(23)), 0);
        assertEquals(lls.sumOfLeftLeaves(fromArray(23,3)), 3);
    }

}