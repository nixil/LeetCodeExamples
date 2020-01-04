package me.nixil.leetcode;

public class LongestSubstringWithoutRepeatingChar {

  public int lengthOfLongestSubstring(String s) {

//    if (s.length() == 0) {
//      return 0;
//    }
    char[] chars = s.toCharArray();
    int result = -1;
    int start = 0, end = 0;

    while (start < chars.length && end < chars.length) {
      for (int i = start; i < end; i++) {
        if (chars[i] == chars[end]) {
          //find duplicate
          int length = end - start;
          if (result < length) {
            result = length;
          }
          start = i + 1;
          break;
        }
      }
      end++;
    }
    int lastLength = end - start;
    return Math.max(lastLength, result);
  }
}
