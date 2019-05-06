package com.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasath\\eclipse-workspace\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		WebElement month;
		WebElement day;
		WebElement year;
		Select dropOption = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		dropOption.selectByIndex(5);

		Select dropOption1 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		dropOption1.selectByIndex(5);

		Select dropOption2 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		dropOption2.selectByIndex(5);

	}

}
