package InterviewSeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
	
		String attribute = driver.findElement(By.id("age")).getAttribute("title");
		
		System.out.println(attribute);
		
		
		
	}
	
	

}
