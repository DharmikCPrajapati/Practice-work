package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//div[@class='_6lux']//input)[1]")).sendKeys("swjqbdjqw");
		
		driver.findElement(By.xpath("//input [@type='password' and @class='inputtext _55r1 _6luy _9npi']")).sendKeys("jnwjcnndw");
		
		////input [@type='password' or@class='nputtext _55r1 _6luy _9npi'] = xpath for password box= i is missing in attribute class
		
		driver.findElement(By.xpath("//a [@data-testid='open-registration-form-button']")).click();
		
		// For password more then one matching note practice (//div [@class='_6lux'])[2]   need to have  () and then [1 or 2]
		
	}

}
