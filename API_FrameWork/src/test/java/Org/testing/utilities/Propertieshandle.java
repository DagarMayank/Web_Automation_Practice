package Org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertieshandle 
{
		public static Properties ReadProperties(String filePath) throws IOException
		{
			File f=new File(filePath);
			FileReader fr=new FileReader(f);
			Properties pr=new Properties();
			pr.load(fr);
			return pr;
		}
}
