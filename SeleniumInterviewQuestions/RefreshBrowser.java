package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.varia.ReloadingPropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import gherkin.ast.Location;

public class RefreshBrowser {
	
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
//		driver.navigate().to("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		WebElement homepage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		homepage.click();
		
//		driver.navigate().refresh();// 1. Refresh Command
		
		
//		driver.get(driver.getCurrentUrl()); //2. get CurrentUrl();
		
		
//		JavascriptExecutor  execute = (JavascriptExecutor) driver; //3.JavascriptExecutor
//		
//		execute.executeScript("location.reload()");  // history.go(0);
		
		
		
//		Robot robot = new Robot(); // 4. Using Robot Class
//		
//		
//		robot.keyPress(KeyEvent.VK_F5);
//		robot.keyRelease(KeyEvent.VK_F5);
		
		driver.findElement(By.xpath("q")).sendKeys(Keys.F5);//5.  Using Sendkeys
		
		
//		Different ways to refresh a browser:
//			--------------------------------------------------------
//			1. Refresh command
//			2. driver.getCurrentUrl()
//			3. Javascript Executor: location.reload() or history.go(0)
//			4. Robot class f5
		
		
	}

}
