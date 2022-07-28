package Pages;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;

import Base.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Animation extends Test{
	public static By animation=By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]");
	public static By hideshow =By.xpath("//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]");
	public static By hide =By.id("io.appium.android.apis:id/hideGoneCB");
	public static By two =By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]\r\n");
	public static By show =By.id("io.appium.android.apis:id/addNewButton");
	
	public void anim() {
		TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(animation);
		action.tap(tapOptions().withElement(element(element))).release().perform();
	}
	
	public void Hide() {
		TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(hideshow);
		action.tap(tapOptions().withElement(element(element))).release().perform();
	}
	public void Base() {
		this.driver=driver;
	}
   
	public void clickonhide() {
		TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(hide);
		action.tap(tapOptions().withElement(element(element))).release().perform();
		
	}

	public void clickontwo() {
		driver.findElement(two).click();
	}
	
	public void showbutton() {
		driver.findElement(show).click();
	}
}
