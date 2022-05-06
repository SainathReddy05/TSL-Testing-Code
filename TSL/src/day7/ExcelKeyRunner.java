package day7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Base;
import utils.ExcelReader;
import utils.keywords;

public class ExcelKeyRunner extends Base{
  @Test(dataProvider = "dp")
  public void f(String exKey, String locator, String data) {
	  keywords key  = new keywords(driver);
	  switch (exKey) {
	case "getURL":
		key.getURL(data);
		break;
	case "click":
		key.click(locator);
		break;
	case "type":
		key.type(locator, data);
		break;
	case "selectFromDropDown":
		key.selectFromDropDown(locator, data);
		break;
	case "closeBrowser":
		key.closeBrowser();
		break;
	case "getSnap":
		key.getSnap(data);
		break;
	default:
		System.out.println("Invalid Keyword");
		break;
	}
  }
  @DataProvider
  public Object[][] dp()
  {
	  ExcelReader ex= new ExcelReader("C:\\Users\\Sainath Reddy\\Desktop\\Testing-TSL(847)\\Book1.xlsx");
	  int row = ex.getRowNum("sheet1");
	  int col = ex.getColumnNum("sheet1");
	  
	  Object data[][] =new Object[row-1][col];
	  for(int i=0;i<row-1;i++)
	  {
		  data[i][0]=ex.getCelldata("sheet1", i+1, 0);
		  data[i][1]=ex.getCelldata("sheet1", i+1, 1);
		  data[i][2]=ex.getCelldata("sheet1", i+1, 2);
	  }
	  return data;
  }
}
