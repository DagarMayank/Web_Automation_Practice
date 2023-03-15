package com.inetbanking1.utilities;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting extends TestListenerAdapter
{
	 Date d=new Date();
	
	 String newDate=d.toString();
	 
	String modifyDate=newDate.replace(" ","_").replace(":","_")+".html";
	
	 ExtentReports extent=new ExtentReports();
	 ExtentSparkReporter spark=new ExtentSparkReporter("./ExtentReport/+"+modifyDate+"");
	 
	 public WebDriver driver;
	 ExtentTest test;
	 
	 @Override
	 public void onStart(ITestContext testContext)
	 {
	     extent.attachReporter(spark);
	     test=extent.createTest("this is verify page").assignAuthor("srishti").assignCategory("smoke");
	     test.info("project name =>Banking");
	     test.info("this is login test");

	 }
	     @Override
	 public void onTestSuccess(ITestResult tr)
	 {


	     test.log(Status.PASS,"sucessfully pass "+tr.getName());

	 }
	 @Override
	 public void onTestFailure(ITestResult tr)
	 {


	     test.log(Status.FAIL," test case"+tr.getName()+" is failed ");

	     




	 }
	 @Override
	 public void onTestSkipped(ITestResult tr)
	 {

	     test.log(Status.SKIP,"test case "+tr.getName()+"is skip");
	 }

	  

	 @Override
	 public void onFinish(ITestContext testContext)
	 {
	     test.log(Status.INFO,"test is finished");
	     extent.flush();
	 }

	

	 
    
	

}











