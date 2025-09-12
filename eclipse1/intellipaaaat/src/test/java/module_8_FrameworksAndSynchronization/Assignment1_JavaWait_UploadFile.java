package module_8_FrameworksAndSynchronization;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1_JavaWait_UploadFile {
WebDriver driver;
@BeforeMethod
	public void setup() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//TC1 Launch the browser
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
	driver=new ChromeDriver();
		//TC2 Navigate to url
		driver.navigate().to("https://smallpdf.com/word-to-pdf");
		//TC3 maximize the window
		driver.manage().window().maximize();
		Thread.sleep(4000);
}
@Test
public void  files() throws InterruptedException, AWTException {
		//TC4 locate the element button
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(4000);
		//TC5 get the path and select
		StringSelection path=new StringSelection("C:\\Users\\R R\\Downloads\\Selenium Assignments\\Searching-Element-XPath\\Module 4 – Searching Element XPath\\Module-4-Assignment-1-1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Thread.sleep(6000);
		//Robot class to perform window based
		Robot r=new Robot();
		//paste the path in selection
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//Enter to open file
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(15000);
		//TC6 click the covert button
		driver.findElement(By.xpath("//span[text()='Convert']")).click();
		Thread.sleep(4000);
		//TC7 click the download button
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(3000);
}
@AfterMethod
public void teardown() {
	//TC8 close the browser	
driver.close();
	}

}
