package Pages;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;

import Base.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Graphics extends Test {
	public static By os =By.xpath("//android.widget.TextView[@content-desc=\"OS\"]");
	public static By msg =By.xpath("//android.widget.TextView[@content-desc=\"SMS Messaging\"]");
	public static By recipient =By.id("io.appium.android.apis:id/sms_recipient");
	public static By msgbody =By.id("io.appium.android.apis:id/sms_content");
	public static By send =By.id("io.appium.android.apis:id/sms_send_message");
	
	public void ClickonGraphics() {
		driver.findElement(os).click();
		
	}
	public void Message() {
		TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(msg);
		action.tap(tapOptions().withElement(element(element))).release().perform();
	}
	public void recipientname(String arg) {
		driver.findElement(recipient).sendKeys(arg);
		
	}
	
	public void MessageBody(String arg1) {
		driver.findElement(msgbody).sendKeys(arg1);
	}
	
	public void clickonsend() {
		driver.findElement(send).click();
	}
}
