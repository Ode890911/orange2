package com.custom.library;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestNGITestListener implements ITestListener {
	//ItestListener is an interface created by encapsulation to hide the logic
	//interface dont have logic, we have to write our own logic
//this class implement ItestListener from TestNG
	private static ExtentReports extent = ExtentManager.CreateInstance("extent.html");
	private static ThreadLocal parentTest = new ThreadLocal();
	private static ThreadLocal test = new ThreadLocal();
	
	@Override
	//listener (from testNG) listen to my test and whenever test fail or pass it log
	public synchronized void onStart(ITestContext context)// when test start
	{
		ExtentTest parent = extent.createTest(getClass().getName());
		parentTest.set(parent);
	}
	
	@Override
	public synchronized void onFinish(ITestContext context)// when test finish
	{
		extent.flush();//generate report
	}
	
	@Override
	public synchronized void onTestStart(ITestResult result)
	{
		ExtentTest child = ((ExtentTest)parentTest.get()).createNode(result.getMethod().getMethodName());
		test.set(child);
	}
	
	@Override
	public synchronized void onTestSuccess(ITestResult result)
	{
		((ExtentTest) test.get()).pass("Test passed");
	}
	
	@Override
	public synchronized void onTestFailure(ITestResult result)
	{
		((ExtentTest) test.get()).fail(result.getThrowable());
	}
	
	@Override
	public synchronized void onTestSkipped(ITestResult result)
	{
		((ExtentTest) test.get()).skip(result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//DO NOTHING		
	}
	
	public void test(){
		
	System.out.println("asc");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
