package StepDefinition;

import java.io.File;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import Base.Test;
import Logger.Log4j;
import Pages.Animation;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class AnimationFeature extends Test{
	
	Animation An= new Animation();
	Logger log =Log4j.getLogger(Log4j.class);

    @After(order=1)
	public void afterScenario(Scenario scenario)
	{
		if(scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll("", "_");
			try {
				TakesScreenshot t = driver;
				File sourcePath =t.getScreenshotAs(OutputType.FILE);
			     File destinationPath =new File(
			    		 System.getProperty("user.dir") + "/reports/Screenshot/" +screenshotName +".png");
			           Files.copy(sourcePath, destinationPath);
			           Reporter.addScreenCaptureFromPath(destinationPath.toString());
			}
			catch(IOException e) {

			}}}
		
		

@Given("^App is present$")
public void app_is_present() throws Throwable {

	 An.Base();
	 log.info("App is present in the device");
 
}




@When("^click on animation button$")
public void click_on_animation_button() throws Throwable {
	 An.anim();
	 log.info("Click on the animation Button");
   Thread.sleep(2000);
}

@When("^click on hide-show button$")
public void click_on_hide_show_button() throws Throwable {

 An.Hide();
 log.info("Click on the Hide Button");
  Thread.sleep(1000);
}
@When("^click on hide button and click on two$")
public void click_on_hide_button_and_click_on_two() throws Throwable {

	An.clickonhide();
	log.info("Click on the hide Button");
	Thread.sleep(1000);
	An.clickontwo();
	log.info("Click on the two Button");
	  
}

@Then("^click on show button$")
public void click_on_show_button() throws Throwable {

   An.showbutton();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  log.info("Click on the show Button");

}


}


