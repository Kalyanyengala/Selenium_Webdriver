package Day27;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingBrowserDemo {
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver .get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

	
		Set<String>winidof=driver.getWindowHandles();
		for (String windowids:winidof)
		{
			String titles=driver.switchTo().window(windowids).getTitle();
			System.out.println(titles);
			
			if (titles.equals("OrangeHRM")) {
				driver.close();
		
		
		
		
		}
		
		}
	}

}
