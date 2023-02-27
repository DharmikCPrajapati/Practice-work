package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.linkText("How Search works"	)).click();
		
		driver.findElement(By.partialLinkText("How Search")).click();
		
		
	}

}
