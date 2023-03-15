package com.inetbanking1.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class Readconfig {
     Properties pro;
     //constructors
    public Readconfig() 
    {
    	File src=new File("./Configuration/config.properties");
    	
    	try { FileInputStream fis=new FileInputStream(src);
    		pro=new Properties();
    		pro.load(fis); 
    		}catch(Exception e) {
    			System.out.println("Exception e"+e.getMessage());
    	}
    }
    //methods
    public String getApplicationURL() {
      String url=pro.getProperty("baseURL");
	  return url;
    }
    
    public String getUsername() 
    {
		String username=pro.getProperty("username");
		return username;
    }
				
	public String getPassword() 
	{
		String password=pro.getProperty("password");
		return password;
    	
    }
	
	public String getChromePath() 
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
     
}
}







