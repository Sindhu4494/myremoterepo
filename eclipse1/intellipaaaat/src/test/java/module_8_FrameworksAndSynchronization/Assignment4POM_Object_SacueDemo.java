package module_8_FrameworksAndSynchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment4POM_Object_SacueDemo {
 
	 static WebDriver driver;
	 By userName=By.xpath("//input[@id='user-name']");
	 By password=By.xpath("//input[@id='password']");
	 By loginButton=By.xpath("//input[@id='login-button']");
	 By plainTextProduct=By.xpath("//span[text()='Products']");
	 By backPackLink=By.xpath("//div[text()='Sauce Labs Backpack']");
	 By plainTextBackPack=By.xpath("//div[contains(text(),'carry.allTheThing')]");
	 By addToCart=By.xpath("//button[@name='add-to-cart']"); 
	 By cartLink=By.xpath("//a[@class='shopping_cart_link']");
	 By cartLinkTextProduct=By.xpath("//span[text()='Your Cart']");
	 By checkoutButton=By.xpath("//button[text()='Checkout']");
	
	 
	
	 public Assignment4POM_Object_SacueDemo(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	 public void type_username(String uname) throws InterruptedException {
		 driver.findElement(userName).sendKeys(uname);
		 Thread.sleep(3000);
	  }
	 public void type_password(String upaswd) throws InterruptedException {
		 driver.findElement(password).sendKeys(upaswd);
		 Thread.sleep(3000);
	  }
	 public void click_login() throws InterruptedException {
		 driver.findElement(loginButton).click();
		 Thread.sleep(3000);
	  }
	 public String Verify_productPage() throws InterruptedException {
		 driver.findElement(plainTextProduct).getText();
		 Thread.sleep(3000);
		return null;
	  }
	 
	 public void click_backpackLink() throws InterruptedException {
		 driver.findElement(backPackLink).click();
		 Thread.sleep(3000);
	  }
	 public String Verify_productBackPAckPage() throws InterruptedException {
		 driver.findElement(plainTextBackPack).getText();
		 Thread.sleep(3000);
		return null;
	  }
	 public void addToCartLink() throws InterruptedException {
		 driver.findElement(addToCart).click();
		 Thread.sleep(3000);
		
	  }
	 public void click_cartLink() throws InterruptedException {
		 driver.findElement(cartLink).click();
		 Thread.sleep(3000);
	  }

	 public String Verify_cartLinkTextProduct() throws InterruptedException {
		 driver.findElement(cartLinkTextProduct).getText();
		 Thread.sleep(3000);
		return null;
	  }

	 public void click_checkoutButton() throws InterruptedException {
		 driver.findElement(checkoutButton).click();
	
		 Thread.sleep(3000); 
	 }



	
}




















