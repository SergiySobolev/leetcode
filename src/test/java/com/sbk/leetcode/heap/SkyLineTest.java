package com.sbk.leetcode.heap;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SkyLineTest {

    private SkyLine skyLine = new SkyLine();

    @Test
    public void getSkyLine_1() {
        int[][] input = new int[][]{{2,9,10}, {3,7,15}, {5,12,12}, {15,20,10}, {19,24,8}};
        List<int[]> l = skyLine.getSkyline(input);
        int[][] expectedRes = new int[][] {{2, 10}, {3 ,15}, {7, 12}, {12 ,0}, {15 ,10}, {20, 8}, {24, 0}};
        assertArrayEquals(l.toArray(), expectedRes);
    }
}