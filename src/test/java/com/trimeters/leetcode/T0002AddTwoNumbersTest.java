package com.trimeters.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T0002AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        T0002AddTwoNumbers.ListNode l1 = createNodeList(new int[]{2, 4, 3});
        T0002AddTwoNumbers.ListNode l2 = createNodeList(new int[]{5, 6, 4});
        System.out.println(toList(l1));
        System.out.println(toList(l2));

        T0002AddTwoNumbers t0002AddTwoNumbers = new T0002AddTwoNumbers();
        T0002AddTwoNumbers.ListNode listNode = t0002AddTwoNumbers.addTwoNumbers(l1, l2);

        List<Integer> result = toList(listNode);
        System.out.println(result);
        assertIterableEquals(Arrays.asList(7, 0, 8), result);
    }

    @Test
    void addTwoNumbers2() {
        T0002AddTwoNumbers.ListNode l1 = createNodeList(new int[]{0});
        T0002AddTwoNumbers.ListNode l2 = createNodeList(new int[]{0});
        System.out.println(toList(l1));
        System.out.println(toList(l2));

        T0002AddTwoNumbers t0002AddTwoNumbers = new T0002AddTwoNumbers();
        T0002AddTwoNumbers.ListNode listNode = t0002AddTwoNumbers.addTwoNumbers(l1, l2);

        List<Integer> result = toList(listNode);
        System.out.println(result);
        assertIterableEquals(Arrays.asList(0), result);
    }

    @Test
    void addTwoNumbers3() {
        T0002AddTwoNumbers.ListNode l1 = createNodeList(new int[]{9, 9, 9, 9, 9, 9, 9});
        T0002AddTwoNumbers.ListNode l2 = createNodeList(new int[]{9, 9, 9, 9});
        System.out.println(toList(l1));
        System.out.println(toList(l2));

        T0002AddTwoNumbers t0002AddTwoNumbers = new T0002AddTwoNumbers();
        T0002AddTwoNumbers.ListNode listNode = t0002AddTwoNumbers.addTwoNumbers(l1, l2);

        List<Integer> result = toList(listNode);
        System.out.println(result);
        assertIterableEquals(Arrays.asList(8, 9, 9, 9, 0, 0, 0, 1), result);
    }

    @Test
    void addTwoNumbers4() {
        T0002AddTwoNumbers.ListNode l1 = createNodeList(new int[]{2, 4, 9});
        T0002AddTwoNumbers.ListNode l2 = createNodeList(new int[]{5, 6, 4, 9});
        System.out.println(toList(l1));
        System.out.println(toList(l2));

        T0002AddTwoNumbers t0002AddTwoNumbers = new T0002AddTwoNumbers();
        T0002AddTwoNumbers.ListNode listNode = t0002AddTwoNumbers.addTwoNumbers(l1, l2);

        List<Integer> result = toList(listNode);
        System.out.println(result);
        assertIterableEquals(Arrays.asList(7,0,4,0,1), result);
    }

    List<Integer> toList(T0002AddTwoNumbers.ListNode listNode) {
        List<Integer> list = new ArrayList<>();

        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }

        return list;
    }

    T0002AddTwoNumbers.ListNode createNodeList(int[] nums) {
        T0002AddTwoNumbers.ListNode first = new T0002AddTwoNumbers.ListNode(nums[0], null);

        T0002AddTwoNumbers.ListNode last = first;
        for (int i = 1; i < nums.length; i++) {
            last.next = new T0002AddTwoNumbers.ListNode(nums[i], null);
            last = last.next;
        }

        return first;
    }
}