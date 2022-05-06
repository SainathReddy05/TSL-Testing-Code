package day5NG;

import org.testng.annotations.Test;

import utils.HelperFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ParaMetrization {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void loginProcess(String un, String pwd) {
	  System.out.println(un +" "+ pwd);
	  driver.get("http://demo.frontaccounting.eu/");
	  driver.findElement(By.name("user_name_entry_field")).clear();
	  driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("user_name_entry_field")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("SubmitUser")).click();
	  driver.findElement(By.className("shortcut")).click();
	  
  }
   @AfterMethod()
   public void afterMethod(ITestResult result)
   { //
	   if(result.isSuccess())
	   /*if(result.getStatus()==ITestResult.FAILURE)*/{
	   Date date = new Date();
	   String newDate=date.toString().replaceAll(" ","_").replaceAll(":","_");
	   HelperFunctions.getSnap("Login"+newDate+".png");
	   }
   }
  @DataProvider
  public Object[][] dp() throws IOException {
    /*return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };*/
	  Object data[][] = new Object[5][2];
	  /*data[0][0]="admin";
	  data[0][1]="admin123";
	  
	  data[1][0]="hr";
	  data[1][1]="hr123";
	  
	  data[2][0]="system";
	  data[2][1]="system123";
	  
	  data[3][0]="xyz";
	  data[3][1]="xyz123";
	  
	  data[4][0]="demouser";
	  data[4][1]="password";*/
	  
	  FileInputStream ip = new FileInputStream("C:\\Users\\Sainath Reddy\\Desktop\\Testing-TSL(847)\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sh = wb.getSheet("sheet1");
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			data[i][0]=sh.getRow(i).getCell(0).toString();
			data[i][1]=sh.getRow(i).getCell(1).toString();
		}
		
	  return data;
  }
  @BeforeTest
  @Parameters("browser")
  public void beforeTest(String browser) {
	  if(browser.equals("firefox"))
	  driver = HelperFunctions.setBrowser("firefox");
	  else if(browser.equals("chrome"))
		  driver = HelperFunctions.setBrowser("chrome");
	  else
		  driver = HelperFunctions.setBrowser("chrome");


  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
