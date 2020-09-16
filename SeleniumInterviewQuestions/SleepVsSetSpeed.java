package SeleniumInterviewQuestions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepVsSetSpeed {
	
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();

		WebElement homepage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		homepage.click();

}
	
}
