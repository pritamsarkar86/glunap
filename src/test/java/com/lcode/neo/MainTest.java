package com.lcode.neo;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {

  @BeforeClass
  public static void init(){
    System.out.println("Setup before running the tests");
  }

  @Test
  public void testMain(){
    assertTrue(true);
  }
}
