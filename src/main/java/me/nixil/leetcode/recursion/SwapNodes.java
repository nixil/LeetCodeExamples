package me.nixil.leetcode.recursion;

import me.nixil.leetcode.common.ListNode;

import static me.nixil.leetcode.common.ListNode.build;

/**
 * https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1681/
 */
public class SwapNodes {

  public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    doSwap(dummy, head);
    return dummy.next;
  }

  private void doSwap(ListNode pre, ListNode head) {
    if (head != null && head.next != null) {
      pre.next = head.next;
      head.next = head.next.next;
      pre.next.next = head;
      doSwap(head, head.next);
    }
  }
}
