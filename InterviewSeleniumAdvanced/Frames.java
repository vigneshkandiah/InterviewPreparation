package InterviewSeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.id("wrapframe"));
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		String text = driver.findElement(By.id("Click")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		String text2 = driver.findElement(By.id("Click1")).getText();
		
		System.out.println(text2);
		
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		
	int size = totalFrames.size();
	
	System.out.println(size);
	
	
		
		

}
}