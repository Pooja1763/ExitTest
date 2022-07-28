package Pages;

import org.openqa.selenium.By;

import Base.Test;

public class View extends Test{
	public static By view =By.xpath( "//android.widget.TextView[@content-desc=\"Views\"]");
	public static By anim=By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]");
	public static By trans =By.xpath("//android.widget.TextView[@content-desc=\"3D Transition\"]");
	public static By img =By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
    public static By clk =By.id("io.appium.android.apis:id/picture");
       
    public void Clickonview() {
    	driver.findElement(view).click();
    
}
    public void Clickonanimation() {
    	driver.findElement(anim).click();
    
}
    public void Clickon3d() {
    	driver.findElement(trans).click();
    
}
    public void Clickonimage() {
    	driver.findElement(img).click();
    
}
    public void Image() {
    	driver.findElement(clk).click();
    
}
}
