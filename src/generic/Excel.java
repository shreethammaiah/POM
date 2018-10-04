package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel
{

public static String abc(String file,String Sheet,int row,int cell)
{
	String s="";
	try
	{
		FileInputStream f=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(f);
		s=wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	catch(Exception e)
	{
	}
	return s;
	
}
}
