package modelue_2_WedDriverAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_2_ChromeBrowser {
	WebDriver driver;
@Test
	public void VerifyTitle() throws InterruptedException {
		// TODO Auto-generated method stub

// 1. TC-1 launch Chrome browser
//System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
 driver=new ChromeDriver();
// 2. TC-2 go to test URL https://www.google.co
driver.navigate().to("https://www.google.com/");
//3. TC-3 specify wait time for 5 sec
Thread.sleep(5000);
//4. TC-4 get the title of page into console
String s=driver.getTitle();
System.out.println("The Title of the page is "+s);
// 5. TC-5 close the browser
driver.close();
}

}
