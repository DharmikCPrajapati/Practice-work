package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTestPractice {

	public static void main(String[] args) throws InterruptedException {
		

System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("fihwefbwjhbfjhbwje");
		
		driver.findElement(By.name("pass")).sendKeys("gvhsavcyucvbyugyuc");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		String expact = "The email address or mobil number you entered isn't connected to an account. Find your account and log in.";
		
		String result = driver.findElement(By.className("_9ay7")).getText();
		
		System.out.println(result);
		
		if (expact.equals(result)) {
			
			System.out.println("Matched");
					
		}
		else {
			System.out.println("did not match");
		}
	}

}
