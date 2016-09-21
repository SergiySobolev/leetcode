package com.sbk.leetcode.tree;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InOrderTraversalBTTest {
    private InOrderTraversalBT iot = new InOrderTraversalBT();
    @Test
    public void inOrderTraversal() throws Exception {
        assertEquals(iot.inOrderTraversal(TreeUtils.fromArray(new Integer[]{1,2,3})), Arrays.asList(2,1,3));
        assertEquals(iot.inOrderTraversal(TreeUtils.fromArray(new Integer[]{1, null, 2, null, null, 3})), Arrays.asList(1,3,2));
    }

}