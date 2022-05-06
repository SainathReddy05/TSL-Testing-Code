package day3;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class NaukriTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = HelperFunctions.setBrowser("chrome");
	    driver.get("https://www.naukri.com/");
	    Set<String> all = driver.getWindowHandles();
	    
	    for(String i:all)
	    {
	    	System.out.println(i);
	    	driver.switchTo().window(i);
	    	System.out.println(driver.getTitle());
	    }
	}

}


