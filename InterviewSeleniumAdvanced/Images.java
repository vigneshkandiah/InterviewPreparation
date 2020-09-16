package InterviewSeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		WebElement firstImage= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		
        firstImage.click();
		
		
		driver.findElement(By.xpath("//h5[text()='Image']/following-sibling::img")).click();
        
        WebElement brokenImage= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
        
        if (brokenImage.getAttribute("naturalWidth").equals("0")){
        	
        	System.out.println("The Image is Broken");
        }
        else {
        	
        	System.out.println("The Image is Not Broken");
        	
        }
}

}