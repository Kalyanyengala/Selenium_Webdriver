package Day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment  {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		// tag name adding new comment 
		
//		driver.findElement(By.cssSelector("input#newsletter-email")).sendKeys("Phone");
//		
//		// Without Tagname
//
//		driver.findElement(By.cssSelector("#newsletter-email")).sendKeys("Phonee");
//		
//		//Class 
//		driver.findElement(By.cssSelector("input.newsletter-subscribe-text")).click();
		
		//without class
//		driver.findElement(By.cssSelector(".newsletter-subscribe-text")).click();
		
 
		//Tag,class,Attribute
		
		//driver.findElement(By.cssSelector("input.newsletter-subscribe-text[aria-label='Sign up for our newsletter']")).click();
		
	
	
	
	
	
	
	}

}
