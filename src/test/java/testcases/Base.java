package testcases;

	import org.openqa.selenium.support.PageFactory;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.pagefactory.AppiumFieldDecorator;

	public class Base {
		
		protected AndroidDriver driver;
		
		public Base(AndroidDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			
		}

	}



