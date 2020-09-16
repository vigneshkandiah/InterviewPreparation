package InterviewSeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAdvanced {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		WebElement homepage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		homepage.click();
		driver.navigate().back();
		
        String attribute = driver.findElement(By.partialLinkText("supposed")).getAttribute("href");
		
		System.out.println(attribute);
		
		 WebElement attributeBroken = driver.findElement(By.partialLinkText("Verify"));
		 attributeBroken.click();
		 
		 String title = driver.getTitle();
		if ( title.contains("404")) {
			
			System.out.println("The Link is Broken");
			
		}
		
		driver.navigate().back();
		WebElement homepage1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		homepage1.click();
		
		
		
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		
		System.out.println(totallinks.size());
		
		
		
	}

}
