package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class keywords {
	WebDriver driver;
	public keywords(WebDriver driver)
	{
		this.driver = driver;
	}
	public void getURL(String url)
	{
		driver.get(url);
	}
	public void click(String locator)
	{
		/*String locatorType = locator.split(":=")[0];
		String locatorvalue = locator.split(":=")[1];
		if(locatorType.equals("id"))
			driver.findElement(By.id(locatorvalue)).click();
		else if(locatorType.equals("name"))
			driver.findElement(By.linkText(locatorvalue)).click();
		else if(locatorType.equals("css"))
			driver.findElement(By.cssSelector(locatorvalue)).click();
		else if(locatorType.equals("id"))
			driver.findElement(By.id(locatorvalue)).click();
		else if(locatorType.equals("xpath"))
			driver.findElement(By.xpath(locatorvalue)).click();
		else
			System.out.println("Invalid locator");*/
		getWebElement(locator).click();
			
	}
	public void type(String locator , String msg)
	{
		/*String locatorType = locator.split(":=")[0];
		String locatorvalue = locator.split(":=")[1];
		if(locatorType.equals("id"))
			driver.findElement(By.id(locatorvalue)).sendKeys(msg);
		else if(locatorType.equals("name"))
			driver.findElement(By.linkText(locatorvalue)).sendKeys(msg);
		else if(locatorType.equals("css"))
			driver.findElement(By.cssSelector(locatorvalue)).sendKeys(msg);
		else if(locatorType.equals("id"))
			driver.findElement(By.id(locatorvalue)).sendKeys(msg);
		else if(locatorType.equals("xpath"))
			driver.findElement(By.xpath(locatorvalue)).sendKeys(msg);
		else
			System.out.println("Invalid locator");*/
		WebElement E = getWebElement(locator);
		E.sendKeys(msg);
			
	}
	public void selectFromDropDown(String locator,String val)
	{
		/*Select sel = null;
		String locatorType = locator.split(":=")[0];
		String locatorvalue = locator.split(":=")[1];
		if(locatorType.equals("id"))
			sel = new Select(driver.findElement(By.id(locatorvalue)));
		else if(locatorType.equals("name"))
			sel = new Select(driver.findElement(By.linkText(locatorvalue)));
		else if(locatorType.equals("css"))
			sel = new Select(driver.findElement(By.cssSelector(locatorvalue)));
		else if(locatorType.equals("id"))
			sel = new Select(driver.findElement(By.id(locatorvalue)));
		else if(locatorType.equals("xpath"))
			sel = new Select(driver.findElement(By.xpath(locatorvalue)));
		else
			System.out.println("Invalid locator");
		sel.selectByVisibleText(val);*/
		Select sel = new Select(getWebElement(locator));
		sel.selectByVisibleText(val);
		
	}
	public WebElement getWebElement(String locator)
	{
		String locatorType = locator.split(":=")[0];
		String locatorvalue = locator.split(":=")[1];
		if(locatorType.equals("id"))
			return driver.findElement(By.id(locatorvalue));
		else if(locatorType.equals("name"))
			return driver.findElement(By.linkText(locatorvalue));
		else if(locatorType.equals("css"))
			return driver.findElement(By.cssSelector(locatorvalue));
		else if(locatorType.equals("id"))
			return driver.findElement(By.id(locatorvalue));
		else if(locatorType.equals("xpath"))
			return driver.findElement(By.xpath(locatorvalue));
		else
			return null;
	}
	public void getSnap(String fileNameWithLocation)
	{
		TakesScreenshot tc = (TakesScreenshot)driver;
		//Takes screenshot and store in java buffer memory
		
		File scFile = tc.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(scFile, new File(fileNameWithLocation));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error with screenshot");
		}
	}
	public void closeBrowser()
	{
		driver.quit();
	}
}
