package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.HelperFunctions;

public class ShoppersStop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = HelperFunctions.setBrowser("chrome");
		//driver.get("https://www.shoppersstop.com/store-finder");
		driver.get("https://www.shoppersstop.com/");
		//driver.manage().window().maximize();

		driver.findElement(By.linkText("All Stores")).click();
	   // driver.switchTo().alert().accept();

		Thread.sleep(2000);
	    Select source = new Select(driver.findElement(By.name("cityName")));
	    
	    
	    source.selectByVisibleText("Mumbai");
	    //driver.switchTo().alert().accept();
	   // driver.switchTo().defaultContent();
		Thread.sleep(2000);

	    Select source1 = new Select(driver.findElement(By.id("selectedPOS")));

	    List<WebElement> stores = source1.getOptions();
	    
	    for(WebElement i:stores)
	    {
	    	System.out.println(i.getText());
	    }
	    //List<WebElement> stores1 = source.getOptions();

	   /* System.out.println("Is it contains Lature : "+stores1.contains(("Lature"));
	    System.out.println("Is it contains Chennai : "+stores1.contains("Chennai"));

	    System.out.println("Is it contains Agra : "+stores1.contains("Agra"));*/
	    cityCheck("Chennai",source.getOptions());

	    cityCheck("Latur",source.getOptions());

	    cityCheck("Agra",source.getOptions());

	    cityCheck("Anantapur",source.getOptions());

	}
	public static void cityCheck(String city, List<WebElement> list)
	{
		boolean flag = false;
		for(WebElement i : list)
		{
			if(i.getText().equals(city))
				flag=true;
		}
	    if(flag)
	    	System.out.println(city + " Present");
	    else
	    	System.out.println(city + " Not Present");

	}

}
