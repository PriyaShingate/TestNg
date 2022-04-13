package TestNG;

import org.testng.annotations.Test;

public class GroupAttribute {
  @Test(groups="jbk")
  public void Test01() {
  }
  @Test(groups="jbk")
  public void Test02() {
  }
  @Test(groups="jbk")
  public void Test03() {
  }
  @Test(groups="jbk1")
  public void Test04() {
  }
  @Test(groups="jbk1")
  public void Test05() {
  }

}
//TestNg.xml code
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//  <test thread-count="5" name="Test">
//  <groups>
//  <run>
//  <include name="jbk"></include>
//  <exclude name="jbk1"></exclude>
//  </run>
//  </groups>
//    <classes>
//      <class name="TestNG.GroupAttribute"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->
//output only first three test cases passed beacuse of include 
