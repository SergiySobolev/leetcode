package com.sbk.leetcode.heap;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MaxSlidingWindowTest {
    private MaxSlidingWindow m = new MaxSlidingWindow();
    @Test
    public void maxSlidingWindow() throws Exception {
        assertEquals(Arrays.toString(new int[]{}), Arrays.toString(m.maxSlidingWindow(new int[]{},0)));
        assertEquals(Arrays.toString(new int[]{3,4,5,6}), Arrays.toString(m.maxSlidingWindow(new int[]{2,3,4,5,6},2)));
        assertEquals(Arrays.toString(new int[]{4,5,6}), Arrays.toString(m.maxSlidingWindow(new int[]{2,3,4,5,6},3)));
        assertEquals(Arrays.toString(new int[]{3,3,5,5,6,7}), Arrays.toString(m.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }

}