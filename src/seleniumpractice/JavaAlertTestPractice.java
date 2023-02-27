package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlertTestPractice {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
		driver.get("https://echoecho.com/javascript4.htm");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("B2")).click();
		
	Thread.sleep(2000);
	
	Alert ab = driver.switchTo().alert();
	
	ab.accept();

	}

}
