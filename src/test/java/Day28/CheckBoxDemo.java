package Day28;
import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException 
	{
                        // SPECIFIC CHECKBOX
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//Thread.sleep(3000);
//		driver.close();
		
		                //MULTIPLE CHECKBOX
	
//		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		
		/*
		 for (int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
	*/
		                //APPORACH2
		
		//List<WebElement> checkbox= driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
//		
//		for (WebElement checkboxes:checkbox)
//		{
//			checkboxes.click();
//		}
		
//		for (int i=0;i<3;i++)
//		{
//			checkbox.get(i).click();
//		}
//		
//		Thread.sleep(2000);
//		
//		for (int i=0;i<checkbox.size();i++)
//		{
//			if(checkbox.get(i).isSelected())
//			{
//				checkbox.get(i).click();
//			}
		
		         //ALERTS
		
	   
	   
//		driver.findElement(By.xpath("//button[@normalize-space()='Alert']")).click();
//		Alert myalert= driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}
