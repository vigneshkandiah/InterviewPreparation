package InterviewSeleniumAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		
		
		
		
	    WebElement from = elements.get(6);
	    
	    WebElement to = elements.get(0);
	    
	    Actions actions = new Actions(driver);
	    
	    actions.clickAndHold(from);
	    actions.moveToElement(to);
	    actions.release();
	    actions.build().perform();
		

		
		
	}

}
