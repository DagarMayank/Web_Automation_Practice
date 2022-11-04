package KamalClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptionhandling3 {
public static void main(String[] args) throws Exception  {
	exceptionhandling3 e3=new exceptionhandling3();
	try {
		e3.method();
		System.out.println("file found");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("file not found");
		throw new Exception("check the provided path");
	}
	finally {
		System.out.println("you are outside the try catch block");
	}
	
}
public void method() throws Exception {
	File file = new File("C:\\Users\\Dagar\\eclipse-workspace\\CoreJavaProject\\JavaTextFileHandling.tx");
	FileReader f1 = new FileReader(file);	
}
}
