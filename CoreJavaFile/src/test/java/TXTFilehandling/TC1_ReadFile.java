package TXTFilehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TC1_ReadFile 
{

	
	public void read() throws IOException
	{
		File f=new File("../CoreJavaFile/JavaTextFileHandling.txt");
		@SuppressWarnings("resource")
		FileReader fr=new FileReader(f);
		
		int a;
        while ((a = fr.read()) != -1) 
        {
            System.out.print((char) a);
        }
	}
	public static void main(String[] args) throws IOException 
	{
		TC1_ReadFile  t=new TC1_ReadFile();
		t.read();
	}

}
