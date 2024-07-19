package Day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	
   WebDriver driver;
	
	
	
	@Test(priority=1)
	void OpenApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	void Login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@Test(priority=3)
	void Logo()
	{
		driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
		driver.findElement(By.xpath("//p[normalize-space()='Time at Work']")).getText();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-stopwatch']")).getText();
		
	}
	@Test(priority=4)
	void Click()
	{
		System.out.println("Testpassed");
		//driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
		//driver.findElement(By.xpath("//input[@class='class='oxd-input oxd-input--active']")).sendKeys("Kalyan");
		}
	@Test(priority=5)

	void Close()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
