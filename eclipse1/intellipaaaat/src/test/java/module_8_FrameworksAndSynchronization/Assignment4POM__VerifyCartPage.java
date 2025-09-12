package module_8_FrameworksAndSynchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment4POM__VerifyCartPage {
	static WebDriver driver;
	static Assignment4POM_Object_SacueDemo login;
  @Test
  public void verifyCartpage() throws InterruptedException {
	  driver=new FirefoxDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		login= new Assignment4POM_Object_SacueDemo(driver);
		login.type_username("standard_user");
		login.type_password("secret_sauce");
		login.click_login();
	
	/* String  Actualtext=login.Verify_productPage();
	String Expectedtext="Products";
	Assert.assertEquals(Actualtext, Expectedtext);*/
	 login.click_backpackLink();
	/* String  Actual1=login.Verify_productBackPAckPage();
		String Expected1="Products";
		Assert.assertEquals(Actual1, Expected1);*/
	  Thread.sleep(3000);
	  login.addToCartLink();
	  login.click_cartLink();
	  login.click_checkoutButton();
	  Thread.sleep(3000);
	  driver.close();
  }
}
