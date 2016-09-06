package com.sbk.leetcode.heap;

import java.util.*;
import java.util.stream.Collectors;

class TopKFrequent {
    List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(p->p,Collectors.counting()));
        List<Map.Entry<Integer,Long>> entryList = new ArrayList<>(map.entrySet());
        return entryList.stream()
                .sorted((p,q) -> (q.getValue().intValue() - p.getValue().intValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
