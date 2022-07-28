package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import Base.BaseClass;
import Base.Test;
import Logger.Log4j;
import Pages.App;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppFeature extends Test{
	App a =new App();
	BaseClass BS= new BaseClass();
	Logger log =Log4j.getLogger(Log4j.class);
	
	@Given("^Tap on the app button$")
	public void tap_on_the_app_button() throws Throwable {
	   a.clickonapp();
	   log.info("Click on the APP");
	}

	@When("^click on the fragment$")
	public void click_on_the_fragment() throws Throwable {
		a.Fragment();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BS.verticleScrollbypercentage(0.100, 0.10, 0.50);
	    log.info("Tap on the Fragment button");
	}

	@When("^Click on nested and stack$")
	public void click_on_nested_and_stack() throws Throwable {
		a.clickonnested();
		a.Stack();
		log.info("tap on the nested and stack button");
		log.info(a);
	  
	}

	@When("^click on the push button$")
	public void click_on_the_push_button() throws Throwable {
	   a.Push();
	   log.info("Click on Push Button");
	   
	}

	@When("^tap on tabs and click on get result$")
	public void tap_on_tabs_and_click_on_get_result() throws Throwable {
	 a.Tabs();
	 a.getResult();
	 log.info("Click on tab button");
	 log.info("Click on get result");
	}

	@Then("^Click on the pick result$")
	public void click_on_the_pick_result() throws Throwable {
	   a.PickResult();
	   log.info("Pick result");
	   Thread.sleep(1000);
	}
}
