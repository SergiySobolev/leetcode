package com.sbk.leetcode.heap;

import org.junit.Test;

import static com.sbk.leetcode.heap.ListNodeUtil.fromArray;
import static com.sbk.leetcode.heap.ListNodeUtil.toArray;
import static org.junit.Assert.*;

public class MergeKSortedListsTest {
    private MergeKSortedLists mk = new MergeKSortedLists();
    @Test
    public void mergeKSortedLists_1() {
        ListNode first = fromArray(new int[]{1,3,5});
        ListNode second = fromArray(new int[]{2,4,6});
        ListNode res = mk.mergeKLists(new ListNode[]{first, second});
        assertArrayEquals(toArray(res), new int[]{1,2,3,4,5,6});
    }

    @Test
    public void mergeKSortedLists_2() {
        ListNode first = fromArray(new int[]{1,4,7});
        ListNode second = fromArray(new int[]{2,5,8});
        ListNode third = fromArray(new int[]{3,6,9});
        ListNode res = mk.mergeKLists(new ListNode[]{first, second, third});
        assertArrayEquals(toArray(res), new int[]{1,2,3,4,5,6,7,8,9});
    }

    @Test
    public void mergeKSortedLists_3() {
        ListNode second = fromArray(new int[]{1,2,3});
        ListNode res = mk.mergeKLists(new ListNode[]{null, second});
        assertArrayEquals(toArray(res), new int[]{1,2,3});
    }

    @Test
    public void mergeKSortedLists_4() {
        ListNode res = mk.mergeKLists(new ListNode[]{null, null});
        assertArrayEquals(toArray(res), new int[]{});
    }

    @Test
    public void mergeKSortedLists_5() {
        ListNode first = fromArray(new int[]{1,2,3});
        ListNode res = mk.mergeKLists(new ListNode[]{first, null});
        assertArrayEquals(toArray(res), new int[]{1,2,3});
    }
}
