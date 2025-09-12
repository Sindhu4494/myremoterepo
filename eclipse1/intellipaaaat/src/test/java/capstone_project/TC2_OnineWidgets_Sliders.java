package capstone_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC2_OnineWidgets_Sliders {
	WebDriver driver;
	  @Test
	  public void datepickers() throws InterruptedException {
		  //Launch the driver
		  driver= new ChromeDriver();
		  //launch the browser url
		  driver.navigate().to("https://jqueryui.com/slider/");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.switchTo().frame(0);
		  //find the slider xpath
		 WebElement slider= driver.findElement(By.xpath("//div[@id='slider']"));
		 Thread.sleep(3000);
		 //get mouse actions
		 Actions a=new Actions(driver);
		 //perform slide action
		 a.dragAndDropBy(slider, 80, 0).build().perform();
		 Thread.sleep(3000);
		 //close the driver
		driver.close();
	  }

}
