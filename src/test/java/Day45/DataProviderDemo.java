package Day45;
import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo
{    WebDriver driver;
	@BeforeClass
	void TestSetUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider="dp")
	void TestLogin(String user,String password) throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(1000);
		boolean status=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		if(status==true)
		{ Thread.sleep(2000);
			
			Assert.assertEquals(status,true);
			
		}
		else
		{
			Assert.fail();
		}

		
		}
		
   @AfterClass
   void TestExit()
   {
	driver.close();}
   
   @DataProvider(name="dp",indices= {3})
   Object[][] LoginData()
   {
	   Object data[][]= {
			   {"abc@gmail.com", "test123"},
				{"xyz@gmail.com", "test012"},
				{"john@gmail.com", "test@123"},
				{"Admin","admin123"},
				{"johncanedy@gmail.com", "test"},
			  };
	   return data;
	   
   }
   
	   
	   
	   
   
	   
   



}
