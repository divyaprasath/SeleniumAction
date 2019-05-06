package com.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasath\\eclipse-workspace\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   Actions action = new Actions(driver);
	   action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
	   driver.findElement(By.linkText("Travel Insurance")).click();
	   
	   
	   
}

}