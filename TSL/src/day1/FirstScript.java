package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FirstScript {

	public static void main(String[] args) {
		//WebDriver is Interface and ChromeDriver, FirefoxDriver,OperaDriver are 
		//child classes which implements WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//starts browser
		//parent p=new child()
		//Declaring variable as parent type has benefit of holding any child object
		driver.get("http://selenium.dev");
		String title = driver.getTitle();
		System.out.println("Current title of page is "+title);
		
		Assert.assertEquals(title,"Selenium");
		
		//driver.quit();
		//driver.findElement(By.linkText("Downloads")).click();
		
		WebElement d=driver.findElement(By.linkText("Downloads"));
		d.click();
		
		System.out.println("You are on "+driver.getTitle()+" Page");
		driver.navigate().back();
		System.out.println("You are on "+driver.getTitle()+" Page");
		
		driver.quit();
	}

}
