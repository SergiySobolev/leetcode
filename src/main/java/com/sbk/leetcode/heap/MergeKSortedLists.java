package com.sbk.leetcode.heap;

class MergeKSortedLists {

    ListNode mergeKLists(ListNode[] listNodes) {
        if(listNodes.length == 0) return null;
        if(listNodes.length == 1) return listNodes[0];
        ListNode res = mergeTwoLists(listNodes[0], listNodes[1]);
        for(int i=2; i<listNodes.length; i++){
            res = mergeTwoLists(res, listNodes[i]);
        }
        return res;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(true) {
            if(l1 == null) {
                cur.next = l2;
                break;
            }
            if(l2 == null) {
                cur.next = l1;
                break;
            }
            if(l1.val < l2.val) {
                cur.next = new ListNode(l1.val);
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = new ListNode(l2.val);
                cur = cur.next;
                l2 = l2.next;
            }
        }
        return res.next;
    }
}
