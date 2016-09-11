package com.sbk.leetcode.heap;

import org.junit.Test;

import static com.sbk.leetcode.heap.ListNodeUtil.fromArray;
import static com.sbk.leetcode.heap.ListNodeUtil.toArray;
import static org.junit.Assert.*;

/**
 * Created by User on 11.09.2016.
 */
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
}
