package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		//FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
WebDriver driver = new FirefoxDriver() ;


		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("djnjknjidciiciniunuinciu");
		driver.findElement(By.id("pass")).sendKeys("ddjsndcjnjincewijne");
		driver.findElement(By.name("login")).click();  

	}

}
