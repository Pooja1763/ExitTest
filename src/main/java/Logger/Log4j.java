package Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
	public static boolean root =false;
	public static Logger getLogger(Class cl) {
		if(root) {
			return Logger.getLogger(cl);
		}
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/resources/Properties/log4j.properties");
		root=true;
		return Logger.getLogger(cl);
		
	}


}
