package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{
	
	
	public void onTestStart(ITestResult tr) {
		System.out.println("test started");
	}
	
	public void onTestSucess(ITestResult tr) {
		System.out.println("test sucess");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("test failure");
	}
	
	public void onTestSkipped(ITestResult tr) {
		System.out.println("test skiped");
	}

}
