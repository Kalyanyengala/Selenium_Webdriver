package Day31;
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


public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException
	{
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.manage().window().maximize();
//		
//		WebElement dropboxs=driver.findElement(By.xpath("//select[@id='country']"));
//		Select dropbox=new Select(dropboxs);
		//dropbox.selectByVisibleText("United Kingdom");
		//dropbox.selectByValue("india");
//		dropbox.selectByIndex(7);
//		List<WebElement> options=dropbox.getOptions();
//	
//		System.out.println(options.size());
//		
//		for (int i=0;i<options.size();i++)
//		{
//			System.out.println(options.get(i).getText());
//		}
//		
//		for(WebElement op:options)
//		{
//			System.out.println(op.getText());
//		}
		
		//BOOTSTARP:
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
//		driver.manage().window().maximize();
		

		//driver.findElement(By.xpath("//option[@value='india']")).click();
//		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]"));
//		System.out.println(options.size());
		
//		for (WebElement op:options)
//		{
//			System.out.println(op.getText());
//		}
//		
//		for (WebElement op:options)
//
//		{
//			String option=op.getText();
//			
//			if (option.equals("Java")|| option.equals("Python"))
//			{
//				op.click();
//			}
//		}
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();	
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


	}


