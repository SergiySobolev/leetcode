package com.sbk.leetcode.heap;

import java.util.*;

class TopKFrequent {
    List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket  = new List[nums.length+1];
        Map<Integer, Integer> numsCount = new HashMap<>();
        for(int n : nums) {
            numsCount.put(n, numsCount.getOrDefault(n,0)+1);
        }
        for(int key: numsCount.keySet()) {
            int freq = numsCount.get(key);
            if(bucket[freq] == null) {
                List<Integer> freqList = new ArrayList<>();
                bucket[freq] = freqList;
            }
            bucket[freq].add(key);
        }
        List<Integer> res =  new ArrayList<>();
        for(int i=bucket.length-1; i>=0 && res.size()<k; i--) {
            if(bucket[i] == null) continue;
            res.addAll(bucket[i]);
        }
        return res;
    }
}
