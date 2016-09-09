package com.sbk.leetcode.heap;

import java.util.Arrays;

/**
 * Created by User on 06.09.2016.
 */
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) return nums;
        int slidingWindowSize = nums.length - k+1;
        int[] slidingWindow = new int[slidingWindowSize];
        for(int i = 0; i< slidingWindowSize; i++) {
            int[] window = findWindow(nums, i, k);
            slidingWindow[i] = Arrays.stream(window).max().getAsInt();
        }
        return slidingWindow;
    }
    private int[] findWindow(int[] nums, int shift, int k) {
        int[] window = new int[k];
        System.arraycopy(nums, shift, window, 0, k);
        return window;
    }
}
