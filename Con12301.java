package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Con12301 {
	static WebDriver driver;
	@Test
	public static void M1() throws InterruptedException
	{
		driver=Con123.C1(driver);
		driver=GenericTestCases.Dev_Org_login(driver);
		driver.findElement(By.xpath("")).click();
		
	}
	

}
