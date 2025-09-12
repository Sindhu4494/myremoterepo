package module_6_AdvancedUserInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment2_TestBlog_Chrome {
WebDriver driver;
@BeforeMethod
	public void setup() throws InterruptedException {
		// TODO Auto-generated method stub
		//TC1 Launch the browser
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		//TC2 Navigate to url
		driver.navigate().to("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		//TC3 maximize the window
		driver.manage().window().maximize();
		Thread.sleep(4000);
}
@Test
public void alert() throws InterruptedException {
		//TC4 find the double click element
		WebElement action=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//Action class to perform mouse action
		Actions a =new Actions(driver); 
		//TC5 click the target element
		a.doubleClick(action).build().perform();
		Thread.sleep(4000);
		//TC6 accept the alert
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
}
@AfterMethod
public void teardown() {
		//TC7  close the browser
		driver.close();
	}

}
