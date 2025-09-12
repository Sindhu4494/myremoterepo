package project1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ecom_FlipKart {
static WebDriver driver;
@Test
	public  void setup() throws InterruptedException, IOException {
		// TODO Auto-generated method stu
		//1/launch the driver

		driver =new ChromeDriver();
		// 2. TC-2 go to test URL https://www.google.co
		driver.navigate().to("https://www.flipkart.com/");
		//3. TC-3 specify wait time for 5 sec
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Tablets')]")).click() 	;
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		WebElement elctronics=driver.findElement(By.xpath("//span[normalize-space()='Electronics']"));
		a.clickAndHold(elctronics).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='jBYtJt cNDIdi CP4tVY'][normalize-space()='Mobiles']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mobiles");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//fetch the data into excel sheet
		List<WebElement> products=driver.findElements(By.xpath("//body/div[@id='container']/div/div[@class='nt6sNV JxFEK3 _48O0EI']/div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp']/div[2]/div[1]/div[1]/div[1]"));
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("phones");
		int rowNum=1;
		Row row=null;
		List<WebElement> name=List.of();
		List<WebElement> price=List.of();
				for(WebElement e:products) {
					name=e.findElements(By.xpath("//div[@class='KzDlHZ']"));
					price=e.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
				}
			for(int i=0;i<name.size();i++)	{
				String iteam=name.get(i).getText();
				String pp=price.get(i).getText();
				row=sheet.createRow(rowNum++);
				row.createCell(0).setCellValue(iteam);
				row.createCell(1).setCellValue(pp);
				System.out.println(iteam+""+pp);
			}
			FileOutputStream file=new FileOutputStream("phones.xlxs");
				workbook.write(file);
			Thread.sleep(3000);
		driver.close();;
		
	}

}
