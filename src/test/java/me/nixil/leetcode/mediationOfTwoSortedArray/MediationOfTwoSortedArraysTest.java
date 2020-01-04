package me.nixil.leetcode.mediationOfTwoSortedArray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MediationOfTwoSortedArraysTest {

  @Test
  void findMedianSortedArrays() {
    final MediationOfTwoSortedArrays solution = new MediationOfTwoSortedArrays();
    assertThat(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})).isEqualTo(2.5d);
//    assertThat(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2})).isEqualTo(2);
  }

  @Test
  void merge() {
    assertThat(MediationOfTwoSortedArrays.merge(new int[]{1, 3}, new int[]{2})).containsExactly(1, 2, 3);
//    assertThat(MediationOfTwoSortedArrays.merge(new int[]{1, 2, 3}, new int[]{4, 5, 6})).containsExactly(1, 2, 3, 4, 5, 6);
//    assertThat(MediationOfTwoSortedArrays.merge(new int[]{1, 2, 3}, new int[]{})).containsExactly(1, 2, 3);
//    assertThat(MediationOfTwoSortedArrays.merge(new int[]{}, new int[]{1, 2, 3})).containsExactly(1, 2, 3);
//    assertThat(MediationOfTwoSortedArrays.merge(new int[]{}, new int[]{})).isEmpty();
  }

  @Test
  void mediationValue() {
    assertThat(MediationOfTwoSortedArrays.mediationValue(new int[]{1, 2, 3})).isEqualTo(2.0);
    assertThat(MediationOfTwoSortedArrays.mediationValue(new int[]{1, 2, 3, 4})).isEqualTo(2.5);
  }

  @Test
  void test1() {
    int[] a = new int[]{1, 2, 3, 4, 5};
    int j = a.length - 1;
    int[] b = new int[a.length];
    int i = 0;
    while (j >= 0) {
      b[i++] = a[j--];
    }
    assertThat(b).containsExactly(5,4,3,2,1);
  }
}
