package me.nixil.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharTest {

  @Test
  void lengthOfLongestSubstring() {
    assertThat(new LongestSubstringWithoutRepeatingChar().lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    assertThat(new LongestSubstringWithoutRepeatingChar().lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
    assertThat(new LongestSubstringWithoutRepeatingChar().lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    assertThat(new LongestSubstringWithoutRepeatingChar().lengthOfLongestSubstring("aab")).isEqualTo(2);
    assertThat(new LongestSubstringWithoutRepeatingChar().lengthOfLongestSubstring("")).isEqualTo(0);
  }
}
