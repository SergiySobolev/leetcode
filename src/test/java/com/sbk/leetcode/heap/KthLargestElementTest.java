package com.sbk.leetcode.heap;

import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;

import static org.junit.Assert.*;


public class KthLargestElementTest {
    private KthLargestElement kthLargestElement = new KthLargestElement();
    @Test
    public void findKthLargest() throws Exception {
        assertEquals(3, kthLargestElement.findKthLargest(new int[]{3,2,1,5,6,4}, 4));
        assertEquals(5, kthLargestElement.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(2, kthLargestElement.findKthLargest(new int[]{2,1}, 1));
        assertEquals(1, kthLargestElement.findKthLargest(new int[]{2,1}, 2));
    }

}