package InterviewSeleniumAdvanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		driver.manage().window().maximize();
		
		WebElement download = driver.findElement(By.xpath("//div[@class='todo']//a[1]"));
		
		download.click();
		
		Thread.sleep(4000);
		
		///Users/vigneshk/Downloads
		
		File filelocation = new File("/Users/vigneshk/Downloads");
		File[] downloadfiles = filelocation.listFiles();
		
		for (File eachFile : downloadfiles) {
			
			if(eachFile.getName().equals("testleaf.xslx")){
			System.out.println("The File Is downloaded in Downloads path");
			break;
			}
			
			
			
		else {
			
			System.out.println(eachFile.getName());
		}
		
		}
	}
}
		
		



