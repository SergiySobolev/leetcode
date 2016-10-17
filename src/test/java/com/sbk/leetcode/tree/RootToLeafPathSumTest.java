package com.sbk.leetcode.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;

public class RootToLeafPathSumTest {
    private RootToLeafPathSum rtl = new RootToLeafPathSum();
    @Test
    public void sum_1() {
        List<List<Integer>> res = rtl.pathSum(null,22);
        assertEquals(res, new ArrayList<List<Integer>>());
    }
    @Test
    public void sum_2() {
        List<List<Integer>> res = rtl.pathSum(TreeUtils.fromArray(5,4,8,11,null,13,4,7,2,null,null,null,null,5,1),22);
        assertEquals(res, asList(asList(5,4,11,2), asList(5,8,4,5)));
    }

    @Test
    public void sum_3() {
        List<List<Integer>> res = rtl.pathSum(TreeUtils.fromArray(5,4,6,2),11);
        assertThat(res, containsInAnyOrder(asList(5,6), asList(5,4,2)));
    }
}