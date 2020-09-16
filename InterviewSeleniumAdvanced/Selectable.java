package InterviewSeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.api.robot.Key;

public class Selectable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		
		
		List<WebElement> lielements = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
		int size = lielements.size();
		
		System.out.println(size);
		
		
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.CONTROL)
		.click(lielements.get(0))
		.click(lielements.get(2))
		.click(lielements.get(4))
		
		
		.build()
		.perform();
		
		
		
	}

}
