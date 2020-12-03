package Pages.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By LogButton = By.xpath("//button[@id='u_0_b']");
	
	By ForgotPass = By.xpath("//a[contains(text(),'Forgot Password?')]");
	By newAccount = By.xpath(" //a[@id='u_0_2']");
	
	public void enterUserPass(String username, String pass)
	{
		driver.findElement(email).sendKeys(username);
		driver.findElement(password).sendKeys(pass);
	
	}
	
	public void clickLogin()
	{
		driver.findElement(LogButton).click();
	}
	
	public void clickForgotPassword()
	{
		driver.findElement(ForgotPass).click();
	}
	
	public void clickNewAccount()
	{
		driver.findElement(newAccount).click();
	}
	
	
	

}