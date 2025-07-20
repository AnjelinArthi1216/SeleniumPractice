package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class TestNGListners implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test started"+ result.getMethod()
        .getConstructorOrMethod()
        .getMethod()
        .getAnnotation(Test.class).testName());
	}
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test is successful"+ result.getStatus()+"Started On:"+result.getStartMillis()+"Ended On:"+result.getEndMillis());
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test Failed"+result.getThrowable());
	}
	

}
