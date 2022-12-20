package Org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class conversionXML_Json
{
	public static String xmltojson(String xmlData)
	{
		JSONObject js=XML.toJSONObject(xmlData);
		return js.toString();
	}

	public static String jsontoxml(String JsonData)
	{
		JSONObject js=new JSONObject(JsonData);
		String xml_Data=XML.toString(js);
		return xml_Data;
	}
}
