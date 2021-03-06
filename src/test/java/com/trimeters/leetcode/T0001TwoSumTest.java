package com.trimeters.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T0001TwoSumTest {

    @Test
    void twoSum() {
        T0001TwoSum t0001TwoSum = new T0001TwoSum();
        assertArrayEquals(new int[] {0, 1}, t0001TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[] {1, 2}, t0001TwoSum.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[] {0, 1}, t0001TwoSum.twoSum(new int[]{3, 3}, 6));
    }
}