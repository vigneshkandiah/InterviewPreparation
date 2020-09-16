package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	public static void main(String[] args) throws IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//		driver.get("http://leafground.com/pages/Link.html");
		driver.navigate().to("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();

		WebElement homepage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		homepage.click();
		
		Robot robot = new Robot();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		
		Rectangle rectangle = new Rectangle(screenSize);
		
		BufferedImage source = robot.createScreenCapture(rectangle);
		
		
		File destinationFile3= new File("./Screens/Robot.png");
		
		ImageIO.write(source, "png", destinationFile3);
		
		
		
		

//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//
//		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
//
//		File destinationfile = new File("./Screens/sample2.png");
//
//		FileHandler.copy(sourcefile, destinationfile);


		driver.navigate().back();
		driver.navigate().refresh();
//		TakesScreenshot screenshot1 = (TakesScreenshot) driver;
//
//		File sourcefile1 = screenshot1.getScreenshotAs(OutputType.FILE);
//
//		File destinationfile1 = new File("./Screens/sample1.png");
//
//		FileHandler.copy(sourcefile1, destinationfile1);
		
		Robot robot1 = new Robot();
		
		Dimension screenSize2 = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rectangle1 = new Rectangle(screenSize2);
		
		
		BufferedImage Source1 = robot.createScreenCapture(rectangle1);
		
		File destinationFile1 = new File("./Screens/robot2.png");
		
		ImageIO.write(Source1, "png", destinationFile1);
		
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("./Screens/practise.png");
		
		FileHandler.copy(sourcefile, dest);
		
		
			
			
		
		
		
		
		
		
		
		
		
		driver.navigate().forward();

	}
}
