package me.nixil.leetcode.common;

import java.util.Objects;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  public static ListNode build(Integer... digits) {
    ListNode head = null, pre = null;
    for (Integer x : digits) {
      ListNode current = new ListNode(x);
      if (head == null) {
        head = current;
        pre = current;
      } else {
        pre.next = current;
        pre = current;
      }
    }
    return head;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNode listNode = (ListNode) o;
    if (val != listNode.val) return false;

    if (next != null) {
      return next.equals(listNode.next);
    } else {
      return listNode.next == null;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, next);
  }

  @Override
  public String toString() {
    return next == null ? String.valueOf(val) : val + " -> " + next.toString();
  }
}
