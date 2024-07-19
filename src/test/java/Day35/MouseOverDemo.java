package Day35;
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
import org.openqa.selenium.interactions.Actions;



public class MouseOverDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://icertindia.in/");
		driver.manage().window().maximize();
		
//		WebElement about=driver.findElement(By.xpath("//a[normalize-space()='About us']//i[@class='fas fa-chevron-down']"));
//		WebElement gallery=driver.findElement(By.xpath("//a[normalize-space()='Gallery']"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(about).build().perform();
//		act.moveToElement(gallery).click().perform();
		
//		act.moveToElement(about).moveToElement(gallery).click().build().perform();
		
		
		//RIGHT CLICK ACTION:
		
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		
//		WebElement right=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//		WebElement copy=driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
//		Thread.sleep(2000);
//		 act.contextClick(right).contextClick(copy).perform();
//		 
//		driver.switchTo().alert().accept();
//		
		
		//Double click()

//		driver.get("https://testautomationpractice.blogspot.com/");
//		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
//		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
//		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
//		
//		
//		box1.clear();
//		box1.sendKeys("Welcome");
//		
//		//box2.sendKeys("Welcome");
//		
//		act.doubleClick(button);
//		box2.getText();
		
		//DRAG AND DROP:
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(rome,italy).perform();
		
		WebElement washing=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement united=driver.findElement(By.xpath("//div[@id='box103']"));
		
		Thread.sleep(2000);
	
		act.dragAndDrop(washing,united).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
