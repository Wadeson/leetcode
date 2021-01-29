package com.trimeters.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T0001TwoSum2Test {

    @Test
    void twoSum() {
        T0001TwoSum2 t001TwoSum = new T0001TwoSum2();
        assertArrayEquals(new int[] {0, 1}, t001TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[] {1, 2}, t001TwoSum.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[] {0, 1}, t001TwoSum.twoSum(new int[]{3, 3}, 6));
    }

}