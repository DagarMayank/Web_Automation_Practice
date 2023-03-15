package com.testing.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports 
{
	public ExtentSparkReporter spark = new ExtentSparkReporter("user/build/name/ht.html");
	public ExtentReports extent = new ExtentReports();
	public void rp() {
	extent.attachReporter(spark);

	}
	
}
