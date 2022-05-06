package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import 	org.openqa.selenium.io.FileHandler;
public class HelperFunctions {

	static WebDriver driver=null;
	public static WebDriver setBrowser(String browserName)
	{
		browserName=browserName.toLowerCase();
		switch(browserName)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chrome driver\\chromedriver.exe");
			ChromeOptions cp = new ChromeOptions();
			cp.addArguments("--disable-notifications");
			driver = new ChromeDriver(cp);//starts browser
			driver.manage().window().maximize();
			return driver;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();//starts browser
			return driver;
		default:
			System.out.println("Invalid browser");
		}
		return driver;
		
	}
	
	public static void getSnap(String fileNameWithLocation)
	{
		TakesScreenshot tc = (TakesScreenshot)driver;
		//Takes screenshot and store in java buffer memory
		
		File scFile = tc.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(scFile, new File(fileNameWithLocation));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error with screenshot");
		}
	}
}
