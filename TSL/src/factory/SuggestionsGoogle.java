package factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuggestionsGoogle {

	WebDriver driver;
	public SuggestionsGoogle(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//ul[@class='erkvQe']/li[*]/div/div[2]/div[1]/span") List<WebElement> ls;
	WebElement q;
	public void printSuggestions(String searchKey)
	{
		q.sendKeys(searchKey);
		for(WebElement i:ls)
		{
			System.out.println(i.getText());
		}
	}
	
}
