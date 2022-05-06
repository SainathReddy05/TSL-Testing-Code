package day6JUnit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.HelperFunctions;

public class SuggestionsHandling {

	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = HelperFunctions.setBrowser("chrome");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.quit();
	}
	@Test
	public void test() throws InterruptedException {
		WebDriverWait wt = new WebDriverWait(driver,30);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("FromTag")).sendKeys("Ahmedabad");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li/a[contains(text(),'Ahmedabad')]")));
		WebElement E = driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a[contains(text(),'Ahmedabad')]"));
		E.click();
//		driver.findElement(By.id("ToTag")).sendKeys("Delhi");
//
//		driver.findElement(By.xpath("//ul[@id='ui-id-2']/li/a[contains(text(),'Delhi')]")).click();
		
	}

}
