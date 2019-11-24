package me.nixil.leetcode.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

  @Test
  void reverseSimple() {
    char[] str = new char[] { 'a', 'b', 'c', 'd', 'e' };
    new ReverseString().reverseString(str);

    Assertions.assertArrayEquals(str, new char[] { 'e', 'd', 'c', 'b', 'a' });
  }

  @Test
  void reverseTwo() {
    char[] str = new char[] { 'a', 'b' };
    new ReverseString().reverseString(str);

    Assertions.assertArrayEquals(str, new char[] { 'b', 'a' });
  }

  @Test
  void reverseOne() {
    char[] str = new char[] { 'a' };
    new ReverseString().reverseString(str);
    Assertions.assertArrayEquals(str, new char[] { 'a' });
  }
}
