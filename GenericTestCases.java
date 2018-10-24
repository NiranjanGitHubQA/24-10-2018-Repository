package com.AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericTestCases {
	// WebDriver driver;

	public static WebDriver Dev_Org_login(WebDriver driver)
			throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='username']")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(
				Configuration.Dev_Org_UserName);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(
				Configuration.Dev_Org_Password);
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='tryLexDialogX']")).click();
		return driver;
	}

	public static WebDriver Migration_Org_login(WebDriver driver)
			throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://adsalescloudmigration-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='username']")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(
				Configuration.Migration_Org_UserName);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(
				Configuration.Migration_Password);
		driver.findElement(By.xpath("//*[@id='Login']")).click();

		return driver;
	}

}
