package me.nixil.leetcode;

import me.nixil.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static me.nixil.leetcode.common.ListNode.build;
import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersTest {

  @Test
  void test1() {
    AddTwoNumbers solution = new AddTwoNumbers();
    assertThat(solution.addTwoNumbers(build(2, 4, 3), build(5, 6, 4))).isEqualTo(build(7, 0, 8));
    assertThat(solution.addTwoNumbers(build(0, 0, 1), build(6, 4))).isEqualTo(build(6, 4, 1));
    assertThat(solution.addTwoNumbers(build(3), build(1))).isEqualTo(build(4));
    assertThat(solution.addTwoNumbers(build(3), build(7))).isEqualTo(build(0, 1));
    assertThat(solution.addTwoNumbers(build(9, 9, 9 ), build(1))).isEqualTo(build(0, 0, 0, 1));
    assertThat(solution.addTwoNumbers(build(3), build(0))).isEqualTo(build(3));
    assertThat(solution.addTwoNumbers(build(0), build(0))).isEqualTo(build(0));
  }

  @Test
  void testBuilder() {
    ListNode listNode = build(5, 4, 3);
    assertThat(listNode.val).isEqualTo(5);
    assertThat(listNode.next.val).isEqualTo(4);
    assertThat(listNode.next.next.val).isEqualTo(3);
    assertThat(listNode.next.next.next).isEqualTo(null);
  }

  @Test
  void testEquals() {
    assertThat(build(5, 4, 3)).isEqualTo(build(5, 4, 3));
    assertThat(build(5)).isEqualTo(build(5));
  }
}
