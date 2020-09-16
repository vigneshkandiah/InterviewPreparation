package interviewSeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("no")).click();
		
		boolean Unchecked = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).isSelected();
		
		boolean checked = driver.findElement(By.xpath("(//input[@type='radio'])[4]")).isSelected();
		System.out.println(Unchecked+"------Radio Button Status---"+checked);
		
		
		boolean radio1 = driver.findElement(By.xpath("//input[@name='age']")).isSelected();
         
		boolean radio2 = driver.findElement(By.xpath("(//input[@name='age'])[2]")).isSelected();
		
		boolean radio3 = driver.findElement(By.xpath("(//input[@name='age'])[3]")).isSelected();
		
		if (radio1!=true && radio2!=true && radio3!=true) {
			
			driver.findElement(By.xpath("(//input[@name='age'])[1]")).click();
			
		}else {
			
			driver.close();
		}
		
}

}