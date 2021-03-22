package com.naukrilog.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getPropertyFileData(String key) throws IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/data/commonData.properties");
		Properties p = new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
	}
	
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
		
	}
	public static void main(String[] args) throws IOException {
		
		FileLib f = new FileLib();
		System.out.println(f.getPropertyFileData("url"));
		System.out.println(f.getPropertyFileData("username"));
		System.out.println(f.getPropertyFileData("password"));
		
		String url = f.getExcelData("Sheet1", 1, 1);
		System.out.println(url);
		System.out.println(f.getExcelData("Sheet1", 1, 2));
		System.out.println(f.getExcelData("Sheet1", 1, 3));
	}
}
