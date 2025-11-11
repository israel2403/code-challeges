package com.huerta.integers._1fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public String[] fizzBuzz(int n) {
    List<String> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        arr.add("FizzBuzz");
      } else if (i % 3 == 0) {
        arr.add("Fizz");
      } else if (i % 5 == 0) {
        arr.add("Buzz");
      } else {
        arr.add(i + "");
      }
    }
    return arr.toArray(String[]::new);
  }
}

// TC: O(n), SC: O(1)
