package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {

	public static void write_Data() throws IOException {

		File f = new File("C:\\Users\\asus\\eclipse-workspace\\LA\\Maven_Project_7pm\\Info.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet createSheet = w.createSheet("Details");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Tamizh");
		
		w.getSheet("Details").getRow(0).createCell(1).setCellValue(123);
		
		w.getSheet("Details").createRow(1).createCell(0).setCellValue("Aravind");
		
		w.getSheet("Details").getRow(1).createCell(1).setCellValue(456);
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		write_Data();
	}
	
}
