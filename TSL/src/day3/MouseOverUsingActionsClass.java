package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class MouseOverUsingActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = HelperFunctions.setBrowser("chrome");
	    driver.get("https://ugc.ac.in/");
	    String PID=driver.getWindowHandle();
	    System.out.println(PID);
	    Actions ac = new Actions(driver);

	    WebElement uni = driver.findElement(By.linkText("Universities"));
	    
	    ac.moveToElement(uni).perform();
        WebElement cenUni = driver.findElement(By.linkText("Central Universities"));
	    
	    Actions x= ac.moveToElement(cenUni);
	    x.perform();
	    System.out.println(cenUni.getAttribute("href"));
	   // driver.get(cenUni.getAttribute("href"));
	    cenUni.click();
	    Set<String> allWin  =driver.getWindowHandles();
	    System.out.println("Parent tab ID is  "+PID);
	    System.out.println("ID of EveryTab as below");
	    for(String i:allWin)
	    {
	    	System.out.println(i);
	    	if(!i.equals(PID))
	    	{
	    		driver.switchTo().window(i);
	    		System.out.println("Title is  "+driver.getTitle());
	    		driver.close();
	    	}
	    }
	   // System.out.println(driver.getTitle());
	}

}
