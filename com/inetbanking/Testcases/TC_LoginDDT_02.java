package com.inetbanking.Testcases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking1.pagesobject.Baseclass;
import com.inetbanking1.pagesobject.Loginpage1;


public class TC_LoginDDT_02 extends Baseclass {


	@Test(dataProvider="LoginData")
     public void loginDDT(String user,String Pwd) 
     {
    	 Loginpage1 lp=new Loginpage1(driver);
    	 lp.setUserName(user);
    	 lp.settypePassword(Pwd);
    	 lp.ClickSubmit();
     

     
   if( isAlertPresent()==true)
   { 
	   driver.switchTo().alert().accept();
       driver.switchTo().defaultContent();
       getSCREENSHOT(driver,"LoginData");
      System.out.println("the test is failed");
       Assert.assertTrue(false);
       
     
     }
 
   else if(isAlertPresent()==false)
   {
	   Assert.assertTrue(true);
	   lp.clickLogoutbtn();
	   driver.switchTo().alert().accept();
	   driver.switchTo().defaultContent();
	 
   }
   
     }
 
public boolean isAlertPresent() {
	   try {
		   driver.switchTo().alert();
		   return true;
	   }
	   catch(NoAlertPresentException e)
	   {
		   return false;
	   }
   }
   
     @DataProvider(name="LoginData")
     public static  String[][] getExcelVal() throws Exception {

	  File file=new File("./Configuration/LoginData.xlsx");
	  
     FileInputStream fis=new FileInputStream(file);
    Workbook wb=WorkbookFactory.create(fis);

      Sheet  sheet=wb.getSheetAt(0);
      int rownum=sheet.getLastRowNum();
      Row rowcells=sheet.getRow(0);
      int colnum=rowcells.getLastCellNum();
      
      DataFormatter data=new DataFormatter();
      
     String[][] logindata=new String[rownum][colnum];
     System.out.println(logindata.length);
      for(int i=1;i<=rownum;i++)
      {
      
       	 for(int j=0;j<colnum;j++)
           {
             
               logindata[i-1][j]=data.formatCellValue(sheet.getRow(i).getCell(j));
               System.out.println(logindata[i-1][j]);
           }
 
      }
		return logindata;
}
     
 
}
    
     
     