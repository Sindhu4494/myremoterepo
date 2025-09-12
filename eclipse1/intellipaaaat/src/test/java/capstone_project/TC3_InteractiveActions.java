package capstone_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC3_InteractiveActions {
	WebDriver driver;
  @Test(priority=1)
  public void f() throws InterruptedException, AWTException {
	//Launch the driver
	  driver= new ChromeDriver();
	  //launch the browser url
	  driver.get("https://demoqa.com/droppable");
		//Wait Time 5 sec =5000ms
			Thread.sleep(5000);
		
		//TS4: Manage Browser window to be maximized 
					driver.manage().window().maximize();
					Thread.sleep(5000);
					//Implementing Java Robot 
					Robot r=new Robot();
			//Scroll one step Down
					r.keyPress(KeyEvent.VK_PAGE_DOWN);
					r.keyRelease(KeyEvent.VK_PAGE_DOWN);
					Thread.sleep(5000);
		
		//Drag and Drop  
			WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
			Actions a=new Actions(driver);			
			Thread.sleep(5000);
			//a.moveToElement(fashion).build().perform();
			//a.doubleClick(doubleclick).build().perform();
			//a.contextClick(doubleclick).build().perform();
		
		//a.dragAndDropBy(slider, 20, 0).build().perform();
		a.dragAndDrop(draggable, droppable).build().perform();	
					Thread.sleep(5000);
		//TS5: Close the Browser 
					driver.close();
	 
		}
  @Test(priority=2)
  public void selctable() throws InterruptedException {
	//TS1: Launch Edge Browser
		
			WebDriver driver=new EdgeDriver();
		//TS2: Goto Test URL: https://www.flipkart.com/
			 
			driver.get("https://www.flipkart.com/");
		//Wait Time 5 sec =5000ms
			Thread.sleep(5000);
		
		//TS4: Manage Browser window to be maximized 
					driver.manage().window().maximize();
					Thread.sleep(5000);
		
		//Automate Cache Element
			WebElement sbox=driver.findElement(By.xpath("//input[@name='q']"));
			Actions a=new Actions(driver);
		//	a.moveToElement(fashion).build().perform();
			a.click(sbox).sendKeys("smartphone").build().perform();
			Thread.sleep(5000);
			a.click(sbox).sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);
			a.click(sbox).sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);
			a.click(sbox).sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);
			a.click(sbox).sendKeys(Keys.ENTER).build().perform();
					
					Thread.sleep(5000);
		//TS5: Close the Browser 
					driver.close();
	 
		}
  }
  

