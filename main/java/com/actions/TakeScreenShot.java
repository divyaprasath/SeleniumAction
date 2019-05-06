package com.actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException  {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasath\\eclipse-workspace\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	      driver.get("https://www.walmart.com/");
	      driver.findElement(By.name("query")).sendKeys("Laptops");
	      
	     ((WebElement) driver.findElement(By.id("global-search-submit"))).click();
	     
	     File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(scr, new File("C:\\Mocks And Notes\\shot.png"));
	      driver.close();
	     
	
	}

	

	
	
}
