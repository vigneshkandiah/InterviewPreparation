package interviewSeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		Select obj = new Select(driver.findElement(By.id("dropdown1")));
		
		obj.selectByIndex(1);
		
		Select obj1 = new Select(driver.findElement(By.name("dropdown2")));
         obj1.selectByVisibleText("Appium");
		
		
		
		Select obj3 = new Select(driver.findElement(By.id("dropdown3")));
        obj3.selectByValue("3");
		
		Thread.sleep(3000);
		
		
		
		Select obj4 = new Select(driver.findElement(By.id("dropdown3")));
		List<WebElement> options = obj4.getOptions();
		for (WebElement each : options) {
			
			System.out.println(each.getText());
			
		}
		int size = options.size();
		
		System.out.println(size);
		
		
		
		WebElement dropdown = driver.findElement(By.id("dropdown3"));
		
		dropdown.sendKeys("Loadrunner");
		
		
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		
		Select multiselectbox= new Select(multiselect);
		
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);
	}

}
