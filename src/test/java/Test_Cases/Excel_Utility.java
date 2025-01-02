package Test_Cases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility  {
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook wb;
	public XSSFSheet sh;
	public XSSFRow row;
	public XSSFCell cell;
	public String path="C:\\Users\\Koustubh Pisal\\eclipse-workspace\\new workspace\\OpenCart_Framework\\Test_Data\\Opencart_TestData01.xlsx";
	
	public Excel_Utility(String path)
	{
		this.path=path;
	}
	public int getRowCount(String sheetname) throws IOException
	{
		fi=new  FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sheetname);
		int rowcount=sh.getLastRowNum();
		
		fi.close();
		
		return rowcount;
		
	}
	public int getCellCount(String sheetname, int RowNum) throws IOException
	{
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sheetname);
		row=sh.getRow(RowNum);
		int lastcell=row.getLastCellNum();
		
		return lastcell ;
		
	}
	public String getCellData(String sheetname, int RowNum, int CellNum) throws IOException
	{
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sheetname);
		row=sh.getRow(RowNum);
		cell=row.getCell(CellNum);
		
		DataFormatter formatter=new DataFormatter();
		String data;
		try {
			data=formatter.formatCellValue(cell);
		}
		catch(Exception e)
		{
			data=" ";
		}
		wb.close();
		fi.close();


		return data ;
		
	}

}



