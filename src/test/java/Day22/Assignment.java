package Day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
		
//		List<WebElement> images=driver.findElements(By.tagName("img"));
//		
//		System.out.println(images.size());
				
		driver.findElement(By.linkText("Tablets")).click();
		

	}

}
