package com.trimeters.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class T0001TwoSum2 {

    /**
     * 通过map实现
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - num1;

            Integer index2 = map.get(num2);
            if (Objects.nonNull(index2)) {
                return new int[]{index2, i};
            }
            map.put(num1, i);
        }

        return new int[]{};
    }

}
