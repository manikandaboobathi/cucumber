package org.maven.pro.CucumberPro;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Cuc {
	 WebDriver driver;
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
System.setProperty("webdriver.chrome.driver","D:\\don't delete\\CucumberPro\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.google.com/");
	
	}

	@When("I complete action")
	public void i_complete_action() {
	WebElement txt=driver.findElement(By.xpath("//input[@name='q']"));
	txt.sendKeys("java class",Keys.ENTER);

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {


Assert.assertTrue(driver.getCurrentUrl().contains("source"));		
	}

}
