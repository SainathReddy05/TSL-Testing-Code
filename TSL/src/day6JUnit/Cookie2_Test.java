package day6JUnit;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class Cookie2_Test {

	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = HelperFunctions.setBrowser("chrome");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
	

	@Test
	public void a() {
		driver.get("http://demo.frontaccounting.eu/");
		Set<Cookie> allCookie = driver.manage().getCookies();
		for(Cookie C: allCookie)
		{
			System.out.println("Name of cookie   "+C.getName());
			System.out.println("Value of cookie   "+C.getValue());
			System.out.println("Expiry of Cookie   "+C.getExpiry());
			System.out.println("Domain of cookie   "+C.getDomain());
			System.out.println("Path of Cookie   "+C.getPath());

		}
	}
	
	
	@Test
	public void b() throws InterruptedException {
		/*driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
*/
		driver.findElement(By.name("SubmitUser")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void c() {
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		Set<Cookie> allCookie = driver.manage().getCookies();
		for(Cookie C: allCookie)
		{
			System.out.println("Name of cookie   "+C.getName());
			System.out.println("Value of cookie   "+C.getValue());
			System.out.println("Expiry of Cookie   "+C.getExpiry());
			System.out.println("Domain of cookie   "+C.getDomain());
			System.out.println("Path of Cookie   "+C.getPath());


		}
	}
	@Test
	public void d()
	{
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		//assertTrue(driver.findElement(By.name("txtusername")).isDisplayed());
	}


}
