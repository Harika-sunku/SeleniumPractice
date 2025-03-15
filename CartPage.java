package PomPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage  {

	WebDriver driver;
	
	public void Checkout(WebDriver driver)
	{
		By Checkout=By.cssSelector(".checkout-button");
		driver.findElement(Checkout).click();
	}
		

	}


