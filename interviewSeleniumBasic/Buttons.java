package interviewSeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//button[contains(text(),'Go to')]")).click();
//		
		Thread.sleep(3000);
		
		Point location = driver.findElement(By.id("position")).getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		System.out.println(x +"-----"+y);
		
		
		
		String cssValue = driver.findElement(By.xpath("//button[contains(text(),'What')]")).getCssValue("background-color");
		
		System.out.println(cssValue);
		
		Dimension size = driver.findElement(By.xpath("//button[contains(text(),'What is my size?')]")).getSize();
		
		System.out.println(size);
	}

}
