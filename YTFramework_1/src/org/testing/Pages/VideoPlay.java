package org.testing.Pages;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
	public ChromeDriver driver;
	public Properties pr;
	public VideoPlay(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void videoPlay()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> all=driver.findElements(By.xpath("//*[@id='video-title']"));
		all.get(0).click();
	}

}
