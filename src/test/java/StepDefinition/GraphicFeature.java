package StepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.touch.TouchActions;

import Base.BaseClass;
import Base.Test;
import Logger.Log4j;
import Pages.Graphics;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GraphicFeature extends Test {
	Logger log =Log4j.getLogger(Log4j.class);
    Graphics G =new Graphics();
    BaseClass B =new BaseClass();
   
    @Given("^Tap on the OS button$")
    public void tap_on_the_OS_button() throws Throwable {
       G.ClickonGraphics();
       log.info("OS Button ");
    }

    @When("^click on message$")
    public void click_on_message() throws Throwable {
       G.Message();
       log.info("click on the message");
       Thread.sleep(1000);
    }

    @When("^enter the receipient name \"([^\"]*)\"$")
    public void enter_the_receipient_name(String arg1) throws Throwable {
    	G.recipientname(arg1);
    	Thread.sleep(5000);
    	log.info("Enter the Receipient Name");
    	log.info(arg1);
    	
            }

    @When("^enter the message body \"([^\"]*)\"$")
    public void enter_the_message_body(String arg1) throws Throwable {
    	
    	G.MessageBody(arg1);
    	Thread.sleep(5000);
    	log.info("Enter the Message Body");
    	log.info(arg1);
       
    }

    @Then("^Click on the send$")
    public void click_on_the_send() throws Throwable {
    	G.clickonsend();
    	log.info("Send the details");
       
    }
    @When("^enter the receipient \"([^\"]*)\"$")
    public void enter_the_receipient(String arg1) throws Throwable {
       G.recipientname(arg1);
       Thread.sleep(2000);
       log.info(arg1);
    }

    @When("^enter the message \"([^\"]*)\"$")
    public void enter_the_message(String arg1) throws Throwable {
    	G.MessageBody(arg1);
    	Thread.sleep(2000);
    	log.info(arg1);
        
    }

}
