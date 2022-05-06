package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class KeyboardControl {

	public static void main(String[] args) {
		
		WebDriver driver = HelperFunctions.setBrowser("chrome");
	    driver.get("https://www.google.com/");
	    Actions ac=new Actions(driver);
	    WebElement search = driver.findElement(By.name(("q")));
	    /*ac.keyDown(Keys.SHIFT)
	        .sendKeys(search,"lti")
	        .keyUp(Keys.SHIFT)
	        .doubleClick(search)
	        .contextClick(search)//right click
	        .perform();*/
	    Action a=  ac.keyDown(Keys.SHIFT)
		        .sendKeys(search,"lti")
		        .keyUp(Keys.SHIFT)
		        .doubleClick(search)
		        .contextClick(search)//right click
		        .build();
	    a.perform();
	    
	}

}
