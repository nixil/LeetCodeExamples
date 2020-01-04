package me.nixil.leetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII {
  public List<Integer> generate(int rowIndex) {
    int rowNum = rowIndex + 1;
    List<Integer> row = new ArrayList<>(rowNum);
    for (int i = 1; i <= rowNum; i++) {
      row.add(1);
      for (int j = i - 2; j > 0; j--) {
        row.set(j, row.get(j) + row.get(j - 1));
      }
    }
    return row;
  }

}
