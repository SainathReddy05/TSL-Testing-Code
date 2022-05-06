package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

	WebDriver driver;
    public WelcomePage(WebDriver driver)
    {
    	this.driver=driver;
    }
    public void doLogout()
    {
    	driver.findElement(By.id("welcome")).click();
    	driver.findElement(By.linkText("Logout")).click();
    }
}
