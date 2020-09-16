package interviewSeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
	 boolean checkbox = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
   System.out.println(checkbox);
   
   
   boolean selected = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input")).isSelected();
   
   if (selected ==true) {
	   
	   driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input")).click();
	   
   }
   boolean selected1 = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).isSelected();
   if(selected1==true) {
	   driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();
   }
   
   
   driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input")).click();
   
   driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]")).click();
   
   driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[3]")).click();
   driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[4]")).click();
   
   driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[5]")).click();
}

}