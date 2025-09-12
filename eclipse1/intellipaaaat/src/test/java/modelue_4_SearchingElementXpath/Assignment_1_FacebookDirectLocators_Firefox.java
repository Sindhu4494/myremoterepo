package modelue_4_SearchingElementXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_1_FacebookDirectLocators_Firefox {
	WebDriver driver;
@BeforeMethod
	public void Setup() throws InterruptedException {
		// TODO Auto-generated method stub
		// TC-1 launch firefox browser	
	
		 driver=new FirefoxDriver();
		// TC-2 go to test URL https://www.google.com
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		//TC3 get window to be maximize
		driver.manage().window().maximize();
		Thread.sleep(4000);
}
@Test
public void input() throws InterruptedException {
//TC4 Give input for first name
		driver.findElement(By.name("firstname")).sendKeys("Sindhu");
		Thread.sleep(3000);
		//TC5 Give input for last name
		driver.findElement(By.name("lastname")).sendKeys("reddy");
		Thread.sleep(3000);
		//TC6 select day in dropdown
		Select day=new Select(driver.findElement(By.name("birthday_day")));
		day.selectByValue("4");
		Thread.sleep(3000);
		//TC7 select month in dropdown
		Select month=new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Apr");
		Thread.sleep(3000);
		//TC8 select year in dropdown
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1994");
		Thread.sleep(3000);
		//TC9 select gender radio button
		By femlrdBtn = RelativeLocator.with(By.tagName("input")).below(By.id("day"));
		driver.findElement(femlrdBtn).click();
		Thread.sleep(3000);
		//TC10 Give input for email or phonenumber
		driver.findElement(By.name("reg_email__")).sendKeys("sindhurddy04@gmail.com");
		Thread.sleep(3000);
		//TC11 Give input for password
		driver.findElement(By.name("reg_passwd__")).sendKeys("sindhu@4494");
		Thread.sleep(3000);
		//TC12 click the submit button
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
}
@AfterMethod
public void tearDown() {
		//TC13.close the browser
		driver.close();
	}

}
