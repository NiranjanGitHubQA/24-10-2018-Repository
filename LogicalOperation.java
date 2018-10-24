package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LogicalOperation {
	static WebDriver driver;

	@Test(priority = 1)
	public void Login_Dev_Org() throws InterruptedException 
	{
		driver = GenericTestCases.Dev_Org_login(driver);
	}

	@Test(priority = 2)
	public void DemoTestCase_Dev_ORG() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='Account_Tab']/a")).click();
		driver.findElement(
				By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input"))
				.click();
		driver.findElement(By.xpath("//*[@id='acc2']")).sendKeys(
				Configuration.AccountName + " " + Configuration.date1);
		driver.findElement(By.xpath("//*[@id='00N1I00000MeBzm']")).click();
		driver.findElement(By.xpath("//*[@id='topButtonRow']/input[1]"))
				.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[6]/div[1]/div/div[1]/table/tbody/tr/td[2]/input"))
				.click();
		driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id='opp3']")).sendKeys(
				Configuration.OpportunityName + " " + Configuration.date1);
		driver.findElement(
				By.xpath("//*[@id='ep']/div[2]/div[3]/table/tbody/tr[3]/td[4]/div/span/span/a"))
				.click();
		Select dropdown = new Select(driver.findElement(By
				.xpath("//*[@id='opp11']")));
		dropdown.selectByVisibleText("Prospecting");

	}

}
