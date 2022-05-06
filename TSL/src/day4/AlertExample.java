package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.HelperFunctions;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = HelperFunctions.setBrowser("chrome");
		driver.get("http://demo.frontaccounting.eu/index.php");
		/*Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Enter Name')]")).click();
		Alert a = driver.switchTo().alert();//Focused on alert
		System.out.println(a.getText());
		a.sendKeys("Sainath Reddy");
		Thread.sleep(1000);
		a.accept();*/
		driver.findElement(By.name("SubmitUser")).click();
		driver.findElement(By.className("menu_option")).click();
		
		driver.findElement(By.id("CancelOrder")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(1000);
		a.accept();
		//a.dismiss();
	}

}
