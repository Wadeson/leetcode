package com.trimeters.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class T0001TwoSum {

    /**
     * 通过排序，遍历实现
     */
    public int[] twoSum(int[] nums, int target) {
        List<Number> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(new Number(nums[i], i));
        }
        list.sort(Comparator.comparing(Number::getNum).thenComparing(Number::getIndex));

        for (int i = 0, j = list.size() - 1; i < j; ) {
            Number number1 = list.get(i);

            while (i < j) {
                Number number2 = list.get(j);

                int sum = number1.num + number2.num;
                if (sum == target) {
                    return getResult(number1, number2);
                } else if (sum < target) {
                    // j 不动，i 右移一位
                    break;
                } else {
                    // j 左移一位 继续判断
                    j--;
                }
            }

            i++;
        }

        return new int[]{};
    }

    private int[] getResult(Number number1, Number number2) {
        if (number1.index > number2.index) {
            return new int[]{number2.index, number1.index};
        }

        return new int[]{number1.index, number2.index};
    }

    public static class Number {
        /**
         * 树脂
         */
        int num;
        /**
         * 下标
         */
        int index;

        public Number(int num, int index) {
            this.num = num;
            this.index = index;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
}
