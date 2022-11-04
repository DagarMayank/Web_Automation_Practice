package TXTFilehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TC2_ReadDataLinebylineTXTfile {


	@SuppressWarnings("resource")
	public void readline() throws IOException
	{
		File f=new File("../CoreJavaFile/JavaTextFileHandling.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String st;
        
        while ((st = br.readLine()) != null)
		{
			System.out.println(st);
		}
	}
	public static void main(String[] args) throws IOException 
	{
			TC2_ReadDataLinebylineTXTfile rd=new TC2_ReadDataLinebylineTXTfile();
			rd.readline();
	}

}
