package org.testing.Pages;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogCapture 
{
	public static void takeLog(String string, String msg)
	{
		DOMConfigurator.configure("../YoutubeFramework/Layout.xml");
		Logger log=Logger.getLogger(string);
		log.info(msg);
	}

}

