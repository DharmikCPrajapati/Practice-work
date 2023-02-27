package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTestpractice {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-email")).sendKeys("cdchjwdcbjhw@cdsvv.com");
		
		driver.findElement(By.id("login-password")).sendKeys("diwhdbjwd");
		
		driver.findElement(By.id("login-password")).sendKeys(Keys.ENTER);
		
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		String Expacted = "Your request timed out – please retry";
		
		String Actual = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		
		////div[@data-auto-id='login-error-message' and @class='errorMessage___2sHhm gl-form-hint gl-form-hint--error']
		
		System.out.println(Actual);
		
		if(Expacted.equals(Actual)){
			System.out.println("Test Pass");}
			else {
				System.out.println("Fail");
				
			}
		}
				
				
			
		
		
		
		

	}


