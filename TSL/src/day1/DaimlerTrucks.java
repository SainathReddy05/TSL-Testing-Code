package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DaimlerTrucks {

	public static void main(String[] args) {
		//WebDriver is Interface and ChromeDriver, FirefoxDriver,OperaDriver are 
		//child classes which implements WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//starts browser
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		int[] arr=new int[4];
		for(int i=0;i<arr.length;i++){
			int j=i+1;
			WebElement wb=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tbody/tr["+j+"]/td[4]"));
			arr[i]=Integer.parseInt(wb.getText());//wb.getText();
			if(arr[i]<2005){
				
				System.out.println(arr[i]);
				System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tbody/tr["+j+"]/th")).getText());
			}	
		}
		
		driver.quit();
		///html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tbody/tr[2]/th
		///html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table/tbody/tr[2]/td[4]
		//parent p=new child()
		//Declaring variable as parent type has benefit of holding any child object
//		driver.get("http://selenium.dev");
//		String title = driver.getTitle();
//		System.out.println("Current title of page is "+title);
//		
//		Assert.assertEquals(title,"Selenium");
//		
//		//driver.quit();
//		//driver.findElement(By.linkText("Downloads")).click();
//		
//		WebElement d=driver.findElement(By.linkText("Downloads"));
//		d.click();
//		
//		System.out.println("You are on "+driver.getTitle()+" Page");
//		driver.navigate().back();
//		System.out.println("You are on "+driver.getTitle()+" Page");
//		
//		driver.quit();
	}

}
