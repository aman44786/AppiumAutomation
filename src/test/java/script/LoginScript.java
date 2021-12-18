package script;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import resources.ExtentTestManager;
import testcases.Login;
import utility.ExcelUtility;
import utility.FanbukuUtility;
import utility.User_SignInUtil;
import utility.User_SignInUtil;
public class LoginScript {
	
	ArrayList<Object> data;
	static String file = "login.xlsx";
	static String sheetname = "Sheet1";
	
	@DataProvider(name="readexceldata")
	public Iterator<Object> getTestData() throws IOException {
		data = User_SignInUtil.getDatafromExcel(file,sheetname);
		System.out.println("***Our Data***"+data);
		System.out.println("****"+ data.iterator());
		return data.iterator();
	}
	

	@Test(dataProvider = "readexceldata",priority = 1)
	public void loginTest(ArrayList<Object> myData) throws MalformedURLException
	{
		AndroidDriver driver=FanbukuUtility.openFanbuku();
		
		Login login=new Login(driver);
		login.clickonviews(myData);
	}

}
