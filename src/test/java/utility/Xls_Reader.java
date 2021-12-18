//reading value of a particular cell  
package utility;
import java.io.File;
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader   
{  
	String filename="";
	int rowcount;
	int sheetcount;
	int columncount;
	//public ExtentReports extent;
	//public String outputDirectory;
 


public Xls_Reader(String file,String sheetname) {
	// TODO Auto-generated constructor stub
	
    //extent = new ExtentReports(outputDirectory + File.separator + "ExtentReport.html", true);
	String value=null;          //variable for storing the cell value  
	Workbook wb=null;           //initialize Workbook null 
	Cell cell=null;
	Row row=null;
	Sheet sheet=null;
	try{
		filename=file;
		FileInputStream fis=new FileInputStream(filename);  
		//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
		wb=new XSSFWorkbook(fis);     
//		sheetcount=wb.getNumberOfSheets();
		sheet=wb.getSheet(sheetname);   //getting the XSSFSheet object at given index  
		rowcount=sheet.getPhysicalNumberOfRows();
		row=sheet.getRow(0);     	//returns the logical row
		columncount=row.getLastCellNum();  
		
		
	}catch(Exception ex) {
	}
}



//method defined for reading a cell  
public String ReadCellData(int vRow, int vColumn,String sheetname) throws IOException  
{  
String value=null;          //variable for storing the cell value  
Workbook wb=null;           //initialize Workbook null 
Cell cell=null;
Row row=null;
Sheet sheet=null;
//try  
//{  
//reading data from a file in the form of bytes  
FileInputStream fis=new FileInputStream(filename);  
//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
wb=new XSSFWorkbook(fis);     
sheet=wb.getSheet(sheetname);  //getting the XSSFSheet object at given index  
row=sheet.getRow(vRow); //returns the logical row  
//try
//{
	
	cell=row.getCell(vColumn); //getting the cell representing the given column  
	value=cell.getStringCellValue(); //getting cell value  
	System.out.println("Value is :"+value);
	return value;    
//}catch(Exception ex)
//{
//	value="";
//	//ex.printStackTrace();
//	return value;
//			
//}           //returns the cell value  
//}catch(Exception ex)
//{
//	/*try{
//		FileInputStream fis=new FileInputStream(filename);  
//	//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
//	wb=new XSSFWorkbook(fis);     
//	sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
//	row=sheet.getRow(vRow); //returns the logical row  
//	cell=row.getCell(vColumn); //getting the cell representing the given column  
//	return  cell.getNumericCellValue()+"";
//	}catch(Exception ex2)
//	{
//		ex2.printStackTrace();
//		return "";
//	}*/
//	value="";
//	System.out.println("Presentluy read data="+value);
////	ex.printStackTrace();
//	return "";
//	}
}
}