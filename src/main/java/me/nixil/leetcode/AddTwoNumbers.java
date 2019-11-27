package me.nixil.leetcode;

import me.nixil.leetcode.common.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in <b>reverse order</b> and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode dummy = new ListNode(-1);
    ListNode pointer = dummy;

    while (l1 != null || l2 != null || carry != 0) {
      int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
      ListNode next = new ListNode(sum % 10);
      carry = sum / 10;
      pointer.next = next;
      pointer = next;

      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    return dummy.next;
  }

}
