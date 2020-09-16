package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebpage {
	
	public static void main(String[] args) throws  InterruptedException, AWTException {
		   // set the path of the chromDriver in system varibale path and Re-start the system then skip the system.setproperty
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				
				driver.findElement(By.name("q")).sendKeys("Nilgiris \n");
				
				
				//1. scroll to some position down and Up
				
//				JavascriptExecutor executor = (JavascriptExecutor) driver;
//				executor.executeScript("window.scroll(0,450)", "");
//				
//				Thread.sleep(4000);
//				
//				executor.executeScript("window.scroll(0,-450)", "");
				
				//2. Scroll to the Bottom of the page and Scroll to top of the Page
				
				
//				JavascriptExecutor executor = (JavascriptExecutor) driver;
//			    executor.executeScript("window.scroll(0,document.body.scrollHeight)", "");
//			    Thread.sleep(4000);
//			    executor.executeScript("window.scrollTo(0,0)", "");
				
				
				//3.Go to Specific Element of the Page
				
//				WebElement element= driver.findElement(By.xpath("//div[text()='Q&A on Google']"));
//				
//				JavascriptExecutor executor = (JavascriptExecutor) driver;
//                executor.executeScript("arguments[0].scrollIntoView(true);", element);
				
				
				//4.Using Robot Class:
				
				Robot robot = new Robot ();
				
				
				
				Thread.sleep(5000);
				
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(5000);
				robot.keyPress(KeyEvent.VK_PAGE_UP);
				robot.keyRelease(KeyEvent.VK_PAGE_UP);
				
				
				

}
	
}
