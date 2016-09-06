package com.sbk.leetcode.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSlidingWindowTest {
    private MaxSlidingWindow m = new MaxSlidingWindow();
    @Test
    public void maxSlidingWindow() throws Exception {
        assertEquals(new int[]{5,6}, m.maxSlidingWindow(new int[]{2,3,4,5,6},2));
        assertEquals(new int[]{4,5,6}, m.maxSlidingWindow(new int[]{2,3,4,5,6},3));
        assertEquals(new int[]{3,3,5,5,6,7}, m.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3));
    }

}