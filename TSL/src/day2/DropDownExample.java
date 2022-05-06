package day2;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.HelperFunctions;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		
		/*driver.get("https://www.facebook.com/");
		Select month=new Select(driver.findElement(By.name("birthday_month")));
		
		month.selectByVisibleText("Jun");
		month.selectByIndex(5);
		month.selectByValue("7");
		
		System.out.println("Multi select drop-down or not    "+month.isMultiple());*/
		WebDriver driver = HelperFunctions.setBrowser("chrome");
	    driver.get("https://blazedemo.com/");
	    Select source = new Select(driver.findElement(By.name("fromPort")));
	    source.selectByValue("Paris");
	    Select dest = new Select(driver.findElement(By.name("toPort")));
	    dest.selectByValue("Rome");
	    driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
	    Thread.sleep(1000);
	    List<WebElement> ls =  driver.findElements(By.cssSelector("input[value = 'Choose This Flight']"));
	    ls.get(1).click();
	    driver.findElement(By.id("inputName")).sendKeys("SAINATH");
	    //driver.findElement(By.cssSelector("input#inputName")).sendKeys("Sainath");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#address")).sendKeys("1-106 Anantapur");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#city")).sendKeys("Anantapur");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#state")).sendKeys("Andhra Pradesh");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#zipCode")).sendKeys("515134");
	    Thread.sleep(1000);
	    
		Select month=new Select(driver.findElement(By.id("cardType")));
		month.selectByVisibleText("American Express");
		  Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#creditCardNumber")).sendKeys("956466");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#creditCardMonth")).clear();
	    driver.findElement(By.cssSelector("input#creditCardMonth")).sendKeys("June");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#creditCardYear")).clear();
	    driver.findElement(By.cssSelector("input#creditCardYear")).sendKeys("2024");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#nameOnCard")).sendKeys("Sainath Reddy");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#zipCode")).sendKeys("515134");
	    driver.findElement(By.cssSelector("input#rememberMe")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
	    driver.quit(); 
	}

}
