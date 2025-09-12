package capstone_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC6_DropDown_Alerts {
	WebDriver driver;
  @Test(priority=1)
  public void dropdown() throws InterruptedException {
	  driver =new ChromeDriver();
	  driver.get("https://en-gb.facebook.com/");
		//Wait Time 
		Thread.sleep(4000);
		//Manage Browser window to be Maximized 
		driver.manage().window().maximize();
		//Wait Time 
				Thread.sleep(4000);
//Click on Create New Account Button
	  
		driver.findElement(By.linkText("Create new account")).click();
	
		//Wait Time 
		Thread.sleep(4000);

//Select the option from the Month DropDown
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("9");
		Thread.sleep(4000);
		month.selectByIndex(9);
		Thread.sleep(4000);
		month.selectByVisibleText("Nov");
		Thread.sleep(4000);

	//Click on Singup Button
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(4000);
		driver.close();
	
  }
  @Test(priority=2)
  public void alertbox() throws InterruptedException {
	//TS1: Launch Chrome Browser
			 driver=new EdgeDriver();
		//TS2: Goto Test URL:  https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
			 
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Wait Time 5 sec =5000ms
			Thread.sleep(3000);
		  
		//TS4: Manage Browser window to be maximized 
					driver.manage().window().maximize();
					Thread.sleep(8000);
		 //Switch to Frame
					driver.switchTo().frame(0);
					//Click on Tryit button
					driver.findElement(By.xpath("//button[text()='Try it']")).click();
					Thread.sleep(7000);
					//Get the Plain Text from the Alert
				String ptext=driver.switchTo().alert().getText();
					System.out.println(ptext);
					
			//Send Data into the WebAlert
					driver.switchTo().alert().sendKeys("sindhu");
					Thread.sleep(5000);
					
			
					
			//Cancel the Alert 
					driver.switchTo().alert().dismiss();
			Thread.sleep(5000);
		//TS5: Close the Browser 
					driver.close();
	 
  }
}
