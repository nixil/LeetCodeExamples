package me.nixil.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

  @Test
  void sample1() {
    int[] nums = new int[] { 2, 7, 11, 15 };
    int target = 9;
    Assertions.assertArrayEquals(new int[] { 0, 1 }, new TwoSum().twoSum(nums, target));
  }

  @Test
  void sample2() {
    int[] nums = new int[] { 2, 7, 11, 15 };
    int target = 18;
    Assertions.assertArrayEquals(new int[] { 1, 2 }, new TwoSum().twoSum(nums, target));
  }

  @Test
  void sample3() {
    int[] nums = new int[] { 3, 2, 4 };
    int target = 6;
    Assertions.assertArrayEquals(new int[] { 1, 2 }, new TwoSum().twoSum(nums, target));
  }
}
