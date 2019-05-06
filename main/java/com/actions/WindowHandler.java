package com.actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasath\\eclipse-workspace\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();

		Set<String> handler = driver.getWindowHandles();// here two window id is inside the object ie: handler

		// to get the values for set object we use iterator
		Iterator<String> it = handler.iterator();
         
	    String parentWindowID = it.next();	
	    System.out.println("parent window id:" +parentWindowID);
	    
	    String childWindowID = it.next();	
	    System.out.println("child window id:" +childWindowID);
	    
	    driver.switchTo().window(childWindowID);
	    
	    Thread.sleep(2000);
	   
	    System.out.println("child window popup title" +driver.getTitle());
	    driver.close();
	    
	    Thread.sleep(2000);
	    driver.switchTo().window(parentWindowID);
	    System.out.println("parent window popup title" +driver.getTitle());
	  
	    driver.quit();
	}
}
