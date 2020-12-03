package Run;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logges {
	public static Logger lg = Logger.getLogger(logges.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("/Users/omarfaroque/eclipse-workspace/PNT/log.properties");
		lg.info("Our first Log");
		lg.info("Omar");

	}

}
