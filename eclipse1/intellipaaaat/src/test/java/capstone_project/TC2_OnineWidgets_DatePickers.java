package capstone_project;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC2_OnineWidgets_DatePickers {
	WebDriver driver;
  @Test
  public void datepickers() throws InterruptedException {
	  //Launch the driver
	  driver= new ChromeDriver();
	  //launch the browser url
	  driver.navigate().to("https://jqueryui.com/datepicker/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	//expected data
	String month="April";
String day="4";
String year="1994";
//select month and year
while(true) {
String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
if(currentmonth.equals(month) && currentyear.equals(year)) {
	break;
}
//previous calender button
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
/*//next calender button
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']']")).click();*/
}

//select the date

List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
for(WebElement date:alldates) {
	if(date.getText().equals(day)) {
		date.click();
		break;
	}
}
	  Thread.sleep(3000);
	  driver.close();
  }

}
