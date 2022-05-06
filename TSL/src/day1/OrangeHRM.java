package day1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username and Password");
		String un=sc.next();
		String pw=sc.next();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//starts browser
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.id("txtUsername")).sendKeys(un);
	    driver.findElement(By.id("txtPassword")).sendKeys(pw);
	    WebElement d=driver.findElement(By.id("btnLogin"));
	    d.click();
	    
	    try {
			Thread.sleep(3000);
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Logout")).click();
		    System.out.println("Login Successfull");
		    driver.quit();
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Login Failed");
			e.printStackTrace();
		}
	    
	    
	}

}
