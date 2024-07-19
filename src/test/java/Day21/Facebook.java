package Day21;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args)
	{
//		WebDriver driver=new EdgeDriver();
//		
//		driver.get("https://www.facebook.com/darling.guru.94");
//		String title= driver.getTitle();
//		
//		
//		if (title.equals("Darling Guru"))
//		{
//			System.out.println("TestPasse");
//		}
//		else 
//		{
//			System.out.println("TestFailed");
//		}
//		driver.close();
		
		
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.facebook.com/darling.guru.94");
		
		String title= drive.getTitle();
		
		if (title.equals("Darling Guru"))
		{
			System.out.println("Test passe:"+title);
		}
		else {
			System.out.println("Test failed:"+title);
		}
		
		drive.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
