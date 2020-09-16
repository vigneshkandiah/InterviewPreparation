package interviewSeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		String attribute = driver.findElement(By.partialLinkText("supposed")).getAttribute("href");
		
		System.out.println(attribute);
//		driver.findElement(By.xpath("//a[contains(text(),'Go')]")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

}
