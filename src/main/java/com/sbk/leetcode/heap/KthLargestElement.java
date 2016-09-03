package com.sbk.leetcode.heap;


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class KthLargestElement {

    int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int target = n - k;
        quickSort(nums, 0, n-1, target);
        return nums[n-k];
    }

    private void quickSort(int[] nums, int start, int end, int target){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        int pivot = choosePivot(nums[mid], nums[start], nums[end]);
        //int pivot = nums[mid];
        int i = start;
        int j = end;
        while(i <= j){
            while(nums[i] < pivot){
                i++;
            }
            while(nums[j] > pivot){
                j--;
            }
            if(i <= j){
                if(nums[i] != nums[j]){
                    swap(nums, i, j);
                }
                i++;
                j--;
            }
        }
        if(target <= i - 1){
            quickSort(nums, start, i - 1, target);
        }
        else{
            quickSort(nums, i, end, target);
        }
    }

    private int choosePivot(int a, int b, int c){
        if(isBetWeen(a, b, c)) return a;
        if(isBetWeen(b, a, c)) return b;
        return c;
    }

    private boolean isBetWeen(int a, int b, int c){
        return (b >= a && a >= c) || (c >= a && a >= b);
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    int findKthLargest_pq_improved(int[] nums, int k) {
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
