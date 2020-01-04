package me.nixil.leetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
  public List<List<Integer>> generate(int numRows) {

    List<List<Integer>> pascalTriangle = new ArrayList<>();
    addRows(pascalTriangle, 1, numRows);
    return pascalTriangle;
  }

  private void addRows(List<List<Integer>> result, int rowNumber, int rowsLimit) {
    if (rowNumber > rowsLimit) {
      return;
    }
    if (rowNumber == 1) {
      result.add(Arrays.asList(1));
    } else {
      List<Integer> lastRow = result.get(rowNumber - 2);
      List<Integer> newRow = new ArrayList<>(rowNumber);
      newRow.add(1);
      for (int i = 0; i < rowNumber; i++) {
        if (i == 0 || i == rowNumber - 1) {
        } else {
          newRow.add(lastRow.get(i - 1) + lastRow.get(i));
        }
      }
      newRow.add(1);
      result.add(newRow);
    }
    addRows(result, rowNumber + 1, rowsLimit);
  }


}
