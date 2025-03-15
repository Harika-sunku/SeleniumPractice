package PomPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckoutPage  {

	
	WebDriver driver;
		
		public void Billingdetails(WebDriver driver)
		{
			
			driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("H");
			driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("S");
			driver.findElement(By.cssSelector("input[name=billing_address_1]")).sendKeys("DNM");
			driver.findElement(By.cssSelector("input[name=billing_city]")).sendKeys("XYZ");
			
			driver.findElement(By.cssSelector("input[name=billing_postcode]")).sendKeys("12345");
			driver.findElement(By.cssSelector("input[name=billing_email]")).sendKeys("XYZ@gmail.com");
			//driver.findElement(By.cssSelector("#payment_method_cod")).click();
			driver.findElement(By.cssSelector("#place_order")).click();
			
			
			
		}

	}


