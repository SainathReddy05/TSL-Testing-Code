package utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Base {
	public WebDriver driver;
	public Properties prop;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException, IOException {
	  

	  prop=new Properties();
	  prop.load(new FileInputStream(".\\settings.property"));
	  
	  driver = HelperFunctions.setBrowser(prop.getProperty("browser"));
	  driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicit_wait")), TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  @AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			Date date = new Date();
			String newDate = date.toString().replaceAll(" ", "").replaceAll(":", "");
			HelperFunctions.getSnap("Login " + newDate + ".png");
		}
	}

}
