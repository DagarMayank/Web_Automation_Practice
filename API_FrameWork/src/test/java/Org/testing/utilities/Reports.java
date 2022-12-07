package Org.testing.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class Reports 
{
	static ExtentReports reports;
	
	

	public static ExtentReports extentRepo()
	{
		reports=new ExtentReports("G:/30-10-2022 desktop backup/eclipse-workspace/API_FrameWork/src/Reports/report.html",false);
		return reports;
	}
}
   