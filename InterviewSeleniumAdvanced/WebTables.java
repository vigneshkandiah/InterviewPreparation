package InterviewSeleniumAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		
		int columnscount = columns.size();
		System.out.println("The Column Size :" + columnscount);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		int rowcount = rows.size();
		
		System.out.println("The Number of Rows :" + rowcount);
		
		WebElement getPercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		
		String text = getPercent.getText();
		
		System.out.println("Learn to interact with Elements: "+text);
		
		List<WebElement> allprogress= driver.findElements(By.xpath("//td[2]"));
		
		
			
			
			List<Integer> numberList= new ArrayList<Integer>();
			
			for (WebElement eachProgress : allprogress) {
				String individualvalue =eachProgress.getText().replace("%", "");
				
				
				numberList.add(Integer.parseInt(individualvalue));
			
			
			
		}
		
			System.out.println(numberList);
		
		Integer min = Collections.min(numberList);
		
		
		String smallValueString=Integer.toString(min)+"%";
		
		String finalxpath="//td[normalize-space()='"+smallValueString+"']"+"//following::td[1]//input";
		
		System.out.println(finalxpath);
		
		
		 driver.findElement(By.xpath(finalxpath)).click();
		
		
		
		
		

}
	
}
