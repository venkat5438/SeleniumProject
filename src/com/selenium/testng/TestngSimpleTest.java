package com.selenium.testng;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestngSimpleTest {
  @Test
  public void testAdd(){
	  String str="venkat";
	 assertEquals("venkat",str);
  }
}
