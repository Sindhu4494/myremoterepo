package module_6_AdvancedUserInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1_Flipkart_Chrome {
WebDriver driver;
@BeforeMethod
	public void setup() throws InterruptedException {
		// TODO Auto-generated method stub
		//TC1  Launch the browser
System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
 driver=new ChromeDriver();
//TC2 Navigate to url
driver.navigate().to("https://www.flipkart.com/");
//TC3 maximize the window
driver.manage().window().maximize();
Thread.sleep(4000);
	}
@Test
public void action() throws InterruptedException {
//TC4 find the element to perform hidden locator
WebElement action=driver.findElement(By.xpath("//span[text()='Electronics']"));
//Action class to perform mouse action
Actions a =new Actions(driver); 
a.moveToElement(action).build().perform();
Thread.sleep(4000);
//TC5 move mouse pointer towards cameras and accessories
WebElement action1=driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
a.moveToElement(action1).build().perform();
Thread.sleep(4000);
//TC6 move mouse pointer towards DSLR option and perform click
WebElement action2=driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']"));
action2.click();
Thread.sleep(4000);
	}
@AfterMethod
public void teardown() {
//TC7 close the browser
driver.close();
	}

}
