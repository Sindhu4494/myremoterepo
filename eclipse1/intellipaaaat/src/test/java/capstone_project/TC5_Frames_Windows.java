package capstone_project;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC5_Frames_Windows {
	WebDriver driver;
  @Test(priority=1)
  public void frames() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.navigate().to("https://demoqa.com/frames");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  String ptext=driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page The')]")).getText();
	  System.out.println(ptext);
	  Thread.sleep(3000);
	  driver.switchTo().frame("frame1");
	  String p1text=driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText();
	  System.out.println(p1text);
	  Thread.sleep(3000);
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
	  driver.switchTo().frame("frame2");
	  String p3text=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
	  System.out.println(p3text);
	  driver.close();
  }
  @Test(priority=2)
  public void windowsHAndling() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/browser-windows");
		//Wait Time 5 sec =5000ms
			Thread.sleep(5000);
	 
		//TS3: Manage Browser window to be maximized 
					driver.manage().window().maximize();
					Thread.sleep(5000);
		//TS4: Click on New Window Button
					driver.findElement(By.id("windowButton")).click();
					
					Thread.sleep(5000);
		//Handling Tabs
					ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
					System.out.println(wins);
			//Switch from 0th window to 1st  window
					driver.switchTo().window(wins.get(1));
					
		//TS5: Capture the plaintext present in 1st Tab or newly generated Tab
					String ptext=driver.findElement(By.id("sampleHeading")).getText();
					System.out.println(ptext);
					Thread.sleep(5000);
		//TS5: Close the Browser 
					driver.close();
	//Switch from 1st Tab to 0th Tab
					driver.switchTo().window(wins.get(0));
								
					Thread.sleep(5000);
					//TS5: Close the Browser 
								driver.close();
	 
}
  
  
}

