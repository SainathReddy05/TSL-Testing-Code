package day5NG;

import utils.ExcelReader;

public class ExcelRunner {

	public static void main(String[] args) {
		
		ExcelReader reader=new ExcelReader("C:\\Users\\Sainath Reddy\\Desktop\\Testing-TSL(847)\\Book1-firsttestdata22.xls");
		System.out.println(reader.getCelldata("sheet1", 3, 0));
	}
}
