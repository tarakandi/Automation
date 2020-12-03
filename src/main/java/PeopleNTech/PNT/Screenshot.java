package PeopleNTech.PNT;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/omarfaroque/eclipse-workspace/PNT/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("title");
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		
	}

}
