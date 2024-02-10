package com.project.tests.Definitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisitDefinitions {

	public WebDriver driver;
	public String Url;
	public VisitDefinitions() {
		 ChromeOptions options = new ChromeOptions();
		 options.setPageLoadTimeout(Duration.ofMinutes(1));
		 //options.addArguments("--headless");																		
		 driver = new ChromeDriver(options);
	}
	
	@Given("the site of the url {string}")
	public void siteUrl(String pageUrl) {
		Url = pageUrl;
	}
	
	@When("i visit the page")
	public void VisitPage() {
		driver.get(Url);
	}
	
	@Then("the title should be {string}")
	public void CheckTitle(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}
	
	@Then("the title will not be {string}")
	public void UnhappyPathCheckTitle(String title) {
		Assert.assertNotEquals(title, driver.getTitle());
	}
	
	 @After
	    public void teardown() {	 
	        driver.close();
	    }
}
