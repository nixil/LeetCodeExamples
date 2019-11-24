package me.nixil.leetcode;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {

    int i, j;

    for (i = 0; i < nums.length - 1; i++) {
      for (j = i + 1; j <= nums.length - 1; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }

    return null;
  }
}
