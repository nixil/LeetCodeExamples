package me.nixil.leetcode.recursion;

import org.junit.jupiter.api.Test;

import static me.nixil.leetcode.common.ListNode.build;
import static org.assertj.core.api.Assertions.assertThat;

class SwapNodesTest {

  // @Test
  void test1() {
    assertThat(new SwapNodes().swapPairs(build(1, 2, 3, 4))).isEqualTo(build(2, 1, 4, 3));
  }
}
