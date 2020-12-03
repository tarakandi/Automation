package PeopleNTech.PNT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/omarfaroque/eclipse-workspace/PNT/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"u_1_s\"]")).click();
	}

}
