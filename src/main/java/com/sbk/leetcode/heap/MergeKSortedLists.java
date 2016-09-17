package com.sbk.leetcode.heap;

import java.util.Objects;
import java.util.PriorityQueue;

class MergeKSortedLists {

    ListNode mergeKLists(ListNode[] listNodes) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1,o2) -> o1.val - o2.val);
        ListNode result = new ListNode(0);
        ListNode cur = result;
        for(ListNode l : listNodes){
            if(Objects.nonNull(l)) pq.offer(l);
        }
        while(!pq.isEmpty()) {
            ListNode curMin = pq.poll();
            cur.next = new ListNode(curMin.val);
            cur = cur.next;
            if(curMin.next != null){
                pq.offer(curMin.next);
            }
        }
        return result.next;
    }
}
