package com.inetbanking1.utilities;

import java.io.File;
import java.io.*;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {
   
	  public static String[][] getExcelVal() throws Exception {

		  File file=new File(System.getProperty("user.dir")+"\\\\Configuration\\\\LoginData.xlsx");
		  
	       FileInputStream fis=new FileInputStream(file);
	       XSSFWorkbook workbook=new XSSFWorkbook(fis);

	        XSSFSheet  sheet=workbook.getSheetAt(0);
	        int rownum=sheet.getLastRowNum();
	        int colnum=sheet.getRow(1).getLastCellNum();  
	        
	       String[][] logindata=new String[rownum][colnum];
	        for(int i=1;i<=rownum;i++)
	        {
	        	XSSFRow row=sheet.getRow(i);
	         	 for(int j=0;j<colnum;j++)
	             {
	                 XSSFCell cell=row.getCell(j);
	                 DataFormatter data=new DataFormatter();
	                 logindata[i-1] [j]=data.formatCellValue(cell);
                     String name=logindata[i-1] [j];
	                 System.out.print(name+" ");
	             }
	             System.out.println(" ");

	               
	
	        }
			return logindata;
     }
	
	  
	  public static void main(String[] args) {
		try {
			getExcelVal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  
} 
	  
