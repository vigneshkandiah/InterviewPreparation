package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyElementIsUnderLined {
	
	public static void main(String[] args) throws  InterruptedException {
		   
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				
				WebElement element= driver.findElement(By.linkText("தமிழ்"));
				
				String StringBeforeHovering = element.getCssValue("text-decoration");
				
				System.out.println(StringBeforeHovering);
				
				Actions actions = new Actions(driver);
				
				actions.moveToElement(element).perform();
				
				String StringAfterHovering = element.getCssValue("text-decoration");
				
				System.out.println(StringAfterHovering);
				
				
				
				
				
				
				
				

}
	
}
