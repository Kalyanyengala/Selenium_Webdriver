package Day30;
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

public class FramesDemo {

	public static void main(String[] args)   ////div[@id='i8']//div[@class='AB7Lab Id5V1']
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		
	
		WebElement frame2=driver.findElement(By.xpath("https://docs.google.com/forms/d/e/1FAIpQLScP-K8zi-9ar0MCq93D3VIFhegSNPveBfdLqiMfTYR9Q1iSKQ/viewform?embedded=true')]"));
	
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//div[@id='i8']")).click();////div[@id='i5']//div[@class='AB7Lab Id5V1']
		driver.switchTo().defaultContent();
		
	
	
	
	
	
	
	}

}
