package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.HelperFunctions;

public class RadioExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= HelperFunctions.setBrowser("Chrome");
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.cssSelector("input[value='2']")).click();
		List<WebElement> ls = driver.findElements(By.name("sex"));
		/*int x=10;
		while(x--!=0){
		ls.get(0).click();
		Thread.sleep(500);
		ls.get(1).click();
		Thread.sleep(500);
		ls.get(2).click();
		}*/
		ls.get(2).click();
		WebElement custom=driver.findElement(By.cssSelector("input[value='-1']"));
		boolean x=custom.isSelected();
		System.out.println("Radio selection is "+x);
		boolean y=custom.isDisplayed();//Displaying on screen or not?
		boolean z=custom.isEnabled(); // Object is Enabled for doing some operations or not 
		if(x==true && y==true && z==true)
			System.out.println("Test for custom radio is passed");
		else
			System.out.println("Test for custom radio is failed");

	}

}
