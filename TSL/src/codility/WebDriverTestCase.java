package codility;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeClass;

import utils.HelperFunctions;

public class WebDriverTestCase {

	public static WebDriver webDriver;
	  
	  @BeforeClass
	  public static void beforeClass() {
		  webDriver=HelperFunctions.setBrowser("chrome");
		 // webDriver.get("https://www.shoppersstop.com/");
		  //webDriver.get("http://www.imdb.com/");
		 // webDriver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
		  webDriver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		  
	  }

	  @AfterClass
	  public static void afterClass() {
		  webDriver.quit();
	  }

}
