package genricscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Genric_Excel {
	 public static String getdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException{
		 String val=" ";
		 FileInputStream fis=new FileInputStream("./Excelfolder/data.xlsx");
		 Workbook book= WorkbookFactory.create(fis);
		 Cell c = book.getSheet(sheet).getRow(row).getCell(cell);
		 val=c.toString();
		 
		 
		  return val;
	 }

}
