package Day38;
import java.util.List;
import java.util.List;

import java.awt.Window;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class TakeScreenShootDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.manage().window().maximize();
		
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//		File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShots\\fullpage.png");
//		sourcefile.renameTo(targetfile);
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		WebElement feature=driver.findElement(By.xpath("//div[@class='category-grid home-page-category-grid']//div[@class='item-grid']"));
//		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//		File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShots\\featur.png");
//		sourcefile.renameTo(targetfile);
	
//	
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		WebElement logo=driver.findElement(By.xpath("//h2[normalize-space()='Tabs']"));
//		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
//	
//		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
//		sourcefile.renameTo(targetfile);
//		Thread.sleep(2000);
//		
//		driver.quit();
	
	 
//		Thread.sleep(2000);
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		WebElement type=driver.findElement(By.xpath("//h2[normalize-space()='New Browser Window']"));
//		File sourcefile=type.getScreenshotAs(OutputType.FILE);
//		File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShots\\type.png");
//		sourcefile.renameTo(targetfile);
//		Thread.sleep(2000);
//		driver.quit();
	
		
//		ChromeOptions options=new ChromeOptions();
//		options.setExperimentalOption("excludeSwitches",new String[] {"enable-Automation"});
//		
//		
//		WebDriver driver=new ChromeDriver(options);
//		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("http://expire.badssl.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
		
//		options.setAcceptInsecureCerts(true);
//		System.out.println(options);
//		
	 
		//driver.getTitle();
//		if(title.equals("Automation Testing Practice"))
//		{
//			
//				
//			         System.out.println("Testpased");
//				}
//		else
//		{
//			System.out.println("TestFailed");
		
//		}
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-Automation"});
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		
		
		
		
		
				
			
			
				
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
