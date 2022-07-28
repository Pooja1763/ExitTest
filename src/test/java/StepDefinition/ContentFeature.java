package StepDefinition;

import org.apache.log4j.Logger;

import Base.Test;
import Logger.Log4j;
import Pages.Content;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContentFeature extends Test{
	Logger log =Log4j.getLogger(Log4j.class);
	Content con =new Content();
	@Given("^Tap on the content button$")
	public void tap_on_the_content_button() throws Throwable {
	   con.ClickonContent();
	   log.info("Click on the content");
	}

	@When("^click on the clipboard$")
	public void click_on_the_clipboard() throws Throwable {
		con.ClipBoard();
		log.info("tap on the clipboard");
	    
	}

	@When("^Tap on datatype$")
	public void tap_on_datatype() throws Throwable {
		con.Clickondata();
		log.info("tap on the datatype");
	   
	}

	@When("^Click on the clip$")
	public void click_on_the_clip() throws Throwable {
	   con.ClickonClip();
		log.info("click on the clip");
		Thread.sleep(1000);
	}

	@Then("^Result is shown$")
	public void result_is_shown() throws Throwable {
	   con.Clickontext();
		log.info("Result is displayed");
	}

}
