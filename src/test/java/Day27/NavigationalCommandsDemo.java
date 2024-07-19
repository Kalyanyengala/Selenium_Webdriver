package Day27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommandsDemo {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	
	driver .navigate().to("https://demo.nopcommerce.com/");
	driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
	
	driver.manage().window().maximize();
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().refresh();
	
	
	

	}

}
