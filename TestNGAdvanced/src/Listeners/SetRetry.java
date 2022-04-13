package Listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class SetRetry implements IAnnotationTransformer{
	@Override
  public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod) {
   annotation.setRetryAnalyzer(RetryListener.class);

  }
}
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//<listeners>
//<listener class-name="Listeners.SetRetry"></listener>
//</listeners>
//  <test thread-count="5" name="Test">
//    <classes>
//      <class name="Listeners.DemoRetryListener"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->