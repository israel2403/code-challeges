package com.huerta.integers.sec03palindromnumber;

public class Solution {
  public boolean isPaindrome(int x) {
    // x is negative or (x is not zero and x is end wiith 0)
    if (x < 0)
      return false;
    if (x != 0 && x % 10 == 0)
      return false;
    int reverse = 0;
    while (x > reverse) {
      int lastDigit = x % 10;
      reverse = reverse * 10 + lastDigit;
      x /= 10;
    }
    return (x == reverse) || (x == reverse / 10);
  }
}
