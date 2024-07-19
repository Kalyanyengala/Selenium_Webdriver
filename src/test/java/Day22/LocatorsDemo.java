package Day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com");
		
		driver.manage().window().maximize();
	   // driver.findElement(By.name("search")).sendKeys("lenovo");
	   
		//boolean logodisplayed= driver.findElement(By.id("top")).isDisplayed();
	   
	   //System.out.println(logodisplayed);
	
	   //driver.findElement(By.linkText("Desktops")).click();
		
	  //List<WebElement>header=driver.findElements(By.className("container"));
	   //System.out.println("How manylinks:"+header.size());
	  
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		
//		List<WebElement> link=driver.findElements(By.tagName("a"));
//		System.out.println("Total number of llinks:"+link.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		
		System.out.println(images.size());
		
		
		
		
		
		
	   
		
	}

}
