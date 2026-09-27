package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.baseclass.Library;


public class excelutility extends Library {
public String excelread(String sheet,int RowNumber,int cellNumber) throws IOException {
		
		File path=new File("src/test/resources/TestData/book.xlsx");
		FileInputStream read=new FileInputStream(path);
		Workbook book=new XSSFWorkbook(read);
		     Sheet sh = book.getSheet(sheet);
		     Row row = sh.getRow(RowNumber);
		    Cell c = row.getCell(cellNumber);
		    logger.info("************Read Excel sheet ***********");
		   return      c.getStringCellValue();    
		}

		public void excelwrite(String sheet,int RowNumber,int cellNumber,String text) throws IOException {
			File path1=new File("src/test/resources/TestData/book.xlsx");
			FileInputStream read=new FileInputStream(path1);
			Workbook book=new XSSFWorkbook(read);
			 Sheet sh = book.getSheet(sheet);
		     Row row = sh.getRow(RowNumber);
		     Cell c = row.createCell(cellNumber);
		     c.setCellValue(text);
		     FileOutputStream write=new FileOutputStream(path1);
		     book.write(write);
		     logger.info("************Write in excel sheet***********");
		     
		}
		}
