package me.nixil.leetcode.mediationOfTwoSortedArray;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 * Accepted
 * 556,966
 * Submissions
 * 1,995,172
 */
public class MediationOfTwoSortedArrays {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    /*int[] merged = merge(nums1, nums2);
    final int length = merged.length;

    if (length == 0) return 0.0d;

    if (length % 2 == 0) {
      return (merged[length / 2 - 1] + merged[length / 2]) / 2.0d;
    } else {
      return merged[length / 2];
    }*/
    return findMediation(nums1, nums2);
  }

  public static int[] merge(int[] nums1, int[] nums2) {

    if ((nums1 == null || nums1.length == 0) && (nums2 != null)) {
      return nums2;
    }
    if ((nums2 == null || nums2.length == 0) && nums1 != null) {
      return nums1;
    }
//    if (nums1 == null) {
//      return new int[0];
//    }


    final int[] merged = new int[nums1.length + nums2.length];

    int p1 = 0, p2 = 0;
    while (p1 < nums1.length || p2 < nums2.length) {

      if (p1 == nums1.length && p2 < nums2.length) {
        merged[p1 + p2] = nums2[p2];
        p2++;
        continue;
      }

      if (p2 == nums2.length && p1 < nums1.length) {
        merged[p1 + p2] = nums1[p1];
        p1++;
        continue;
      }

      if (nums1[p1] <= nums2[p2]) {
        merged[p1 + p2] = nums1[p1];
        p1++;
      } else {
        merged[p1 + p2] = nums2[p2];
        p2++;
      }
    }
    return merged;
  }

  public static double findMediation(int[] nums1, int[] nums2) {

    if ((nums1 == null || nums1.length == 0) && (nums2 != null)) {
      return mediationValue(nums2);
    }
    if ((nums2 == null || nums2.length == 0) && nums1 != null) {
      return mediationValue(nums1);
    }

    int length1 = nums1.length, length2 = nums2.length;

    if ((length1 + length2) % 2 == 1) {
      int mediationIndex = (length1 + length2) / 2;
      int p1 = 0, p2 = 0;
      while ((p1 + p2) <= mediationIndex) {
        if (p1 == nums1.length && p2 < nums2.length) {
          p2++;
          continue;
        }

        if (p2 == nums2.length && p1 < nums1.length) {
          p1++;
          continue;
        }

        if (nums1[p1] <= nums2[p2]) {
          p1++;
        } else {
          p2++;
        }
      }
      return Math.max(nums1[p1], nums2[p2]);
    } else {
      int mediationIndexRight = (length1 + length2) / 2;

      int p1 = 0, p2 = 0;
      while ((p1 + p2) <= mediationIndexRight) {
        if (p1 == nums1.length - 1 && p2 < nums2.length) {
          p2++;
          continue;
        }

        if (p2 == nums2.length - 1 && p1 < nums1.length) {
          p1++;
          continue;
        }

        if (nums1[p1] <= nums2[p2]) {
          p1++;
        } else {
          p2++;
        }
      }

      int valRight = nums1[p1] > nums2[p2] ? nums1[p1] : nums2[p2];
      int valLeft;
      if (p1 == mediationIndexRight) {
        valLeft = nums1[p1 - 1] > nums2[p2] ? nums1[p1 - 1] : nums2[p2];
      } else {
        valLeft = nums2[p2 - 1] > nums1[p1] ? nums2[p2 - 1] : nums1[p1];
      }
      return (valRight + valLeft) / 2.0;
    }

  }

  static double mediationValue(int[] numbers) {
    final int length = numbers.length;
    return length % 2 == 1 ? numbers[length / 2] : (numbers[length / 2] + numbers[length / 2 - 1]) / 2.0;
  }


}
