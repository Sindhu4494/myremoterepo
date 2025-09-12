package modelue_4_SearchingElementXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_1_FacebookDirectLocators_Chrome {

WebDriver driver;

	  @BeforeMethod
	  public void setup() throws InterruptedException {
		  //TC1 Launch the browser
		driver =new ChromeDriver();
		// 2. TC-2 go to test URL https://www.google.co
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		//3. TC-3 specify wait time for 5 sec
		Thread.sleep(5000);
	  }
//@Test(dependsOnMethods="setup")
	  @Test(priority=1)
public void input() throws InterruptedException {
				//TC4 Give input for first name
				driver.findElement(By.name("firstname")).sendKeys("Sindhu");
				Thread.sleep(3000);
				//TC5 Give input for last name
				driver.findElement(By.name("lastname")).sendKeys("reddy");
				Thread.sleep(3000);
}
//@Test(dependsOnMethods="input")
	  @Test(priority=2)
public void dropdown() throws InterruptedException {
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
}
//@Test(dependsOnMethods="dropdown")
	  @Test(priority=3)
public void radiobtn() throws InterruptedException {
				//TC9 select gender radio button
				By femlrdBtn = RelativeLocator.with(By.tagName("input")).below(By.id("day"));
				driver.findElement(femlrdBtn).click();
				Thread.sleep(3000);
}
//@Test(dependsOnMethods="radiobtn")
	  @Test(priority=4)
public void passwd() throws InterruptedException {
				//TC10 Give input for email or phonenumber
				driver.findElement(By.name("reg_email__")).sendKeys("sindhurddy04@gmail.com");
				Thread.sleep(3000);
				//TC11 Give input for password
				driver.findElement(By.name("reg_passwd__")).sendKeys("sindhu@4494");
				Thread.sleep(3000);
}
//@Test(dependsOnMethods="passwd")
@Test(priority=5)
public void submit() throws InterruptedException {
//TC12 click the submit button
				driver.findElement(By.name("websubmit")).click();
				Thread.sleep(3000);
	}
@AfterMethod
				public void tearDown(){
				//TC13.close the browser
				driver.close();
				}
	}


