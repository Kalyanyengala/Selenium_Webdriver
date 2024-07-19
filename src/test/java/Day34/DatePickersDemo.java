package Day34;
import java.awt.Window;
import java.util.List;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DatePickersDemo 
{
	static void selectfuturedate(WebDriver driver,String year, String month, String date )
	{
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentyear.equals(year) && currentmonth.equals(month)  )
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				
			
		}
		
		//DATE:
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr/td/a"));
		
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	
		
		public static void selectPastDate(WebDriver driver, String year, String month, String date) 

		{
			while (true)
			{
			
				String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(currentyear.equals(year) && currentmonth.equals(month))
				{
				
					break;
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	
			}
			
		
			
			List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr/td/a"));
			
			for (WebElement dat:alldates) {
				
				dat.click();
				break;
			}
			
			
			
			
			
			
			
			
			
			
		}
	

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("23/12/2025");
		
		//FUTURE:
		
		String year="2023";
		String month="December";
		String date="23";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//selectfuturedate(driver,year,month,date);
		
	
		
		selectPastDate(driver,year,month,date);
		
		
		
		
		

	}

}
