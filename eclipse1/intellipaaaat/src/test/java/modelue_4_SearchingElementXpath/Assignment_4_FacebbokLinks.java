package modelue_4_SearchingElementXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_4_FacebbokLinks {
WebDriver driver;
@BeforeMethod
	public void setup() throws InterruptedException {
		// TODO Auto-generated method stub
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
	public void links() {
		//TC4 list the links by locating elements
		
		List<WebElement> links=driver.findElements(By.tagName("a"));  //tagname,class,links,anything you can get
		System.out.println(links.size());
		//TC5 store and get text of links
		
		for(int i = 0;i<links.size();i=i+1)
		{
			
			System.out.println("the links present in page is "+links.get(i).getText());
		}
}
@AfterMethod
public void teardown() {
		//TC6 close the browser
		driver.close();
		}
	
	}


