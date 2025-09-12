package modelue_4_SearchingElementXpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_5_FacebookGetAttribute {
	WebDriver driver;
	@BeforeMethod
	
	public void setup() throws InterruptedException {
	// TC-1 launch Chrome browser	
			System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver=new ChromeDriver();
			// TC-2 go to test URL https://www.google.com
			driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
			//TC3 get window to be maximize
			driver.manage().window().maximize();
			Thread.sleep(4000);
	}
	@Test
	public void input() throws InterruptedException {
			//TC4 fill First Name Textbox with input
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sindhu");
			Thread.sleep(4000);
			//TC5 fill last Name Textbox with input
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("reddy");
			Thread.sleep(4000);
			//TC6 clear the input from First Name Textbox
			driver.findElement(By.xpath("//input[@name='firstname']")).clear();
			Thread.sleep(4000);
			
			//TC7 again fill the First Name Textbox with input
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Badrinath");
			Thread.sleep(4000);
			//TC8 Get the input from Textbox and display it in Console
		String input=	driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
			System.out.println("the input is "+input);
		Thread.sleep(4000);
	}
	@AfterMethod
	public void teardown() {
			//TC9 close the browser									
driver.close();	
}
}