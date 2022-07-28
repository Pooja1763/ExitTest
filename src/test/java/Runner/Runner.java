package Runner;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.AppiumServer;
import Utility.ExtentReport;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


@CucumberOptions(
		features={"src/test/java/Feature"},
        glue={"StepDefinition"},
       tags= ("@tag"),
      plugin= {"pretty","html:HTML_Reports" ,
    	    			 "json:JSON_Reports/cucumber.json" , 
    	    	"junit:JUNIT_Reports/cucumber.xml"}
		 )

@Test
public class Runner extends AbstractTestNGCucumberTests{
 public static AppiumDriver<MobileElement> driver;
 
 public static ExtentReports extent;
 public static ExtentTest test;
 

 @BeforeSuite
 public void setUp() throws IOException{
	 AppiumServer.Start();
	 extent=ExtentReport.getInstance("reports/ExtentReports.html");
	 }
 @BeforeMethod
 public void startTest(Method method) {
	 test=extent.startTest(method.getName());
 }
// public static String getScreenshot(AppiumDriver<MobileElement> driver, String screenshotName) throws IOException{
//		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		// after execution, you could see a folder "FailedTestsScreenshots"
//		// under src folder
//		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
//				+ ".png";
//		File finalDestination = new File(destination);
//		FileUtils.copyFile(source, finalDestination);
//		return destination;
//	}
 @AfterMethod
 public void reportFlush(ITestResult result) throws IOException {
	 System.out.println(result.getMethod().getMethodName());
	 if(result.getStatus() ==ITestResult.FAILURE)
		 test.log(LogStatus.FAIL, result.getThrowable());
	 else if(result.getStatus() ==ITestResult.SKIP)
		 test.log(LogStatus.SKIP, result.getThrowable());
	 else
		 test.log(LogStatus.PASS, "Test Passed");
	 extent.flush();


	 
	 
 }
 
 @AfterSuite
public void tearDown() {
	 AppiumServer.stop();
}
}