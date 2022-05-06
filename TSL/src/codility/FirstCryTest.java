package codility;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class FirstCryTest{

	public static WebDriver webDriver;
	@Test
	public void test() throws InterruptedException {
		webDriver=HelperFunctions.setBrowser("chrome");
		webDriver.get("https://www.firstcry.com/");
		webDriver.findElement(By.id("search_box")).clear();
		webDriver.findElement(By.id("search_box")).sendKeys("Diaper");
		webDriver.findElement(By.className("search-button")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//div[@class='sort-select-content L12_42']")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//a[@class='na'][contains(text(),'Price')]")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//div[@class='sort-select-content L12_42']"));
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//a[contains(text(),'Price: High To Low')]")).click();
		Thread.sleep(2000);
		///html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[2]/div
		///html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]/div[4]/span/a/span
		String val = webDriver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]/div[4]/span/a/span")).getText();
		int v=Integer.parseInt(val);
		for(int i=2;i<=9;i++)
		{
			int x = Integer.parseInt(webDriver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]/div[4]/span/a/span")).getText());
			assertTrue(x<=v);
			v=x;
		}
		webDriver.quit();
		
	}

}
