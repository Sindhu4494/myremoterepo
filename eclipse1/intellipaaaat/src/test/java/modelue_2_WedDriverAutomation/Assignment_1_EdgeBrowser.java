package modelue_2_WedDriverAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assignment_1_EdgeBrowser {
	WebDriver driver;
@Test
	public void EdgeBRowser() {
		// TODO Auto-generated method stub
		//TC1 Launch edge browser
		System.setProperty("Webdriver.edge.driver", "C:\\msedgedriver.exe");
		 driver=new EdgeDriver();
		// TC-2 go to test URL https://www.google.com
		driver.navigate().to("https://www.google.com/");
		//TC-3 close the browser
		driver.close();
	}

}
