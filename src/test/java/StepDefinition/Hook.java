package StepDefinition;

import java.io.File;




import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;


import Base.Test;

import Utility.Capability;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;


public class Hook extends Test{
	
	public Scenario scenario;
	
	@Before
	public void launch() throws IOException{
		

		 Capability cap= new Capability();
		 cap.loadConfig();
		
		 cap.setAndroidCapabilities();
		
	     driver =cap.getandroidDriver();
	
	}
		
	@After(order=2)
	public void afterScenario(Scenario scenario)
	
	{
		
		
	
		driver.quit();
	}

}
