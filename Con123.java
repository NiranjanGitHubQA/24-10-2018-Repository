package com.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Con123 {
	
	public static final String Name = "Niranjan";
	public static final String ACCOUNT_NAME="Account 1";
	
	public static WebDriver C1(WebDriver driver)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Niranjan testing.....");
		return driver;
		
	}

}
