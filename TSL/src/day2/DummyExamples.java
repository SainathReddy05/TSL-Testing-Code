package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class DummyExamples {

	public static void main(String[] args) {
		WebDriver driver=HelperFunctions.setBrowser("chrome");
		driver.get("https://www.facebook.com/");
		//driver.findElements(By.name("sai"));
//		List<WebElement> ls = driver.findElements(By.name("sai"));
//		System.out.println(ls.size());
		
		driver.findElement(By.name("sex")).click();
	}

}
