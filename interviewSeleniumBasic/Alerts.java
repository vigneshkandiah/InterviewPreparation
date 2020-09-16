package interviewSeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.sendKeys("Hello Vicky");
		Thread.sleep(4000);
		alert.accept();
		
		

}
}
