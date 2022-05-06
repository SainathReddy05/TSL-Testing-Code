package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = HelperFunctions.setBrowser("chrome");
	    driver.get("https://ugc.ac.in/");
	    
	    WebElement pb = driver.findElement(By.linkText("Publications"));
	    
	    Actions ac = new Actions(driver);
	    ac.moveToElement(pb).perform();
	    driver.findElement(By.linkText("Annual Reports/ Annual Accounts")).click();
	    if(driver.getTitle().contains("Annual Report"))
	    	System.out.println("Test for annual report is passsed");
	    else
	    	System.out.println("Test for annual report is failed");

	    driver.quit();
	    
	}

}
