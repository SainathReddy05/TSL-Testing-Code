package day6JUnit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class Task2_Test {

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
	public void test() {
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("SPORTS")).click();
		//WebElement E = driver.findElement(By.linkText("GET AHEAD"));
		//driver.findElement(By.xpath("//a[contains(text(),'GET AHEAD')]"));
		String title = driver.findElement(By.linkText("GET AHEAD")).getAttribute("title");
		/*if(title.equals("Get Ahead headlines"))
		    System.out.println("Title is correct");
		else
			System.out.println("Title is incorrect");*/
		assertEquals("Get Ahead headlines", title);
		List<WebElement> D = driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[1]/div[1]/h2"));
		for(WebElement i:D)
		{
			System.out.println(i.getText());
		}
	}

}
