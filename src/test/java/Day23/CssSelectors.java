package Day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Windows");
//		
//		driver.findElement(By.cssSelector("input.newsletter-subscribe-text")).click();
//		driver.findElement(By.cssSelector("select#customerCurrency")).click();
		
//		driver.findElement(By.cssSelector("div.menu-toggle"));
		
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Laptop");
//		driver.findElement(By.cssSelector("[role='button']"));
	
		driver.findElement(By.cssSelector("a.nivo-imageLink[role='status']"));
		
		
		

	}

}
