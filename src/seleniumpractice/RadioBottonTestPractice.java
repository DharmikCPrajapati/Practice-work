package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBottonTestPractice {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
		driver.get("https://echoecho.com/htmlforms10.htm");
		Thread.sleep(2000);
		
		List<WebElement> radio = driver.findElements(By.name("group1"));
		
		System.out.println(radio.size());

		for (int i=0; i<radio.size(); i++ ) {
			System.out.println(radio.get(i).getAttribute("value"));
		}
		
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
	}

}
