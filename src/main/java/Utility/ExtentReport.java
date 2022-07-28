package Utility;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
public class ExtentReport {
	
		 private static ExtentReports extent;
	     
			public static ExtentReports getInstance(String fileName)
			{
				if(extent ==null) {
					extent =new ExtentReports(fileName, true,DisplayOrder.NEWEST_FIRST);
					//extent.loadConfig(new File(System.getProperty("user.dir") + "//reportConfig.xml"));
				    extent.addSystemInfo("Appium","Cucumber").addSystemInfo("Environment","QA");
				    }
				return extent;
			}

	}


