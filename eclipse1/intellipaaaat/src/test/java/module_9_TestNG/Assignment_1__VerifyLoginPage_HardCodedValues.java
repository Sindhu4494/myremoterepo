package module_9_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_1__VerifyLoginPage_HardCodedValues {
	static WebDriver driver;
	

@Test
	public void verifySDLoginPage() throws InterruptedException {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
			 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			 Thread.sleep(3000);
		  
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//input[@id='login-button']")).click();
			 Thread.sleep(3000);
			String element= driver.findElement(By.xpath("//span[text()='Products']")).getText();
			System.out.println(element);
			 Thread.sleep(3000);
			 driver.close();
}
}
