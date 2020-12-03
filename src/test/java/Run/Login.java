package Run;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Codetostar.Usability;
import Pages.Facebook.LoginPage;
import Pages.Facebook.SignUpPage;

public class Login extends Usability {
	
 @Test(priority = 2, groups = {"Adhoc"})
  public void login() throws InterruptedException, IOException {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  LoginPage lp = new LoginPage(driver);
	  Properties pro = new Properties();
	  FileInputStream ds = new FileInputStream("/Users/omarfaroque/eclipse-workspace/PNT/Config.properties");
	  pro.load(ds);
	  lp.enterUserPass(pro.getProperty("email"), pro.getProperty("password"));
	  //lp.clickLogin();
	  Thread.sleep(3000);
  }
  
  @Test(priority = 1, groups = {"Adhoc", "Regression"})
  public void signup() throws InterruptedException
  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 LoginPage lp = new LoginPage(driver);
	 lp.clickNewAccount();
	 Thread.sleep(2000);
	 SignUpPage sp = new SignUpPage(driver);
	 sp.enterData("Omar", "Faroque");
	 sp.clickX();
	 Thread.sleep(2000);
  }
 
}
