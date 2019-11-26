package me.nixil.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {

    if (nums.length < 3) {
      return Collections.emptyList();
    }

    Arrays.sort(nums);

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {

      if (nums[i] > 0) { //first element should always be negative
        break;
      }

      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int j = i + 1, k = nums.length - 1;

      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum < 0) {
          j++;
        } else if (sum > 0) {
          k--;
        } else {
          result.add(Arrays.asList(nums[i], nums[j], nums[k]));
          while (j + 1 < nums.length && nums[j + 1] == nums[j]) {
            j++;
          }
          while (k - 1 > 0 && nums[k - 1] == nums[k]) {
            k--;
          }
          j++;
          k--;
        }
      }
    }
    return result;
  }
}
