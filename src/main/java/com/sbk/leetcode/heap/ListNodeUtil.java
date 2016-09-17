package com.sbk.leetcode.heap;


class ListNodeUtil {
    static ListNode fromArray(int[] n) {
        if (n.length == 0) {
            return null;
        }
        ListNode ln = new ListNode(n[0]);
        ListNode curN = ln;
        for (int i = 1; i < n.length; i++) {
            curN.next = new ListNode(n[i]);
            curN = curN.next;
        }
        return ln;
    }
    static int[] toArray(ListNode ln) {
        ListNode curLN = ln;
        int length = 0;
        while(curLN != null) {
            length++;
            curLN = curLN.next;
        }
        curLN = ln;
        int[] res = new int[length];
        for(int i=0;i<length;i++) {
            res[i] = curLN.val;
            curLN = curLN.next;
        }
        return res;
    }
}
