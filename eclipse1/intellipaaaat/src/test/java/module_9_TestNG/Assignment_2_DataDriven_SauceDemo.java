package module_9_TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment_2_DataDriven_SauceDemo
{

	WebDriver driver;
	@Test(dataProvider="sd_testData")
	public void verify_sauceDemoPage(String uname,String upasswrd) throws InterruptedException {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(upasswrd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
		//verify sauce demo page
		String ExcptdURL="https://www.saucedemo.com/inventory.html";
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExcptdURL);
		Thread.sleep(3000);
	}
		//get the  screenshot of errors and close the browser
		@AfterMethod
		public void getTestResult(ITestResult testResult) throws InterruptedException, IOException
		{
			System.out.println("the test case name is "+testResult.getName());
			System.out.println("the test case result is "+testResult.getStatus()); //Integer return type 1-pass and 2-fail
			int status=testResult.getStatus();
			if(status==1) 
			{
			Thread.sleep(3000);
		driver.close();
			}
			else {
				
				//take the particular screenshot
				
				WebElement errormsg=driver.findElement(By.xpath("//*[contains(text(),'Epic sadface: Username and')]"));
				File outfiles=((TakesScreenshot)errormsg).getScreenshotAs(OutputType.FILE);
				try {
				FileUtils.copyFile(outfiles, new File("C:\\Users\\R R\\eclipse1\\intellipaaaat\\src\\test\\resources\\testDataSamples"+testResult.getParameters()[1]+"Default jpeg"));
				}
				catch(IOException e){
					e.printStackTrace();
					
				}
			}				
		}	
	@DataProvider(name="sd_testData")
	public Object[][] readExcel() throws BiffException, IOException 
	{
		//get the path of the file
	File file= new File("C:\\Users\\R R\\eclipse1\\intellipaaaat\\src\\test\\resources\\testDataSamples\\TestData_SauceDemo.xls");
	//get the workbook frome the file	
	Workbook wb=Workbook.getWorkbook(file);
	//get the sheet need to be used fom the workbook
	Sheet sheet=wb.getSheet(0);
	//get the rows from the sheet
	int noOfRows=sheet.getRows();
	System.out.println("The no. of rows ina  sheet is :"+noOfRows);
	//get the columns from the sheet
	int noOfColumns=sheet.getColumns();
	System.out.println("The no. of columns ina  sheet is :"+noOfColumns);	
	//creating a array to store a data from excel
		String inputData[][]=new String[noOfRows-1][noOfColumns];
		//get the count and loop to read data
	int count=0;
	for(int i=1;i<noOfRows;i++)
	{
		for(int j=0;j<noOfColumns;j++) 
		{
			//get the particular cell from the sheet by rading rows and columns
			Cell cell=sheet.getCell(j,i);
			//read and get the content from the cell
			inputData[count][j]=cell.getContents();
		}
	//increment the count until data is present	
	count++;	
	}
	return inputData;
		
	}
}
