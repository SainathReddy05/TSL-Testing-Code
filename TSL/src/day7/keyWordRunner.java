package day7;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.Base;
import utils.keywords;

public class keyWordRunner extends Base {
  @Test
  public void f() {
	  //WebDriver driver = Base.driver;;
	  keywords key = new keywords(driver);
	  key.getURL("http://selenium.dev");
	  key.click("name:=Downloads");
	  key.type("id:=gsc-i-id1","LTI");
	  key.getURL("http://facebook.com");
	  key.selectFromDropDown("id:=year","1998");
	  key.getSnap("C:\\Users\\Sainath Reddy\\workspace\\TSL\\facebook.png");
	  key.closeBrowser();
  }
}
