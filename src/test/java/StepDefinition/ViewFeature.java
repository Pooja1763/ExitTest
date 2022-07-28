package StepDefinition;

import org.apache.log4j.Logger;

import Base.Test;
import Logger.Log4j;
import Pages.View;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ViewFeature extends Test{
	Logger log =Log4j.getLogger(Log4j.class);
	View V=new View();

@Given("^Tap on the View$")
public void tap_on_the_View() throws Throwable {
	V.Clickonview();
	log.info("click on view button");
	//V.Clickonanimation();

}
@When("^click on animation$")
public void click_on_animation() throws Throwable {
	V.Clickonanimation();
	log.info("Click on the animation button");
}


@When("^click on (\\d+)d transition$")
public void click_on_d_transition(int arg1) throws Throwable {
    V.Clickon3d();
    Thread.sleep(1000);
    log.info("click on the 3d transition");
}

@When("^click on image name$")
public void click_on_image_name() throws Throwable {
	V.Clickonimage();
	log.info("Click on the image name");
	Thread.sleep(2000);
  
}

@Then("^Click on image$")
public void click_on_image() throws Throwable {
 V.Image();
 log.info("click on the image");
}
}
