package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class IframeExample {

	public static void main(String[] args) {
		
		WebDriver driver = HelperFunctions.setBrowser("chrome");
	    driver.get("file:///C:/Users/Sainath%20Reddy/Desktop/Testing-TSL(847)/iframe.html");
	   
	    driver.switchTo().frame("blaze");//using id or name of frame
	    driver.findElement(By.linkText("destination of the week! The Beach!")).click();
	    
	    driver.switchTo().defaultContent();//to get out of iframe
	    driver.switchTo().frame(1);//switching with the help of index of iframe
	    driver.findElement(By.id("sb_form_q")).sendKeys("LTI");
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.dummy")));
	    
	    //driver.findElement(By.linkText("LOGIN PAGE")).click();
	    //System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/nav/div/div/div/div[1]/div[1]/div/ul/li[1]/a")).click();
	    //Least priority is given to xpath coz if any change in between html//css code will change xpath
	    
	}

}
