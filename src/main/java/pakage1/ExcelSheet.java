package pakage1;

import java.io.File; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https:\\www.google.com");
		
		
		File src=new File("C:\\Users\\user\\Desktop\\a\\excel1.xlsx");	//----------> go to location
		
		FileInputStream Excel = new FileInputStream(src);				//----------Read the file
		
		XSSFWorkbook XSF=new XSSFWorkbook(Excel);						//----------> Read .xlsx file 
		
		//XSSFWorkbook XSF=new XSSFWorkbook(Excel); ------------> For .Xls File format
		
		XSSFSheet sheet1 = XSF.getSheetAt(1);
		
		String a = sheet1.getRow(1).getCell(1).getStringCellValue();
		String b = sheet1.getRow(1).getCell(2).getStringCellValue();
		String c = sheet1.getRow(2).getCell(1).getStringCellValue();
		String d = sheet1.getRow(2).getCell(2).getStringCellValue();
		String e = sheet1.getRow(3).getCell(1).getStringCellValue();
		String f = sheet1.getRow(3).getCell(2).getStringCellValue();
		
		Thread.sleep(2000);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		

	}

}
