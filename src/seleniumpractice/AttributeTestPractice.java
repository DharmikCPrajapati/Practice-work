package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTestPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(3000);
		
		String p = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(p);
		
	    driver.findElement(By.id("gh-ac")).sendKeys("Iphhone");
	    
	    
	    String s =  driver.findElement(By.id("gh-ac")).getAttribute("value"); // V has to be small letter not capital
	    
	    System.out.println(s);
	}

}
