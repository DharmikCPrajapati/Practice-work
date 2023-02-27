package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresantTestPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		/* Unsig Web element we can not verify, element is present or not
		if (driver.findElement(By.linkText("About")).isDisplayed()) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Element not Present");
		}	
		
		*/
		
		List<WebElement> element = driver.findElements(By.linkText("odfjdfg"));
		
		System.out.println(element.size());
		
		if (element .size()>0) {
			System.out.println("Element is presant");
		}else
		{ System.out.println("Element is not Presant");
	}

	}
}