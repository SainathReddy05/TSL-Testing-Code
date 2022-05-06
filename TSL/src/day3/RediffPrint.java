package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class RediffPrint {

	public static void main(String[] args) {

		WebDriver driver = HelperFunctions.setBrowser("chrome");
	    driver.get("https://www.rediff.com/");
	    driver.switchTo().frame("moneyiframe");
	     String bse = driver.findElement(By.cssSelector("span#bseindex")).getText();
	     String nse = driver.findElement(By.cssSelector("span#nseindex")).getText();

	     System.out.println("BSE is :" +bse +"  and  "+"NSE is : "+ nse);
	   
	}

}

