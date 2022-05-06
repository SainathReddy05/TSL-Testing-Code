package day5NG;

import org.testng.annotations.Test;

import utils.HelperFunctions;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstNG_Test {
	WebDriver driver;
  @Test(priority=1,description="Verifying title of Google Home Page")
  public void titleTest() {
	  driver.get("http://google.com");
	 // System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(),"Google","Title not Matched");
	  //DOES  Comparison between actual and expected.
	 
  }
  
  @Test(priority=2,description="Verifying search field")
  public void searchTest() {
	  WebElement E=driver.findElement(By.name("q"));
	  Assert.assertEquals(E.isDisplayed(),true);
	  Assert.assertEquals(E.isEnabled(),true);
	  Assert.assertEquals(E.getAttribute("type"), "text");
	  
	  //driver.get("http://google.com");
	 // System.out.println(driver.getTitle());
	 // Assert.assertEquals(driver.getTitle(),"Google India","Title not Matched");
	  //DOES  Comparison between actual and expected.
  }
  
  @BeforeTest         //Pre-Conditions
  public void beforeTest() {
	  driver = HelperFunctions.setBrowser("chrome");
  }

  @AfterTest         //Post-Conditions
  public void afterTest() {
	  driver.quit();
  }

}
