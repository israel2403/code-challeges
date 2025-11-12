package com.huerta.integers.sec01fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

  private Solution sol;

  @BeforeEach
  void setUp() {
    this.sol = new Solution();
  }

  @Test
  void test_fizz_buzz() {
    // Arrange
    String[] expected = { "1", "2", "Fizz" };

    // Act
    String[] actual = this.sol.fizzBuzz(3);

    // Assert
    assertArrayEquals(expected, actual);
  }
}
