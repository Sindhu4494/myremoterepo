package capstone_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC2_OnineWidgets_Tabs {
	WebDriver driver;
	  @Test
	  public void tabs() throws InterruptedException {
		  //Launch the driver
		  driver= new ChromeDriver();
		  //launch the browser url
		  driver.navigate().to("https://jqueryui.com/tabs/");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		  //get and verify text from tab 0
		  String tab0=driver.findElement(By.xpath("//*[starts-with(text(),'Proin elit ')]")).getText();
		  System.out.println("the  text present in tab0 "+tab0);
		  Thread.sleep(3000);
		  Actions a=new Actions(driver);
		  //click tab1
		WebElement  tab1=driver.findElement(By.xpath("//a[text()='Proin dolor']"));
		a.moveToElement(tab1).click().build().perform();
		Thread.sleep(3000);
		//get and verify text from tab 1
		String tab1text=driver.findElement(By.xpath("//*[starts-with(text(),'Morbi ')]")).getText();
		  System.out.println("the  text present in tab1 "+tab1text);
		  Thread.sleep(3000);
		  //click tab2
		  WebElement  tab2=driver.findElement(By.xpath("//a[text()='Aenean lacinia']"));
			a.moveToElement(tab2).click().build().perform();
			Thread.sleep(3000);
			//get and verify text from tab 2
			String tab2text=driver.findElement(By.xpath("//*[starts-with(text(),'Mauris ')]")).getText();
			  System.out.println("the  text present in tab1 "+tab2text);
			  Thread.sleep(3000);
			  //close the browser
		  driver.close();
		
	  }
}
