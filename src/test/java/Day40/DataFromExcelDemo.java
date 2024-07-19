package Day40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataFromExcelDemo {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html\r\n");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(10000);
//		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(10);
//		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(2);
//		
//		Select perd2=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
//		perd2.selectByVisibleText();
//	
//		Select freqcy=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
//		freqcy.selectByVisibleText(period2);
//		
//		driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
		driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		
		
		
		
		
//		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\MyTestExce\\Labs Access.xlsx");
//		
//		XSSFWorkbook workbook=new XSSFWorkbook(file);
//		XSSFSheet sheet=workbook.getSheet("Sheet1");
//		
//		int totalrow=sheet.getLastRowNum();
//		int totalcell=sheet.getRow(1).getLastCellNum();
//
//		System.out.println("Noof Rows:"+totalrow);
//		System.out.println("NoofCells:"+totalcell);
//		
//		for(int r=0;r<=totalrow;r++)
//		{
//			XSSFRow currentrow=sheet.getRow(r);
//			for(int c=0;c<totalcell;c++)
//			{
//				XSSFCell currentcell=currentrow.getCell(c);
//				System.out.println(currentcell.toString());
//			}
//		}
//		workbook.close();
//		file.close();
		
		//WritingData into Excel:
		
//		
//		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\\\MyTestExce\\DataSheet.xlsx");
//		XSSFWorkbook workbook=new XSSFWorkbook();
//		XSSFSheet sheet=workbook.createSheet("DataSheet");
//		XSSFRow row1=sheet.createRow(0);
//		XSSFCell cell=row1.createCell(0);
//		row1.createCell(1).setCellValue("Java");
//		row1.createCell(2).setCellValue("103838.000");
//		row1.createCell(3).setCellValue("apple is also cal it as a iphone ");
//		row1.createCell(4).setCellValue("True");
//		
//		XSSFRow row2=sheet.createRow(1);
//		row2.createCell(0).setCellValue("kalakada");
//		row2.createCell(1).setCellValue("1000kms");
//		row2.createCell(2).setCellValue("Tirupati");
//		row2.createCell(3).setCellValue("19329kms");
//		row2.createCell(4).setCellValue("TotalIs Above");
//		
//		workbook.close();
//		file.close();
//		System.out.println("File Created");
//		
//		
		
		
//		
//		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\MyTestExce\\DataOfThe_User.xlsx");
//		XSSFWorkbook workbook=new XSSFWorkbook();
//		XSSFSheet sheet=workbook.createSheet("DataOfThe_User");
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Number Of Rows:");
//		int rows=sc.nextInt();
//		System.out.println("Enter Number Of Cells:");
//		int cells=sc.nextInt();
//		
//		for(int r=0;r<=rows;r++)
//		{
//			XSSFRow currentrows=sheet.createRow(r);
//			for(int c=0;c<cells;c++)
//			{
//				XSSFCell currentcells=currentrows.createCell(c);
//				currentcells.setCellValue(sc.next());
//				
//				
//  	}
//		}
//		workbook.close();
//		file.close();
//		System.out.println("File was Created:");
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
