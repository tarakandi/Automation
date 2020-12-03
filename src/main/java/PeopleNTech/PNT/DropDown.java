package PeopleNTech.PNT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/omarfaroque/eclipse-workspace/PNT/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement createAcc = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		createAcc.click();
		Thread.sleep(2000);
		
		//Select Birth Month
		WebElement birthMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select bm = new Select(birthMonth);
		bm.selectByValue("10");
		
		//Select Birth Date
		WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
		Select bd = new Select(birthDay);
		bd.selectByValue("31");
		
		//Select M/F
		
		WebElement female = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		female.click();
		
		Thread.sleep(4000);
		driver.quit();

	}

}
