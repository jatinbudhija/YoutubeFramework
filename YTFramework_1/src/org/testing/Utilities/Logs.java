package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logs {

	public static void takeLogs(String classname, String message)
	{
		Logger l = Logger.getLogger(classname);
		DOMConfigurator.configure("D:\\Selenium\\Workspace\\YTFramework_1\\logs.xml");
		l.info(message);
	}
}
