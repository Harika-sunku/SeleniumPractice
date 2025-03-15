package PomPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StorePage   {
	
	WebDriver driver;
	
	public void Additemtocart(WebDriver driver) throws InterruptedException
	{
	
	By addTocart= By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
	driver.findElement(addTocart).click();
	By viewcart= By.cssSelector("a[class=\"added_to_cart wc-forward\"]");
	Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	wait.until(ExpectedConditions.visibilityOfElementLocated(viewcart));
	
	driver.findElement(viewcart).click();
	}

}
