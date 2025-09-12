package module_9_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment_4_ReadFromPropfiles {
	static WebDriver driver;
  @Test
  public void logindata() throws IOException, InterruptedException {
	  Properties prop=new Properties();
	  FileInputStream files=new FileInputStream("C:\\Users\\R R\\eclipse1\\intellipaaaat\\src\\test\\java\\module_9_TestNG\\Assignment4_Config.properties");
	  prop.load(files);
	  String Name=prop.getProperty("name");
	  System.out.println(Name);
	  String Age=prop.getProperty("age");
	  System.out.println(Age);
	  String URL=prop.getProperty("url");
	  System.out.println(URL);
	  //Browsers
	  String Browser=prop.getProperty("browser");
	  System.out.println(Browser);
	  if(Browser.equals("Chrome")) {
		  driver=new ChromeDriver();
		  }
	  else if(Browser.equals("firefox")) {
		  driver=new FirefoxDriver();
		  }
	  else if(Browser.equals("edge")) {
		  driver=new EdgeDriver();
		  }
	  Thread.sleep(3000);
	  driver.navigate().to(URL);
	  driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("userNameField"))).sendKeys(prop.getProperty("username"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("pAsswordField"))).sendKeys(prop.getProperty("ppassword"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("loginButton"))).click();
		Thread.sleep(3000);
		driver.close();
	  
  }
}
