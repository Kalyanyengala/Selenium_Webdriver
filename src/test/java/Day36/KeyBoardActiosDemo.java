package Day36;
import java.util.List;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v124.browser.model.WindowState;
import org.openqa.selenium.interactions.Actions;



public class KeyBoardActiosDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
//		WebElement box1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
//		box1.sendKeys("Hello World");
//		Thread.sleep(1000);
//	
//		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();		
//		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
//		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
//		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
//		
//		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
	
//		WebElement reglink=driver.findElement(By.xpath("//span[@class='wishlist-label']"));
//		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
//		
//		List<String> ids= new ArrayList(driver.getWindowHandles());
//		driver.switchTo().window(ids.get(1));
//		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshits");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
