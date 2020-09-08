package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public static void main(String[] args) throws Exception
	{
		
        File file = new File("/Users/sathyashankaran/Downloads/Read_File_From_Excel.xlsx");
        FileInputStream fis = new FileInputStream(file);
         
        XSSFWorkbook wis = new XSSFWorkbook(fis);
        //HSSFWorkbook is used for xls file , XSSFWorkbook is used for xlsx
         XSSFSheet sheet1 = wis.getSheetAt(0);
       
        		 int rowcount = sheet1.getLastRowNum();
        		  System.out.println("no of rows are " +rowcount);
        		 
        		 for (int i=0;i<rowcount+1;i++)
        			
        		 {
         String data1 =sheet1.getRow(i).getCell(0).getStringCellValue();
                  
                 String data2 =sheet1.getRow(i).getCell(1).getStringCellValue();
           System.out.println("The username is   " +data1+ "   The password is  "+data2);
        		 
        		 }
        		wis.close(); 

	}

}
