package Day46;
import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleListenersClassDemo
{
	WebDriver driver;
	
	@BeforeClass
	@Test(priority=1)
	void TestSetUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	void TestGetURL () throws InterruptedException
	{ Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status,true);
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=3, dependsOnMethods= {"TestGetURL"})
	void TestTitle()
	{
		Assert.assertEquals(driver.getTitle(),"orangehrm");
	}
	@AfterClass
	void Close()
	{
		driver.quit();
	}

}
