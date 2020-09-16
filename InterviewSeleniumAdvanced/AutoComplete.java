package InterviewSeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("tags"));
		
		element.sendKeys("S");
		Thread.sleep(3000); // we can use Explicit wait or Implicit wait
		
		
		List<WebElement> lielements = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		for (WebElement each : lielements) {
			
			if (each.getText().equals("Web Services")) {
				
				each.click();
				
				System.out.println(each.getText());
				
				//break;
			}else {
				
				System.out.println(each.getText());
			}
			
		}
		
		

}
}
