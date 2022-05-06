package codility;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
///////https://app.codility.com/c/feedback/J6N4TC-UM8/    100
public class Final_Codility extends WebDriverTestCase{

	@Test
	public void a() {
		assertTrue(webDriver.findElement(By.id("email-input")).isDisplayed());
		assertTrue(webDriver.findElement(By.id("password-input")).isDisplayed());
		assertTrue(webDriver.findElement(By.id("login-button")).isDisplayed());
	}
	
	@Test
	public void b() throws InterruptedException {
		webDriver.findElement(By.id("email-input")).sendKeys("login@codility.com");
		webDriver.findElement(By.id("password-input")).sendKeys("password");
		webDriver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		assertTrue(webDriver.findElement(By.xpath("//div[@class='message success']")).getText().contains("Welcome to Codility"));
	}
	
	@Test
	public void c() throws InterruptedException {
		webDriver.navigate().to("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
	    //webDriver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		webDriver.findElement(By.id("email-input")).clear();
		webDriver.findElement(By.id("email-input")).sendKeys("unknown@codility.com");
		webDriver.findElement(By.id("password-input")).clear();
		webDriver.findElement(By.id("password-input")).sendKeys("password");
		webDriver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		assertTrue(webDriver.findElement(By.xpath("//div[@class='message error']")).getText().contains("You shall not pass! Arr!"));
	}
	
	@Test
	public void d() throws InterruptedException {
		webDriver.findElement(By.id("email-input")).clear();
		webDriver.findElement(By.id("email-input")).sendKeys("unsedvSeva");
		webDriver.findElement(By.id("password-input")).clear();
		webDriver.findElement(By.id("password-input")).sendKeys("password");
		webDriver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		assertTrue(webDriver.findElement(By.xpath("//div[@class='validation error']")).getText().contains("Enter a valid email"));
	}
	
	@Test
	public void e() throws InterruptedException {
		webDriver.findElement(By.id("email-input")).clear();
		webDriver.findElement(By.id("password-input")).clear();
		webDriver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		assertTrue(webDriver.findElement(By.xpath("//div[contains(text(),'Email is required')]")).getText().contains("Email is required"));
		assertTrue(webDriver.findElement(By.xpath("//div[contains(text(),'Password is required')]")).getText().contains("Password is required"));
	}
}
