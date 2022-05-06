package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//starts browser
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
		FileInputStream ip = new FileInputStream("C:\\Users\\Sainath Reddy\\Desktop\\Testing-TSL(847)\\Book1-firsttestdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sh = wb.getSheet("sheet1");
		/*sh.getRow(2).getCell(1).setCellValue("LTI123");
		sh.getRow(3).createCell(2).setCellValue("LTI123");
		sh.createRow(5).createCell(5).setCellValue("LTI123");
		sh.createRow(0).createCell(2).setCellValue("LTI123");

		wb.write(new FileOutputStream("C:\\Users\\Sainath Reddy\\Desktop\\Testing-TSL(847)\\Book1-firsttestdata1.xlsx"));*/
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			String un = sh.getRow(i).getCell(0).toString();
			System.out.print(un+"\t");
			String pwd = sh.getRow(i).getCell(1).toString();
			System.out.println(pwd);
			driver.findElement(By.xpath("//*[@name='txtUsername']")).clear();
			driver.findElement(By.xpath("//*[@type='password']")).clear();
			driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys(un);
			driver.findElement(By.xpath("//*[@type='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
			
			try{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Welcome Admin']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				System.out.println("Login done");
				sh.getRow(i).createCell(2).setCellValue("Passed");
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Login Failed");
				sh.getRow(i).createCell(2).setCellValue("Failed");

			}

			wb.write(new FileOutputStream("C:\\Users\\Sainath Reddy\\Desktop\\Testing-TSL(847)\\Book1-firsttestdata2.xlsx"));
		}
		
	}

}
