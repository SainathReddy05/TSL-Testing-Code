package day6JUnit;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class URLChecking {

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
	public void test() throws Exception {
		driver.get("https://www.facebook.com/");
		List<WebElement> ls = driver.findElements(By.xpath("//a"));
		System.out.println("Total links are :-  "+ls.size());
		for(WebElement i : ls)
		{
			String href = i.getAttribute("href");
			System.out.println(href);
			URL url = new URL(href); // converting src into url format
			URLConnection con= url.openConnection();   //Opens a port or channel to get connection with remote server
			HttpsURLConnection httpCon = (HttpsURLConnection)con;
			httpCon.connect();
			if(httpCon.getResponseCode()==200)
				System.out.println("Passed");
			else
				System.out.println("Failed");
		}
	}
}
