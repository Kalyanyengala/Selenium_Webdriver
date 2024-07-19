package Day39;
import java.awt.Window;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;


public class BrokenLinksDemo {

	

	private static final String hreattfvalue = null;

	public static void main(String[] args)
	{
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("http://www.deadlinkcity.com/");
//		driver.manage().window().maximize();
//		
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		System.out.println("Total number of links:"+links.size());
//		
//		int noofbrokenlinks=0;
//		for (WebElement linkelement:links)
//		{
//			String hrefattvalue=linkelement.getAttribute("href");
//			
//			if(hrefattvalue==null || hrefattvalue.isEmpty())
//			{
//				System.out.println("Href value is empty");
//				continue;
//			}
//			try
//			{
//				URL linkURL = new URL(hrefattvalue);
//				 HttpURLConnection con = (HttpURLConnection) linkURL.openConnection();
//				con.connect();
//				if(con.getResponseCode()>=400)
//				{
//					System.out.println("This are Broken links:"+noofbrokenlinks);
//					noofbrokenlinks++;
//				}
//				else
//				{
//					System.out.println("This are Not Brokenlinks");
//				}
//				
//			}
//			catch(Exception e)
//			{
//				
//			}
//			
//		}
//		System.out.println("Noof Brokenlinks:"+noofbrokenlinks);
//		
		

//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://books-pwakit.appspot.com/");
//		driver.manage().window().maximize();
//		
//		
//		driver.findElement(By.xpath(""))
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
			<dependency>
			    <groupId>org.apache.poi</groupId>
			    <artifactId>poi-ooxml</artifactId>
			    <version>5.3.0</version>
			</dependency>

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		SearchContext shadow=driver.findElement(By.cssSelector("#input"));
//		shadow.findElement(((WebElement) By.cssSelector("#input")).sendKeys("WELCOME"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		int noofbrokenlinks=0;
//		
//		for (WebElement elements:links)
//		{
//			String hrefatt=elements.getAttribute("href");
//			
//			if(hrefatt==null || hrefatt.isEmpty())
//			{
//				System.out.println("This IS Emptylink:");
//				continue;
//			}
//			
//			try
//			{
//				URL linkURL=new URL(hrefatt);
//				HttpURLConnection con=(HttpURLConnection)linkURL.openConnection();
//				con.connect();
//				
//				if(con.getResponseCode()>=400)
//				{
//					System.out.println("This Are BrokenLinks:"+noofbrokenlinks);
//					noofbrokenlinks++;
//					
//				}
//				else
//				{
//					System.out.println("Not A BrokenLinks:");
//				}}
//				catch(Exception e)
//				{
//					
//				}
//			}
//			System.out.println(noofbrokenlinks);
//		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
