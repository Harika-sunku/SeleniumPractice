package PomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://askomdch.com/store");
		StorePage sp=new StorePage();
		sp.Additemtocart(driver);
		CartPage cp=new CartPage();
		cp.Checkout(driver);
		CheckoutPage bp=new CheckoutPage();
		bp.Billingdetails(driver);
		driver.quit();
		
		
	}

}
