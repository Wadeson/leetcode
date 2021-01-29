package com.trimeters.leetcode;

public class T0002AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;

        ListNode l1CurNode = l1;
        ListNode l2CurNode = l2;
        // 进位
        int carry = 0;
        ListNode curNode = null;
        while (l1CurNode != null && l2CurNode != null) {
            int sum = l1CurNode.val + l2CurNode.val + carry;
            carry = carry10(sum);
            int val = mod10(sum);

            curNode = l1CurNode;
            curNode.val = val;

            l1CurNode = l1CurNode.next;
            l2CurNode = l2CurNode.next;
        }

        ListNode nextNode = l1CurNode != null ? l1CurNode : l2CurNode;
        while (nextNode != null) {
            // 提前结束
            if (carry == 0) {
                curNode.next = nextNode;
                break;
            }

            int sum = nextNode.val + carry;
            carry = carry10(sum);
            int val = mod10(sum);

            curNode.next = nextNode;
            curNode = nextNode;
            curNode.val = val;

            nextNode = nextNode.next;
        }

        if (carry != 0) {
            curNode.next = new ListNode(carry, null);
        }

        return result;
    }

    int mod10(int a) {
        if (a >= 10) {
            return a - 10;
        }

        return a;
    }

    int carry10(int a) {
        if (a >= 10) {
            return 1;
        }
        return 0;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
