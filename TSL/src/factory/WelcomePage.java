package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	WebDriver driver;
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void doLogout()
    {
    	driver.findElement(By.id("welcome")).click();
    	driver.findElement(By.linkText("Logout")).click();
    }
}
