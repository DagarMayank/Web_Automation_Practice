package Org.testing.utilities;

import org.json.JSONObject;


public class JsonParsingUsingOrgJson 
{
		public static String parseJson(String responsedata, String keyname)
		{
			JSONObject ob=new JSONObject(responsedata);
			return (String) ob.get(keyname);
		}
		
		public static String responseParse(String string, String keyname)
		{
			JSONObject array =new JSONObject(string);
			int l=array.length();
			for(int i=0;i<l;i++)
			{
				JSONObject ob=new JSONObject();
				System.out.println("Id values are "+ob.get(keyname));
			}
			return string;
		}
}
