package module_8_FrameworksAndSynchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment4POM__VerifyLoginPage {
	static WebDriver driver;
	static Assignment4POM_Object_SacueDemo login;

@Test
	public void verifySDLoginPage() throws InterruptedException {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		login= new Assignment4POM_Object_SacueDemo(driver);
		login.type_username("standard_user");
		login.type_password("secret_sauce");
		login.click_login();
		
		driver.close();
	
		
		
		
		
		
}
}