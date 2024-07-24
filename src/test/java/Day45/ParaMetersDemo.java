package Day45;
import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParaMetersDemo 
{
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void Setup(String br) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();
		case "edge":driver=new EdgeDriver();
		default :System.out.println("invalid URL");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);}
	}
		
		@Test(priority=1)
		void TestSetup()
		{
			boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			Assert.assertEquals(status, true);
			}

		@Test(priority=2)
		void TestLogin() throws InterruptedException
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
			Thread.sleep(1000);
		}
		@Test(priority=3)
		void TestLogoff()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		}
		@AfterClass
		void TestExit()
		{
			driver.quit();
		}
}
