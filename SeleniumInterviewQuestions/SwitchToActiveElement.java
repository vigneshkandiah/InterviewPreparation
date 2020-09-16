package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchToActiveElement {
	public static WebElement q;
	public static void main(String[] args) throws  InterruptedException, AWTException {
		   // set the path of the chromDriver in system varibale path and Re-start the system then skip the system.setproperty
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				PageFactory.initElements(driver, SwitchToActiveElement.class);
				q.sendKeys("Nilgiris \n");
				
			
				
				
				
	}

}
