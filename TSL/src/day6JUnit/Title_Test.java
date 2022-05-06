package day6JUnit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class Title_Test {
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
	public void test() {
		driver.get("http://www.google.com");
		assertEquals("Google",driver.getTitle());
		assertTrue(driver.getTitle().equals("Google"));
		assertTrue(driver.getTitle().contains("Google"));
		assertTrue(driver.getTitle().equalsIgnoreCase("Google"));
		//assertFalse(5==4);
		//assertTrue(5==6);
		// In TestNG > First Actual and then expected
		//In Junit4  > First Expected and then Actual
		
	}

}
