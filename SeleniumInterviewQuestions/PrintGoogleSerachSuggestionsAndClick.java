package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGoogleSerachSuggestionsAndClick {
	
	public static void main(String[] args) throws  InterruptedException {
		   // set the path of the chromDriver in system varibale path and Re-start the system then skip the system.setproperty
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				
				driver.findElement(By.name("q")).sendKeys("V");
				
				Thread.sleep(2000);
				List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
				
//				//1. clicking third element
//				int position=0;
//				for (WebElement each : suggestions) {
//					
//					System.out.println(each.getText());
//					
//					position++;
//					
//					if(position==3) {
//						
//						each.click();
//						break;
//						
//					}
//					
//					
//				}
				
//				WebElement webElement = suggestions.get(1);
//				
//				webElement.click();
				
				 
//				suggestions.get(1).getText();
				
				
				
				for (WebElement each : suggestions) {
					
					String text = each.getText();
					
					
					
					if(text.contains("vid")) {
						
						each.click();
						break;
						
					}
					
					
				}
				

}
}
