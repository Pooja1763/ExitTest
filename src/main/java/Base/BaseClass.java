package Base;

import static io.appium.java_client.touch.WaitOptions.waitOptions;


import static java.time.Duration.ofMillis;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass extends Test {
	   public static void getKeyboard() {
	    	 driver.getKeyboard();
	     }
	   
	     public static void hideKeyboard() {
	    	 driver.hideKeyboard();
	     }
	     public void verticleScrollbypercentage(double startpercentage,double endpercentage, double anchorpercentage ) {
	 		
	 		Dimension size = driver.manage().window().getSize();
	 		int anchor = (int)(size.width * anchorpercentage);
	 	int startpoint = (int)(size.height * startpercentage);
	 		int endpoint = (int)(size.height * endpercentage);
	 		
	 		
	 		new TouchAction(driver).press(PointOption.point(anchor,startpoint)).waitAction(waitOptions(ofMillis(1000)))
	 		.moveTo(PointOption.point(anchor,endpoint)).release().perform();
	 	
	 	}
	     public void orientation() {
	    	 driver.rotate(ScreenOrientation.PORTRAIT);
	     }
	    

}
