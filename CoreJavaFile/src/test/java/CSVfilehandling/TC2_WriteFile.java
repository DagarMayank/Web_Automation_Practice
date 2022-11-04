package CSVfilehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TC2_WriteFile {
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../CoreJavaProject/CSVfileHandling1.csv");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		for(int i=0; i<3; i++)
		{
			for(int j=0;j<3 ;j++)
			{
				//	b.write("my");
					//b.write(",");
				
			}
			//b.newLine();
		}b.close();
	}
}
