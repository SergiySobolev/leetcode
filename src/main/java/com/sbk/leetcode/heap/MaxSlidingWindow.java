package com.sbk.leetcode.heap;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created by User on 06.09.2016.
 */
class MaxSlidingWindow {
    int[] maxSlidingWindow(int[] nums, int k){
        if(nums.length == 0) return nums;
        int slidingWindowSize = nums.length - k+1;
        int ri = 0;
        int[] slidingWindow = new int[slidingWindowSize];
        Deque<Integer>  q = new ArrayDeque<>();
        for(int i=0; i<nums.length; i++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.offer(i);
            if (i >= k - 1) {
                slidingWindow[ri++] = nums[q.peek()];
            }
        }
        return slidingWindow;
    }

    int[] maxSlidingWindow_naive(int[] nums, int k) {
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
