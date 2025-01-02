package Test_Cases;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utility.Excel_Utility;

public class data_Provider {
	@DataProvider(name= "logindata")
	public String [] [] getData() throws IOException
	{
		String path="C:\\Users\\Koustubh Pisal\\eclipse-workspace\\new workspace\\OpenCart_Framework\\Test_Data\\Opencart_TestData01.xlsx";
		
		Excel_Utility ex=new Excel_Utility(path);
		
		int totalrows=ex.getRowCount("Sheet1");
		int totalcell=ex.getCellCount("Sheet1", 1);
		
		String logindata [][]=new String[totalrows][totalcell];  //Creating Two Dimensional array since we have tow values
		
		for(int i=1; i<=totalrows; i++)
		{
			for(int j=1; j<=totalcell; j++)
			{
				logindata[i-1][j]=ex.getCellData(path, i, j); //array index starts from 1;
			}
		}
		
		return logindata ;
		
	}
	


}
