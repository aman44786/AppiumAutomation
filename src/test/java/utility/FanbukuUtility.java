package utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FanbukuUtility {
	
	static AndroidDriver driver=null;
	@BeforeTest
	public static AndroidDriver openFanbuku() throws MalformedURLException
	{
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("Device Name", "M2003J15SC");
		cap.setCapability("udid", "205a78720409");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.avercast.fanbuku_app");
		cap.setCapability("appActivity", "com.avercast.fanbuku_app.activity.SplashScreenActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver<WebElement>(url,cap);
		
		System.out.println("Application Started........");
		try {
		Thread.sleep(6000);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return driver;

}
}
