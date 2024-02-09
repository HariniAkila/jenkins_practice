package com.project.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdditionTest {

	public WebDriver driver;
	 @Test(groups = {"group1"})
	 public void firstSeleniumTest() {
		 ChromeOptions options = new ChromeOptions();
		 options.setPageLoadTimeout(Duration.ofMinutes(1));
		 //options.addArguments("--headless");																		
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 String title = driver.getTitle();
		
		Assert.assertEquals(title,"Swag Labs1");
		 }
}
