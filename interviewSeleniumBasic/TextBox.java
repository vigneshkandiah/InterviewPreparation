package interviewSeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("vigneshkandiah@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(" Text");
		
		String text = driver.findElement(By.name("username")).getAttribute("value");
		
		System.out.println(text);
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		
		System.out.println(enabled);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
	}
	

}
