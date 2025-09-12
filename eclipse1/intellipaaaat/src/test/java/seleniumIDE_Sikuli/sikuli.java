package seleniumIDE_Sikuli;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;


public class sikuli {
	public WebDriver driver;

@Test
public void testSikuli_FileUpload()	throws InterruptedException, AWTException, FindFailed, IOException 
{
//TS1: Launch Chrome Browser
 
	 driver=new EdgeDriver();
//TS2: Goto Test URL: 
	//get() -- to send the url into the browser 
	driver.get("https://smallpdf.com/word-to-pdf");
//Wait Time 5 sec =5000ms
	Thread.sleep(5000);
  
//TS4: Manage Browser window to be maximized 
			driver.manage().window().maximize();
			Thread.sleep(5000);
		//Implementing Sikuli
			//Implementing Sikuli
			Screen s=new Screen();
			//click on ChooseFiles Button
			
		//	driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
s.click("C:\\Users\\R R\\eclipse1\\intellipaaaat\\src\\test\\resources\\sikuli_locators\\choosefiles_button.PNG");	
			
			Thread.sleep(5000);
			
//Send the Path of File into Textbox
			Pattern fileInput=new Pattern("C:\\Users\\R R\\eclipse1\\intellipaaaat\\src\\test\\resources\\sikuli_locators\\input_path_tab.PNG");
			
s.type(fileInput,"C:\\Users\\R R\\eclipse1\\intellipaaaat\\src\\test\\resources\\sikuli_locators\\Testdoc.docx");
Thread.sleep(8000);
//Click on open button
s.click("C:\\Users\\R R\\eclipse1\\intellipaaaat\\src\\test\\resources\\sikuli_locators\\open_button.PNG");

//Take Screenshot
ScreenImage si=s.capture();
BufferedImage bi=si.getImage();
File f1=new File("C:\\Users\\R R\\eclipse1\\intellipaaaat\\src\\test\\resources\\sikuli_locator\\FileConversion.PNG");
ImageIO.write(bi, "PNG", f1);

//Explicit Wait
WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));	    


//Click on Download Button
s.click("C:\\Users\\R R\\eclipse1\\intellipaaaat\\src\\test\\resources\\sikuli_locators\\click_Download.png");
//	wait.click();
	//driver.findElement(By.xpath("//span[text()='Download']")).click();
Thread.sleep(8000);	
//TS5: Close the Browser 
	driver.close();
	}

}
