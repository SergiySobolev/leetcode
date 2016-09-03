package com.sbk.leetcode.math;

class RotateArray {
    void rotate(int[] nums, int k) {
        int length = nums.length;
        if(nums.length == 0) return;
        int shift = k % length;
        int[] shifted = new int[shift];
        System.arraycopy(nums, length-shift, shifted, 0, shift);
        System.arraycopy(nums, 0, nums, shift, length-shift);
        System.arraycopy(shifted, 0, nums, 0, shift);
    }
}
