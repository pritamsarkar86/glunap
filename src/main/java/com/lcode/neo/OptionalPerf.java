package com.lcode.neo;

import java.util.Optional;

public class OptionalPerf {
  // public static void main(String[] args) {
  //   OptionalPerf perf = new OptionalPerf();
  //
  //   // call optional for a few times
  //   System.out.println("Optional call:");
  //   for (int i=1; i <5; i++) {
  //     System.out.printf("In at: %d\n", System.currentTimeMillis());
  //     perf.withOptional(10);
  //     System.out.printf("Out at: %d\n", System.currentTimeMillis());
  //   }
  //
  //   // logic without optional
  //   System.out.println("Regular call:");
  //   System.out.printf("In at: %d\n", System.currentTimeMillis());
  //   perf.withoutOptional(10);
  //   System.out.printf("Out at: %d\n", System.currentTimeMillis());
  // }

  Integer withOptional(Integer inpt) {
    return Optional.ofNullable(inpt)
        .filter(abc -> !abc.equals(0))
        .map(def -> def/10).orElse(0);
  }

  Integer withoutOptional(Integer inpt) {
    if (inpt == 0) {
      return 0;
    }
    return inpt/10;
  }
}
