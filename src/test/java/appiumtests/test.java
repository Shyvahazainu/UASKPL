package appiumtests;

import org.openqa.selenium.remote.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.net.URL;

public class test {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {

			openShopee();
		}catch(Exception exp){
			System.out.println(
					exp.getCause());
			System.out.println(
					exp.getMessage());
			exp.printStackTrace();
		}
		

	}
	
	public static void openShopee() throws Exception{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName","Pixel 5 API 24");
		cap.setCapability("udid", "emulator-5556");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		
		cap.setCapability("appPackage", "com.google.android.music");
		cap.setCapability("appActivity", "com.google.android.music.ui.HomeActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application started...");
	}

}
