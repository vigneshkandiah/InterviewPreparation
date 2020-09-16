package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendInputWithOutSendKeys {
	
	public static void main(String[] args) throws  InterruptedException, AWTException {
		   // set the path of the chromDriver in system varibale path and Re-start the system then skip the system.setproperty
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				
				WebElement element = driver.findElement(By.name("q"));
				//1.Using Javascript
//				JavascriptExecutor executor = (JavascriptExecutor) driver;
//				
//				executor.executeScript("document.getElementsByName('q')[0].value='Nilgiris'", "");
//				
//				driver.findElement(By.name("q"));
				
				//2.Using Javascript using WEbElement
//				JavascriptExecutor executor = (JavascriptExecutor) driver;
//				executor.executeScript("arguments[0].value='Nilgiris'", element);
				
				//3.Using Robot Class
				
//				WebElement activeElement = driver.switchTo().activeElement();
//				
//				Robot robot = new Robot();
//				
//				robot.keyPress(KeyEvent.VK_V);
//				robot.keyRelease(KeyEvent.VK_V);
				
				
				
				
				
				
				JavascriptExecutor executor2 =  (JavascriptExecutor) driver;
					
				executor2.executeScript("arguments[0].value='VigneshKandiah'", element);
}
}
