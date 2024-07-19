package Day21;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.WebDriver;

public class WebDriverDemo 
{

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();         // first we created object for chrome driver 
	
	driver.get("https://www.youtube.com/");     // given link to check 
	
	//System.out.println(driver);
	
	String title= driver.getTitle();             // given title to check 
	
	if (title.equals("YouTube"))
	{
		System.out.println("Test passed");
	}
	else 
	{
		System.out.println("TestFailed");
	}
	
	driver.close();
	
	
	
	
	
		
	}

}
