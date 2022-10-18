package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelSheet {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		//String text = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		//System.out.println(text);
		wb.getSheet("Sheet1").getRow(1).getCell(3).setCellValue("fail");
		FileOutputStream fout=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fout);
		wb.close();
	}

}
