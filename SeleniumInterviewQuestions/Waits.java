package SeleniumInterviewQuestions;

import java.time.Duration;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//Implicitly Wait (Method Chaining)
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vigneshkandiah@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password@1");
		driver.findElement(By.xpath("//button[text()='Login']")).click();


        //Explicit wait 
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement element = driver.findElement(By.xpath("(//li[@class='nav-item']//a)[2]"));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='nav-item']//a)[2]"))).click();

		//Fluentwait
		
		Wait<WebDriver> wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement profile = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//a[@href='#profile']"));
			}
		});
		
		profile.click();
		
		
		
//		Wait<WebDriver>  wait1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
//		
//		wait.until(new Function<WebDriver, WebElement>(){
//
//			public WebElement apply(WebDriver t) {
//				// TODO Auto-generated method stub
//				return t.findElement(By.xpath(""));
//			}
//			
//		});
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
