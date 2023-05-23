package gurudemo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileIO {
	public static Properties prop;
	/************************************Get Properties file*/
		public static Properties initProperties() {
			if (prop == null) {
				prop = new Properties();
				try {
					FileInputStream file = new FileInputStream(System.getProperty("user.dir")
							+ "\\src\\test\\resourses\\ObjectRepository\\config2.properties");
					
					
					prop.load(file);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
			return prop;
		}
		
		public static String[][] datahandling(String sheetname)   {
			//changes
			
			FileInputStream fis;
			XSSFWorkbook workbook= null ;
			try {
				fis = new FileInputStream("C:\\Users\\revat\\JavaWorkspace\\GuruDemoFramework2\\testdata\\test_dataFrameWork2.xlsx");
				 workbook =new XSSFWorkbook(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			XSSFSheet sheet=workbook.getSheet(sheetname);
			int rowcount=sheet.getPhysicalNumberOfRows();
			Row row=sheet.getRow(0);
			int colcount=row.getPhysicalNumberOfCells();
			String testdata[][]=new String [rowcount][colcount];
			
			DataFormatter formatter=new DataFormatter();
			for (int i = 0; i < rowcount; i++) {
				for(int j=0;j<colcount;j++) {
					testdata[i][j]=formatter.formatCellValue(sheet.getRow(i).getCell(j));
				}
			}
			return testdata;
		}}
