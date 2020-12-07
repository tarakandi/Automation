package Codetostar;


import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.taskdefs.optional.depend.ClassFileUtils;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Usability {
	public static WebDriver driver;
	static String dir = System.getProperty("user.dir");
  
  @Parameters({"browser", "URL"})
  @BeforeClass
	public void loadDriver(String BrowserName, String URL)
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
	
	@AfterClass(groups = {"Adhoc", "Regression"})
	public void quitDriver()
	{
		driver.quit();
	}
	
	public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destinationFile= new File(dir+"/reports/"+testCaseName+".png");
		FileHandler.copy(source, destinationFile);
	}
}
