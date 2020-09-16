package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffWaysToPressEnterKey {
	
	public static void main(String[] args) throws  InterruptedException, AWTException {
		   // set the path of the chromDriver in system varibale path and Re-start the system then skip the system.setproperty
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				//1.Keys.Enter
//				driver.findElement(By.name("q")).sendKeys("Nilgiris",Keys.ENTER);
				
				//2.Using submit();
//				WebElement element = driver.findElement(By.name("q"));
//				
//				element.sendKeys("Nilgiris");
//				element.submit();
				
				//3.Using Robot Class
				
//				WebElement element = driver.findElement(By.name("q"));
//			
//				element.sendKeys("Nilgiris");
//				
//				Robot robot = new Robot();
//				
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.keyRelease(KeyEvent.VK_ENTER);
				
				WebElement element = driver.findElement(By.name("q"));
			
					element.sendKeys("Nilgiris \n");
				
	}

}
