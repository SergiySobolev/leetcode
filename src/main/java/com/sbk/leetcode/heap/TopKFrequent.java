package com.sbk.leetcode.heap;

import java.util.*;

class TopKFrequent {
    List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        for(int n : nums) {
            int count = numsCount.containsKey(n) ? numsCount.get(n)+1 : 1;
            numsCount.put(n, count);
        }
        Queue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        q.addAll(numsCount.entrySet());
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<k;i++) {
            res.add(q.poll().getKey());
        }
        return res;
    }
}
