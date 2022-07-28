package Utility;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer {
	static AppiumDriverLocalService service;
	  
	 public static void Start() {
		 service =AppiumDriverLocalService.buildDefaultService();
		 service.start();
	 }
	 
	 public static void stop() {
		 service.stop();
	 }

}
