package day6JUnit;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
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

public class ImagesChecking {

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
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> ls = driver.findElements(By.xpath("//img"));
		System.out.println("Total images are :-  "+ls.size());
		for(WebElement i : ls)
		{
			String src = i.getAttribute("src");
			System.out.println(src);
			URL url = new URL(src); // converting src into url format
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
