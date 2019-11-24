package me.nixil.leetcode.recursion;

/**
 * Print a string in reverse order
 */
public class ReverseString {

  public void reverseString(char[] str) {
    swapByIndex(0, str.length - 1, str);
  }

  private void swapByIndex(int left, int right, char[] str) {
    if (left >= right)
      return;
    char tmp = str[left];
    str[left] = str[right];
    str[right] = tmp;
    swapByIndex(left + 1, right - 1, str);
  }

  private void swap(char a, char b) {
    char tmp = a;
    a = b;
    b = a;
  }

}
