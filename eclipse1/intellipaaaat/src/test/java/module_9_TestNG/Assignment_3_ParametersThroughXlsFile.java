package module_9_TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment_3_ParametersThroughXlsFile {
	static WebDriver driver;


@Test(dataProvider="sd_testData")
	public void verifySDLoginPage(String uname,String upasswd) throws InterruptedException {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

		 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		 Thread.sleep(3000);
	  
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(upasswd);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='login-button']")).click();
		 Thread.sleep(3000);
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
	@AfterMethod
		public void tearDown() {
			driver.close();
		}
		
}