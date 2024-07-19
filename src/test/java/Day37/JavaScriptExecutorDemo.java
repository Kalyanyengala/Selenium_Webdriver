package Day37;
import java.util.List;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;



public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.manage().window().minimize();
//		WebElement input=driver.findElement(By.xpath("//input[@id='name']"));
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','Kalyan')",input);
//		Thread.sleep(2000);
//		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
//		js.executeScript("arguments[0].click()",radiobtn);
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,900)","");
//		Thread.sleep(2000);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	
		//WebElement check=driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]"));
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']").sendKeys("D:\\Kalyan_Devops\\Documents"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		Thread.sleep(2000);
//		
//		//js.executeScript("arguments[0].scrollIntoView();",check);
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		System.out.println("return window.pageYOffSet;");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		js.executeScript("document.body.style.zoom='50%'");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
