package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//starts browser
	    driver.get("https://opensource-demo.orangehrmlive.com/");
        
	    driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
	    driver.findElement(By.cssSelector("input[type='Password']")).sendKeys("admin123");
	    
	    driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("a[class='panelTrigger']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("a[href='/index.php/auth/logout']")).click();

	}

}
