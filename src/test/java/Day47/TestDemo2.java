package Day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDemo2
{
	WebDriver driver;
	
	@BeforeClass
	void loginset()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.udemy.com/logout/");
		driver.manage().window().maximize();
	}
	@Test
	void testlogin() throws InterruptedException
	{
		PageDemo2 pd=new PageDemo2(driver);
		pd.setlogin();
		pd.setemail("kalyanyengala@gmail.com");
		pd.setclickbutton();
		pd.setotpclick();
		pd.setloginclick();
	}
	@AfterClass
	void Logout() 
	{
	driver.quit();
	}

}
