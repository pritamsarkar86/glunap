package com.lcode.neo;

import java.util.HashMap;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int index = 0;
    int[] res = new int[0];
    for (int num: nums) {
      int req = target - num;
      int seenIndex = hashMap.getOrDefault(req, -1);
      if (seenIndex != -1) {
         res = new int[] {seenIndex, index};
      } else {
        hashMap.put(num, index);
      }
      index += 1;
    }
    return res;
  }
}
