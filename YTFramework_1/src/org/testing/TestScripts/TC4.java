package org.testing.TestScripts;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlay;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 extends Base {


	
	@Test
	public void tc8() throws InterruptedException, IOException
	{
		Login l = new Login(driver, pr);
		l.login("jatinbudhija19", "jaihanumaan1699778");
		Logs.takeLogs("TC4", "Login successfully");
		
		VideoPlay vp = new VideoPlay(driver, pr);
		vp.videoPlay();
		Logs.takeLogs("TC4", "video played successfully");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement subs = driver.findElement(By.xpath(pr.getProperty("subs")));
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(subs));
		subs.click();
		Logs.takeLogs("TC4", "Subscribe button clicked successfully");
		Screenshot.takeScreenshot(driver, "D:\\Selenium\\Screenshots\\TC4.jpg");
		Thread.sleep(5000);
		
	}
	
	
}
