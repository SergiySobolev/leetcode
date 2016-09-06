package com.sbk.leetcode.heap;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class TopKFrequentTest {
    private TopKFrequent topKFrequent = new TopKFrequent();
    @Test
    public void topKFrequent() throws Exception {
        assertEquals(Arrays.asList(1,2), topKFrequent.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }

}