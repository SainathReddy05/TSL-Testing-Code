package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.HelperFunctions;

public class MagneticAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = HelperFunctions.setBrowser("chrome");
        driver.get("http://www.magneticautomation.in/p/drop-down-example.html");
        
        Select s=new Select(driver.findElement(By.name("multi")));
        s.selectByVisibleText("One");
        Thread.sleep(1000);
        s.selectByVisibleText("Three");

        //s.deselectAll();
        List<WebElement> options = s.getAllSelectedOptions();
        for(WebElement i:options)
        {
        	System.out.println(i.getText());
        }
        
        s.deselectByVisibleText("One");
        s.deselectAll();
	}

}
