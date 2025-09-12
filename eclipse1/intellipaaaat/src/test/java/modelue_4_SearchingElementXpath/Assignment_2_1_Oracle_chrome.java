package modelue_4_SearchingElementXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_2_1_Oracle_chrome {
WebDriver driver;
@BeforeMethod
	public void setup() throws InterruptedException {
		// TODO Auto-generated method stub
		// TC-1 launch chrome browser	
				
				 driver=new ChromeDriver();
				// TC-2 go to test URL https://profile.oracle.com/myprofile/account/create-account.jspx
				driver.navigate().to("https://profile.oracle.com/myprofile/account/create-account.jspx");
				//TC3 get window to be maximize
				driver.manage().window().maximize();
				Thread.sleep(4000);
	}
	@Test
	public void registration() throws InterruptedException {
				//TC4 give email address
				driver.findElement(By.name("sView1:r1:0:email")).sendKeys("sindhurddy04@gmail.com");
				Thread.sleep(3000);
				//TC5 give password
				driver.findElement(By.name("sView1:r1:0:password")).sendKeys("Sindhu@44");
				Thread.sleep(3000);
				//TC6 give re-password
				driver.findElement(By.name("sView1:r1:0:retypePassword")).sendKeys("Sindhu@44");
				Thread.sleep(3000);
				//TC7 select country
				Select country=new Select(driver.findElement(By.name("sView1:r1:0:country")));
				country.selectByVisibleText("India");
				Thread.sleep(3000);
				//TC8 give first name
				driver.findElement(By.name("sView1:r1:0:firstName")).sendKeys("Sindhu");
				Thread.sleep(3000);
				//TC9 give last name
				driver.findElement(By.name("sView1:r1:0:lastName")).sendKeys("Badrinath");
				Thread.sleep(3000);
				//TC10 give job title
				driver.findElement(By.name("sView1:r1:0:jobTitle")).sendKeys("Software Engineer");
				Thread.sleep(3000);
				//TC11 give phone number
				driver.findElement(By.name("sView1:r1:0:workPhone")).sendKeys("9952590371");
				Thread.sleep(3000);
				//TC12 give company name
				driver.findElement(By.name("sView1:r1:0:companyName")).sendKeys("RRFinancial Ltd");
				Thread.sleep(3000);
				
				//TC13 give address
				driver.findElement(By.name("sView1:r1:0:address1")).sendKeys("#7,w/o.Badrinath,mallappa layout,segehalli,Bangalore");
				Thread.sleep(3000);
				//TC14 give city
				driver.findElement(By.name("sView1:r1:0:city")).sendKeys("Bangalore");
				Thread.sleep(3000);
				//TC15 select state
				Select state=new Select(driver.findElement(By.name("sView1:r1:0:state")));
				state.selectByVisibleText("Andhra Pradesh");
				Thread.sleep(3000);
				//TC15 give postal code
				driver.findElement(By.name("sView1:r1:0:postalCode")).sendKeys("563122");
				Thread.sleep(3000);
				
				//TC16 click the create button
				driver.findElement(By.xpath("//*[text()='Create Account']")).click();
				Thread.sleep(3000);
	}
@AfterMethod
public void tearDown() {
				//TC17 close the browser
driver.close();
}
	}

