package Pages;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;

import Base.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class App extends Test{
	public static By app=By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
	//after scrolling then click on text_speech
	public static By text_speech=By.xpath("//android.widget.TextView[@content-desc=\"Text-To-Speech\"]");
	public static By again =By.id("io.appium.android.apis:id/again_button");
	
	//OR
	public static By fragment=By.xpath("//android.widget.TextView[@content-desc=\"Fragment\"]");
	//if we wnat we can use scroll
	public static By nested =By.xpath("//android.widget.TextView[@content-desc=\"Nesting Tabs\"]");
	public static By stack =By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.app.ActionBar.Tab[3]/android.widget.TextView");
    public static By push =By.id("io.appium.android.apis:id/new_fragment");
    public static By tabs=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.app.ActionBar.Tab[4]/android.widget.TextView");
    public static By getres=By.id("io.appium.android.apis:id/get");
    public static By pick =By.id("io.appium.android.apis:id/violet");
    
    
    public void clickonapp() {
    	TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(app);
		action.tap(tapOptions().withElement(element(element))).release().perform();
    	
    }
    
    public void Fragment() {
    	driver.findElement(fragment).click();
    }
    public void clickonnested() {
    	TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(nested);
		action.tap(tapOptions().withElement(element(element))).release().perform();
    }
    
    public void Stack() {
    	driver.findElement(stack).click();
    }
    
    public void Push() {
    	TouchAction action=new TouchAction(driver);
		MobileElement element=driver.findElement(push);
		action.tap(tapOptions().withElement(element(element))).release().perform();
    }
    
    public void Tabs() {
    	driver.findElement(tabs).click();
    	
    }
    
    public void getResult() {
    	driver.findElement(getres).click();
    }
    
    public void PickResult() {
    	driver.findElement(pick).click();
    }
}
