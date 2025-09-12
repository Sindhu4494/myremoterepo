package capstone_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC4_RegistrationForms {
	WebDriver driver;
	  @Test
	  public void registrationfroms() throws InterruptedException {
		  //Launch the driver
		  driver= new ChromeDriver();
		  //launch the browser url
		  driver.navigate().to("https://profile.oracle.com/myprofile/account/create-account.jspx");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:email']")).sendKeys("sindhurddy04@gmail.com");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:password']")).sendKeys("Reddy@44");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:retypePassword']")).sendKeys("Reddy@44");
		  Thread.sleep(3000);
		  Select country=new Select(driver.findElement(By.xpath("//select[@name='sView1:r1:0:country']")));
		  country.selectByVisibleText("India");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:firstName']")).sendKeys("Sindhu");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:lastName']")).sendKeys("Reddy");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:jobTitle']")).sendKeys("Automation Tester");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:workPhone']")).sendKeys("9876543210");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:companyName']")).sendKeys("HCL");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:address1']")).sendKeys("Jiggani,Bangalore");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:city']")).sendKeys("Bangalore");
		  Thread.sleep(3000);
		  Select state=new Select(driver.findElement(By.xpath("//select[@id='sView1:r1:0:state::content']")));
		  state.selectByVisibleText("Andhra Pradesh");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='sView1:r1:0:postalCode']")).sendKeys("560068");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[text()='Create Account']")).click();
		  Thread.sleep(3000);
		  driver.close();
}
	  
}