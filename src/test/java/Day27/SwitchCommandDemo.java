package Day27;
import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCommandDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver .get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

	
		Set<String>winid=driver.getWindowHandles();
		
		List<String>windowlist=new ArrayList(winid);
		String parentid=windowlist.get(0);
		String childid=windowlist.get(1);
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		
		
	}

}
