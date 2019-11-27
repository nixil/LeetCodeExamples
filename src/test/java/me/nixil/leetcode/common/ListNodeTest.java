package me.nixil.leetcode.common;

import org.junit.jupiter.api.Test;

import static me.nixil.leetcode.common.ListNode.build;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class ListNodeTest {
  @Test
  void testBuilder() {
    ListNode listNode = build(5, 4, 3);
    assertThat(listNode.val).isEqualTo(5);
    assertThat(listNode.next.val).isEqualTo(4);
    assertThat(listNode.next.next.val).isEqualTo(3);
    assertThat(listNode.next.next.next).isEqualTo(null);

    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy( () -> build(null));
  }

  @Test
  void testEquals() {
    assertThat(build(5, 4, 3)).isEqualTo(build(5, 4, 3));
    assertThat(build(5)).isEqualTo(build(5));
    assertThat(build(0)).isEqualTo(new ListNode(0));
    assertThat(build(-1)).isEqualTo(new ListNode(-1));
  }
}
