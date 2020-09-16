package InterviewSeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		
		WebElement datepicker= driver.findElement(By.id("datepicker"));
		
		datepicker.click();
		//datepicker.sendKeys("09/10/2019",Keys.ENTER);
		
		WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		next.click();
		
		WebElement tenthday = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		
		tenthday.click();
	}

}
