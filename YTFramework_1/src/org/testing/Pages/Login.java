package org.testing.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public ChromeDriver driver;
	public Properties pr;
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void login(String username, String password)
	{
		WebElement signin= driver.findElement(By.xpath(pr.getProperty("signin")));
		signin.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement email= driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(username);
		WebElement next= driver.findElement(By.xpath(pr.getProperty("next")));
		next.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement pass = driver.findElement(By.xpath(pr.getProperty("pass")));
		pass.sendKeys(password);
		WebElement next1= driver.findElement(By.xpath(pr.getProperty("next1")));
		next1.click();
	}
}
