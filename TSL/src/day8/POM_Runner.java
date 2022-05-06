package day8;

import org.testng.Assert;
import org.testng.annotations.Test;

/*import POM.ForgetPage;
import POM.LoginPage;
import POM.WelcomePage;*/

import factory.ForgetPage;
import factory.LoginPage;
import factory.WelcomePage;

import utils.Base;

public class POM_Runner extends Base {
	ForgetPage fp;
	LoginPage lp;
	WelcomePage wp;
  @Test(priority = 1)
  public void loginPageTest() {
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM" );
  }
  @Test(priority = 2,dependsOnMethods="loginPageTest")
  public void forgetPageTest() {
	  lp = new LoginPage(driver);
	  fp = lp.goToForgetPage();
	  
	  Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode" );
  }
  
  @Test(priority = 3,dependsOnMethods="forgetPageTest")
  public void forgetPageCancelTest() {
	  fp.doCancel();
	  Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/auth/login" );
  }
  @Test(priority = 4,dependsOnMethods="loginPageTest")
  public void loginTest() {
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  wp = lp.doLogin("admin","admin123");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard" );

  }
  @Test(priority = 5,dependsOnMethods="loginTest")
  public void logoutTest() {
	 // Assert.assertTrue(wp.doLogout(););
	  wp.doLogout();
  }
  
  
}
