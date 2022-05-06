package day5NG;

import org.testng.annotations.Test;

import utils.HelperFunctions;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Color_Test {
	WebDriver driver;
	
  @Test(description="Checking background color of submit button")
  public void verifyColor() {
	  driver.get("https://blazedemo.com/");
	  WebElement E=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
	  String color = E.getCssValue("background-color");
	  System.out.println(color);
	  String hexColor = Color.fromString(color).asHex();
	 // Assert.assertEquals(hexColor,234);
	  System.out.println(hexColor);
	  Assert.assertEquals(hexColor,"#006dcc","Color code not matched");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = HelperFunctions.setBrowser("chrome");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
