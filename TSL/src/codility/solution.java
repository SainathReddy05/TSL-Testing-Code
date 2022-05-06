package codility;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class solution extends WebDriverTestCase{

	/*@Test
	public void a() {
		String title = webDriver.getTitle();
		assertEquals("Bing",title);
		assertTrue(title.equalsIgnoreCase("Bing"));
		assertEquals(true,title.equals("Bing"));
	}
	@Test
	public void b() {
		webDriver.findElement(By.name("q")).sendKeys("LTI");
		webDriver.findElement(By.xpath("//label[@class='search icon tooltip']")).click();
		List<WebElement> list = webDriver.findElements(By.xpath("//ol[@id='b_results']/li"));
		assertTrue(list.size()>1);
	}
	@Test
	public void c() {
		
		webDriver.findElement(By.xpath("//form[@name='search_form_SearchBox']//input[2]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(webDriver.findElement(By.xpath("//section[2]//div[1]//div[1]//div[1]")).getText().equals("No Results Found"));
	}*/

	/*@Test
	public void d() throws WebDriverException{
		
		webDriver.findElement(By.xpath("//a[contains(text(),'BRANDS')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions actions=new Actions(webDriver);
		actions.moveToElement(webDriver.findElement(By.xpath("//li[1]//div[1]//div[2]"))).perform();
		webDriver.findElement(By.xpath("//li[1]//div[1]//div[2]//a[1]//span[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TakesScreenshot ts = (TakesScreenshot)webDriver;
	    ts.getScreenshotAs(OutputType.FILE);
		
	    try {
			org.openqa.selenium.io.FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File(".//newfile.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error with screenshot");
		}
	    
	    if(webDriver.getTitle().contains("Haute Curry|Shoppers Stop"))
	    	{
	    	System.out.println("true");
	    	}
	    else
	    	System.out.println("false");
	    
	    assertTrue(webDriver.findElement(By.xpath("//p[contains(text(),'start something new')]")).getText().equals("start something new"));
	    
	    System.out.println(webDriver.findElement(By.xpath("//li[@class='instagram-icon']//a")).getAttribute("href"));
	    
	}*/
	@Test
	public void e() throws InterruptedException
	{
		webDriver.findElement(By.id("suggestion-search")).sendKeys("Gangs of New York");
		webDriver.findElement(By.id("suggestion-search-button")).click();
		webDriver.findElement(By.id("//div//div//div//div[2]//table[1]//tbody[1]//tr[1]//td[2]//a[1]")).click();
		Thread.sleep(1000);
		String time = webDriver.findElement(By.xpath("//time[contains(text(),'167 min')]")).getText();
		time = time.split(" ")[0];
		assertTrue(Integer.parseInt(time)<180);
		assertTrue(webDriver.findElement(By.xpath("//div[@class='subtext']//a[contains(text(),'Crime')]")).getText().contains("Crime"));
		assertTrue(webDriver.findElement(By.xpath("//div[@class='subtext']")).getText().contains("R"));
		
	}
}
