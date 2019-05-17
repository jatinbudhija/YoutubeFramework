package org.testing.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.html.DisabledElement;

public class TC1 extends Base {
	
	
	@Test
	public void tc2() throws IOException
	{	
				
		Login l = new Login(driver, pr);
		l.login("jatinbudhija19", "jaihanumaan1699778");
		
		// hard assertion: if assertion fails, code stops and will not move forward
		//String exp_URL = "https//www.youtube.com";
		//String act_URL= driver.getCurrentUrl();
		//Assert.assertEquals(act_URL, exp_URL);
		
		Logs.takeLogs("TC1", "Login successfully");
		WebElement trend= driver.findElement(By.xpath(pr.getProperty("trend")));
		trend.click();
		Logs.takeLogs("TC1", "Trending clicked successfully");
		Screenshot.takeScreenshot(driver, "D:\\Selenium\\Screenshots\\TC1.png");
	}
	
	
}
