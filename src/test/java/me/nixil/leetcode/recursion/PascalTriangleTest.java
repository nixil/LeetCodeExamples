package me.nixil.leetcode.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class PascalTriangleTest {

  @Test
  void generate() {
    List<List<Integer>> result = new PascalTriangle().generate(5);

    result.forEach( x -> {
      System.out.println(String.format("[%s]", x.stream().map(Object::toString).collect(Collectors.joining(","))));
    });

  }
  @Test
  void generate2() {
    List<List<Integer>> result = new PascalTriangle().generate(1000);
  }
}
