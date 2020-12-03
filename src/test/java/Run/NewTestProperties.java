package Run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class NewTestProperties {
  @Test
  public void f() throws IOException 
  {
	  Properties pro = new Properties();
	  FileInputStream ds = new FileInputStream("/Users/omarfaroque/eclipse-workspace/PNT/Config.properties");
	  pro.load(ds);
	  System.out.println(pro.getProperty("firstName"));
  }
}
