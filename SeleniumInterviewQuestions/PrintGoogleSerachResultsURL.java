package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGoogleSerachResultsURL {
	
	public static void main(String[] args) throws  InterruptedException {
		   // set the path of the chromDriver in system varibale path and Re-start the system then skip the system.setproperty
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				
				driver.findElement(By.name("q")).sendKeys("V");
				
				Thread.sleep(2000);
				List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
				
				
				for (WebElement each : suggestions) {
					
					String text = each.getText();
					
					
					
					if(text.contains("vid")) {
						
						each.click();
						break;
						
					}
					
					
				}
				
				//1 .Printing  All URLS 
//				List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
//				
//				
//				for (WebElement each : totalLinks) {
//					
//					System.out.println(each.getAttribute("href"));
//					
//				}
				
				//2.Fetch only main links
				List<WebElement> totalLinks = driver.findElements(By.xpath("//*[@id='search']//h3//following::div/cite"));
				
				
				for (WebElement each : totalLinks) {
					
					System.out.println(each.getText());
					
				}	

}
}
