package appiumtests;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class selendroid2 extends selendroid3{
	

	public static <MobileElement> void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.findElementByAccessibilityId("my_text_fieldCD").sendKeys("appium test");
		driver.findElementById("io.selendroid.testapp:id/visibleButtonTest").click();

		driver.findElementById("io.selendroid.testapp:id/waitingButtonTest").click();
		
		//jeda 2 detik
        try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("Fahira");
		driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("Fahira@gmail.com");
		driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("Fahira123");
		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("Fahira");
		driver.findElementById("io.selendroid.testapp:id/inputName").clear();
		driver.findElementById("io.selendroid.testapp:id/inputName").sendKeys("Fahira");
		driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage").click();

        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       driver.findElementByXPath("//android.widget.CheckedTextView[contains(@text, 'Java')]").click();
        

		





	}

}
