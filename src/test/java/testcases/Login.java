package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utility.ExcelUtility;


public class Login extends Base{
	
	
	
	public Login(AndroidDriver driver)
	{
		super(driver);
	}
	
	@AndroidFindBy(className="android.widget.EditText")
	private AndroidElement view1;
	
	@AndroidFindBy(id="com.avercast.fanbuku_app:id/et_password")
	private AndroidElement view2;
	
	@AndroidFindBy(className="android.widget.Button")
	private AndroidElement view3;
	
	

	@AndroidFindBy(id="com.avercast.fanbuku_app:id/btn_enter")
	private AndroidElement view4;
	
	@AndroidFindBy(id="com.avercast.fanbuku_app:id/btn_enter")
	private AndroidElement view5;
	
	@AndroidFindBy(id="com.avercast.fanbuku_app:id/btn_enter")
	private AndroidElement view6;
	
	@AndroidFindBy(id="com.avercast.fanbuku_app:id/btn_enter")
	private AndroidElement view7;
	
	@AndroidFindBy(id="com.avercast.fanbuku_app:id/btn_enter")
	private AndroidElement view8;
	
	
	public void clickonviews(ArrayList<Object> myData)
	{
		view1.click();
		view1.sendKeys(myData.get(0).toString());
		
		view2.click();
		view2.sendKeys(myData.get(1).toString());
		
		view3.click();
		
		view4.click();
		
		view5.click();
		
		view6.click();
		
		view7.click();
		
		view8.click();
		
		
	}
	
}
