package me.nixil.leetcode.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleIITest {

  @Test
  void  generate() {
    assertThat(new PascalTriangleII().generate(0)).containsExactly(1);
    assertThat(new PascalTriangleII().generate(1)).containsExactly(1, 1);
    assertThat(new PascalTriangleII().generate(2)).containsExactly(1, 2, 1);
    assertThat(new PascalTriangleII().generate(3)).containsExactly(1, 3, 3, 1);
    assertThat(new PascalTriangleII().generate(4)).containsExactly(1, 4, 6, 4, 1);
  }
}
