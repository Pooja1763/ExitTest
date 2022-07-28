package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;

import Base.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability extends Test {
	public static int Implicit_wait_Time;
	public static int Explicit_wait_Time;
	public static String Base_pkg;
	public static String App_Activity;
	public static String Browser_name;
	public static String Platform_name;
	public static String Platform_version;
	public static String Device_name;
	public static String Appium_port;
	public static String App_path;
	public static URL serverUrl;
	
	public static XSSFWorkbook xsf =null;
	private static DesiredCapabilities capabilties =new DesiredCapabilities();   
    

     
	public void loadConfig() throws IOException{
    	  FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelFile\\Excel.xlsx");    	
    	  XSSFWorkbook xsf = new XSSFWorkbook(fis);
    	
    	
    	  XSSFSheet sheet =xsf.getSheet("sheet1");
    	  Cell cell1 = sheet.getRow(3).getCell(1);   
          //SET AS STRING TYPE
          cell1.setCellType(Cell.CELL_TYPE_STRING);
          
          Cell cell2=sheet.getRow(1).getCell(1);
         cell2.setCellType(Cell.CELL_TYPE_STRING);
    	
    	App_path =sheet.getRow(0).getCell(1).getStringCellValue();
    	Appium_port =cell2.getStringCellValue();
    	Device_name =sheet.getRow(2).getCell(1).getStringCellValue();
    	Platform_version =cell1.getStringCellValue();
        Platform_name =sheet.getRow(4).getCell(1).getStringCellValue();
        Browser_name =sheet.getRow(5).getCell(1).getStringCellValue();
        App_Activity=sheet.getRow(6).getCell(1).getStringCellValue();
      Base_pkg=sheet.getRow(7).getCell(1).getStringCellValue();
        
        
      
     }
      
 public void setAndroidCapabilities() {


    	  capabilties.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform_name);
    	  capabilties.setCapability(MobileCapabilityType.PLATFORM_VERSION,Platform_version);
        capabilties.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,Base_pkg);
    	  capabilties.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,App_Activity);
    	  capabilties.setCapability(MobileCapabilityType.APP,App_path);
    	  capabilties.setCapability(MobileCapabilityType.DEVICE_NAME,Device_name);
  
    	  
    	     	  
      }

      
     public  AppiumDriver<MobileElement> getandroidDriver() throws MalformedURLException{
    	  serverUrl =new URL("http://localhost:"+Appium_port+"/wd/hub");
    	  return driver =new AndroidDriver<MobileElement>(serverUrl,capabilties);
      }
}



