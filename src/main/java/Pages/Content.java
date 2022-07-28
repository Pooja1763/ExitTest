package Pages;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;

import Base.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Content extends Test{
	public static By content=By.xpath("//android.widget.TextView[@content-desc=\"Content\"]");
	public static By clipboard =By.xpath("//android.widget.TextView[@content-desc=\"Clipboard\"]");
	public static By datatype =By.xpath("//android.widget.TextView[@content-desc=\"Data Types\"]");
	public static By clip =By.id("io.appium.android.apis:id/clip_type");
	public static By text =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]");

	
	public void ClickonContent() {
		TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(content);
		action.tap(tapOptions().withElement(element(element))).release().perform();
	}

	public void ClipBoard() {
		TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(clipboard);
		action.tap(tapOptions().withElement(element(element))).release().perform();
	}

	public void Clickondata() {
		TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(datatype);
		action.tap(tapOptions().withElement(element(element))).release().perform();
	}

	public void ClickonClip() {
		TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(clip);
		action.tap(tapOptions().withElement(element(element))).release().perform();
	}

	public void Clickontext() {
		TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(text);
		action.tap(tapOptions().withElement(element(element))).release().perform();
	}
	

}
