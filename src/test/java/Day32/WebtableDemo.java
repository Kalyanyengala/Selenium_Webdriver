package Day32;
import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);		

		//int row=driver.findElements(By.tagName("tr")).size();
		//System.out.println(row);
		
//		int colum=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
//		System.out.println(colum);
//		
//		String bookdata=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[4]")).getText();
//		System.out.println(bookdata);
//		
//		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Prize");
//		for (int r=2;r<=rows;r++)
//		{
//			for(int c=1;c<=colum;c++)
//			{
//			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();	
//			
//			System.out.println(value);
//			}
//			
//		}
		
		for (int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		
		
			if(author.equals("Mukesh"))
			{
				String bookvalue=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			
				System.out.println(bookvalue+"\t"+author);
			
			}
		
		
		}
		
		int total=0;
		
		for (int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+2+"]//td[4]")).getText();
		
			total=total+Integer.parseInt(price);
			System.out.println(total);
		
		}
		

	
	
	
	
	
	
	
	
	}
	

}
