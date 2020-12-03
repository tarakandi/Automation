package PeopleNTech.PNT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointer 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/omarfaroque/eclipse-workspace/PNT/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		
		Actions amz = new Actions(driver);
		Thread.sleep(2000);
		amz.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		amz.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Music Library')]"))).click().build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}

}