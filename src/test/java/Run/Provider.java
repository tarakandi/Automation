package Run;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Codetostar.Usability;
import Pages.Facebook.LoginPage;

public class Provider extends Usability
{
	@Test(dataProvider = "dp")
	public void f(String email, String pass) throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUserPass(email, pass);
		Thread.sleep(6000);
		lp.clickLogin();
		Thread.sleep(12000);
	}
	
	
  @DataProvider
  public Object[][] dp()
  {
	  return new Object[][]
			  {
		  		new Object[] {"omar08401@yahoo.com", "Omar"},
		  		new Object[] {"omar08000@yahoo.com", "Faroque"}
			  };
  }
}
