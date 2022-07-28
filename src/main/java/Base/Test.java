package Base;

import java.lang.reflect.Method;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class Test  {
	//public static String loadPropertyFile ="Excel.xlsx";
	public static AppiumDriverLocalService service;
	public static Logger log =Logger.getLogger("Logger");
     public static AppiumDriver<MobileElement> driver=null ;
     public static ExtentReports extent;
     public static ExtentTest test;
   
     
}
