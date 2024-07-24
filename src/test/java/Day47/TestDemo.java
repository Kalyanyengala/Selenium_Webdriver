package Day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDemo
{
	WebDriver driver;
	
	@BeforeClass
	void login() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void testLogin()
	{
	
		WithPageObjDemo pod=new WithPageObjDemo(driver);
		pod.setusername("Admin");
		pod.setpassword("admin123");
		pod.setlogin();
		
	}
	@AfterClass
	void tearclose()
	{
		driver.quit();
	}

}
