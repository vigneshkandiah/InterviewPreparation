package SeleniumInterviewQuestions;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeBrowser {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		//		ChromeOptions chromeOptions = new ChromeOptions();
		//		chromeOptions.addArguments("--kiosk"); 3. ChromeOptions // for MAC

		//		ChromeOptions chromeOptions = new ChromeOptions();
		//		chromeOptions.addArguments("--start-maximized");  // for windows

		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		//		driver.navigate().to("http://leafground.com/pages/Link.html");
		//		driver.manage().window().maximize(); 1. Selenium in build

		//		Dimension dimesnsion = new Dimension(800,500);
		//		
		//		driver.manage().window().setSize(dimesnsion);  2. setSize();

		WebElement homepage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		homepage.click();

	}
}
