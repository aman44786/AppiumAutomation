package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
static Xls_Reader reader;
	
	static String filename="login.xlsx";
	
	public static List<Map<String,String>> getExcelData() {
		List<Map<String,String>> allData=null;
		LinkedHashMap<String,String> testData=null;
		
			try {
				FileInputStream fi=new FileInputStream("C:\\Users\\amanullah\\Appium\\AppiumUsingPo\\src\\main\\resources\\login.xlsx");
				Workbook wb=new XSSFWorkbook(fi);
				Sheet sheet=wb.getSheetAt(0);
				
				int lastRowNumber=sheet.getLastRowNum();//total no of rows
				System.out.println(lastRowNumber);
				int lastcolNumber=sheet.getRow(0).getLastCellNum();//total no of col
				System.out.println(lastcolNumber);
				List list=new ArrayList();
				for(int i=0;i<lastcolNumber;i++)
				{
					Row row=sheet.getRow(0);
					Cell cell=row.getCell(i);
					String rowHeader=cell.getStringCellValue().trim();
					list.add(rowHeader);
					
				}
				
				allData=new ArrayList<Map<String,String>>();
				
			 for(int j=1; j<=lastRowNumber;j++ ) 
			 {
					Row row=sheet.getRow(j);
					
					testData=new LinkedHashMap<String, String>();
					
					for(int k=0;k<lastcolNumber;k++)
					{
						Cell cell=row.getCell(k);
						String colvalue=cell.getStringCellValue().trim();
						testData.put((String) list.get(k),colvalue); 
					}
					allData.add(testData);
					
			 }
			 return allData;
			}catch(Exception e) {
		e.printStackTrace();
	}
			return null;
			
}
}