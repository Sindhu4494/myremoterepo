package capstone_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1_LoginScreen {
	static WebDriver driver;
  @Test
  public void Verify_Login() throws InterruptedException {
	  //Launch the driver
	  driver= new ChromeDriver();
	  //launch the browser url
	  driver.navigate().to("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  //enter the username input
	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	  Thread.sleep(3000);
	  //enter the password input
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	  Thread.sleep(3000);
	  //click the login button
	  driver.findElement(By.xpath("//input[@name=\"login-button\"]")).click();
	  Thread.sleep(3000);
	  driver .close();
  }
}
