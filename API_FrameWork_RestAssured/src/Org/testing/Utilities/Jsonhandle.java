package Org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Jsonhandle 
{
	public static String ReadJson(String jsonFilepath) throws FileNotFoundException //to read the Jsonfile
	{
		File f=new File(jsonFilepath);
		FileReader fr=new FileReader(f);					//Reading the json file
		JSONTokener jt=new JSONTokener(fr);					//object to read the file in the json format
		JSONObject js=new JSONObject(jt);
		return js.toString();								//giving the json file value in String form
		
	}
}
