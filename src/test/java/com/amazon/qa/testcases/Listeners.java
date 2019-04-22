package com.amazon.qa.testcases;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter  {
	  public void ontestStart(ITestResult tr) {
		  System.out.println("Test Started");
	  }
	  public void ontestSucces(ITestResult tr) {
		  System.out.println("Test Passed");
	  }
	  public void ontestFailure(ITestResult tr) {
		  System.out.println("Test Failure");
	  }
	  public void ontestSkipped(ITestResult tr) {
		  System.out.println("Test Skipped");
	  }
	

	}


