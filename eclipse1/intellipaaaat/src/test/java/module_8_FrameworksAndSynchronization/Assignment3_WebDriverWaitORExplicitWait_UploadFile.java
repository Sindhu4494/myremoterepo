package module_8_FrameworksAndSynchronization;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Assignment3_WebDriverWaitORExplicitWait_UploadFile {
	WebDriver driver;
	@BeforeMethod

	public void setup() throws AWTException {
		// TODO Auto-generated method stub
		//TC1 Launch the browser
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		//TC2 Navigate to url
		driver.navigate().to("https://smallpdf.com/word-to-pdf");
		//TC3 maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void action() throws AWTException {
		//TC4 locate the element button
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//TC5 get the path and select
		StringSelection path=new StringSelection("C:\\Users\\R R\\Downloads\\Selenium Assignments\\Searching-Element-XPath\\Module 4 – Searching Element XPath\\Module-4-Assignment-1-1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Robot class to perform window based
		Robot r=new Robot();
		//paste the path in selection
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter to open file
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//TC6 click the covert button
		driver.findElement(By.xpath("//span[text()='Convert']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//TC7 click the download button
	WebElement wait=(WebElement) new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[text()='Download']")));
		driver.findElement(By.xpath("//span[text()='Download']")).click();
	}
	@AfterMethod
		public void teardown() {
	//TC8 close the browser	
driver.close();
	}

}
