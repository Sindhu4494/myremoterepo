package modelue_2_WedDriverAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_1_ChromeBrowser {
	WebDriver driver;
@Test
	public  void ChromeBrowser(){
		// TODO Auto-generated method stub
		// TC-1 launch Chrome browser	
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		// TC-2 go to test URL https://www.google.com
		driver.navigate().to("https://www.google.com/");
		//TC-3 close the browser
		driver.close();
	}

}
