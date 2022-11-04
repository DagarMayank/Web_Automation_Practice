package Org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHandle 
{
	public static String ReadJson(String jsonpath) throws IOException  
	{
		File f=new File(jsonpath);
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject js=new JSONObject(jt);
		return js.toString();
	}
}
