package org.testing.TestScripts;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Assertions.Assert;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlay;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import okhttp3.internal.http2.Http2Connection.Listener;

public class TC3 extends Base {


	
	@Test
	public void tc8() throws InterruptedException, IOException
	{
		Login l = new Login(driver, pr);
		l.login("jatinbudhija19", "jaihanumaan1699778");
		
		// soft assertion: email id comparison
		String expected = "jatinbudhija19@gmail.com";
		WebElement im = driver.findElement(By.xpath(pr.getProperty("im")));
		im.click();
		WebElement em = driver.findElement(By.xpath(pr.getProperty("em")));
		String actual= em.getText();
		Assert.Assertion1(expected, actual, "TC3");
	
		
		Logs.takeLogs("TC3", "Login successfully");
		
		VideoPlay vp = new VideoPlay(driver, pr);
		vp.videoPlay();
		Logs.takeLogs("TC3", "Video played successfully");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement like = driver.findElement(By.xpath(pr.getProperty("like")));
		Thread.sleep(5000);
		like.click();
		Logs.takeLogs("TC3", "Like button clicked successfully");
		Screenshot.takeScreenshot(driver, "D:\\Selenium\\Screenshots\\TC3.png");
		
	}
	
	
}
