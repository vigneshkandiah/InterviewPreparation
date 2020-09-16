package SeleniumInterviewQuestions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopUp {
	
	public static void main(String[] args) throws AWTException {
		   // set the path of the chromDriver in system varibale path and Re-start the system then skip the system.setproperty
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");//Passing username and password with url
				driver.manage().window().maximize();
                 // we can do this using tools like sikuli and AutoIT

		}

}
