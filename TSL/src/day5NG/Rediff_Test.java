package day5NG;

import org.testng.annotations.Test;

import utils.HelperFunctions;

import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Rediff_Test {
	WebDriver driver;

  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.rediff.com/");
	  driver.switchTo().frame("moneyiframe");
	  WebElement E = driver.findElement(By.xpath("//input[@id='query']"));
	  E.click();
	  Thread.sleep(1000);
	  E.sendKeys("YES BANK LTD");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@class='getqbtn']")).click();
	  WebDriver now = driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	  //Assert.assertEquals(now.getTitle(), "YES BANK LTD");
	  Assert.assertTrue(now.getTitle().contains("YES BANK LTD"));
	  driver.switchTo().defaultContent();
	  System.out.println(driver.getTitle());
	  driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
	  System.out.println(driver.getTitle());


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
