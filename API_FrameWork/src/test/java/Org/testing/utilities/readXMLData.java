package Org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class readXMLData 
{
	public static String readData(String Path) throws Exception
	{
		File f=new File(Path);
		FileReader fr=new java.io.FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String s;
		String Data=" ";
		while((s=b.readLine())!=null)
		{
			 Data= Data + s;
		}
	  return Data;
	}
}
