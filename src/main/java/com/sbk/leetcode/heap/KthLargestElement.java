package com.sbk.leetcode.heap;


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class KthLargestElement {

    int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int n : nums){
            pq.offer(n);
            if(pq.size()>k)
                pq.poll();
        }
        return pq.poll();
    }

    int findKthLargest_qSort(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    int findKthLargest_priorityQueue(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>(nums.length, (o1, o2) -> o2-o1 );
        for(int n : nums) {
            pq.add(n);
        }
        for(int i=0; i<k-1; i++){
            pq.poll();
        }
        return pq.poll();
    }
}
