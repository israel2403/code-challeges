package com.huerta.integers._1fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
    List<Integer> list = List.of(2, 15, 30, 60, 0);
    String[] expected = { "1", "2", "Fizz" };

    // Act
    String[] actual = this.sol.fizzBuzz(3);

    // Assert
    assertArrayEquals(expected, actual);
  }
}
