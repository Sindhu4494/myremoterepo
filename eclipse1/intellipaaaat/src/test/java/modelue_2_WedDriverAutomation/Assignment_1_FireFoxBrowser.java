package modelue_2_WedDriverAutomation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment_1_FireFoxBrowser {
	WebDriver driver;
@Test
	public void Firefox() {
		// TODO Auto-generated method stub
		//TC1 Launch the firefox browser
		System.setProperty("Webdriver.firefox.driver", "C:\\geckodriver.exe");
		driver=new FirefoxDriver();
		// TC-2 go to test URL https://www.google.com
		driver.navigate().to("https://www.google.com/");
		//TC3 close the browser
		driver.close();
	}

}
