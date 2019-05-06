package com.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class LoginFacebook {
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\Prasath\\eclipse-workspace\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("stardivyard@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("divya@123");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
        Thread.sleep(3000);
        driver.close();
        
}	
}