package com.sbk.leetcode.math;

import com.sbk.leetcode.math.RotateArray;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RotateArrayTest {
    private RotateArray rotateArray = new RotateArray();

    @Test
    public void rotate_1() {
        int[] num = new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(num, 3);
        assertEquals(Arrays.toString(num), Arrays.toString(new int[]{5,6,7,1,2,3,4}));
        num = new int[]{1,2};
        rotateArray.rotate(num,2);
        assertEquals(Arrays.toString(num), Arrays.toString(new int[]{1,2}));
        rotateArray.rotate(num,3);
        assertEquals(Arrays.toString(num), Arrays.toString(new int[]{2, 1}));
    }

}