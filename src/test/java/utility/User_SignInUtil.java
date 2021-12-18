package utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User_SignInUtil {
static Xls_Reader reader;
	
	public static ArrayList<Object> getDatafromExcel(String filename,String sheetname) throws IOException {
		
		ArrayList<Object> myData =new ArrayList<Object>();
			
		try {
			reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\resources\\"+filename,sheetname);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		for(int row = 1;row< reader.rowcount;row++) {
			List <String> data = new ArrayList<String>();
			
			for(int col = 0;col< reader.columncount;col++) {
				
				String TempValue = reader.ReadCellData(row,col,sheetname);
				data.add(TempValue);				
			}		
			myData.add(data);
		}
		
		System.out.println(myData);
		return myData;	
	}
}

