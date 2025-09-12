package modelue_2_WedDriverAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assignment_4_EdgeBrowser {
	WebDriver driver;
@Test
	public void Verifytitle() throws InterruptedException {
		// TODO Auto-generated method stub
		//TC1 Launch edge browser
				System.setProperty("Webdriver.edge.driver", "C:\\msedgedriver.exe");
				 driver=new EdgeDriver();
				
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
