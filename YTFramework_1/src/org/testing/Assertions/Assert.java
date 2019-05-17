package org.testing.Assertions;

import org.testing.Utilities.Logs;

public class Assert {

	// Soft Assertion: Assertion pass or fail, code will move forward
	public static void Assertion1(String expected, String actual, String classname)
	{
		if(expected.equals(actual))
		{
			Logs.takeLogs(classname, "Assertion pass");
		}
		else
		{
			Logs.takeLogs(classname, "Assertion fail");
		}
		
	}
}
