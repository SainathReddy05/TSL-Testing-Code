package day6JUnit;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

//import okhttp3.Cookie;
import utils.HelperFunctions;

public class Cookie_Test {

	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = HelperFunctions.setBrowser("chrome");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
	

	@Test
	public void a() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Set<Cookie> allCookie = driver.manage().getCookies();
		for(Cookie C: allCookie)
		{
			System.out.println(C.getName());
			System.out.println(C.getValue());
			System.out.println(C.getExpiry());
			System.out.println(C.getDomain());
			System.out.println(C.getPath());

		}
	}
	
	
	@Test
	public void b() throws InterruptedException {
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void c() {
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		Set<Cookie> allCookie = driver.manage().getCookies();
		for(Cookie C: allCookie)
		{
			System.out.println(C.getName());
			System.out.println(C.getValue());
			System.out.println(C.getExpiry());
			System.out.println(C.getDomain());
			System.out.println(C.getPath());

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
