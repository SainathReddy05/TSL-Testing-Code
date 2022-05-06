package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class OrangeHRMLinks {

	public static void main(String[] args) {
		
		WebDriver driver=HelperFunctions.setBrowser("chrome");
		//for opening url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement> ls = driver.findElements(By.tagName("a"));
		System.out.println("number of links"+ls.size());
		for(WebElement i:ls)
		{
			System.out.println("Link  " + ls.indexOf(i));
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
		}
		}
}
