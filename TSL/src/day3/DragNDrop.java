package day3;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utils.HelperFunctions;

public class DragNDrop {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = HelperFunctions.setBrowser("chrome");
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));

		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, des).perform();
		
		//for taking screenshots
		
		//ChromeDriver d = new ChromeDriver();
	    //d.getScreenshotAs(arg0);	
	    //Chromedriver is child of WebDriver,TakesScreenshotAS,And JavaScriptExecutor(ALL INTERFACES)
	    /*
		TakesScreenshot tc = (TakesScreenshot)driver;
		tc.getScreenshotAs(OutputType.FILE);
		//Takes screenshot and store in java buffer memory
		
		File scFile = tc.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(scFile, new File(".\\dragNdrop3.png"));*/
		//   . because it will store in current working directory 
		HelperFunctions.getSnap(".//sswithHF.png");
		
	}

}
