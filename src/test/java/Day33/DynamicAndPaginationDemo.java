package Day33;
import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DynamicAndPaginationDemo {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver. get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.manage().window().maximize();
		
//	    WebElement user=driver.findElement(By.xpath("//input[@id='input-username']"));
//	    user.clear();
//	   
//	    user.sendKeys("demo");
//		
//		WebElement pass=driver.findElement(By.xpath("//input[@id='input-password']"));
//		pass.clear();
//		pass.sendKeys("demo");
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
//		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
//		
		String text=driver.findElement(By.xpath("//a[normalize-space()='1']")).getText();
		int total=Integer.parseInt(text);
		
		for (int t=1;t<=total;t++)
		{
			if(t>1) 
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@id='pagination']"));
			
				active_page.click();
			
			}
		
		}
		
		//int noofrows=driver.findElement(By.xpath("//div[@class='table-container']//tbody//tr")).size();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
