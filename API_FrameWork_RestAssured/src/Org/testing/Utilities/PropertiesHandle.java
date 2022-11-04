package Org.testing.Utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandle 
{
	public static Properties ReadProperties(String filePath) throws IOException
																	//properties class of return type is properties)
	{
			File f=new File(filePath);						//connection between file
			FileReader fr=new FileReader(f);				//for reading the file
			Properties pr=new Properties();					//Loading the value in the Properties file
			pr.load(fr);
			return pr;
	}
}
