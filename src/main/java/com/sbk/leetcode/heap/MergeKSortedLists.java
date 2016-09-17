package com.sbk.leetcode.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class MergeKSortedLists {
    ListNode mergeKLists(ListNode[] listNodes) {
        List<Integer> list = new ArrayList<>();
        for(ListNode ln : listNodes) {
            list.addAll(toList(ln));
        }
        Collections.sort(list);
        return fromList(list);
    }
    private ListNode fromList(List<Integer> l) {
        if (l == null || l.size() == 0) {
            return null;
        }
        ListNode ln = new ListNode(l.get(0));
        ListNode curN = ln;
        for (int i = 1; i < l.size(); i++) {
            curN.next = new ListNode(l.get(i));
            curN = curN.next;
        }
        return ln;
    }
    private List<Integer> toList(ListNode ln) {
        if (ln == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        ListNode curLN = ln;
        while(curLN != null) {
            res.add(curLN.val);
            curLN = curLN.next;
        }
        return res;
    }

}
