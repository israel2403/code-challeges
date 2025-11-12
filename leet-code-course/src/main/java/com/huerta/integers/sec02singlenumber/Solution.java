package com.huerta.integers.sec02singlenumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  private static int singleNumber(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(i)) {
        set.remove(i);
      } else {
        set.add(nums[i]);
      }
    }
    return set.iterator().next();
  }

  public static int singleNumberImproved(int[] nums) {
    int singleNumber = 0;
    for (int i : nums) {
      singleNumber ^= i;
    }
    return singleNumber;
  }
}
