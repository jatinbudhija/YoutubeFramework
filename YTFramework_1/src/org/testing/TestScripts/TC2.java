package org.testing.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Assertions.Assert;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends Base {

	
	
	@Test
	public void tc5() throws IOException, InterruptedException
	{
		Login l = new Login(driver, pr);
		l.login("jatinbudhija19", "jaihanumaan1699778");
		Thread.sleep(5000);
		
		// soft assertion: URL comparison
		String expected= "https://www.youtube.com/";
		String actual = driver.getCurrentUrl();
		Assert.Assertion1(expected, actual, "TC2");
		
		Logs.takeLogs("TC2", "Login successfully");
		
		WebElement subscribe= driver.findElement(By.xpath(pr.getProperty("subscribe")));
		subscribe.click();
		
		Logs.takeLogs("TC2", "Subscription clicked successfully");
		Screenshot.takeScreenshot(driver, "D:\\Selenium\\Screenshots\\TC2.png");
	}
	
	
}
