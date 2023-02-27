package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestPractice {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
		driver.get("https://www.ebay.ca/");
		Thread.sleep(2000);
		
		
		List<WebElement> drop = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		System.out.println(drop.size());
		
		for (int a = 0 ; a<drop.size(); a++) {
			System.out.println(drop.get(a).getText()+"----------"+drop.get(a).isSelected());
		}
		
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));  // Have to creat webelement for the select class and it has to be from the select mathod in html only 
		
		Select s = new Select(dropdown);  // Select is a inbuilt class in selenium to select from the drop down...
		
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		
		s.selectByValue("11116");
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Crafts");
		
        Thread.sleep(2000);
        
        System.out.println("--------After selection--------");
        
        
        
        for (int a= 0 ; a<drop.size();a++) {
        	System.out.println(drop.get(a).getText()+"---------"+drop.get(a).isSelected());
        	
        }
        
        
        
        
        
        
	}

}
