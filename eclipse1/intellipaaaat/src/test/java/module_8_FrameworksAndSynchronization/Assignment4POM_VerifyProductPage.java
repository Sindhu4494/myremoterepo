package module_8_FrameworksAndSynchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment4POM_VerifyProductPage {
	static WebDriver driver;
	static Assignment4POM_Object_SacueDemo login;
	

  @Test
  public void VerifyProductPage() throws InterruptedException {
	  driver=new FirefoxDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		login= new Assignment4POM_Object_SacueDemo(driver);
		login.type_username("standard_user");
		login.type_password("secret_sauce");
		login.click_login();
	
	/* String  Actual=login.Verify_productPage();
	String Expected="Products";
	Assert.assertEquals(Actual, Expected);*/
	 login.click_backpackLink();
	/* String  Actual1=login.Verify_productBackPAckPage();
		String Expected1="Products";
		Assert.assertEquals(Actual1, Expected1);*/
	  Thread.sleep(3000);
	  login.addToCartLink();
	  Thread.sleep(3000);
	  driver.close();
  }
}
