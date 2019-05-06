package com.actions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
 
	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasath\\eclipse-workspace\\SeleniumWebdriver\\Resources\\chromedriver.exe");
  
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  driver.navigate().to("http://whiteboxqa.com/schedule.php");
	 Thread.sleep(3000);
	  driver.close();
	
	}
}
