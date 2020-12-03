package Pages.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage 
{
public WebDriver driver;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By firstName = By.xpath("//input[@id='u_1_b']");
	By lastName = By.xpath("//input[@id='u_1_d']");
	By fGender = By.xpath("//label[contains(text(),'Female')]");
	
	By xButton = By.xpath("//div[@class='_8ien']/img");
	
	public void enterData(String fname, String lname)
	{
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
		driver.findElement(fGender).click();
	}
	
	public void clickX()
	{
		driver.findElement(xButton).click();
	}

}
