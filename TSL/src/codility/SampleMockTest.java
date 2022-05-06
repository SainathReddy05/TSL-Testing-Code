package codility;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class SampleMockTest extends WebDriverTestCase{

	@Test
	public void a() throws InterruptedException {
		assertTrue(webDriver.findElement(By.id("search-input")).isDisplayed());
		Thread.sleep(100);
		assertTrue(webDriver.findElement(By.id("search-button")).isDisplayed());
		Thread.sleep(100);
	}
	@Test
	public void b() throws InterruptedException {
		webDriver.findElement(By.id("search-button")).click();
		Thread.sleep(100);
		assertTrue(webDriver.findElement(By.id("error-empty-query")).isDisplayed());
	}
	@Test
	public void c() throws InterruptedException {
		webDriver.findElement(By.id("search-input")).sendKeys("isla");
		Thread.sleep(100);
		webDriver.findElement(By.id("search-button")).click();
		Thread.sleep(100);
		assertTrue(webDriver.findElements(By.xpath("/html/body/div/div[2]/ul/li")).size()>=1);
	}
	@Test
	public void d() throws InterruptedException {
		webDriver.findElement(By.id("search-input")).clear();
		webDriver.findElement(By.id("search-input")).sendKeys("castle");
		Thread.sleep(100);
		webDriver.findElement(By.id("search-button")).click();
		Thread.sleep(100);
		assertTrue(webDriver.findElement(By.id("error-no-results")).isDisplayed());
	}
	@Test
	public void e() throws InterruptedException {
		webDriver.findElement(By.id("search-input")).clear();
		webDriver.findElement(By.id("search-input")).sendKeys("port");
		Thread.sleep(100);
		webDriver.findElement(By.id("search-button")).click();
		Thread.sleep(100);
		assertTrue(webDriver.findElement(By.xpath("//li[contains(text(),'Port Royal')]")).isDisplayed());
	}
	

}
