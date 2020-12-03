package Run;

import org.testng.annotations.Test;

public class GroupTest 
{
	@Test(groups = {"Smoke"}) 
	public void f() { 
	System.out.println("smoke test with f"); 
	} 
	
	@Test(groups = {"Adhoc","Regression"}) 
	public void f2() { 
	System.out.println("Adhoc or regression with f2"); 
	} 
	
	@Test(groups = {"Regression"}) 
	public void f6() { 
	System.out.println("regression with f6"); 
	} 
	
	@Test(groups = {"Smoke","Adhoc"}) 
	public void f9() { 
	System.out.println("smoke or Adhoc with f9"); 
	} 
	
	@Test(groups = {"Adhoc"}) 
	public void f0() { 
	System.out.println("Adhoc with f0"); 
	} 
	
	@Test(groups = {"Regression"}) 
	public void f666() { 
	System.out.println("regression sith f666"); 
	} 
}
