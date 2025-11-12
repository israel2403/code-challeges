package com.huerta.integers.sec03palindromnumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Solution1Test {

  @Test
  void test_is_palindrome() {
    // Arrange
    int x = 123321;

    // Act
    boolean actual = Solution1.isPalindrome(x);

    // Assert
    assertTrue(actual);
  }
}
