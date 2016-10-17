package com.sbk.leetcode.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.*;


public class ZigZagTraversalTest {
    private ZigZagTraversal zzt = new ZigZagTraversal();

    @Test
    public void zigzagLevelOrder_1() throws Exception {
        List<List<Integer>> res =  zzt.zigzagLevelOrder(TreeUtils.fromArray(1,2,null,null,3));
        assertEquals(res, asList(singletonList(1), singletonList(2), singletonList(3)));
    }

    @Test
    public void zigzagLevelOrder_2() throws Exception {
        List<List<Integer>> res =  zzt.zigzagLevelOrder(TreeUtils.fromArray(3,9,20,null,null,15,17));
        assertEquals(res, asList(singletonList(3), asList(20,9), asList(15,17)));
    }

    @Test
    public void zigzagLevelOrder_3() throws Exception {
        List<List<Integer>> res =  zzt.zigzagLevelOrder(TreeUtils.fromArray());
        assertEquals(res, new ArrayList<List<Integer>>());
    }

}