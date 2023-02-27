package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\Dharmik Prajapati\\Downloads\\eclipse\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(); // Open FireFox, Constructor
		driver.get("https://echoecho.com/javascript4.htm");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("B3")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.sendKeys("JAi Hind");
		
	   Thread.sleep(3000);
	   
	   
		al.accept();// To hit the selected botton

		
		
		
		
		//al.dismiss(); // To hit the not selected botton
		
		
		
		
		

	}

}
