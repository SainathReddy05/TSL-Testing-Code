package day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.Base;

public class PropertyFileExample extends Base {
  @Test
  public void propertyTest() throws Exception {
	  
	  driver.get(prop.getProperty("url"));
	  driver.findElement(By.name(prop.getProperty("searchField_name"))).sendKeys(prop.getProperty("searchkey"));
	  
	  Thread.sleep(2000);
	  List<WebElement> ls = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[*]/div/div[2]/div[1]/span"));
	  System.out.println(ls.size());
	  for(WebElement i:ls)
	  {
		  //ls = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[*]/div/div[2]/div[1]/span"));
		  System.out.println(i.getText());
	  }
  }
  
 /* @Test
  public void propertyTest2() throws InterruptedException {
	  driver.get("http://www.bing.com");
	  driver.findElement(By.name("q")).sendKeys("LTI");
	  Thread.sleep(1000);
	  List<WebElement> ls = driver.findElements(By.xpath("//ul[@id='sa_ul']/li[*]/div/span"));
	  System.out.println(ls.size());
	  for(WebElement i:ls)
	  {
		  ls = driver.findElements(By.xpath("//ul[@id='sa_ul']/li[*]/div/span"));
		  System.out.println(i.getText());
	  }
  }*/
}
