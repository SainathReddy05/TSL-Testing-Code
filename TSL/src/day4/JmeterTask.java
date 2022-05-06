package day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.HelperFunctions;

public class JmeterTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = HelperFunctions.setBrowser("chrome");
		driver.get("https://jmeter.apache.org/");
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Sainath Reddy\\Desktop\\Testing-TSL(847)\\Book1-firsttestdata2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sh = wb.getSheet("sheet1");
		
		HelperFunctions.getSnap("./jmeterSnap.png");

		List<WebElement> links = driver.findElements(By.xpath("/html/body/div[2]/ul[4]/li/ul/li"));    //Identify the number of Link on webpage and assign into Webelement List 
        
        System.out.println("Number of tutorials are   "+links.size());
	  /* WebElement tut1=driver.findElement(By.linkText("Distributed Testing"));
	   WebElement tut2=driver.findElement(By.linkText("Recording Tests"));
	   WebElement tut3=driver.findElement(By.linkText("JUnit Sampler"));
	   WebElement tut4=driver.findElement(By.linkText("Access Log Sampler"));
	   WebElement tut5=driver.findElement(By.linkText("Extending JMeter"));

       
    	   sh.createRow(0).createCell(0).setCellValue(tut1.getText());
    	   sh.createRow(0).createCell(1).setCellValue(tut1.getAttribute("href"));
    	   sh.createRow(1).createCell(0).setCellValue(tut2.getText());
    	   sh.createRow(1).createCell(1).setCellValue(tut2.getAttribute("href"));
    	   sh.createRow(2).createCell(0).setCellValue(tut3.getText());
    	   sh.createRow(2).createCell(1).setCellValue(tut3.getAttribute("href"));
    	   sh.createRow(3).createCell(0).setCellValue(tut4.getText());
    	   sh.createRow(3).createCell(1).setCellValue(tut4.getAttribute("href"));
    	   sh.createRow(4).createCell(0).setCellValue(tut5.getText());
    	   sh.createRow(4).createCell(1).setCellValue(tut5.getAttribute("href"));*/
    	   
    	  for(int i=1;i<=links.size();i++)
    	  {
    		  WebElement tut=driver.findElement(By.xpath("/html/body/div[2]/ul[4]/li/ul/li["+i+"]/a"));
    		  System.out.println(tut.getText() +"  "+ tut.getAttribute("href"));
    		  sh.createRow(i).createCell(0).setCellValue(tut.getText());
       	      sh.getRow(i).createCell(1).setCellValue(tut.getAttribute("href")); 
    	  }
    	   wb.write(new FileOutputStream("C:\\Users\\Sainath Reddy\\Desktop\\Testing-TSL(847)\\Book1-firsttestdata2.xlsx"));
	}

}
