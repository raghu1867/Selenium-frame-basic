package seleniumbasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Readxlsx {

	public static void main(String[] args) throws IOException   {
		
		
		File src=new File("C:\\Users\\Jaypal reddy\\Desktop\\New folder (2)\\New Microsoft Excel Worksheet.xlsx");
FileInputStream fis=new FileInputStream(src); 
HSSFWorkbook wb=new HSSFWorkbook();
HSSFSheet sheet=wb.getSheetAt(0);

int rowcount=sheet.getLastRowNum();

int colcount=sheet.getRow(0).getLastCellNum();
String data[][]=new String[rowcount][ colcount];
HSSFCell cell;
for(int i=0;i<rowcount;i++) {
	for(int j=0;j<colcount;j++)
	{
	cell=	sheet.getRow(i).getCell(j);
	String cellcontains=cell.getStringCellValue(); 
	data[i][j]=cellcontains;
	}
}fis.close();










	}

}
