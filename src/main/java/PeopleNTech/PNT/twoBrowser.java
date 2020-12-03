package PeopleNTech.PNT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class twoBrowser

{

	static WebDriver driver;
	static String dir = System.getProperty("user.dir");

	public static void main(String[] args) throws InterruptedException
	{
		switchBrowser("firefox", "http://www.facebook.com");
		
		WebElement sgnp = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		Boolean disp = sgnp.isDisplayed();
		
		System.out.println(disp);
		
		if (sgnp.getText().equalsIgnoreCase("Create New Account"))
		{
			sgnp.click();
			Thread.sleep(2000);
		}
		
		driver.close();
		
		switchBrowser("chrome", "http://www.amazon.com");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}
	
  
	public static void switchBrowser (String BrowserName, String URL)
	{
		if (BrowserName.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", dir+"/Driver/geckodriver");
			driver = new FirefoxDriver();

			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		else if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", dir+"/Driver/chromedriver");
			driver = new ChromeDriver();
			
			driver.get(URL);
			driver.manage().window().maximize();
		}
	}


}
