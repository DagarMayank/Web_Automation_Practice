package ExcelFilehandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TC1_ReadFile {
	public static void main(String[] args) throws BiffException, IOException 
	{
			File f=new File("../CoreJavaFile/ExcelFileHandling.xls");
			
			Workbook w=Workbook.getWorkbook(f);
			Sheet	s=w.getSheet(0);
			int r=  s.getRows();			//no of row
			int c=	s.getColumns();			//no of column
			
			for(int i=0; i<r ;i++)
			{
				for(int j=0; j<c ;j++)
				{
					Cell   wc=s.getCell(j, i);
					System.out.println(wc.getContents());		//get content is used to change the system language into readable lang
				}
			}
	}
}


