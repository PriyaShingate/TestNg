package TestNG;

import org.testng.annotations.Test;

public class ParrallelExecution {
	
	@Test
	  public void Test01() {
		System.out.println("Test01");
	  }
	  @Test
	  public void Test02() {
			System.out.println("Test02");
	  }
	  @Test
	  public void Test03() {
			System.out.println("Test03");
	  }
	  @Test
	  public void Test04() {
			System.out.println("Test04");
	  }
	  @Test
	  public void Test05() {
			System.out.println("Test05");
	  }

	}
//Sequence of execution of test cases is different every time it is unpredictable in parallel execution
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite" parallel="methods" thread-count="5">
//  <test thread-count="5" name="Test">
//    <classes>
//      <class name="TestNG.ParrallelExecution"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->

