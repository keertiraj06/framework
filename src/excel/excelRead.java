package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class excelRead {

	public static String[][] getDataFromExcel(String FileName, String SheetName) throws IOException{
		File file = new File(System.getProperty("user.dir")+"\\src\\testData\\"+FileName);
		FileInputStream ips = new FileInputStream(file);
		//FileInputStream ips1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\testData\\"+FileName);

		HSSFWorkbook  wb = new HSSFWorkbook (ips);
		//XSSFWorkBook wb = new XSSFWorkBook(ips);
		
		Sheet sh = wb.getSheet(SheetName);
		int rownum = sh.getLastRowNum()+1;
		int colnum = sh.getRow(0).getLastCellNum()+1;
		String[][] data =  new String[rownum][colnum];
		String value="";
		for(int i=0;i<rownum;i++){
			Row row = sh.getRow(i);
			for(int j=0;j<colnum;j++){
				try{
				if(row.getCell(j).getCellType()==CellType.STRING)
				{
					value= row.getCell(j).getStringCellValue();
				}
				else
				{
					value= ""+row.getCell(j).getNumericCellValue();
				}
				System.out.println(value);
				data[i][j]=value;
				}
				catch(NullPointerException e){
					
				}
			}
		}
		return data;
	}

}
