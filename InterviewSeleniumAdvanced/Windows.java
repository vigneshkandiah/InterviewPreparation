package InterviewSeleniumAdvanced;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();

		Set<String> windows = driver.getWindowHandles();

		for (String newWindow : windows) {

			driver.switchTo().window(newWindow);


		}

		driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image']")).click();
		driver.close();

		driver.switchTo().window(parentWindow);

		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		ArrayList<String> lis = new ArrayList<String>(windowHandles);
		for (String allwindows : lis) {

			if (!allwindows.equals(parentWindow)) {
				driver.switchTo().window(allwindows).close();
			}

		}


		//		System.out.println(windowHandles.size());
		//		
		//		driver.switchTo().window(lis.get(1)).close();
		//		
		//		driver.switchTo().window(lis.get(2)).close();
		//		
		//		driver.switchTo().defaultContent();
		//		
		//		driver.switchTo().window(parentWindow).close();

		driver.switchTo().window(parentWindow);

		driver.findElement(By.xpath("(//button[@id='color'])[2]")).click();

		driver.quit();


	}
}
