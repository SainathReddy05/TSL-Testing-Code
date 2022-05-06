package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private Workbook wb;
		public ExcelReader(String fileNameWithLocation)
	{

		try 
		{
			FileInputStream ip = new FileInputStream(fileNameWithLocation);
			if(fileNameWithLocation.endsWith(".xlsx"))
					{
				       wb = new XSSFWorkbook(ip);
					}
			else if(fileNameWithLocation.endsWith(".xls"))
					{
				       wb = new HSSFWorkbook(ip);
					}
			else
			{
				System.out.println("Invalid file format! Kindly use .xls or .xlsx files");
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Error with File Reading"+e.getMessage());
		}
	}

	public String getCelldata(String sheetName, int row,int col)
	{
		String data = wb.getSheet(sheetName).getRow(row).getCell(col).toString();
		return data;
	}
	public int getRowNum(String sheetName)
	{
		return wb.getSheet(sheetName).getLastRowNum()+1;
	}
	public int getColumnNum(String sheetName)
	{
		return wb.getSheet(sheetName).getRow(0).getLastCellNum();
	}
}
