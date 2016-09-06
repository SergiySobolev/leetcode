package com.sbk.leetcode.heap;

import java.util.*;

class TopKFrequent {
    List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        for(int n : nums) {
            int count = numsCount.containsKey(n) ? numsCount.get(n)+1 : 1;
            numsCount.put(n, count);
        }
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(numsCount.entrySet());

        Collections.sort(sortedEntries,
                (e1, e2) -> e2.getValue().compareTo(e1.getValue())
        );
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<k; i++) {
            result.add(sortedEntries.get(i).getKey());
        }
        return result;
    }
}
