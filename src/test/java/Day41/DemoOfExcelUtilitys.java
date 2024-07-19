package Day41;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Window;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

import Day41.ExcelUtilDemo.ExcelUtils;




public class DemoOfExcelUtilitys
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html\r\n");
//		driver.manage().window().maximize();
//		
//		String file=System.getProperty("user.dir")+"\\MyTestExce\\DemoWorkBook.xlsx";
//		int rows=ExcelUtils.getRowCount(file,"Sheet1");
//		for(int r=1;r<=rows;r++)
//		{
//			String pric=ExcelUtils.getCellData(file,"Sheet1",1,0);
//			String rateofint=ExcelUtils.getCellData(file,"Sheet1",1,1);
//			String period1=ExcelUtils.getCellData(file,"Sheet1",1,2);
//			String period2=ExcelUtils.getCellData(file,"Sheet1",1,3);
//			String freq=ExcelUtils.getCellData(file,"Sheet1",1,4);
//			String matur_value=ExcelUtils.getCellData(file,"Sheet1",1,5);
//			
//			
//			
//			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
//			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofint);
//			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
//			
//			Select perd2=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
//			perd2.selectByVisibleText(period2);
//		
//			Select freqcy=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
//			freqcy.selectByVisibleText(freq);
//			
//			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
//			
//			String finalvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
//			if(Double.parseDouble(matur_value)==Double.parseDouble(finalvalue))
//			{
//				System.out.println("Test Passed...!!!");
//				ExcelUtils.setCellData(file,"Sheet1",r,6,"passed");
//				ExcelUtils.fillGreenColor(file,"Sheet1",r,6);
//				
//			}
//			else
//			{
//				System.out.println("TestFailed...!!");
//				ExcelUtils.setCellData(file,"Sheet1",r,7,"Failed");
//				ExcelUtils.fillRedColor(file,"Sheet1",r,7);
//			}
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//img[@class='PL5']")).click();
//		}
//		driver.quit();
//		
		
//		FileInputStream file=new FileInputStream(System.getProperty("user.dir"));
//		Properties prop=new Properties();
//		prop.load(file);
//		String email=prop.getProperty("email");
//		String passwd=prop.getProperty("password");
//		String empid=prop.getProperty("Employid");
//		String comp=prop.getProperty("company");
//		String addres=prop.getProperty("address");
//		
//		System.out.println(email);
//		System.out.println(passwd);
//		System.out.println(empid);
//		System.out.println(comp);
//		System.out.println(addres);
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
