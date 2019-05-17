package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public ChromeDriver driver;
	public ChromeOptions options;
	public Properties pr;
	@BeforeMethod
	public void tc1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\class recordings\\exe\\latest\\latest2\\chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		File f = new File("D:\\Selenium\\Workspace\\YTFramework_1\\OR.properties");
		FileInputStream fi = new FileInputStream(f);
		pr= new Properties();
		pr.load(fi);
	}
	
	@AfterMethod
	public void tc3() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		
	}

}
