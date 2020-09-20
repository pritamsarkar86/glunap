package com.lcode.neo;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
  static TwoSum twoSum;

  @BeforeClass
  public static void init(){
    twoSum = new TwoSum();
  }

  @Test
  public void testPositive() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] expected = {0, 1};
    int[] result = twoSum.twoSum(nums, target);
    assertArrayEquals(result, expected);
  }
}
